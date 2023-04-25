package cl.uchile.dcc
package Cartas

trait carta {
  
  val nombre: String 
  val tipo: String
  override def equals(obj: Any): Boolean
  def GetNombre():String
  def GetFuerza():Int
  def GetHabilidad(): String
  def HaveHabilidad(): Boolean
  def GetTipo(): String
}
