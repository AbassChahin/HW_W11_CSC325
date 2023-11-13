package org.example;

//The American power plug is incompatible with the European power sockets.
// Different countries sometimes have different electrical sockets. In order
// to make different electrical sockets work together with different plugs,
// the use of adapters is necessary.

// My idea behind this solution is to have the American cable in its own class
// and European socket in its own class, but the european socket should be an
// interface as it will have methods to help convert American plugs to work with
// european sockets. I then made a conversion class which implements european socket and
// takes in the american power plug instance that must be converted. After it is
// converted, it will plug in the wire. Main simply puts everything together.

public class Main {
    public static void main(String[] args) {
        // American Power Cable instance
        AmericanElectricalPlug apg = new AmericanElectricalPlug();

        // Converter to European Socket
        EuropeanSocket convertor = new AmericanToEuropeanConversion(apg);

        // Plug in cable after conversion
        convertor.enterEuropeanSocket();
    }
}