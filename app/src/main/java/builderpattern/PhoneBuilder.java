package builderpattern;

public class PhoneBuilder {
    private String Os;
    private int Ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        Os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        Ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(Os, Ram,processor,screenSize,battery);
    }
}
