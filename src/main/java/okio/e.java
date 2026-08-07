package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\n*\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\n*\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010)\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010-\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"", "size", "offset", "byteCount", "Ljn0/h0;", "b", "(JJJ)V", "", "j", "(S)S", "", "h", "(I)I", IntegerTokenConverter.CONVERTER_KEY, "(J)J", "", "a", "aOffset", "bOffset", "", "([BI[BII)Z", "", "", "k", "(B)Ljava/lang/String;", "l", "(I)Ljava/lang/String;", "Lokio/h$a;", "unsafeCursor", "g", "(Lokio/h$a;)Lokio/h$a;", "Lokio/k;", "position", "e", "(Lokio/k;I)I", "sizeParam", "f", "([BI)I", "Lokio/h$a;", DateTokenConverter.CONVERTER_KEY, "()Lokio/h$a;", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h.a f97911a = new h.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f97912b = -1234567890;

    public static final boolean a(byte[] a11, int i11, byte[] b11, int i12, int i13) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        p013kotlin.jvm.internal.s.k(b11, "b");
        for (int i14 = 0; i14 < i13; i14++) {
            if (a11[i14 + i11] != b11[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException("size=" + j11 + " offset=" + j12 + " byteCount=" + j13);
        }
    }

    public static final int c() {
        return f97912b;
    }

    public static final h.a d() {
        return f97911a;
    }

    public static final int e(k kVar, int i11) {
        p013kotlin.jvm.internal.s.k(kVar, "<this>");
        return i11 == f97912b ? kVar.D() : i11;
    }

    public static final int f(byte[] bArr, int i11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        return i11 == f97912b ? bArr.length : i11;
    }

    public static final h.a g(h.a unsafeCursor) {
        p013kotlin.jvm.internal.s.k(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f97911a ? new h.a() : unsafeCursor;
    }

    public static final int h(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    public static final long i(long j11) {
        return ((j11 & 255) << 56) | (((-72057594037927936L) & j11) >>> 56) | ((71776119061217280L & j11) >>> 40) | ((280375465082880L & j11) >>> 24) | ((1095216660480L & j11) >>> 8) | ((4278190080L & j11) << 8) | ((16711680 & j11) << 24) | ((65280 & j11) << 40);
    }

    public static final short j(short s11) {
        return (short) (((s11 & 255) << 8) | ((65280 & s11) >>> 8));
    }

    public static final String k(byte b11) {
        return p013kotlin.text.t.D(new char[]{ip0.b.d()[(b11 >> 4) & 15], ip0.b.d()[b11 & 15]});
    }

    public static final String l(int i11) {
        if (i11 == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        int i12 = 0;
        char[] cArr = {ip0.b.d()[(i11 >> 28) & 15], ip0.b.d()[(i11 >> 24) & 15], ip0.b.d()[(i11 >> 20) & 15], ip0.b.d()[(i11 >> 16) & 15], ip0.b.d()[(i11 >> 12) & 15], ip0.b.d()[(i11 >> 8) & 15], ip0.b.d()[(i11 >> 4) & 15], ip0.b.d()[i11 & 15]};
        while (i12 < 8 && cArr[i12] == '0') {
            i12++;
        }
        return p013kotlin.text.t.E(cArr, i12, 8);
    }
}
