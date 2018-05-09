public class SingleTonClient{

public static void main(String args[]){
// den prøver at lave et object men er nødt til at bruge metoden som kun laver et single object pga private konstruktor
        SingleTonClass myobject= SingleTonClass.objectCreationMethod();
        myobject.display();
        }
        }


/*public class EarthClient {

    public static void main(String args[]){

        SingletonEarthExample earth = SingletonEarthExample.EARTH;

        //kalder get metoder
        System.out.println(earth.getAgeInYears());
        System.out.println(earth.getdaysForFullOrbit());
        System.out.println(earth.getDegreesOfAxisTilt());
        System.out.println(earth.getPopulation());
    }
}
*/