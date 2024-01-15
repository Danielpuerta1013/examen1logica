package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //scanner
        int opcionMenu;
        do{// definicion del menu y se pide la opcion del usuario al menu
            System.out.println("examen de logica de programacion");
            System.out.println("1.tienda de helados FROZEN");
            System.out.println("2. Calculo de gastos de viaje");
            System.out.println("3. salir");
            System.out.print("ingrese la opcion deseada:");
            opcionMenu= sc.nextInt();
            sc.nextLine();
            switch (opcionMenu){ //caso 1
                case 1:
                    //entrada de variables y definicion de precios
                    int precioHeladoSimple=4000;
                    int precioHeladoDoble=6000;
                    int precioHeladoEspecial=8000;
                    System.out.println("bienvenido al programa contable"); //ingreso de datos por consola
                    System.out.println("ingrese el nombre de la persona que hace la contabilidad");
                    String nombreAdministrador=sc.nextLine();
                    //sc.nextLine();
                    System.out.println("señor "+nombreAdministrador+" ingrese numero de documento");
                    String documentoAdministrador=sc.nextLine();
                    //ingreso de cantidades vendidas
                    System.out.println("ingrese la cantidad vendida de helado simple");
                    byte cantidadHeladoSimple=sc.nextByte();
                    System.out.println("ingrese la cantidad vendida de helado doble");
                    byte cantidadHeladoDoble=sc.nextByte();
                    System.out.println("ingrese la cantidad vendida de helado especial");
                    byte cantidadHeladoEspecial=sc.nextByte();
                    //calculos totales por producto y total
                    int totalVentasSimple=precioHeladoSimple*cantidadHeladoSimple;
                    int totalVentasDoble=precioHeladoDoble*cantidadHeladoDoble;
                    int totalVentasEspecial=precioHeladoEspecial*cantidadHeladoEspecial;
                    int totalVentasDia=totalVentasEspecial+totalVentasDoble+totalVentasSimple;
                    System.out.println("total ventas helado simple: $"+totalVentasSimple);
                    System.out.println("total ventas helado doble: $"+totalVentasDoble);
                    System.out.println("total ventas helado especial: $"+totalVentasEspecial);
                    System.out.println("el total de ventas del dia es de: $"+ totalVentasDia);

                    break;
                case 2:
                    //ingreso de datos y calculo de total
                    System.out.println("-----------------");
                    System.out.println("ingrese su nombre");
                    String nombreUsuario =sc.nextLine();
                    //sc.nextLine();
                    System.out.println("marca del carro");
                    String marcaVehiculo =sc.nextLine();
                    System.out.println("señor: "+nombreUsuario+" Ingrese el numero de kilometros a recorrer");
                    double distanciaKilometros=sc.nextDouble();
                    System.out.println("Ingrese el consumo de combustible del coche(litros/100km)");
                    double consumoVehiculo=sc.nextDouble();
                    System.out.println("Ingrese el precio por litro de combustible");
                    double costoLitro= sc.nextDouble();
                    System.out.println("Ingrese el valor de otros gastos adicionales");
                    double costosAdicionales=sc.nextDouble();
                    double gastoTotal=(((consumoVehiculo/100)*costoLitro)*distanciaKilometros)+costosAdicionales;
                    System.out.println("El costo total es de: $"+gastoTotal);
                    break;
            }
        }while (opcionMenu!=3);


    }
}