package cl.uchile.dcc
package Cartas.tipos

import Cartas.carta

abstract class distancia extends carta{
    val nombre: String
    val tipo = "Distancia"
    def GetNombre(): String

    def GetFuerza(): Int

    def GetHabilidad(): String

    def HaveHabilidad(): Boolean

    def GetTipo(): String

  }


