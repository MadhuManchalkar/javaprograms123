package com.xworkz.tyre;

import com.xowrkz.inheritence.Tyre;

public class TyreRunner1 {

	public static void main(String[] args) {
		Tyre tyre=new Tyre("amazon",2500,9148302612l,true,"101");
        Tyre tyre2=new Tyre("amazon",2500,9148302612l,true,"101");
        boolean madhu=tyre.Madhu(tyre2);
        System.out.println("equal"+madhu);
	}

}
