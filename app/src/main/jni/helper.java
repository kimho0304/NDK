public class helper {
    static {
        System.loadLibrary("helloNdk");
    }
    public native String print_ndk(String text);

    public native int nativeMethod();
}
