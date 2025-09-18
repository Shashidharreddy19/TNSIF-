package com.tnsif.abstraction;

public class rectangle extends shape{
	private int height=3,width=4 ;
		public rectangle(int height,int width) {
			this.height=height;
			this.width=width;
		
		}
		void calarea() {
			super.area=height*width;
		}
	}


