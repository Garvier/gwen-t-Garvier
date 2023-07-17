package cl.uchile.dcc
package gwent.Cards.Habilidades.Clima

import gwent.Cards.Habilidades.Habilidades

import cl.uchile.dcc.gwent.Jugador.tablero

abstract class AbstractClimaHabilities() extends Habilidades{
  val nombre: String
  def ejecutar(board:tablero): Unit 
}
