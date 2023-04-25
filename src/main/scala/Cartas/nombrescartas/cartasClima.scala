package cl.uchile.dcc
package Cartas.nombrescartas

import Cartas.carta
import Cartas.tipos.clima

class BittingFrost extends clima{
  val nombre = "Bitting Frost"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Clima"
  def GetHabilidad(): String =  "Hielo"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 0

}

class ImpenetrableFog extends  clima{
  val nombre = "Impenetrable Fog"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Clima"
  def GetHabilidad(): String =  "Niebla"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 0

}


class TorrentialRain extends  clima{
  val nombre = "Torrential Rain"
  def GetNombre(): String =  nombre
  def GetTipo(): String = "Lluvia"
  def GetHabilidad(): String =  "Hielo"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 0

}



class ClearWeather extends  clima{
  val nombre = "Clear Weather"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Clima"
  def GetHabilidad(): String =  "Despejado"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 0

}
