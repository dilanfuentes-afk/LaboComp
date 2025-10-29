# Enunciado

Realice una función `productoMatricial()` que reciba como parámetros dos matrices de enteros.
La función debe retornar una nueva matriz que sea el resultado de multiplicar las dos matrices
recibidas.

_Verificar las condiciones del producto matricial. Devolver `null` si estas no se cumplen._

---

## Ejemplos

### Ejemplo 1
- **Input**:
  - Matriz 1: `{ {1, 2}, {3, 4} }`
  - Matriz 2: `{ {5, 6}, {7, 8} }`
- **Output**: `{ {19, 22}, {43, 50} }`

### Ejemplo 2
- **Input**:
  - Matriz 1: `{ {1, 0, 2}, {0, 3, -1} }`
  - Matriz 2: `{ {3, 1}, {2, 1}, {1, 0} }`
- **Output**: `{ {5, 1}, {1, 3} }`

### Ejemplo 3
- **Input**:
  - Matriz 1: `{ {1, 2, 3} }`
  - Matriz 2: `{ {4}, {5}, {6} }`
- **Output**: `{ {32} }`

### Ejemplo 4
- **Input**:
  - Matriz 1: `{ {1, 2}, {3, 4} }`
  - Matriz 2: `{ {1} }`
- **Output**: `null` _(condiciones del producto matricial no se cumplen)_
