
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        JOptionPane.showMessageDialog(null, "Binvenido", "Menu", 1);
        while (continuar == true) {

            OpcionConversor opcionConversor = new OpcionConversor();

            Object[] opcionesConvertidor = opcionConversor.opcion;
            Object[] opcionesMonedas = opcionConversor.monedas;
            Object[] opcionesTiempo = opcionConversor.unidadestiempo;

            String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona un conversor", "Elegir", 1, null,
                    opcionesConvertidor, opcionesConvertidor[0]);
            String valorString = JOptionPane.showInputDialog("Ingrese valor a convertir");
            while (valorString.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                valorString = JOptionPane.showInputDialog("Ingrese valor a convertir");
            }
            double valor = Double.parseDouble(valorString);
            switch (opcionConversor.opcionelegida(opcion)) {
                case 1:
                    String monedaElegida = (String) JOptionPane.showInputDialog(null,
                            "Elige la moneda a la cual convertir",
                            "Elegir moneda", 1, null, opcionesMonedas, opcionesMonedas[0]);
                    Moneda moneda = new Moneda(valor);
                    int opcionMonedaElegida = opcionConversor.opcionMoneda(monedaElegida);
                    JOptionPane.showInternalMessageDialog(null, moneda.convertirMoneda(opcionMonedaElegida));
                    break;
                case 2:
                    String TiempoElegido = (String) JOptionPane.showInputDialog(null,
                            "Elegir tiempo a converir los dias",
                            "Elegir", 1, null,
                            opcionesTiempo, opcionesTiempo[0]);
                    Tiempo tiempo = new Tiempo(valor);
                    int opcionTiempoElegido = opcionConversor.opcionTiempo(TiempoElegido);
                    JOptionPane.showInternalMessageDialog(null, tiempo.convertirTiempo(opcionTiempoElegido));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
            if (JOptionPane.OK_OPTION != respuesta)
                continuar = false;
        }
        System.exit(0);
    }
}
