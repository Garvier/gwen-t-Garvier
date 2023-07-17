package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero

class LluviaTorrencial() extends AbstractClimaHabilities {
  override val nombre: String = "Lluvia Torrencial"

  override def ejecutar(board: tablero): Unit = {
    board.siege1.foreach{carta=>
      carta.set_power(1)
    }
    for (elem <- board.siege2) {carta=>
      carta.set_power(1)
    }
  }
}
