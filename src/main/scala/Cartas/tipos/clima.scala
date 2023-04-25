
package cl.uchile.dcc
package Cartas.tipos

import Cartas.carta

abstract class clima extends carta{
  val nombre: String
  val tipo = "clima"
  def GetNombre(): String

  override def equals(other: Any): Boolean = {
    other.isInstanceOf[carta] && this.tipo == other.asInstanceOf[carta].tipo && this.nombre == other.asInstanceOf[carta].nombre
  }

  def GetFuerza(): Int
  
  

  def GetHabilidad(): String
  def HaveHabilidad(): Boolean

  def GetTipo(): String
}
