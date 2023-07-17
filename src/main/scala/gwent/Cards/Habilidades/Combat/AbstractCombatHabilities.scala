package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Habilidades

abstract class AbstractCombatHabilities() extends Habilidades {
  val nombre: String 
  def ejecutar(lista:List[Card],card:Card):Unit
}
