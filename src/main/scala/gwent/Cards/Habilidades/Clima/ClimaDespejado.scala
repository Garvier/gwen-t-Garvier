package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero

import cl.uchile.dcc.gwent.Cards.Card

import scala.collection.mutable.ArrayBuffer

/**

Class representing the "Clima Despejado" ability.
This ability affects all the cards on the board,
setting their power to their base power.
/
class ClimaDespejado() extends AbstractClimaHabilities {
/*
Name of the ability.
*/
val nombre: String = "Clima Despejado"
/**

Executes the "Clima Despejado" ability on the given board.
This function sets the power of all the cards on the board to their base power.
@param board The board on which the ability is applied.
 */
override def ejecutar(board: tablero): Unit = {
// Set the power of all the cards on the board to their base power
// without modifying the existing implementation of the function.

 */

class ClimaDespejado() extends AbstractClimaHabilities {
  val nombre: String = "Clima Despejado"

  override def ejecutar(lista: ArrayBuffer[Card], card: Card): Unit = {
    
  }
  override def ejecutar(board: tablero): Unit = {
    board.Todas.foreach{lista=>
      lista.foreach{carta=>
        carta.set_power(carta.PoderBase)
      }
    }
  }
}


 