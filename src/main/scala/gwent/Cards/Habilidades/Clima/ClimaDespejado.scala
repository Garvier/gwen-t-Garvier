package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero

class ClimaDespejado() extends AbstractClimaHabilities {
  val nombre: String = "Clima Despejado"

  override def ejecutar(board: tablero): Unit = {
    board.Todas.foreach{lista=>
      lista.foreach{carta=>
        carta.set_power(carta.PoderBase)
      }
    }
  }
}
 