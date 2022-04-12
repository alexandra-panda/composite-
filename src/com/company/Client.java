package com.company;

public class Client {
    public static void main(String[] args) {
        final String SEPERATOR = "***************************";
        Games gameType = new GameGenre("PC Games");
        gameType.addGame(createMiscGame());
        gameType.listGames();
        System.out.println(SEPERATOR);
        gameType.addGame(createSportGames());
        gameType.listGames();
        System.out.println(SEPERATOR);
        gameType.addGame(createRacingGames());
        gameType.listGames();
        System.out.println(SEPERATOR);
    }
    private static Games createSportGames() {
        Games sportGames = new GameGenre("Sport Games");
        Games fifa = new GameTitle("K1", 250);
        Games nba = new GameTitle("UFC 3", 660);
        sportGames.addGame(fifa);
        sportGames.addGame(nba);
        return sportGames;
    }
    private static Games createRacingGames() {
        Games racingGames = new GameGenre("Racing Games");
        Games nfs = new GameTitle("GTA", 300);
        Games realRacing = new GameTitle("Asphalt", 520);
        racingGames.addGame(nfs);
        racingGames.addGame(realRacing);
        return racingGames;
    }
    private static Games createMiscGame() {
        Games sims = new GameTitle("Barbie", 50);
        return sims;
    }
}