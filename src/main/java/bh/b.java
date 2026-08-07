package bh;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f17174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f17175b = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static SecureRandom b() {
        if (f17174a != null) {
            return f17174a;
        }
        synchronized (b.class) {
            try {
                if (f17174a == null) {
                    f17174a = new SecureRandom();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17174a;
    }

    public static byte[] c(byte b11) {
        return new byte[]{b11};
    }

    public static byte[] d(char c11, char c12) {
        return new byte[]{(byte) (c11 & 255), (byte) (c12 & 255)};
    }

    public static byte[] e(long j11) {
        return new byte[]{(byte) j11, (byte) (j11 >> 8), (byte) (j11 >> 16), (byte) (j11 >> 24), (byte) (j11 >> 32), (byte) (j11 >> 40), (byte) (j11 >> 48), (byte) (j11 >> 56)};
    }

    public static byte[] f(short s11) {
        return new byte[]{(byte) s11, (byte) (s11 >> 8)};
    }

    public static byte[] g(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (byte[] bArr3 : bArr) {
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr3, length);
                length2 = bArr3.length;
            } else {
                System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
            }
        }
        return bArrCopyOf;
    }

    public static byte[] h() {
        byte[] bArr = new byte[2];
        b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] i() {
        byte[] bArr = new byte[4];
        b().nextBytes(bArr);
        return bArr;
    }
}
