/**
 * Author    zhengchengbin
 * Describe:
 * Data:      2019/10/10 17:27
 * Modify by:
 * Modification date:
 * Modify content:
 */
public class HelloWorld {

    static {
        try {
            System.out.println(System.getProperty("java.library.path"));
            System.loadLibrary("helloworld");
        } catch (Exception e) {
        }
    }

    private volatile static HelloWorld mInstance;

    private HelloWorld() {}

    public static HelloWorld getInstance() {
        if (mInstance == null) {
            synchronized (HelloWorld.class) {
                if (mInstance == null) {
                    mInstance = new HelloWorld();
                }
            }
        }
        return mInstance;
    }

    public native String nativeGetString();

}
