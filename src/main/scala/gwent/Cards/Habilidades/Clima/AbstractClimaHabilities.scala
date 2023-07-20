package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima

import gwent.Cards.Habilidades.Habilidades

import cl.uchile.dcc.gwent.Cards.Card
import cl.uchile.dcc.gwent.Jugador.tablero

import scala.collection.mutable.ArrayBuffer
/**

Abstract class representing climate abilities.
It extends the Habilidades trait.
/
abstract class AbstractClimaHabilities() extends Habilidades {
/*
Name of the climate ability.
*/
val nombre: String
/**

Executes the climate ability on the given board.
@param board The board on which the ability is applied.
*/
def ejecutar(board: tablero): Unit
}
 */
abstract class AbstractClimaHabilities() extends Habilidades{
  val nombre: String

  override def equals(obj: Any): Boolean = {

    obj match {
      case habilities: Habilidades =>

        this.nombre == habilities.nombre

      case _ =>
        false
    }
  }
  def ejecutar(board:tablero): Unit

  override def ejecutar(lista: ArrayBuffer[Card], card: Card): Unit = {
    
  }
}
