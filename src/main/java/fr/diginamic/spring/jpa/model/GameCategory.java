package fr.diginamic.spring.jpa.model;

public enum GameCategory {
    FPS("First Person Shooter", "DOOM"),
    MOBA("MOBA", "DotA"),
    MMORPG("Massively...RPG", "Ragnarok"),
    RPG("Role Playing Game", "The Witcher"),
    ROGUELIKE("Roguelike", "Rogue"),
    METROIDVANIA("Metroidvania", "Super Metroid"),
    PLATFORM("Platformer", "Mario"),
    ROCKET_LEAGUE("Rocket League", "Rocket League"),
    RACING("Racing", "Formula 1");

    private String displayName;
    private String firstGameName;

    GameCategory(String displayName, String firstGameName) {
        this.displayName = displayName;
        this.firstGameName = firstGameName;
    }
}
