
package ecommerce.factory;

import ecommerce.productos.*;
import ecommerce.usuarios.*;

public class FabricaEntidades {

    public static Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "fisico":
                return new ProductoFisico("Producto Físico", 99.99);
            case "digital":
                return new ProductoDigital("Producto Digital", 49.99);
            default:
                throw new IllegalArgumentException("Tipo de producto no válido.");
        }
    }

    public static Usuario crearUsuario(String tipo) {
        switch (tipo.toLowerCase()) {
            case "regular":
                return new UsuarioRegular("usuario_regular");
            case "premium":
                return new UsuarioPremium("usuario_premium");
            default:
                throw new IllegalArgumentException("Tipo de usuario no válido.");
        }
    }
}
