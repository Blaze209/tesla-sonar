package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\"0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e\"0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010&\"\u001a\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010.\u001a\u00020\u0000*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"", "propagateMinConstraints", "Ljava/util/HashMap;", "Ld3/c;", "Lz3/i0;", "Lkotlin/collections/HashMap;", DateTokenConverter.CONVERTER_KEY, "(Z)Ljava/util/HashMap;", "alignment", "h", "(Ld3/c;Z)Lz3/i0;", "j", "(Ld3/c;ZLr2/l;I)Lz3/i0;", "Lz3/w0$a;", "Lz3/w0;", "placeable", "Lz3/h0;", "measurable", "Lw4/t;", "layoutDirection", "", "boxWidth", "boxHeight", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/w0$a;Lz3/w0;Lz3/h0;Lw4/t;IILd3/c;)V", "Landroidx/compose/ui/d;", "modifier", "a", "(Landroidx/compose/ui/d;Lr2/l;I)V", "Ljava/util/HashMap;", "cache1", "b", "cache2", "c", "Lz3/i0;", "DefaultBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Lz3/i0;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/f;", "f", "(Lz3/h0;)Landroidx/compose/foundation/layout/f;", "boxChildDataNode", "g", "(Lz3/h0;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<d3.c, i0> f4562a = d(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<d3.c, i0> f4563b = d(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f4564c = new h(d3.c.INSTANCE.o(), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i0 f4565d = b.f4568a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4567d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, int i11) {
            super(2);
            this.f4566c = dVar;
            this.f4567d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            g.a(this.f4566c, lVar, k2.a(this.f4567d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-211209833);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-211209833, i12, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            i0 i0Var = f4565d;
            int iA = p020r2.j.a(lVarV, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0Var, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            d4.b(lVarA, dVarE, companion.d());
            wn0.p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar, i11));
        }
    }

    private static final HashMap<d3.c, i0> d(boolean z11) {
        HashMap<d3.c, i0> map = new HashMap<>(9);
        d3.c.Companion companion = d3.c.INSTANCE;
        e(map, z11, companion.o());
        e(map, z11, companion.m());
        e(map, z11, companion.n());
        e(map, z11, companion.h());
        e(map, z11, companion.e());
        e(map, z11, companion.f());
        e(map, z11, companion.d());
        e(map, z11, companion.b());
        e(map, z11, companion.c());
        return map;
    }

    private static final void e(HashMap<d3.c, i0> map, boolean z11, d3.c cVar) {
        map.put(cVar, new h(cVar, z11));
    }

    private static final f f(z3.h0 h0Var) {
        Object parentData = h0Var.getParentData();
        if (parentData instanceof f) {
            return (f) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(z3.h0 h0Var) {
        f fVarF = f(h0Var);
        if (fVarF != null) {
            return fVarF.getMatchParentSize();
        }
        return false;
    }

    public static final i0 h(d3.c cVar, boolean z11) {
        i0 i0Var = (z11 ? f4562a : f4563b).get(cVar);
        return i0Var == null ? new h(cVar, z11) : i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(w0.a aVar, w0 w0Var, z3.h0 h0Var, w4.t tVar, int i11, int i12, d3.c cVar) {
        d3.c alignment;
        f fVarF = f(h0Var);
        w0.a.j(aVar, w0Var, ((fVarF == null || (alignment = fVarF.getAlignment()) == null) ? cVar : alignment).a(w4.s.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()), w4.s.a(i11, i12), tVar), BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final i0 j(d3.c cVar, boolean z11, p020r2.l lVar, int i11) {
        i0 i0Var;
        if (p020r2.o.J()) {
            p020r2.o.S(56522820, i11, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");
        }
        if (!p013kotlin.jvm.internal.s.f(cVar, d3.c.INSTANCE.o()) || z11) {
            lVar.o(-1710100211);
            boolean z12 = ((((i11 & 14) ^ 6) > 4 && lVar.n(cVar)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.p(z11)) || (i11 & 48) == 32);
            Object objI = lVar.I();
            if (z12 || objI == p020r2.l.INSTANCE.a()) {
                objI = new h(cVar, z11);
                lVar.B(objI);
            }
            i0Var = (h) objI;
            lVar.l();
        } else {
            lVar.o(-1710139705);
            lVar.l();
            i0Var = f4564c;
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return i0Var;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "<anonymous parameter 0>", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class b implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4568a = new b();

        b() {
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            return k0.N1(k0Var, w4.b.n(j11), w4.b.m(j11), null, a.f4569c, 4, null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f4569c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }

            public final void a(w0.a aVar) {
            }
        }
    }
}
