

public class Pig implements Animal{
    private String sound;
    private String type;

    public Pig(String sound, String type){
        this.sound = sound;
        this.type = type;

    }
    public String getType(){
        return type;

    }

    public String getSound(){   
        return sound;


    }
}
