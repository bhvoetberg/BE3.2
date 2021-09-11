package novi.basics.nl;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brandName;
    private String modelNumber;
    private List<Part> parts;

    public Car(String brandName, String modelNumber) {
        this.brandName = brandName;
        this.modelNumber = modelNumber;
        parts = new ArrayList<>();
    }

    // Getters en Setters weggelaten.

    /**
     * This method gets a partName, creates a Part-object and adds it to the list.
     * @param partName the name of the part.
     */
    public void addPart(String partName) {
        Part part = new Part(partName);
        parts.add(part);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("De ");
        stringBuilder.append(brandName).append(" ").append(modelNumber);
        if(parts.size() > 0) {
            stringBuilder.append(" has the following parts: ");
            for (Part part : parts) {
                stringBuilder.append("\n\r").append(part);
            }
        } else {
            stringBuilder.append(" has no parts.");
        }
        return stringBuilder.toString();
    }
}