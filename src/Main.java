
public class Main {
    public static void main(String[] args) {

        Tablero tablero = new Tablero();
        String[][][] tableroArray = tablero.getTablero();
        Piezas.Peones[] peones = new Piezas.Peones[16];
        Piezas.Torres[] torres = new Piezas.Torres[4];
        Piezas.Caballos[] caballos = new Piezas.Caballos[4];
        Piezas.Alfiles[] alfiles = new Piezas.Alfiles[4];
        Piezas.Reyes[] reyes = new Piezas.Reyes[2];
        Piezas.Reinas[] reinas = new Piezas.Reinas[2];


        // creacion de peones
        for(int i = 0; i < 16; i++){
            peones[i] = new Piezas.Peones("", new int[]{});
            peones[i] = peones[i].posicionIni(i);
        }
        // creacion de torres
        for(int i = 0; i < 4; i++){
            torres[i] = new Piezas.Torres("", new int[]{});
            torres[i] = torres[i].posicionIni(i);
        }
        //creacion de caballos
        for(int i = 0; i < 4; i++){
            caballos[i] = new Piezas.Caballos("", new int[]{});
            caballos[i] = caballos[i].posicionIni(i);
        }
        //creacion de alfiles
        for(int i = 0; i < 4; i++){
            alfiles[i] = new Piezas.Alfiles("", new int[]{});
            alfiles[i] = alfiles[i].posicionIni(i);
        }
        //creacion de reyes
        for(int i = 0; i < 2; i++){
            reyes[i] = new Piezas.Reyes("", new int[]{});
            reyes[i] = reyes[i].posicionIni(i);
        }
        //creacion de reinas
        for(int i = 0; i < 2; i++){
            reinas[i] = new Piezas.Reinas("", new int[]{});
            reinas[i] = reinas[i].posicionIni(i);
        }

        // posicionamiento de peones
        for(int i = 0; i < 16; i++){
            int x = peones[i].getPosicion()[0];
            int y = peones[i].getPosicion()[1];
            String nombre = peones[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }
        //posicionamiento de torres
        for(int i = 0; i < 4; i++){
            int x = torres[i].getPosicion()[0];
            int y = torres[i].getPosicion()[1];
            String nombre = torres[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }

        //posicionamiento de caballos
        for(int i = 0; i < 4; i++){
            int x = caballos[i].getPosicion()[0];
            int y = caballos[i].getPosicion()[1];
            String nombre = caballos[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }

        //posicionamiento de alfiles
        for(int i = 0; i < 4; i++){
            int x = alfiles[i].getPosicion()[0];
            int y = alfiles[i].getPosicion()[1];
            String nombre = alfiles[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }

        //posicionamiento de reyes
        for(int i = 0; i < 2; i++){
            int x = reyes[i].getPosicion()[0];
            int y = reyes[i].getPosicion()[1];
            String nombre = reyes[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }
        //posicionamiento de reinas
        for(int i = 0; i < 2; i++){
            int x = reinas[i].getPosicion()[0];
            int y = reinas[i].getPosicion()[1];
            String nombre = reinas[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }
        tablero.tableroPrint();

    }
}
