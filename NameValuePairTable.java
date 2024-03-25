public class NameValuePairTable {
    public static void main(String[] args) {
        // Arrays containing names and corresponding values
        String[] names = {"Peter", "Amy", "John", "Boyd", "Cathy"};
        int[] values = {15, 9, 14, 10, 12};

        // Print table header
        System.out.println("Name\t\tValue");
        System.out.println("------------------------");

        // Iterate over the arrays to print name-value pairs
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t\t" + values[i]);
        }
    }
}
