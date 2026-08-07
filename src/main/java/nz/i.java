package nz;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    public static Cipher a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
