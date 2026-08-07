package p022s40;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i40.k;
import j3.m;
import j3.n;
import java.util.List;
import jn0.h0;
import jn0.t;
import k3.h1;
import k3.i4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import m3.Stroke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.v1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.f0;
import p019p1.m0;
import p019p1.n0;
import p019p1.o0;
import p019p1.o1;
import p019p1.y0;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import v1.e0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: renamed from: s40.j, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Lk3/h1;", "Ljn0/h0;", "content", "f", "(Lwn0/q;Lr2/l;I)V", "a", "(Lr2/l;I)V", "Landroidx/compose/ui/d;", "modifier", "Lw4/h;", "strokeWidth", "gradient", "g", "(Landroidx/compose/ui/d;FLk3/h1;Lr2/l;II)V", "", "canShowPill", "c", "(ZLandroidx/compose/ui/d;Lr2/l;II)V", "b", "(Landroidx/compose/ui/d;Lr2/l;II)V", "", "angle", "showingPill", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: s40.j$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f109939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f109939c = i11;
        }

        public final void a(l lVar, int i11) {
            Function1.a(lVar, k2.a(this.f109939c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.j$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f109941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109942e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f109940c = dVar;
            this.f109941d = i11;
            this.f109942e = i12;
        }

        public final void a(l lVar, int i11) {
            Function1.b(this.f109940c, lVar, k2.a(this.f109941d | 1), this.f109942e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.j$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.common.LoadingContentKt$LoadingPillContainer$1$1", f = "LoadingContent.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109943n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f109944o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f109945p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, p1<Boolean> p1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109944o = z11;
            this.f109945p = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f109944o, this.f109945p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109943n;
            if (i11 == 0) {
                t.b(obj);
                if (this.f109944o) {
                    this.f109943n = 1;
                    if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            Function1.e(this.f109945p, this.f109944o);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: s40.j$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f109946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f109946c = i11;
        }

        public final Integer a(int i11) {
            return Integer.valueOf(this.f109946c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: s40.j$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f109947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(1);
            this.f109947c = i11;
        }

        public final Integer a(int i11) {
            return Integer.valueOf(this.f109947c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: s40.j$f */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f109948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109951f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f109948c = z11;
            this.f109949d = dVar;
            this.f109950e = i11;
            this.f109951f = i12;
        }

        public final void a(l lVar, int i11) {
            Function1.c(this.f109948c, this.f109949d, lVar, k2.a(this.f109950e | 1), this.f109951f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.j$g */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f109952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f109953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, boolean z12) {
            super(0);
            this.f109952c = z11;
            this.f109953d = z12;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.valueOf(this.f109952c && this.f109953d), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: s40.j$h */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<h1, l, Integer, h0> f109954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f109955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(q<? super h1, ? super l, ? super Integer, h0> qVar, int i11) {
            super(2);
            this.f109954c = qVar;
            this.f109955d = i11;
        }

        public final void a(l lVar, int i11) {
            Function1.f(this.f109954c, lVar, k2.a(this.f109955d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.j$i */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f109956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<Float> f109957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h1 f109958e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(float f11, y3<Float> y3Var, h1 h1Var) {
            super(1);
            this.f109956c = f11;
            this.f109957d = y3Var;
            this.f109958e = h1Var;
        }

        public final void a(m3.f Canvas) {
            s.k(Canvas, "$this$Canvas");
            float fJ = m.j(Canvas.b());
            float f11 = fJ / 2.0f;
            float fO1 = Canvas.O1(this.f109956c);
            float f12 = fJ - fO1;
            float f13 = f11 - (f12 / 2.0f);
            long jA = j3.h.a(f13, f13);
            y3<Float> y3Var = this.f109957d;
            h1 h1Var = this.f109958e;
            m3.d drawContext = Canvas.getDrawContext();
            long jB = drawContext.b();
            drawContext.a().u();
            m3.h transform = drawContext.getTransform();
            float f14 = 2;
            transform.g(Function1.h(y3Var), j3.h.a(m.k(transform.b()) / f14, m.i(transform.b()) / f14));
            m3.f.p0(Canvas, h1Var, 90.0f, 260.0f, false, jA, n.a(f12, f12), BitmapDescriptorFactory.HUE_RED, new Stroke(fO1, BitmapDescriptorFactory.HUE_RED, i4.INSTANCE.b(), 0, null, 26, null), null, 0, 832, null);
            drawContext.a().o();
            drawContext.f(jB);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.j$j */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f109960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h1 f109961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f109963g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.d dVar, float f11, h1 h1Var, int i11, int i12) {
            super(2);
            this.f109959c = dVar;
            this.f109960d = f11;
            this.f109961e = h1Var;
            this.f109962f = i11;
            this.f109963g = i12;
        }

        public final void a(l lVar, int i11) {
            Function1.g(this.f109959c, this.f109960d, this.f109961e, lVar, k2.a(this.f109962f | 1), this.f109963g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(l lVar, int i11) {
        l lVarV = lVar.v(-2130880376);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-2130880376, i11, -1, "com.stripe.android.financialconnections.features.common.FullScreenGenericLoading (LoadingContent.kt:108)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarF = x.f(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            d3.c cVarE = d3.c.INSTANCE.e();
            lVarV.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarF);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            g(x.q(companion, w4.h.g(52)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        l lVarV = lVar.v(-2033185978);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = i11 | (lVarV.n(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            androidx.compose.ui.d dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (o.J()) {
                o.S(-2033185978, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingPill (LoadingContent.kt:209)");
            }
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(8));
            float f11 = 16;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.t.j(androidx.compose.foundation.b.c(dVar3, p026y50.a.s(), a2.g.a(100)), w4.h.g(f11), w4.h.g(12));
            lVarV.H(693286680);
            i0 i0VarB = e0.b(fVarN, interfaceC1212cI, lVarV, 54);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarJ);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            String strC = e4.i.c(k.L, lVarV, 0);
            p026y50.d dVar4 = p026y50.d.f125064a;
            androidx.compose.ui.d dVar5 = dVar3;
            v2.b(strC, null, dVar4.a(lVarV, 6).getTextWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar4.b(lVarV, 6).getBodySmall(), lVarV, 0, 0, 65530);
            lVarV = lVarV;
            g(x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(f11)), w4.h.g(2), h1.Companion.f(h1.INSTANCE, v.p(k3.p1.l(k3.p1.INSTANCE.i()), k3.p1.l(dVar4.a(lVarV, 6).getIconWhite())), 0L, 2, null), lVarV, 54, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar5;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar2, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z11, androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        Configuration configuration;
        w4.d dVar4;
        boolean zBooleanValue;
        boolean zN;
        Object objI;
        int iIntValue;
        int i14;
        boolean z12;
        boolean z13;
        Object objI2;
        p1 p1Var;
        boolean z14;
        boolean zN2;
        Object objI3;
        boolean zR;
        Object objI4;
        boolean zR2;
        Object objI5;
        w2 w2VarX;
        l lVarV = lVar.v(41514711);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i13 & 91) == 18 || !lVarV.b()) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(41514711, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingPillContainer (LoadingContent.kt:165)");
                }
                configuration = (Configuration) lVarV.U(AndroidCompositionLocals_androidKt.f());
                dVar4 = (w4.d) lVarV.U(z0.g());
                zBooleanValue = ((Boolean) lVarV.U(androidx.compose.ui.platform.p1.a())).booleanValue();
                lVarV.H(-1049173233);
                zN = lVarV.n(configuration) | lVarV.n(dVar4);
                objI = lVarV.I();
                if (zN || objI == l.INSTANCE.a()) {
                    objI = Integer.valueOf(dVar4.i1(w4.h.g(configuration.screenHeightDp)));
                    lVarV.B(objI);
                }
                iIntValue = ((Number) objI).intValue();
                lVarV.T();
                int i16 = i13;
                Object[] objArr = new Object[0];
                lVarV.H(-1049167798);
                boolean zP = lVarV.p(zBooleanValue);
                i14 = i16 & 14;
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zP | z12;
                objI2 = lVarV.I();
                if (z13 || objI2 == l.INSTANCE.a()) {
                    objI2 = new g(zBooleanValue, z11);
                    lVarV.B(objI2);
                }
                lVarV.T();
                p1Var = (p1) a3.b.c(objArr, null, null, (wn0.a) objI2, lVarV, 8, 6);
                Boolean boolValueOf = Boolean.valueOf(z11);
                lVarV.H(-1049164695);
                if (i14 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zN2 = z14 | lVarV.n(p1Var);
                objI3 = lVarV.I();
                if (zN2 || objI3 == l.INSTANCE.a()) {
                    objI3 = new c(z11, p1Var, null);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Function0.g(boolValueOf, (p) objI3, lVarV, i14 | 64);
                boolean zD = d(p1Var);
                o1 o1VarL = p019p1.j.l(600, 0, f0.c(), 2, null);
                lVarV.H(-1049152161);
                zR = lVarV.r(iIntValue);
                objI4 = lVarV.I();
                if (zR || objI4 == l.INSTANCE.a()) {
                    objI4 = new d(iIntValue);
                    lVarV.B(objI4);
                }
                lVarV.T();
                androidx.compose.animation.i iVarX = androidx.compose.animation.g.x(o1VarL, (wn0.l) objI4);
                o1 o1VarL2 = p019p1.j.l(600, 0, null, 6, null);
                lVarV.H(-1049147361);
                zR2 = lVarV.r(iIntValue);
                objI5 = lVarV.I();
                if (zR2 || objI5 == l.INSTANCE.a()) {
                    objI5 = new e(iIntValue);
                    lVarV.B(objI5);
                }
                lVarV.T();
                p015o1.d.f(zD, x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), iVarX, androidx.compose.animation.g.B(o1VarL2, (wn0.l) objI5), null, p022s40.d.f109831a.a(), lVarV, 196608, 16);
                lVarV = lVarV;
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar3 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new f(z11, dVar3, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i13 & 91) == 18) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(41514711, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingPillContainer (LoadingContent.kt:165)");
            }
            configuration = (Configuration) lVarV.U(AndroidCompositionLocals_androidKt.f());
            dVar4 = (w4.d) lVarV.U(z0.g());
            zBooleanValue = ((Boolean) lVarV.U(androidx.compose.ui.platform.p1.a())).booleanValue();
            lVarV.H(-1049173233);
            zN = lVarV.n(configuration) | lVarV.n(dVar4);
            objI = lVarV.I();
            if (zN) {
                objI = Integer.valueOf(dVar4.i1(w4.h.g(configuration.screenHeightDp)));
                lVarV.B(objI);
            } else {
                objI = Integer.valueOf(dVar4.i1(w4.h.g(configuration.screenHeightDp)));
                lVarV.B(objI);
            }
            iIntValue = ((Number) objI).intValue();
            lVarV.T();
            int i17 = i13;
            Object[] objArr2 = new Object[0];
            lVarV.H(-1049167798);
            boolean zP2 = lVarV.p(zBooleanValue);
            i14 = i17 & 14;
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zP2 | z12;
            objI2 = lVarV.I();
            if (z13) {
                objI2 = new g(zBooleanValue, z11);
                lVarV.B(objI2);
            } else {
                objI2 = new g(zBooleanValue, z11);
                lVarV.B(objI2);
            }
            lVarV.T();
            p1Var = (p1) a3.b.c(objArr2, null, null, (wn0.a) objI2, lVarV, 8, 6);
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            lVarV.H(-1049164695);
            if (i14 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zN2 = z14 | lVarV.n(p1Var);
            objI3 = lVarV.I();
            if (zN2) {
                objI3 = new c(z11, p1Var, null);
                lVarV.B(objI3);
            } else {
                objI3 = new c(z11, p1Var, null);
                lVarV.B(objI3);
            }
            lVarV.T();
            Function0.g(boolValueOf2, (p) objI3, lVarV, i14 | 64);
            boolean zD2 = d(p1Var);
            o1 o1VarL3 = p019p1.j.l(600, 0, f0.c(), 2, null);
            lVarV.H(-1049152161);
            zR = lVarV.r(iIntValue);
            objI4 = lVarV.I();
            if (zR) {
                objI4 = new d(iIntValue);
                lVarV.B(objI4);
            } else {
                objI4 = new d(iIntValue);
                lVarV.B(objI4);
            }
            lVarV.T();
            androidx.compose.animation.i iVarX2 = androidx.compose.animation.g.x(o1VarL3, (wn0.l) objI4);
            o1 o1VarL4 = p019p1.j.l(600, 0, null, 6, null);
            lVarV.H(-1049147361);
            zR2 = lVarV.r(iIntValue);
            objI5 = lVarV.I();
            if (zR2) {
                objI5 = new e(iIntValue);
                lVarV.B(objI5);
            } else {
                objI5 = new e(iIntValue);
                lVarV.B(objI5);
            }
            lVarV.T();
            p015o1.d.f(zD2, x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), iVarX2, androidx.compose.animation.g.B(o1VarL4, (wn0.l) objI5), null, p022s40.d.f109831a.a(), lVarV, 196608, 16);
            lVarV = lVarV;
            if (o.J()) {
                o.R();
            }
        } else {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(41514711, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingPillContainer (LoadingContent.kt:165)");
            }
            configuration = (Configuration) lVarV.U(AndroidCompositionLocals_androidKt.f());
            dVar4 = (w4.d) lVarV.U(z0.g());
            zBooleanValue = ((Boolean) lVarV.U(androidx.compose.ui.platform.p1.a())).booleanValue();
            lVarV.H(-1049173233);
            zN = lVarV.n(configuration) | lVarV.n(dVar4);
            objI = lVarV.I();
            if (zN) {
                objI = Integer.valueOf(dVar4.i1(w4.h.g(configuration.screenHeightDp)));
                lVarV.B(objI);
            } else {
                objI = Integer.valueOf(dVar4.i1(w4.h.g(configuration.screenHeightDp)));
                lVarV.B(objI);
            }
            iIntValue = ((Number) objI).intValue();
            lVarV.T();
            int i18 = i13;
            Object[] objArr3 = new Object[0];
            lVarV.H(-1049167798);
            boolean zP3 = lVarV.p(zBooleanValue);
            i14 = i18 & 14;
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zP3 | z12;
            objI2 = lVarV.I();
            if (z13) {
                objI2 = new g(zBooleanValue, z11);
                lVarV.B(objI2);
            } else {
                objI2 = new g(zBooleanValue, z11);
                lVarV.B(objI2);
            }
            lVarV.T();
            p1Var = (p1) a3.b.c(objArr3, null, null, (wn0.a) objI2, lVarV, 8, 6);
            Boolean boolValueOf3 = Boolean.valueOf(z11);
            lVarV.H(-1049164695);
            if (i14 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zN2 = z14 | lVarV.n(p1Var);
            objI3 = lVarV.I();
            if (zN2) {
                objI3 = new c(z11, p1Var, null);
                lVarV.B(objI3);
            } else {
                objI3 = new c(z11, p1Var, null);
                lVarV.B(objI3);
            }
            lVarV.T();
            Function0.g(boolValueOf3, (p) objI3, lVarV, i14 | 64);
            boolean zD3 = d(p1Var);
            o1 o1VarL5 = p019p1.j.l(600, 0, f0.c(), 2, null);
            lVarV.H(-1049152161);
            zR = lVarV.r(iIntValue);
            objI4 = lVarV.I();
            if (zR) {
                objI4 = new d(iIntValue);
                lVarV.B(objI4);
            } else {
                objI4 = new d(iIntValue);
                lVarV.B(objI4);
            }
            lVarV.T();
            androidx.compose.animation.i iVarX3 = androidx.compose.animation.g.x(o1VarL5, (wn0.l) objI4);
            o1 o1VarL6 = p019p1.j.l(600, 0, null, 6, null);
            lVarV.H(-1049147361);
            zR2 = lVarV.r(iIntValue);
            objI5 = lVarV.I();
            if (zR2) {
                objI5 = new e(iIntValue);
                lVarV.B(objI5);
            } else {
                objI5 = new e(iIntValue);
                lVarV.B(objI5);
            }
            lVarV.T();
            p015o1.d.f(zD3, x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), iVarX3, androidx.compose.animation.g.B(o1VarL6, (wn0.l) objI5), null, p022s40.d.f109831a.a(), lVarV, 196608, 16);
            lVarV = lVarV;
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(z11, dVar3, i11, i12));
        }
    }

    private static final boolean d(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void f(q<? super h1, ? super l, ? super Integer, h0> content, l lVar, int i11) {
        int i12;
        s.k(content, "content");
        l lVarV = lVar.v(-833932477);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.K(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-833932477, i12, -1, "com.stripe.android.financialconnections.features.common.LoadingShimmerEffect (LoadingContent.kt:71)");
            }
            float fO1 = ((w4.d) lVarV.U(z0.g())).O1(w4.h.g(((Configuration) lVarV.U(AndroidCompositionLocals_androidKt.f())).screenWidthDp));
            float f11 = 0.2f * fO1;
            p026y50.d dVar = p026y50.d.f125064a;
            List listP = v.p(k3.p1.l(dVar.a(lVarV, 6).getBackgroundOffset()), k3.p1.l(k3.p1.p(k3.p1.INSTANCE.k(), 0.4f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null)), k3.p1.l(dVar.a(lVarV, 6).getBackgroundOffset()));
            y3<Float> y3VarA = o0.a(o0.c("shimmer_transition", lVarV, 6, 0), BitmapDescriptorFactory.HUE_RED, fO1, p019p1.j.e(p019p1.j.l(1000, 0, f0.d(), 2, null), null, 0L, 6, null), "shimmer_translate_animation", lVarV, n0.f100525f | 24624 | (m0.f100493d << 9), 0);
            content.invoke(h1.Companion.d(h1.INSTANCE, listP, j3.h.a(y3VarA.getValue().floatValue() - f11, y3VarA.getValue().floatValue() - f11), j3.h.a(y3VarA.getValue().floatValue(), y3VarA.getValue().floatValue()), 0, 8, null), lVarV, Integer.valueOf((i12 << 3) & 112));
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new h(content, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x0180  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void g(androidx.compose.ui.d dVar, float f11, h1 h1Var, l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        float f12;
        h1 h1Var2;
        androidx.compose.ui.d dVar3;
        float fA;
        h1 h1VarF;
        int i14;
        y3<Float> y3VarA;
        boolean z11;
        Object objI;
        float f13;
        h1 h1Var3;
        l lVarV = lVar.v(148599840);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                f12 = f11;
                int i16 = lVarV.q(f12) ? 32 : 16;
                i13 |= i16;
            } else {
                f12 = f11;
            }
            i13 |= i16;
        } else {
            f12 = f11;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                h1Var2 = h1Var;
                int i17 = lVarV.n(h1Var2) ? 256 : 128;
                i13 |= i17;
            } else {
                h1Var2 = h1Var;
            }
            i13 |= i17;
        } else {
            h1Var2 = h1Var;
        }
        if ((i13 & 731) == 146 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
            f13 = f12;
            h1Var3 = h1Var2;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                dVar3 = i15 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
                if ((i12 & 2) != 0) {
                    fA = v1.f75309a.a();
                    i13 &= -113;
                } else {
                    fA = f12;
                }
                if ((i12 & 4) != 0) {
                    h1.Companion companion = h1.INSTANCE;
                    p026y50.d dVar4 = p026y50.d.f125064a;
                    i13 &= -897;
                    h1VarF = h1.Companion.f(companion, v.p(k3.p1.l(dVar4.a(lVarV, 6).getIconWhite()), k3.p1.l(dVar4.a(lVarV, 6).getBorderBrand())), 0L, 2, null);
                }
                lVarV.C();
                if (o.J()) {
                    o.S(148599840, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinner (LoadingContent.kt:119)");
                }
                boolean z12 = false;
                i14 = i13;
                y3VarA = o0.a(o0.c("loading_transition", lVarV, 6, 0), BitmapDescriptorFactory.HUE_RED, 360.0f, p019p1.j.e(p019p1.j.l(1000, 0, f0.d(), 2, null), y0.Restart, 0L, 4, null), "loading_animation", lVarV, n0.f100525f | 25008 | (m0.f100493d << 9), 0);
                lVarV.H(673256763);
                boolean zN = ((((i14 & 112) ^ 48) <= 32 && lVarV.q(fA)) || (i14 & 48) == 32) | lVarV.n(y3VarA);
                if ((((i14 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 && lVarV.n(h1VarF)) || (i14 & KyberEngine.KyberPolyBytes) == 256) {
                }
                z11 = z12 | zN;
                objI = lVarV.I();
                if (z11 || objI == l.INSTANCE.a()) {
                    objI = new i(fA, y3VarA, h1VarF);
                    lVarV.B(objI);
                }
                lVarV.T();
                q1.i.a(dVar3, (wn0.l) objI, lVarV, i14 & 14);
                if (o.J()) {
                    o.R();
                }
                f13 = fA;
                h1Var3 = h1VarF;
            } else {
                lVarV.j();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                dVar3 = dVar2;
                fA = f12;
            }
            h1VarF = h1Var2;
            lVarV.C();
            if (o.J()) {
                o.S(148599840, i13, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinner (LoadingContent.kt:119)");
            }
            boolean z13 = false;
            i14 = i13;
            y3VarA = o0.a(o0.c("loading_transition", lVarV, 6, 0), BitmapDescriptorFactory.HUE_RED, 360.0f, p019p1.j.e(p019p1.j.l(1000, 0, f0.d(), 2, null), y0.Restart, 0L, 4, null), "loading_animation", lVarV, n0.f100525f | 25008 | (m0.f100493d << 9), 0);
            lVarV.H(673256763);
            boolean zN2 = ((((i14 & 112) ^ 48) <= 32 && lVarV.q(fA)) || (i14 & 48) == 32) | lVarV.n(y3VarA);
            z13 = ((i14 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 ? true : true;
            z11 = z13 | zN2;
            objI = lVarV.I();
            if (z11) {
                objI = new i(fA, y3VarA, h1VarF);
                lVarV.B(objI);
            } else {
                objI = new i(fA, y3VarA, h1VarF);
                lVarV.B(objI);
            }
            lVarV.T();
            q1.i.a(dVar3, (wn0.l) objI, lVarV, i14 & 14);
            if (o.J()) {
                o.R();
            }
            f13 = fA;
            h1Var3 = h1VarF;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new j(dVar3, f13, h1Var3, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }
}
