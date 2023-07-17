package cl.uchile.dcc
package gwent.Cards.Habilidades.Combat

import gwent.Cards.Habilidades.Combat.AbstractCombatHabilities

import cl.uchile.dcc.gwent.Cards.Card

class VinculoEstrecho() extends AbstractCombatHabilities {
  override val nombre: String = "Vinculo Estrecho"
  override def ejecutar(lista:List[Card],card:Card): Unit = {
    lista.foreach{ elemento =>
      if (elemento.get_name() == card.get_name()) {
        elemento.set_power(elemento.get_power * 2)
      }
    }
  }
}
