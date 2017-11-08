public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = Long.parseLong("100");; // Input: any valid number of bytes

        long gigaBytes = (totalBytes / 1024 / 1024 / 1024) % 1024; // Your formula
        long megaBytes = (totalBytes / 1024 / 1024) % 1024; // Your formula
        long kiloBytes = (totalBytes / 1024) % 1024; // Your formula
        long bytes = totalBytes % 1024; // Your formula

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }
}
