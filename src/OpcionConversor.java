public class OpcionConversor {

    protected String[] opcion = { "Conversor de moneda", "Conversor de Dias" };
    protected String[] monedas = { "Peso a Dolar", "Peso a Euro", "Peso a Libras Esterlinas", "Peso a Yen Japonés",
            "Peso a won sul-coreano", "Dolar a Peso", "Euro a Peso", "Libras Esterlinas a Peso", "Yen Japonés a Peso",
            "Won-sul-coreano a Peso" };
    protected String[] unidadestiempo = { "Dias a horas", "Dias a minutos", "Dias a segundos" };

    public int opcionelegida(String opcion) {
        int opcionelegida = 1;
        for (int i = 0; i < this.opcion.length; i++) {
            if (this.opcion[i] == opcion) {
                break;
            }
            opcionelegida++;

        }
        return opcionelegida;
    }

    public int opcionMoneda(String moneda) {
        int opcionelegida = 1;
        for (int i = 0; i < this.monedas.length; i++) {
            if (this.monedas[i] == moneda) {
                break;
            }
            opcionelegida++;

        }
        return opcionelegida;
    }

    public int opcionTiempo(String unidadestiempo) {
        int opcionelegida = 1;
        for (int i = 0; i < this.unidadestiempo.length; i++) {
            if (this.unidadestiempo[i] == unidadestiempo) {
                break;
            }
            opcionelegida++;

        }
        return opcionelegida;
    }
}
