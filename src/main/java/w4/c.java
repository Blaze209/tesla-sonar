package w4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001c\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001b\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001e\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u001e\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a*\u0010$\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"", "widthVal", "heightVal", "Ljn0/h0;", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lw4/b;", "j", "(IIII)J", "e", "(I)I", "n", "a", "otherConstraints", "g", "(JJ)J", "Lw4/r;", "f", Snapshot.WIDTH, IntegerTokenConverter.CONVERTER_KEY, "(JI)I", Snapshot.HEIGHT, "h", "", "m", "(JJ)Z", "horizontal", "vertical", "o", "(JII)J", "max", "value", DateTokenConverter.CONVERTER_KEY, "(II)I", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final long a(int i11, int i12, int i13, int i14) {
        boolean z11 = false;
        if (!(i12 >= i11)) {
            m.a("maxWidth(" + i12 + ") must be >= than minWidth(" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (!(i14 >= i13)) {
            m.a("maxHeight(" + i14 + ") must be >= than minHeight(" + i13 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (i11 >= 0 && i13 >= 0) {
            z11 = true;
        }
        if (!z11) {
            m.a("minWidth(" + i11 + ") and minHeight(" + i13 + ") must be >= 0");
        }
        return j(i11, i12, i13, i14);
    }

    public static /* synthetic */ long b(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return a(i11, i12, i13, i14);
    }

    private static final int d(int i11, int i12) {
        return i11 == Integer.MAX_VALUE ? i11 : bo0.n.f(i11 + i12, 0);
    }

    private static final int e(int i11) {
        if (i11 < 8191) {
            return 13;
        }
        if (i11 < 32767) {
            return 15;
        }
        if (i11 < 65535) {
            return 16;
        }
        return i11 < 262143 ? 18 : 255;
    }

    public static final long f(long j11, long j12) {
        return s.a(bo0.n.n(r.g(j12), b.n(j11), b.l(j11)), bo0.n.n(r.f(j12), b.m(j11), b.k(j11)));
    }

    public static final long g(long j11, long j12) {
        return a(bo0.n.n(b.n(j12), b.n(j11), b.l(j11)), bo0.n.n(b.l(j12), b.n(j11), b.l(j11)), bo0.n.n(b.m(j12), b.m(j11), b.k(j11)), bo0.n.n(b.k(j12), b.m(j11), b.k(j11)));
    }

    public static final int h(long j11, int i11) {
        return bo0.n.n(i11, b.m(j11), b.k(j11));
    }

    public static final int i(long j11, int i11) {
        return bo0.n.n(i11, b.n(j11), b.l(j11));
    }

    public static final long j(int i11, int i12, int i13, int i14) {
        int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int iE = e(i15);
        int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iE2 = e(i16);
        if (iE + iE2 > 31) {
            k(i16, i15);
        }
        int i17 = i12 + 1;
        int i18 = i17 & (~(i17 >> 31));
        int i19 = i14 + 1;
        int i21 = i19 & (~(i19 >> 31));
        int i22 = 0;
        if (iE2 != 13) {
            if (iE2 == 18) {
                i22 = 3;
            } else if (iE2 == 15) {
                i22 = 1;
            } else if (iE2 == 16) {
                i22 = 2;
            }
        }
        int i23 = ((i22 & 1) << 1) + (((i22 & 2) >> 1) * 3);
        return b.b((((long) i18) << 33) | ((long) i22) | (((long) i11) << 2) | (((long) i13) << (i23 + 15)) | (((long) i21) << (i23 + 46)));
    }

    private static final void k(int i11, int i12) {
        throw new IllegalArgumentException("Can't represent a width of " + i11 + " and height of " + i12 + " in Constraints");
    }

    private static final Void l(int i11) {
        throw new IllegalArgumentException("Can't represent a size of " + i11 + " in Constraints");
    }

    public static final boolean m(long j11, long j12) {
        int iN = b.n(j11);
        int iL = b.l(j11);
        int iG = r.g(j12);
        if (iN > iG || iG > iL) {
            return false;
        }
        int iM = b.m(j11);
        int iK = b.k(j11);
        int iF = r.f(j12);
        return iM <= iF && iF <= iK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i11) {
        if (i11 < 8191) {
            return 262142;
        }
        if (i11 < 32767) {
            return 65534;
        }
        if (i11 < 65535) {
            return 32766;
        }
        if (i11 < 262143) {
            return 8190;
        }
        l(i11);
        throw new KotlinNothingValueException();
    }

    public static final long o(long j11, int i11, int i12) {
        return a(bo0.n.f(b.n(j11) + i11, 0), d(b.l(j11), i11), bo0.n.f(b.m(j11) + i12, 0), d(b.k(j11), i12));
    }

    public static /* synthetic */ long p(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return o(j11, i11, i12);
    }
}
