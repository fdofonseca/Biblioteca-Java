
package Modelo;


/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */


public class Libro {
    private int n_serie;
    private int isbn;
    private String titulo;
    private int n_paginas;
    private int precio_ref;
    private int ano_publicacion;
    private String idiomas;
    private String autores;
    private String categorias;
    private String editorial;

    public Libro(int n_serie, int isbn, String titulo, int n_paginas, int precio_ref, int ano_publicacion, String idiomas, String autores, String categorias, String editorial) {
        this.n_serie = n_serie;
        this.isbn = isbn;
        this.titulo = titulo;
        this.n_paginas = n_paginas;
        this.precio_ref = precio_ref;
        this.ano_publicacion = ano_publicacion;
        this.idiomas = idiomas;
        this.autores = autores;
        this.categorias = categorias;
        this.editorial = editorial;
    }

    public int getN_serie() {
        return n_serie;
    }

    public void setN_serie(int n_serie) {
        this.n_serie = n_serie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    public int getPrecio_ref() {
        return precio_ref;
    }

    public void setPrecio_ref(int precio_ref) {
        this.precio_ref = precio_ref;
    }

    public int getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(int ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "n_serie=" + n_serie + ", isbn=" + isbn + ", titulo=" + titulo + ", n_paginas=" + n_paginas + ", precio_ref=" + precio_ref + ", ano_publicacion=" + ano_publicacion + ", idiomas=" + idiomas + ", autores=" + autores + ", categorias=" + categorias + ", editorial=" + editorial + '}';
    }
    
    
    
    
    
}
