public class Tiempo {

    private double valor;

    public Tiempo(double valor) {
        this.valor = valor;
    }

    public String convertirTiempo(int opcionTiempo) {
        String conversionExitosa = "";
        switch (opcionTiempo) {
            case 1:
                double TiempoEnHoras = valor * 24;
                conversionExitosa = valor + " dias" + " son " + TiempoEnHoras + " Horas";
                break;
            case 2:
                double TiempoEnMinutos = valor * 24 * 60;
                conversionExitosa = valor + " dias" + " son " + TiempoEnMinutos + " Minutos";
                break;
            case 3:
                long TiempoEnSegundos = (long) valor * 24 * 3600;
                conversionExitosa = valor + " dias" + " son " + TiempoEnSegundos + " segundos";
                break;
        }
        return conversionExitosa;
    }

}
