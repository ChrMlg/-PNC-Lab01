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
                    /*
                    
                    Borrador de como sera la estructura cuando ya este lo de DATA

                     System.out.println("\n Lista de los jugadores ");
                    for(Team equipo : TeamData.equipo){
                        System.out.println("Equipo:" + equipo.getName());
                        for(Player jugador : equipo.getPlayers()){
                            System.out.println("ID: " + jugador.getId()+ "|Nombre:" + jugador.getName());
                        }
                        System.out.println(); 
                    }
                   
                    */
                    break;
                case 2: //Ver a los jugadores con mas de 5 goles en temporada

                    /*
                    Borrador de como sera la estructura cuando ya este DATA
                    Esto toma en cuenta que, se tendra que mostrar, id, nombre, rol y cantidad de goles >5

                   System.out.println("\nJugadores con más de 5 goles (ordenados por goles):");

                 // Creamos una lista vacía que recolectará todos los jugadores
                    List<Player> todosLosJugadores = new ArrayList<>();

                   for (Team equipo : TeamData.equipo) {
                      todosLosJugadores.addAll(equipo.getPlayers());
                   }

                 // Ocupamos Streams para filtrar, ordenar y mostrar
                    List<Player> jugadoresFiltrados = todosLosJugadores.stream()
                                 .filter(jugador -> jugador.getScoredGoals() > 5)
                                 .sorted(Comparator.comparingInt(Player::getScoredGoals).reversed())
                                 .collect(Collectors.toList());

                 //Para tenerlo mas ordenado podemos hacer un ranking de mas a menos goles siempre bajo la condicion que hicimos antes
                     if (jugadoresFiltrados.isEmpty()) {
                     System.out.println("No hay jugadores con más de 5 goles todavia en esta temporada");
                     } else {
                        jugadoresFiltrados.forEach(jugador -> {
                        System.out.println("ID: " + jugador.getId()
                                                + " | Nombre: " + jugador.getName()
                                                + " | Rol: " + jugador.getRole()
                                                + " | Goles: " + jugador.getScoredGoals());
                     });
                    }

                   
                    */
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
