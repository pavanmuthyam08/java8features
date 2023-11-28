package com.iis.java8features;

public class Student 
{
  private int stdid;
  private String stdname;
  private int score;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
  public Student(int stdid,String stdname,int score) {
	  this.stdid=stdid;
	  this.stdname=stdname;
	  this.score=score;
  }
}
