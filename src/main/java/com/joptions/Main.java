package com.joptions;

import java.util.ArrayList;

// import java.text.MessageFormat;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal animalito;
        String[] options = {"Perro", "Gato", "Leon", "Pez"};
        Object defaultOption = options[0];
        do{
            animalito = new Animal();
            animalito.setNombre(JOptionPane.showInputDialog("Escriba el nombre del animal :"));
            animalito.setTipo(JOptionPane.showInputDialog(null, "mensaje", "",JOptionPane.QUESTION_MESSAGE,null,options,defaultOption).toString());
            animalito.setEdad((Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad del animal :"))));
            animales.add(animalito);
        }while(JOptionPane.showConfirmDialog(null, "Desea ingresar otro animal", 
        "Confirmacion",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        for(Animal item : animales){
            JOptionPane.showMessageDialog(null, "Nombre :"+item.getNombre());
        }
        /* 
        //----------------------
        String nombre = JOptionPane.showInputDialog("Escriba su nombre :");
        JOptionPane.showMessageDialog(null, MessageFormat.format("Nombre : {0}",nombre));*/
        /*var valor = JOptionPane.showConfirmDialog(null, "Quiere continuar", "Informacion",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (valor == 0){
            JOptionPane.showMessageDialog(null, "Acepto terminos");
        }else if (valor == 2){
        //     JOptionPane.showMessageDialog(null, "No acepto");
        // }
        // System.out.println(valor);*/
        // var valor = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el dato", "Informacion",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        // System.out.println(valor);
        // JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion",
        // JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion",
        // JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion",
        // JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        // String[] options = {"Español", "Inglés", "Francés", "Alemán"};
        // Object defaultOption = options[3];
        // // Mostrar el cuadro de diálogo y obtener la selección del usuario
        // Object opcion = JOptionPane.showInputDialog(null, "mensaje", "",JOptionPane.QUESTION_MESSAGE,null,options,defaultOption);
        // System.out.println("Idioma seleccionado: " + opcion);
    }
}