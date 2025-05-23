# Proyecto eCommerce - Extensión mediante Herencia (Asignación 3)

Este repositorio contiene la tercera fase del proyecto eCommerce desarrollado en Java. En esta etapa, se extiende la funcionalidad del sistema mediante el uso de herencia para especializar las clases `Producto` y `Usuario`, adaptándolas a distintos contextos y roles dentro de una tienda virtual.

## 📌 Objetivos de la Asignación

- Aplicar el principio de herencia para diferenciar tipos de productos y usuarios.
- Implementar subclases que reflejen necesidades específicas de negocio.
- Ampliar el sistema respetando la arquitectura original orientada a objetos.
- Demostrar la escalabilidad y mantenibilidad del sistema mediante buenas prácticas de desarrollo.

## 🧩 Funcionalidades Implementadas

### 🛒 Productos

- `ProductoFisico`: incluye atributos como peso y dimensiones para gestión logística.
- `ProductoDigital`: incorpora propiedades como formato de archivo y tamaño (MB) para distribución digital.

### 👥 Usuarios

- `Cliente`: historial de compras y preferencias de navegación para personalización.
- `Administrador`: funciones administrativas para crear productos, editar inventario y establecer promociones.

## 🧪 Tecnologías Utilizadas

- Java 8+
- Eclipse IDE
- JUnit 5 (para pruebas unitarias)
- UML (para modelado de clases y diagramas de flujo)

## ▶️ Instrucciones de Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/jzubietas/ecommerce-oop.git
   ```
2. Importa el proyecto como Java Project en Eclipse.
3. Asegúrate de tener configurado JDK 8 o superior.
4. Ejecuta la clase `Main` para probar la lógica general.
5. Corre las pruebas unitarias desde los archivos en la carpeta `/test`.

## ⚙️ Desafíos Encontrados

- Diseño de atributos específicos sin romper el principio de responsabilidad única.
- Necesidad de refactorizar ciertas clases para soportar polimorfismo sin duplicación.
- Ajustes en pruebas unitarias para validar comportamiento de subclases.

## ✅ Estado del Proyecto

- [x] Clases heredadas implementadas.
- [x] Pruebas unitarias funcionales.

## 👨‍💻 Autor

**Jhonathan Isai Zubieta Santos**  
Facultad de Ingeniería de Software  
Broward International University