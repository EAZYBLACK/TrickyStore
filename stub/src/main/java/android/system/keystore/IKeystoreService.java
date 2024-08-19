package android.system.keystore;

import android.os.IBinder;

public interface IKeystoreService {
    String DESCRIPTOR = "android.system.keystore.IKeystoreService";

    IKeystoreSecurityLevel getSecurityLevel(int securityLevel);

    class Stub {
        public static IKeystoreService asInterface(IBinder b) {
            throw new RuntimeException("");
        }
    }
}
