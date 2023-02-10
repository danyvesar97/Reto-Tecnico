--! Script para crear la tabla clase_nave
CREATE TABLE `clase_nave` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `tipo_nave` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--! Script para crear la tabla combustible
CREATE TABLE `combustible` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `tipo_combustible` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--! Script para crear la tabla nave
CREATE TABLE `nave` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `clase_nave_id` bigint DEFAULT NULL,
  `pais_origen` varchar(60) NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `combustible_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6pyepcqssealo0yd3pkskr52i` (`combustible_id`),
  KEY `FKr96b0wtn4o502p4gmrxdhvxhc` (`clase_nave_id`),
  CONSTRAINT `FK6pyepcqssealo0yd3pkskr52i` FOREIGN KEY (`combustible_id`) REFERENCES `combustible` (`id`),
  CONSTRAINT `FKqm6c48940w9ntmwx61m1pslt6` FOREIGN KEY (`tipo_nave_id`) REFERENCES `tipo_nave` (`id`),
  CONSTRAINT `FKr96b0wtn4o502p4gmrxdhvxhc` FOREIGN KEY (`clase_nave_id`) REFERENCES `clase_nave` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--! Script para insertar los datos necesarios en la tabla clase_nave
INSERT INTO `control_naves`.`clase_nave`
(`id`,
`tipo_nave`)
VALUES
(<{id: 1}>,
<{tipo_nave: Lanzadera}>);
(<{id: 2}>,
<{tipo_nave: Robótica}>);
(<{id: 3}>,
<{tipo_nave: Tripulada}>);
--! Script para insertar los datos necesarios en la tabla combustible
INSERT INTO `control_naves`.`combustible`
(`id`,
`tipo_combustible`)
VALUES
(<{id: 1}>,
<{tipo_combustible: Líquido}>);
(<{id: 2}>,
<{tipo_combustible: Sólido}>);
(<{id: 3}>,
<{tipo_combustible: No Tiene}>);
--! Script para insertar los datos necesarios en la tabla nave`INSERT INTO `control_naves`.`nave`
(`id`,
`nombre`,
`clase_nave_id`,
`pais_origen`,
`altura`,
`peso`,
`combustible_id`)
VALUES
(<{id: 1}>,
<{nombre: Change}>,
<{clase_nave_id: 1}>,
<{pais_origen: China}>,
<{altura: 4.6}>,
<{peso: 423}>,
<{combustible_id: 2}>);
<{id: 2}>,
<{nombre: MIR}>,
<{clase_nave_id: 1}>,
<{pais_origen: Rusia}>,
<{altura: 4.7}>,
<{peso: 234}>,
<{combustible_id: 3}>);
(<{id: 3}>,
<{nombre: Vostok 1}>,
<{clase_nave_id: 3}>,
<{pais_origen: Rusia}>,
<{altura: 4.8}>,
<{peso: 244}>,
<{combustible_id: 2}>);
(<{id: 4}>,
<{nombre: Zeus}>,
<{clase_nave_id: 2}>,
<{pais_origen: Dinamarca}>,
<{altura: 6}>,
<{peso: 79}>,
<{combustible_id: 2}>);
(<{id: 5}>,
<{nombre: Atlantis}>,
<{clase_nave_id: 1}>,
<{pais_origen: USA}>,
<{altura: 56.1}>,
<{peso: 980}>,
<{combustible_id: 1}>);
(<{id: 6}>,
<{nombre: Endeavour}>,
<{clase_nave_id: 1}>,
<{pais_origen: USA}>,
<{altura: 56.1}>,
<{peso: 980}>,
<{combustible_id: 1}>);
(<{id: 7}>,
<{nombre: Saturno V}>,
<{clase_nave_id: 3}>,
<{pais_origen: USA}>,
<{altura: 110.6}>,
<{peso: 10000}>,
<{combustible_id: 2}>);
(<{id: 8}>,
<{nombre: Little Joe II}>,
<{clase_nave_id: 3}>,
<{pais_origen: USA}>,
<{altura: 26.2}>,
<{peso: 8030}>,
<{combustible_id: 2}>);
(<{id: 9}>,
<{nombre: Sonda SOHO}>,
<{clase_nave_id: 2}>,
<{pais_origen: USA}>,
<{altura: 7}>,
<{peso: 1850}>,
<{combustible_id: 3}>);




