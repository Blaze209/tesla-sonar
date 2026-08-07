package p016o2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.g4;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import q2.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u00020\u000e*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lo2/f;", "", "<init>", "()V", "Lw4/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Lo2/g;", "c", "(FFFFFFLr2/l;II)Lo2/g;", "Lo2/e;", "a", "(Lr2/l;I)Lo2/e;", "Lk3/p1;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLr2/l;II)Lo2/e;", "Lk3/g4;", "e", "(Lr2/l;I)Lk3/g4;", "shape", "Lo2/i;", DateTokenConverter.CONVERTER_KEY, "(Lo2/i;)Lo2/e;", "defaultCardColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f95850a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95851b = 0;

    private f() {
    }

    public final e a(l lVar, int i11) {
        if (o.J()) {
            o.S(-1876034303, i11, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        e eVarD = d(t.f96158a.a(lVar, 6));
        if (o.J()) {
            o.R();
        }
        return eVarD;
    }

    public final e b(long j11, long j12, long j13, long j14, l lVar, int i11, int i12) {
        long j15;
        long jP;
        long j16 = (i12 & 1) != 0 ? p1.INSTANCE.j() : j11;
        long jC = (i12 & 2) != 0 ? j.c(j16, lVar, i11 & 14) : j12;
        long j17 = (i12 & 4) != 0 ? p1.INSTANCE.j() : j13;
        if ((i12 & 8) != 0) {
            long j18 = jC;
            jP = p1.p(j18, 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j15 = j18;
        } else {
            j15 = jC;
            jP = j14;
        }
        if (o.J()) {
            o.S(-1589582123, i11, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        e eVarC = d(t.f96158a.a(lVar, 6)).c(j16, j15, j17, jP);
        if (o.J()) {
            o.R();
        }
        return eVarC;
    }

    public final g c(float f11, float f12, float f13, float f14, float f15, float f16, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = e.f104434a.b();
        }
        if ((i12 & 2) != 0) {
            f12 = e.f104434a.j();
        }
        if ((i12 & 4) != 0) {
            f13 = e.f104434a.h();
        }
        if ((i12 & 8) != 0) {
            f14 = e.f104434a.i();
        }
        if ((i12 & 16) != 0) {
            f15 = e.f104434a.g();
        }
        float f17 = f15;
        if ((i12 & 32) != 0) {
            f16 = e.f104434a.e();
        }
        if (o.J()) {
            o.S(-574898487, i11, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f18 = f16;
        float f19 = f13;
        float f21 = f11;
        g gVar = new g(f21, f12, f19, f14, f17, f18, null);
        if (o.J()) {
            o.R();
        }
        return gVar;
    }

    public final e d(ColorScheme colorScheme) {
        e defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        e eVar = e.f104434a;
        e eVar2 = new e(j.d(colorScheme, eVar.a()), j.b(colorScheme, j.d(colorScheme, eVar.a())), r1.h(p1.p(j.d(colorScheme, eVar.d()), eVar.f(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j.d(colorScheme, eVar.a())), p1.p(j.b(colorScheme, j.d(colorScheme, eVar.a())), 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        colorScheme.P(eVar2);
        return eVar2;
    }

    public final g4 e(l lVar, int i11) {
        if (o.J()) {
            o.S(1266660211, i11, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        g4 g4VarD = f0.d(e.f104434a.c(), lVar, 6);
        if (o.J()) {
            o.R();
        }
        return g4VarD;
    }
}
