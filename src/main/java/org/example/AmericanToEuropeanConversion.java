package org.example;

// Conversion class from American to European Sockets
public class AmericanToEuropeanConversion implements EuropeanSocket {

    // Needs American Power Cable instance
    private AmericanElectricalPlug apg;

    // Takes in American Power Cable Instance to convert
    public AmericanToEuropeanConversion(AmericanElectricalPlug apg) {
        this.apg = apg;
    }

    // Converts plug to European and then runs the plug then enters the American plug
    @Override
    public void enterEuropeanSocket() {
        System.out.println("Converting American Electrical Plug to work with European Socket.");
        apg.enterPlug();
    }
}
