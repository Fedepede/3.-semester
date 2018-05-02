public class EarthClient {

    public static void main(String args[]){

        SingletonEarthExample earth = SingletonEarthExample.EARTH;

        //kalder get metoder
        System.out.println(earth.getAgeInYears());
        System.out.println(earth.getdaysForFullOrbit());
        System.out.println(earth.getDegreesOfAxisTilt());
        System.out.println(earth.getPopulation());
    }
}
