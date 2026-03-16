public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("StringBuffer: "+ sb);
        sb.append(" World");
        System.out.println("append(): " + sb); 

        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        sb.replace(11, 16, "Programmers");
        System.out.println("replace(): " + sb); 
       
        sb.delete(6, 11);
        System.out.println("delete(): " + sb); 

        sb.reverse();
        System.out.println("reverse(): " + sb); 
        
        System.out.println("length(): " + sb.length());
    }

}