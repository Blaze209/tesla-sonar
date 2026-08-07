package q1;

import androidx.compose.foundation.BorderModifierNodeElement;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import k3.SolidColor;
import k3.g4;
import k3.h1;
import k3.t3;
import k3.w0;
import k3.x3;
import m3.Stroke;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001d\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001e\u0010+\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/d;", "Lq1/g;", "border", "Lk3/g4;", "shape", "e", "(Landroidx/compose/ui/d;Lq1/g;Lk3/g4;)Landroidx/compose/ui/d;", "Lw4/h;", Snapshot.WIDTH, "Lk3/p1;", "color", "f", "(Landroidx/compose/ui/d;FJLk3/g4;)Landroidx/compose/ui/d;", "Lk3/h1;", "brush", "g", "(Landroidx/compose/ui/d;FLk3/h1;Lk3/g4;)Landroidx/compose/ui/d;", "Lh3/d;", "Lh3/i;", "j", "(Lh3/d;)Lh3/i;", "Lj3/g;", "topLeft", "Lj3/m;", "borderSize", "", "fillArea", "", "strokeWidthPx", "k", "(Lh3/d;Lk3/h1;JJZF)Lh3/i;", "Lk3/t3;", "targetPath", "Lj3/k;", "roundedRect", "strokeWidth", IntegerTokenConverter.CONVERTER_KEY, "(Lk3/t3;Lj3/k;FZ)Lk3/t3;", "widthPx", "h", "(FLj3/k;)Lj3/k;", "Lj3/a;", "value", "l", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f104218c = new a();

        a() {
            super(1);
        }

        public final void a(m3.c cVar) {
            cVar.M0();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<m3.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1 f104219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f104220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f104221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3.g f104222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h1 h1Var, long j11, long j12, m3.g gVar) {
            super(1);
            this.f104219c = h1Var;
            this.f104220d = j11;
            this.f104221e = j12;
            this.f104222f = gVar;
        }

        public final void a(m3.c cVar) {
            cVar.M0();
            m3.f.F0(cVar, this.f104219c, this.f104220d, this.f104221e, BitmapDescriptorFactory.HUE_RED, this.f104222f, null, 0, 104, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, BorderStroke borderStroke, g4 g4Var) {
        return g(dVar, borderStroke.getWidth(), borderStroke.getBrush(), g4Var);
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f11, long j11, g4 g4Var) {
        return g(dVar, f11, new SolidColor(j11, null), g4Var);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f11, h1 h1Var, g4 g4Var) {
        return dVar.g(new BorderModifierNodeElement(f11, h1Var, g4Var, null));
    }

    private static final j3.k h(float f11, j3.k kVar) {
        return new j3.k(f11, f11, kVar.j() - f11, kVar.d() - f11, l(kVar.getTopLeftCornerRadius(), f11), l(kVar.getTopRightCornerRadius(), f11), l(kVar.getBottomRightCornerRadius(), f11), l(kVar.getBottomLeftCornerRadius(), f11), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t3 i(t3 t3Var, j3.k kVar, float f11, boolean z11) {
        t3Var.reset();
        t3.d(t3Var, kVar, null, 2, null);
        if (!z11) {
            t3 t3VarA = w0.a();
            t3.d(t3VarA, h(f11, kVar), null, 2, null);
            t3Var.s(t3Var, t3VarA, x3.INSTANCE.a());
        }
        return t3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h3.i j(h3.d dVar) {
        return dVar.q(a.f104218c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h3.i k(h3.d dVar, h1 h1Var, long j11, long j12, boolean z11, float f11) {
        return dVar.q(new b(h1Var, z11 ? j3.g.INSTANCE.c() : j11, z11 ? dVar.b() : j12, z11 ? m3.j.f90966a : new Stroke(f11, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j11, float f11) {
        return j3.b.a(Math.max(BitmapDescriptorFactory.HUE_RED, j3.a.d(j11) - f11), Math.max(BitmapDescriptorFactory.HUE_RED, j3.a.e(j11) - f11));
    }
}
