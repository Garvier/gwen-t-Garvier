package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero
import gwent.Cards.Habilidades.Clima.AbstractClimaHabilities

import cl.uchile.dcc.gwent.Cards.Card

import scala.collection.mutable.ArrayBuffer

/**

Class representing the "Lluvia Torrencial" ability.
This ability affects the cards in the siege combat zone of the board,
setting their power to 1.
/
class LluviaTorrencial() extends AbstractClimaHabilities {
/*
Name of the ability.
*/
override val nombre: String = "Lluvia Torrencial"
/**

Executes the "Lluvia Torrencial" ability on the given board.
This function sets the power of the cards in the siege combat zone of the board to 1.
@param board The board on which the ability is applied.
*/
override def ejecutar(board: tablero): Unit = {
// Set the power of the cards in the siege combat zone of the board to 1
// without modifying the existing implementation of the function.

 */
class LluviaTorrencial() extends AbstractClimaHabilities {
  override val nombre: String = "Lluvia Torrencial"

  override def ejecutar(lista: ArrayBuffer[Card], card: Card): Unit = super.ejecutar(lista, card)
  override def ejecutar(board: tablero): Unit = {
    board.siege1.foreach{carta=>
      carta.set_power(1)
    }
    for (elem <- board.siege2){
      elem.set_power(1)
    }
  }
}
