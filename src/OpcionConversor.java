public class OpcionConversor {

    protected String[] opcion = { "Conversor de moneda", "Conversor de distancia", "Conversor de temperatura" };
    protected String[] monedas = { "Peso a Dolar", "Peso a Euro", "Peso a Libras Esterlinas", "Peso a Yen Japonés",
            "Peso a won sul-coreano", "Dolar a Peso", "Euro a Peso", "Libras Esterlinas a Peso", "Yen Japonés a Peso",
            "Won-sul-coreano a Peso" };

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
}
