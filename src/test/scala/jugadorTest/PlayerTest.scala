package cl.uchile.dcc
package jugadorTest
import gwent.Cards.Habilidades.Clima.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable}
import gwent.Cards.Habilidades.Combat.{RefuerzoMoral, Sin, VinculoEstrecho}
import gwent.Jugador.{Player, TableroPropio, tablero}
import gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}
import gwent.Cards.Card

import scala.collection.immutable.List
import munit.FunSuite
import gwent.Cards.Deck

import cl.uchile.dcc.gwent.Jugador

import scala.::
import scala.collection.mutable.ArrayBuffer

class PlayerTest extends FunSuite{
  var player1: Player = _
  var player2: Player = _
  var mano: ArrayBuffer[Card] = _
  var mazo: Deck = _
  var gema: Int = _
  val facRan: RangedFactory = new RangedFactory()
  val facSie: SiegeFactory = new SiegeFactory()
  val facClo: CloseFactory = new CloseFactory()
  val weaFac: WeatherFactory = new WeatherFactory()
  var tableroPropio1: TableroPropio = _
  var tableroPropio2: TableroPropio = _
  var board: tablero = _


  override def beforeEach(context: BeforeEach): Unit ={
    mazo = new Deck()
    //0 a 3
    mazo.Genera(weaFac, "Escarcha Mordiente", new EscarchaMordiente(), 0, 1)
    mazo.Genera(weaFac, "Lluvia Torrencial", new LluviaTorrencial(), 0, 1)
    mazo.Genera(weaFac, "Niebla Impenetrable", new NieblaImpenetrable(), 0, 1)
    mazo.Genera(weaFac, "Clima Despejado", new ClimaDespejado(), 0, 1)
    // cartas de la 4,5
    mazo.Genera(facRan, "Arquero", new Sin(), 4, 2)
    //6 y 7
    mazo.Genera(facRan, "Ballestero", new RefuerzoMoral(), 3, 2)
    // 8 y 9
    mazo.Genera(facSie, "Ariete", new Sin(), 6, 2)
    // 10 y 11
    mazo.Genera(facSie, "Catapulta", new VinculoEstrecho(), 4, 2)
    // 12 y 13
    mazo.Genera(facClo, "Espadachin", new Sin(), 3, 2)
    // 14 y 15
    mazo.Genera(facClo, "Caballero", new RefuerzoMoral(), 5, 2)
    gema = 2
    mano = ArrayBuffer.empty[Card]

    player1 = Player("Juan Carlos Bodoque", gema, mazo, mano)

    player2 = Player("Tulio Trivino", gema, mazo, mano)
    gema = 2

    tableroPropio1 = TableroPropio(player1)
    tableroPropio2 = TableroPropio(player2)
    board = tablero(tableroPropio1, tableroPropio2)
    tableroPropio1.settablero(board)
    tableroPropio2.settablero(board)
    tableroPropio1.setplayer()
    tableroPropio2.setplayer()
    board.lados()



  }
  test("Set gema"){
    player1.set_gemCounter(1)
    assertEquals(player1.get_gemCounter(),1)
  }
  test("Carta a Mano"){
    player1.drawCard(1)
    assert(player1.hand.nonEmpty)
    println(player1.hand.head.name)

  }
  test("Shuffle"){
    var mazo2:ArrayBuffer[Card]= mazo.mazo
    mazo.shuffleDeck()
    assert(mazo2!=mazo.mazo)
  }
  



}

