
package com.psp.ejercicio4;

public class BandejaGalletas 
{
    private int numeroGalletas;
    private boolean bandejaLlena = Boolean.FALSE;
    CocineroGalletas cocinero = new CocineroGalletas(null, null);

    public synchronized int getGalletas()
    {
       while(!bandejaLlena) {
    	   try {
    		   wait();
    	   }
    	   catch (Exception e) {
    		   e.printStackTrace();
    	   }
       
       }
       bandejaLlena = false;
       notify();
       return numeroGalletas;
       
    }


    public synchronized void putGalletas(int value) 
    {
    	while(bandejaLlena) {
    		try {
    			wait();
    		} catch(Exception e) {
    			e.printStackTrace();;
    		}
    	}
    	bandejaLlena = true;
    	notify();
        this.numeroGalletas=value;
    }
}
