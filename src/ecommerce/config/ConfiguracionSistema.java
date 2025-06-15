
package ecommerce.config;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instancia;
    private String dbURL;
    private String uiTheme;

    private ConfiguracionSistema() {
        this.dbURL = "jdbc:mysql://localhost:3306/ecommerce";
        this.uiTheme = "dark-mode";
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getDbURL() {
        return dbURL;
    }

    public String getUiTheme() {
        return uiTheme;
    }
}
