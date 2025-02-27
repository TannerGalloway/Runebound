import java.util.Objects;

public class RandomGen {

    public static int genRanNum(int limit) {
        return (int)(Math.random() * limit);
    }

    public static Room genRoom(String currentLocation) {
        // Gen data for the Room Object
        String roomVariation = genVariation(currentLocation);
        String description = genDescription(currentLocation, roomVariation);
        Item[] roomItems = genItems(currentLocation, roomVariation);
        Enemy[] roomEnemies = genEnemies(currentLocation, roomVariation);

        // Return new Room Object
        return new Room(description, roomVariation, roomItems, roomEnemies);
    }

    public static String genVariation(String currentLocation) {
        switch (currentLocation) {
            // Based on the current room, generate a variation of that room
            case "Forsaken Outpost":
                if(genRanNum(2) == 0) {
                    return "Frozen Barracks";
                }
                else {
                    return "Bloodied Watchtower";
                }

            case "Whispering Catacombs":
                if(genRanNum(2) == 0) {
                    return "Tomb of the Fallen King";
                }
                else {
                    return "Mausoleum of Endless Night";
                }

            case "Blighted Forest":
                if(genRanNum(2) == 0) {
                    return "Rotting Grove";
                }
                else {
                    return "Withering Hollow";
                }

            case "Crystalline Cavern":
                if(genRanNum(2) == 0) {
                    return "Shattered Cavern";
                }
                else {
                    return "Luminara Depths";
                }

            case "Throne of the Abyss":
                if(genRanNum(2) == 0) {
                    return "Sunken Throne";
                }
                else {
                    return "Ruined Citadel";
                }

            default:
                return "Forgotten Antechamber";
        }
    }

    public static String genDescription(String currentLocation, String currentVariation) {
        switch (currentLocation) {
            case "Forsaken Outpost":
                if(Objects.equals(currentVariation, "Frozen Barracks")) {
                    // Description for Frozen Barracks variation
                    return "The once-proud barracks are now encased in ice, with frost-covered skeletons standing guard. A chilling wind howls through the ruins.";
                }
                else {
                    // Description for Bloodied Watchtower variation
                    return "A ruined tower, its stone walls soaked in old blood. The air reeks of decay, and twisted figures stalk the shadows.";
                }


            case "Whispering Catacombs":
                if(Objects.equals(currentVariation, "Tomb of the Fallen King")) {
                    // Description for the Tomb of the Fallen King variation
                    return " A grand tomb filled with golden statues of a forgotten ruler, haunted by vengeful specters.";
                }
                else {
                    // Description for the Mausoleum of Endless Night variation
                    return "A shadowy crypt where torches flicker with eerie blue flames. The walls seem to whisper the names of the dead.";
                }

            case "Blighted Forest":
                if(Objects.equals(currentVariation, "Rotting Grove")) {
                    // Description for the Rotting Grove variation
                    return "The trees are blackened husks, their branches oozing with green venom. Insects buzz through the thick, unnatural fog.";
                }
                else {
                    // Description for the Withering Hollow variation
                    return "A lifeless swamp where the ground saps energy from all who walk upon it. The trees stand twisted, their roots forming skeletal shapes.";
                }

            case "Crystalline Cavern":
                if (Objects.equals(currentVariation, "Shattered Cavern")) {
                    // Description for the Shattered Cavern variation
                    return "The walls are jagged and broken, as if something massive forced its way through. Shards of glowing crystal litter the floor.";
                }
                else {
                    // Description for the Luminara Depths variation
                    return "Deep within the cavern, bioluminescent crystals pulse with energy, casting shifting patterns of light and shadow. The air hums with arcane power, and strange, glowing lifeforms skitter through the tunnels.";
                }

            case "Throne of the Abyss":
                if (Objects.equals(currentVariation, "Sunken Throne")) {
                    //Description for the Sunken Throne variation
                    return "A ruined palace submerged in dark waters, with the Abyssal Tyrant floating above a glowing abyss.";
                }
                else {
                    // Description for the Ruined Citadel Variation
                    return "A desolate throne room filled with the skeletal remains of fallen champions, their weapons rusted in time.";
                }

            default:
                return "A narrow corridor of crumbling stone, etched with faded carvings of a forgotten age. The air is damp, thick with decay, and flickering torches cast restless shadows. Distant skittering echoes through the darkness, a chilling reminder—you are not alone.";
        }
    }

    public static Item[] genItems(String currentLocation, String currentVariation) {
        switch (currentLocation) {
            // Items for the Forsaken Outpost
            case "Forsaken Outpost":
                if(Objects.equals(currentVariation, "Frozen Barracks")) {
                    // Items for Frozen Barracks variation
                    return new Item[]{
                            new Item("Frozen Dagger", "Weapon", 6, 2),
                            new Item("Glacial Gauntlets", "Armor", 0, 5)
                    };
                }
                else {
                    // Items for Bloodied Watchtower variation
                    return new Item[]{
                            new Item("Bloodstained Blade", "Weapon", 7, 2),
                            new Item("Crimson Fang", "Weapon", 8, 2)
                    };
                }


            case "Whispering Catacombs":
                // Items for the Whispering Catacombs
                if(Objects.equals(currentVariation, "Tomb of the Fallen King")) {
                    // Items for the Tomb of the Fallen King variation
                    return new Item[]{
                            new Item("Ghostly Rapier", "Weapon", 12, 4),
                            new Item("Crown of the Forgotten King", "Accessory", 0, 8)
                    };
                }
                else {
                    // Items for the Mausoleum of Endless Night variation
                    return new Item[]{
                            new Item("Ring of Lost Souls", "Accessory", 0, 7),
                            new Item("Lantern of the Damned", "Accessory", 0, 6)
                    };
                }

            case "Blighted Forest":
                // Items for the Blighted Forest
                if(Objects.equals(currentVariation, "Rotting Grove")) {
                // Items for the Rotting Grove variation
                    return new Item[]{
                            new Item("Plaguewood Bow", "Weapon", 16, 3),
                            new Item("Venomwood Pendant", "Accessory", 5, 5)
                    };
                }
                else {
                // Items for the Withering Hollow variation
                    return new Item[]{
                            new Item("Cloak of the Hunt", "Armor", 0, 12),
                            new Item("Boots of the Shadow Stalker", "Armor", 0, 10)
                    };
                }

            case "Crystalline Cavern":
                // Items for the Crystalline Cavern
                if (Objects.equals(currentVariation, "Shattered Cavern")) {
                    // Items for the Shattered Cavern variation
                    return new Item[]{
                            new Item("Prismatic Greatsword", "Weapon", 22, 8),
                            new Item("Shard of the Arcane Core", "Accessory", 10, 5)
                    };
                }
                else {
                    // Items for the Luminara Depths variation
                    return new Item[]{
                            new Item("Luminara Edge", "Weapon", 20, 5),
                            new Item("Celestial Amulet", "Accessory", 0, 8)
                    };
                }

            case "Throne of the Abyss":
                // Items for the Throne of the Abyss
                if (Objects.equals(currentVariation, "Sunken Throne")) {
                    //Items for the Sunken Throne variation
                    return new Item[]{
                            new Item("Leviathan's Fang", "Weapon", 40, 10),
                            new Item("Tideforged Pauldrons", "Armor", 0, 20)
                    };
                }
                else {
                    // Items for the Ruined Citadel Variation
                    return new Item[]{
                            new Item("Doombringer", "Weapon", 45, 15),
                            new Item("Abysswalker Cloak", "Armor", 5, 15)
                    };
                }

            default:
                return new Item[]{
                        new Item("Iron Shortsword", "Weapon", 3, 0),
                };
        }

    }

    public static Enemy[] genEnemies(String currentLocation, String currentVariation) {
        switch (currentLocation) {
            case "Forsaken Outpost":
                // Frozen Barracks Enemies and Attacks
                if (Objects.equals(currentVariation, "Frozen Barracks")) {
                    Attack[] frostbittenWarriorAttacks = {
                            new Attack("Ice Slash", 6, "Ice"),
                            new Attack("Frozen Grip", 5, "Ice"),
                    };

                    Attack[] wraithofWinterAttacks = {
                            new Attack("Ethereal Chill", 6, "Magic"),
                            new Attack("Glacial Curse", 8, "Ice")
                    };

                    Enemy frostbittenWarrior = new Enemy(
                            "Frostbitten Warrior",
                            25,
                            6,
                            frostbittenWarriorAttacks);

                    Enemy wraithofWinter = new Enemy(
                            "Wraith of Winter",
                            32,
                            5,
                            wraithofWinterAttacks);
                    return new Enemy[]{frostbittenWarrior, wraithofWinter};
                }
                else {
                    // Bloodied Watchtower Enemies and Attacks
                    Attack[] tormentedGuardAttacks = {
                            new Attack("Cursed Strike", 7, "Dark"),
                            new Attack("Shield Bash", 6, "Physical"),
                    };

                    Attack[] plagueHoundAttacks = {
                            new Attack("Rabid Bite", 8, "Disease"),
                            new Attack("Filthy Lunge", 5, "Physical")
                    };

                    Enemy tormentedGuard = new Enemy(
                            "Tormented Guard",
                            40,
                            8,
                            tormentedGuardAttacks);

                    Enemy plagueHound = new Enemy(
                            "Plague Hound",
                            35,
                            7,
                            plagueHoundAttacks);
                    return new Enemy[]{tormentedGuard, plagueHound};
                }

            case "Whispering Catacombs":
                // Tomb of the Fallen King Enemies and Attacks
                if (Objects.equals(currentVariation, "Tomb of the Fallen King")) {
                    Attack[] royalWraithAttacks = {
                            new Attack("Spectral Cleave", 10, "Dark"),
                            new Attack("Chains of the Damned", 12, "Magic"),
                    };

                    Attack[] cursedSpearmanAttacks = {
                            new Attack("Lance Thrust", 9, "Physical"),
                            new Attack("Phantom Charge", 10, "Spectral")
                    };

                    Enemy royalWraith = new Enemy(
                            "Royal Wraith",
                            50,
                            11,
                            royalWraithAttacks);

                    Enemy cursedSpearman = new Enemy(
                            "Cursed Spearman",
                            45,
                            9,
                            cursedSpearmanAttacks);
                    return new Enemy[]{royalWraith, cursedSpearman};
                }
                else {
                    // Mausoleum of Endless Night Enemies and Attacks
                    Attack[] hollowMonkAttacks = {
                            new Attack("Curse Chant", 10, "Dark"),
                            new Attack("Soul Drain", 8, "Magic"),
                    };

                    Attack[] revenantStalkerAttacks = {
                            new Attack("Shadow Step", 10, "Spectral"),
                            new Attack("Bladed Claws", 12, "Physical")
                    };

                    Enemy hollowMonk = new Enemy(
                            "Hollow Monk",
                            50,
                            10,
                            hollowMonkAttacks);

                    Enemy revenantStalker = new Enemy(
                            "Revenant Stalker",
                            55,
                            12,
                            revenantStalkerAttacks);
                    return new Enemy[]{hollowMonk, revenantStalker};
                }

            case "Blighted Forest":
                // Rotting Grove Enemies and Attacks
                if (Objects.equals(currentVariation, "Rotting Grove")) {
                    Attack[] venomwoodHorrorAttacks = {
                            new Attack("Poison Lash", 12, "Nature"),
                            new Attack("Toxic Spores", 10, "Poison"),
                    };

                    Attack[] corruptBoarAttacks = {
                            new Attack("Gore Charge", 14, "Physical"),
                            new Attack("Necrotic Decay", 10, "Disease")
                    };

                    Enemy venomwoodHorror = new Enemy(
                            "Venomwood Horror",
                            75,
                            15,
                            venomwoodHorrorAttacks);

                    Enemy corruptBoar = new Enemy(
                            "Corrupt Boar",
                            65,
                            13,
                            corruptBoarAttacks);
                    return new Enemy[]{venomwoodHorror, corruptBoar};
                }
                else {
                    // Withering Hollow Enemies and Attacks
                    Attack[] leechingTreantAttacks = {
                            new Attack("Vine Grasp", 14, "Nature"),
                            new Attack("Soul Sap", 12, "Dark"),
                    };

                    Attack[] wraithvineHunterAttacks = {
                            new Attack("Withering Blade", 12, "Dark"),
                            new Attack("Phantom Lunge", 14, "Dark")
                    };

                    Enemy leechingTreant = new Enemy(
                            "Leeching Treant",
                            80,
                            16,
                            leechingTreantAttacks);

                    Enemy wraithvineHunter = new Enemy(
                            "Wraithvine Hunter",
                            73,
                            15,
                            wraithvineHunterAttacks);
                    return new Enemy[]{leechingTreant, wraithvineHunter};
                }

            case "Crystalline Cavern":
                // Shattered Cavern Enemies and Attacks
                if (Objects.equals(currentVariation, "Shattered Cavern")) {
                    Attack[] crystalGolemAttacks = {
                            new Attack("Crystal Smash", 22, "Earth"),
                            new Attack("Shatter Wave", 18, "Arcane"),
                    };

                    Attack[] gemstoneSerpentAttacks = {
                            new Attack("Venom Fang", 18, "Poison"),
                            new Attack("Glint Strike", 20, "Physical")
                    };

                    Enemy crystalGolem = new Enemy(
                            "Crystal Golem",
                            90,
                            20,
                            crystalGolemAttacks);

                    Enemy gemstoneSerpent = new Enemy(
                            "Gemstone Serpent",
                            85,
                            18,
                            gemstoneSerpentAttacks);
                    return new Enemy[]{crystalGolem, gemstoneSerpent};
                }
                else {
                    // Luminara Depths Enemies and Attacks
                    Attack[] luminaraSentinelAttacks = {
                            new Attack("Radiant Slash", 16, "Light"),
                            new Attack("Prism Burst", 15, "Light"),
                    };

                    Attack[] crystalPhantomAttacks = {
                            new Attack("Shimmer Veil", 14, "Magic"),
                            new Attack("Fractured Beam", 18, "Arcane")
                    };

                    Enemy luminaraSentinel = new Enemy(
                            "Luminara Sentinel",
                            90,
                            20,
                            luminaraSentinelAttacks);

                    Enemy crystalPhantom = new Enemy(
                            "Crystal Phantom",
                            85,
                            18,
                            crystalPhantomAttacks);
                    return new Enemy[]{luminaraSentinel, crystalPhantom};
                }

            case "Throne of the Abyss":
                // Sunken Throne Enemies and Attacks
                if (Objects.equals(currentVariation, "Sunken Throne")) {
                    Attack[] abyssalLeviathanAttacks = {
                            new Attack("Tidal Crash", 28, "Water"),
                            new Attack("Drowning Grip", 30, "Magic"),
                    };

                    Attack[] abyssalSeabornAttacks = {
                            new Attack("Crushing Maw", 10, "Physical"),
                            new Attack("Abyssal Roar", 5, "Dark")
                    };

                    Enemy abyssalLeviathan = new Enemy(
                            "Abyssal Leviathan",
                            250,
                            20,
                            abyssalLeviathanAttacks);

                    Enemy abyssalSeaborn = new Enemy(
                            "Abyssal Seaborn",
                            60,
                            18,
                            abyssalSeabornAttacks);
                    return new Enemy[]{abyssalLeviathan, abyssalSeaborn};
                }
                else {
                    // Ruined Citadel Enemies and Attacks
                    Attack[] tyrantMalakarAttacks = {
                            new Attack("Void Collapse", 50, "Dark"),
                            new Attack("Abyssal Annihilation", 60, "Magic"),
                    };

                    Attack[] darkspawnHeraldAttacks = {
                            new Attack("Void Strike", 15, "Dark"),
                            new Attack("Corrupting Slam", 12, "Physical")
                    };

                    Enemy tyrantMalakar = new Enemy(
                            "Tyrant Malakar",
                            250,
                            30,
                            tyrantMalakarAttacks);

                    Enemy darkspawnHerald = new Enemy(
                            "Darkspawn Herald",
                            75,
                            18,
                            darkspawnHeraldAttacks);
                    return new Enemy[]{tyrantMalakar, darkspawnHerald};
                }
            default:
                Attack[] goblinScavengerAttacks = {
                        new Attack("Jagged Slash", 7, "Physical"),
                        new Attack("Scavenger’s Trick", 5, "Magic"),
                };

                Attack[] skeletalSentryAttacks = {
                        new Attack("Bone Strike", 8, "Physical"),
                        new Attack("Grave Tread", 5, "Dark")
                };

                Enemy goblinScavenger = new Enemy(
                        "Goblin Scavenger",
                        30,
                        7,
                        goblinScavengerAttacks);

                Enemy  skeletalSentry = new Enemy(
                        "Skeletal Sentry",
                        40,
                        8,
                        skeletalSentryAttacks);
                return new Enemy[]{goblinScavenger, skeletalSentry};
        }
    }
}
