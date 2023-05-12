package pilisaru.controller;

import com.fazecast.jSerialComm.*;
import lk.ijse.homewindow.controller.sensorsController.GetValueController;

import java.nio.charset.StandardCharsets;

public class SensorCalss extends Thread{

    private int numRead;

    GetValueController getValueController=new GetValueController();

   public void setArduino(){

       SerialPort[] AvailablePorts = SerialPort.getCommPorts(); // Create Serial Port Object and get available Serial
       // Ports
       // use the for loop to print the available serial ports
       System.out.println("Available COM Ports");
       //System.out.println("--------------------------------------");
       for (SerialPort S : AvailablePorts) // Print Available Serial ports
           System.out.println("\n  " + S.toString());
       //System.out.println("--------------------------------------");
       // If At least one Serial Port available
       if (AvailablePorts.length != 0) {
           // Open the first Available port
           SerialPort MySerialPort = AvailablePorts[0]; // Change to your Arduino ComPort
           MySerialPort.openPort(); // open the Serial Port
           // Arduino May get reset
           int BaudRate = 9600; // Set BAUD Rate -----> Arduino BAUD rate is set to 9600 bps
           int DataBits = 8;
           int StopBits = SerialPort.ONE_STOP_BIT;
           int Parity = SerialPort.NO_PARITY;
           // Sets all serial port parameters at one time
           MySerialPort.setComPortParameters(BaudRate, DataBits, StopBits, Parity);
           // Set Read COM port Read Time out in seconds
           MySerialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 1000, 0);
           MySerialPort.openPort(); // open the port
           try {
               Thread.sleep(2000); // Sleep main thread 2 Seconds (Need some Delay to initiate the Communication)
           } catch (InterruptedException e1) {
               e1.printStackTrace();
           }
           // Check whether port is open or not
           if (MySerialPort.isOpen()) { // If ComPort is Open the read incoming ASCII String from the selected COM port
               System.out.println("Com Port is Open ");
               try {
                   while (true) { // Non Ending Loop
                       byte[] readBuffer = new byte[100]; // Create Buffer array to Hold ASCII values
                       numRead = MySerialPort.readBytes(readBuffer, readBuffer.length); // Get Number of received
                       // ASCII values
                       //System.out.println("after value");
                       //System.out.print("Read " + numRead + " bytes -"); // Print number of received ASCII Characters

                       //return numRead;
                       // Convert bytes to String
                       String S = new String(readBuffer, StandardCharsets.UTF_8);
                       //Split temperature from the String
                       //Covert String value to Double
                       //Do other things-------
                       //System.out.println("Received -> " + S); // Print String
                       GetValueController.getValue(S);
                   }
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
           else
               System.out.println(" Com Port not open ");
           MySerialPort.closePort(); // Close the COM port
       } else {
           System.out.println("COM ports Not Found");
       }
   }


}
