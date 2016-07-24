-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2016 a las 01:01:01
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `compie`
--
CREATE DATABASE IF NOT EXISTS `compie` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `compie`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `palabras`
--

CREATE TABLE `palabras` (
  `nom_pb` varchar(15) NOT NULL,
  `tipo_pb` varchar(25) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `palabras`
--

INSERT INTO `palabras` (`nom_pb`, `tipo_pb`, `descripcion`) VALUES
('*\\', 'compuesta', 'fin de comentario'),
('/*', 'compuesta', 'iniciar comentario'),
('declarar', 'simple', 'declaracion de variables'),
('fin', 'simple', 'fin del programa'),
('inicio', 'simple', 'inicio del programa'),
('mmatini', 'compuesta', 'iniciar op. mat'),
('mmattfin', 'compuesta', 'fin op. mat'),
('mostrar', 'simple', 'Muestra pantalla'),
('programa', 'simple', 'nombre del programa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `simbolos`
--

CREATE TABLE `simbolos` (
  `simbolo` varchar(2) NOT NULL,
  `tipo` varchar(25) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `simbolos`
--

INSERT INTO `simbolos` (`simbolo`, `tipo`, `descripcion`) VALUES
('#', 'especial', 'parada de control'),
('(', 'separador', 'abre parentesis'),
(')', 'separador', 'cierra parentesis'),
('*', 'operador', 'multiplicacion'),
('*\\', 'especial', 'usado en comentarios'),
('+', 'operador', 'suma'),
('-', 'operador', 'resta'),
('/', 'operador', 'division'),
('/*', 'especial', 'usado en comentarios'),
('0', 'numeros', 'todas los numeros'),
('1', 'numeros', 'todas los numeros'),
('2', 'numeros', 'todas los numeros'),
('3', 'numeros', 'todas los numeros'),
('4', 'numeros', 'todas los numeros'),
('5', 'numeros', 'todas los numeros'),
('6', 'numeros', 'todas los numeros'),
('7', 'numeros', 'todas los numeros'),
('8', 'numeros', 'todas los numeros'),
('9', 'numeros', 'todas los numeros'),
('=', 'especial', 'igualdad'),
('a', 'letra', 'todas las letras'),
('b', 'letra', 'todas las letras'),
('c', 'letra', 'todas las letras'),
('d', 'letra', 'todas las letras'),
('e', 'letra', 'todas las letras'),
('f', 'letra', 'todas las letras'),
('g', 'letra', 'todas las letras'),
('h', 'letra', 'todas las letras'),
('i', 'letra', 'todas las letras'),
('j', 'letra', 'todas las letras'),
('k', 'letra', 'todas las letras'),
('l', 'letra', 'todas las letras'),
('m', 'letra', 'todas las letras'),
('n', 'letra', 'todas las letras'),
('o', 'letra', 'todas las letras'),
('p', 'letra', 'todas las letras'),
('q', 'letra', 'todas las letras'),
('r', 'letra', 'todas las letras'),
('s', 'letra', 'todas las letras'),
('t', 'letra', 'todas las letras'),
('u', 'letra', 'todas las letras'),
('v', 'letra', 'todas las letras'),
('w', 'letra', 'todas las letras'),
('x', 'letra', 'todas las letras'),
('y', 'letra', 'todas las letras'),
('z', 'letra', 'todas las letras'),
('[', 'separador', 'abre corchetes'),
(']', 'separador', 'cierra corchetes'),
('^', 'operador', 'potencia'),
('{', 'separador', 'abre llaves'),
('}', 'separador', 'cierra llaves'),
('±', 'letra', 'todas las letras');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `palabras`
--
ALTER TABLE `palabras`
  ADD PRIMARY KEY (`nom_pb`);

--
-- Indices de la tabla `simbolos`
--
ALTER TABLE `simbolos`
  ADD PRIMARY KEY (`simbolo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
