package jnademo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;


public class JNACaller
{
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)Native.loadLibrary("clslib", CLibrary.class);

        ClsLib *create();
        void destroy(ClsLib *clslib);
    }

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
}
