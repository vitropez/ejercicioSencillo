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
	public int getNumeroArt() {
		return numeroArt;
	}
	public void setNumeroArt(int numeroArt) {
		this.numeroArt = numeroArt;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	@Override
	public String toString() {
		return "Ventas [numeroArt=" + numeroArt + ", articulo=" + articulo + "]";
	}
	

}
