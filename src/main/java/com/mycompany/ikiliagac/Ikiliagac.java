/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ikiliagac;

/**
 *
 * @author Lenovo
 */
public class Ikiliagac {

    public static void main(String[] args) {
     BST tree = new BST();
tree.insert(10);
tree.insert(11);
tree.insert(7);
tree.insert(5);
tree.print(tree.root);
tree.search(4);
tree.deleteKey(10);
    }
}
