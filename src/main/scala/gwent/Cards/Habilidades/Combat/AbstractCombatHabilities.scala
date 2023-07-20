package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Habilidades
import gwent.Cards.Card

import cl.uchile.dcc.gwent.Jugador.tablero

import scala.collection.mutable.ArrayBuffer
/**

Abstract class representing combat abilities.
It extends the Habilidades trait.
/
abstract class AbstractCombatHabilities() extends Habilidades {
/*
Name of the combat ability.
*/
val nombre: String
/**

Executes the combat ability on the given list of cards and a specific card.
@param lista The list of cards on which the ability is applied.
@param card The specific card on which the ability is applied.
*/
def ejecutar(lista: List[Card], card: Card): Unit
}
 */
abstract class AbstractCombatHabilities() extends Habilidades {
  val nombre: String

  override def equals(obj: Any): Boolean = {

    obj match {
      case habilities: Habilidades =>

        this.nombre == habilities.nombre

      case _ =>
        false
    }
  }

  override def ejecutar(board: tablero): Unit = {
    
  }
  override def ejecutar(lista:ArrayBuffer[Card],card:Card):Unit
}
