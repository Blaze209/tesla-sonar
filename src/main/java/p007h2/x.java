package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import j3.g;
import p013kotlin.Metadata;
import t4.i;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lj3/g;", "position", "a", "(J)J", "", "isStartHandle", "Lt4/i;", "direction", "handlesCrossed", "f", "(ZLt4/i;Z)Z", "areHandlesCrossed", "e", "(Lt4/i;Z)Z", "Lw4/h;", Gender.FEMALE, "c", "()F", "HandleWidth", "b", "HandleHeight", "Lg4/x;", "Lh2/w;", "Lg4/x;", DateTokenConverter.CONVERTER_KEY, "()Lg4/x;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f70402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f70403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g4.x<SelectionHandleInfo> f70404c = new g4.x<>("SelectionHandleInfo", null, 2, null);

    static {
        float f11 = 25;
        f70402a = h.g(f11);
        f70403b = h.g(f11);
    }

    public static final long a(long j11) {
        return j3.h.a(g.m(j11), g.n(j11) - 1.0f);
    }

    public static final float b() {
        return f70403b;
    }

    public static final float c() {
        return f70402a;
    }

    public static final g4.x<SelectionHandleInfo> d() {
        return f70404c;
    }

    public static final boolean e(i iVar, boolean z11) {
        if (iVar != i.Ltr || z11) {
            return iVar == i.Rtl && z11;
        }
        return true;
    }

    public static final boolean f(boolean z11, i iVar, boolean z12) {
        if (z11) {
            return e(iVar, z12);
        }
        return !e(iVar, z12);
    }
}
