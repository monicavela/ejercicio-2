
/*
Monica Jaqueline Vela Galvan 
2S11
Vehiculos
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    

        Vehiculo a[]=new Vehiculo[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Ingrese el numero de ruedas del vehiculo " + i);
            int ruedas=leer.nextInt();
            
            System.out.println("Ingrese el numero de matricula  del vehiculo " + i);
            int matricula=leer.nextInt();
            
            System.out.println("Ingrese el numero de puertas  del vehiculo " + i);
            int puertas=leer.nextInt();
            
            System.out.println("Ingrese el numero de pasajeros del vehiculo " + i);
            int pasajeros=leer.nextInt();
            
            a[i]= new Vehiculo(ruedas,matricula,puertas,pasajeros);
            
            if(a[i].getRuedas()==4 && (a[i].getPuertas()==4 || a[i].getPuertas()==2 ) && a[i].getPasajeros()<=5){
                System.out.println("El vehiculo " + i + " es un Coche");
                
            }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()<=2){
                System.out.println("El vehiculo " + i + " es una Moto");
                
            }else if(a[i].getRuedas()==0 && a[i].getPuertas()==0 && a[i].getPasajeros()>0){
                System.out.println("El vehiculo " + i + " es una Lancha");
                
                }else if(a[i].getRuedas()==6 && a[i].getPuertas()==2 && a[i].getPasajeros()>100){
                System.out.println("El vehiculo " + i + " es un Avion");
                
                }else if(a[i].getRuedas()==0 && a[i].getPuertas()==1 && a[i].getPasajeros()>300){
                System.out.println("El vehiculo " + i + " es un Barco");
                
                }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()>2){
                System.out.println("El vehiculo " + i + " es una Bicicleta");
                
                
        
            }

        }
        
    }

    private static class Vehiculo {

        public Vehiculo() {
        }

        private Vehiculo(int ruedas, int matricula, int puertas, int pasajeros) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int getRuedas() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int getPuertas() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int getPasajeros() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
    
    

