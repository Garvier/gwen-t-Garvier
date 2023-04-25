package cl.uchile.dcc
package Jugador
import Cartas.{carta, nombrescartas}
import Cartas.nombrescartas.*

import scala.::
import scala.collection.immutable.List
import scala.util.Random



class mazo() {
  private var tengo: List[carta] = List()

  def inicializar()= {

    val c1 = (new DunBannerMedic())
    val c2 = new KaedweniSiegeExpert()
    val c3 = new Trebuchet()
    val c4 = new Ballista()
    val c5 = new ImpenetrableFog()
    val c6 = new TorrentialRain()
    val c7 = new ClearWeather()
    val c8 = new BittingFrost()
    val c9 = new PoorFuckingInfantry()
    val c10 = new RedanianFootSoldier()
    val c11 = new Ves()
    val c12 = new SiegfridOfDenestle()
    val c13 = new PrinceStennis()
    val c14 = new BlueStripesComando()
    val c15 = new Dethmold()
    val c16 = new KeiraMetz()
    val c17 = new SileDeTansarville()
    val c18 = new SheldonSkaggs()


    tengo = c1 :: tengo
    tengo = c2 :: tengo
    tengo = c3 :: tengo
    tengo = c4 :: tengo
    tengo = c5 :: tengo
    tengo = c6 :: tengo
    tengo = c7 :: tengo
    tengo = c8 :: tengo
    tengo = c9 :: tengo
    tengo = c10 :: tengo
    tengo = c11 :: tengo
    tengo = c12 :: tengo
    tengo = c13 :: tengo
    tengo = c14 :: tengo
    tengo = c15 :: tengo
    tengo = c16 :: tengo
    tengo = c17 :: tengo
    tengo = c18 :: tengo
    tengo = Random.shuffle(tengo)
  }

  def getterTengo(): List[Any]= {
    tengo

  }
  def agregar(objeto: carta): Unit = {
    tengo = objeto :: tengo
  }

  def sacar(): Unit = {
    if(tengo.nonEmpty){
    val objeto = tengo.head
    tengo = tengo.tail
    return objeto
    }
    else{
      println("No tienes cartas")
    }

  }
  def revolver(): Unit = {
    tengo= Random.shuffle(tengo)
  }

}

class EnMano(private var disponible: mazo){
  private var mano: List[carta]= List()
  private var deck = disponible
  def agregarCarta(): Unit = {
    if (deck.getterTengo().nonEmpty){
      val cartanueva= deck.sacar()
      mano = cartanueva :: mano

    }
    else {
      println("No te quedan cartas en tu mano")
    }
  }

  def bajarCarta(): Unit = {
    if (mano.nonEmpty) {
      val objeto = mano.head
      mano = mano.tail
      objeto

    }
  }
}