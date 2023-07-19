package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Combat.AbstractCombatHabilities

import cl.uchile.dcc.gwent.Cards.Card
/**

Class representing the "Vinculo Estrecho" ability.
This ability affects a list of cards by doubling the power of cards with the same name as a specific card.
/
class VinculoEstrecho() extends AbstractCombatHabilities {
/*
Name of the ability.
*/
override val nombre: String = "Vinculo Estrecho"
/**

Executes the "Vinculo Estrecho" ability on the given list of cards and a specific card.
This function doubles the power of cards in the list that have the same name as the specific card.
@param lista The list of cards on which the ability is applied.
@param card The specific card used to determine which cards to affect.
*/
override def ejecutar(lista: List[Card], card: Card): Unit = {
// Double the power of cards in the list that have the same name as the specific card
// without modifying the existing implementation of the function.

 */
class VinculoEstrecho() extends AbstractCombatHabilities {
  override val nombre: String = "Vinculo Estrecho"
  override def ejecutar(lista:List[Card],card:Card): Unit = {
    lista.foreach{ elemento =>
      if (elemento.get_name() == card.get_name()){
        elemento.set_power(elemento.get_power() * 2)
      }
    }
  }
}
