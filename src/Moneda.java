public class Moneda {

    private double valor;

    public Moneda(double valor) {
        this.valor = valor;
    }

    public String convertirMoneda(int opcionMoneda) {
        String conversionExitosa = "";
        System.out.println(opcionMoneda);
        switch (opcionMoneda) {
            case 1:
                double dolar = valor / 4771;
                double dolarRedondeado = Math.round(dolar * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + dolarRedondeado + " Dolares";
                break;
            case 2:
                double euro = valor / 5191.72;
                double euroRedondeado = Math.round(euro * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + euroRedondeado + " Euros";
                break;
            case 3:
                double le = valor / 5864.81;
                double leRedondeado = Math.round(le * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + leRedondeado + " Libras Esterlinas";
                break;
            case 4:
                double yj = valor / 36.29;
                double yjRedondeado = Math.round(yj * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + yjRedondeado + " Yen Japonés";
                break;
            case 5:
                double wsc = valor / 3.67;
                double wscRedondeado = Math.round(wsc * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + wscRedondeado + " Won sul-Coreano";
                break;
            case 6:
                double peso = valor * 4771;
                double pesoRedondeado = Math.round(peso * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + pesoRedondeado + " Pesos";
                break;
            case 7:
                double Eurotopeso = valor * 5191.72;
                double EurotopesoRedondeado = Math.round(Eurotopeso * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + EurotopesoRedondeado + " Pesos";
                break;
            case 8:
                double letopeso = valor * 5864.81;
                double letopesoRedondeado = Math.round(letopeso * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + letopesoRedondeado + " Pesos";
                break;
            case 9:
                double yjtopeso = valor * 36.29;
                double yjtopesoRedondeado = Math.round(yjtopeso * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + yjtopesoRedondeado + " Pesos";
                break;
            case 10:
                double wsctopeso = valor * 3.67;
                double wsctopesoRedondeado = Math.round(wsctopeso * 100.0) / 100.0;
                conversionExitosa = "Usted tiene " + wsctopesoRedondeado + " Pesos";
                break;
            default:
                return "FALLO AL CONVERTIR";
        }
        return conversionExitosa;
    }
}
