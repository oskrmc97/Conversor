public class OpcionConversor {

    protected String[] opcion = { "Conversor de moneda", "Conversor de Dias" };
    protected String[] monedas = { "Peso a Dolar", "Peso a Euro", "Peso a Libras Esterlinas", "Peso a Yen Japonés",
            "Peso a won sul-coreano", "Dolar a Peso", "Euro a Peso", "Libras Esterlinas a Peso", "Yen Japonés a Peso",
            "Won-sul-coreano a Peso" };
    protected String[] unidadestiempo = { "Dias a horas", "Dias a minutos", "Dias a segundos" };

    public int opcionelegida(String opcion) {
        return comparacion(opcion, this.opcion);
    }

    public int opcionMoneda(String moneda) {
        return comparacion(moneda, this.monedas);
    }

    public int opcionTiempo(String unidadestiempo) {
        return comparacion(unidadestiempo, this.unidadestiempo);
    }

    private int comparacion(String opcionGeneral, String[] ArrayDeOpciones) {
        int opcionelegida = 1;
        for (int i = 0; i < ArrayDeOpciones.length; i++) {
            if (ArrayDeOpciones[i] == opcionGeneral) {
                break;
            }
            opcionelegida++;

        }
        return opcionelegida;
    }
}
