package cl.uchile.dcc
package jugadorTest
import cl.uchile.dcc.Cartas.nombrescartas

import scala.collection.immutable.List
import cl.uchile.dcc.Jugador.{EnMano, jugador, mazo}
import munit.FunSuite



class testJugador extends FunSuite {
  var jugador: jugador = _
  var mazo1: mazo = _
  var jugador2: jugador = _
  var mazo2: mazo = _
  var mano1: EnMano =_
  var mano2: EnMano =_
  override def beforeEach(context: BeforeEach): Unit = {


    mazo1 = new mazo()
    mazo2 = new mazo()
    mano1= new EnMano(mazo1)
    mano2 = new EnMano(mazo2)
    mazo1.inicializar()
    mazo2.inicializar()



    jugador = new jugador("Juan", mazo1, mano1)
    jugador2 = new jugador("Pedro", mazo2, mano2)





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
