/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author melanieserpa
 */
public class ejercicio07 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1, y=2, z=3;
		
		if(++x > y++ || x-- > 0)
			z++;
		else
			z--;
		System.out.println(x+" "+y+" "+z);
		//LA RESPUESTA ES ; 1 3 4
	}

}
