package cl.uchile.dcc
package gwent.Cards

import gwent.Cards.AbstractUnitCard

import cl.uchile.dcc.gwent.Jugador.{Player, TableroPropio}

import java.util.jar.Attributes.Name

/** Class representing a ranged combat unit card in the Gwen't game.
 *
 * A `RangedCombatCard` is a type of [[AbstractUnitCard]].
 * These cards represent troops that engage in ranged combat on the battlefield.
 * As per the game's rules, these cards can only be placed in the ranged combat zone.
 *
 * @constructor create a new ranged combat card with name, description, and power.
 * @param name the name of the card.
 * @param description the description of the card.
 * @param power the initial power value of the card, which also corresponds to the
 *              strength of the troop it represents.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~YOUR NAME~
 * @version 1.1
 * @since 1.0
 */
class RangedCombatCard(name: String, description: String, power: Int)
  extends AbstractUnitCard(name, description, power){

  /**

  Plays the current card on the player's board.
  This method adds the current card to the player's board by calling the addCardFromPlayer method on the player's board's table object.
  @param a The Player object representing the player who is playing the card.
   */
  def play(a: Player):Unit=a.tablero.addCardFromPlayer(this)
}





