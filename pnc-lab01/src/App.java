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

                   System.out.println("\nJugadores con mas de 5 goles (ordenados por goles):");

                 // Creamos una lista vacia que nos ayudara a recolectar a todos los jugadores
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
                     System.out.println("No hay jugadores con mas de 5 goles todavia en esta temporada");
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
                     
                    /*
                    //tenemos que crear un nuevo scanner para poder revisar todas las cosas, porque lo tenemos en todas partes jajajaja

                     Scanner scanner = new Scanner(System.in);
    
                     System.out.println("Ingrese la fecha del partido (Formato: yyyy-MM-dd): ");
                     String fechaString = scanner.nextLine();
                     Date fechaPartido = null;
    
                     try {
                     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                     fechaPartido = dateFormat.parse(fechaString);
                        } catch (ParseException e) {
                          System.out.println("Error al ingresar la fecha. El formato debe ser yyyy-MM-dd.");
                         break;
                     }

                     //Averiguamos quien gano si el equipo A o B

                     System.out.println("¿Quien gano el partido? (A/B): ");
                     String ganador = scanner.nextLine().toUpperCase();

                     //Averiguamos como quedo el marcador, iniciamos siempre con q van 0 a 0 
                     System.out.println("Ingrese el número de goles de " + (ganador.equals("A") ? "Equipo A" : "Equipo B") + ": ");
                     int golesEquipoA = 0;
                     int golesEquipoB = 0;

                     //Armamos la condicion para q me diga quien gano 
                     if (ganador.equals("A")) {
                         golesEquipoA = 1;
                         golesEquipoB = 0;
                     } else {
                         golesEquipoA = 0;
                         golesEquipoB = 1;
                     }

                     //Ya que sabemos eso, tenemos que saber ahora quienes hicieron estos goles si es que los hubo y no quedo 0 a 0
                     
                     System.out,println("¿Cuantos jugadores hicieron goles?");
                     int numJugadores = Integer.parseInt(scanner.nextLine());

                     //Aca ya tenemos que pensar en que se tiene que ingresar el id, la cantidad de goles e ir a actulizar los goles de ese jugador para que concuerde 

                    for (int i = 1; i <= numJugadores; i++) {
                        System.out.println("Ingrese el ID del jugador " + i + ": ");
                        int jugadorId = Integer.parseInt(scanner.nextLine());
                        System.out.println("Ingrese los goles anotados por el jugador " + i + ": ");
                        int golesJugador = Integer.parseInt(scanner.nextLine());

                    // Buscar al jugador y actualizar sus goles
                       boolean jugadorEncontrado = false;
                       for (Team equipo : TeamData.equipo) {
                           for (Player jugador : equipo.getPlayers()) {
                                if (jugador.getId() == jugadorId) {
                                    jugador.setScoredGoals(jugador.getScoredGoals() + golesJugador); // Aqui actualizamos los goles del jugador
                                    jugadorEncontrado = true;
                    break;
                                }
                          }
                      if (jugadorEncontrado) break; // Si el jugador fue encontrado, salimos del bucle
                      }
                    }

                    //Tenemos que hacer una condicion en el caso de que el partido quede 0 a 0 porque sino capas que crashea jajajaja
                    if(numJugadores ==0){
                       golesEquipoA = 0;
                       golesEquipoB = 0;
                    } //No se si esto funciona

                    //Tenemos que guardar todo lo nuevo de este partido

                    Match nuevoPartido = new Match();
                    nuevoPartido.setDate(fechaPartido);
                    //Primero va A en nuestra lista de team asi q asi quedaria
                    nuevoPartido.setTeamA(TeamData.equipo.get(0));
                    nuevoPartido.setTeamA(TeamData.equipo.get(1));

                    nuevoPartido.setTeamAGoals(golesEquipoA);
                    nuevoPartido.setTeamBGoals(golesEquipoB);

                    //Esto es pura avaricia creo yo
                    MatchData.insertMatch(nuevoPartido);
                    
                    System.out.println("Se ha registrado su partido");
                    */

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
