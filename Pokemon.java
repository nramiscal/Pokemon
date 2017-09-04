public class Pokemon {

    private String name;
    private String type;
    private int health;
    private static int count = 0;

    // constructors
    public Pokemon(){
        this.count++;
    }

    public Pokemon(String name, String type, int health){
        this.setName(name);
        this.setType(type);
        this.setHealth(health);
        System.out.println("Pokemon " + name + " created, of type " + type + ", and health " + health);
        this.count++;
    }

    // getters
    public String getName(){ return name; }
    public String getType(){ return type; }
    public int getHealth(){ return health; }
    public static int howMany(){ return count; }

    // setters
    public Pokemon setName(String name){
        this.name = name;
        return this;
    }

    public Pokemon setType(String type){
        this.type = type;
        return this;
    }

    public Pokemon setHealth(int health){
        this.health = health;
        return this;
    }


}
