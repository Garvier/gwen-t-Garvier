package cl.uchile.dcc
package gwent.states

import gwent.Cards.*
import gwent.Jugador.Player
import cl.uchile.dcc.gwent.GameController

class GameState protected(context: GameController){
  context.state=this

  def toIdleState():Unit={
    transitionError("IdleState")
  }

  def toSelectingTargetState(): Unit = {
    transitionError("SelectingTargetState")
  }

  def doAction(): Unit = {
    // do nothing
  }

  private def transitionError(targetState: String): Unit = {
    throw new InvalidTransitionException(
      s"Cannot transition from ${getClass.getSimpleName} to $targetState"
    )
  }
}