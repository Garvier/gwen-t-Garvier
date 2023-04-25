package cl.uchile.dcc
package Jugador

import Cartas.carta
import Jugador.mazo
class jugador(nombre: String, deck: mazo, mano: mazo){

  private var gemas = 2
  def getNombre(): String = nombre
  def GetGemas(): Int = gemas
  def pierde(): Unit={
    if(gemas>0){
      gemas = gemas -1
    }
    else{
      //En proceso aun pero se tiene la idea
      println("Perdiste la partida ") 
    }
  }
  def jugarCarta(n: Int): Unit = {
    
  }
}



