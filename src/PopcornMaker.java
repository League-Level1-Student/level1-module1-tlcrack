import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String popType = JOptionPane.showInputDialog("What type of popcorn do you want?");
String cookMins = JOptionPane.showInputDialog("How many minutes would you like to cook the popcorn for?");
	int minsCooked = Integer.parseInt(cookMins);
	Popcorn jiffy = new Popcorn(popType);

	Microwave funHeat = new Microwave();
	funHeat.putInMicrowave(jiffy);
	funHeat.setTime(minsCooked);
	funHeat.startMicrowave();
	
}
}
