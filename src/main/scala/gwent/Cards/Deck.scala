package cl.uchile.dcc
package gwent.Cards
import gwent.factory.CardFactory

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades

import scala.collection.mutable.ArrayBuffer

class Deck() {

  var  mazo: ArrayBuffer[Card]= ArrayBuffer[Card]()
  private var cardFactory: Option[CardFactory]=None

  def setCardFactory(cardFar: CardFactory):Unit = {
    cardFactory = Some(cardFar)
  }

  def addCard(n: Int): Unit = {
    for(i <-1 to n) {
      mazo.append(cardFactory.get.create())
    }
  }
  
  def removeMember(carta: Card):Unit = {
    mazo-=carta

  }

  /** Shuffles the player's deck.
   *
   * The order of cards in the player's deck is randomized.
   * This is achieved by creating a new, shuffled list and reassigning _deck to it, rather
   * than by modifying the original list.
   */
  def shuffleDeck(): Unit = {
    mazo = scala.util.Random.shuffle(mazo)
  }
  
  def Genera(factory: CardFactory,name:String,description: Option[Habilidades],Power:Int,largo:Int): Unit = {
    factory.setName(name)
    factory.setPower(Power)
    factory.setDescription(description)
    this.setCardFactory(factory)
    this.addCard(largo)
    
  }
}
