package cl.uchile.dcc
package gwent.controller

import gwent.Cards.{Card, Deck}

import cl.uchile.dcc.gwent.Cards.Habilidades.Clima.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable}
import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.{RefuerzoMoral, Sin, VinculoEstrecho}
import cl.uchile.dcc.gwent.Jugador.{Player, TableroPropio}
import cl.uchile.dcc.gwent.controller.GameClima.{Clear, GameClima}
import cl.uchile.dcc.gwent.controller.GameState.{GameState, StartState}
import cl.uchile.dcc.gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}
import cl.uchile.dcc.gwent.Jugador.{tablero,TableroPropio}

class GameController {
  // Estado actual del juego
  var state: GameState = new StartState(this)
  var clima: GameState = new Clear(this)
  var mazo: Deck = new Deck()
  val facRan: RangedFactory = new RangedFactory()
  val facSie: SiegeFactory = new SiegeFactory()
  val facClo: CloseFactory = new CloseFactory()
  val weaFac: WeatherFactory= new WeatherFactory()



  mazo.Genera(facRan,"Arquero",new Sin(),4,4)
  mazo.Genera(facRan,"Ballestero",new RefuerzoMoral(),3,4)
  mazo.Genera(facSie,"Ariete",new Sin(),6,3)
  mazo.Genera(facSie,"Catapulta",new VinculoEstrecho(),4,3)
  mazo.Genera(facClo,"Espadachin",new Sin(),3,4)
  mazo.Genera(facClo,"Caballero",new RefuerzoMoral(),5,3)
  mazo.Genera(weaFac,"Escarcha Mordiente",new EscarchaMordiente(),0,1)
  mazo.Genera(weaFac,"Lluvia Torrencial",new LluviaTorrencial(),0,1)
  mazo.Genera(weaFac,"Niebla Impenetrable",new NieblaImpenetrable(),0,1)
  mazo.Genera(weaFac,"Clima Despejado",new ClimaDespejado(),0,1)
  mazo.shuffleDeck()


  
  
  private val Player1: Player= new Player("player1",2,mazo,List[Card](),this)
  mazo.shuffleDeck()
  private val Player2: Player = new Player("player2",2,mazo,List[Card](),this)
  Player1.drawCard(10)
  Player2.drawCard(10)
  val tableroP1: TableroPropio= TableroPropio(Player1)
  val tableroP2: TableroPropio = TableroPropio(Player2)
  val board: tablero= tablero(tableroP1,tableroP2)
  tableroP2.settablero(board)
  tableroP1.settablero(board)
  tableroP1.setplayer()
  tableroP2.setplayer()
  board.lados()

  def startGame(): Unit = {

    state.startGame()
    
  }
  
  }
  def playCard():Unit={
    state.playCard()
  }
  def endTurn(): Unit = {
    state.endTurn()
  }
  def despejar(): Unit ={
    clima.despejar()
  }
  def neblina():Unit = {
    clima.neblina()
  }
  def escarchar():Unit = {
    clima.escarchar()
  }
  def llover():Unit = {
    clima.llover()
  }
}









