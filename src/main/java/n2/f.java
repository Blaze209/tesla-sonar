package n2;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lj3/m;", "size", "", "b", "(J)F", "Lw4/d;", "", "bounded", "a", "(Lw4/d;ZJ)F", "Lw4/h;", Gender.FEMALE, "BoundedRippleExtraRadius", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f92696a = w4.h.g(10);

    public static final float a(w4.d dVar, boolean z11, long j11) {
        float fK = j3.g.k(j3.h.a(j3.m.k(j11), j3.m.i(j11))) / 2.0f;
        return z11 ? fK + dVar.O1(f92696a) : fK;
    }

    public static final float b(long j11) {
        return Math.max(j3.m.k(j11), j3.m.i(j11)) * 0.3f;
    }
}
