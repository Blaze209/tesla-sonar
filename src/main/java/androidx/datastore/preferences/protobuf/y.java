package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f8237a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f8238b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f8239c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f8240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f8241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f8242f;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
        T findValueByNumber(int i11);
    }

    public interface c {
        boolean isInRange(int i11);
    }

    public interface d extends f<Integer> {
    }

    public interface e extends f<Long> {
    }

    public interface f<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        f<E> mutableCopyWithCapacity(int i11);
    }

    static {
        byte[] bArr = new byte[0];
        f8240d = bArr;
        f8241e = ByteBuffer.wrap(bArr);
        f8242f = h.i(bArr);
    }

    static <T> T a(T t11) {
        t11.getClass();
        return t11;
    }

    static <T> T b(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i11, int i12) {
        int iH = h(i12, bArr, i11, i12);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    static Object g(Object obj, Object obj2) {
        return ((p0) obj).toBuilder().T((p0) obj2).buildPartial();
    }

    static int h(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }
}
