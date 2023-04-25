package cl.uchile.dcc
package Cartas.nombrescartas

import Cartas.carta
import Cartas.tipos.asedio

class Trebuchet extends asedio{
  val nombre = "Trebuchet"
  
  def GetNombre(): String = nombre
  def GetTipo(): String = "Asedio"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 6
}


class Ballista extends asedio{
  val nombre = "Ballista"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Asedio"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 6
}


class DunBannerMedic extends asedio{
  val nombre = "Dun Banner Medic"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Asedio"
  def GetHabilidad(): String =  "+1"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int =5
}


class KaedweniSiegeExpert extends asedio{
  val nombre =  "Kaedweni Siege Expert"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Asedio"
  def GetHabilidad(): String =  "+1"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 1
}