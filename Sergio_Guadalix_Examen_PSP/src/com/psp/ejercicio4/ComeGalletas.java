package com.psp.ejercicio4;


public class ComeGalletas implements Runnable{
    private final BandejaGalletas bandejaGalletas;
    private final String id;


    public ComeGalletas(BandejaGalletas bandejaGalletas, String id) 
    {
        this.bandejaGalletas = bandejaGalletas;
        this.id = id;
    }

    public void run() 
    {
        while(Boolean.TRUE)
        {
        	
        	
        	try {
				Thread.sleep(1500);
				System.out.println("El pitufo "+id+" se come: " +bandejaGalletas.getGalletas() +" galletas\n");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
    }
}
