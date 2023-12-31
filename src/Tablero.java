public class Tablero {
    private String[][][] tablero = new String[8][8][2];

    public void tableroIni(){
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                for(int z = 0; z < 2; z++){
                    char letraColumna = (char) ('a' + y);
                    tablero[x][y][z] = (z == 0) ? String.valueOf(letraColumna) + (x + 1): "";
                }
            }
        }
    }

    public void setTablero(int x, int y, String pieza){
        tablero[x][y][1] = pieza;
    }

    public String getCuadroTablero(int x, int y){
        StringBuilder cuadro = new StringBuilder();
        for(String valor : tablero[x][y]){
                cuadro.append(valor);
                cuadro.append(" ");
        }
        return cuadro.toString();
    }

    public void tableroPrint(){
        for(int x = 0; x < tablero.length; x++){
            System.out.println(" ");
            for(int y = 0; y < tablero[x].length; y++){
                for(int z = 0; z < tablero[x][y].length; z++){
                    System.out.print(tablero[x][y][z] + " ");
                }
            }
        }
    }



}
