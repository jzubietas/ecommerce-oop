# Proyecto eCommerce - Programación Orientada a Objetos

Este proyecto implementa una plataforma básica de comercio electrónico aplicando principios de programación orientada a objetos (OOP) en Java.

## 📦 Estructura del Proyecto

El código fuente se encuentra organizado en paquetes para reflejar las entidades del dominio:

- `usuarios`: Clases relacionadas con los usuarios del sistema.
- `productos`: Clases para productos físicos y digitales.
- `carrito`: Clases para el carrito de compras e ítems.
- `inventario`: Gestión de inventario físico y digital. *(Semana 6)*
- `pagos`: Procesos de pago mediante tarjeta y PayPal. *(Semana 6)*
- `pedidos`, `notificaciones`: (a implementar en futuras entregas).

## 🧪 Tecnologías Utilizadas

- Java 8+
- Eclipse IDE
- Git y GitHub

## ▶️ Instrucciones de Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/jzubietas/ecommerce-oop.git
   ```
2. Importa el proyecto en Eclipse como un "Java Project".
3. Asegúrate de que el JDK esté correctamente configurado.
4. Ejecuta desde una clase con método `main` para probar la lógica de usuarios, productos, inventario y pagos.

## ⚙️ Desafíos y Soluciones

- **Separación de responsabilidades**: se organizaron clases en paquetes para mejorar la mantenibilidad.
- **Escalabilidad**: se definieron clases base con posibilidad de herencia.
- **Reutilización**: se aplicaron principios SOLID en el diseño.
- **Modularidad (Semana 6)**: se implementaron clases abstractas y interfaces para desacoplar la lógica de inventario y pagos.

## 📘 Semana 6 - Interfaces y Clases Abstractas

En esta semana se implementaron estructuras avanzadas para mejorar la escalabilidad del sistema:

### Gestión de Inventario
Se creó la clase abstracta `GestorInventario` con los métodos:
- `añadirProducto(Producto producto)`
- `eliminarProducto(int id)`
- `actualizarStock(int id, int nuevoStock)`

Las clases `GestorInventarioFisico` y `GestorInventarioDigital` extienden esta clase y gestionan tipos de inventario diferentes.

### Procesos de Pago
Se definió la interfaz `ProcesoPago` con métodos:
- `iniciarPago(double monto)`
- `verificarPago()`
- `confirmarPago()`

Las clases `PagoTarjeta` y `PagoPayPal` implementan esta interfaz simulando diferentes métodos de pago.

## 👤 Autor

**Jhonathan Isai Zubieta Santos**  
Curso: Programación Orientada a Objetos  
Universidad: Broward International University