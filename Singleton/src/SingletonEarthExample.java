public enum SingletonEarthExample {
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


