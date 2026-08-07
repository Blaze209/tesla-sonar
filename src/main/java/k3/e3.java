package k3;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\n"}, d2 = {"Lk3/e3;", "", "", "value", "a", "(F)S", "", "halfValue", "b", "(S)S", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class e3 implements Comparable<e3> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final short f84763b = b(5120);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final short f84764c = b(-1025);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f84765d = b(31743);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f84766e = b(1024);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final short f84767f = b(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short f84768g = b(32256);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f84769h = b(-1024);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f84770i = b(Short.MIN_VALUE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short f84771j = b(31744);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final short f84772k = b(0);

    public static short a(float f11) {
        int i11;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        int i12 = iFloatToRawIntBits >>> 31;
        int i13 = (iFloatToRawIntBits >>> 23) & 255;
        int i14 = 8388607 & iFloatToRawIntBits;
        int i15 = 31;
        int i16 = 0;
        if (i13 != 255) {
            int i17 = i13 - 112;
            if (i17 >= 31) {
                i15 = 49;
            } else {
                if (i17 > 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i17 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i15 = i17;
                    }
                    return b((short) i11);
                }
                if (i17 >= -10) {
                    int i18 = (8388608 | i14) >> (1 - i17);
                    if ((i18 & 4096) != 0) {
                        i18 += PKIFailureInfo.certRevoked;
                    }
                    i15 = 0;
                    i16 = i18 >> 13;
                } else {
                    i15 = 0;
                }
            }
        } else if (i14 != 0) {
            i16 = 512;
        }
        i11 = (i12 << 15) | (i15 << 10) | i16;
        return b((short) i11);
    }

    public static short b(short s11) {
        return s11;
    }
}
