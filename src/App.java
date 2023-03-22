
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        JOptionPane.showMessageDialog(null, "Binvenido", "Menu", 1);
        while (continuar == true) {

            OpcionConversor opcionConversor = new OpcionConversor();
            Object[] opcionesConvertidor = new Object[opcionConversor.opcion.length];
            Object[] opcionesMonedas = new Object[opcionConversor.monedas.length];
            for (int i = 0; i < opcionConversor.opcion.length; i++) {
                opcionesConvertidor[i] = opcionConversor.opcion[i];
            }
            for (int i = 0; i < opcionConversor.monedas.length; i++) {
                opcionesMonedas[i] = opcionConversor.monedas[i];
            }
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
