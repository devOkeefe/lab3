package lab3;
import java.util.*;
public class circle {
private double radius;
private double area;
//because private access can protect specific parts of a class from being viewed
//c1.radius 
circle() {
	this.radius = 3.5;
	//this is default radius of circle
	this.area = 38.48;
	
}
circle (double r) {
	this.radius = r;
	this.area = Math.pow(r, 2)*3.14;
}

void print() {
	System.out.print(radius+" "+area);
	
}
double getR() {
	return radius;
	//double return type because it contains decimal and radius is already defined as an int so no parameters needed
}
void setR(double radius) {
	this.radius = radius;
	//return type void because after it does not have a return value we are passing the parameter double because our int has a decimal
}
double getArea() {
	return area;
}
void setArea(double area) {
	this.area = area;
}
}
