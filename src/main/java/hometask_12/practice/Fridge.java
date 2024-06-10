package hometask_12.practice;

import hometask_12.practice.Bonus;
import hometask_12.practice.ElectricAppliance;

public class Fridge extends ElectricAppliance implements Bonus {

    private boolean isFrezer;

    public Fridge(String applianceModel, String applianceProductingCountry, int appliancePower, int appliancePrice) {
        super(applianceModel, applianceProductingCountry, appliancePower, appliancePrice);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "isFrezer=" + isFrezer +
                '}';
    }

    public boolean isFrezer() {
        return isFrezer;
    }

    public void setFrezer(boolean frezer) {
        isFrezer = frezer;
    }

    @Override
    @Deprecated
    public int calculateAppliancePrice() {
        if (isFrezer) {
            final int freezerPrice = 200;
            return super.calculateAppliancePrice() + freezerPrice;
        } else {
            return super.calculateAppliancePrice();
        }
    }

    public void printBonus() {

    }
}
