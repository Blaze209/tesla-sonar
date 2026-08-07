package p009i2;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.v;
import g4.y;
import jn0.h0;
import jn0.t;
import k3.a4;
import k3.g4;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.x;
import q1.BorderStroke;
import q1.e;
import v3.f0;
import v3.o0;
import w4.h;
import wn0.p;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a^\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a,\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lk3/g4;", "shape", "Lk3/p1;", "color", "contentColor", "Lq1/g;", "border", "Lw4/h;", "elevation", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lk3/g4;JJLq1/g;FLwn0/p;Lr2/l;II)V", "onClick", "", "enabled", "Lu1/l;", "interactionSource", "b", "(Lwn0/a;Landroidx/compose/ui/d;ZLk3/g4;JJLq1/g;FLu1/l;Lwn0/p;Lr2/l;II)V", "backgroundColor", "e", "(Landroidx/compose/ui/d;Lk3/g4;JLq1/g;F)Landroidx/compose/ui/d;", "Li2/s0;", "elevationOverlay", "absoluteElevation", "f", "(JLi2/s0;FLr2/l;I)J", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m2 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f74721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f74722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f74723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f74724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f74725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74726i;

        /* JADX INFO: renamed from: i2.m2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1566a extends u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1566a f74727c = new C1566a();

            C1566a() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74728n;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f74728n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
                return ((b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.d dVar, g4 g4Var, long j11, float f11, BorderStroke borderStroke, float f12, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f74720c = dVar;
            this.f74721d = g4Var;
            this.f74722e = j11;
            this.f74723f = f11;
            this.f74724g = borderStroke;
            this.f74725h = f12;
            this.f74726i = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1822160838, i11, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:114)");
            }
            androidx.compose.ui.d dVarD = o0.d(g4.o.c(m2.e(this.f74720c, this.f74721d, m2.f(this.f74722e, (s0) lVar.U(t0.d()), this.f74723f, lVar, 0), this.f74724g, this.f74725h), false, C1566a.f74727c), h0.f84049a, new b(null));
            p<l, Integer, h0> pVar = this.f74726i;
            i0 i0VarH = g.h(d3.c.INSTANCE.o(), true);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f74730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f74731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f74732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f74733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f74734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f74736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74737k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.d dVar, g4 g4Var, long j11, long j12, BorderStroke borderStroke, float f11, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f74729c = dVar;
            this.f74730d = g4Var;
            this.f74731e = j11;
            this.f74732f = j12;
            this.f74733g = borderStroke;
            this.f74734h = f11;
            this.f74735i = pVar;
            this.f74736j = i11;
            this.f74737k = i12;
        }

        public final void a(l lVar, int i11) {
            m2.a(this.f74729c, this.f74730d, this.f74731e, this.f74732f, this.f74733g, this.f74734h, this.f74735i, lVar, k2.a(this.f74736j | 1), this.f74737k);
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
        final /* synthetic */ androidx.compose.ui.d f74738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f74739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f74740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f74741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f74742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f74743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ u1.l f74744i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f74745j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74746k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74747l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.d dVar, g4 g4Var, long j11, float f11, BorderStroke borderStroke, float f12, u1.l lVar, boolean z11, wn0.a<h0> aVar, p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f74738c = dVar;
            this.f74739d = g4Var;
            this.f74740e = j11;
            this.f74741f = f11;
            this.f74742g = borderStroke;
            this.f74743h = f12;
            this.f74744i = lVar;
            this.f74745j = z11;
            this.f74746k = aVar;
            this.f74747l = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(2031491085, i11, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:224)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(m2.e(g1.c(this.f74738c), this.f74739d, m2.f(this.f74740e, (s0) lVar.U(t0.d()), this.f74741f, lVar, 0), this.f74742g, this.f74743h), this.f74744i, androidx.compose.material.d.g(false, BitmapDescriptorFactory.HUE_RED, 0L, lVar, 0, 7), this.f74745j, null, null, this.f74746k, 24, null);
            p<l, Integer, h0> pVar = this.f74747l;
            i0 i0VarH = g.h(d3.c.INSTANCE.o(), true);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarB);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f74751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f74752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f74753h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ BorderStroke f74754i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f74755j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u1.l f74756k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74757l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f74758m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f74759n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(wn0.a<h0> aVar, androidx.compose.ui.d dVar, boolean z11, g4 g4Var, long j11, long j12, BorderStroke borderStroke, float f11, u1.l lVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f74748c = aVar;
            this.f74749d = dVar;
            this.f74750e = z11;
            this.f74751f = g4Var;
            this.f74752g = j11;
            this.f74753h = j12;
            this.f74754i = borderStroke;
            this.f74755j = f11;
            this.f74756k = lVar;
            this.f74757l = pVar;
            this.f74758m = i11;
            this.f74759n = i12;
        }

        public final void a(l lVar, int i11) {
            m2.b(this.f74748c, this.f74749d, this.f74750e, this.f74751f, this.f74752g, this.f74753h, this.f74754i, this.f74755j, this.f74756k, this.f74757l, lVar, k2.a(this.f74758m | 1), this.f74759n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:118:0x01be  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    public static final void a(androidx.compose.ui.d dVar, g4 g4Var, long j11, long j12, BorderStroke borderStroke, float f11, p<? super l, ? super Integer, h0> pVar, l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        g4 g4VarA;
        long jN;
        long j13;
        int i14;
        BorderStroke borderStroke2;
        int i15;
        int i16;
        float f12;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        float fG;
        g4 g4Var2;
        long j14;
        BorderStroke borderStroke3;
        g4 g4Var3;
        long j15;
        BorderStroke borderStroke4;
        float f13;
        long j16;
        w2 w2VarX;
        int i19;
        l lVarV = lVar.v(1412203386);
        int i21 = i12 & 1;
        if (i21 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                g4VarA = g4Var;
                i13 |= lVarV.n(g4VarA) ? 32 : 16;
            }
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if ((i12 & 4) == 0) {
                    jN = j11;
                    int i23 = lVarV.s(jN) ? 256 : 128;
                    i13 |= i23;
                } else {
                    jN = j11;
                }
                i13 |= i23;
            } else {
                jN = j11;
            }
            if ((i11 & 3072) == 0) {
                j13 = j12;
                if ((i12 & 8) == 0 || !lVarV.s(j13)) {
                    i19 = 1024;
                } else {
                    i19 = 2048;
                }
                i13 |= i19;
            } else {
                j13 = j12;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    borderStroke2 = borderStroke;
                    if (lVarV.n(borderStroke2)) {
                        i15 = 16384;
                    } else {
                        i15 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (lVarV.q(f12)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (lVarV.K(pVar)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 599187) == 599186 || !lVarV.b()) {
                        lVarV.L();
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if (i21 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i22 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                jN = j1.f74525a.a(lVarV, 6).n();
                            }
                            if ((i12 & 8) != 0) {
                                long jB = s.b(jN, lVarV, (i13 >> 6) & 14);
                                i13 &= -7169;
                                j13 = jB;
                            }
                            if (i14 != 0) {
                                borderStroke2 = null;
                            }
                            if (i16 != 0) {
                                dVar4 = dVar3;
                                fG = h.g(0);
                                g4Var2 = g4VarA;
                                j14 = jN;
                                borderStroke3 = borderStroke2;
                            } else {
                                dVar4 = dVar3;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                            }
                            float fG2 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                            w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG2))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG2, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            g4Var3 = g4Var2;
                            j15 = j14;
                            borderStroke4 = borderStroke3;
                            f13 = fG;
                        } else {
                            lVarV.j();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            dVar4 = dVar2;
                        }
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                        }
                        float fG3 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                        w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG3))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG3, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        g4Var3 = g4Var2;
                        j15 = j14;
                        borderStroke4 = borderStroke3;
                        f13 = fG;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        g4Var3 = g4VarA;
                        j15 = jN;
                        borderStroke4 = borderStroke2;
                        f13 = f12;
                    }
                    j16 = j13;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
                    }
                }
                i13 |= 196608;
                f12 = f11;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB2 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB2;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB3 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB3;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG4 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG4))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG4, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB4 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB4;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB5 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB5;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG5 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG5))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG5, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                }
                j16 = j13;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            borderStroke2 = borderStroke;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (lVarV.q(f12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB6 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB6;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB7 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB7;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG6 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG6))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG6, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB8 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB8;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB9 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB9;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG7 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG7))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG7, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                }
                j16 = j13;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
                }
            }
            i13 |= 196608;
            f12 = f11;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB10 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB10;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB11 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB11;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG8 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG8))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG8, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB12 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB12;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB13 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB13;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG9 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG9))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG9, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            }
            j16 = j13;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
            }
        }
        i13 |= 48;
        g4VarA = g4Var;
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if ((i12 & 4) == 0) {
                jN = j11;
                if (lVarV.s(jN)) {
                }
                i13 |= i23;
            } else {
                jN = j11;
            }
            i13 |= i23;
        } else {
            jN = j11;
        }
        if ((i11 & 3072) == 0) {
            j13 = j12;
            if ((i12 & 8) == 0) {
                i19 = 1024;
            } else {
                i19 = 1024;
            }
            i13 |= i19;
        } else {
            j13 = j12;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                borderStroke2 = borderStroke;
                if (lVarV.n(borderStroke2)) {
                    i15 = 16384;
                } else {
                    i15 = PKIFailureInfo.certRevoked;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (lVarV.q(f12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB14 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB14;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB15 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB15;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG10 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG10))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG10, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB16 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB16;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jN = j1.f74525a.a(lVarV, 6).n();
                        }
                        if ((i12 & 8) != 0) {
                            long jB17 = s.b(jN, lVarV, (i13 >> 6) & 14);
                            i13 &= -7169;
                            j13 = jB17;
                        }
                        if (i14 != 0) {
                            borderStroke2 = null;
                        }
                        if (i16 != 0) {
                            dVar4 = dVar3;
                            fG = h.g(0);
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                        } else {
                            dVar4 = dVar3;
                            g4Var2 = g4VarA;
                            j14 = jN;
                            borderStroke3 = borderStroke2;
                            fG = f12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                    }
                    float fG11 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                    w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG11))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG11, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    g4Var3 = g4Var2;
                    j15 = j14;
                    borderStroke4 = borderStroke3;
                    f13 = fG;
                }
                j16 = j13;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
                }
            }
            i13 |= 196608;
            f12 = f11;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB18 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB18;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB19 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB19;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG12 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG12))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG12, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB110 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB110;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB111 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB111;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG13 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG13))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG13, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            }
            j16 = j13;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
            }
        }
        i13 |= 24576;
        borderStroke2 = borderStroke;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                f12 = f11;
                if (lVarV.q(f12)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB112 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB112;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB113 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB113;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG14 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG14))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG14, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB114 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB114;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jN = j1.f74525a.a(lVarV, 6).n();
                    }
                    if ((i12 & 8) != 0) {
                        long jB115 = s.b(jN, lVarV, (i13 >> 6) & 14);
                        i13 &= -7169;
                        j13 = jB115;
                    }
                    if (i14 != 0) {
                        borderStroke2 = null;
                    }
                    if (i16 != 0) {
                        dVar4 = dVar3;
                        fG = h.g(0);
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                    } else {
                        dVar4 = dVar3;
                        g4Var2 = g4VarA;
                        j14 = jN;
                        borderStroke3 = borderStroke2;
                        fG = f12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
                }
                float fG15 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
                w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG15))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG15, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                g4Var3 = g4Var2;
                j15 = j14;
                borderStroke4 = borderStroke3;
                f13 = fG;
            }
            j16 = j13;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
            }
        }
        i13 |= 196608;
        f12 = f11;
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(pVar)) {
                i18 = PKIFailureInfo.badCertTemplate;
            } else {
                i18 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i18;
        }
        if ((i13 & 599187) == 599186) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jN = j1.f74525a.a(lVarV, 6).n();
                }
                if ((i12 & 8) != 0) {
                    long jB116 = s.b(jN, lVarV, (i13 >> 6) & 14);
                    i13 &= -7169;
                    j13 = jB116;
                }
                if (i14 != 0) {
                    borderStroke2 = null;
                }
                if (i16 != 0) {
                    dVar4 = dVar3;
                    fG = h.g(0);
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                } else {
                    dVar4 = dVar3;
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                    fG = f12;
                }
            } else {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jN = j1.f74525a.a(lVarV, 6).n();
                }
                if ((i12 & 8) != 0) {
                    long jB117 = s.b(jN, lVarV, (i13 >> 6) & 14);
                    i13 &= -7169;
                    j13 = jB117;
                }
                if (i14 != 0) {
                    borderStroke2 = null;
                }
                if (i16 != 0) {
                    dVar4 = dVar3;
                    fG = h.g(0);
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                } else {
                    dVar4 = dVar3;
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                    fG = f12;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
            }
            float fG16 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
            w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG16))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG16, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
            g4Var3 = g4Var2;
            j15 = j14;
            borderStroke4 = borderStroke3;
            f13 = fG;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jN = j1.f74525a.a(lVarV, 6).n();
                }
                if ((i12 & 8) != 0) {
                    long jB118 = s.b(jN, lVarV, (i13 >> 6) & 14);
                    i13 &= -7169;
                    j13 = jB118;
                }
                if (i14 != 0) {
                    borderStroke2 = null;
                }
                if (i16 != 0) {
                    dVar4 = dVar3;
                    fG = h.g(0);
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                } else {
                    dVar4 = dVar3;
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                    fG = f12;
                }
            } else {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jN = j1.f74525a.a(lVarV, 6).n();
                }
                if ((i12 & 8) != 0) {
                    long jB119 = s.b(jN, lVarV, (i13 >> 6) & 14);
                    i13 &= -7169;
                    j13 = jB119;
                }
                if (i14 != 0) {
                    borderStroke2 = null;
                }
                if (i16 != 0) {
                    dVar4 = dVar3;
                    fG = h.g(0);
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                } else {
                    dVar4 = dVar3;
                    g4Var2 = g4VarA;
                    j14 = jN;
                    borderStroke3 = borderStroke2;
                    fG = f12;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1412203386, i13, -1, "androidx.compose.material.Surface (Surface.kt:108)");
            }
            float fG17 = h.g(((h) lVarV.U(t0.c())).getValue() + fG);
            w.b(new h2[]{z.a().d(p1.l(j13)), t0.c().d(h.d(fG17))}, z2.c.e(-1822160838, true, new a(dVar4, g4Var2, j14, fG17, borderStroke3, fG, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
            g4Var3 = g4Var2;
            j15 = j14;
            borderStroke4 = borderStroke3;
            f13 = fG;
        }
        j16 = j13;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar4, g4Var3, j15, j16, borderStroke4, f13, pVar, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x018e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0193  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x019f  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x0240  */
    /* JADX WARN: Code duplicated, block: B:162:0x0258  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    public static final void b(wn0.a<h0> aVar, androidx.compose.ui.d dVar, boolean z11, g4 g4Var, long j11, long j12, BorderStroke borderStroke, float f11, u1.l lVar, p<? super l, ? super Integer, h0> pVar, l lVar2, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        g4 g4VarA;
        int i17;
        long jN;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long jB;
        BorderStroke borderStroke2;
        float fG;
        u1.l lVar3;
        BorderStroke borderStroke3;
        boolean z13;
        float f12;
        long j13;
        androidx.compose.ui.d dVar3;
        g4 g4Var2;
        long j14;
        BorderStroke borderStroke4;
        float f13;
        u1.l lVar4;
        boolean z14;
        w2 w2VarX;
        int i27;
        int i28;
        l lVarV = lVar2.v(1560876237);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i29 = i12 & 2;
        if (i29 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        g4VarA = g4Var;
                        if (lVarV.n(g4VarA)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i11 & 24576) == 0) {
                        if ((i12 & 16) == 0) {
                            jN = j11;
                            if (lVarV.s(jN)) {
                                i28 = 16384;
                            }
                            i13 |= i28;
                        } else {
                            jN = j11;
                        }
                        i28 = PKIFailureInfo.certRevoked;
                        i13 |= i28;
                    } else {
                        jN = j11;
                    }
                    if ((196608 & i11) == 0) {
                        int i31 = i13;
                        if ((i12 & 32) == 0 || !lVarV.s(j12)) {
                            i27 = 65536;
                        } else {
                            i27 = 131072;
                        }
                        i18 = i31 | i27;
                    } else {
                        i18 = i13;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i18 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (lVarV.n(borderStroke)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i21;
                    }
                    i22 = i12 & 128;
                    if (i22 != 0) {
                        if ((i11 & 12582912) == 0) {
                            if (lVarV.q(f11)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i18 |= i23;
                        }
                        i24 = i12 & 256;
                        if (i24 != 0) {
                            if ((i11 & 100663296) == 0) {
                                if (lVarV.n(lVar)) {
                                    i25 = 67108864;
                                } else {
                                    i25 = 33554432;
                                }
                                i18 |= i25;
                            }
                            if ((i12 & 512) != 0) {
                                if ((i11 & 805306368) == 0) {
                                    if (lVarV.K(pVar)) {
                                        i26 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i26 = 268435456;
                                    }
                                    i18 |= i26;
                                }
                                if ((i18 & 306783379) == 306783378 || !lVarV.b()) {
                                    lVarV.L();
                                    if ((i11 & 1) != 0 || lVarV.k()) {
                                        if (i29 != 0) {
                                            dVar2 = androidx.compose.ui.d.INSTANCE;
                                        }
                                        if (i14 != 0) {
                                            z12 = true;
                                        }
                                        if (i16 != 0) {
                                            g4VarA = a4.a();
                                        }
                                        if ((i12 & 16) != 0) {
                                            jN = j1.f74525a.a(lVarV, 6).n();
                                            i18 &= -57345;
                                        }
                                        if ((i12 & 32) != 0) {
                                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                            i18 &= -458753;
                                        } else {
                                            jB = j12;
                                        }
                                        if (i19 != 0) {
                                            borderStroke2 = null;
                                        } else {
                                            borderStroke2 = borderStroke;
                                        }
                                        if (i22 != 0) {
                                            fG = h.g(0);
                                        } else {
                                            fG = f11;
                                        }
                                        if (i24 != 0) {
                                            lVar3 = null;
                                        } else {
                                            lVar3 = lVar;
                                        }
                                        borderStroke3 = borderStroke2;
                                        z13 = z12;
                                        f12 = fG;
                                    } else {
                                        lVarV.j();
                                        if ((i12 & 16) != 0) {
                                            i18 &= -57345;
                                        }
                                        if ((i12 & 32) != 0) {
                                            i18 &= -458753;
                                        }
                                        jB = j12;
                                        borderStroke3 = borderStroke;
                                        f12 = f11;
                                        lVar3 = lVar;
                                        z13 = z12;
                                    }
                                    g4 g4Var3 = g4VarA;
                                    long j15 = jN;
                                    lVarV.C();
                                    if (o.J()) {
                                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                    }
                                    float fG2 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                    androidx.compose.ui.d dVar4 = dVar2;
                                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG2))}, z2.c.e(2031491085, true, new c(dVar4, g4Var3, j15, fG2, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                    if (o.J()) {
                                        o.R();
                                    }
                                    j13 = jB;
                                    dVar3 = dVar4;
                                    g4Var2 = g4Var3;
                                    j14 = j15;
                                    borderStroke4 = borderStroke3;
                                    f13 = f12;
                                    lVar4 = lVar3;
                                    z14 = z13;
                                } else {
                                    lVarV.j();
                                    dVar3 = dVar2;
                                    z14 = z12;
                                    g4Var2 = g4VarA;
                                    j14 = jN;
                                    j13 = j12;
                                    borderStroke4 = borderStroke;
                                    f13 = f11;
                                    lVar4 = lVar;
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                                }
                            }
                            i18 |= 805306368;
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var4 = g4VarA;
                                long j16 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG3 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar5 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG3))}, z2.c.e(2031491085, true, new c(dVar5, g4Var4, j16, fG3, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar5;
                                g4Var2 = g4Var4;
                                j14 = j16;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var5 = g4VarA;
                                long j17 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG4 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar6 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG4))}, z2.c.e(2031491085, true, new c(dVar6, g4Var5, j17, fG4, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar6;
                                g4Var2 = g4Var5;
                                j14 = j17;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 100663296;
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (lVarV.K(pVar)) {
                                    i26 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i26 = 268435456;
                                }
                                i18 |= i26;
                            }
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var6 = g4VarA;
                                long j18 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG5 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar7 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG5))}, z2.c.e(2031491085, true, new c(dVar7, g4Var6, j18, fG5, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar7;
                                g4Var2 = g4Var6;
                                j14 = j18;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var7 = g4VarA;
                                long j19 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG6 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar8 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG6))}, z2.c.e(2031491085, true, new c(dVar8, g4Var7, j19, fG6, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar8;
                                g4Var2 = g4Var7;
                                j14 = j19;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 805306368;
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var8 = g4VarA;
                            long j110 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG7 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar9 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG7))}, z2.c.e(2031491085, true, new c(dVar9, g4Var8, j110, fG7, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar9;
                            g4Var2 = g4Var8;
                            j14 = j110;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var9 = g4VarA;
                            long j111 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG8 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar10 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG8))}, z2.c.e(2031491085, true, new c(dVar10, g4Var9, j111, fG8, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar10;
                            g4Var2 = g4Var9;
                            j14 = j111;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 12582912;
                    i24 = i12 & 256;
                    if (i24 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (lVarV.n(lVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i18 |= i25;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (lVarV.K(pVar)) {
                                    i26 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i26 = 268435456;
                                }
                                i18 |= i26;
                            }
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var10 = g4VarA;
                                long j112 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG9 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar11 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG9))}, z2.c.e(2031491085, true, new c(dVar11, g4Var10, j112, fG9, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar11;
                                g4Var2 = g4Var10;
                                j14 = j112;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var11 = g4VarA;
                                long j113 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG10 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar12 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG10))}, z2.c.e(2031491085, true, new c(dVar12, g4Var11, j113, fG10, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar12;
                                g4Var2 = g4Var11;
                                j14 = j113;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 805306368;
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var12 = g4VarA;
                            long j114 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar13 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11))}, z2.c.e(2031491085, true, new c(dVar13, g4Var12, j114, fG11, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar13;
                            g4Var2 = g4Var12;
                            j14 = j114;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var13 = g4VarA;
                            long j115 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG12 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar14 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG12))}, z2.c.e(2031491085, true, new c(dVar14, g4Var13, j115, fG12, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar14;
                            g4Var2 = g4Var13;
                            j14 = j115;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 100663296;
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var14 = g4VarA;
                            long j116 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG13 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar15 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG13))}, z2.c.e(2031491085, true, new c(dVar15, g4Var14, j116, fG13, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar15;
                            g4Var2 = g4Var14;
                            j14 = j116;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var15 = g4VarA;
                            long j117 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG14 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar16 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG14))}, z2.c.e(2031491085, true, new c(dVar16, g4Var15, j117, fG14, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar16;
                            g4Var2 = g4Var15;
                            j14 = j117;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var16 = g4VarA;
                        long j118 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG15 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar17 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG15))}, z2.c.e(2031491085, true, new c(dVar17, g4Var16, j118, fG15, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar17;
                        g4Var2 = g4Var16;
                        j14 = j118;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var17 = g4VarA;
                        long j119 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG16 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar18 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG16))}, z2.c.e(2031491085, true, new c(dVar18, g4Var17, j119, fG16, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar18;
                        g4Var2 = g4Var17;
                        j14 = j119;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i13 |= 3072;
                g4VarA = g4Var;
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        jN = j11;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                if ((196608 & i11) == 0) {
                    int i32 = i13;
                    if ((i12 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i18 = i32 | i27;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i18 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i21;
                }
                i22 = i12 & 128;
                if (i22 != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (lVarV.q(f11)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i18 |= i23;
                    }
                    i24 = i12 & 256;
                    if (i24 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (lVarV.n(lVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i18 |= i25;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (lVarV.K(pVar)) {
                                    i26 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i26 = 268435456;
                                }
                                i18 |= i26;
                            }
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var18 = g4VarA;
                                long j1110 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG17 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar19 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG17))}, z2.c.e(2031491085, true, new c(dVar19, g4Var18, j1110, fG17, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar19;
                                g4Var2 = g4Var18;
                                j14 = j1110;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var19 = g4VarA;
                                long j1111 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG18 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar110 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG18))}, z2.c.e(2031491085, true, new c(dVar110, g4Var19, j1111, fG18, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar110;
                                g4Var2 = g4Var19;
                                j14 = j1111;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 805306368;
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var110 = g4VarA;
                            long j1112 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG19 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar111 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG19))}, z2.c.e(2031491085, true, new c(dVar111, g4Var110, j1112, fG19, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar111;
                            g4Var2 = g4Var110;
                            j14 = j1112;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var111 = g4VarA;
                            long j1113 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar112 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG110))}, z2.c.e(2031491085, true, new c(dVar112, g4Var111, j1113, fG110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar112;
                            g4Var2 = g4Var111;
                            j14 = j1113;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 100663296;
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var112 = g4VarA;
                            long j1114 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar113 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111))}, z2.c.e(2031491085, true, new c(dVar113, g4Var112, j1114, fG111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar113;
                            g4Var2 = g4Var112;
                            j14 = j1114;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var113 = g4VarA;
                            long j1115 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar114 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG112))}, z2.c.e(2031491085, true, new c(dVar114, g4Var113, j1115, fG112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar114;
                            g4Var2 = g4Var113;
                            j14 = j1115;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var114 = g4VarA;
                        long j1116 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar115 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG113))}, z2.c.e(2031491085, true, new c(dVar115, g4Var114, j1116, fG113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar115;
                        g4Var2 = g4Var114;
                        j14 = j1116;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var115 = g4VarA;
                        long j1117 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar116 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG114))}, z2.c.e(2031491085, true, new c(dVar116, g4Var115, j1117, fG114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar116;
                        g4Var2 = g4Var115;
                        j14 = j1117;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 12582912;
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var116 = g4VarA;
                            long j1118 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar117 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG115))}, z2.c.e(2031491085, true, new c(dVar117, g4Var116, j1118, fG115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar117;
                            g4Var2 = g4Var116;
                            j14 = j1118;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var117 = g4VarA;
                            long j1119 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar118 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG116))}, z2.c.e(2031491085, true, new c(dVar118, g4Var117, j1119, fG116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar118;
                            g4Var2 = g4Var117;
                            j14 = j1119;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var118 = g4VarA;
                        long j11110 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar119 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG117))}, z2.c.e(2031491085, true, new c(dVar119, g4Var118, j11110, fG117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar119;
                        g4Var2 = g4Var118;
                        j14 = j11110;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var119 = g4VarA;
                        long j11111 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1110 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG118))}, z2.c.e(2031491085, true, new c(dVar1110, g4Var119, j11111, fG118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1110;
                        g4Var2 = g4Var119;
                        j14 = j11111;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var1110 = g4VarA;
                        long j11112 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1111 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG119))}, z2.c.e(2031491085, true, new c(dVar1111, g4Var1110, j11112, fG119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1111;
                        g4Var2 = g4Var1110;
                        j14 = j11112;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var1111 = g4VarA;
                        long j11113 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG1110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1112 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1110))}, z2.c.e(2031491085, true, new c(dVar1112, g4Var1111, j11113, fG1110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1112;
                        g4Var2 = g4Var1111;
                        j14 = j11113;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1112 = g4VarA;
                    long j11114 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1113 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111))}, z2.c.e(2031491085, true, new c(dVar1113, g4Var1112, j11114, fG1111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1113;
                    g4Var2 = g4Var1112;
                    j14 = j11114;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1113 = g4VarA;
                    long j11115 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1114 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1112))}, z2.c.e(2031491085, true, new c(dVar1114, g4Var1113, j11115, fG1112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1114;
                    g4Var2 = g4Var1113;
                    j14 = j11115;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    g4VarA = g4Var;
                    if (lVarV.n(g4VarA)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        jN = j11;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                if ((196608 & i11) == 0) {
                    int i33 = i13;
                    if ((i12 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i18 = i33 | i27;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i18 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i21;
                }
                i22 = i12 & 128;
                if (i22 != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (lVarV.q(f11)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i18 |= i23;
                    }
                    i24 = i12 & 256;
                    if (i24 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (lVarV.n(lVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i18 |= i25;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (lVarV.K(pVar)) {
                                    i26 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i26 = 268435456;
                                }
                                i18 |= i26;
                            }
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var1114 = g4VarA;
                                long j11116 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG1113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar1115 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1113))}, z2.c.e(2031491085, true, new c(dVar1115, g4Var1114, j11116, fG1113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar1115;
                                g4Var2 = g4Var1114;
                                j14 = j11116;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var1115 = g4VarA;
                                long j11117 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG1114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar1116 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1114))}, z2.c.e(2031491085, true, new c(dVar1116, g4Var1115, j11117, fG1114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar1116;
                                g4Var2 = g4Var1115;
                                j14 = j11117;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 805306368;
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1116 = g4VarA;
                            long j11118 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar1117 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1115))}, z2.c.e(2031491085, true, new c(dVar1117, g4Var1116, j11118, fG1115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar1117;
                            g4Var2 = g4Var1116;
                            j14 = j11118;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1117 = g4VarA;
                            long j11119 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar1118 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1116))}, z2.c.e(2031491085, true, new c(dVar1118, g4Var1117, j11119, fG1116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar1118;
                            g4Var2 = g4Var1117;
                            j14 = j11119;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 100663296;
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1118 = g4VarA;
                            long j111110 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar1119 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1117))}, z2.c.e(2031491085, true, new c(dVar1119, g4Var1118, j111110, fG1117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar1119;
                            g4Var2 = g4Var1118;
                            j14 = j111110;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1119 = g4VarA;
                            long j111111 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11110 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1118))}, z2.c.e(2031491085, true, new c(dVar11110, g4Var1119, j111111, fG1118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11110;
                            g4Var2 = g4Var1119;
                            j14 = j111111;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11110 = g4VarA;
                        long j111112 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG1119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1119))}, z2.c.e(2031491085, true, new c(dVar11111, g4Var11110, j111112, fG1119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111;
                        g4Var2 = g4Var11110;
                        j14 = j111112;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111 = g4VarA;
                        long j111113 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11112 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11110))}, z2.c.e(2031491085, true, new c(dVar11112, g4Var11111, j111113, fG11110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11112;
                        g4Var2 = g4Var11111;
                        j14 = j111113;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 12582912;
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11112 = g4VarA;
                            long j111114 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11113 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111))}, z2.c.e(2031491085, true, new c(dVar11113, g4Var11112, j111114, fG11111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11113;
                            g4Var2 = g4Var11112;
                            j14 = j111114;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11113 = g4VarA;
                            long j111115 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11114 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11112))}, z2.c.e(2031491085, true, new c(dVar11114, g4Var11113, j111115, fG11112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11114;
                            g4Var2 = g4Var11113;
                            j14 = j111115;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11114 = g4VarA;
                        long j111116 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11115 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11113))}, z2.c.e(2031491085, true, new c(dVar11115, g4Var11114, j111116, fG11113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11115;
                        g4Var2 = g4Var11114;
                        j14 = j111116;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11115 = g4VarA;
                        long j111117 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11116 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11114))}, z2.c.e(2031491085, true, new c(dVar11116, g4Var11115, j111117, fG11114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11116;
                        g4Var2 = g4Var11115;
                        j14 = j111117;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11116 = g4VarA;
                        long j111118 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11117 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11115))}, z2.c.e(2031491085, true, new c(dVar11117, g4Var11116, j111118, fG11115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11117;
                        g4Var2 = g4Var11116;
                        j14 = j111118;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11117 = g4VarA;
                        long j111119 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11118 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11116))}, z2.c.e(2031491085, true, new c(dVar11118, g4Var11117, j111119, fG11116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11118;
                        g4Var2 = g4Var11117;
                        j14 = j111119;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11118 = g4VarA;
                    long j1111110 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar11119 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11117))}, z2.c.e(2031491085, true, new c(dVar11119, g4Var11118, j1111110, fG11117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar11119;
                    g4Var2 = g4Var11118;
                    j14 = j1111110;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11119 = g4VarA;
                    long j1111111 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111110 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11118))}, z2.c.e(2031491085, true, new c(dVar111110, g4Var11119, j1111111, fG11118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111110;
                    g4Var2 = g4Var11119;
                    j14 = j1111111;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            g4VarA = g4Var;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                jN = j11;
            }
            if ((196608 & i11) == 0) {
                int i34 = i13;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i18 = i34 | i27;
            } else {
                i18 = i13;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i18 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i21;
            }
            i22 = i12 & 128;
            if (i22 != 0) {
                if ((i11 & 12582912) == 0) {
                    if (lVarV.q(f11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i18 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var111110 = g4VarA;
                            long j1111112 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar111111 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11119))}, z2.c.e(2031491085, true, new c(dVar111111, g4Var111110, j1111112, fG11119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar111111;
                            g4Var2 = g4Var111110;
                            j14 = j1111112;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var111111 = g4VarA;
                            long j1111113 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar111112 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111110))}, z2.c.e(2031491085, true, new c(dVar111112, g4Var111111, j1111113, fG111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar111112;
                            g4Var2 = g4Var111111;
                            j14 = j1111113;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111112 = g4VarA;
                        long j1111114 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111113 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111))}, z2.c.e(2031491085, true, new c(dVar111113, g4Var111112, j1111114, fG111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111113;
                        g4Var2 = g4Var111112;
                        j14 = j1111114;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111113 = g4VarA;
                        long j1111115 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111114 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111112))}, z2.c.e(2031491085, true, new c(dVar111114, g4Var111113, j1111115, fG111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111114;
                        g4Var2 = g4Var111113;
                        j14 = j1111115;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111114 = g4VarA;
                        long j1111116 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111115 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111113))}, z2.c.e(2031491085, true, new c(dVar111115, g4Var111114, j1111116, fG111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111115;
                        g4Var2 = g4Var111114;
                        j14 = j1111116;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111115 = g4VarA;
                        long j1111117 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111116 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111114))}, z2.c.e(2031491085, true, new c(dVar111116, g4Var111115, j1111117, fG111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111116;
                        g4Var2 = g4Var111115;
                        j14 = j1111117;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111116 = g4VarA;
                    long j1111118 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111117 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111115))}, z2.c.e(2031491085, true, new c(dVar111117, g4Var111116, j1111118, fG111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111117;
                    g4Var2 = g4Var111116;
                    j14 = j1111118;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111117 = g4VarA;
                    long j1111119 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111118 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111116))}, z2.c.e(2031491085, true, new c(dVar111118, g4Var111117, j1111119, fG111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111118;
                    g4Var2 = g4Var111117;
                    j14 = j1111119;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 12582912;
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.n(lVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i18 |= i25;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111118 = g4VarA;
                        long j11111110 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111119 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111117))}, z2.c.e(2031491085, true, new c(dVar111119, g4Var111118, j11111110, fG111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111119;
                        g4Var2 = g4Var111118;
                        j14 = j11111110;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111119 = g4VarA;
                        long j11111111 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1111110 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111118))}, z2.c.e(2031491085, true, new c(dVar1111110, g4Var111119, j11111111, fG111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1111110;
                        g4Var2 = g4Var111119;
                        j14 = j11111111;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111110 = g4VarA;
                    long j11111112 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111119))}, z2.c.e(2031491085, true, new c(dVar1111111, g4Var1111110, j11111112, fG111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111;
                    g4Var2 = g4Var1111110;
                    j14 = j11111112;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111 = g4VarA;
                    long j11111113 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111112 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111110))}, z2.c.e(2031491085, true, new c(dVar1111112, g4Var1111111, j11111113, fG1111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111112;
                    g4Var2 = g4Var1111111;
                    j14 = j11111113;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111112 = g4VarA;
                    long j11111114 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111113 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111))}, z2.c.e(2031491085, true, new c(dVar1111113, g4Var1111112, j11111114, fG1111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111113;
                    g4Var2 = g4Var1111112;
                    j14 = j11111114;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111113 = g4VarA;
                    long j11111115 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111114 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111112))}, z2.c.e(2031491085, true, new c(dVar1111114, g4Var1111113, j11111115, fG1111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111114;
                    g4Var2 = g4Var1111113;
                    j14 = j11111115;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 805306368;
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111114 = g4VarA;
                long j11111116 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111115 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111113))}, z2.c.e(2031491085, true, new c(dVar1111115, g4Var1111114, j11111116, fG1111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111115;
                g4Var2 = g4Var1111114;
                j14 = j11111116;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111115 = g4VarA;
                long j11111117 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111116 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111114))}, z2.c.e(2031491085, true, new c(dVar1111116, g4Var1111115, j11111117, fG1111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111116;
                g4Var2 = g4Var1111115;
                j14 = j11111117;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    g4VarA = g4Var;
                    if (lVarV.n(g4VarA)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                            i28 = 16384;
                        }
                        i13 |= i28;
                    } else {
                        jN = j11;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                if ((196608 & i11) == 0) {
                    int i35 = i13;
                    if ((i12 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i18 = i35 | i27;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i18 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.n(borderStroke)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i21;
                }
                i22 = i12 & 128;
                if (i22 != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (lVarV.q(f11)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i18 |= i23;
                    }
                    i24 = i12 & 256;
                    if (i24 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (lVarV.n(lVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i18 |= i25;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (lVarV.K(pVar)) {
                                    i26 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i26 = 268435456;
                                }
                                i18 |= i26;
                            }
                            if ((i18 & 306783379) == 306783378) {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var1111116 = g4VarA;
                                long j11111118 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG1111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar1111117 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111115))}, z2.c.e(2031491085, true, new c(dVar1111117, g4Var1111116, j11111118, fG1111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar1111117;
                                g4Var2 = g4Var1111116;
                                j14 = j11111118;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            } else {
                                lVarV.L();
                                if ((i11 & 1) != 0) {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                } else {
                                    if (i29 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (i14 != 0) {
                                        z12 = true;
                                    }
                                    if (i16 != 0) {
                                        g4VarA = a4.a();
                                    }
                                    if ((i12 & 16) != 0) {
                                        jN = j1.f74525a.a(lVarV, 6).n();
                                        i18 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                        i18 &= -458753;
                                    } else {
                                        jB = j12;
                                    }
                                    if (i19 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if (i22 != 0) {
                                        fG = h.g(0);
                                    } else {
                                        fG = f11;
                                    }
                                    if (i24 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke3 = borderStroke2;
                                    z13 = z12;
                                    f12 = fG;
                                }
                                g4 g4Var1111117 = g4VarA;
                                long j11111119 = jN;
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                                }
                                float fG1111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                                androidx.compose.ui.d dVar1111118 = dVar2;
                                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111116))}, z2.c.e(2031491085, true, new c(dVar1111118, g4Var1111117, j11111119, fG1111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                                if (o.J()) {
                                    o.R();
                                }
                                j13 = jB;
                                dVar3 = dVar1111118;
                                g4Var2 = g4Var1111117;
                                j14 = j11111119;
                                borderStroke4 = borderStroke3;
                                f13 = f12;
                                lVar4 = lVar3;
                                z14 = z13;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                            }
                        }
                        i18 |= 805306368;
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1111118 = g4VarA;
                            long j111111110 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar1111119 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111117))}, z2.c.e(2031491085, true, new c(dVar1111119, g4Var1111118, j111111110, fG1111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar1111119;
                            g4Var2 = g4Var1111118;
                            j14 = j111111110;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1111119 = g4VarA;
                            long j111111111 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111110 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111118))}, z2.c.e(2031491085, true, new c(dVar11111110, g4Var1111119, j111111111, fG1111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111110;
                            g4Var2 = g4Var1111119;
                            j14 = j111111111;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 100663296;
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11111110 = g4VarA;
                            long j111111112 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111111 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111119))}, z2.c.e(2031491085, true, new c(dVar11111111, g4Var11111110, j111111112, fG1111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111111;
                            g4Var2 = g4Var11111110;
                            j14 = j111111112;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11111111 = g4VarA;
                            long j111111113 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111112 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111110))}, z2.c.e(2031491085, true, new c(dVar11111112, g4Var11111111, j111111113, fG11111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111112;
                            g4Var2 = g4Var11111111;
                            j14 = j111111113;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111112 = g4VarA;
                        long j111111114 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111113 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111))}, z2.c.e(2031491085, true, new c(dVar11111113, g4Var11111112, j111111114, fG11111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111113;
                        g4Var2 = g4Var11111112;
                        j14 = j111111114;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111113 = g4VarA;
                        long j111111115 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111114 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111112))}, z2.c.e(2031491085, true, new c(dVar11111114, g4Var11111113, j111111115, fG11111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111114;
                        g4Var2 = g4Var11111113;
                        j14 = j111111115;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 12582912;
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11111114 = g4VarA;
                            long j111111116 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111115 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111113))}, z2.c.e(2031491085, true, new c(dVar11111115, g4Var11111114, j111111116, fG11111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111115;
                            g4Var2 = g4Var11111114;
                            j14 = j111111116;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var11111115 = g4VarA;
                            long j111111117 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG11111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111116 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111114))}, z2.c.e(2031491085, true, new c(dVar11111116, g4Var11111115, j111111117, fG11111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111116;
                            g4Var2 = g4Var11111115;
                            j14 = j111111117;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111116 = g4VarA;
                        long j111111118 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111117 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111115))}, z2.c.e(2031491085, true, new c(dVar11111117, g4Var11111116, j111111118, fG11111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111117;
                        g4Var2 = g4Var11111116;
                        j14 = j111111118;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111117 = g4VarA;
                        long j111111119 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111118 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111116))}, z2.c.e(2031491085, true, new c(dVar11111118, g4Var11111117, j111111119, fG11111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111118;
                        g4Var2 = g4Var11111117;
                        j14 = j111111119;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111118 = g4VarA;
                        long j1111111110 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111119 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111117))}, z2.c.e(2031491085, true, new c(dVar11111119, g4Var11111118, j1111111110, fG11111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111119;
                        g4Var2 = g4Var11111118;
                        j14 = j1111111110;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111119 = g4VarA;
                        long j1111111111 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111110 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111118))}, z2.c.e(2031491085, true, new c(dVar111111110, g4Var11111119, j1111111111, fG11111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111110;
                        g4Var2 = g4Var11111119;
                        j14 = j1111111111;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111110 = g4VarA;
                    long j1111111112 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111119))}, z2.c.e(2031491085, true, new c(dVar111111111, g4Var111111110, j1111111112, fG11111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111;
                    g4Var2 = g4Var111111110;
                    j14 = j1111111112;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111 = g4VarA;
                    long j1111111113 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111112 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111110))}, z2.c.e(2031491085, true, new c(dVar111111112, g4Var111111111, j1111111113, fG111111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111112;
                    g4Var2 = g4Var111111111;
                    j14 = j1111111113;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            g4VarA = g4Var;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                jN = j11;
            }
            if ((196608 & i11) == 0) {
                int i36 = i13;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i18 = i36 | i27;
            } else {
                i18 = i13;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i18 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i21;
            }
            i22 = i12 & 128;
            if (i22 != 0) {
                if ((i11 & 12582912) == 0) {
                    if (lVarV.q(f11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i18 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var111111112 = g4VarA;
                            long j1111111114 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG111111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar111111113 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111))}, z2.c.e(2031491085, true, new c(dVar111111113, g4Var111111112, j1111111114, fG111111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar111111113;
                            g4Var2 = g4Var111111112;
                            j14 = j1111111114;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var111111113 = g4VarA;
                            long j1111111115 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG111111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar111111114 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111112))}, z2.c.e(2031491085, true, new c(dVar111111114, g4Var111111113, j1111111115, fG111111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar111111114;
                            g4Var2 = g4Var111111113;
                            j14 = j1111111115;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111114 = g4VarA;
                        long j1111111116 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111115 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111113))}, z2.c.e(2031491085, true, new c(dVar111111115, g4Var111111114, j1111111116, fG111111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111115;
                        g4Var2 = g4Var111111114;
                        j14 = j1111111116;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111115 = g4VarA;
                        long j1111111117 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111116 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111114))}, z2.c.e(2031491085, true, new c(dVar111111116, g4Var111111115, j1111111117, fG111111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111116;
                        g4Var2 = g4Var111111115;
                        j14 = j1111111117;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111116 = g4VarA;
                        long j1111111118 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111117 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111115))}, z2.c.e(2031491085, true, new c(dVar111111117, g4Var111111116, j1111111118, fG111111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111117;
                        g4Var2 = g4Var111111116;
                        j14 = j1111111118;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111117 = g4VarA;
                        long j1111111119 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111118 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111116))}, z2.c.e(2031491085, true, new c(dVar111111118, g4Var111111117, j1111111119, fG111111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111118;
                        g4Var2 = g4Var111111117;
                        j14 = j1111111119;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111118 = g4VarA;
                    long j11111111110 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111119 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111117))}, z2.c.e(2031491085, true, new c(dVar111111119, g4Var111111118, j11111111110, fG111111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111119;
                    g4Var2 = g4Var111111118;
                    j14 = j11111111110;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111119 = g4VarA;
                    long j11111111111 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111110 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111118))}, z2.c.e(2031491085, true, new c(dVar1111111110, g4Var111111119, j11111111111, fG111111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111110;
                    g4Var2 = g4Var111111119;
                    j14 = j11111111111;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 12582912;
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.n(lVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i18 |= i25;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var1111111110 = g4VarA;
                        long j11111111112 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1111111111 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111119))}, z2.c.e(2031491085, true, new c(dVar1111111111, g4Var1111111110, j11111111112, fG111111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1111111111;
                        g4Var2 = g4Var1111111110;
                        j14 = j11111111112;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var1111111111 = g4VarA;
                        long j11111111113 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG1111111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar1111111112 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111110))}, z2.c.e(2031491085, true, new c(dVar1111111112, g4Var1111111111, j11111111113, fG1111111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar1111111112;
                        g4Var2 = g4Var1111111111;
                        j14 = j11111111113;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111112 = g4VarA;
                    long j11111111114 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111113 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111))}, z2.c.e(2031491085, true, new c(dVar1111111113, g4Var1111111112, j11111111114, fG1111111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111113;
                    g4Var2 = g4Var1111111112;
                    j14 = j11111111114;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111113 = g4VarA;
                    long j11111111115 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111114 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111112))}, z2.c.e(2031491085, true, new c(dVar1111111114, g4Var1111111113, j11111111115, fG1111111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111114;
                    g4Var2 = g4Var1111111113;
                    j14 = j11111111115;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111114 = g4VarA;
                    long j11111111116 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111115 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111113))}, z2.c.e(2031491085, true, new c(dVar1111111115, g4Var1111111114, j11111111116, fG1111111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111115;
                    g4Var2 = g4Var1111111114;
                    j14 = j11111111116;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111115 = g4VarA;
                    long j11111111117 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111116 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111114))}, z2.c.e(2031491085, true, new c(dVar1111111116, g4Var1111111115, j11111111117, fG1111111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111116;
                    g4Var2 = g4Var1111111115;
                    j14 = j11111111117;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 805306368;
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111116 = g4VarA;
                long j11111111118 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111117 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111115))}, z2.c.e(2031491085, true, new c(dVar1111111117, g4Var1111111116, j11111111118, fG1111111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111117;
                g4Var2 = g4Var1111111116;
                j14 = j11111111118;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111117 = g4VarA;
                long j11111111119 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111118 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111116))}, z2.c.e(2031491085, true, new c(dVar1111111118, g4Var1111111117, j11111111119, fG1111111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111118;
                g4Var2 = g4Var1111111117;
                j14 = j11111111119;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                g4VarA = g4Var;
                if (lVarV.n(g4VarA)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                        i28 = 16384;
                    }
                    i13 |= i28;
                } else {
                    jN = j11;
                }
                i28 = PKIFailureInfo.certRevoked;
                i13 |= i28;
            } else {
                jN = j11;
            }
            if ((196608 & i11) == 0) {
                int i37 = i13;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i18 = i37 | i27;
            } else {
                i18 = i13;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i18 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.n(borderStroke)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i21;
            }
            i22 = i12 & 128;
            if (i22 != 0) {
                if ((i11 & 12582912) == 0) {
                    if (lVarV.q(f11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i18 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.n(lVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i18 |= i25;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (lVarV.K(pVar)) {
                                i26 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i26 = 268435456;
                            }
                            i18 |= i26;
                        }
                        if ((i18 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1111111118 = g4VarA;
                            long j111111111110 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1111111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar1111111119 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111117))}, z2.c.e(2031491085, true, new c(dVar1111111119, g4Var1111111118, j111111111110, fG1111111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar1111111119;
                            g4Var2 = g4Var1111111118;
                            j14 = j111111111110;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            } else {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if (i16 != 0) {
                                    g4VarA = a4.a();
                                }
                                if ((i12 & 16) != 0) {
                                    jN = j1.f74525a.a(lVarV, 6).n();
                                    i18 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                    i18 &= -458753;
                                } else {
                                    jB = j12;
                                }
                                if (i19 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i22 != 0) {
                                    fG = h.g(0);
                                } else {
                                    fG = f11;
                                }
                                if (i24 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke3 = borderStroke2;
                                z13 = z12;
                                f12 = fG;
                            }
                            g4 g4Var1111111119 = g4VarA;
                            long j111111111111 = jN;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                            }
                            float fG1111111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                            androidx.compose.ui.d dVar11111111110 = dVar2;
                            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111118))}, z2.c.e(2031491085, true, new c(dVar11111111110, g4Var1111111119, j111111111111, fG1111111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                            if (o.J()) {
                                o.R();
                            }
                            j13 = jB;
                            dVar3 = dVar11111111110;
                            g4Var2 = g4Var1111111119;
                            j14 = j111111111111;
                            borderStroke4 = borderStroke3;
                            f13 = f12;
                            lVar4 = lVar3;
                            z14 = z13;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                        }
                    }
                    i18 |= 805306368;
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111110 = g4VarA;
                        long j111111111112 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG1111111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111111 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111119))}, z2.c.e(2031491085, true, new c(dVar11111111111, g4Var11111111110, j111111111112, fG1111111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111111;
                        g4Var2 = g4Var11111111110;
                        j14 = j111111111112;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111111 = g4VarA;
                        long j111111111113 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111112 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111110))}, z2.c.e(2031491085, true, new c(dVar11111111112, g4Var11111111111, j111111111113, fG11111111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111112;
                        g4Var2 = g4Var11111111111;
                        j14 = j111111111113;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111112 = g4VarA;
                        long j111111111114 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111113 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111111))}, z2.c.e(2031491085, true, new c(dVar11111111113, g4Var11111111112, j111111111114, fG11111111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111113;
                        g4Var2 = g4Var11111111112;
                        j14 = j111111111114;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111113 = g4VarA;
                        long j111111111115 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111114 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111112))}, z2.c.e(2031491085, true, new c(dVar11111111114, g4Var11111111113, j111111111115, fG11111111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111114;
                        g4Var2 = g4Var11111111113;
                        j14 = j111111111115;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11111111114 = g4VarA;
                    long j111111111116 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar11111111115 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111113))}, z2.c.e(2031491085, true, new c(dVar11111111115, g4Var11111111114, j111111111116, fG11111111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar11111111115;
                    g4Var2 = g4Var11111111114;
                    j14 = j111111111116;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11111111115 = g4VarA;
                    long j111111111117 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar11111111116 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111114))}, z2.c.e(2031491085, true, new c(dVar11111111116, g4Var11111111115, j111111111117, fG11111111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar11111111116;
                    g4Var2 = g4Var11111111115;
                    j14 = j111111111117;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 12582912;
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.n(lVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i18 |= i25;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111116 = g4VarA;
                        long j111111111118 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111117 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111115))}, z2.c.e(2031491085, true, new c(dVar11111111117, g4Var11111111116, j111111111118, fG11111111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111117;
                        g4Var2 = g4Var11111111116;
                        j14 = j111111111118;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var11111111117 = g4VarA;
                        long j111111111119 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG11111111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar11111111118 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111116))}, z2.c.e(2031491085, true, new c(dVar11111111118, g4Var11111111117, j111111111119, fG11111111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar11111111118;
                        g4Var2 = g4Var11111111117;
                        j14 = j111111111119;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11111111118 = g4VarA;
                    long j1111111111110 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar11111111119 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111117))}, z2.c.e(2031491085, true, new c(dVar11111111119, g4Var11111111118, j1111111111110, fG11111111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar11111111119;
                    g4Var2 = g4Var11111111118;
                    j14 = j1111111111110;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var11111111119 = g4VarA;
                    long j1111111111111 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111110 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111118))}, z2.c.e(2031491085, true, new c(dVar111111111110, g4Var11111111119, j1111111111111, fG11111111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111110;
                    g4Var2 = g4Var11111111119;
                    j14 = j1111111111111;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111110 = g4VarA;
                    long j1111111111112 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG11111111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111111 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG11111111119))}, z2.c.e(2031491085, true, new c(dVar111111111111, g4Var111111111110, j1111111111112, fG11111111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111111;
                    g4Var2 = g4Var111111111110;
                    j14 = j1111111111112;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111111 = g4VarA;
                    long j1111111111113 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111112 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111110))}, z2.c.e(2031491085, true, new c(dVar111111111112, g4Var111111111111, j1111111111113, fG111111111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111112;
                    g4Var2 = g4Var111111111111;
                    j14 = j1111111111113;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 805306368;
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var111111111112 = g4VarA;
                long j1111111111114 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG111111111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar111111111113 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111111))}, z2.c.e(2031491085, true, new c(dVar111111111113, g4Var111111111112, j1111111111114, fG111111111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar111111111113;
                g4Var2 = g4Var111111111112;
                j14 = j1111111111114;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var111111111113 = g4VarA;
                long j1111111111115 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG111111111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar111111111114 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111112))}, z2.c.e(2031491085, true, new c(dVar111111111114, g4Var111111111113, j1111111111115, fG111111111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar111111111114;
                g4Var2 = g4Var111111111113;
                j14 = j1111111111115;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i13 |= 3072;
        g4VarA = g4Var;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jN = j11;
                if (lVarV.s(jN)) {
                    i28 = 16384;
                }
                i13 |= i28;
            } else {
                jN = j11;
            }
            i28 = PKIFailureInfo.certRevoked;
            i13 |= i28;
        } else {
            jN = j11;
        }
        if ((196608 & i11) == 0) {
            int i38 = i13;
            if ((i12 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i18 = i38 | i27;
        } else {
            i18 = i13;
        }
        i19 = i12 & 64;
        if (i19 != 0) {
            i18 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.n(borderStroke)) {
                i21 = PKIFailureInfo.badCertTemplate;
            } else {
                i21 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i21;
        }
        i22 = i12 & 128;
        if (i22 != 0) {
            if ((i11 & 12582912) == 0) {
                if (lVarV.q(f11)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i18 |= i23;
            }
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.n(lVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i18 |= i25;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (lVarV.K(pVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111111114 = g4VarA;
                        long j1111111111116 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111111115 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111113))}, z2.c.e(2031491085, true, new c(dVar111111111115, g4Var111111111114, j1111111111116, fG111111111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111111115;
                        g4Var2 = g4Var111111111114;
                        j14 = j1111111111116;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            }
                            if (i16 != 0) {
                                g4VarA = a4.a();
                            }
                            if ((i12 & 16) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i18 &= -57345;
                            }
                            if ((i12 & 32) != 0) {
                                jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                                i18 &= -458753;
                            } else {
                                jB = j12;
                            }
                            if (i19 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i22 != 0) {
                                fG = h.g(0);
                            } else {
                                fG = f11;
                            }
                            if (i24 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke3 = borderStroke2;
                            z13 = z12;
                            f12 = fG;
                        }
                        g4 g4Var111111111115 = g4VarA;
                        long j1111111111117 = jN;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                        }
                        float fG111111111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                        androidx.compose.ui.d dVar111111111116 = dVar2;
                        w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111114))}, z2.c.e(2031491085, true, new c(dVar111111111116, g4Var111111111115, j1111111111117, fG111111111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                        if (o.J()) {
                            o.R();
                        }
                        j13 = jB;
                        dVar3 = dVar111111111116;
                        g4Var2 = g4Var111111111115;
                        j14 = j1111111111117;
                        borderStroke4 = borderStroke3;
                        f13 = f12;
                        lVar4 = lVar3;
                        z14 = z13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                    }
                }
                i18 |= 805306368;
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111116 = g4VarA;
                    long j1111111111118 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111117 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111115))}, z2.c.e(2031491085, true, new c(dVar111111111117, g4Var111111111116, j1111111111118, fG111111111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111117;
                    g4Var2 = g4Var111111111116;
                    j14 = j1111111111118;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111117 = g4VarA;
                    long j1111111111119 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111118 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111116))}, z2.c.e(2031491085, true, new c(dVar111111111118, g4Var111111111117, j1111111111119, fG111111111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111118;
                    g4Var2 = g4Var111111111117;
                    j14 = j1111111111119;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111118 = g4VarA;
                    long j11111111111110 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar111111111119 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111117))}, z2.c.e(2031491085, true, new c(dVar111111111119, g4Var111111111118, j11111111111110, fG111111111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar111111111119;
                    g4Var2 = g4Var111111111118;
                    j14 = j11111111111110;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var111111111119 = g4VarA;
                    long j11111111111111 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG111111111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111111110 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111118))}, z2.c.e(2031491085, true, new c(dVar1111111111110, g4Var111111111119, j11111111111111, fG111111111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111111110;
                    g4Var2 = g4Var111111111119;
                    j14 = j11111111111111;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 805306368;
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111110 = g4VarA;
                long j11111111111112 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG111111111119 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111111 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG111111111119))}, z2.c.e(2031491085, true, new c(dVar1111111111111, g4Var1111111111110, j11111111111112, fG111111111119, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111111;
                g4Var2 = g4Var1111111111110;
                j14 = j11111111111112;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111111 = g4VarA;
                long j11111111111113 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111111110 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111112 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111110))}, z2.c.e(2031491085, true, new c(dVar1111111111112, g4Var1111111111111, j11111111111113, fG1111111111110, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111112;
                g4Var2 = g4Var1111111111111;
                j14 = j11111111111113;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i18 |= 12582912;
        i24 = i12 & 256;
        if (i24 != 0) {
            if ((i11 & 100663296) == 0) {
                if (lVarV.n(lVar)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i18 |= i25;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i18 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111111112 = g4VarA;
                    long j11111111111114 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111111111 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111111113 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111111))}, z2.c.e(2031491085, true, new c(dVar1111111111113, g4Var1111111111112, j11111111111114, fG1111111111111, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111111113;
                    g4Var2 = g4Var1111111111112;
                    j14 = j11111111111114;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            g4VarA = a4.a();
                        }
                        if ((i12 & 16) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i18 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                            i18 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if (i19 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i22 != 0) {
                            fG = h.g(0);
                        } else {
                            fG = f11;
                        }
                        if (i24 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke3 = borderStroke2;
                        z13 = z12;
                        f12 = fG;
                    }
                    g4 g4Var1111111111113 = g4VarA;
                    long j11111111111115 = jN;
                    lVarV.C();
                    if (o.J()) {
                        o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                    }
                    float fG1111111111112 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                    androidx.compose.ui.d dVar1111111111114 = dVar2;
                    w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111112))}, z2.c.e(2031491085, true, new c(dVar1111111111114, g4Var1111111111113, j11111111111115, fG1111111111112, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                    if (o.J()) {
                        o.R();
                    }
                    j13 = jB;
                    dVar3 = dVar1111111111114;
                    g4Var2 = g4Var1111111111113;
                    j14 = j11111111111115;
                    borderStroke4 = borderStroke3;
                    f13 = f12;
                    lVar4 = lVar3;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
                }
            }
            i18 |= 805306368;
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111114 = g4VarA;
                long j11111111111116 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111111113 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111115 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111113))}, z2.c.e(2031491085, true, new c(dVar1111111111115, g4Var1111111111114, j11111111111116, fG1111111111113, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111115;
                g4Var2 = g4Var1111111111114;
                j14 = j11111111111116;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111115 = g4VarA;
                long j11111111111117 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111111114 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111116 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111114))}, z2.c.e(2031491085, true, new c(dVar1111111111116, g4Var1111111111115, j11111111111117, fG1111111111114, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111116;
                g4Var2 = g4Var1111111111115;
                j14 = j11111111111117;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i18 |= 100663296;
        if ((i12 & 512) != 0) {
            if ((i11 & 805306368) == 0) {
                if (lVarV.K(pVar)) {
                    i26 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i26 = 268435456;
                }
                i18 |= i26;
            }
            if ((i18 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111116 = g4VarA;
                long j11111111111118 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111111115 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111117 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111115))}, z2.c.e(2031491085, true, new c(dVar1111111111117, g4Var1111111111116, j11111111111118, fG1111111111115, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111117;
                g4Var2 = g4Var1111111111116;
                j14 = j11111111111118;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        g4VarA = a4.a();
                    }
                    if ((i12 & 16) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i18 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                        i18 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if (i19 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i22 != 0) {
                        fG = h.g(0);
                    } else {
                        fG = f11;
                    }
                    if (i24 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke3 = borderStroke2;
                    z13 = z12;
                    f12 = fG;
                }
                g4 g4Var1111111111117 = g4VarA;
                long j11111111111119 = jN;
                lVarV.C();
                if (o.J()) {
                    o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
                }
                float fG1111111111116 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
                androidx.compose.ui.d dVar1111111111118 = dVar2;
                w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111116))}, z2.c.e(2031491085, true, new c(dVar1111111111118, g4Var1111111111117, j11111111111119, fG1111111111116, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
                j13 = jB;
                dVar3 = dVar1111111111118;
                g4Var2 = g4Var1111111111117;
                j14 = j11111111111119;
                borderStroke4 = borderStroke3;
                f13 = f12;
                lVar4 = lVar3;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
            }
        }
        i18 |= 805306368;
        if ((i18 & 306783379) == 306783378) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 16) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i18 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                    i18 &= -458753;
                } else {
                    jB = j12;
                }
                if (i19 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i22 != 0) {
                    fG = h.g(0);
                } else {
                    fG = f11;
                }
                if (i24 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke3 = borderStroke2;
                z13 = z12;
                f12 = fG;
            } else {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 16) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i18 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                    i18 &= -458753;
                } else {
                    jB = j12;
                }
                if (i19 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i22 != 0) {
                    fG = h.g(0);
                } else {
                    fG = f11;
                }
                if (i24 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke3 = borderStroke2;
                z13 = z12;
                f12 = fG;
            }
            g4 g4Var1111111111118 = g4VarA;
            long j111111111111110 = jN;
            lVarV.C();
            if (o.J()) {
                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
            }
            float fG1111111111117 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
            androidx.compose.ui.d dVar1111111111119 = dVar2;
            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111117))}, z2.c.e(2031491085, true, new c(dVar1111111111119, g4Var1111111111118, j111111111111110, fG1111111111117, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
            j13 = jB;
            dVar3 = dVar1111111111119;
            g4Var2 = g4Var1111111111118;
            j14 = j111111111111110;
            borderStroke4 = borderStroke3;
            f13 = f12;
            lVar4 = lVar3;
            z14 = z13;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 16) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i18 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                    i18 &= -458753;
                } else {
                    jB = j12;
                }
                if (i19 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i22 != 0) {
                    fG = h.g(0);
                } else {
                    fG = f11;
                }
                if (i24 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke3 = borderStroke2;
                z13 = z12;
                f12 = fG;
            } else {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    g4VarA = a4.a();
                }
                if ((i12 & 16) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i18 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jB = s.b(jN, lVarV, (i18 >> 12) & 14);
                    i18 &= -458753;
                } else {
                    jB = j12;
                }
                if (i19 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i22 != 0) {
                    fG = h.g(0);
                } else {
                    fG = f11;
                }
                if (i24 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke3 = borderStroke2;
                z13 = z12;
                f12 = fG;
            }
            g4 g4Var1111111111119 = g4VarA;
            long j111111111111111 = jN;
            lVarV.C();
            if (o.J()) {
                o.S(1560876237, i18, -1, "androidx.compose.material.Surface (Surface.kt:218)");
            }
            float fG1111111111118 = h.g(((h) lVarV.U(t0.c())).getValue() + f12);
            androidx.compose.ui.d dVar11111111111110 = dVar2;
            w.b(new h2[]{z.a().d(p1.l(jB)), t0.c().d(h.d(fG1111111111118))}, z2.c.e(2031491085, true, new c(dVar11111111111110, g4Var1111111111119, j111111111111111, fG1111111111118, borderStroke3, f12, lVar3, z13, aVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
            j13 = jB;
            dVar3 = dVar11111111111110;
            g4Var2 = g4Var1111111111119;
            j14 = j111111111111111;
            borderStroke4 = borderStroke3;
            f13 = f12;
            lVar4 = lVar3;
            z14 = z13;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(aVar, dVar3, z14, g4Var2, j14, j13, borderStroke4, f13, lVar4, pVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, g4 g4Var, long j11, BorderStroke borderStroke, float f11) {
        androidx.compose.ui.d dVarB = h3.l.b(dVar, f11, g4Var, false, 0L, 0L, 24, null);
        androidx.compose.ui.d dVarE = androidx.compose.ui.d.INSTANCE;
        if (borderStroke != null) {
            dVarE = e.e(dVarE, borderStroke, g4Var);
        }
        return h3.e.a(androidx.compose.foundation.b.c(dVarB.g(dVarE), j11, g4Var), g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j11, s0 s0Var, float f11, l lVar, int i11) {
        long jA;
        if (o.J()) {
            o.S(1561611256, i11, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:495)");
        }
        if (!p1.r(j11, j1.f74525a.a(lVar, 6).n()) || s0Var == null) {
            lVar.o(1082239839);
            lVar.l();
            jA = j11;
        } else {
            lVar.o(1082171732);
            jA = s0Var.a(j11, f11, lVar, (i11 & 14) | ((i11 >> 3) & 112) | ((i11 << 3) & 896));
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        return jA;
    }
}
