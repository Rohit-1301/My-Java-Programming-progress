package classandobject.interfacesnk;
class cellphone {
    String phonebrand;
    int manufacturingyear;
    String model;

    public cellphone(String phonebrand, int manufacturingyear, String model) {
        this.phonebrand = phonebrand;
        this.manufacturingyear = manufacturingyear;
        this.model = model;
    }

    public String getphonebrand() {
        return phonebrand;
    }

    public int getmanufacturingyear() {
        return manufacturingyear;
    }

    public String getmodel() {
        return model;
    }
}

interface gps {
    void getlocation();
}

interface camera {
    void takepicture();
}

interface mediaplayer {
    void playmusic();
}

class extrasmartphone extends cellphone implements gps, camera, mediaplayer {
    int battery;

    public extrasmartphone(String phonebrand, int manufacturingyear, String model, int battery) {
        super(phonebrand, manufacturingyear, model);
        this.battery = battery;
    }

    public int getbattery() {
        return battery;
    }

    public void getlocation() {
        System.out.println("getting location");
    }

    public void takepicture() {
        System.out.println("taking picture");
    }

    public void playmusic() {
        System.out.println("playing music");
    }

}
public class polymorphism {
    public static void main(String[] args) {
        gps g=new extrasmartphone(null, 0, null, 0);
        g.getlocation();  
     
       
    }
}
