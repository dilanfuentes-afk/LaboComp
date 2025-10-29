# Enunciado

Dado un vector precios donde precios[i] representa el precio de una acción en el día i. Se
desea maximizar la ganancia eligiendo un solo día para comprar una acción y eligiendo un día
diferente en el futuro para vender esa acción.
Realice una función que reciba como parámetro de entrada el array precios y que devuelva ganancia
máxima que se pueda obtener. Si no se puede obtener ninguna ganancia, devolver 0.

---

## Ejemplos

### Ejemplo 1
- **Input**: precios = [7, 1, 5, 3, 6, 4]
- **Output**: 5
- **Explicación**: Comprar en el día 2 (precio = 1) y vender en el día 5 (precio = 6), ganancia = 6 - 1 = 5.

### Ejemplo 2
- **Input**: precios = [7, 6, 4, 3, 1]
- **Output**: 0
- **Explicación**: En este caso, no hay transacción que permita obtener ganancia.

### Ejemplo 3
- **Input**: precios = [1, 2, 3, 4, 5]
- **Output**: 4
- **Explicación**: Comprar en el día 1 (precio = 1) y vender en el día 5 (precio = 5), ganancia = 5 - 1 = 4.

### Ejemplo 4
- **Input**: precios = [3, 3, 5, 0, 0, 3, 1, 4]
- **Output**: 4
- **Explicación**: Comprar en el día 4 (precio = 0) y vender en el día 8 (precio = 4), ganancia = 4 - 0 = 4.
