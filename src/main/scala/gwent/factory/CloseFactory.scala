package cl.uchile.dcc
package gwent.factory

import gwent.Cards.{CloseCombatCard, SiegeCombatCard}

import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.{Sin,VinculoEstrecho,RefuerzoMoral}

/**
 * Concrete class representing a close combat card factory.
 */
class CloseFactory extends AbstractCardFactory("Espadachin",new Sin(),7){
  override def create(): CloseCombatCard = new CloseCombatCard(name,description,power)

}