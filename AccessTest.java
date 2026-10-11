package com.example.access;
import com.example.access.PublicClass;
import com.example.access.PackagePrivateClass; // ERROR

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass publicObject = new PublicClass();
        publicObject.showPublicMessage();

         PackagePrivateClass packageObject = new PackagePrivateClass();
         packageObject.showPackagePrivateMessage();

	}

}
