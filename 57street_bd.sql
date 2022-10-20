-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 20-10-2022 a las 08:05:19
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `57street`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `ID_COMPRA` int(11) NOT NULL,
  `FECHA_COMPRA` date NOT NULL,
  `VALOR_TOTAL` decimal(10,0) NOT NULL,
  `ID_USUARIO_CLIENTE` int(11) NOT NULL,
  `ID_USUARIO_VENDEDOR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra_pago`
--

CREATE TABLE `compra_pago` (
  `ID_COMPRA_PAGO` int(11) NOT NULL,
  `NUMERO_COMPROBANTE` int(11) NOT NULL,
  `VALOR` decimal(10,0) NOT NULL,
  `ID_COMPRA` int(11) NOT NULL,
  `ID_TIPO_FORMA_PAGO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE `detalle_compra` (
  `ID_DETALLE_COMPRA` int(11) NOT NULL,
  `VALOR_TOTAL` decimal(10,0) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `ID_COMPRA` int(11) NOT NULL,
  `ID_PRODUCTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_producto`
--

CREATE TABLE `detalle_producto` (
  `ID_DETALLE_PRODUCTO` int(11) NOT NULL,
  `ID_TIPO_TALLA` int(11) NOT NULL,
  `ID_TIPO_COLOR` int(11) NOT NULL,
  `ID_PRODUCTO` int(11) NOT NULL,
  `ID_TIPO_GENERO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagen_roducto`
--

CREATE TABLE `imagen_roducto` (
  `ID_IMAGEN_RODUCTO` int(11) NOT NULL,
  `IMAGEN` blob NOT NULL,
  `ID_PRODUCTO` int(11) NOT NULL,
  `ID_TIPO_COLOR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID_PRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `DESCRIPCION` varchar(45) DEFAULT NULL,
  `PRECIO` decimal(10,0) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S',
  `ID_TIPO_SUBCATEGORIA_PRODUCTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_categoria_producto`
--

CREATE TABLE `tipo_categoria_producto` (
  `ID_TIPO_CATEGORIA_PRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_color`
--

CREATE TABLE `tipo_color` (
  `ID_TIPO_COLOR` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_forma_pago`
--

CREATE TABLE `tipo_forma_pago` (
  `ID_TIPO_FORMA_PAGO` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_genero`
--

CREATE TABLE `tipo_genero` (
  `ID_TIPO_GENERO` int(11) NOT NULL,
  `GENERO` varchar(45) NOT NULL,
  `ABREVIATURA` varchar(3) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_subcategoria_producto`
--

CREATE TABLE `tipo_subcategoria_producto` (
  `ID_TIPO_SUBCATEGORIA_PRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `ACTIVA` varchar(1) NOT NULL DEFAULT 'S',
  `ID_TIPO_CATEGORIA_PRODUCTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_talla`
--

CREATE TABLE `tipo_talla` (
  `ID_TIPO_TALLA` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `DESCRIPCION` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `ID_TIPO_USUARIO` int(11) NOT NULL,
  `NOMBRE_USUARIO` varchar(45) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario_perfil`
--

CREATE TABLE `tipo_usuario_perfil` (
  `ID_TIPO_USUARIO_PERFIL` int(11) NOT NULL,
  `NOMBRE_PERFIL` varchar(45) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_perfil`
--

CREATE TABLE `usuario_perfil` (
  `ID_USUARIO_PERFIL` int(11) NOT NULL,
  `ID_USUARIO_SISTEMA` int(11) NOT NULL,
  `ID_TIPO_PERFIL_USUARIO` int(11) NOT NULL,
  `FECHA_MODIFICA_BD` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_sistema`
--

CREATE TABLE `usuario_sistema` (
  `ID_USUARIO_SISTEMA` int(11) NOT NULL,
  `ID_TIPO_USUARIO` int(11) NOT NULL,
  `NOMBRES` varchar(45) NOT NULL,
  `APELLIDOS` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `CLAVE` varchar(45) NOT NULL,
  `USUARIO_ACCESO` varchar(45) NOT NULL,
  `CELULAR` varchar(45) NOT NULL,
  `ACTIVO` varchar(1) NOT NULL DEFAULT 'S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`ID_COMPRA`);

--
-- Indices de la tabla `compra_pago`
--
ALTER TABLE `compra_pago`
  ADD PRIMARY KEY (`ID_COMPRA_PAGO`);

--
-- Indices de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD PRIMARY KEY (`ID_DETALLE_COMPRA`);

--
-- Indices de la tabla `detalle_producto`
--
ALTER TABLE `detalle_producto`
  ADD PRIMARY KEY (`ID_DETALLE_PRODUCTO`);

--
-- Indices de la tabla `imagen_roducto`
--
ALTER TABLE `imagen_roducto`
  ADD PRIMARY KEY (`ID_IMAGEN_RODUCTO`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_PRODUCTO`);

--
-- Indices de la tabla `tipo_categoria_producto`
--
ALTER TABLE `tipo_categoria_producto`
  ADD PRIMARY KEY (`ID_TIPO_CATEGORIA_PRODUCTO`);

--
-- Indices de la tabla `tipo_color`
--
ALTER TABLE `tipo_color`
  ADD PRIMARY KEY (`ID_TIPO_COLOR`);

--
-- Indices de la tabla `tipo_forma_pago`
--
ALTER TABLE `tipo_forma_pago`
  ADD PRIMARY KEY (`ID_TIPO_FORMA_PAGO`);

--
-- Indices de la tabla `tipo_genero`
--
ALTER TABLE `tipo_genero`
  ADD PRIMARY KEY (`ID_TIPO_GENERO`);

--
-- Indices de la tabla `tipo_subcategoria_producto`
--
ALTER TABLE `tipo_subcategoria_producto`
  ADD PRIMARY KEY (`ID_TIPO_SUBCATEGORIA_PRODUCTO`);

--
-- Indices de la tabla `tipo_talla`
--
ALTER TABLE `tipo_talla`
  ADD PRIMARY KEY (`ID_TIPO_TALLA`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`ID_TIPO_USUARIO`);

--
-- Indices de la tabla `tipo_usuario_perfil`
--
ALTER TABLE `tipo_usuario_perfil`
  ADD PRIMARY KEY (`ID_TIPO_USUARIO_PERFIL`);

--
-- Indices de la tabla `usuario_perfil`
--
ALTER TABLE `usuario_perfil`
  ADD PRIMARY KEY (`ID_USUARIO_PERFIL`);

--
-- Indices de la tabla `usuario_sistema`
--
ALTER TABLE `usuario_sistema`
  ADD PRIMARY KEY (`ID_USUARIO_SISTEMA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `ID_COMPRA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `compra_pago`
--
ALTER TABLE `compra_pago`
  MODIFY `ID_COMPRA_PAGO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  MODIFY `ID_DETALLE_COMPRA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_producto`
--
ALTER TABLE `detalle_producto`
  MODIFY `ID_DETALLE_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `imagen_roducto`
--
ALTER TABLE `imagen_roducto`
  MODIFY `ID_IMAGEN_RODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_categoria_producto`
--
ALTER TABLE `tipo_categoria_producto`
  MODIFY `ID_TIPO_CATEGORIA_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_color`
--
ALTER TABLE `tipo_color`
  MODIFY `ID_TIPO_COLOR` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_forma_pago`
--
ALTER TABLE `tipo_forma_pago`
  MODIFY `ID_TIPO_FORMA_PAGO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_genero`
--
ALTER TABLE `tipo_genero`
  MODIFY `ID_TIPO_GENERO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_subcategoria_producto`
--
ALTER TABLE `tipo_subcategoria_producto`
  MODIFY `ID_TIPO_SUBCATEGORIA_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_talla`
--
ALTER TABLE `tipo_talla`
  MODIFY `ID_TIPO_TALLA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `ID_TIPO_USUARIO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario_perfil`
--
ALTER TABLE `tipo_usuario_perfil`
  MODIFY `ID_TIPO_USUARIO_PERFIL` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario_perfil`
--
ALTER TABLE `usuario_perfil`
  MODIFY `ID_USUARIO_PERFIL` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario_sistema`
--
ALTER TABLE `usuario_sistema`
  MODIFY `ID_USUARIO_SISTEMA` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
