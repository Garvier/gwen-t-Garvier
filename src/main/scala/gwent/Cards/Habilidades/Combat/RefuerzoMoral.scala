package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Combat.AbstractCombatHabilities

import cl.uchile.dcc.gwent.Cards.Card

/**

Class representing the "Refuerzo Moral" ability.
This ability affects a list of cards by increasing their power by 1,
except for a specific card.
/
class RefuerzoMoral() extends AbstractCombatHabilities {
/*
Name of the ability.
*/
override val nombre: String = "Refuerzo Moral"
/**

Executes the "Refuerzo Moral" ability on the given list of cards and a specific card.
This function increases the power of all cards in the list, except for the specific card, by 1.
@param lista The list of cards on which the ability is applied.
@param card The specific card that is excluded from the power increment.
*/
override def ejecutar(lista: List[Card], card: Card): Unit = {
// Increase the power of all cards in the list, except for the specific card, by 1
// without modifying the existing implementation of the function.

 */
class RefuerzoMoral() extends AbstractCombatHabilities {
  override val nombre: String = "Refuerzo Moral"
  override def ejecutar(lista:List[Card],card: Card): Unit = {
    lista.foreach{elemento=>
      if(elemento!=card){
        elemento.set_power(elemento.get_power()+1)
      }

    }
  }
}
