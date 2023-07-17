package cl.uchile.dcc
package gwent.factory
import gwent.factory.CardFactory

import cl.uchile.dcc.gwent.Cards.Habilidades.Habilidades
abstract class AbstractCardFactory(protected var name:String, protected var description:Habilidades, protected var power:Int) extends CardFactory {
  override def setName(newName: String): Unit = {
    name= newName
  }

  override def setDescription(newDescription: Habilidades): Unit = {
    description=newDescription
  }

  override def setPower(newPower: Int): Unit = {
    power=newPower
  }
}
