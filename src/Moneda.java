public class Moneda {

    private double pesoColombiano;

    public Moneda(double pesoColombiano) {
        this.pesoColombiano = pesoColombiano;
    }

    public String convertirMoneda(int opcionMoneda) {
        String conversionExitosa = "";
        switch (opcionMoneda) {
            case 1:
                double dolar = pesoColombiano / 4771;
                double dolarRedondeado = Math.round(dolar * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + dolarRedondeado + " Dolares";
                break;
        }
        return conversionExitosa;
    }
}
