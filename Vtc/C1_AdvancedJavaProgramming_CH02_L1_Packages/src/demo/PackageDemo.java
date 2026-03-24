package demo;

import com.vtc.MyUtil;


public class PackageDemo {

	public static void main(String[] args) {
		java.util.List myList = new java.util.ArrayList();
		
		//CanNotReuse c = new CanNotReuse();
		MyUtil vtcUtil = new MyUtil();
		acme.MyUtil acmeUtil = new acme.MyUtil();
		
		SamePackageHelper c = new SamePackageHelper();
	}

}
