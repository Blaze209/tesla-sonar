package w00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007\"\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\t\u0010\u0007\"\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007\"\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\f\u0010\u0007¨\u0006!"}, d2 = {"", "byteArray", "", "a", "([B)I", "I", DateTokenConverter.CONVERTER_KEY, "()I", "FREE_ATOM", "b", "f", "JUNK_ATOM", "c", "g", "MDAT_ATOM", "h", "MOOV_ATOM", "e", "j", "PNOT_ATOM", "k", "SKIP_ATOM", "n", "WIDE_ATOM", IntegerTokenConverter.CONVERTER_KEY, "PICT_ATOM", "FTYP_ATOM", "m", "UUID_ATOM", "CMOV_ATOM", "l", "STCO_ATOM", "CO64_ATOM", "react-native-compressor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f120248a = a(new byte[]{102, 114, 101, 101});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f120249b = a(new byte[]{106, 117, 110, 107});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f120250c = a(new byte[]{109, 100, 97, 116});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f120251d = a(new byte[]{109, 111, 111, 118});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f120252e = a(new byte[]{112, 110, 111, 116});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f120253f = a(new byte[]{115, 107, 105, 112});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f120254g = a(new byte[]{119, 105, 100, 101});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f120255h = a(new byte[]{80, 73, 67, 84});

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f120256i = a(new byte[]{102, 116, 121, 112});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f120257j = a(new byte[]{117, 117, 105, 100});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f120258k = a(new byte[]{99, 109, 111, 118});

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f120259l = a(new byte[]{115, 116, 99, 111});

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f120260m = a(new byte[]{99, 111, 54, 52});

    public static final int a(byte[] byteArray) {
        s.k(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int b() {
        return f120258k;
    }

    public static final int c() {
        return f120260m;
    }

    public static final int d() {
        return f120248a;
    }

    public static final int e() {
        return f120256i;
    }

    public static final int f() {
        return f120249b;
    }

    public static final int g() {
        return f120250c;
    }

    public static final int h() {
        return f120251d;
    }

    public static final int i() {
        return f120255h;
    }

    public static final int j() {
        return f120252e;
    }

    public static final int k() {
        return f120253f;
    }

    public static final int l() {
        return f120259l;
    }

    public static final int m() {
        return f120257j;
    }

    public static final int n() {
        return f120254g;
    }
}
