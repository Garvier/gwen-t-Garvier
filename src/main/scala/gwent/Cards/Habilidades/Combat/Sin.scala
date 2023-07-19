package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Habilidades

import cl.uchile.dcc.gwent.Cards.Card
/**

Class representing the "Sin Efecto" ability.
This ability does not have any effect on the given list of elements.
/
class Sin() extends AbstractCombatHabilities {
/*
Name of the ability.
*/
override val nombre: String = "Sin Efecto"
/**

Executes the "Sin Efecto" ability on the given list of elements and a specific card.
This function does not have any effect and does nothing.
@param lista The list of elements on which the ability is applied.
@param card The specific card that is not used in the ability.
*/
override def ejecutar(lista: List[Any], card: Card): Unit = {
// This ability does not have any effect, so no action is performed.
}
}
 */
class Sin() extends AbstractCombatHabilities {
  override val nombre: String = "Sin Efecto"

  override def ejecutar(lista: List[Any],card:Card): Unit ={
    
  }
}
