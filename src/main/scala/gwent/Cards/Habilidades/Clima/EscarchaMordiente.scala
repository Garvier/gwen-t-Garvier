package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero
/**

Class representing the "Escarcha Mordiente" ability.
This ability affects the cards in the close combat zone of the board,
setting their power to 1.
/
class EscarchaMordiente() extends AbstractClimaHabilities {
/*
Name of the ability.
*/
override val nombre: String = "Escarcha Mordiente"
/**

Executes the "Escarcha Mordiente" ability on the given board.
This function sets the power of the cards in the close combat zone of the board to 1.
@param board The board on which the ability is applied.
*/
override def ejecutar(board: tablero): Unit = {
// Set the power of the cards in the close combat zone of the board to 1
// without modifying the existing implementation of the function.

 */
class EscarchaMordiente() extends AbstractClimaHabilities {
  override val nombre: String = "Escarcha Mordiente"

  override def ejecutar(board: tablero): Unit = {
    board.close1.foreach{carta=>
      carta.set_power(1)
    }
    board.close2.foreach({carta=>
      carta.set_power(1)
    })
  }
}
