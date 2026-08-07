package q2;

import a2.RoundedCornerShape;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.a4;
import k3.g4;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006'"}, d2 = {"Lq2/j;", "", "<init>", "()V", "La2/f;", "b", "La2/f;", "a", "()La2/f;", "CornerExtraLarge", "c", "getCornerExtraLargeTop", "CornerExtraLargeTop", DateTokenConverter.CONVERTER_KEY, "CornerExtraSmall", "e", "getCornerExtraSmallTop", "CornerExtraSmallTop", "f", "getCornerFull", "CornerFull", "g", "CornerLarge", "h", "getCornerLargeEnd", "CornerLargeEnd", IntegerTokenConverter.CONVERTER_KEY, "getCornerLargeTop", "CornerLargeTop", "j", "CornerMedium", "Lk3/g4;", "k", "Lk3/g4;", "getCornerNone", "()Lk3/g4;", "CornerNone", "l", "CornerSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLarge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLargeTop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmallTop;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLarge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeEnd;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerLargeTop;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f104546a = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerFull = a2.g.f();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerMedium = a2.g.c(w4.h.g((float) 12.0d));

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final g4 CornerNone = a4.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerSmall = a2.g.c(w4.h.g((float) 8.0d));

    static {
        float f11 = (float) 28.0d;
        CornerExtraLarge = a2.g.c(w4.h.g(f11));
        float f12 = (float) 0.0d;
        CornerExtraLargeTop = a2.g.d(w4.h.g(f11), w4.h.g(f11), w4.h.g(f12), w4.h.g(f12));
        float f13 = (float) 4.0d;
        CornerExtraSmall = a2.g.c(w4.h.g(f13));
        CornerExtraSmallTop = a2.g.d(w4.h.g(f13), w4.h.g(f13), w4.h.g(f12), w4.h.g(f12));
        float f14 = (float) 16.0d;
        CornerLarge = a2.g.c(w4.h.g(f14));
        CornerLargeEnd = a2.g.d(w4.h.g(f12), w4.h.g(f14), w4.h.g(f14), w4.h.g(f12));
        CornerLargeTop = a2.g.d(w4.h.g(f14), w4.h.g(f14), w4.h.g(f12), w4.h.g(f12));
    }

    private j() {
    }

    public final RoundedCornerShape a() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape b() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape c() {
        return CornerLarge;
    }

    public final RoundedCornerShape d() {
        return CornerMedium;
    }

    public final RoundedCornerShape e() {
        return CornerSmall;
    }
}
