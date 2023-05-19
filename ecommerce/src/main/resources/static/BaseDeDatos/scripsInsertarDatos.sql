-- DMLIPNGIRLSHOP
USE `ipngirlshopdb` ;
-- Agregar categorías
INSERT INTO categorias (nombre)
VALUES ('Maquillaje');
INSERT INTO categorias (nombre)
VALUES ('Calzado');
INSERT INTO categorias (nombre)
VALUES ('Vestimenta');
INSERT INTO categorias (nombre)
VALUES ('Accesorios');
INSERT INTO categorias (nombre)
VALUES ('Mascotas');
INSERT INTO categorias (nombre)
VALUES ('Sexshop');
INSERT INTO categorias (nombre)
VALUES ('Varios');

-- Agregando Productos
INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Anillo Amistad', 'Los amigos son amigos para siempre y por siempre', 'https://m.media-amazon.com/images/I/41h8za3a1fL._AC_SL1000_.jpg', 250.3, 73, 1, 1);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Botas chillonas', 'Para el mejor cocinero del mundo', './src/img/Objetos/botasChillonas.jpeg', 100.34, 693, 1, 4);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Sandalias', 'Son aerodinámicas', 'https://m.media-amazon.com/images/I/71lE8Bwn7JL._AC_SX695_.jpg', 300.43, 103, 2, 3);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Capa de invisivilidad', 'Te hace menos visible para otros', 'https://http2.mlstatic.com/D_NQ_NP_869948-MLM40974317864_032020-O.jpg', 340.22, 73, 2, 5);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Pastilla chiquitolina', 'Olvidate de las partículas PIM', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYmQWJFh4vbuFzjS9ksz03P9OyM7mhbjK9h7lRYwGWyb6QG6DPSVtzbqedrD36MDOLw9U&usqp=CAU', 215.12, 83, 2, 6);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Rimel', 'Producto en forma de tubo que contiene una fórmula especial diseñada para alargar, dar volumen y definir tus pestañas.', 'https://img.ltwebstatic.com/gspCenter/goodsImage/2023/4/8/5070517430_1067621/EEBC43B39C7169D2C625CCA70BD215D0_thumbnail_600x.jpg', 20.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Tennis', 'Calzado diseñado específicamente para practicar deportes y actividades físicas.', 'https://img.ltwebstatic.com/images3_pi/2023/03/01/1677686143df9f5fdb0c996411e4e8f6b61297c2c1_thumbnail_600x.webp', 39.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Zapatillas deportivas', 'Zapatillas deportivas en color negro con suela de goma, talla 42.', 'https://http2.mlstatic.com/D_NQ_NP_623834-CBT51381245554_092022-O.jpg', 59.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Sudadera blanca', 'Prenda de ropa informal y relajada que se puede usar en una gran variedad de situaciones, desde salir a dar un paseo hasta relajarse en casa.', 'https://img.ltwebstatic.com/images3_pi/2021/08/10/16285597094805f22dd2451606ed90916df7e3e234_thumbnail_600x.webp', 149.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Tanga abierta', 'Ropa interior femenina que se caracteriza por tener una banda estrecha en la parte inferior que se ajusta a la cintura y una tira de tela que va desde la parte trasera de la banda hasta la parte inferior delantera.', 'https://img.ltwebstatic.com/images3_pi/2021/05/06/1620274047fcdcd3894a94eb7dce4cd37148b0e6dc_thumbnail_600x.webp', 29.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Collar de Estrellas', 'Hermosa pieza de joyería que está diseñada para lucir como un cielo lleno de estrellas en tu cuello.', 'https://d2r9epyceweg5n.cloudfront.net/stores/339/933/products/estrellaswandy1-1bfa4d4dc9d25cc7b216173187420689-1024-1024.jpg', 24.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Collar de Luna', 'Hermosa pieza de joyería que está diseñada para lucir como un cielo lleno de estrellas en tu cuello.', 'https://img.ltwebstatic.com/images3_pi/2020/10/30/1604037934f91750c5cb8970f852a55ce2057865d4_thumbnail_600x.webp', 69.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Limpiador nasal', 'Dispositivo diseñado para ayudar a limpiar y despejar las fosas nasales, lo que puede mejorar la respiración y reducir la congestión nasal.', 'https://img.ltwebstatic.com/images3_pi/2023/03/24/1679653476a851cbc4a680baa3813b76a1cac5a1ab_thumbnail_600x.webp', 12.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Contenedor de cuchillas usadas', 'Almacena de manera segura y adecuada cuchillas de afeitar, bisturíes u otras herramientas filosas después de su uso.', 'https://img.ltwebstatic.com/images3_pi/2022/06/11/1654912663faf69ee313df2c0e73b2785fba9148f4_thumbnail_600x.webp', 19.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Mochila rana para perro', 'Está hecha de materiales resistentes y duraderos para soportar el peso de tu mascota, así como también para resistir las condiciones climáticas del exterior.', 'https://img.ltwebstatic.com/images3_pi/2022/05/30/16538875292fe7e04d9f7a3b21834e4d556e8d4825_thumbnail_600x.webp', 89.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Paleta de maquillaje', 'Contiene múltiples colores y texturas de maquillaje para ojos, labios y mejillas.', 'https://img.ltwebstatic.com/images3_pi/2023/03/27/167990464132244cacc7f43b1202b3bceb76dfae2f_thumbnail_600x.webp', 20.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Zapatillas deportivas', 'Zapatillas deportivas en color negro con suela de goma, talla 42.', 'https://http2.mlstatic.com/D_NQ_NP_623834-CBT51381245554_092022-O.jpg', 59.99, 0, 0, 0);

INSERT INTO `productos` (nombre, descripcion, imagen, precio, cantidad, descuento_id, categorias_id)
VALUES ('Sudadera roja', 'Proporciona calor y confort en climas frescos, gracias a su tela suave y cálida, generalmente de algodón o poliéster.', 'https://img.ltwebstatic.com/images3_pi/2023/03/30/1680156796f0eae4cac4252654b3cd33a529a873e4_thumbnail_600x.webp', 149.99, 0, 0, 0);

-- Agregando usuario 

 INSERT INTO `usuarios` (`nombre`,`apellido`,`password`,`boleta`,`correo`,`telefono`,`rol`,`foto`) 
VALUES ('Ernesto ','Nieves','holaquehace',1234111111,'ernm@gmail.com',1111111111,'vendedor','foto.jpg');
INSERT INTO `usuarios` (`nombre`,`apellido`,`password`,`boleta`,`correo`,`telefono`,`rol`,`foto`)  
VALUES ('Daniel','Montoya','constra',2928399999,'corre@correo.com',1111111234,'comprador','foto1.jpg');
INSERT INTO `usuarios` (`nombre`,`apellido`,`password`,`boleta`,`correo`,`telefono`,`rol`,`foto`) 
 VALUES ('Adriana', 'Ibarra', 'Pa$$word.1', 9876543211,'adimania@gmail.com',1234567890,'vendedor','foto2.jpg');
INSERT INTO `usuarios`(`nombre`,`apellido`,`password`,`boleta`,`correo`,`telefono`,`rol`,`foto`) 
 VALUES ('juan pablo','avina araiza','C@rton54',1234567891,'chito.pepsi@gmail.com',222222222,'comprador','foto3.jpg');
INSERT INTO `usuarios`(`nombre`,`apellido`,`password`,`boleta`,`correo`,`telefono`,`rol`,`foto`) 
 VALUES ('Alberto ','Trejo','C@rton54',1234567891,'albrt@gmail.com',222222222,'comprador','foto4.jpg');


SELECT * FROM ipngirlshopdb.categorias;
SELECT * FROM ipngirlshopdb.productos;
SELECT * FROM ipngirlshopdb.usuarios;

