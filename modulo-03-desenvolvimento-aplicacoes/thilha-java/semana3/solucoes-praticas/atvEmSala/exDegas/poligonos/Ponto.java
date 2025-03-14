package semana5.atvEmSala.exDegas.poligonos;

import java.util.Scanner;

public class Ponto {

	private float x, y, z;

	public float getX() {
		return x;
	};

	public float getY() {
		return y;
	};

	public float getZ() {
		return z;
	};

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public Ponto(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	};

	public static Ponto solicitaPonto(Scanner sc) {
		System.out.println("Digite as coordenadas do ponto");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		return new Ponto(x, y, z);
	}

	public void mostra() {
		System.out.println("(" + x + "," + y + "+ " + z + ")");
	}

	public double distancia(Ponto p) {
		return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2) + Math.pow(z - p.getZ(), 2));
	}

}