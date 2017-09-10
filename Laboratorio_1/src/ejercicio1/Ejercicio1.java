/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Oscar Mancera
 */
import becker.robots.*;
import java.awt.Color;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //diseño de parqueadero
        City parq = new City();
        for (int i = 1; i <= 3; i++) {
            Robot t = new Robot(parq, 0, i, Direction.WEST);
            t.setLabel("" + i + "");
            t.setTransparency(1);
        }
        for (int i = 1; i <= 3; i++) {
            Wall blockAve0 = new Wall(parq, 1, i, Direction.NORTH);
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                Wall blockAve1 = new Wall(parq, i, j, Direction.WEST);
                Wall blockAve2 = new Wall(parq, i, j, Direction.EAST);
            }
        }
        //Espacios de estacionamiento
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                Thing t1 = new Thing(parq, i, j);
            }
        }

        //Zona AUX
        for (int i = 4; i <= 7; i++) {
            Wall blockAve3 = new Wall(parq, 4, i, Direction.NORTH);
            Wall blockAve4 = new Wall(parq, 4, i, Direction.WEST);
            Wall blockAve5 = new Wall(parq, 4, i, Direction.EAST);
        }

        int op = 0;
        while (op < 5) {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingrese un auto.");
            System.out.println("2. Mostrar Ingresos.");
            System.out.println("3. Mostrar Ubicacion");

            Scanner opcion = new Scanner(System.in);
            op = opcion.nextInt();
            System.out.println(op);
            switch (op) {
                case 1:
                    //Creacion del auto
                    System.out.println("Ingrese la placa: ");
                    Scanner placa = new Scanner(System.in);
                    String pl = placa.next();
                    Robot p = new Robot(parq, 6, 8, Direction.WEST);
                    p.setLabel(pl);
                    p.examineLights();
                    p.examineThings();
                    p.examineThings(IPredicate.aLight);
                    p.examineRobots();
                    //Movimiento del auto
                    for (int x = 0; x <= 6; x++) {
                        p.move();

                    }
                    if (p.frontIsClear() == true) {
                        p.turnLeft();
                        p.turnLeft();
                        p.turnLeft();
                        p.move();

                    }
                    while (p.canPickThing() == true) {
                        p.pickThing();
                        if (p.frontIsClear() == true) {
                            p.putThing();
                            p.move();

                        }
                    }

                    break;
                case 2:
                    IIterate<Robot> cantauto = parq.examineRobots();
                    System.out.println("Ingresaron " + cantauto);
                    break;
                case 3:
                    parq.getThingCountPredicate();
                    break;
                case 4:
                    System.out.println("Hace 4");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }

}
