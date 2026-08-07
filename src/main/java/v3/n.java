package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lv3/x;", "", "a", "(Lv3/x;)Z", "b", "c", DateTokenConverter.CONVERTER_KEY, "k", "Lj3/g;", "h", "(Lv3/x;)J", IntegerTokenConverter.CONVERTER_KEY, "ignoreConsumed", "j", "(Lv3/x;Z)J", "Ljn0/h0;", "e", "(Lv3/x;)V", "Lw4/r;", "size", "f", "(Lv3/x;J)Z", "Lj3/m;", "extendedTouchPadding", "g", "(Lv3/x;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {
    public static final boolean a(PointerInputChange xVar) {
        return (xVar.p() || xVar.getPreviousPressed() || !xVar.getPressed()) ? false : true;
    }

    public static final boolean b(PointerInputChange xVar) {
        return !xVar.getPreviousPressed() && xVar.getPressed();
    }

    public static final boolean c(PointerInputChange xVar) {
        return (xVar.p() || !xVar.getPreviousPressed() || xVar.getPressed()) ? false : true;
    }

    public static final boolean d(PointerInputChange xVar) {
        return xVar.getPreviousPressed() && !xVar.getPressed();
    }

    @jn0.e
    public static final void e(PointerInputChange xVar) {
        if (j3.g.j(h(xVar), j3.g.INSTANCE.c())) {
            return;
        }
        xVar.a();
    }

    @jn0.e
    public static final boolean f(PointerInputChange xVar, long j11) {
        long jH = xVar.getPosition();
        float fM = j3.g.m(jH);
        float fN = j3.g.n(jH);
        return fM < BitmapDescriptorFactory.HUE_RED || fM > ((float) w4.r.g(j11)) || fN < BitmapDescriptorFactory.HUE_RED || fN > ((float) w4.r.f(j11));
    }

    public static final boolean g(PointerInputChange xVar, long j11, long j12) {
        if (!k0.g(xVar.getType(), k0.INSTANCE.d())) {
            return f(xVar, j11);
        }
        long jH = xVar.getPosition();
        float fM = j3.g.m(jH);
        float fN = j3.g.n(jH);
        return fM < (-j3.m.k(j12)) || fM > ((float) w4.r.g(j11)) + j3.m.k(j12) || fN < (-j3.m.i(j12)) || fN > ((float) w4.r.f(j11)) + j3.m.i(j12);
    }

    public static final long h(PointerInputChange xVar) {
        return j(xVar, false);
    }

    public static final long i(PointerInputChange xVar) {
        return j(xVar, true);
    }

    private static final long j(PointerInputChange xVar, boolean z11) {
        return (z11 || !xVar.p()) ? j3.g.q(xVar.getPosition(), xVar.getPreviousPosition()) : j3.g.INSTANCE.c();
    }

    public static final boolean k(PointerInputChange xVar) {
        return !j3.g.j(j(xVar, true), j3.g.INSTANCE.c());
    }
}
