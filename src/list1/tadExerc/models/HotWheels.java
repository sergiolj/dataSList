package list1.tadExerc.models;

import java.time.Year;

public class HotWheels {
    private String model;
    private Year releaseYear;
    private String scale;
    private String color;

    public HotWheels(String model, Year releaseYear, String scale, String color) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.scale = scale;
        this.color = color;
    }

    @Override
    public String toString() {
        return "HotWheels{" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", scale='" + scale + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
