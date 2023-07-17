package cl.uchile.dcc
package gwent.Jugador
import cl.uchile.dcc.gwent.Cards.{Card, CloseCombatCard, RangedCombatCard, SiegeCombatCard}
import cl.uchile.dcc.gwent.Jugador.tablero
import scala.collection.mutable.ListBuffer
class TableroPropio (player: Player){
  private val closeCombat:ListBuffer[CloseCombatCard] = ListBuffer[CloseCombatCard]()
  private val rangeCombat:ListBuffer[RangedCombatCard]= ListBuffer[RangedCombatCard]()
  private val siegeCombat:ListBuffer[SiegeCombatCard]= ListBuffer[SiegeCombatCard]()
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
  def get_closeCombat()=closeCombat
  def get_rangeCombat()= rangeCombat
  def get_siegeCombat()= siegeCombat
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
    card.ejecutar(closeCombat)
  }
  def addCardFromPlayer(card: SiegeCombatCard): Unit = siegeCombat+=card

  def addCardFromPlayer(card: RangedCombatCard): Unit = rangeCombat+=card
  
}

