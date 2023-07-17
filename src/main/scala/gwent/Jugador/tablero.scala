package cl.uchile.dcc
package gwent.Jugador
import scala.collection.immutable.List
import gwent.Cards

import cl.uchile.dcc.gwent.Cards.{Card, CloseCombatCard, RangedCombatCard, SiegeCombatCard, WeatherCard}
import cl.uchile.dcc.gwent.Cards

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

class tablero(tableroPropio1: TableroPropio, tableroPropio2: TableroPropio) {
  private val awa: ListBuffer[WeatherCard]= ListBuffer[WeatherCard]()


  val close1:ArrayBuffer[Card]= tableroPropio1.get_closeCombat()
  val siege1:ArrayBuffer[Card]=tableroPropio1.get_siegeCombat()
  val range1:ArrayBuffer[Card]= tableroPropio1.get_rangeCombat()
  val close2: ArrayBuffer[Card] = tableroPropio2.get_closeCombat()
  val siege2: ArrayBuffer[Card] = tableroPropio2.get_siegeCombat()
  val range2: ArrayBuffer[Card] = tableroPropio2.get_rangeCombat()

  val Todas:ArrayBuffer[ArrayBuffer[Card]]= ArrayBuffer(close1,siege1,range1,close2,siege2,range2)
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

