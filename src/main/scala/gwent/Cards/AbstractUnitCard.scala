package cl.uchile.dcc
package gwent.Cards

import gwent.Cards.Card

import cl.uchile.dcc.gwent.Cards.Habilidades.Combat.AbstractCombatHabilities
import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin

/** Abstract class representing a unit card in the Gwen't game.
 *
 * An `AbstractUnitCard` is a type of [[Card]] that has a power value which contributes to
 * the player's total power in the game.
 * Each unit card starts with its current power equal to its base power.
 *
 * @constructor Creates a new `AbstractUnitCard` with a specified name, description, and
 *              power.
 * @param name The name of the card.
 * @param description The description of the card, explaining its specific abilities or
 *                    role in the game.
 * @param power The base power of the card, indicating the contribution of this card to
 *              the player's total power when unaffected by any special conditions.
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~YOUR NAME~
 * @version 1.1
 * @since 1.0
 */
abstract class AbstractUnitCard protected(val name: String, val description: Habilidades,
                                          private var power: Int) extends Card {

  /** The current power of the card, which may be affected by various conditions during
   * gameplay.
   * Initially set to the base [[power]] of the card.
   */
  var currentPower: Int = power

  def get_name: String = name

  def get_description: String = description.nombre
  val PoderBase:Int = power
  def get_power: Int = power
  
  def set_power(n: Int): Unit = {
    power= n
  }

  override def equals(obj: Any): Boolean = {
    if(obj.isInstanceOf[AbstractUnitCard]) {
      obj.asInstanceOf[AbstractUnitCard].name == this.name && obj.asInstanceOf[AbstractUnitCard].description == this.description && obj.asInstanceOf[AbstractUnitCard].power == this.power
    }
    else{
        false
    }
  }



}

