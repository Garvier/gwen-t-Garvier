package cl.uchile.dcc
package cartasTest.Habilidades

import gwent.Cards.Habilidades.Clima.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable}
import gwent.Cards.Habilidades.Combat.{RefuerzoMoral, Sin, VinculoEstrecho}
import gwent.Jugador.{Player, TableroPropio, tablero}
import gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}

import cl.uchile.dcc.gwent.Cards.{Card, Deck}
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class HabilidadesTest extends FunSuite {
  var player1: Player = _
  var player2: Player = _
  var mano: ArrayBuffer[Card] = _
  var mazo: Deck = _
  var gema: Int = _
  var facRan: RangedFactory = _
  var facSie: SiegeFactory = _
  var facClo: CloseFactory = _
  var weaFac: WeatherFactory = _
  var tableroPropio1: TableroPropio = _
  var tableroPropio2: TableroPropio = _
  var board: tablero = _
  


  override def beforeEach(context: BeforeEach): Unit = {
    facRan= new RangedFactory()
    facSie= new SiegeFactory()
    facClo = new CloseFactory()
    weaFac = new WeatherFactory()

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
    gema=2
    mano = ArrayBuffer()

    player1 = Player("Juan Carlos Bodoque", gema, mazo, mano)
    // Solo se inicializa uno pues si bien esto provoca "errores" al no tener una mano y mazo independiente, solo vamos a testear de a un jugador
    player2 = Player("Tulio Trivino", gema, mazo, mano)
    player1.set_deck(mazo)
    player1.drawCard(15)

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

  test("Invocar dos cartas sin habilidad "){
    player1.takeCard(player1.hand(4))
    assertEquals(player1.tablero.rangePower(),4)
    player1.takeCard(player1.hand(4))
    assertEquals(player1.tablero.rangePower(), 8)


  }
  test("Uso de niebla Impenetrable"){
    player1.takeCard(player1.hand(4))
    player1.takeCard(player1.hand(4))
    player1.takeCard(player1.hand(2))
    assertEquals(player1.tablero.rangePower(),2)

  }
  test("Uso de Refuerzo Moral"){
    player1.takeCard(player1.hand(6))
    assertEquals(player1.tablero.rangePower(),3)
    player1.takeCard(player1.hand(6))
    assertEquals(player1.tablero.rangePower(),7)
  }
  test("Uso de Lluvia Torrencial"){
    player1.takeCard(player1.hand(8))
    assertEquals(player1.tablero.siegePower(),6)
    player1.takeCard(player1.hand(1))
    assertEquals(player1.tablero.siegePower(),1)
  }
  test("Uso de Vinculo Estrecho"){

    player1.takeCard(player1.hand(10))
    assertEquals(player1.tablero.siegePower(),4)
    player1.takeCard(player1.hand(10))

    assertEquals(player1.tablero.siegePower(),16)
  }
  test("Uso de Escarcha Mordiente"){
    player1.takeCard(player1.hand(12))
    assertEquals(player1.tablero.closePower(), 3)
    player1.takeCard(player1.hand(0))
    assertEquals(player1.tablero.closePower(), 1)
  }
  test("Uso de clima despejado"){
    player1.takeCard(player1.hand(8))
    assertEquals(player1.tablero.siegePower(), 6)
    player1.takeCard(player1.hand(1))
    assertEquals(player1.tablero.siegePower(), 1)
    player1.takeCard(player1.hand(3))
    assertEquals(player1.tablero.siegePower(),6)
  }
}
