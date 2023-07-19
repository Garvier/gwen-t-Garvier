package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero
/**
 * Class representing the "Impenetrable Fog" ability.
 * This ability affects the cards in the range zone of the board,
 * setting their power to 1.
 */
class NieblaImpenetrable() extends AbstractClimaHabilities {
  /**
   * Name of the ability.
   */
  override val nombre: String = "Niebla Impenetrable"

  /**
   * Executes the "Impenetrable Fog" ability on the given board.
   * This function sets the power of the cards in the range zone of the board to 1.
   *
   * @param board The board on which the ability is applied.
   */
  override def ejecutar(board: tablero): Unit = {
    // Set the power of the cards in the range zone of the board to 1
    // without modifying the existing implementation of the function.
    board.range1.foreach{carta=>
      carta.set_power(1)
    }
    board.range2.foreach{carta=>
      carta.set_power(1)
    }
  }
}
