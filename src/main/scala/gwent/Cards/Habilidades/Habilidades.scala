package cl.uchile.dcc
package gwent.Cards.Habilidades

import gwent.Cards.Card

import cl.uchile.dcc.gwent.Jugador.tablero

import scala.collection.mutable.ArrayBuffer

/**
 *
 *Trait representing abilities.
*/
 

  trait Habilidades {
    val nombre: String

    def ejecutar(lista: ArrayBuffer[Card], card: Card): Unit

    def ejecutar(board: tablero): Unit
  
}