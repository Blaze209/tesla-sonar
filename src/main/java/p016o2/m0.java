package p016o2;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.v;
import g4.y;
import h3.e;
import jn0.h0;
import jn0.t;
import k3.a4;
import k3.g4;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.g2;
import p020r2.h2;
import p020r2.j;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.x;
import q1.BorderStroke;
import v3.f0;
import v3.o0;
import w4.h;
import wn0.p;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ah\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u008c\u0001\u0010\u0016\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a8\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lk3/g4;", "shape", "Lk3/p1;", "color", "contentColor", "Lw4/h;", "tonalElevation", "shadowElevation", "Lq1/g;", "border", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lk3/g4;JJFFLq1/g;Lwn0/p;Lr2/l;II)V", "onClick", "", "enabled", "Lu1/l;", "interactionSource", "b", "(Lwn0/a;Landroidx/compose/ui/d;ZLk3/g4;JJFFLq1/g;Lu1/l;Lwn0/p;Lr2/l;III)V", "backgroundColor", "", "e", "(Landroidx/compose/ui/d;Lk3/g4;JLq1/g;F)Landroidx/compose/ui/d;", "elevation", "f", "(JFLr2/l;I)J", "Lr2/g2;", "Lr2/g2;", "getLocalAbsoluteTonalElevation", "()Lr2/g2;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<h> f95981a = w.d(null, a.f95982c, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/h;", "b", "()F"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f95982c = new a();

        a() {
            super(0);
        }

        public final float b() {
            return h.g(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f95983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f95984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f95985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f95986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f95987g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f95988h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f95989i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f95990c = new a();

            a() {
                super(1);
            }

            public final void a(y yVar) {
                v.b0(yVar, true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: o2.m0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2045b extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f95991n;

            C2045b(Continuation<? super C2045b> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2045b(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f95991n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
                return ((C2045b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d dVar, g4 g4Var, long j11, float f11, BorderStroke borderStroke, float f12, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f95983c = dVar;
            this.f95984d = g4Var;
            this.f95985e = j11;
            this.f95986f = f11;
            this.f95987g = borderStroke;
            this.f95988h = f12;
            this.f95989i = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-70914509, i11, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            d dVarD = o0.d(g4.o.c(m0.e(this.f95983c, this.f95984d, m0.f(this.f95985e, this.f95986f, lVar, 0), this.f95987g, ((w4.d) lVar.U(z0.g())).O1(this.f95988h)), false, a.f95990c), h0.f84049a, new C2045b(null));
            p<l, Integer, h0> pVar = this.f95989i;
            i0 i0VarH = g.h(d3.c.INSTANCE.o(), true);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            i iVar = i.f4585a;
            pVar.invoke(lVar, 0);
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f95992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f95993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f95994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f95995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f95996g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u1.l f95997h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f95998i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f95999j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f96000k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96001l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d dVar, g4 g4Var, long j11, float f11, BorderStroke borderStroke, u1.l lVar, boolean z11, wn0.a<h0> aVar, float f12, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f95992c = dVar;
            this.f95993d = g4Var;
            this.f95994e = j11;
            this.f95995f = f11;
            this.f95996g = borderStroke;
            this.f95997h = lVar;
            this.f95998i = z11;
            this.f95999j = aVar;
            this.f96000k = f12;
            this.f96001l = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1279702876, i11, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
            }
            d dVarB = androidx.compose.foundation.d.b(m0.e(s.b(this.f95992c), this.f95993d, m0.f(this.f95994e, this.f95995f, lVar, 0), this.f95996g, ((w4.d) lVar.U(z0.g())).O1(this.f96000k)), this.f95997h, androidx.compose.material3.a.d(false, BitmapDescriptorFactory.HUE_RED, 0L, lVar, 0, 7), this.f95998i, null, null, this.f95999j, 24, null);
            p<l, Integer, h0> pVar = this.f96001l;
            i0 i0VarH = g.h(d3.c.INSTANCE.o(), true);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            d dVarE = androidx.compose.ui.c.e(lVar, dVarB);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            i iVar = i.f4585a;
            pVar.invoke(lVar, 0);
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, g4 g4Var, long j11, long j12, float f11, float f12, BorderStroke borderStroke, p<? super l, ? super Integer, h0> pVar, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            dVar = d.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            g4Var = a4.a();
        }
        if ((i12 & 4) != 0) {
            j11 = t.f96158a.a(lVar, 6).getSurface();
        }
        if ((i12 & 8) != 0) {
            j12 = j.c(j11, lVar, (i11 >> 6) & 14);
        }
        if ((i12 & 16) != 0) {
            f11 = h.g(0);
        }
        if ((i12 & 32) != 0) {
            f12 = h.g(0);
        }
        if ((i12 & 64) != 0) {
            borderStroke = null;
        }
        if (o.J()) {
            o.S(-513881741, i11, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        g2<h> g2Var = f95981a;
        float fG = h.g(((h) lVar.U(g2Var)).getValue() + f11);
        w.b(new h2[]{m.a().d(p1.l(j12)), g2Var.d(h.d(fG))}, z2.c.e(-70914509, true, new b(dVar, g4Var, j11, fG, borderStroke, f12, pVar), lVar, 54), lVar, h2.f106566i | 48);
        if (o.J()) {
            o.R();
        }
    }

    public static final void b(wn0.a<h0> aVar, d dVar, boolean z11, g4 g4Var, long j11, long j12, float f11, float f12, BorderStroke borderStroke, u1.l lVar, p<? super l, ? super Integer, h0> pVar, l lVar2, int i11, int i12, int i13) {
        d dVar2 = (i13 & 2) != 0 ? d.INSTANCE : dVar;
        boolean z12 = (i13 & 4) != 0 ? true : z11;
        g4 g4VarA = (i13 & 8) != 0 ? a4.a() : g4Var;
        long surface = (i13 & 16) != 0 ? t.f96158a.a(lVar2, 6).getSurface() : j11;
        long jC = (i13 & 32) != 0 ? j.c(surface, lVar2, (i11 >> 12) & 14) : j12;
        float fG = (i13 & 64) != 0 ? h.g(0) : f11;
        float fG2 = (i13 & 128) != 0 ? h.g(0) : f12;
        BorderStroke borderStroke2 = (i13 & 256) != 0 ? null : borderStroke;
        u1.l lVar3 = (i13 & 512) == 0 ? lVar : null;
        if (o.J()) {
            o.S(-789752804, i11, i12, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        g2<h> g2Var = f95981a;
        float fG3 = h.g(((h) lVar2.U(g2Var)).getValue() + fG);
        w.b(new h2[]{m.a().d(p1.l(jC)), g2Var.d(h.d(fG3))}, z2.c.e(1279702876, true, new c(dVar2, g4VarA, surface, fG3, borderStroke2, lVar3, z12, aVar, fG2, pVar), lVar2, 54), lVar2, h2.f106566i | 48);
        if (o.J()) {
            o.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d e(d dVar, g4 g4Var, long j11, BorderStroke borderStroke, float f11) {
        g4 g4Var2;
        d dVarC;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            g4Var2 = g4Var;
            dVarC = androidx.compose.ui.graphics.b.c(d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, g4Var2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            g4Var2 = g4Var;
            dVarC = d.INSTANCE;
        }
        return e.a(androidx.compose.foundation.b.c(dVar.g(dVarC).g(borderStroke != null ? q1.e.e(d.INSTANCE, borderStroke, g4Var2) : d.INSTANCE), j11, g4Var2), g4Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j11, float f11, l lVar, int i11) {
        if (o.J()) {
            o.S(-2079918090, i11, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jA = j.a(t.f96158a.a(lVar, 6), j11, f11, lVar, (i11 << 3) & 1008);
        if (o.J()) {
            o.R();
        }
        return jA;
    }
}
