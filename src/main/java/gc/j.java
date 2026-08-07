package gc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import sc.Size;
import yc.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgc/j;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lsc/f;", "scale", "a", "(IIIILsc/f;)I", "", DateTokenConverter.CONVERTER_KEY, "(IIIILsc/f;)D", "", "e", "(FFFFLsc/f;)F", "c", "(DDDDLsc/f;)D", "Lsc/g;", "targetSize", "maxSize", "Lyc/q;", "b", "(IILsc/g;Lsc/f;Lsc/g;)J", "Lsc/a;", "f", "(Lsc/a;Lsc/f;)I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f67814a = new j();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67815a;

        static {
            int[] iArr = new int[sc.f.values().length];
            try {
                iArr[sc.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67815a = iArr;
        }
    }

    private j() {
    }

    public static final int a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, sc.f scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i11 = a.f67815a[scale.ordinal()];
        if (i11 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return bo0.n.f(iMin, 1);
    }

    public static final long b(int srcWidth, int srcHeight, Size targetSize, sc.f scale, Size maxSize) {
        if (!sc.h.b(targetSize)) {
            j jVar = f67814a;
            int iF = jVar.f(targetSize.getWidth(), scale);
            srcHeight = jVar.f(targetSize.getHeight(), scale);
            srcWidth = iF;
        }
        if ((maxSize.getWidth() instanceof sc.a.C2364a) && !f0.n(srcWidth)) {
            srcWidth = bo0.n.j(srcWidth, ((sc.a.C2364a) maxSize.getWidth()).getPx());
        }
        if ((maxSize.getHeight() instanceof sc.a.C2364a) && !f0.n(srcHeight)) {
            srcHeight = bo0.n.j(srcHeight, ((sc.a.C2364a) maxSize.getHeight()).getPx());
        }
        return yc.q.a(srcWidth, srcHeight);
    }

    public static final double c(double srcWidth, double srcHeight, double dstWidth, double dstHeight, sc.f scale) {
        double d11 = dstWidth / srcWidth;
        double d12 = dstHeight / srcHeight;
        int i11 = a.f67815a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(d11, d12);
        }
        if (i11 == 2) {
            return Math.min(d11, d12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double d(int srcWidth, int srcHeight, int dstWidth, int dstHeight, sc.f scale) {
        double d11 = ((double) dstWidth) / ((double) srcWidth);
        double d12 = ((double) dstHeight) / ((double) srcHeight);
        int i11 = a.f67815a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(d11, d12);
        }
        if (i11 == 2) {
            return Math.min(d11, d12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float e(float srcWidth, float srcHeight, float dstWidth, float dstHeight, sc.f scale) {
        float f11 = dstWidth / srcWidth;
        float f12 = dstHeight / srcHeight;
        int i11 = a.f67815a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(f11, f12);
        }
        if (i11 == 2) {
            return Math.min(f11, f12);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int f(sc.a aVar, sc.f fVar) {
        if (aVar instanceof sc.a.C2364a) {
            return ((sc.a.C2364a) aVar).getPx();
        }
        int i11 = a.f67815a[fVar.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
