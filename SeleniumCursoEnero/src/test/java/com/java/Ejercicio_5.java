package com.java;

import java.util.*;
import java.io.*;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);

		System.out.println("Ingrese un número:");
		String var = captura.next();

		boolean isNumeric = var.matches("[+-]?\\d*(\\.\\d+)?");
		if (isNumeric == true) {
			System.out.println("Si es número");
			double num = Double.valueOf(var);

			if (num == 0) {
				throw new IllegalArgumentException("El valor '0', no es un valor válido");
			} else if (num % 2 == 0 && num > 0) {
				System.out.println("El número" + " " + num + " " + "es Par y Positivo");
			} else if (num % 2 == 0 && num < 0) {
				System.out.println("El número" + " " + num + " " + "es Par y Negativo");
			} else if (num % 2 != 0 && num > 0) {
				System.out.println("El número" + " " + num + " " + "es Impar y Positivo");
			} else if (num % 2 != 0 && num < 0) {
				System.out.println("El número" + " " + num + " " + "es Impar y Negativo");
			}
			captura.close();
		} else {
			System.out.println("Valor incorrecto, debe ser un valor númérico");
		}
	}

}
