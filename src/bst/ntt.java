/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;


/**
 *
 * @author nestyko
 */
public class ntt<T>
   {
      public T data;
      public ntt<T> left, right;
      int xpos, ypos;

      public ntt(T data, ntt<T> l, ntt<T> r)
      {
         left = l; right = r;
         this.data = data;
      }

      public ntt(T data)
      {
         this(data, null, null);
      }

      public String toString()
      {
         return data.toString();
      }
   } //end of ntt
