package cl.uchile.dcc
package Cartas.nombrescartas

import Cartas.tipos.distancia


class Dethmold extends distancia{
  val nombre = "Dethmold"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Distancia"
  def GetHabilidad(): String =  ""

  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 6
}


class KeiraMetz extends distancia{
  
  val nombre= "keira Metz"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Distancia"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 5
}

class SileDeTansarville extends distancia{
  val nombre = "Síle de Tansarville"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Distancia"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 5
}


class SabinaGlevissig extends distancia{
  val nombre = "Sabina Glesivig"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Distancia"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int =4
}


class SheldonSkaggs extends distancia{
  val nombre = "Sheldon Skaggs"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Distancia"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 4
}