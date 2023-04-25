package cl.uchile.dcc
package cartasTest
import Cartas.carta
import Cartas.tipos.asedio
import Cartas.tipos.clima

import cl.uchile.dcc.Cartas.tipos.*
import cl.uchile.dcc.Cartas.nombrescartas.*

import munit.FunSuite





class testCarta extends FunSuite {
  var cartaClima1: BittingFrost = _
  var cartaClima2: ImpenetrableFog = _
  var cartaClima3: BittingFrost = _
  var cartaDistancia1: SheldonSkaggs = _
  var cartaDistancia2: Dethmold = _
  var cartaDistancia3: Dethmold = _
  var cartaCuerpoACuerpo1: PrinceStennis = _
  var cartaCuerpoACuerpo2: PoorFuckingInfantry = _
  var cartaAsedio1: Trebuchet = _
  var cartaAsedio2: Ballista = _
  var cartaAsedio3: KaedweniSiegeExpert = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartaClima1 = new BittingFrost()
    cartaClima2 = new ImpenetrableFog()
    cartaClima3 = new BittingFrost()
    cartaDistancia1 = new SheldonSkaggs()
    cartaDistancia2 = new Dethmold()
    cartaDistancia3 = new Dethmold()
    cartaCuerpoACuerpo1 = new PrinceStennis()
    cartaCuerpoACuerpo2 = new PoorFuckingInfantry()
    cartaAsedio1 = new Trebuchet()
    cartaAsedio2 = new Ballista()
    cartaAsedio3 = new KaedweniSiegeExpert()

  }

  test("Reconoce el tipo de la carta") {
    assertEquals(cartaAsedio1.GetTipo(), "Asedio")
    assertEquals(cartaCuerpoACuerpo1.GetTipo(), "Cuerpo a cuerpo")
    assertEquals(cartaClima3.GetTipo(), "Clima")
    
    assertEquals(cartaDistancia2.GetTipo(), cartaDistancia1.GetTipo())
  }
  test("Reconoce el nombre de la carta") {
    assertEquals(cartaDistancia2.GetNombre(), cartaDistancia3.GetNombre())
    assertEquals(cartaClima3.GetNombre(), "Escarcha Mordiente")
    assertEquals(cartaCuerpoACuerpo1.GetNombre(), "Yarpen Zigrin")
  }
  
  test("reconoce el valor de fuerza de la carta") {
    assertEquals(cartaClima3.GetFuerza(), 3)
    assertEquals(cartaDistancia2.GetFuerza(), 6)
    assertEquals(cartaDistancia3.GetFuerza(), cartaDistancia3.GetFuerza())
  }
  
  test("Reconoce si tiene habilidad"){
    assert(cartaClima3.HaveHabilidad())
    assert(cartaClima1.HaveHabilidad())
    assert(cartaClima2.HaveHabilidad())
    assert(cartaCuerpoACuerpo2.HaveHabilidad())
  }
}