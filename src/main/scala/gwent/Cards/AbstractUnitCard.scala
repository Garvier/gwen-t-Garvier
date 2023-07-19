package cl.uchile.dcc
package gwent.Cards

import gwent.Cards.Card

import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.AbstractCombatHabilities
import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin

/**
 * Abstract class representing a unit card in the Gwen't game.
 *
 * An `AbstractUnitCard` is a type of [[Card]] that has a power value which contributes to
 * the player's total power in the game.
 * Each unit card starts with its current power equal to its base power.
 *
 * @constructor Creates a new `AbstractUnitCard` with a specified name, description, and
 *              power.
 * @param name        The name of the card.
 * @param description The description of the card, explaining its specific abilities or
 *                    role in the game.
 * @param power       The base power of the card, indicating the contribution of this card to
 *                    the player's total power when unaffected by any special conditions.
 */
abstract class AbstractUnitCard protected (val name: String,
                                           val description: Habilidades,
                                           private var power: Int) extends Card {

  /** The current power of the card, which may be affected by various conditions during
   * gameplay.
   * Initially set to the base [[power]] of the card.
   */
  var currentPower: Int = power

  /**
   * Retrieves the name of the card.
   *
   * @return The name of the card.
   */
  override def get_name(): String = name

  /**
   * Retrieves the description of the card.
   *
   * @return The description of the card.
   */
  override def get_description: String = description.nombre

  /**
   * Retrieves the base power of the card.
   *
   * @return The base power of the card.
   */
  override val PoderBase: Int = power

  /**
   * Retrieves the current power of the card.
   *
   * @return The current power of the card.
   */
  override def get_power(): Int = power

  /**
   * Sets the power of the card to a specified value.
   *
   * @param n The new power value for the card.
   */
  def set_power(n: Int): Unit = {
    power = n
  }

  /**
   * Checks if this card is equal to another object.
   * Two cards are considered equal if they have the same name, description, and power.
   *
   * @param obj The object to compare with this card.
   * @return True if the cards are equal, false otherwise.
   */
  override def equals(obj: Any): Boolean = {
    obj match {
      case card: AbstractUnitCard =>
        card.name == this.name && card.description == this.description && card.power == this.power
      case _ => false
    }
  }
}

