-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-08-2014 a las 11:18:07
-- Versión del servidor: 5.5.38-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `analisis`
--
CREATE DATABASE IF NOT EXISTS `analisis` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `analisis`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegos`
--

CREATE TABLE IF NOT EXISTS `juegos` (
  `codigo` int NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `fchSalida` DATE DEFAULT NULL,
  `nota` int DEFAULT NULL,
  `desarrolladora` varchar(30) NOT NULL,
  `distribuidora` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `juegos` (`codigo`, `nombre`, `fchSalida`, `nota`, `desarrolladora`, `distribuidora`) VALUES
(1235, 'Fire Emblem Fates', '2016-05-20', 87, 'Intelligent Sistems', 'Nintendo'),
(1236, 'Uncharted 4', '2016-05-10', 93, 'Naughty Dog', 'Sony'),
(1237, 'Ni no Kuni', '2013-02-01', 85, 'Level-5', 'Bandai Namco'),
(1238, 'Bravely Default', '2013-12-06', 85, 'Silicon Studio', 'Nintendo'),
(1239, 'Tales of Xillia 2', '2014-08-22', 71, 'Bandai Namco', 'Bandai Namco'),
(1240, 'Half Minute Hero: The Second Coming', '2014-04-04', 79, 'Opus', 'Steam'),
(1241, 'Pokemon: Zafiro Alfa', '2014-11-28', 82, 'Game Freak', 'Nintendo'),
(1242, 'Ratchet & Clank', '2016-04-20', 86, 'Insomniac', 'Sony'),
(1243, 'Sly Cooper: Ladrones en el Tiempo', '2013-03-28', 75, 'Sanzaru', 'Sony'),
(1244, 'Apollo Justice: Ace Attorney', '2008-05-09', 78, 'Capcom', 'Capcom');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
