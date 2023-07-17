package cl.uchile.dcc
package gwent.controller.GameState

import gwent.controller.GameController

import cl.uchile.dcc.gwent.Jugador.Player

import scala.util.Random

class cpuTurn(controller: GameController) extends GameState(controller){
  def jugar(player: Player,cpu:Player):Unit= {
    if (cpu.tablero.poderAcumulado () + cpu.PoderMano () > player.tablero.poderAcumulado () ) {
    cpu.takeCard (cpu.hand (Random.nextInt (cpu.hand.length) ) )
  }
    else {
      if (cpu.tiene_weather().nonEmpty) {
        cpu.takeCard(cpu.tiene_weather().head)
      }
      else {
        Pasarturno()
        update()
      }

    }
  }
  def pasarTurno():Unit={
    controller.state=new PlayerTurn(controller)
  }
}
