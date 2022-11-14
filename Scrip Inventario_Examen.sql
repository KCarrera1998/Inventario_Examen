create database InventarioExamen;
CREATE TABLE IF NOT EXISTS `inventarioexamen`.`producto` (
`idproducto` INT NOT NULL,
`descripcion` VARCHAR(45),
PRIMARY KEY (`idproducto`));
CREATE TABLE IF NOT EXISTS `inventarioexamen`.`inventario` (
`idinventario` INT NOT NULL AUTO_INCREMENT,
  `fec_ini` DATE NULL,
  `fec_fin` DATE NULL,
  `stk_ini` INT NOT NULL,
  `entradas` INT NOT NULL,
  `salidas` INT NOT NULL,
  `total` INT NOT NULL,
  `prod_idproducto` INT NOT NULL,
  PRIMARY KEY (`idinventario`),
  INDEX `fk_inventario_producto_idx` (`prod_idproducto` ASC) VISIBLE,
  CONSTRAINT `fk_inventario_producto`
    FOREIGN KEY (`prod_idproducto`)
    REFERENCES `inventarioexamen`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
