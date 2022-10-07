package com.org;

public class Desktop implements HardWare, Software  {

	//Child class 
	
	@Override
	public void softwareResources() {
		System.out.println("Hardware used");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Software used");
		System.out.println("OS");
		
	}
			

	@Override
	public void desktopModel() {
		System.out.println("desktop model");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.softwareResources();
		d.hardwareResources();
		d.desktopModel();
	}
	
}
