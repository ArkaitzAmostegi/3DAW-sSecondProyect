public class libro {

    private String titulo=" ";// Título del libro.
    private String autor; //Autor del libro.
    private int añoPublicacion; //Año de publicación.
    private String genero; //Género del libro.

    //Constructor vacio
    public libro() {
        this.titulo= "Desconocido";
        this.autor="Anonimo";
        this.añoPublicacion= 2000;
        this.genero="General";
    }
    //Constructor con todos los atributos
    public libro(String titulo, String autor, int añoPublicacion, String genero) {
		super();
		this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.genero=genero;
	}
    //Constructor con algunos atributos
    public libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=2000;
        this.genero="General";
    }
    //Clase toString
    @Override
    public String toString(){
        return "Libro{\nTítulo: "+titulo+"\nAutor: "+autor+"\nAño de publicación: "+añoPublicacion+"\nGénero:"+genero+"}";
    }
}

