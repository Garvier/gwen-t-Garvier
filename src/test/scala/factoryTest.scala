package cl.uchile.dcc

import gwent.Cards.{Card, CloseCombatCard, Deck, RangedCombatCard, SiegeCombatCard, WeatherCard}
import gwent.Cards.Habilidades.Clima.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable}
import gwent.Cards.Habilidades.Combat.{RefuerzoMoral, Sin, VinculoEstrecho}
import gwent.Jugador.{Player, TableroPropio, tablero}
import gwent.factory.{CloseFactory, RangedFactory, SiegeFactory, WeatherFactory}

import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class factoryTest extends FunSuite {
  var mazo: Deck = _
  var facRan: RangedFactory = _
  var facSie: SiegeFactory = _
  var facClo: CloseFactory = _
  var weaFac: WeatherFactory = _


  override def beforeEach(context: BeforeEach): Unit = {
    facRan = new RangedFactory()
    facSie = new SiegeFactory()
    facClo = new CloseFactory()
    weaFac = new WeatherFactory()
    mazo = new Deck()
    //0 a 3
    mazo.Genera(weaFac, "Escarcha Mordiente", new EscarchaMordiente(), 0, 1)
    mazo.Genera(weaFac, "Lluvia Torrencial", new LluviaTorrencial(), 0, 1)
    mazo.Genera(weaFac, "Niebla Impenetrable", new NieblaImpenetrable(), 0, 1)
    mazo.Genera(weaFac, "Clima Despejado", new ClimaDespejado(), 0, 1)
    // cartas de la 4,5
    mazo.Genera(facRan, "Arquero", new Sin(), 4, 2)
    //6 y 7
    mazo.Genera(facRan, "Ballestero", new RefuerzoMoral(), 3, 2)
    // 8 y 9
    mazo.Genera(facSie, "Ariete", new Sin(), 6, 2)
    // 10 y 11
    mazo.Genera(facSie, "Catapulta", new VinculoEstrecho(), 4, 2)
    // 12 y 13
    mazo.Genera(facClo, "Espadachin", new Sin(), 3, 2)
    // 14 y 15
    mazo.Genera(facClo, "Caballero", new RefuerzoMoral(), 5, 2)

  }

  test("Se generan las weatherCard") {
    assert(mazo.mazo.nonEmpty)
    mazo.mazo(0).equals(new WeatherCard("Escarcha Mordiente", new EscarchaMordiente(), 0))
  }
  test("Se generan las RangeCards") {
    mazo.mazo(4).equals(new RangedCombatCard("Arquero", new Sin(), 4))
  }
  test("Se generan las CloseCards") {
    mazo.mazo(14).equals(new CloseCombatCard("Arquero", new RefuerzoMoral(), 5))
  }
  test("Se generan las SiegeCards") {
    mazo.mazo(10).equals(new SiegeCombatCard("Catapulta", new VinculoEstrecho(), 4))
  }
}
