import java.awt.*;

public class DataBase {
    Temperature temperature;
    Battery battery;
    BatteryLife batterylife;
    Voltage voltage;
    Current current;

    public DataBase() {

    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setBatterylife(BatteryLife batterylife) {
        this.batterylife = batterylife;
    }

    public void setVoltage(Voltage voltage) {
        this.voltage = voltage;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}

class Temperature {
    String name = "Temperature";
    double temp;

    public Temperature(String name, double temp) {
        this.name = name;
        this.temp = temp;
    }
}

class Battery {
    String name = "Battery";
    int battery;

    public Battery(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }
}

class BatteryLife {
    String name = "BatteryLife";
    int actualCapacity;
    int designCapacity;
    int chargeTime;

    public BatteryLife(String name, int actcapa, int descapa, int chargeT) {
        this.name = name;
        this.actualCapacity = actcapa;
        this.designCapacity = descapa;
        this.chargeTime = chargeT;
    }
}

class Voltage {
    String name = "Voltage";
    double volt;

    public Voltage(String name, double volt) {
        this.name = name;
        this.volt = volt;
    }
}

class Current {
    String name = "Current";
    double current;

    public Current(String name, double current) {
        this.name = name;
        this.current = current;
    }
}