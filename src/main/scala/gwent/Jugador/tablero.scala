package cl.uchile.dcc
package gwent.Jugador
import scala.collection.immutable.List
import gwent.Cards

import cl.uchile.dcc.gwent.Cards.{Card, CloseCombatCard, RangedCombatCard, SiegeCombatCard, WeatherCard}
import cl.uchile.dcc.gwent.Cards

import scala.collection.mutable.ListBuffer

class tablero(tableroPropio1: TableroPropio, tableroPropio2: TableroPropio) {
  private val awa: ListBuffer[WeatherCard]= ListBuffer[WeatherCard]()
  
  /**
   *
   * Sets the board for the own boards of the player.
   * This method establishes a connection between the player and its own boards by setting the current board as the board for each own board.
   * This allows the player to access and interact with its own boards through the current board.
   */
  def lados(): Unit = {
    tableroPropio1.settablero(this)
    tableroPropio2.settablero(this)
  }

  /**
   *
   * Adds a WeatherCard to the "awa" ListBuffer.
   * This method adds the specified WeatherCard object to the "awa" ListBuffer, representing a collection of cards.
   * @param card The WeatherCard object to be added to the collection.
   */
  def addCardFromPlayer(card: WeatherCard): Unit =awa.append(card)

}

