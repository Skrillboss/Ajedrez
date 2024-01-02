public class Main {
    public static void main(String[] args) {

        Tablero tablero = new Tablero();
        String[][][] tableroArray = tablero.getTablero();
        Peones[] peones = new Peones[16];
        Torres[] torres = new Torres[4];

        // creacion de peones
        for(int i = 0; i < 16; i++){
            peones[i] = new Peones("+", new int[]{0, 0});
            peones[i] = peones[i].posicionIni(i);
        }
        // creacion de torres
        for(int i = 0; i < 4; i++){
            torres[i] = new Torres("", new int[]{});
            torres[i] = torres[i].posicionIni(i);
        }
        // posicionamiento de peones
        for(int i = 0; i < 16; i++){
            int x = peones[i].getPosicion()[0];
            int y = peones[i].getPosicion()[1];
            String nombre = peones[i].getNombre();

            tablero.setTablero(x, y, nombre);
        }

        //jposicionamiento de torres
        for(int i = 0; i < 4; i++){
            int x = torres[i].getPosicion()[0];
            int y = torres[i].getPosicion()[1];
            String nombre = torres[i].getNombre();
            tablero.setTablero(x, y, nombre);
        }

        tablero.tableroPrint();

    }
}
