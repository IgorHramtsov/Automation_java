package hometask_12.practice;

public class ElectricAppliance {

    private String applianceModel;
    private String applianceProductingCountry;
    private int appliancePower;
    private int appliancePrice;

    public ElectricAppliance(String applianceModel, String applianceProductingCountry, int appliancePower, int appliancePrice) {
        this.applianceModel = applianceModel;
        this.applianceProductingCountry = applianceProductingCountry;
        this.appliancePower = appliancePower;
        this.appliancePrice = appliancePrice;
    }
    @Deprecated
    private int calculatePrice(){
        final int applianceTax = 1000;
        System.out.println("Result: " + appliancePower * applianceTax);
        return appliancePower * applianceTax;
    }
    @Deprecated
    public int calculateAppliancePrice() {
        System.out.println("price * tax:");
        return calculatePrice() * 3;
    }

    public String getApplianceModel() {
        return applianceModel;
    }

    public void setApplianceModel(String applianceModel) {
        this.applianceModel = applianceModel;
    }

    public String getApplianceProductingCountry() {
        return applianceProductingCountry;
    }

    public void setApplianceProductingCountry(String applianceProductingCountry) {
        this.applianceProductingCountry = applianceProductingCountry;
    }

    public int getAppliancePower() {
        return appliancePower;
    }

    public void setAppliancePower(int appliancePower) {
        this.appliancePower = appliancePower;
    }

    public int getAppliancePrice() {
        return appliancePrice;
    }

    public void setAppliancePrice(int appliancePrice) {
        this.appliancePrice = appliancePrice;
    }

    @Override
    public String toString() {
        return "ElectricAppliance{" +
                "applianceModel='" + applianceModel + '\'' +
                ", applianceProductingCountry='" + applianceProductingCountry + '\'' +
                ", appliancePower=" + appliancePower +
                ", appliancePrice=" + appliancePrice +
                '}';
    }
}
