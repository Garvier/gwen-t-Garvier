
package cl.uchile.dcc
package gwent.Cards

import gwent.Cards.Card

import cl.uchile.dcc.gwent.Jugador.{Player, TableroPropio, tablero}


/** Class representing a weather card in the Gwen't game.
 *
 * A `WeatherCard` is a type of [[Card]] that can be placed in the weather zone.
 * These cards have the ability to affect the battlefield and provide advantages or
 * disadvantages to players, depending on the type of weather that has been chosen.
 *
 * @constructor Creates a new `WeatherCard` with a specified name and description.
 * @param name The name of the card.
 * @param description The description of the card, explaining its specific effects.
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~YOUR NAME~
 * @version 1.1
 * @since 1.0
 */
class WeatherCard(val name: String, val description: String) extends Card{

  /**
   *
   * Plays the current card on the player's board.
   * This method adds the current card to the player's board by calling the addCardFromPlayer method on the player's board's table object.
   * @param a The Player object representing the player who is playing the card.
   */
  def play(a: Player):Unit=a.tablero.table.addCardFromPlayer(this)
}

