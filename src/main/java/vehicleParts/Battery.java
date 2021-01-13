package vehicleParts;

public class Battery{
    private String motorType;
    private String chargerType;

    public Battery(String motorType, String chargerType){
        this.motorType = motorType;
        this.chargerType = chargerType;
    }

    public String getMotorType() {
        return motorType;
    }

    public String getChargerType() {
        return chargerType;
    }
}
