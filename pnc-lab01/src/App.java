import java.util.List;

import Class.Player;
import Class.Team;
import Enum.PlayerRole;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        int option;
        //TODO: MAIN MENU 
        /*
        *Calcular jugadores con mas goles de un partido
            *seleccionar partido por fecha y/ o equipos usando stream
            *seleccionar jugador con más goles
        *seleccionar jugadores con mas de 5 goles en la temporada
        *Insertar un partido, con parametros como goles por jugador, 
        *calcular ganadores
        */ 

        do { 
             System.err.println("----------------------Menu Principal----------------------");
             System.err.println("| 1)               Ver a los jugadores                    |");
             System.err.println("| 2) Ver a los jugadores con mas de 5 goles por temporada |");
             System.err.println("| 3)               Inserta un nuevo partido               |");
             System.err.println("| 4)               Estadisticas por jugador               |");
             System.err.println("| 5)                 Partidos realizados                  |");
             System.err.println("| 6)                  Salir del sistema                   |");
             System.err.println("|         Seleccione la opcion que desea realizar         |");
             System.err.println("-----------------------------------------------------------");
             
             option = sc.nextInt();

            switch (option) {
                case 1: //Ver a los jugadores A y B
                    
                    break;
                case 2: //Ver a los jugadores con mas de 5 goles en temporada
                    break;

                case 3: //Insertar un nuevo partido, aqui se saca la logica de jugadores que mas goles hicieron en el partido 
                     break;

                case 4: //Estadisticas de jugador
                    break;

                case 5: //partidos realizados, seleccionar partido por fecha/ equipo
                    break;

                case 6: //Salir del sistema
                     System.err.println(" Gracias por preferirnos, regrese pronto! ");
                    break;
                default:
                    System.err.println(" La opcion que selecciono no existe ");
            }
            
        } while (option != 0);

        sc.close();


    }
}
