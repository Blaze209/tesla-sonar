package ck0;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final byte f19396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte f19397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f19400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19401f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f19403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f19404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f19407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f19409h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f19404c), Integer.valueOf(this.f19408g), Boolean.valueOf(this.f19407f), Integer.valueOf(this.f19402a), Long.valueOf(this.f19403b), Integer.valueOf(this.f19409h), Integer.valueOf(this.f19405d), Integer.valueOf(this.f19406e));
        }
    }

    protected b(int i11, int i12, int i13, int i14) {
        this(i11, i12, i13, i14, (byte) 61);
    }

    protected static byte[] i(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected static String m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    private byte[] o(a aVar) {
        byte[] bArr = aVar.f19404c;
        if (bArr == null) {
            aVar.f19404c = new byte[j()];
            aVar.f19405d = 0;
            aVar.f19406e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f19404c = bArr2;
        }
        return aVar.f19404c;
    }

    int a(a aVar) {
        if (aVar.f19404c != null) {
            return aVar.f19405d - aVar.f19406e;
        }
        return 0;
    }

    protected boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b11 : bArr) {
            if (this.f19397b == b11 || l(b11)) {
                return true;
            }
        }
        return false;
    }

    abstract void c(byte[] bArr, int i11, int i12, a aVar);

    public byte[] d(String str) {
        return e(i(str));
    }

    public byte[] e(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        c(bArr, 0, bArr.length, aVar);
        c(bArr, 0, -1, aVar);
        int i11 = aVar.f19405d;
        byte[] bArr2 = new byte[i11];
        n(bArr2, 0, i11, aVar);
        return bArr2;
    }

    abstract void f(byte[] bArr, int i11, int i12, a aVar);

    public byte[] g(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        f(bArr, 0, bArr.length, aVar);
        f(bArr, 0, -1, aVar);
        int i11 = aVar.f19405d - aVar.f19406e;
        byte[] bArr2 = new byte[i11];
        n(bArr2, 0, i11, aVar);
        return bArr2;
    }

    protected byte[] h(int i11, a aVar) {
        byte[] bArr = aVar.f19404c;
        return (bArr == null || bArr.length < aVar.f19405d + i11) ? o(aVar) : bArr;
    }

    protected int j() {
        return PKIFailureInfo.certRevoked;
    }

    public long k(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f19398c;
        long j11 = ((long) (((length + i11) - 1) / i11)) * ((long) this.f19399d);
        int i12 = this.f19400e;
        return i12 > 0 ? j11 + ((((((long) i12) + j11) - 1) / ((long) i12)) * ((long) this.f19401f)) : j11;
    }

    protected abstract boolean l(byte b11);

    int n(byte[] bArr, int i11, int i12, a aVar) {
        if (aVar.f19404c == null) {
            return aVar.f19407f ? -1 : 0;
        }
        int iMin = Math.min(a(aVar), i12);
        System.arraycopy(aVar.f19404c, aVar.f19406e, bArr, i11, iMin);
        int i13 = aVar.f19406e + iMin;
        aVar.f19406e = i13;
        if (i13 >= aVar.f19405d) {
            aVar.f19404c = null;
        }
        return iMin;
    }

    protected b(int i11, int i12, int i13, int i14, byte b11) {
        this.f19396a = (byte) 61;
        this.f19398c = i11;
        this.f19399d = i12;
        this.f19400e = (i13 <= 0 || i14 <= 0) ? 0 : (i13 / i12) * i12;
        this.f19401f = i14;
        this.f19397b = b11;
    }
}
