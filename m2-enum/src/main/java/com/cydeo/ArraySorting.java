package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as= new ArraySorting();

      QucikSort qs= new QucikSort();
      BubbleSort bs = new BubbleSort();

      as.sort(qs);
      as.sort(bs);



    }

    private void sort(Sorting sorting){
      sorting.sort();

    }

}
