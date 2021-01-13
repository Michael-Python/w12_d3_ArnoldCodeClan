package vehicleParts;

import com.sun.xml.internal.ws.encoding.StringDataContentHandler;

public class Body{

    private String bonnetType;
    private String bootType;
    private String doorType;
    private String wingType;

    public Body(String bonnetType, String bootType, String doorType, String wingType){
        this.bonnetType = bonnetType;
        this.bootType = bootType;
        this.doorType = doorType;
        this.wingType = wingType;
    }

    public String getBonnetType() {
        return bonnetType;
    }

    public String getBootType() {
        return bootType;
    }

    public String getDoorType() {
        return doorType;
    }

    public String getWingType() {
        return wingType;
    }
}
