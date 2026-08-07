package yk;

import java.io.UnsupportedEncodingException;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f125639a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f125640b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f125641c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f125642d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f125643e = a("RIFF");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f125644f = a("WEBP");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f125645g = a("VP8 ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f125646h = a("VP8L");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f125647i = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }

    public static boolean b(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f125647i) && ((bArr[i11 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i11, int i12) {
        return i12 >= 21 && j(bArr, i11 + 12, f125647i);
    }

    public static boolean d(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f125647i) && ((bArr[i11 + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f125646h);
    }

    public static boolean g(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f125645g);
    }

    public static boolean h(byte[] bArr, int i11, int i12) {
        return i12 >= 20 && j(bArr, i11, f125643e) && j(bArr, i11 + 8, f125644f);
    }

    public static b i() {
        b bVar;
        if (f125642d) {
            return f125641c;
        }
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
            bVar = null;
        }
        f125642d = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i11, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i11 > bArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            if (bArr[i12 + i11] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }
}
