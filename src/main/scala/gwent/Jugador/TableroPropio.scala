package cl.uchile.dcc
package gwent.Jugador
import cl.uchile.dcc.gwent.Cards.{Card, CloseCombatCard, RangedCombatCard, SiegeCombatCard}
import cl.uchile.dcc.gwent.Jugador.tablero

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
class TableroPropio (player: Player){
  private val closeCombat: ArrayBuffer[Card] = ArrayBuffer[Card]()
  private val rangeCombat:ArrayBuffer[Card]= ArrayBuffer[Card]()
  private val siegeCombat:ArrayBuffer[Card]= ArrayBuffer[Card]()
  var table:tablero=_


  /**
   *
   * Sets the board for the player.
   * This method establishes a connection between the player and the board by setting the board as the player's board.
   * @param b The board object to be set as the player's board.
   */
  def settablero(b:tablero): Unit = {
    table=b
  }
  def get_closeCombat(): ArrayBuffer[Card] =closeCombat
  def get_rangeCombat(): ArrayBuffer[Card]= rangeCombat
  def get_siegeCombat(): ArrayBuffer[Card]= siegeCombat
  
  def poderAcumulado():Int={
    var count=0
    this.get_closeCombat().foreach { elemento =>
    count += elemento.get_power()
    }
    this.get_siegeCombat().foreach { elemento =>
      count += elemento.get_power()
    }
    this.get_rangeCombat().foreach { elemento =>
      count += elemento.get_power()
    }
    count
  }
  /**
   *
   * Sets the player for the board.
   * This method establishes a connection between the board and the player by setting the board as the player's board.
   */
  def setplayer(): Unit = {
    player.settablero(this)
  }

 /**
  * Adds a card to the card list on the board, taken from a player's hand.
  *
  * @param card   The card to be added to the card list.
  */
  def addCardFromPlayer(card: CloseCombatCard): Unit = {
    closeCombat += card
    card.description.ejecutar(closeCombat,card)
    
  }
  def addCardFromPlayer(card: SiegeCombatCard): Unit = {
    siegeCombat+=card
    card.description.ejecutar(siegeCombat,card)
  }

  def addCardFromPlayer(card: RangedCombatCard): Unit = {
    rangeCombat+=card
    card.description.ejecutar(rangeCombat,card)
  }
  
  
}

