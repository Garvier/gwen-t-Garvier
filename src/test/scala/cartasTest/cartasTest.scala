package cl.uchile.dcc
package cartasTest


import munit.FunSuite

class testCarta extends FunSuite {
  var cartaClima1: EscarchaMordiente = _
  var cartaClima2: impenetrable = _
  var cartaClima3: EscarchaMordiente = _
  var cartaDistancia1: SheldonSkaggs = _
  var cartaDistancia2: Dethmold = _
  var cartaDistancia3: Dethmold = _
  var cartaCuerpoACuerpo1: YarpenZigrin = _
  var cartaCuerpoACuerpo2: PoorFuckingInfantry = _
  var cartaAsedio1: Trebuchet = _
  var cartaAsedio2: Ballista = _
  var cartaAsedio3: KaedweniSiegiExpert = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartaClima1 = new EscarchaMordiente()
    cartaClima2 = new impenetrable()
    cartaClima3 = new EscarchaMordiente()
    cartaDistancia1 = new SheldonSkaggs()
    cartaDistancia2 = new Dethmold()
    cartaDistancia3 = new Dethmold()
    cartaCuerpoACuerpo1 = new YarpenZigrin()
    cartaCuerpoACuerpo2 = new PoorFuckingInfantry()
    cartaAsedio1 = new Trebuchet()
    cartaAsedio2 = new Ballista()
    cartaAsedio3 = new KaedweniSiegiExpert()

  }

  test("reconoce el tipo de la carta") {
    assertEquals(cartaAsedio1.GetTipo(), "asedio")
    assertEquals(cartaCuerpoACuerpo1.GetTipo(), "CuerpoACuerpo")
    assertEquals(cartaClima3.GetTipo(), "Clima")
    assertEquals(cartaDistancia2.GetTipo(), cartaDistancia1.GetTipo())

  }
  test("Reconoce el nombre de la carta") {
    assertEquals(cartaDistancia2.GetNombre(), cartaDistancia3.GetNombre())
    assertEquals(cartaClima3.GetNombre(), "Escarcha Mordiente")
    assertEquals(cartaCuerpoACuerpo1.nombre, YarpenZigrin)
  }
  test("reconoce el valor de fuerza de la carta") {
    assertEquals(cartaClima3.GetDanho(), 3)
    assertEquals(cartaDistancia2.GetDanho(), 6)
    assertEquals(cartaDistancia.GetDanho(), cartaDistancia3.GetDanho())
  }
  test("Reconoce si tiene habilidad"){
    assert(cartaClima3.GetHabilidad())
    assert(cartaClima1.GetHabilidad())
    assert(cartaClima2.GetHabilidad())
    assert(cartaCuerpoACuerpo2.GetHabilidad())
  }
}