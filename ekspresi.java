/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class ekspresi {
     public static void main(String[] args) {
    int x = 100; // pernyataan
 int y = 200; // pernyataan
 int z = x + y; // pernyataan, sedangkan x + y adalah ekspresi

 int sum = 0, idx = 0;
 while (idx < 10) { // awal blok, idx < 10 adalah ekspresi
 sum += idx;
 idx ++;
 System.out.println(idx ++);
 //System.out.println(sum += idx);
} // akhir blok
}
}
     
