package cl.uchile.dcc
package gwent.factory
import gwent.Cards.Card

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades
trait CardFactory {
  def create(): Card
  
  def setName(newName:String):Unit
  
  def setDescription(newDescription: Option[Habilidades]):Unit
  
  def setPower(newPower: Int):Unit
}
