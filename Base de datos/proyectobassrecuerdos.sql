-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2019 a las 08:28:29
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectobassrecuerdos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_bebida_venta`
--

CREATE TABLE `tb_bebida_venta` (
  `id_bebida_venta` int(11) NOT NULL,
  `id_venta_fk` int(11) NOT NULL,
  `id_trago_fk` int(11) NOT NULL,
  `cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_bebida_venta`
--

INSERT INTO `tb_bebida_venta` (`id_bebida_venta`, `id_venta_fk`, `id_trago_fk`, `cantidad`) VALUES
(38, 38, 28, 2),
(39, 38, 27, 3),
(40, 39, 27, 2),
(41, 39, 28, 2),
(42, 40, 25, 2),
(43, 40, 32, 3),
(44, 40, 28, 1),
(45, 41, 28, 4),
(46, 42, 28, 1),
(47, 43, 28, 4),
(48, 44, 28, 2),
(49, 45, 28, 5),
(50, 46, 28, 3),
(51, 47, 25, 2),
(52, 47, 31, 2),
(53, 48, 38, 1),
(54, 48, 31, 1),
(55, 48, 27, 1),
(56, 48, 50, 1),
(57, 49, 28, 1),
(58, 50, 32, 2),
(59, 50, 28, 2),
(60, 51, 101, 1),
(61, 52, 26, 1),
(62, 53, 28, 2),
(63, 54, 28, 1),
(64, 55, 28, 1),
(65, 56, 28, 1),
(66, 57, 28, 3),
(67, 58, 28, 3),
(68, 59, 29, 1),
(69, 59, 32, 2),
(70, 60, 28, 1),
(71, 61, 28, 3),
(72, 62, 28, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_equivalencia`
--

CREATE TABLE `tb_equivalencia` (
  `id_equivalencia` int(11) NOT NULL,
  `grupo_equivalencia` int(1) NOT NULL,
  `id_insumo_fk` int(11) NOT NULL,
  `peso_equivalencia` double NOT NULL,
  `peso_envase_equivalencia` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_equivalencia`
--

INSERT INTO `tb_equivalencia` (`id_equivalencia`, `grupo_equivalencia`, `id_insumo_fk`, `peso_equivalencia`, `peso_envase_equivalencia`) VALUES
(4, 0, 9, 541, 25),
(5, 0, 8, 541, 25),
(6, 0, 10, 545, 28),
(7, 0, 49, 3184, 65),
(8, 0, 11, 1000, 57),
(9, 0, 7, 1061, 40),
(10, 0, 67, 3153, 66),
(11, 1, 16, 449, 173),
(12, 1, 13, 729, 20),
(13, 1, 12, 1191, 479),
(14, 1, 68, 1760, 702),
(15, 1, 69, 1350, 614),
(16, 1, 17, 1304, 504),
(17, 0, 70, 222, 13),
(18, 0, 21, 3153, 66),
(19, 1, 31, 1227, 553),
(20, 1, 22, 1227, 553),
(21, 1, 71, 1213, 464),
(22, 1, 72, 1220, 464),
(23, 1, 14, 1504, 639),
(24, 1, 24, 1450, 511),
(25, 1, 27, 1454, 510),
(26, 1, 15, 1034, 41),
(27, 1, 73, 1378, 524),
(28, 1, 50, 1195, 433),
(29, 0, 58, 1204, 568),
(30, 1, 74, 1204, 568),
(31, 1, 52, 1111, 394),
(32, 1, 53, 1115, 383),
(33, 1, 62, 1183, 512),
(34, 1, 25, 1183, 512),
(35, 1, 29, 1742, 666),
(36, 1, 26, 1379, 435),
(37, 1, 19, 1370, 435),
(38, 1, 75, 1204, 425),
(39, 1, 76, 1383, 567),
(40, 1, 77, 1377, 567),
(41, 1, 28, 1192, 483),
(42, 1, 78, 1185, 475),
(43, 1, 23, 1265, 464),
(44, 1, 32, 1204, 494),
(45, 1, 46, 1280, 474),
(46, 1, 79, 1172, 474),
(47, 0, 80, 541, 25),
(48, 0, 18, 5077, 1353),
(49, 2, 37, 617, 227),
(50, 1, 81, 1172, 514),
(51, 0, 45, 1628, 51),
(52, 0, 33, 1138, 50),
(53, 1, 84, 1260, 433),
(54, 1, 85, 1179, 474),
(55, 1, 86, 1377, 567),
(56, 1, 87, 1377, 567),
(57, 1, 88, 1377, 567),
(58, 1, 89, 1455, 511),
(59, 0, 11, 469, 39),
(60, 1, 60, 1334, 433),
(61, 0, 90, 0, 0),
(62, 0, 20, 1271, 493),
(63, 0, 44, 1288, 553),
(64, 1, 91, 1379, 669),
(65, 1, 59, 1158, 450),
(66, 1, 47, 168, 9),
(67, 1, 93, 1596, 543),
(68, 1, 65, 1596, 543),
(69, 1, 94, 1086, 52),
(70, 1, 41, 1288, 553),
(71, 1, 39, 1390, 683),
(72, 1, 15, 1039, 42),
(73, 1, 42, 1228, 550),
(74, 1, 30, 1228, 550),
(75, 1, 34, 1288, 553),
(76, 1, 43, 1288, 553),
(77, 1, 95, 1457, 511),
(78, 0, 38, 12, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_insumo`
--

CREATE TABLE `tb_insumo` (
  `id_insumo` int(11) NOT NULL,
  `codigo_p__insumo` varchar(10) NOT NULL,
  `nombre__insumo` varchar(200) NOT NULL,
  `cantidad_insumo` double NOT NULL,
  `um_insumo` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_insumo`
--

INSERT INTO `tb_insumo` (`id_insumo`, `codigo_p__insumo`, `nombre__insumo`, `cantidad_insumo`, `um_insumo`) VALUES
(7, '0101010069', 'Selva Piña Jugo,1l', 16.4, 0),
(8, '0101010083', 'Coca Cola Gaseosa 500 Ml ', 0, 0),
(9, '0101010088', '7up Gaseosa 500 Ml', 24, 0),
(10, '0101010108', 'Schweppers Ginger Ale, 500 Ml', 41, 0),
(11, '0101010143', 'L\'onda Jugo Cranberry 500ml ', 15, 0),
(12, '0101020624', 'Ron capitan morgan 750 ml', 8, 0),
(13, '0101010074', 'Algarrobina Chuncho, 500 Ml', 8, 0),
(14, '0101010079', 'Cachaza Pirassununga 51,1l', 6, 0),
(15, '0101010084', 'Clos Pirque Vino Blanco 1l', 0, 0),
(16, '0101010089', 'Selva Crema De Coco 200 Gr', 17.5, 0),
(17, '0101010094', 'Baileys Crema De Whisky, 750 Ml', 10, 0),
(18, '0101020619', 'Ocucaje Pisco Puro Quebranta , 4 L', 88, 0),
(19, '0101010109', 'La Esperanza Jarabe De Granadina 750ml', 6.8, 0),
(20, '0101020210', 'Malibu Ron De Coco 750 Ml', 2, 0),
(21, '0101010168', 'Cifrut Naranja Jugo, 3l', 550.7, 0),
(22, '0101020246', 'Bardinet Sour Apple 700 Ml ', 4, 0),
(23, '0101020261', 'Poblete Crema De Menta 750 Ml', 0.05, 0),
(24, '0101020281', 'Cartavio Black 2 Años Ron,1l ', 30, 0),
(25, '0101020291', 'Jose Cuervo Silver Tequila 750 Ml', 8.5, 0),
(26, '0101020306', 'La Esperanza Jarabe De Goma 750 Ml', 95.3, 0),
(27, '0101020311', 'Cartavio Superior Blanco Ron,1L', 25.5, 0),
(28, '0101020326', 'Old Times Red Whisky 750 Ml', 6, 0),
(29, '0101020336', 'Kahlua Licor 980ml', 7.5, 0),
(30, '0101020395', 'Marie Brizard Perfecto Amor 700ml ', 2.5, 0),
(31, '0101020341', 'Bardinet Peach 700 Ml', 1.5, 0),
(32, '0101020346', 'Russkaya Vodka 750 Ml', 17, 0),
(33, '0101020390', 'Wislan Jarabe De Lima, 1l', 0.5, 0),
(34, '0101020466', 'Bardinet Curacao Blue 700 Ml', 4, 0),
(35, '0101030016', 'Marrasquino', 3, 1),
(36, '0101030021', 'Piña En Rodajas', 18, 1),
(37, '0101030078', 'Leche En Tarro', 39, 0),
(38, '65654654', 'Durazno Al Natural', 10, 1),
(39, '0101010158', 'Antagonic Gin 750 Ml ', 1.5, 0),
(40, '0101020435', 'Clos Pirque Vino Tinto 1L', 360, 0),
(41, '0101020483', 'Bardinet Amareto 700 Ml ', 6, 0),
(42, '0101020482', 'Bardinet Triple Sec 700ML', 1, 0),
(43, '0101020529', 'Bardinet Cacao 700 Ml', 2, 0),
(44, '0101020471', 'Bardinet Banane 700 Ml', 0, 0),
(45, '0101010163', 'Nordica Ginger Ale,1.5 L', 0, 0),
(46, '0101020321', 'S.Queirolo Masco De Ciruela 750 Ml ', 0, 0),
(47, '0101010138', 'Britvic Agua Tonica 150Ml', 0, 0),
(48, '0101020307', 'Zumo de maracuya (jugo puro sin agua)', 0, 0),
(49, '0101010064', 'Fanta Gaseosa,3L ', 0, 0),
(50, '0101020356', 'E.Copello Vino Borgoña 750 Ml', 0, 0),
(51, '0101020554', 'Vino Blanco 750Ml', 0, 0),
(52, '0101020296', 'J.Walker Black Label Whisky 750 Ml', 0, 0),
(53, '0101020301', 'J.Walker Red Label Whisky, 750 Ml', 0, 0),
(54, '0101020559', 'Appleton Special Ron, 750 Ml', 0, 0),
(55, '0101020503', 'Havana Club Añejo Especial 750Ml', 0, 0),
(57, '0101020425', 'Bacardi Añejo Ron 750 Ml ', 0, 0),
(58, '0101020508', 'Flor De Caña 4 Años Ron 750Ml ', 0, 0),
(59, '0101020410', 'Smirnoff Red Vodka Botella 750 Ml', 0, 0),
(60, '0101020415', 'Absolut Vodka 750 Ml', 0, 0),
(62, '0101020286', 'Jose Cuervo Reposado Tequila 750 Ml', 2, 0),
(63, '0101020634', 'Bols Triple Sec, 700 Ml', 98, 0),
(64, '0101020400', 'Drambuie Licor De Whisky 750 ML', 0, 0),
(65, '0101020455', 'Martini Rosso Vermouth 995ML', 0, 0),
(67, '0101010078', 'Tampico Citrus Jugo, 3l', 0, 0),
(68, '0101020331', 'Anis Del Mono Español Rojo,1 L', 0, 0),
(69, '0101020276', 'Bacardi Limon Ron, 750 Ml ', 0, 0),
(70, '0101030105', 'Petit Manzana 200 Gr', 0, 0),
(71, '0101020251', 'Bols Amaretto, 700 Ml ', 0, 0),
(72, '0101020316', 'Bols Curacao Blue 700 Ml', 0, 0),
(73, '0101010099', 'Crema Valquiria De Guindas X 750 Ml', 0, 0),
(74, '0101020361', 'Flor De Caña 7 Años 750 Ml ', 0, 0),
(75, '0101020351', 'Marmara Maracuya 750 Ml', 0, 0),
(76, '0101020256', 'Mitjans Cacao, 700 Ml', 0, 0),
(77, '0101020266', 'Mitjans Triple Sec 700 Ml', 0, 0),
(78, '0101010104', 'Paramonga Gin, 750 Ml', 0, 0),
(79, '0101020271', 'S.queirolo Pisco Quebranta 750 Ml', 0, 0),
(80, '0101010118', 'Evervess Ging Ale 500 Ml ', 0, 0),
(81, '0101020375', 'Cafe Colombia 700 Ml ', 25, 0),
(84, '0101020378', 'La Castañeda Algarrobina 750ml ', 25, 0),
(85, '0101020380', 'S.queirolo Macerado Pisco Maracuya 750ml', 25, 0),
(86, '0101020372', 'Mitjans Amareto 700 Ml', 23.3, 0),
(87, '0101020373', 'Mitjans Curacao Blue 700 Ml', 23.3, 0),
(88, '0101020385', 'Mitjans Menta 700 Ml', 23.3, 0),
(89, '0101020549', 'Macerado De Pisco 1l Maracuya', 33.3, 0),
(90, '0101010148', 'San Luis Agua Con Gas 625ml', 20.8, 0),
(91, '0101020220', 'Cointreau Licor 750 Ml', 25, 0),
(93, '0101020465', 'Martini Extra Dry Vermouth 995ml ', 33.2, 0),
(94, '0101010153', 'Gloria Piña Jugo 1l', 33.3, 0),
(95, '0101020569', 'Macerado Yerba Buena 1l', 33.3, 0),
(97, '8888888888', 'INSUMO DE PRUEBA', 90, 2),
(98, '1111111111', 'Limón', 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_insumo_vendido`
--

CREATE TABLE `tb_insumo_vendido` (
  `id_insumo_vendido` int(11) NOT NULL,
  `id_insumo_fk` int(11) NOT NULL,
  `cantidad_insumo_vendido` double NOT NULL,
  `um_insumo_vendido` int(1) NOT NULL,
  `dia_insumo_vendido` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_insumo_vendido`
--

INSERT INTO `tb_insumo_vendido` (`id_insumo_vendido`, `id_insumo_fk`, `cantidad_insumo_vendido`, `um_insumo_vendido`, `dia_insumo_vendido`) VALUES
(1, 21, 33.33, 0, '2019-10-12'),
(2, 21, 33.33, 0, '2019-10-12'),
(3, 21, 33.33, 0, '2019-10-12'),
(4, 21, 99.99, 0, '2019-10-12'),
(5, 21, 99.99, 0, '2019-10-12'),
(7, 19, 0.75, 0, '2019-10-12'),
(8, 27, 0.5, 0, '2019-10-12'),
(9, 30, 0.5, 0, '2019-10-12'),
(10, 7, 2, 0, '2019-10-12'),
(11, 25, 1, 0, '2019-10-12'),
(12, 32, 1, 0, '2019-10-12'),
(14, 19, 1.5, 0, '2019-10-12'),
(15, 23, 1.5, 0, '2019-10-12'),
(16, 18, 3, 0, '2019-10-12'),
(17, 21, 33.33, 0, '2019-10-12'),
(18, 21, 99.99, 0, '2019-10-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_receta`
--

CREATE TABLE `tb_receta` (
  `id_receta` int(11) NOT NULL,
  `id_trago_fk` int(11) NOT NULL,
  `id_insumo_fk` int(11) NOT NULL,
  `um_receta` int(1) DEFAULT '0',
  `cantidad_receta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_receta`
--

INSERT INTO `tb_receta` (`id_receta`, `id_trago_fk`, `id_insumo_fk`, `um_receta`, `cantidad_receta`) VALUES
(9, 56, 23, 0, 2),
(10, 47, 16, 0, 1.5),
(11, 47, 20, 0, 1),
(12, 47, 27, 0, 1.5),
(13, 47, 7, 0, 2),
(14, 47, 44, 0, 0.25),
(15, 47, 36, 0, 1),
(16, 40, 12, 0, 2),
(17, 34, 17, 0, 1.5),
(18, 34, 29, 0, 1),
(19, 34, 41, 0, 0.5),
(20, 34, 37, 0, 1.5),
(21, 34, 26, 0, 0.5),
(22, 57, 19, 0, 0.75),
(23, 57, 21, 0, 3.5),
(24, 57, 34, 0, 0.5),
(25, 57, 18, 0, 1),
(26, 58, 18, 0, 6),
(27, 58, 45, 0, 20),
(28, 58, 26, 0, 1),
(29, 29, 21, 0, 4),
(30, 29, 19, 0, 0.75),
(31, 29, 27, 0, 0.5),
(32, 29, 30, 0, 0.5),
(33, 29, 7, 0, 2),
(34, 29, 25, 0, 1),
(35, 29, 32, 0, 1),
(36, 32, 21, 0, 6),
(37, 32, 19, 0, 0.75),
(38, 32, 23, 0, 0.75),
(39, 32, 18, 0, 1.5),
(40, 37, 16, 0, 1.5),
(41, 37, 7, 0, 4),
(42, 37, 36, 0, 2),
(43, 37, 37, 0, 0.5),
(44, 59, 26, 0, 1),
(45, 59, 38, 0, 2),
(46, 60, 37, 0, 2),
(47, 60, 16, 0, 1.5),
(48, 60, 26, 0, 0.5),
(49, 35, 18, 0, 2.5),
(50, 35, 26, 0, 1.5),
(51, 27, 18, 0, 3),
(52, 27, 26, 0, 2),
(53, 61, 46, 0, 3),
(54, 61, 26, 0, 1),
(55, 45, 16, 0, 1.5),
(56, 45, 26, 0, 0.5),
(57, 45, 18, 0, 1.5),
(58, 45, 35, 0, 1),
(59, 45, 37, 0, 3),
(60, 53, 11, 0, 3),
(61, 53, 32, 0, 1.5),
(62, 53, 19, 0, 0.5),
(63, 53, 33, 0, 0.5),
(64, 53, 42, 0, 0.5),
(65, 43, 22, 0, 2),
(66, 43, 32, 0, 1.5),
(67, 63, 25, 0, 2),
(68, 63, 26, 0, 1),
(69, 63, 42, 0, 0.5),
(70, 44, 14, 0, 3),
(71, 52, 17, 0, 1),
(72, 52, 41, 0, 1),
(73, 52, 29, 0, 1.5),
(74, 64, 34, 0, 1),
(75, 64, 23, 0, 1.5),
(76, 64, 37, 0, 2),
(77, 30, 13, 0, 1),
(78, 30, 43, 0, 0.25),
(79, 30, 18, 0, 1.5),
(80, 30, 26, 0, 0.75),
(81, 30, 37, 0, 2.5),
(82, 65, 11, 0, 4),
(83, 65, 21, 0, 3),
(84, 65, 7, 0, 2),
(85, 66, 47, 0, 5),
(86, 66, 39, 0, 2),
(87, 67, 8, 0, 6),
(88, 67, 18, 0, 2),
(89, 51, 18, 0, 2),
(90, 51, 26, 0, 0.5),
(91, 51, 10, 0, 6),
(92, 51, 35, 0, 1),
(93, 33, 10, 0, 5),
(94, 33, 18, 0, 2.5),
(95, 33, 48, 0, 0.75),
(96, 33, 26, 0, 0.75),
(97, 68, 7, 0, 2),
(98, 68, 21, 0, 4),
(99, 68, 42, 0, 0.5),
(100, 68, 19, 0, 0.5),
(101, 68, 18, 0, 2),
(102, 50, 8, 0, 6),
(103, 50, 24, 0, 2),
(104, 69, 41, 0, 0.5),
(105, 69, 7, 0, 6),
(106, 69, 19, 0, 0.5),
(107, 69, 24, 0, 1),
(108, 69, 27, 0, 1),
(109, 39, 9, 0, 6),
(110, 39, 27, 0, 2),
(111, 48, 7, 0, 2),
(112, 48, 16, 0, 1),
(113, 48, 27, 0, 1.5),
(114, 48, 34, 0, 1),
(115, 48, 36, 0, 2),
(116, 48, 37, 0, 0.5),
(117, 38, 16, 0, 1.5),
(118, 38, 7, 0, 2),
(119, 38, 26, 0, 0.5),
(120, 38, 27, 0, 8),
(121, 38, 36, 0, 2),
(122, 38, 37, 0, 0.5),
(123, 36, 24, 0, 2),
(124, 36, 26, 0, 1),
(125, 36, 38, 0, 2),
(126, 70, 26, 0, 2),
(127, 70, 27, 0, 2),
(128, 54, 21, 0, 7),
(129, 54, 42, 0, 0.5),
(130, 54, 19, 0, 1),
(131, 54, 25, 0, 2),
(132, 71, 47, 0, 2),
(133, 71, 32, 0, 2),
(134, 41, 11, 0, 4),
(135, 41, 7, 0, 2),
(136, 41, 31, 0, 0.5),
(137, 41, 32, 0, 2),
(138, 41, 19, 0, 0.5),
(139, 72, 8, 0, 4),
(140, 72, 39, 0, 0.5),
(141, 72, 42, 0, 0.5),
(142, 72, 24, 0, 0.5),
(143, 72, 25, 0, 0.5),
(144, 72, 32, 0, 0.5),
(145, 42, 7, 0, 6),
(146, 42, 25, 0, 0.5),
(147, 42, 27, 0, 1.5),
(148, 42, 39, 0, 0.5),
(149, 42, 32, 0, 0.5),
(150, 42, 34, 0, 1),
(151, 42, 26, 0, 0.5),
(152, 73, 49, 0, 8),
(153, 73, 19, 0, 1),
(154, 73, 18, 0, 3),
(155, 73, 50, 0, 13.33),
(156, 74, 21, 0, 7),
(157, 31, 7, 0, 13.3),
(158, 31, 15, 0, 12),
(159, 31, 18, 0, 3),
(160, 31, 26, 0, 2),
(161, 75, 51, 0, 11.5),
(162, 75, 7, 0, 16),
(163, 75, 18, 0, 3),
(164, 75, 26, 0, 2),
(165, 76, 52, 0, 2),
(166, 77, 53, 0, 2),
(167, 78, 8, 0, 6),
(168, 78, 54, 0, 2),
(169, 79, 55, 0, 6),
(170, 79, 8, 0, 2),
(171, 80, 8, 0, 6),
(172, 80, 57, 0, 2),
(173, 81, 8, 0, 6),
(174, 81, 58, 0, 2),
(175, 82, 21, 0, 6),
(176, 82, 59, 0, 2),
(177, 82, 60, 0, 2),
(178, 83, 17, 0, 2),
(179, 84, 62, 0, 2),
(180, 84, 25, 0, 2),
(181, 85, 19, 0, 0.5),
(182, 85, 26, 0, 2),
(183, 28, 21, 0, 33.33),
(184, 25, 21, 0, 10),
(185, 25, 18, 0, 1),
(186, 25, 24, 0, 1),
(187, 25, 26, 0, 2.5),
(188, 25, 15, 0, 15),
(189, 25, 63, 0, 0.5),
(190, 55, 21, 0, 8.33),
(191, 87, 28, 0, 2),
(192, 87, 64, 0, 1),
(193, 46, 28, 0, 2),
(194, 46, 41, 0, 1),
(195, 49, 28, 0, 2),
(196, 49, 65, 0, 1),
(197, 101, 97, 0, 2),
(198, 26, 97, 0, 2),
(200, 26, 98, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_trago`
--

CREATE TABLE `tb_trago` (
  `id_trago` int(11) NOT NULL,
  `descripcion_trago` varchar(255) NOT NULL,
  `id_cod_trago` varchar(10) NOT NULL,
  `unidadmd_trago` int(1) NOT NULL,
  `cantidad_trago` double DEFAULT NULL,
  `costo_trago` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_trago`
--

INSERT INTO `tb_trago` (`id_trago`, `descripcion_trago`, `id_cod_trago`, `unidadmd_trago`, `cantidad_trago`, `costo_trago`) VALUES
(25, 'SANGRIA ESPAÑOLA', 'T084', 0, 24, 15),
(26, 'SHOT  DE LIMON', 'T113', 0, 14, 10),
(27, 'PISCO SOUR', 'T014', 0, 13, 14),
(28, 'JUGO DE NARANJA 1L', 'T110', 0, 11, 5),
(29, 'AMOR EN LLAMAS', 'T002', 0, 10, 13),
(30, 'COCTEL ALGARROBINA', 'T001', 0, 8, 0),
(31, 'SANGRIA TROPICAL', 'T016', 0, 7, 10),
(32, 'MACHU PICCHU', 'T011', 0, 7, 14),
(33, 'CHILCANO DE MARACUYA ', 'T068', 0, 7, 0),
(34, 'SEXI RECUERDOS', 'T054', 0, 6, 0),
(35, 'MARACUYA SOUR', 'T012', 0, 5, 0),
(36, 'DAIQUIRI DE DURAZNO', 'T009', 0, 5, 0),
(37, 'PIÑA COLADA VIRGEN', 'T032', 0, 4, 0),
(38, 'PIÑA COLADA', 'T013', 0, 4, 12),
(39, 'MOJITO CUBANO', 'T021', 0, 4, 0),
(40, 'BOMBAZO RECUERDOS', 'T700', 0, 4, 0),
(41, 'SEX ON THE BEACH', 'T022', 0, 3, 0),
(42, 'PISCINA ', 'T079', 0, 3, 0),
(43, 'APPLE MARTINI', 'T017', 0, 2, 0),
(44, 'CAIPIRINHA', 'T004', 0, 2, 17),
(45, 'COCO AMOROSO', 'T006', 0, 2, 10),
(46, 'PADRINO', 'T048', 0, 2, 13),
(47, 'PIÑA COLADA TROPICAL ', 'T109', 0, 2, 0),
(48, 'HAWAIANA AZUL', 'T090', 0, 1, 10),
(49, 'MANHATTAN', 'T053', 0, 1, 19),
(50, 'CUBA LIBRE', 'T070', 0, 1, 11),
(51, 'CHILCANO DE PISCO ', 'T005', 0, 1, 0),
(52, 'ORGASMO ', 'T018', 0, 1, 0),
(53, 'COSMOPOLITAN', 'T025', 0, 1, 0),
(54, 'TEQUILA SUNRISE ', 'T023', 0, 1, 0),
(55, 'ROBLE VINO TINTO 750ML', '11569893', 0, 23, 0),
(56, 'MENTA FRAPEE', 'T063', 0, 0, 12),
(57, 'TRAGO SIRENA RECUERDOS', 'T22222', 0, 0, 0),
(58, 'JARRA DE PISCO FROZEN', 'T999999', 0, 0, 0),
(59, 'DAIQUIRI DE DURAZNO VIRGEN', 'T033', 0, 0, 0),
(60, 'SWEET SIXTEEN', 'T078', 0, 0, 0),
(61, 'MASCO SOUR', 'T027', 0, 0, 0),
(63, 'MARGARITA', 'T046', 0, 0, 0),
(64, 'GRASSHOPER', 'T056', 0, 0, 0),
(65, 'BAHÍA TROPIC', 'T030', 0, 0, 0),
(66, 'GIN TONIC', 'T064', 0, 0, 0),
(67, 'PERÚ LIBRE', 'T067', 0, 0, 0),
(68, 'PRIMAVERA', 'T069', 0, 0, 0),
(69, 'MAI TAI', 'T020', 0, 0, 0),
(70, 'DAIQUIRI DE LIMÓN', 'T107', 0, 0, 0),
(71, 'LIMOSINA', 'T073', 0, 0, 0),
(72, 'LONG ISLAND ICE TEA ', 'T028', 0, 0, 0),
(73, 'SANGRÍA BORGOÑA', 'T031', 0, 0, 0),
(74, 'VARQUIRIA SANGRÍA', 'V001', 0, 0, 0),
(75, 'SANGRÍA VINO BLANCO', 'T111', 0, 0, 0),
(76, 'J.WALKER BLACK LABEL', 'T007', 0, 0, 0),
(77, 'WHISKY J.WALKER RED', 'T008', 0, 0, 0),
(78, 'RON APPLETON SPECIAL', 'T116', 0, 0, 0),
(79, 'RON HAVANA AÑEJO', 'T096', 0, 0, 0),
(80, 'RON BACARDI', 'T097', 0, 0, 0),
(81, 'RON FLOR DE CAÑA 4', 'T098', 0, 0, 0),
(82, 'VODKA SMIRNOFF', 'T103', 0, 0, 0),
(83, 'BAILEYS', 'T003', 0, 0, 0),
(84, 'TEQUILA JOSE CUERVO REPOSADO ', 'T105', 0, 0, 0),
(85, 'LIMONADA FROZEN', 'T010', 0, 0, 0),
(87, 'RUSTY NAIL', 'T062', 0, 0, 0),
(98, 'FRE', 'T055', 0, 7, 777),
(99, 'FRA', '3423432432', 0, 11, 12),
(101, 'BEBIDA DE PRUEBA', 'T62736237', 0, 10, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `id_usuario` int(11) NOT NULL,
  `cuenta_usuario` varchar(40) NOT NULL,
  `contra_usuario` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_usuario`
--

INSERT INTO `tb_usuario` (`id_usuario`, `cuenta_usuario`, `contra_usuario`) VALUES
(1, 'luis22', 'felipe968389881');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_venta`
--

CREATE TABLE `tb_venta` (
  `id_venta` int(11) NOT NULL,
  `codigo_venta` varchar(10) NOT NULL,
  `total_venta` double NOT NULL,
  `fecha_venta` date NOT NULL,
  `hora_venta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_venta`
--

INSERT INTO `tb_venta` (`id_venta`, `codigo_venta`, `total_venta`, `fecha_venta`, `hora_venta`) VALUES
(38, '0000000002', 52, '2019-09-27', '00:12'),
(39, '0000000001', 38, '2019-09-27', '02:10'),
(40, '0000000003', 77, '2019-09-26', '02:15'),
(41, '0000000004', 20, '2019-09-27', '03:41'),
(42, '0000000005', 5, '2019-09-27', '03:50'),
(43, '0000000006', 20, '2019-09-27', '03:51'),
(44, '0000000007', 10, '2019-09-27', '03:52'),
(45, '0000000008', 25, '2019-09-27', '04:03'),
(46, '0000000009', 15, '2019-09-27', '04:22'),
(47, '0000000010', 50, '2019-09-28', '23:26'),
(48, '0000000011', 47, '2019-09-30', '10:45'),
(49, '0000000012', 5, '2019-10-02', '11:08'),
(50, '0000000013', 38, '2019-10-02', '12:55'),
(51, '0000000014', 9, '2019-10-07', '00:05'),
(52, '0000000015', 10, '2019-10-07', '09:40'),
(53, '0000000016', 10, '2019-10-13', '01:24'),
(54, '0000000017', 5, '2019-10-13', '01:27'),
(55, '0000000018', 5, '2019-10-13', '01:28'),
(56, '0000000019', 5, '2019-10-13', '01:29'),
(57, '0000000020', 15, '2019-10-13', '01:34'),
(58, '0000000021', 15, '2019-10-13', '01:36'),
(59, '0000000022', 41, '2019-10-13', '01:36'),
(60, '0000000023', 5, '2019-10-13', '17:03'),
(61, '0000000024', 15, '2019-10-13', '18:55'),
(62, '0000000025', 15, '2019-10-13', '18:56');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_bebida_venta`
--
ALTER TABLE `tb_bebida_venta`
  ADD PRIMARY KEY (`id_bebida_venta`),
  ADD KEY `id_trago_fk` (`id_trago_fk`),
  ADD KEY `id_venta_fk` (`id_venta_fk`);

--
-- Indices de la tabla `tb_equivalencia`
--
ALTER TABLE `tb_equivalencia`
  ADD PRIMARY KEY (`id_equivalencia`),
  ADD KEY `id_insumo_fk` (`id_insumo_fk`);

--
-- Indices de la tabla `tb_insumo`
--
ALTER TABLE `tb_insumo`
  ADD PRIMARY KEY (`id_insumo`),
  ADD UNIQUE KEY `codigo_p__insumo` (`codigo_p__insumo`);

--
-- Indices de la tabla `tb_insumo_vendido`
--
ALTER TABLE `tb_insumo_vendido`
  ADD PRIMARY KEY (`id_insumo_vendido`),
  ADD KEY `id_insumo_fk` (`id_insumo_fk`);

--
-- Indices de la tabla `tb_receta`
--
ALTER TABLE `tb_receta`
  ADD PRIMARY KEY (`id_receta`),
  ADD KEY `id_trago_fk` (`id_trago_fk`),
  ADD KEY `id_insumo_fk` (`id_insumo_fk`);

--
-- Indices de la tabla `tb_trago`
--
ALTER TABLE `tb_trago`
  ADD PRIMARY KEY (`id_trago`),
  ADD UNIQUE KEY `id_cod_trago` (`id_cod_trago`);

--
-- Indices de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `tb_venta`
--
ALTER TABLE `tb_venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD UNIQUE KEY `codigo_venta` (`codigo_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_bebida_venta`
--
ALTER TABLE `tb_bebida_venta`
  MODIFY `id_bebida_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT de la tabla `tb_equivalencia`
--
ALTER TABLE `tb_equivalencia`
  MODIFY `id_equivalencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT de la tabla `tb_insumo`
--
ALTER TABLE `tb_insumo`
  MODIFY `id_insumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=99;

--
-- AUTO_INCREMENT de la tabla `tb_insumo_vendido`
--
ALTER TABLE `tb_insumo_vendido`
  MODIFY `id_insumo_vendido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `tb_receta`
--
ALTER TABLE `tb_receta`
  MODIFY `id_receta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT de la tabla `tb_trago`
--
ALTER TABLE `tb_trago`
  MODIFY `id_trago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tb_venta`
--
ALTER TABLE `tb_venta`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_bebida_venta`
--
ALTER TABLE `tb_bebida_venta`
  ADD CONSTRAINT `tb_bebida_venta_ibfk_1` FOREIGN KEY (`id_trago_fk`) REFERENCES `tb_trago` (`id_trago`),
  ADD CONSTRAINT `tb_bebida_venta_ibfk_2` FOREIGN KEY (`id_venta_fk`) REFERENCES `tb_venta` (`id_venta`) ON DELETE CASCADE;

--
-- Filtros para la tabla `tb_equivalencia`
--
ALTER TABLE `tb_equivalencia`
  ADD CONSTRAINT `tb_equivalencia_ibfk_1` FOREIGN KEY (`id_insumo_fk`) REFERENCES `tb_insumo` (`id_insumo`);

--
-- Filtros para la tabla `tb_insumo_vendido`
--
ALTER TABLE `tb_insumo_vendido`
  ADD CONSTRAINT `tb_insumo_vendido_ibfk_1` FOREIGN KEY (`id_insumo_fk`) REFERENCES `tb_insumo` (`id_insumo`);

--
-- Filtros para la tabla `tb_receta`
--
ALTER TABLE `tb_receta`
  ADD CONSTRAINT `tb_receta_ibfk_1` FOREIGN KEY (`id_trago_fk`) REFERENCES `tb_trago` (`id_trago`),
  ADD CONSTRAINT `tb_receta_ibfk_2` FOREIGN KEY (`id_insumo_fk`) REFERENCES `tb_insumo` (`id_insumo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
