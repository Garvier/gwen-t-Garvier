
package cl.uchile.dcc
package gwent.Jugador

import gwent.Cards.{Card, Deck, WeatherCard}

import cl.uchile.dcc.gwent.controller.GameController

import scala.collection.immutable.List

/** Class representing a player in the Gwen't game.
 *
 * Each player has a name, a gem counter, a deck of cards, and a hand of cards.
 * The deck and hand are private variables, but can be accessed via their corresponding
 * getter methods.
 * We use immutable lists instead of mutable ones to represent the deck and the hand.
 * This is a common practice in functional programming and in Scala in particular.
 * By using immutable data structures, we can avoid potential side effects caused by
 * mutable state and make our code safer and easier to reason about.
 *
 * @constructor Create a new player with a name, gem counter, deck, and hand.
 * @param name The name of the player.
 * @param gemCounter The initial gem count for the player.
 * @param _deck The initial list of cards in the player's deck.
 * @param _hand The initial list of cards in the player's hand.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~YOUR NAME~
 * @version 1.1
 * @since 1.0
 */
class Player(val name: String, var gemCounter: Int, private var deck:Deck,
             private var _hand: List[Card],gameController: GameController) {
  var tablero:TableroPropio=_


  def update(): Unit = {
    
  }
  def showHand(): Unit={
    var mano: String=""
    var count: Int=0
    hand.foreach{carta=>
      mano += carta.get_name().toString+", INDEX"+ count.toString+ "; "
      count+=1

    }
    println(mano)
  }
  def PoderMano():Int={
    var count=0
    hand.foreach{carta=>
      count+= carta.get_power()
      
    }
    count
  }
  
  if(gemCounter<0) {
    throw new IllegalArgumentException("La variable debe ser positiva")
  }

  /** Accessor method for the player's deck */

  /** Accessor method for the player's hand */
  var hand: List[Card] = _hand
  def get_gemCounter():Int = gemCounter
  def set_gemCounter(gem:Int): Unit = {
    if(gem>=0) {
      gemCounter = gem
    }
  }
  /** Draws a card from the deck and adds it to the hand.
   *
   * The top card from the deck is removed and added to the player's hand.
   * This method also returns the drawn card.
   *
   * Note: as lists are immutable, when we "remove" a card from the deck or "add" one to
   * the hand, what we're actually doing is creating a new list with the desired contents
   * and reassigning the _deck or _hand variable to this new list.
   *
   * @return The card that was drawn from the deck.
   */   
  def drawCard(n:Int): Unit = {
    for(i <- 1 to n){
      val card = deck.mazo(0)
      deck.removeMember(card)
      hand = card :: hand
    }  
  }
  


  /**
   * Removes a specific card from the player's hand.
   *
   * @param carta The card to be removed from the player's hand.
   * @return The removed card.
   * @throws NoSuchElementException If the card is not present in the player's hand.
   */

  def takeCard(carta: Card): Unit = {
    if (hand.contains(carta)) {
      _hand = hand.filterNot(_ == carta)
      carta.play(this)
      

    } else {
      print("No tienes esta carta en tu mano")
    }
  }

  /**
   *
   * Sets the own board for the player.
   * This method establishes a connection between the player and its own board by setting the specified TableroPropio object as the player's own board.
   * @param a The TableroPropio object to be set as the player's own board.
   */
  def settablero(a:TableroPropio): Unit = {
    tablero=a
  }
  def tiene_weather():List[WeatherCard]={
    var climas: List[WeatherCard] = List[WeatherCard]()
    hand.foreach {
      case weatherCard: WeatherCard =>
        climas = weatherCard :: climas
      case _ => // nada
    }
    climas
    
  }
}
