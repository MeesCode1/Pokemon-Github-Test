public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

/// methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void being(){
        System.out.println("I'm a pokemon");
    }
    public void sayLevel(){
        System.out.println("My level is: " +level);
    }

}
