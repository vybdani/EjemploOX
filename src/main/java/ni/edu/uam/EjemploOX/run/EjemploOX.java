package ni.edu.uam.EjemploOX.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class EjemploOX {

    public static void main(String[] args) throws Exception {
        DBServer.start("EjemploOX-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
        AppServer.run("EjemploOX"); // Usa AppServer.run("") para funcionar en el contexto raíz
    }

}
