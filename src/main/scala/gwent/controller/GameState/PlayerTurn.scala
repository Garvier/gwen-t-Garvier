package cl.uchile.dcc
package gwent.controller.GameState
import gwent.Cards.Card
import gwent.Jugador.Player

import cl.uchile.dcc.gwent.controller.GameController

class PlayerTurn(controller: GameController) extends GameState(controller) {
  override def playCard(player: Player, card: Card): Unit = {
    player.takeCard(card)
    card.description.ejecutar()
  }
  
}
