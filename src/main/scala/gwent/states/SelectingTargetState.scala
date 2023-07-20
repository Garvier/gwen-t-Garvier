package cl.uchile.dcc
package gwent.states

import gwent.GameController

import cl.uchile.dcc.gwent.Cards.Card

class SelectingTargetState(context:GameController)extends GameState(context) {
  override def toIdleState(): Unit ={
    context.state = new IdleState(context)
  }

  def playCard(card: Card): Unit = {
    context.playCard(card)
  }
}



