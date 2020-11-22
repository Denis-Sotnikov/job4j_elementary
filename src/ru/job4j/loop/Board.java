package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                if (i % 2 != 0){
                    if (j % 2 != 0)
                        System.out.print("X");
                    else
                        System.out.print(" ");
                }
                else{
                        if (j % 2 == 0)
                            System.out.print("X");
                        else
                            System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3,3);
        paint(4,4);
    }
}
