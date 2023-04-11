package cl.uchile.dcc
package jugadorTest

import munit.FunSuite

class testJugador extends FunSuite {
  var jugador: jugador = _
  var mazo: mazo = _
  var jugador2: jugador = _
  var mano1: mano =_
  override def beforeEach(context: BeforeEach): Unit = {
    mazo= new mazo()
    mano= new mano()
    jugador = new jugador("Juan",mazo, mano1 )
    jugador2 = new jugador("Pedro",mazo, mano1)




  }
  test("reconoce el nombre del jugador"){
    assertEquals(jugador.GetNombre(),"Juan")
    assertEquals(jugador2.GetNombre(), "Pedro")

  }
  test("Reconoce cantidad de gemas"){
    assertEquals(jugador.GetGemas(),2)
    assertEquals(jugador2.GetGemas(),jugador.GetGemas())
    jugador.pierdeGema()
    assertEquals(jugador.GetGemas(),1)
  }

}
