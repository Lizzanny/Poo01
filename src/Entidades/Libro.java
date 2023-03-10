/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Libro {
    private Scanner sc = new Scanner(System.in);
    public int isbn;
    public String titulo; 
    public String Autor; 
    public int n_pag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String Autor, int n_pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = Autor;
        this.n_pag = n_pag;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getN_pag() {
        return n_pag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setN_pag(int n_pag) {
        this.n_pag = n_pag;
    }
    
    /*public void llenar(){
        System.out.println("Ingrese el ISBN:");
        this.setIsbn(sc.nextInt());
        System.out.println("Ingrese le título:");
        this.setTitulo(sc.next());
        System.out.println("Ingrese nombre del autor:");
        this.setAutor(sc.next());
        System.out.println("Ingrese número de páginas:");
        this.setN_pag(sc.nextInt());
    }*/

    @Override
    public String toString() {
        return "Libro{" + ", isbn=" + isbn + ", titulo=" + titulo + ", Autor=" + Autor + ", n_pag=" + n_pag + '}';
    }
    
}
