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
  `altura` float NOT NULL,
  `pais_origen` varchar(60) NOT NULL,
  `peso` float NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `combustible_id` bigint DEFAULT NULL,
  `clase_nave_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6pyepcqssealo0yd3pkskr52i` (`combustible_id`),
  KEY `FKr96b0wtn4o502p4gmrxdhvxhc` (`clase_nave_id`),
  CONSTRAINT `FK6pyepcqssealo0yd3pkskr52i` FOREIGN KEY (`combustible_id`) REFERENCES `combustible` (`id`),
  CONSTRAINT `FKqm6c48940w9ntmwx61m1pslt6` FOREIGN KEY (`tipo_nave_id`) REFERENCES `tipo_nave` (`id`),
  CONSTRAINT `FKr96b0wtn4o502p4gmrxdhvxhc` FOREIGN KEY (`clase_nave_id`) REFERENCES `clase_nave` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
