package cl.uchile.dcc
package tableroTest
import cl.uchile.dcc.gwent.Cards.{Card, CloseCombatCard, RangedCombatCard, SiegeCombatCard, WeatherCard}
import cl.uchile.dcc.gwent.Jugador.{Player, TableroPropio, tablero}
import munit.FunSuite

class TestTablero extends FunSuite {
  var player1: Player = _
  var player2: Player =_
  var mano: List[Card] = _
  var mazo: List[Card] = _
  var gema: Int = _
  var closeCombat1: CloseCombatCard = _
  var closeCombat2: CloseCombatCard = _
  var closeCombat3: CloseCombatCard = _
  var rangedCombat1: RangedCombatCard = _
  var rangedCombat2: RangedCombatCard = _
  var rangedCombat3: RangedCombatCard = _
  var siegeCombat1: SiegeCombatCard = _
  var siegeCombat2: SiegeCombatCard = _
  var siegeCombat3: SiegeCombatCard = _
  var weatherCard: WeatherCard = _
  var tableroPropio1: TableroPropio =_
  var tableroPropio2: TableroPropio = _
  var board : tablero =_


  override def beforeEach(context: BeforeEach): Unit = {
    closeCombat1 = new CloseCombatCard("paladin", ""
      , 4)
    closeCombat2 = new CloseCombatCard("caballero", "",
      5)
    closeCombat3 = new CloseCombatCard("Escudero", "",
      1)
    rangedCombat1 = new RangedCombatCard("arquero", "",
      3)
    rangedCombat2 = new RangedCombatCard("arquero", "",
      3)
    rangedCombat3 = new RangedCombatCard("Ballesta", "",
      5)
    siegeCombat1 = new SiegeCombatCard("catapulta", "",
      8)
    siegeCombat2 = new SiegeCombatCard("catapulta", "",
      6)
    siegeCombat3 = new SiegeCombatCard("Ariete", "",
      7)
    weatherCard = new WeatherCard("Neblina", "fog")

    mano = List()
    mazo = List()
    mazo = rangedCombat3 :: mazo
    mazo = rangedCombat2 :: mazo
    mano = rangedCombat1 :: mano
    mano = closeCombat1 :: mano
    mazo = closeCombat3 :: mazo
    mazo = closeCombat2 :: mazo
    mano = siegeCombat1 :: mano
    mazo = siegeCombat2 :: mazo
    mazo = siegeCombat3 :: mazo
    gema = 2
    player1 = Player("Juan Carlos Bodoque", gema, mazo, mano)
    player2 = Player("Tulio Trivino", gema, mazo,mano)
    player1.shuffleDeck()
    player2.shuffleDeck()
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
    assert(tableroPropio1.get_siegeCombat().nonEmpty )
    player1.takeCard(player1.hand.head)
    assert(tableroPropio1.get_closeCombat().nonEmpty)
    player1.takeCard(player1.hand.head)
    assert(tableroPropio1.get_rangeCombat().nonEmpty)


  }
  
  
  
  
}
