package cl.uchile.dcc
package gwent.factory

import gwent.Cards.Habilidades.Combat.Sin
import gwent.Cards.{SiegeCombatCard, WeatherCard}

import cl.uchile.dcc.gwent.Cards.Habilidades.Clima.EscarchaMordiente

class WeatherFactory extends AbstractCardFactory(name="EscarchaMordiente",new EscarchaMordiente(),10) {
  override def create(): WeatherCard = new WeatherCard(name,description,power)

}


