package h0;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Charset f70095e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String[] f70096f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f70097g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte[] f70098h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f70101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f70102d;

    h(int i11, int i12, byte[] bArr) {
        this(i11, i12, -1L, bArr);
    }

    @NonNull
    public static h a(@NonNull String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f70095e);
        return new h(1, bytes.length, bytes);
    }

    @NonNull
    public static h b(@NonNull double[] dArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d11 : dArr) {
            byteBufferWrap.putDouble(d11);
        }
        return new h(12, dArr.length, byteBufferWrap.array());
    }

    @NonNull
    public static h c(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putInt(i11);
        }
        return new h(9, iArr.length, byteBufferWrap.array());
    }

    @NonNull
    public static h d(@NonNull l[] lVarArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[10] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new h(10, lVarArr.length, byteBufferWrap.array());
    }

    @NonNull
    public static h e(@NonNull String str) {
        byte[] bytes = (str + (char) 0).getBytes(f70095e);
        return new h(2, bytes.length, bytes);
    }

    @NonNull
    public static h f(long j11, @NonNull ByteOrder byteOrder) {
        return g(new long[]{j11}, byteOrder);
    }

    @NonNull
    public static h g(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j11 : jArr) {
            byteBufferWrap.putInt((int) j11);
        }
        return new h(4, jArr.length, byteBufferWrap.array());
    }

    @NonNull
    public static h h(@NonNull l[] lVarArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[5] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new h(5, lVarArr.length, byteBufferWrap.array());
    }

    @NonNull
    public static h i(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f70097g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putShort((short) i11);
        }
        return new h(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f70097g[this.f70099a] * this.f70100b;
    }

    public String toString() {
        return "(" + f70096f[this.f70099a] + ", data length:" + this.f70102d.length + ")";
    }

    h(int i11, int i12, long j11, byte[] bArr) {
        this.f70099a = i11;
        this.f70100b = i12;
        this.f70101c = j11;
        this.f70102d = bArr;
    }
}
