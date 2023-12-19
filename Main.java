class Vehiculo {
    public void acelerar() {
        System.out.println("Acelera de 0 a ");
    }
}
class Auto extends Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("     100 el auto");
    }
}
class Bicicleta extends Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("     50 la bicicleta");
    }
}
class Avion extends Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("     200 el avion");
    }
}


class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Auto auto1 = new Auto();
        Bicicleta bicicleta1 = new Bicicleta();
        Avion avion1 = new Avion();
        vehiculo.acelerar(); // Imprime "acelera de 0 a"
        auto1.acelerar(); // Imprime
        bicicleta1.acelerar(); // Imprime
        avion1.acelerar(); // Imprime
    }
}