package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima
import gwent.Jugador.tablero
import gwent.Cards.Habilidades.Clima.AbstractClimaHabilities
class LluviaTorrencial() extends AbstractClimaHabilities {
  override val nombre: String = "Lluvia Torrencial"

  override def ejecutar(board: tablero): Unit = {
    board.siege1.foreach{carta=>
      carta.set_power(1)
    }
    for (elem <- board.siege2){
      elem.set_power(1)
    }
  }
}
