package cl.uchile.dcc
package gwent.controller.GameState

import gwent.Cards.Card
import gwent.controller.GameController

class PlayCard(controller: GameController) extends GameState {
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