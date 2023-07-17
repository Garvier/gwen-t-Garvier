package cl.uchile.dcc
package gwent.factory
import gwent.Cards.{Card, SiegeCombatCard}
import gwent.factory.AbstractCardFactory

import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.Sin
class SiegeFactory extends AbstractCardFactory(name="Catapulta",new Sin(),10) {
  override def create(): SiegeCombatCard = new SiegeCombatCard(name,description,power) 

}
