CREATE TABLE `tb_restaurant` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(100) NOT NULL
);

CREATE TABLE `tb_menu` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `restaurant_id` integer NOT NULL
);

ALTER TABLE `menu` ADD FOREIGN KEY (`restaurant_id`) REFERENCES `tb_restaurant` (`id`);
