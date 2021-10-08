package com.randrita.week3;
import java.util.Scanner;

/*Define a class volume and then find the volume and surface_area of a cube, cylinder and rectangular box using method overloading.-/
 */

public class VolumeArea
{
    public static void main(String[] args) {
        Volume ad=new Volume();
        System.out.println(ad.vl(11));
        System.out.println(ad.area(11));
        System.out.println(ad.vl(11,11));
        System.out.println(ad.area(11,11));
        System.out.println(ad.vl(11,11,5));
        System.out.println(ad.area(11,11,5));

    }
}
class Volume
{
    int vl(int a)
    {
        return(a*a*a);

    }
    int area( int a){
        return (6*a*a);

    }
    double vl(int r, int h){
        return(3.14*r*r*h);
    }
    double area(int r, int h){
        return(2*3.14*r*r+2*3.14*r*h);
    }
    int vl(int l,int w, int h)
    {
        return(w*h*l);

    }
    int area(int l,int w, int h)
    {
        return(2*(w*l+h*l+h*w));


    }

}
