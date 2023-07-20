package cl.uchile.dcc
package gwent.factory
import gwent.Cards.Card

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades
/**
 * Trait representing a card factory.
 *
 * A card factory is responsible for creating cards and providing methods for setting
 * the name, description, and power of the cards.
 */
trait CardFactory {
  /**
   * Creates a new card.
   *
   * @return The created card.
   */
  def create(): Card

  /**
   * Sets the name of the card factory.
   *
   * @param newName The new name to set.
   */
  def setName(newName: String): Unit

  /**
   * Sets the description of the card factory.
   *
   * @param newDescription The new description to set.
   */
  def setDescription(newDescription: Habilidades): Unit

  /**
   * Sets the power of the card factory.
   *
   * @param newPower The new power to set.
   */
  def setPower(newPower: Int): Unit
}

