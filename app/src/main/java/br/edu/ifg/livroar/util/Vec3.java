package br.edu.ifg.livroar.util;

/**
 * Created by JoaoPaulo on 02/04/2015.
 */
public class Vec3 {

    public float x;
    public float y;
    public float z;

    public Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3 copy(){
        return new Vec3(x, y, z);
    }

    public void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(Vec3 v) {
        this.x = v.x;
        this.x = v.x;
        this.z = v.z;
    }

    public float dot(Vec3 v){
        return x * v.x + y * v.y + z * v.z;
    }

    public float length(){
        return (float) Math.sqrt( (x*x) + (y*y) + (z*z));
    }

    public void normalize (){
        this.div(length());
    }

    public void setLength (float length) {
        normalize();
        mult(length);
    }

    public void add(Vec3 v){
        x += v.x;
        y += v.y;
        z += v.z;
    }

    public void add(float n){
        x += n;
        y += n;
        z += n;
    }

    public void sub(Vec3 v){
        x -= v.x;
        y -= v.y;
        z -= v.z;
    }

    public void sub(float n){
        x -= n;
        y -= n;
        z -= n;
    }

    public void mult(Vec3 v){
        x *= v.x;
        y *= v.y;
        z *= v.z;
    }

    public void mult(float n){
        x *= n;
        y *= n;
        z *= n;
    }

    public void div(Vec3 v){
        x /= v.x;
        y /= v.y;
        z /= v.z;
    }

    public void div(float n){
        x /= n;
        y /= n;
        z /= n;
    }

    public String toString(){
        return "(" + x + "," + y + "," + z + ")";
    }


}
