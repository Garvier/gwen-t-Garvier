package cl.uchile.dcc
package gwent

import gwent.Cards.Habilidades.Clima.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable}
import gwent.Cards.Habilidades.Combat.{RefuerzoMoral, Sin, VinculoEstrecho}
import gwent.Cards.{Card, CloseCombatCard, Deck, RangedCombatCard, SiegeCombatCard, WeatherCard}
import gwent.Jugador.{Player, TableroPropio, tablero}
import gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}
import gwent.states.{GameState, IdleState}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class GameController {

  private var mazo: Deck = new Deck()
  private val facRan: RangedFactory = new RangedFactory()
  private val facSie: SiegeFactory = new SiegeFactory()
  private val facClo: CloseFactory = new CloseFactory()
  private val weaFac: WeatherFactory= new WeatherFactory()
  private var mano: ArrayBuffer[Card] = ArrayBuffer[Card]()

  private val tunsQueue = mutable.Queue.empty[Card]

  var state: GameState =new IdleState(this)



  private val Player1: Player= new Player("player1",2,mazo,mano)
  private val Player2: Player = new Player("player2",2,mazo,mano)
  
  private val tableroP1: TableroPropio= TableroPropio(Player1)
  private val tableroP2: TableroPropio = TableroPropio(Player2)
  val board: tablero= tablero(tableroP1,tableroP2)
  private var currentplayer: Player = Player1

  def startGame(player1: Player,player2: Player): Unit = {
    player1.set_controller(this)
    player2.set_controller(this)
    mazo.Genera(facRan, "Arquero", new Sin(), 4, 4)
    mazo.Genera(facRan, "Ballestero", new RefuerzoMoral(), 3, 4)
    mazo.Genera(facSie, "Ariete", new Sin(), 6, 3)
    mazo.Genera(facSie, "Catapulta", new VinculoEstrecho(), 4, 3)
    mazo.Genera(facClo, "Espadachin", new Sin(), 3, 4)
    mazo.Genera(facClo, "Caballero", new RefuerzoMoral(), 5, 3)
    mazo.Genera(weaFac, "Escarcha Mordiente", new EscarchaMordiente(), 0, 1)
    mazo.Genera(weaFac, "Lluvia Torrencial", new LluviaTorrencial(), 0, 1)
    mazo.Genera(weaFac, "Niebla Impenetrable", new NieblaImpenetrable(), 0, 1)
    mazo.Genera(weaFac, "Clima Despejado", new ClimaDespejado(), 0, 1)

    mazo.shuffleDeck()
    player1.set_deck(mazo)

    mazo.shuffleDeck()
    player2.set_deck(mazo)

    Player1.drawCard(10)
    Player2.drawCard(10)

    tableroP2.settablero(board)
    tableroP1.settablero(board)
    tableroP1.setplayer()
    tableroP2.setplayer()
    board.lados()
    state = new IdleState(this)
  }



  def promptSelection(): Unit = {
    state.doAction()
  }
  def playCard(card: Card): Unit ={
    currentplayer.takeCard(card)
    card match {
      case weatherCard: WeatherCard =>
        card.description.ejecutar(currentplayer.tablero.table)

      case rangedCombatCard: RangedCombatCard =>
        card.description.ejecutar(currentplayer.tablero.get_rangeCombat(), card)

      case siegeCombatCard: SiegeCombatCard =>
        card.description.ejecutar(currentplayer.tablero.get_siegeCombat(), card)

      case closeCombatCard: CloseCombatCard =>
        card.description.ejecutar(currentplayer.tablero.get_closeCombat(), card)


    }
  }
 
  


}
  









