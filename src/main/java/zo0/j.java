package zo0;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f128479a;

    public j(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        a(bArr2);
        this.f128479a = bArr2;
    }

    private static void a(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("apdu must be at least 2 bytes long");
        }
    }

    public byte[] b() {
        return (byte[]) this.f128479a.clone();
    }

    public byte[] c() {
        byte[] bArr = this.f128479a;
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public int d() {
        return (e() << 8) | f();
    }

    public int e() {
        byte[] bArr = this.f128479a;
        return bArr[bArr.length - 2] & 255;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return Arrays.equals(this.f128479a, ((j) obj).f128479a);
        }
        return false;
    }

    public int f() {
        byte[] bArr = this.f128479a;
        return bArr[bArr.length - 1] & 255;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f128479a);
    }

    public String toString() {
        return "ResponseAPDU: " + this.f128479a.length + " bytes, SW=" + Integer.toHexString(d());
    }
}
