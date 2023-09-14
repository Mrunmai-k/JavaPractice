import tools.*;

class PackageDemo {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        AdvCalc obj2 = new AdvCalc();

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        //System.out.println(obj1.marks); // It says marks is not visible but it is there in Calc class, the problem is
                                        // anything declared in a package is accessible only inside a package. If you
                                        // want to access it outside the package then make it public.
    }
}

/*
 * '*' is used for only files not for folders, means all the files will be
 * imported from tools folder but subfolder inside a tools folder will not be
 * imported.
 */

// Access specifiers in Java
/*
 * Public is accessible from anywhere
 * Private is accessible in class itself 
 * Default is accessible in the same package
 * Protected is accessible in the same package and outside the package in the subclass 
 */