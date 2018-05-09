public class SingleTonClass {

    private static SingleTonClass obj=null;
    private SingleTonClass(){
// en privat konstruktør gør at den ikke kan tilgås fra andre
    }
    public static SingleTonClass objectCreationMethod(){
// gør at der kun kan være 1 Singletonclass
        if(obj==null){
            obj= new SingleTonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("this is Singleton");
    }
}



/*public enum SingletonEarthExample {
    EARTH;
    //sat som enum, så det ikke kan være andet end EARTH



    //get metoder som kaldes fra clienten.
    public double getAgeInYears() {
        return 4500000000L;
    }

    public float getdaysForFullOrbit() {
        return 365.26f;
    }

    public float getDegreesOfAxisTilt() {
        return 23.4f;
    }

    public double getPopulation() {
        return 7046000000L;
    }
}

*/
