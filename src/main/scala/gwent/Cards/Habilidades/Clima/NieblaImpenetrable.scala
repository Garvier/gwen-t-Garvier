package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero

class NieblaImpenetrable() extends AbstractClimaHabilities {
  override val nombre: String = "Niebla Impenetrable"

  override def ejecutar(board: tablero): Unit = {
    board.range1.foreach{carta=>
      carta.set_power(1)
    }
    board.range2.foreach{carta=>
      carta.set_power(1)
    }
  }
}
