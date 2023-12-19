class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("     Gua, gua");
    }
}
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("     Meow, meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        animal.hacerSonido(); // Imprime "Haciend sonido genérico"
        perro.hacerSonido(); // Imprime "Gua, gua"
        gato.hacerSonido(); // Imprime "Meow, moew"

    }
}
/*class Animal {
    //le puedo dejar vacio sin metodo a la superclase
    }
}
class Perro extends Animal {
    //@Override le quito esto xq no esta sobre escribiendo o sobrecargando
    public void hacerSonido() {
        System.out.println("     Gua, gua");
    }
}
class Gato extends Animal {
    //@Override le quito esto xq no esta sobre escribiendo o sobrecargando
    public void hacerSonido() {
        System.out.println("     Meow, meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        //animal.hacerSonido();  Imprime "Haciend sonido genérico" (ESTO YA NO SE IMPRIMIRA)
        perro.hacerSonido(); // Imprime "Gua, gua"
        gato.hacerSonido(); // Imprime "Meow, moew"

    }
}