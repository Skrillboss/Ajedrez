abstract class Piezas {

    private String nombre;
    private boolean existe;
    private int[] posicion = new int[2];

    public abstract Piezas posicionIni(int i);

    public void mover(char x, int y) {
        x = Character.toLowerCase(x);
        int ascii = (int) x;
        ascii -= 97;
        if (ascii < 0 || ascii > 7) {
            System.out.println("La letra que haz proporcionado no es correcta");
        }
        posicion[0] = ascii;
        posicion[1] = y;
    }

    public Piezas(String nombre, int[] posicion, boolean existe) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.existe = existe;
    }

    public Piezas(String nombre, int[] posicion){

        this(nombre, posicion, true);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
}
/* ---------------------------------------------------------------------------------- */
class Peones extends Piezas{

    public Peones(String color ,int[] posicion) {
       super("Peon" + color, posicion);
    }
    public Peones posicionIni(int i){

       return (i < 8) ?
               new Peones("(+)", new int[]{1, i}):
               new Peones("(-)", new int[]{6, 15 - i});

    }
}

/* ------------------------------------------------------------- */

class Torres extends Piezas{
    public Torres(String color, int[] posicion) {
        super("Torre" + color, posicion);
    }

    public Torres posicionIni(int i) {
        int columna = (i < 2) ? 0 : 7;
        int fila = (i % 2 == 0) ? 7 : 0;
        int[] posicion = new int[]{columna, fila};
    return (i < 2) ?
        new Torres("(+)", posicion):
        new Torres("(-)", posicion);
    }
}


/* ------------------------------------------------------------- */

class Caballos extends Piezas{
    public Caballos(String color, int[] posicion) {
        super("Caballo" + color , posicion);
    }

    public Caballos posicionIni(int i){
        int columna = (i < 2) ? 0 : 7;
        int fila = (i % 2 == 0) ? 6 : 1;
        int[] posicion = new int[]{columna, fila};
        return (1 < 2) ?
                new Caballos("(+)", posicion):
                new Caballos("(-)", posicion);
    }
}
/* ------------------------------------------------------------- */

class Alfiles extends Piezas{
    public Alfiles(String color, int[] posicion) {
        super("Alfil" + color, posicion);
    }

    public Alfiles posicionIni(int i){
        int columna = (i < 2) ? 0 : 7;
        int fila = (i % 2 == 0) ? 5 : 2;
        int[] posicion = new int[]{columna, fila};
        return (1 < 2) ?
                new Alfiles("(+)", posicion):
                new Alfiles("(-)", posicion);
    }
}
/* ------------------------------------------------------------- */

class Reyes extends Piezas{
    public Reyes(String color, int[] posicion) {
        super("Rey" + color, posicion);
    }

    public Reyes posicionIni(int i){
        int columna = (i < 1) ? 0 : 7;
        int[] posicion = new int[]{columna, 3};
        return (1 < 2) ?
                new Reyes("(+)", posicion):
                new Reyes("(-)", posicion);
    }
}
/* ------------------------------------------------------------- */

class Reinas extends Piezas{
    public Reinas(String color, int[] posicion) {
        super("Reina" + color, posicion);
    }

    public Reinas posicionIni(int i){
        int columna = (i < 1) ? 0 : 7;
        int[] posicion = new int[]{columna, 4};
        return (1 < 2) ?
                new Reinas("(+)", posicion):
                new Reinas("(-)", posicion);
    }
}

