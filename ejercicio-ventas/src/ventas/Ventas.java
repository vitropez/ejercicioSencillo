package ventas;

public class Ventas {
	private int numeroArt;
	private String articulo;
	public Ventas() {
	}
	public Ventas(int numeroArt,String articulo) {
		this.numeroArt=numeroArt;
		this.articulo=articulo;
	}
	@Override
	public String toString() {
		return "Ventas [numeroArt=" + numeroArt + ", articulo=" + articulo + "]";
	}
	

}
