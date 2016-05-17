DROP TABLE IF EXISTS `peserta`;

CREATE TABLE `peserta`(
 `id` varchar(255) NOT NULL,
 `nama` varchar(255) NOT NULL,
 `alamat` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;