package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero

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
