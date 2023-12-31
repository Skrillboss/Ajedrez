abstract class Piezas {

    private String nombre;
    private boolean existe;
    private int[] posicion = new int[2];

    public abstract void posicionIni();

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



}
/* ---------------------------------------------------------------------------------- */
class Peones extends Piezas{

   public Peones(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            int columna = (x == 0) ? 1 : 7;
            for(int y = 0; y < 8; y++){
                int [] posicion = new int[]{columna, y};

                Peones peon = (x == 0) ?
                        new Peones("Peon +", posicion) :
                        new Peones("Peon -", posicion) ;
            }
        }
    }
}
/* ------------------------------------------------------------- */

class Torres extends Piezas{
    public Torres(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            for(int y = 0; y < 2; y++){
                int columna = (x == 1) ? 7 : 0;
                int fila = (y == 1) ? 7 : 0;
                int [] posicion;
                posicion = new int[]{columna, fila};
                Torres torre = (x == 0) ?
                        new Torres("Torre +", posicion):
                        new Torres("Torre -", posicion);
            }
        }
    }
}
/* ------------------------------------------------------------- */

class Caballos extends Piezas{
    public Caballos(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            for(int y = 0; y < 2; y++){
                int columna = (x == 1) ? 7 : 0;
                int fila = (y == 1) ? 6 : 1;
                int [] posicion;
                posicion = new int[]{columna, fila};
                Caballos caballo = (x == 0) ?
                        new Caballos("Caballo +", posicion):
                        new Caballos("Caballo -", posicion);
            }
        }
    }
}
/* ------------------------------------------------------------- */

class Alfiles extends Piezas{
    public Alfiles(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            for(int y = 0; y < 2; y++){
                int columna = (x == 1) ? 7 : 0;
                int fila = (y == 1) ? 5 : 2;
                int [] posicion;
                posicion = new int[]{columna, fila};
                Alfiles alfil = (x == 0) ?
                        new Alfiles("Alfil +", posicion):
                        new Alfiles("Alfil -", posicion);
            }
        }
    }
}
/* ------------------------------------------------------------- */

class Reyes extends Piezas{
    public Reyes(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            int columna = (x == 0) ? 0 : 7;
            int[] posicion = new int[]{columna, 3};

            Reyes rey = (x == 0) ?
                    new Reyes("Rey +", posicion):
                    new Reyes("Rey -", posicion);
        }
    }
}
/* ------------------------------------------------------------- */

class Reinas extends Piezas{
    public Reinas(String nombre, int[] posicion) {
        super(nombre, posicion);
    }

    public void posicionIni(){
        for(int x = 0; x < 2; x++){
            int columna = (x == 0) ? 0 : 7;
            int[] posicion = new int[]{columna, 4};

            Reinas reina = (x == 0) ?
                    new Reinas("Reina +", posicion):
                    new Reinas("Reina -", posicion);
        }
    }
}

