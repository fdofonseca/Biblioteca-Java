-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2018 a las 03:03:12
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arriendo`
--

CREATE TABLE `arriendo` (
  `id_arriendo` int(11) NOT NULL,
  `numero_serie` int(11) NOT NULL,
  `fecha_arriendo` date NOT NULL,
  `fecha_estimada_dev` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `fecha_entrega` date NOT NULL,
  `dias_retraso` int(11) NOT NULL,
  `multa` int(11) NOT NULL,
  `rut` varchar(12) NOT NULL,
  `rut_trabajador` varchar(12) NOT NULL,
  `costo_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `nombre_autor` varchar(20) NOT NULL,
  `apellido_p` varchar(20) NOT NULL,
  `apellido_m` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `folio` int(11) NOT NULL,
  `precio_neto` int(11) NOT NULL,
  `costo_iva` int(11) NOT NULL,
  `precio_iva` int(11) NOT NULL,
  `fecha_venta` date NOT NULL,
  `hora_venta` varchar(5) NOT NULL,
  `Metodo_pago` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `nombre_categoria` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `rut` varchar(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido_p` varchar(20) NOT NULL,
  `apellido_m` varchar(20) NOT NULL,
  `fecha_nacto` date NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`rut`, `nombre`, `apellido_p`, `apellido_m`, `fecha_nacto`, `correo`) VALUES
('123456', 'Carlos', 'jkhjk', '7676', '1997-05-05', ''),
('193303188', 'Fernando ', 'Fonseca', 'Cofre', '2018-05-02', ''),
('67678', 'Juan', 'jkhjkhjk', '8789', '2000-08-20', 'yui');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id_compra` int(11) NOT NULL,
  `numero_serie` int(11) NOT NULL,
  `rut_empresa` varchar(12) NOT NULL,
  `factura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

CREATE TABLE `distribuidor` (
  `rut_empresa` varchar(12) NOT NULL,
  `nombre_empresa` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Año_servicio` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `distribuidor`
--

INSERT INTO `distribuidor` (`rut_empresa`, `nombre_empresa`, `direccion`, `Telefono`, `Año_servicio`) VALUES
('12312423', 'Cacao', 'fwefewr', 34545345, '2018-05-09'),
('193303188', 'Chocapic', 'sdfsdf', 435435, '1997-05-20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `folio` int(11) NOT NULL,
  `rut_empresa` varchar(12) NOT NULL,
  `precio_iva` int(11) NOT NULL,
  `fecha_compra` date NOT NULL,
  `hora_compra` varchar(5) NOT NULL,
  `precio_neto` int(11) NOT NULL,
  `Metodo_pago` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `numero_serie` int(11) NOT NULL,
  `ISBM` int(11) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Numero_paguinas` int(11) NOT NULL,
  `Precio_ref` int(11) NOT NULL,
  `Año_publicacion` int(11) NOT NULL,
  `Idioma` varchar(11) NOT NULL,
  `Editorial` varchar(11) NOT NULL,
  `Autor` varchar(30) NOT NULL,
  `Categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`numero_serie`, `ISBM`, `Titulo`, `Numero_paguinas`, `Precio_ref`, `Año_publicacion`, `Idioma`, `Editorial`, `Autor`, `Categoria`) VALUES
(1, 1, 'Papelucho', 45, 10000, 2000, 'Español', 'Mella', 'Marcela Paz', 'Infantil'),
(2, 1, 'wrewr', 32, 23, 232, 'wer', 'rew', 'wer', 'werwer');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_autor`
--

CREATE TABLE `lista_autor` (
  `id_lista` int(11) NOT NULL,
  `numero_serie` int(11) NOT NULL,
  `id_autor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_correo`
--

CREATE TABLE `lista_correo` (
  `id_lista_c` int(11) NOT NULL,
  `rut` varchar(12) NOT NULL,
  `correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_telefono`
--

CREATE TABLE `lista_telefono` (
  `id_lista_t` int(11) NOT NULL,
  `rut` varchar(12) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_categoria`
--

CREATE TABLE `tipo_categoria` (
  `id_tipo_categoria` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `numero_serie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `rut_trabajador` varchar(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido_p` varchar(20) NOT NULL,
  `apellido_m` varchar(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` int(11) NOT NULL,
  `inicio_contrato` date NOT NULL,
  `direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`rut_trabajador`, `nombre`, `apellido_p`, `apellido_m`, `correo`, `telefono`, `inicio_contrato`, `direccion`) VALUES
('123123', 'weqwe', 'qweqwe', 'qwewqe', 'esdfsdfsd', 34567, '2000-12-12', 'qweqwe'),
('193303188', 'Fernando', 'Fonseca', 'Cofre', 'fdo.fonseca97@gmail.com', 971919673, '2018-05-09', ''),
('193303189', 'Fernando', 'Fonseca', 'Cofre', 'fdosdfdss', 9654, '1997-07-20', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id_venta` int(11) NOT NULL,
  `rut` varchar(12) NOT NULL,
  `rut_trabajador` varchar(12) NOT NULL,
  `folio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD PRIMARY KEY (`id_arriendo`),
  ADD KEY `rut` (`rut`),
  ADD KEY `rut_trabajador` (`rut_trabajador`);

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`folio`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `numero_serie` (`numero_serie`),
  ADD KEY `factura` (`factura`),
  ADD KEY `rut_empresa` (`rut_empresa`);

--
-- Indices de la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`rut_empresa`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`folio`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`numero_serie`);

--
-- Indices de la tabla `lista_autor`
--
ALTER TABLE `lista_autor`
  ADD PRIMARY KEY (`id_lista`),
  ADD KEY `id_autor` (`id_autor`),
  ADD KEY `numero_serie` (`numero_serie`);

--
-- Indices de la tabla `lista_correo`
--
ALTER TABLE `lista_correo`
  ADD PRIMARY KEY (`id_lista_c`),
  ADD KEY `rut` (`rut`);

--
-- Indices de la tabla `lista_telefono`
--
ALTER TABLE `lista_telefono`
  ADD PRIMARY KEY (`id_lista_t`),
  ADD KEY `rut` (`rut`);

--
-- Indices de la tabla `tipo_categoria`
--
ALTER TABLE `tipo_categoria`
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `numero_serie` (`numero_serie`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`rut_trabajador`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `folio` (`folio`),
  ADD KEY `rut` (`rut`),
  ADD KEY `rut_trabajador` (`rut_trabajador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arriendo`
--
ALTER TABLE `arriendo`
  MODIFY `id_arriendo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD CONSTRAINT `arriendo_ibfk_1` FOREIGN KEY (`rut`) REFERENCES `cliente` (`rut`),
  ADD CONSTRAINT `arriendo_ibfk_2` FOREIGN KEY (`rut_trabajador`) REFERENCES `trabajadores` (`rut_trabajador`);

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`numero_serie`) REFERENCES `libro` (`numero_serie`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`factura`) REFERENCES `factura` (`folio`),
  ADD CONSTRAINT `compra_ibfk_3` FOREIGN KEY (`rut_empresa`) REFERENCES `distribuidor` (`rut_empresa`);

--
-- Filtros para la tabla `lista_autor`
--
ALTER TABLE `lista_autor`
  ADD CONSTRAINT `lista_autor_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`),
  ADD CONSTRAINT `lista_autor_ibfk_2` FOREIGN KEY (`numero_serie`) REFERENCES `libro` (`numero_serie`);

--
-- Filtros para la tabla `lista_correo`
--
ALTER TABLE `lista_correo`
  ADD CONSTRAINT `lista_correo_ibfk_1` FOREIGN KEY (`rut`) REFERENCES `cliente` (`rut`);

--
-- Filtros para la tabla `lista_telefono`
--
ALTER TABLE `lista_telefono`
  ADD CONSTRAINT `lista_telefono_ibfk_1` FOREIGN KEY (`rut`) REFERENCES `cliente` (`rut`);

--
-- Filtros para la tabla `tipo_categoria`
--
ALTER TABLE `tipo_categoria`
  ADD CONSTRAINT `tipo_categoria_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`),
  ADD CONSTRAINT `tipo_categoria_ibfk_2` FOREIGN KEY (`numero_serie`) REFERENCES `libro` (`numero_serie`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`folio`) REFERENCES `boleta` (`folio`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`rut`) REFERENCES `cliente` (`rut`),
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`rut_trabajador`) REFERENCES `trabajadores` (`rut_trabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
