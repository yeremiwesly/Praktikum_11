/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author NITRO 5
 */
public class rerata {
    //array of integer -> data
    int [] dataBil = new int [100];
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Banyaknya data (n) : ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukkan bil ke-" +(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    double hitungrerata(int [] data){
        double sum = 0;
        for(int i=0; i<this.n ; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
     int cariMin(int[] arr){
        int min = arr[0];
        for(int a=1;a>this.n;a++){
            if (min>arr[a]){
                min = arr[a];
            }
        }
        return min;
    }
    int cariMaks(int[] arr){
        int maks = arr[0];
        for(int a=1;a<this.n;a++){
            if (maks<arr[a]){
                maks = arr[a];
            }
        }
        return maks;
    }
    void output(){
        System.out.println("Rata-rata : " + this.hitungrerata(this.dataBil));
        System.out.println("Nilai Minimal : " + this.cariMin(this.dataBil));
        System.out.println("Nilai Maksimal : " + this.cariMaks(this.dataBil));
    }    
}
