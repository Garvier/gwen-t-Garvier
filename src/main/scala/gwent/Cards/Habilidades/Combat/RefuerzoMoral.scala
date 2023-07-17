package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Combat.AbstractCombatHabilities

import cl.uchile.dcc.gwent.Cards.Card

class RefuerzoMoral() extends AbstractCombatHabilities {
  override val nombre: String = "Refuerzo Moral"
  override def ejecutar(lista:List[Card],card: Card): Unit = {
    lista.foreach{elemento=>
      if(elemento!=card){
        elemento.set_power(elemento.get_power()+1)
      }

    }
  }
}
