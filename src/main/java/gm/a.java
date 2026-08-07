package gm;

import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgm/a;", "Lgm/c$b;", "<init>", "()V", "", "headerBytes", "", "headerSize", "Lgm/c;", "a", "([BI)Lgm/c;", "I", "b", "()I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f69179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f69180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f69181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f69182f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f69185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f69186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f69187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f69188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f69189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f69190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f69191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f69192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f69194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f69195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f69196t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int headerSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f69183g = f.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f69184h = f.a("GIF89a");

    /* JADX INFO: renamed from: gm.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0011\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001bR\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001eR\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u001bR\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001eR\u0014\u00104\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001eR\u0014\u00105\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u001b¨\u00066"}, d2 = {"Lgm/a$a;", "", "<init>", "()V", "", "imageHeaderBytes", "", "headerSize", "Lgm/c;", "l", "([BI)Lgm/c;", "", "t", "([BI)Z", "u", "q", "o", "s", "r", "p", "headerBytes", "n", "m", "bytes", "k", "([B)I", "SIMPLE_WEBP_HEADER_LENGTH", "I", "EXTENDED_WEBP_HEADER_LENGTH", "JPEG_HEADER", "[B", "JPEG_HEADER_LENGTH", "PNG_HEADER", "PNG_HEADER_LENGTH", "GIF_HEADER_87A", "GIF_HEADER_89A", "GIF_HEADER_LENGTH", "BMP_HEADER", "BMP_HEADER_LENGTH", "ICO_HEADER", "ICO_HEADER_LENGTH", "HEIF_HEADER_PREFIX", "", "HEIF_HEADER_SUFFIXES", "[[B", "HEIF_HEADER_LENGTH", "DNG_HEADER_II", "DNG_HEADER_MM", "DNG_HEADER_LENGTH", "BINARY_XML_HEADER", "BINARY_XML_HEADER_LENGTH", "AVIF_HEADER_PREFIX", "AVIF_HEADER_SUFFIX", "AVIF_HEADER_LENGTH", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int k(byte[] bytes) {
            if (bytes.length < 4) {
                return -1;
            }
            return (bytes[3] & 255) | ((bytes[0] & 255) << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c l(byte[] imageHeaderBytes, int headerSize) {
            if (!yk.c.h(imageHeaderBytes, 0, headerSize)) {
                throw new IllegalStateException("Check failed.");
            }
            if (yk.c.g(imageHeaderBytes, 0)) {
                return b.WEBP_SIMPLE;
            }
            if (yk.c.f(imageHeaderBytes, 0)) {
                return b.WEBP_LOSSLESS;
            }
            if (!yk.c.c(imageHeaderBytes, 0, headerSize)) {
                return c.f69215d;
            }
            if (yk.c.b(imageHeaderBytes, 0)) {
                return b.WEBP_ANIMATED;
            }
            return yk.c.d(imageHeaderBytes, 0) ? b.WEBP_EXTENDED_WITH_ALPHA : b.WEBP_EXTENDED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= 12 && k(imageHeaderBytes) >= 8 && f.b(imageHeaderBytes, a.f69195s, 4)) {
                return f.b(imageHeaderBytes, a.f69196t, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] headerBytes, int headerSize) {
            return headerSize >= 4 && f.c(headerBytes, a.f69194r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < a.f69185i.length) {
                return false;
            }
            return f.c(imageHeaderBytes, a.f69185i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= a.f69193q) {
                return f.c(imageHeaderBytes, a.f69191o) || f.c(imageHeaderBytes, a.f69192p);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 6) {
                return false;
            }
            return f.c(imageHeaderBytes, a.f69183g) || f.c(imageHeaderBytes, a.f69184h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 12 || imageHeaderBytes[3] < 8 || !f.b(imageHeaderBytes, a.f69189m, 4)) {
                return false;
            }
            for (byte[] bArr : a.f69190n) {
                if (f.b(imageHeaderBytes, bArr, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < a.f69187k.length) {
                return false;
            }
            return f.c(imageHeaderBytes, a.f69187k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= a.f69179c.length && f.c(imageHeaderBytes, a.f69179c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= a.f69181e.length && f.c(imageHeaderBytes, a.f69181e);
        }

        private Companion() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f69179c = bArr;
        f69180d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f69181e = bArr2;
        f69182f = bArr2.length;
        byte[] bArrA = f.a("BM");
        f69185i = bArrA;
        f69186j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f69187k = bArr3;
        f69188l = bArr3.length;
        f69189m = f.a("ftyp");
        f69190n = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f69191o = bArr4;
        f69192p = new byte[]{77, 77, 0, 42};
        f69193q = bArr4.length;
        f69194r = new byte[]{3, 0, 8, 0};
        f69195s = f.a("ftyp");
        f69196t = f.a("avif");
    }

    public a() {
        Object objZ0 = n.Z0(new Integer[]{21, 20, Integer.valueOf(f69180d), Integer.valueOf(f69182f), 6, Integer.valueOf(f69186j), Integer.valueOf(f69188l), 12, 4, 12});
        if (objZ0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.headerSize = ((Number) objZ0).intValue();
    }

    @Override // gm.c.b
    public c a(byte[] headerBytes, int headerSize) {
        s.k(headerBytes, "headerBytes");
        if (yk.c.h(headerBytes, 0, headerSize)) {
            return INSTANCE.l(headerBytes, headerSize);
        }
        Companion companion = INSTANCE;
        if (companion.t(headerBytes, headerSize)) {
            return b.JPEG;
        }
        if (companion.u(headerBytes, headerSize)) {
            return b.PNG;
        }
        if (companion.q(headerBytes, headerSize)) {
            return b.GIF;
        }
        if (companion.o(headerBytes, headerSize)) {
            return b.BMP;
        }
        if (companion.s(headerBytes, headerSize)) {
            return b.ICO;
        }
        if (companion.m(headerBytes, headerSize)) {
            return b.AVIF;
        }
        if (companion.r(headerBytes, headerSize)) {
            return b.HEIF;
        }
        if (companion.n(headerBytes, headerSize)) {
            return b.BINARY_XML;
        }
        return companion.p(headerBytes, headerSize) ? b.DNG : c.f69215d;
    }

    @Override // gm.c.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getHeaderSize() {
        return this.headerSize;
    }
}
