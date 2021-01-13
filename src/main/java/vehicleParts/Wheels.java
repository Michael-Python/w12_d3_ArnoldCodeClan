package vehicleParts;

public class Wheels {

    private int sizeInches;
    private String tyreProfile;

    public Wheels(int sizeInches, String tyreProfile){
        this.sizeInches = sizeInches;
        this.tyreProfile = tyreProfile;
    }


    public int getSizeInches() {
        return sizeInches;
    }

    public String getTyreProfile() {
        return tyreProfile;
    }
}
