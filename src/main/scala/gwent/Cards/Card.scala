package cl.uchile.dcc
package gwent.Cards

import gwent.Jugador.Player

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades


/**
 * Trait representing a card in the Gwent game.
 *
 * A card is characterized by its `name` and `description`.
 * This trait serves as a common interface for all card types and ensures that every card,
 * regardless of its specific subtype, will have these basic properties and behaviors.
 */
trait Card {
  /**
   * The name of the card.
   */
  val name: String

  /**
   * A description of the card's properties or effects.
   */
  val description: Habilidades

  /**
   * Plays the card for the given player.
   *
   * @param player The player who plays the card.
   */
  def play(player: Player): Unit

  /**
   * Retrieves the power of the card.
   *
   * @return The power of the card.
   */
  def get_power(): Int

  /**
   * Sets the power of the card to the specified value.
   *
   * @param n The new power value for the card.
   */
  def set_power(n: Int): Unit

  /**
   * Retrieves the base power of the card.
   *
   * @return The base power of the card.
   */
  val PoderBase: Int

  /**
   * Retrieves the name of the card.
   *
   * @return The name of the card.
   */
  def get_name(): String

  /**
   * Checks if this card is equal to another object.
   *
   * @param obj The object to compare with this card.
   * @return True if the cards are equal, false otherwise.
   */
  override def equals(obj: Any): Boolean = obj match {
    case card: Card =>
      card.name == this.name && card.description == this.description
    case _ => false
  }
}