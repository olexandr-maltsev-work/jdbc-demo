CREATE TABLE `mydbtest`.`animal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `animal_name` VARCHAR(45) NULL,
  `anim_desc` VARCHAR(255) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idanimal_UNIQUE` (`id` ASC) VISIBLE);
