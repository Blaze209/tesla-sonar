package my;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f92534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92536c;

    public b(int i11, int i12) {
        this.f92534a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.f92535b = i11;
        this.f92536c = i12;
    }

    public void a(byte b11) {
        for (byte[] bArr : this.f92534a) {
            Arrays.fill(bArr, b11);
        }
    }

    public byte b(int i11, int i12) {
        return this.f92534a[i12][i11];
    }

    public byte[][] c() {
        return this.f92534a;
    }

    public int d() {
        return this.f92536c;
    }

    public int e() {
        return this.f92535b;
    }

    public void f(int i11, int i12, int i13) {
        this.f92534a[i12][i11] = (byte) i13;
    }

    public void g(int i11, int i12, boolean z11) {
        this.f92534a[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f92535b * 2 * this.f92536c) + 2);
        for (int i11 = 0; i11 < this.f92536c; i11++) {
            byte[] bArr = this.f92534a[i11];
            for (int i12 = 0; i12 < this.f92535b; i12++) {
                byte b11 = bArr[i12];
                if (b11 == 0) {
                    sb2.append(" 0");
                } else if (b11 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
