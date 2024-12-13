public class Libro {
    private String titulo=" ";// Título del libro.
    private String autor; //Autor del libro.
    private int añoPublicacion; //Año de publicación.
    private String genero; //Género del libro.

    //Constructor vacio
    public Libro() {
        this.titulo= "Desconocido";
        this.autor="Anonimo";
        this.añoPublicacion= 2000;
        this.genero="General";
    }
    //Constructor con todos los atributos
    public Libro(String titulo, String autor, int añoPublicacion, String genero) {
		super();
		this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.genero=genero;
	}
    //Constructor con algunos atributos
    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=2000;
        this.genero="General";
    }

}
