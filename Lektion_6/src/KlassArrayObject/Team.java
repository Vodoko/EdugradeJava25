package KlassArrayObject;

public class Team {
    private Player[] players;
    private int membersCount;

    //Otroliga problem med denna konstruktor, tror att jag hade skrivit fel ovan (members istället för)
    public Team(int size) {
        players = new Player[size];
        membersCount = 0;
    }

    public void addMember(Player player) {
        if (players.length > membersCount) {
            players[membersCount] = player;
            membersCount++;
        } else System.out.println("Team is full!");
    }

    public void listPlayers() {
        for (int i = 0; i < membersCount; i++) {
            System.out.println(players[i].getName());
        }
    }
}
