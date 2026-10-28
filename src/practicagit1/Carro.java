/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagit1;

/**
 *
 * @author patri
 */
public class Carro {
    String marca;
    String color;
    int velocidad;

    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Color: ").append(color).append("\n");
        return sb.toString();
    }
    public void acelerar() {
        velocidad += 10;
    }
    
}