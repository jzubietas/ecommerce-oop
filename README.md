# Proyecto eCommerce - Programación Orientada a Objetos

Este proyecto implementa una plataforma e-Commerce utilizando principios de programación orientada a objetos en Java y patrones de diseño.

## Tecnologías
- Java
- Eclipse IDE
- Patrones de Diseño: Singleton, Factory, Observer

## Implementación

### 1. Singleton
La clase `ConfiguracionSistema` implementa el patrón Singleton para garantizar una única instancia global de configuración.

### 2. Factory
La clase `FabricaEntidades` aplica el patrón Factory para crear dinámicamente instancias de `Producto` (físico o digital) y `Usuario` (regular o premium).

### 3. Observer
Se implementa el patrón Observer con `PedidoObservable`, `InventarioObserver` y `UIObserver` para notificar cambios en el estado de pedidos.

## Ejecución
Ejecutar la clase `Main.java` para observar en consola la configuración del sistema, la creación dinámica de entidades y la notificación de eventos.

## 👤 Autor

**Jhonathan Isai Zubieta Santos**  
Curso: Programación Orientada a Objetos  
Universidad: Broward International University