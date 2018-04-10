package ejemplos;

import javax.swing.JOptionPane;

public class Vectores {
    public static void main(String[] args) {
        int[] edades = new int[5];
        for (int i = 0; i < 5; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));
        }
    }
}
