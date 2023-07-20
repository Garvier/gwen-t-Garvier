package cl.uchile.dcc
package gwent.states

import cl.uchile.dcc.gwent.GameController

class IdleState(context:GameController) extends GameState(context){
  context.state = new SelectingTargetState(context)
  context.promptSelection()
  
  
}
