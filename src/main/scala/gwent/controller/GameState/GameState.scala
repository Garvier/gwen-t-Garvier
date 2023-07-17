package cl.uchile.dcc
package gwent.controller.GameState

import gwent.Cards.Card

import cl.uchile.dcc.gwent.Jugador.Player
import cl.uchile.dcc.gwent.controller.GameController

class GameState(context: GameController) {
  def startGame(): Unit = {
    /* ... */
  }
  def Turn(player: Player):Unit ={

  }
  def cpuTurn():Unit
  def passTurn():Unit
  def playCard(player: Player,card: Card): Unit = {
    /*...*/
  }
  def endTurn(): Unit = {
    /* ... */
  }
}