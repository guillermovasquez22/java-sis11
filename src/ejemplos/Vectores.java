package ejemplos;

import javax.swing.JOptionPane;

public class Vectores {
    public static void main(String[] args) {
        int[] edades = new int[5];
        for (int i = 0; i < 5; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));
        }
        int mayor = edades[0], menor = edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
            }
            if (edades[i] < menor) {
                menor = edades[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Edad mayor: " + mayor + ", edad menor: " + menor);
    }
}
