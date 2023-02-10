package com.reto.tecnico.util;

public class Constantes {
	 /*
	  * constantes SQL
	  */
//		public static final String CONSULTA_GENERAL="SELECT n FROM Nave n WHERE CONCAT(n.id,n.nombre,n.paisOrigen,n.altura,n.peso) LIKE %?1%";
		public static final String CONSULTA_GENERAL="SELECT n FROM Nave n INNER JOIN ClaseNave cn ON n.tipo=cn.id INNER JOIN Combustible cb ON n.combustible=cb.id WHERE CONCAT(n.id,n.nombre,n.paisOrigen,n.altura,n.peso) LIKE %?1% OR CONCAT(cn.id,cn.tipoNave) LIKE %?1% OR CONCAT(cb.id,cb.tipoCombustible) LIKE %?1%";
	}
