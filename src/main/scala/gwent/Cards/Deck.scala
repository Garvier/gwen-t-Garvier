package cl.uchile.dcc
package gwent.Cards
import gwent.factory.CardFactory

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades

import scala.collection.mutable.ArrayBuffer


/**
 * Class representing a deck of cards.
 *
 * The deck contains a collection of cards and provides methods for managing the deck,
 * such as adding cards, removing cards, and shuffling the deck.
 */
class Deck() {
  var mazo: ArrayBuffer[Card] = ArrayBuffer[Card]()
  private var cardFactory: Option[CardFactory] = None

  /**
   * Sets the card factory for creating cards in the deck.
   *
   * @param cardFactory The card factory to set.
   */
  def setCardFactory(cardFactory: CardFactory): Unit = {
    this.cardFactory = Some(cardFactory)
  }

  /**
   * Adds a specified number of cards to the deck.
   *
   * @param n The number of cards to add.
   */
  def addCard(n: Int): Unit = {
    for (_ <- 1 to n) {
      cardFactory.foreach(factory => mazo.append(factory.create()))
    }
  }

  /**
   * Removes a specified card from the deck.
   *
   * @param carta The card to remove.
   */
  def removeMember(): Unit = {
    mazo = mazo.tail
  }

  /**
   * Shuffles the deck of cards.
   *
   * The order of cards in the deck is randomized.
   * This is achieved by using the `scala.util.Random.shuffle` method to shuffle the cards.
   */
  def shuffleDeck(): Unit = {
    mazo = scala.util.Random.shuffle(mazo)
  }

  /**
   * Generates cards using the provided card factory and adds them to the deck.
   *
   * @param factory     The card factory to use for creating cards.
   * @param name        The name of the cards.
   * @param description The description of the cards' abilities.
   * @param power       The power of the cards.
   * @param largo       The number of cards to generate.
   */
  def Genera(factory: CardFactory, name: String, description: Habilidades, power: Int, largo: Int): Unit = {
    factory.setName(name)
    factory.setPower(power)
    factory.setDescription(description)
    setCardFactory(factory)
    addCard(largo)
  }
}
