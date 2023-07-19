package cl.uchile.dcc
package gwent.factory

import gwent.Cards.{RangedCombatCard, SiegeCombatCard}

import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.{Sin,VinculoEstrecho,RefuerzoMoral}
/**
 * Concrete class representing a Range combat card factory.
 */
class RangedFactory extends AbstractCardFactory(name="arquero",new Sin(),4){
 override def create(): RangedCombatCard = RangedCombatCard(name,description,power)

}