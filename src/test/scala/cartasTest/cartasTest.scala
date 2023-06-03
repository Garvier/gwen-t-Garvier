package cl.uchile.dcc
package cartasTest
import munit.FunSuite
import gwent.Cards

import cl.uchile.dcc.gwent.Cards.{CloseCombatCard, RangedCombatCard, SiegeCombatCard}
class cartasTest extends FunSuite{
  var closeCombat1: CloseCombatCard = _
  var closeCombat2: CloseCombatCard = _
  var rangedCombat1: RangedCombatCard = _
  var rangedCombat2: RangedCombatCard = _
  var siegeCombat1: SiegeCombatCard = _
  var siegeCombat2: SiegeCombatCard = _

  override def beforeEach(context: BeforeEach): Unit = {
    closeCombat1 = new CloseCombatCard("paladin", ""
      , 4)
    closeCombat2 = new CloseCombatCard("caballero", "",
      5)
    rangedCombat1 = new RangedCombatCard("arquero", "",
      3)
    rangedCombat2 = new RangedCombatCard("arquero", "",
      3)
    siegeCombat1 = new SiegeCombatCard("catapulta", "",
      8)
    siegeCombat2 = new SiegeCombatCard("catapulta", "",
      6)
  }

  test("equals") {
    rangedCombat1.equals(rangedCombat2)
    !siegeCombat1.equals(siegeCombat2)
  }
  test("getters"){
    assertEquals(closeCombat2.get_power, 5)
    assertEquals(siegeCombat2.get_name, "catapulta")
    assertEquals(siegeCombat2.get_description, "")
    
  }

}