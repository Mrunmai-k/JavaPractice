class StringDemo {
    public static void main(String[] args) {
        /*
         * String name = new String("Mrunmai");
         * System.out.println(name);
         * System.out.println(name.hashCode());
         * System.out.println("hello "+name);
         * System.out.println(name.charAt(1));
         * System.out.println(name.concat("Kudale"));
         */

        /*
         * String name = "Mrunmai";
         * System.out.println(name);
         * 
         * name = name + " Kudale"; // even if you change the name, this will create a
         * new and point name to that object
         * System.out.println("hello "+name);
         * 
         * String s1 = "mrun";
         * String s2 = "mrun";
         * 
         * // This will not create two diff objects, this just creates two refs for one
         * object;
         * System.out.println(s1==s2); // the value for the addresses are same
         * 
         * // There is a string constant pool inside a heap which stores all the string
         * constant
         */

         StringBuffer sb = new StringBuffer("Mrunmai");
         System.out.println(sb.capacity());
         System.out.println(sb.length());

         sb.append("Kudale");
         sb.deleteCharAt(2);
         sb.insert(2,"u");
         System.out.println(sb);

        //  StringBuffer is thread safe and StringBuilder is not
        
    }
}