package cl.uchile.dcc
package jugadorTest

import main.gwent.Cards.*
import gwent.Cards.Habilidades.Combat.{Sin,RefuerzoMoral,VinculoEstrecho}
import gwent.Cards.Habilidades.Clima.{ClimaDespejado,EscarchaMordiente,LluviaTorrencial,NieblaImpenetrable}
import gwent.Jugador.{Player, TableroPropio, tablero}
import gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}

import munit.FunSuite

class TestTablero extends FunSuite {
  var player1: Player = _
  var player2: Player =_
  var mano: List[Card] = _
  var mazo: Deck = _
  var gema: Int = _
  val facRan: RangedFactory = new RangedFactory()
  val facSie: SiegeFactory = new SiegeFactory()
  val facClo: CloseFactory = new CloseFactory()
  val weaFac: WeatherFactory = new WeatherFactory()
  var tableroPropio1: TableroPropio =_
  var tableroPropio2: TableroPropio = _
  var board : tablero =_


  override def beforeEach(context: BeforeEach): Unit = {
    mazo.Genera(facRan, "Arquero", new Sin(), 4, 1)
    mazo.Genera(facSie, "Ariete", new Sin(), 6, 1)
    mazo.Genera(facClo, "Espadachin", new Sin(), 3, 1)
    mazo.Genera(facRan, "Ballestero", new RefuerzoMoral(), 3, 1)
    mazo.Genera(facSie, "Catapulta", new VinculoEstrecho(), 4, 1)
    mazo.Genera(facClo, "Caballero", new RefuerzoMoral(), 5, 1)
    mazo.Genera(weaFac, "Escarcha Mordiente", new EscarchaMordiente(), 0, 1)
    mazo.Genera(weaFac, "Lluvia Torrencial", new LluviaTorrencial(), 0, 1)
    mazo.Genera(weaFac, "Niebla Impenetrable", new NieblaImpenetrable(), 0, 1)
    mazo.Genera(weaFac, "Clima Despejado", new ClimaDespejado(), 0, 1)
    mano= List[Card]()
    player1 = Player("Juan Carlos Bodoque", gema, mazo, mano)
    player2 = Player("Tulio Trivino", gema, mazo, mano)
    player1.drawCard(5)
    player2.drawCard(5)
    gema = 2

    tableroPropio1 = TableroPropio(player1)
    tableroPropio2 = TableroPropio(player2)
    board = tablero(tableroPropio1,tableroPropio2)
    tableroPropio1.settablero(board)
    tableroPropio2.settablero(board)
    tableroPropio1.setplayer()
    tableroPropio2.setplayer()
    board.lados()
    
  }

  test("jugarCarta (Este test se espera pueda demostrar la funcionalidad de todas las funciones que juegan la carta)"){
    player1.takeCard(player1.hand.head)
    assert(tableroPropio1.get_rangeCombat().nonEmpty )
    player1.takeCard(player1.hand.head)
    assert(tableroPropio1.get_siegeCombat().nonEmpty)
    player1.takeCard(player1.hand.head)
    assert(tableroPropio1.get_closeCombat().nonEmpty)


  }


  
  
  
  
}
