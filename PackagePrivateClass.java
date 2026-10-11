package com.example.access;

/*Problem 4: Package-Private Access and Public Classes
Task: Create a package com.example.access with two classes: PublicClass and PackagePrivateClass. 
The PublicClass should have a public method showPublicMessage(), and the PackagePrivateClass should have a package-private method showPackagePrivateMessage().
 Create a class AccessTest to demonstrate that the package-private method cannot be accessed outside its package.*/

public class PackagePrivateClass {
	public void showPackagePrivateMessage()
	{
		System.out.println("It is private class");
	}
}
