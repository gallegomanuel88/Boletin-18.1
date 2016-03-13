package boletin.pkg18.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Metodos {

    int[] numeros = new int[6];

    public void cargarArrayAleatorios() {
        int contador1 =0;
        String cargar = "NUMEROS ALEATORIOS\n\n";
        for (int i = 0; i < numeros.length; i++){
            contador1++;
            cargar+= contador1+".) ";
            
            numeros[i] = (int) (Math.random()*50+1);
            cargar+=numeros[i]+"\n";
        }
        mostrar(cargar);
    }
    public void ordenarReves (){
        int contador2 =0;
        String ordenado = "NUMEROS ALEATORIOS EN DISTINTO ORDEN\n\n";
        for(int x=numeros.length-1; x>-1;x-- ){
            contador2++;
            ordenado+= contador2+".) ";
            ordenado+= numeros [x] +"\n";
        }
        mostrar (ordenado);
    }
    public void mostrar (String r){
        JOptionPane.showMessageDialog(null, r);
    }
}
