import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Band {
    private int bandId;
    private String bandName;
    //private String bandImage;
    //private String bandTpe;

    public Band(int bandId, String bandName) {
        this.bandId = bandId;
        this.bandName = bandName;
    }

    public String getName(){
        return this.bandName;
    }
    public int getBandId(){
       return this.bandId;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandId=" + bandId +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
