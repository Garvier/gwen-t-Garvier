package cl.uchile.dcc
package Cartas.nombrescartas

import Cartas.carta

import cl.uchile.dcc.Cartas.tipos.cuerpoAcuerpo

class Ves extends cuerpoAcuerpo{
  val nombre = "Ves"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 6
}

class SiegfridOfDenestle extends cuerpoAcuerpo {
  val nombre = "Siegfrid Of Denestle"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 5
}

class PrinceStennis extends cuerpoAcuerpo {
  val nombre = "Prince Stennis"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  "+1"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 5
}

class BlueStripesComando extends cuerpoAcuerpo {
  val nombre = "Blue Stripes Comando"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  "+1"
  def HaveHabilidad(): Boolean = true
  
  def GetFuerza(): Int = 4
}

class PoorFuckingInfantry extends cuerpoAcuerpo {
  val nombre = "Poor Fucking Infantry"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  "+1"
  def HaveHabilidad(): Boolean = true
  def GetFuerza(): Int = 1
}


class RedanianFootSoldier extends cuerpoAcuerpo {
  val nombre = "Redanian Foot Soldier"
  def GetNombre(): String = nombre
  def GetTipo(): String = "Cuerpo a cuerpo"
  def GetHabilidad(): String =  ""
  def HaveHabilidad(): Boolean = false
  def GetFuerza(): Int = 1
}