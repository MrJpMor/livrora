package br.edu.ifg.livroar.model;

import br.edu.ifg.livroar.RGBColorF;

/**
 * Created by JoaoPaulo on 29/04/2015.
 */
public class MtlMaterial {

    private String name;
    private float shininess;
    private RGBColorF ambient;
    private RGBColorF diffuse;
    private RGBColorF specular;
    private float transparency;
    private int illum;

    public MtlMaterial(){
    }

    public MtlMaterial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getShininess() {
        return shininess;
    }

    public void setShininess(float shininess) {
        this.shininess = shininess;
    }

    public RGBColorF getAmbient() {
        return ambient;
    }

    public void setAmbient(float r, float g, float b) {
        ambient = new RGBColorF(r,g,b);
    }

    public RGBColorF getDiffuse() {
        return diffuse;
    }

    public void setDiffuse(float r, float g, float b) {
        diffuse = new RGBColorF(r,g,b);
    }

    public RGBColorF getSpecular() {
        return specular;
    }

    public void setSpecular(float r, float g, float b) {
        specular = new RGBColorF(r,g,b);
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public int getIllum() {
        return illum;
    }

    public void setIllum(int illum) {
        this.illum = illum;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nShininess: " + shininess +
                "\nAmbientColor: " + ambient.getRed() + ", " + ambient.getGreen() + ", " + ambient.getBlue() +
                "\nDiffuseColor: " + diffuse.getRed() + ", " + diffuse.getGreen() + ", " + diffuse.getBlue() +
                "\nSpecularColor: " + specular.getRed() + ", " + specular.getGreen() + ", " + specular.getGreen() +
                "\nTransparency: " + transparency +
                "\nIllum: " + illum;
    }
}