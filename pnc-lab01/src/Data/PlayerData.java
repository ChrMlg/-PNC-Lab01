package Data;

import java.util.LinkedList;
import Class.Player;
import Class.Team;
import Enum.PlayerRole;

public class PlayerData {
    public LinkedList<Player> createPlayersRealMadrid() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Courtois", PlayerRole.portero));
        jugadores.add(new Player("Carvajal", PlayerRole.defensa));
        jugadores.add(new Player("Militao", PlayerRole.defensa));
        jugadores.add(new Player("Alaba", PlayerRole.defensa));
        jugadores.add(new Player("Mendy", PlayerRole.defensa));
        jugadores.add(new Player("Modric", PlayerRole.mediocampista));
        jugadores.add(new Player("Casemiro", PlayerRole.mediocampista));
        jugadores.add(new Player("Kroos", PlayerRole.mediocampista));
        jugadores.add(new Player("Valverde", PlayerRole.mediocampista));
        jugadores.add(new Player("Vinicius", PlayerRole.delantero));
        jugadores.add(new Player("Benzema", PlayerRole.delantero));
        jugadores.add(new Player("Lunin", PlayerRole.portero));
        jugadores.add(new Player("Nacho", PlayerRole.defensa));
        jugadores.add(new Player("Rudiger", PlayerRole.defensa));
        jugadores.add(new Player("Odriozola", PlayerRole.defensa));
        jugadores.add(new Player("Tchouameni", PlayerRole.mediocampista));
        jugadores.add(new Player("Camavinga", PlayerRole.mediocampista));
        jugadores.add(new Player("Asensio", PlayerRole.delantero));
        jugadores.add(new Player("Hazard", PlayerRole.delantero));
        jugadores.add(new Player("Rodrygo", PlayerRole.delantero));
        jugadores.add(new Player("Mariano", PlayerRole.delantero));
        jugadores.add(new Player("Ceballos", PlayerRole.mediocampista));
        jugadores.add(new Player("Vallejo", PlayerRole.defensa));
        jugadores.add(new Player("Lucas V.", PlayerRole.defensa));
        jugadores.add(new Player("Reinier", PlayerRole.mediocampista));
        return jugadores;
    }

    public LinkedList<Player> createPlayersBarcelona() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Ter Stegen", PlayerRole.portero));
        jugadores.add(new Player("Araujo", PlayerRole.defensa));
        jugadores.add(new Player("Pique", PlayerRole.defensa));
        jugadores.add(new Player("Garcia", PlayerRole.defensa));
        jugadores.add(new Player("Alba", PlayerRole.defensa));
        jugadores.add(new Player("Busquets", PlayerRole.mediocampista));
        jugadores.add(new Player("Pedri", PlayerRole.mediocampista));
        jugadores.add(new Player("Gavi", PlayerRole.mediocampista));
        jugadores.add(new Player("Dembele", PlayerRole.delantero));
        jugadores.add(new Player("Lewandowski", PlayerRole.delantero));
        jugadores.add(new Player("Fati", PlayerRole.delantero));
        jugadores.add(new Player("Pena", PlayerRole.portero));
        jugadores.add(new Player("Christensen", PlayerRole.defensa));
        jugadores.add(new Player("Kounde", PlayerRole.defensa));
        jugadores.add(new Player("Roberto", PlayerRole.defensa));
        jugadores.add(new Player("De Jong", PlayerRole.mediocampista));
        jugadores.add(new Player("Torres", PlayerRole.delantero));
        jugadores.add(new Player("Raphinha", PlayerRole.delantero));
        jugadores.add(new Player("Depay", PlayerRole.delantero));
        jugadores.add(new Player("Kessie", PlayerRole.mediocampista));
        jugadores.add(new Player("Alonso", PlayerRole.defensa));
        jugadores.add(new Player("Bellerin", PlayerRole.defensa));
        jugadores.add(new Player("Casado", PlayerRole.mediocampista));
        jugadores.add(new Player("Yamal", PlayerRole.delantero));
        jugadores.add(new Player("Torre", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersManchesterCity() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Ederson", PlayerRole.portero));
        jugadores.add(new Player("Walker", PlayerRole.defensa));
        jugadores.add(new Player("Dias", PlayerRole.defensa));
        jugadores.add(new Player("Laporte", PlayerRole.defensa));
        jugadores.add(new Player("Cancelo", PlayerRole.defensa));
        jugadores.add(new Player("De Bruyne", PlayerRole.mediocampista));
        jugadores.add(new Player("Rodri", PlayerRole.mediocampista));
        jugadores.add(new Player("Gundogan", PlayerRole.mediocampista));
        jugadores.add(new Player("Mahrez", PlayerRole.delantero));
        jugadores.add(new Player("Haaland", PlayerRole.delantero));
        jugadores.add(new Player("Foden", PlayerRole.delantero));
        jugadores.add(new Player("Ortega", PlayerRole.portero));
        jugadores.add(new Player("Akanji", PlayerRole.defensa));
        jugadores.add(new Player("Stones", PlayerRole.defensa));
        jugadores.add(new Player("Gomez", PlayerRole.defensa));
        jugadores.add(new Player("Phillips", PlayerRole.mediocampista));
        jugadores.add(new Player("Silva", PlayerRole.mediocampista));
        jugadores.add(new Player("Palmer", PlayerRole.delantero));
        jugadores.add(new Player("Alvarez", PlayerRole.delantero));
        jugadores.add(new Player("Grealish", PlayerRole.delantero));
        jugadores.add(new Player("Lewis", PlayerRole.mediocampista));
        jugadores.add(new Player("Perrone", PlayerRole.mediocampista));
        jugadores.add(new Player("Robertson", PlayerRole.defensa));
        jugadores.add(new Player("Charles", PlayerRole.mediocampista));
        jugadores.add(new Player("Katongo", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersLiverpool() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Alisson", PlayerRole.portero));
        jugadores.add(new Player("Alexander-Arnold", PlayerRole.defensa));
        jugadores.add(new Player("Matip", PlayerRole.defensa));
        jugadores.add(new Player("Van Dijk", PlayerRole.defensa));
        jugadores.add(new Player("Robertson", PlayerRole.defensa));
        jugadores.add(new Player("Henderson", PlayerRole.mediocampista));
        jugadores.add(new Player("Fabinho", PlayerRole.mediocampista));
        jugadores.add(new Player("Thiago", PlayerRole.mediocampista));
        jugadores.add(new Player("Salah", PlayerRole.delantero));
        jugadores.add(new Player("Nunez", PlayerRole.delantero));
        jugadores.add(new Player("Diaz", PlayerRole.delantero));
        jugadores.add(new Player("Kelleher", PlayerRole.portero));
        jugadores.add(new Player("Gomez", PlayerRole.defensa));
        jugadores.add(new Player("Konate", PlayerRole.defensa));
        jugadores.add(new Player("Tsimikas", PlayerRole.defensa));
        jugadores.add(new Player("Bajcetic", PlayerRole.mediocampista));
        jugadores.add(new Player("Elliott", PlayerRole.mediocampista));
        jugadores.add(new Player("Jones", PlayerRole.mediocampista));
        jugadores.add(new Player("Jota", PlayerRole.delantero));
        jugadores.add(new Player("Gakpo", PlayerRole.delantero));
        jugadores.add(new Player("Arthur", PlayerRole.mediocampista));
        jugadores.add(new Player("Carvalho", PlayerRole.mediocampista));
        jugadores.add(new Player("Ramsay", PlayerRole.defensa));
        jugadores.add(new Player("Clark", PlayerRole.mediocampista));
        jugadores.add(new Player("Doak", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersBayernMunich() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Neuer", PlayerRole.portero));
        jugadores.add(new Player("Pavard", PlayerRole.defensa));
        jugadores.add(new Player("Upamecano", PlayerRole.defensa));
        jugadores.add(new Player("De Ligt", PlayerRole.defensa));
        jugadores.add(new Player("Davies", PlayerRole.defensa));
        jugadores.add(new Player("Kimmich", PlayerRole.mediocampista));
        jugadores.add(new Player("Goretzka", PlayerRole.mediocampista));
        jugadores.add(new Player("Muller", PlayerRole.mediocampista));
        jugadores.add(new Player("Sane", PlayerRole.delantero));
        jugadores.add(new Player("Musiala", PlayerRole.delantero));
        jugadores.add(new Player("Mane", PlayerRole.delantero));
        jugadores.add(new Player("Ulreich", PlayerRole.portero));
        jugadores.add(new Player("Cancelo", PlayerRole.defensa));
        jugadores.add(new Player("Blind", PlayerRole.defensa));
        jugadores.add(new Player("Stanisic", PlayerRole.defensa));
        jugadores.add(new Player("Gnabry", PlayerRole.delantero));
        jugadores.add(new Player("Coman", PlayerRole.delantero));
        jugadores.add(new Player("Gravenberch", PlayerRole.mediocampista));
        jugadores.add(new Player("Tel", PlayerRole.delantero));
        jugadores.add(new Player("Wanner", PlayerRole.mediocampista));
        jugadores.add(new Player("Vidovic", PlayerRole.mediocampista));
        jugadores.add(new Player("Mazraoui", PlayerRole.defensa));
        jugadores.add(new Player("Sarr", PlayerRole.defensa));
        jugadores.add(new Player("Ibrahimovic", PlayerRole.delantero));
        jugadores.add(new Player("Zvonarek", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersParisSaintGermain() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Donnarumma", PlayerRole.portero));
        jugadores.add(new Player("Hakimi", PlayerRole.defensa));
        jugadores.add(new Player("Marquinhos", PlayerRole.defensa));
        jugadores.add(new Player("Ramos", PlayerRole.defensa));
        jugadores.add(new Player("Mendes", PlayerRole.defensa));
        jugadores.add(new Player("Verratti", PlayerRole.mediocampista));
        jugadores.add(new Player("Vitinha", PlayerRole.mediocampista));
        jugadores.add(new Player("Ruiz", PlayerRole.mediocampista));
        jugadores.add(new Player("Messi", PlayerRole.delantero));
        jugadores.add(new Player("Neymar", PlayerRole.delantero));
        jugadores.add(new Player("Mbappe", PlayerRole.delantero));
        jugadores.add(new Player("Rico", PlayerRole.portero));
        jugadores.add(new Player("Kimpembe", PlayerRole.defensa));
        jugadores.add(new Player("Pereira", PlayerRole.mediocampista));
        jugadores.add(new Player("Mukiele", PlayerRole.defensa));
        jugadores.add(new Player("Soler", PlayerRole.mediocampista));
        jugadores.add(new Player("Zaire-Emery", PlayerRole.mediocampista));
        jugadores.add(new Player("Gharbi", PlayerRole.delantero));
        jugadores.add(new Player("Ekitike", PlayerRole.delantero));
        jugadores.add(new Player("Bitshiabu", PlayerRole.defensa));
        jugadores.add(new Player("Housni", PlayerRole.delantero));
        jugadores.add(new Player("Lemina", PlayerRole.mediocampista));
        jugadores.add(new Player("El Hannach", PlayerRole.mediocampista));
        jugadores.add(new Player("Gassama", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersJuventus() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Szczesny", PlayerRole.portero));
        jugadores.add(new Player("Danilo", PlayerRole.defensa));
        jugadores.add(new Player("Bremer", PlayerRole.defensa));
        jugadores.add(new Player("Bonucci", PlayerRole.defensa));
        jugadores.add(new Player("De Sciglio", PlayerRole.defensa));
        jugadores.add(new Player("Locatelli", PlayerRole.mediocampista));
        jugadores.add(new Player("Rabiot", PlayerRole.mediocampista));
        jugadores.add(new Player("Kostic", PlayerRole.mediocampista));
        jugadores.add(new Player("Di Maria", PlayerRole.delantero));
        jugadores.add(new Player("Vlahovic", PlayerRole.delantero));
        jugadores.add(new Player("Chiesa", PlayerRole.delantero));
        jugadores.add(new Player("Perin", PlayerRole.portero));
        jugadores.add(new Player("Rugani", PlayerRole.defensa));
        jugadores.add(new Player("Gatti", PlayerRole.defensa));
        jugadores.add(new Player("Cuadrado", PlayerRole.defensa));
        jugadores.add(new Player("Paredes", PlayerRole.mediocampista));
        jugadores.add(new Player("Miretti", PlayerRole.mediocampista));
        jugadores.add(new Player("Fagioli", PlayerRole.mediocampista));
        jugadores.add(new Player("Kean", PlayerRole.delantero));
        jugadores.add(new Player("Milik", PlayerRole.delantero));
        jugadores.add(new Player("Iling-Junior", PlayerRole.mediocampista));
        jugadores.add(new Player("Barbieri", PlayerRole.defensa));
        jugadores.add(new Player("Soulé", PlayerRole.mediocampista));
        jugadores.add(new Player("Compagnon", PlayerRole.delantero));
        jugadores.add(new Player("Cerri", PlayerRole.delantero));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersInterMilan() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Onana", PlayerRole.portero));
        jugadores.add(new Player("Dumfries", PlayerRole.defensa));
        jugadores.add(new Player("Acerbi", PlayerRole.defensa));
        jugadores.add(new Player("Bastoni", PlayerRole.defensa));
        jugadores.add(new Player("Dimarco", PlayerRole.defensa));
        jugadores.add(new Player("Barella", PlayerRole.mediocampista));
        jugadores.add(new Player("Brozovic", PlayerRole.mediocampista));
        jugadores.add(new Player("Calhanoglu", PlayerRole.mediocampista));
        jugadores.add(new Player("Lukaku", PlayerRole.delantero));
        jugadores.add(new Player("Martinez", PlayerRole.delantero));
        jugadores.add(new Player("Dzeko", PlayerRole.delantero));
        jugadores.add(new Player("Handanovic", PlayerRole.portero));
        jugadores.add(new Player("De Vrij", PlayerRole.defensa));
        jugadores.add(new Player("Darmian", PlayerRole.defensa));
        jugadores.add(new Player("Gosens", PlayerRole.defensa));
        jugadores.add(new Player("Gagliardini", PlayerRole.mediocampista));
        jugadores.add(new Player("Mkhitaryan", PlayerRole.mediocampista));
        jugadores.add(new Player("Asllani", PlayerRole.mediocampista));
        jugadores.add(new Player("Correa", PlayerRole.delantero));
        jugadores.add(new Player("Bellanova", PlayerRole.defensa));
        jugadores.add(new Player("Cordaz", PlayerRole.portero));
        jugadores.add(new Player("Fontanarosa", PlayerRole.defensa));
        jugadores.add(new Player("Carboni", PlayerRole.mediocampista));
        jugadores.add(new Player("Stankovic", PlayerRole.mediocampista));
        jugadores.add(new Player("Zanotti", PlayerRole.defensa));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersACMilan() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Maignan", PlayerRole.portero));
        jugadores.add(new Player("Calabria", PlayerRole.defensa));
        jugadores.add(new Player("Kalulu", PlayerRole.defensa));
        jugadores.add(new Player("Tomori", PlayerRole.defensa));
        jugadores.add(new Player("Hernandez", PlayerRole.defensa));
        jugadores.add(new Player("Tonali", PlayerRole.mediocampista));
        jugadores.add(new Player("Bennacer", PlayerRole.mediocampista));
        jugadores.add(new Player("Krunic", PlayerRole.mediocampista));
        jugadores.add(new Player("Leao", PlayerRole.delantero));
        jugadores.add(new Player("Giroud", PlayerRole.delantero));
        jugadores.add(new Player("Diaz", PlayerRole.delantero));
        jugadores.add(new Player("Tatarusanu", PlayerRole.portero));
        jugadores.add(new Player("Kjaer", PlayerRole.defensa));
        jugadores.add(new Player("Thiaw", PlayerRole.defensa));
        jugadores.add(new Player("Dest", PlayerRole.defensa));
        jugadores.add(new Player("Vranckx", PlayerRole.mediocampista));
        jugadores.add(new Player("Pobega", PlayerRole.mediocampista));
        jugadores.add(new Player("Adli", PlayerRole.mediocampista));
        jugadores.add(new Player("De Ketelaere", PlayerRole.delantero));
        jugadores.add(new Player("Origi", PlayerRole.delantero));
        jugadores.add(new Player("Ibrahimovic", PlayerRole.delantero));
        jugadores.add(new Player("Mirante", PlayerRole.portero));
        jugadores.add(new Player("Ballo-Toure", PlayerRole.defensa));
        jugadores.add(new Player("Gabbia", PlayerRole.defensa));
        jugadores.add(new Player("Lazetic", PlayerRole.delantero));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersBorussiaDortmund() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Kobel", PlayerRole.portero));
        jugadores.add(new Player("Ryerson", PlayerRole.defensa));
        jugadores.add(new Player("Sule", PlayerRole.defensa));
        jugadores.add(new Player("Schlotterbeck", PlayerRole.defensa));
        jugadores.add(new Player("Guerreiro", PlayerRole.defensa));
        jugadores.add(new Player("Bellingham", PlayerRole.mediocampista));
        jugadores.add(new Player("Ozcan", PlayerRole.mediocampista));
        jugadores.add(new Player("Reus", PlayerRole.mediocampista));
        jugadores.add(new Player("Brandt", PlayerRole.delantero));
        jugadores.add(new Player("Haller", PlayerRole.delantero));
        jugadores.add(new Player("Adeyemi", PlayerRole.delantero));
        jugadores.add(new Player("Meyer", PlayerRole.portero));
        jugadores.add(new Player("Hummels", PlayerRole.defensa));
        jugadores.add(new Player("Can", PlayerRole.mediocampista));
        jugadores.add(new Player("Dahoud", PlayerRole.mediocampista));
        jugadores.add(new Player("Reyna", PlayerRole.mediocampista));
        jugadores.add(new Player("Malen", PlayerRole.delantero));
        jugadores.add(new Player("Moukoko", PlayerRole.delantero));
        jugadores.add(new Player("Modeste", PlayerRole.delantero));
        jugadores.add(new Player("Passlack", PlayerRole.defensa));
        jugadores.add(new Player("Rothe", PlayerRole.defensa));
        jugadores.add(new Player("Kamara", PlayerRole.mediocampista));
        jugadores.add(new Player("Papadopoulos", PlayerRole.defensa));
        jugadores.add(new Player("Coulibaly", PlayerRole.defensa));
        jugadores.add(new Player("Bynoe-Gittens", PlayerRole.delantero));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersAtleticoMadrid() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Oblak", PlayerRole.portero));
        jugadores.add(new Player("Molina", PlayerRole.defensa));
        jugadores.add(new Player("Savic", PlayerRole.defensa));
        jugadores.add(new Player("Gimenez", PlayerRole.defensa));
        jugadores.add(new Player("Reinildo", PlayerRole.defensa));
        jugadores.add(new Player("Llorente", PlayerRole.mediocampista));
        jugadores.add(new Player("Koke", PlayerRole.mediocampista));
        jugadores.add(new Player("De Paul", PlayerRole.mediocampista));
        jugadores.add(new Player("Carrasco", PlayerRole.delantero));
        jugadores.add(new Player("Griezmann", PlayerRole.delantero));
        jugadores.add(new Player("Morata", PlayerRole.delantero));
        jugadores.add(new Player("Grbic", PlayerRole.portero));
        jugadores.add(new Player("Reguilon", PlayerRole.defensa));
        jugadores.add(new Player("Witsel", PlayerRole.mediocampista));
        jugadores.add(new Player("Hermoso", PlayerRole.defensa));
        jugadores.add(new Player("Kondogbia", PlayerRole.mediocampista));
        jugadores.add(new Player("Lemar", PlayerRole.mediocampista));
        jugadores.add(new Player("Barrios", PlayerRole.mediocampista));
        jugadores.add(new Player("Correa", PlayerRole.delantero));
        jugadores.add(new Player("Depay", PlayerRole.delantero));
        jugadores.add(new Player("Doherty", PlayerRole.defensa));
        jugadores.add(new Player("Gomis", PlayerRole.defensa));
        jugadores.add(new Player("Moreno", PlayerRole.delantero));
        jugadores.add(new Player("Diez", PlayerRole.mediocampista));
        jugadores.add(new Player("Iturbe", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersSevilla() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Bono", PlayerRole.portero));
        jugadores.add(new Player("Navas", PlayerRole.defensa));
        jugadores.add(new Player("Bade", PlayerRole.defensa));
        jugadores.add(new Player("Gudelj", PlayerRole.defensa));
        jugadores.add(new Player("Acuna", PlayerRole.defensa));
        jugadores.add(new Player("Jordan", PlayerRole.mediocampista));
        jugadores.add(new Player("Fernando", PlayerRole.mediocampista));
        jugadores.add(new Player("Rakitic", PlayerRole.mediocampista));
        jugadores.add(new Player("Torres", PlayerRole.delantero));
        jugadores.add(new Player("En-Nesyri", PlayerRole.delantero));
        jugadores.add(new Player("Lamela", PlayerRole.delantero));
        jugadores.add(new Player("Dmitrovic", PlayerRole.portero));
        jugadores.add(new Player("Montiel", PlayerRole.defensa));
        jugadores.add(new Player("Nianzou", PlayerRole.defensa));
        jugadores.add(new Player("Rekik", PlayerRole.defensa));
        jugadores.add(new Player("Telles", PlayerRole.defensa));
        jugadores.add(new Player("Gueye", PlayerRole.mediocampista));
        jugadores.add(new Player("Oliver", PlayerRole.mediocampista));
        jugadores.add(new Player("Gomez", PlayerRole.delantero));
        jugadores.add(new Player("Gil", PlayerRole.delantero));
        jugadores.add(new Player("Mir", PlayerRole.delantero));
        jugadores.add(new Player("Januzaj", PlayerRole.delantero));
        jugadores.add(new Player("Ortiz", PlayerRole.defensa));
        jugadores.add(new Player("Alvarez", PlayerRole.mediocampista));
        jugadores.add(new Player("Salas", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersArsenal() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Ramsdale", PlayerRole.portero));
        jugadores.add(new Player("White", PlayerRole.defensa));
        jugadores.add(new Player("Saliba", PlayerRole.defensa));
        jugadores.add(new Player("Gabriel", PlayerRole.defensa));
        jugadores.add(new Player("Zinchenko", PlayerRole.defensa));
        jugadores.add(new Player("Odegaard", PlayerRole.mediocampista));
        jugadores.add(new Player("Partey", PlayerRole.mediocampista));
        jugadores.add(new Player("Xhaka", PlayerRole.mediocampista));
        jugadores.add(new Player("Saka", PlayerRole.delantero));
        jugadores.add(new Player("Jesus", PlayerRole.delantero));
        jugadores.add(new Player("Martinelli", PlayerRole.delantero));
        jugadores.add(new Player("Turner", PlayerRole.portero));
        jugadores.add(new Player("Tierney", PlayerRole.defensa));
        jugadores.add(new Player("Kiwior", PlayerRole.defensa));
        jugadores.add(new Player("Holding", PlayerRole.defensa));
        jugadores.add(new Player("Jorginho", PlayerRole.mediocampista));
        jugadores.add(new Player("Vieira", PlayerRole.mediocampista));
        jugadores.add(new Player("Smith Rowe", PlayerRole.mediocampista));
        jugadores.add(new Player("Nelson", PlayerRole.delantero));
        jugadores.add(new Player("Trossard", PlayerRole.delantero));
        jugadores.add(new Player("Nketiah", PlayerRole.delantero));
        jugadores.add(new Player("Hein", PlayerRole.portero));
        jugadores.add(new Player("Walters", PlayerRole.defensa));
        jugadores.add(new Player("Cozier-Duberry", PlayerRole.mediocampista));
        jugadores.add(new Player("Lewis-Skelly", PlayerRole.mediocampista));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersChelsea() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Kepa", PlayerRole.portero));
        jugadores.add(new Player("James", PlayerRole.defensa));
        jugadores.add(new Player("Silva", PlayerRole.defensa));
        jugadores.add(new Player("Koulibaly", PlayerRole.defensa));
        jugadores.add(new Player("Chilwell", PlayerRole.defensa));
        jugadores.add(new Player("Enzo", PlayerRole.mediocampista));
        jugadores.add(new Player("Kante", PlayerRole.mediocampista));
        jugadores.add(new Player("Kovacic", PlayerRole.mediocampista));
        jugadores.add(new Player("Mount", PlayerRole.delantero));
        jugadores.add(new Player("Havertz", PlayerRole.delantero));
        jugadores.add(new Player("Felix", PlayerRole.delantero));
        jugadores.add(new Player("Mendy", PlayerRole.portero));
        jugadores.add(new Player("Badiashile", PlayerRole.defensa));
        jugadores.add(new Player("Fofana", PlayerRole.defensa));
        jugadores.add(new Player("Azpilicueta", PlayerRole.defensa));
        jugadores.add(new Player("Loftus-Cheek", PlayerRole.mediocampista));
        jugadores.add(new Player("Zakaria", PlayerRole.mediocampista));
        jugadores.add(new Player("Gallagher", PlayerRole.mediocampista));
        jugadores.add(new Player("Mudryk", PlayerRole.delantero));
        jugadores.add(new Player("Pulisic", PlayerRole.delantero));
        jugadores.add(new Player("Aubameyang", PlayerRole.delantero));
        jugadores.add(new Player("Sterling", PlayerRole.delantero));
        jugadores.add(new Player("Ziyech", PlayerRole.delantero));
        jugadores.add(new Player("Chalobah", PlayerRole.defensa));
        jugadores.add(new Player("Cucurella", PlayerRole.defensa));
        return jugadores;
    }
    
    public  LinkedList<Player> createPlayersAjax() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Rulli", PlayerRole.portero));
        jugadores.add(new Player("Rensch", PlayerRole.defensa));
        jugadores.add(new Player("Timber", PlayerRole.defensa));
        jugadores.add(new Player("Bassey", PlayerRole.defensa));
        jugadores.add(new Player("Wijndal", PlayerRole.defensa));
        jugadores.add(new Player("Alvarez", PlayerRole.mediocampista));
        jugadores.add(new Player("Berghuis", PlayerRole.mediocampista));
        jugadores.add(new Player("Kudus", PlayerRole.mediocampista));
        jugadores.add(new Player("Tadic", PlayerRole.delantero));
        jugadores.add(new Player("Bergwijn", PlayerRole.delantero));
        jugadores.add(new Player("Brobbey", PlayerRole.delantero));
        jugadores.add(new Player("Gorter", PlayerRole.portero));
        jugadores.add(new Player("Sanchez", PlayerRole.defensa));
        jugadores.add(new Player("Ocampos", PlayerRole.delantero));
        jugadores.add(new Player("Klaassen", PlayerRole.mediocampista));
        jugadores.add(new Player("Conceiçao", PlayerRole.mediocampista));
        jugadores.add(new Player("Taylor", PlayerRole.mediocampista));
        jugadores.add(new Player("Regeer", PlayerRole.mediocampista));
        jugadores.add(new Player("Lucca", PlayerRole.delantero));
        jugadores.add(new Player("Baas", PlayerRole.defensa));
        jugadores.add(new Player("Hlynsson", PlayerRole.mediocampista));
        jugadores.add(new Player("Fitz-Jim", PlayerRole.mediocampista));
        jugadores.add(new Player("Idumbo-Muzambo", PlayerRole.mediocampista));
        jugadores.add(new Player("Vos", PlayerRole.mediocampista));
        jugadores.add(new Player("Aertssen", PlayerRole.defensa));
        return jugadores;
    }

    public  LinkedList<Player> createPlayersPorto() {
        LinkedList<Player> jugadores = new LinkedList<>();
        jugadores.add(new Player("Costa", PlayerRole.portero));
        jugadores.add(new Player("Conceiçao", PlayerRole.defensa));
        jugadores.add(new Player("Pepe", PlayerRole.defensa));
        jugadores.add(new Player("Marcano", PlayerRole.defensa));
        jugadores.add(new Player("Wendell", PlayerRole.defensa));
        jugadores.add(new Player("Uribe", PlayerRole.mediocampista));
        jugadores.add(new Player("Grujic", PlayerRole.mediocampista));
        jugadores.add(new Player("Otavio", PlayerRole.mediocampista));
        jugadores.add(new Player("Galeno", PlayerRole.delantero));
        jugadores.add(new Player("Taremi", PlayerRole.delantero));
        jugadores.add(new Player("Evanilson", PlayerRole.delantero));
        jugadores.add(new Player("Ramos", PlayerRole.portero));
        jugadores.add(new Player("Cardoso", PlayerRole.defensa));
        jugadores.add(new Player("Carmo", PlayerRole.defensa));
        jugadores.add(new Player("Sanusi", PlayerRole.defensa));
        jugadores.add(new Player("Eustaquio", PlayerRole.mediocampista));
        jugadores.add(new Player("Franco", PlayerRole.mediocampista));
        jugadores.add(new Player("Bernardo", PlayerRole.delantero));
        jugadores.add(new Player("Folha", PlayerRole.mediocampista));
        jugadores.add(new Player("Loader", PlayerRole.delantero));
        jugadores.add(new Player("Martinez", PlayerRole.delantero));
        jugadores.add(new Player("Namaso", PlayerRole.mediocampista));
        jugadores.add(new Player("Sousa", PlayerRole.delantero));
        jugadores.add(new Player("Varela", PlayerRole.mediocampista));
        jugadores.add(new Player("Wenderson", PlayerRole.defensa));
        return jugadores;
    }

    public LinkedList<Team> createTeamsList() {
        LinkedList<Team> equipos = new LinkedList<Team>();
        equipos.add(new Team("Real Madrid",createPlayersRealMadrid()));
        equipos.add(new Team("Barcelona",createPlayersBarcelona()));
        equipos.add(new Team("Manchester City",createPlayersManchesterCity()));
        equipos.add(new Team("Liverpool",createPlayersLiverpool()));
        equipos.add(new Team("Bayern Munich",createPlayersBayernMunich()));
        equipos.add(new Team("Paris Saint-Germain",createPlayersParisSaintGermain()));
        equipos.add(new Team("Juventus",createPlayersJuventus()));
        equipos.add(new Team("Inter de Milán",createPlayersInterMilan()));
        equipos.add(new Team("AC Milan",createPlayersACMilan()));
        equipos.add(new Team("Borussia Dortmund",createPlayersBorussiaDortmund()));
        equipos.add( new Team("Atlético de Madrid",createPlayersAtleticoMadrid()));
        equipos.add( new Team("Sevilla",createPlayersSevilla()));
        equipos.add( new Team("Arsenal",createPlayersArsenal()));
        equipos.add( new Team("Chelsea",createPlayersChelsea()));
        equipos.add( new Team("Ajax",createPlayersAjax()));
        equipos.add( new Team("Porto",createPlayersPorto()));
        return equipos;
    }
}
