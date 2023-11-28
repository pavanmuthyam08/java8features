package com.iis.objectstream;
import java.util.stream.*;
import java.util.*;
public class MovieMain {
 private List<Movie> lm;
 private Scanner sc;
 public MovieMain() {
	 lm=new ArrayList<Movie>();
	 sc=new Scanner(System.in);
 }
 public void accept() {
	 System.out.println("Enter The How many movies u want to store");
	 int index=sc.nextInt();
	 for(int i=0;i<index;i++) {
	 Movie m=new Movie();
	 System.out.println("Enter The Movie Number");
	 m.setMovienum(sc.nextInt());
	 System.out.println("Enter The Movie Name");
	 m.setMoviename(sc.next());
	 System.out.println("Enter The Movie Price");
	 m.setPrice(sc.nextInt());
	 System.out.println("Enter The Moive Duration");
	 m.setDuration(sc.nextInt());
	 System.out.println("Enter The Movie Catagory");
	 m.setCatagory(sc.next());
	 lm.add(m);
	 }
 }
 public void showAll() {
	 lm.stream().forEach(mz->
	 {
		 System.out.println("The movie name is "+mz.getMoviename());
		 System.out.println("The Movie price is "+mz.getPrice());
		 System.out.println("The Movie Catagory is "+mz.getCatagory());
	 });
 }
 public void display() {
	 System.out.println("Enter the catagory of Movie");
	 String cat=sc.next();
	 lm.stream().filter(mv->mv.getCatagory().equals(cat)).forEach(mve->
	 {
		 System.out.println("The Movie Name is"+mve.getMoviename());
		 System.out.println("The Movie Price is "+mve.getPrice());
	 });
	 lm.stream().sorted(new Compare()).forEach(ex->
	 {
	   System.out.println("The Movie Name is "+ex.getMoviename()); 
	   System.out.println("The Movie Price is "+ex.getPrice());
	 
	 });
	 
	 
 }
 public static void main(String[] args) {
	MovieMain mm=new MovieMain();
	mm.accept();
	mm.showAll();
	mm.display();
}
}
