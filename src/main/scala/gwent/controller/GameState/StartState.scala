package cl.uchile.dcc
package gwent.controller.GameState

import gwent.Cards.Card
import gwent.controller.GameController

class StartState(controller: GameController) extends GameState(controller) {
  override def startGame(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }

  override def playCard(card: Card): Unit = {
    controller.state = new /* ... */
  }

  override def endTurn(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }
}