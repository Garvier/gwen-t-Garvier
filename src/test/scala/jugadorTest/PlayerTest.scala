package cl.uchile.dcc
package jugadorTest
import cl.uchile.dcc.gwent.Cards.Card
import cl.uchile.dcc.gwent.Cards.{CloseCombatCard, RangedCombatCard, SiegeCombatCard, WeatherCard}
import cl.uchile.dcc.gwent.Jugador.Player

import scala.collection.immutable.List
import munit.FunSuite

import scala.::

class PlayerTest extends FunSuite{
  var player: Player =_
  var mano: List[Card]=_
  var mazo: List[Card]=_
  var gema: Int=_
  var closeCombat1: CloseCombatCard = _
  var closeCombat2: CloseCombatCard = _
  var closeCombat3: CloseCombatCard =_
  var rangedCombat1: RangedCombatCard = _
  var rangedCombat2: RangedCombatCard = _
  var rangedCombat3: RangedCombatCard =_
  var siegeCombat1: SiegeCombatCard = _
  var siegeCombat2: SiegeCombatCard = _
  var siegeCombat3: SiegeCombatCard = _
  var weatherCard: WeatherCard=_


  override def beforeEach(context: BeforeEach): Unit ={
    closeCombat1 = new CloseCombatCard("paladin", ""
      , 4)
    closeCombat2 = new CloseCombatCard("caballero", "",
      5)
    closeCombat3 = new CloseCombatCard("Escudero","",
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
    weatherCard = new WeatherCard("Neblina","fog")

    mano= List()
    mazo= List()
    mazo = rangedCombat3 :: mazo
    mazo = rangedCombat2 :: mazo
    mazo = rangedCombat1 :: mazo
    mazo = closeCombat1 :: mazo
    mazo = closeCombat3 :: mazo
    mazo =closeCombat2 :: mazo
    mazo = siegeCombat1 :: mazo
    mazo = siegeCombat2 :: mazo
    mazo = siegeCombat3 :: mazo
    gema = 2
    player = Player("Juanito", gema,mazo,mano)



  }
  test("Set gema"){
    player.set_gemCounter(1)
    assertEquals(player.get_gemCounter(),1)
  }
  test("Carta a Mano"){
    player.drawCard()
    assert(player.hand.nonEmpty)

  }
  test("Shuffle"){
    val lista = List.empty :: mazo
    player.shuffleDeck()
    assert(lista !=mazo)
  }
  



}

