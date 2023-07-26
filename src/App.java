import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class App implements Divisa{

public static void main(String[] args) {

while(true){

JPanel panel = new JPanel();
     // Dispoisicion en pantalla
     panel.setLayout(new GridLayout(0, 1));

JTextField textField = new JTextField("0",10);
     // Campo de texto
     panel.add(new JLabel("Ingrese la cantidad:"));
     panel.add(textField);

panel.add(new JLabel("Elija la divisa:"));
// Opciones
String PrimerPanel = (String) JOptionPane.showInputDialog(null, panel,"Conversor", JOptionPane.QUESTION_MESSAGE,null, Divisas, Divisas[0]);

// Se verifica si se apreta salir para romper el bucle @while

if (PrimerPanel == null || PrimerPanel.equals("Salir")) {
     break;
}

// Se parsea para conseguir un entero y se agrega un formato decimal para reutilizar

int i = Integer.parseInt(textField.getText());
DecimalFormat df = new DecimalFormat("#.##"); 

if (PrimerPanel.equals("USD - Dolares") && i > 0) { // Opcion dolares
      double USDEUR = i * 0.9;
      double USDYEN = i * 140;
      double USDGBP = i * 0.77;
      double USDKRW = i * 1275.33;
      double USDARG = i * 272.40;

String message = "Tus dolares en euros son: " + df.format(USDEUR) + 
                 "\nTus dolares a yenes son: " + df.format(USDYEN) +
                 "\nTus dolares a libras son: " + df.format(USDGBP) +
                 "\nTus dolares a wones son: " + df.format(USDKRW) +
                 "\nTus dolares a pesos son: " + df.format(USDARG);

JOptionPane.showMessageDialog(null, message);

} else if(PrimerPanel.equals("EUR - Euros") && i > 0) { // Opcion euros
     double EURUSD = i * 1.1;
     double EURYEN = i * 155.47;
     double EURGBP = i * 0.86;
     double EURKRW = i * 1411.58;
     double EURARG = i * 301.36;

String message = "Tus euros a dolares son: " + df.format(EURUSD) + 
                 "\nTus euros a yenes son: " + df.format(EURYEN) +
                 "\nTus euros a libras son: " + df.format(EURGBP) +
                 "\nTus euros a wones son: " + df.format(EURKRW) +
                 "\nTus euros a pesos son: " + df.format(EURARG);

JOptionPane.showMessageDialog(null, message);

} else if (PrimerPanel.equals("YEN - Yenes") && i > 0) { // Opcion yenes
     double YENUSD = i * 0.0071;
     double YENEUR = i * 0.0064;
     double YENGBP = i * 0.0055;
     double YENKRW = i * 9.07;
     double YENARG = i * 1.94;

String message = "Tus yenes a dolares son: " + df.format(YENUSD) + 
                 "\nTus yenes a euros son: " + df.format(YENEUR) +
                 "\nTus yenes a libras son: " + df.format(YENGBP) +
                 "\nTus yenes a wones son: " + df.format(YENKRW) +
                 "\nTus yenes a pesos son: " + df.format(YENARG);

JOptionPane.showMessageDialog(null, message);

} else if (PrimerPanel.equals("GBP - Libras") && i > 0) { // Opcion libras
     double GBPUSD = i * 1.29;
     double GBPEUR = i * 1.17;
     double GBPYEN = i * 181.36;
     double GBPKRW = i * 1645.68;
     double GBPARG = i * 351.92;

String message = "Tus libras a dolares son: " + df.format(GBPUSD) + 
                 "\nTus libras a euros son: " + df.format(GBPEUR) +
                 "\nTus libras a yenes son: " + df.format(GBPYEN) +
                 "\nTus libras a wones son: " + df.format(GBPKRW) +
                 "\nTus libras a pesos son: " + df.format(GBPARG);

JOptionPane.showMessageDialog(null, message);

} else if (PrimerPanel.equals("KRW - Wones") && i > 0) { // Opcion wones
     double KRWUSD = i * 0.00078;
     double KRWEUR = i * 0.00071;
     double KRWYEN = i * 0.11;
     double KRWGBP = i * 0.00061;
     double KRWARG = i * 0.21;

String message = "Tus libras a dolares son: " + df.format(KRWUSD) + 
                 "\nTus libras a euros son: " + df.format(KRWEUR) +
                 "\nTus libras a yenes son: " + df.format(KRWYEN) +
                 "\nTus libras a wones son: " + df.format(KRWGBP) +
                 "\nTus libras a pesos son: " + df.format(KRWARG);

JOptionPane.showMessageDialog(null, message);

} else if (PrimerPanel.equals("ARG - Pesos") && i > 0) { // Opcion pesos
     double ARGUSD = i * 0.0037;
     double ARGEUR = i * 0.0033;
     double ARGYEN = i * 0.52;
     double ARGGBP = i * 0.0028;
     double ARGKRW = i * 4.68;

String message = "Tus libras a dolares son: " + df.format(ARGUSD) + 
                 "\nTus libras a euros son: " + df.format(ARGEUR) +
                 "\nTus libras a yenes son: " + df.format(ARGYEN) +
                 "\nTus libras a wones son: " + df.format(ARGGBP) +
                 "\nTus libras a pesos son: " + df.format(ARGKRW);

JOptionPane.showMessageDialog(null, message);

} else if(i <= 0){ // Opcion si se pone algo menor o igual que la vairable @i

JOptionPane.showMessageDialog(null, "Ponga un valor correcto.", "Informacion", JOptionPane.INFORMATION_MESSAGE);

 }

}}
}
