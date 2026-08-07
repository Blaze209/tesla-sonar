package androidx.compose.foundation.gestures;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.g;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p019p1.j1;
import p021s1.m;
import p021s1.o;
import p021s1.u;
import p021s1.x;
import p021s1.z;
import q1.n0;
import v3.PointerInputChange;
import v3.k0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001(\u001aO\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/ui/d;", "Ls1/x;", "state", "Ls1/p;", "orientation", "", "enabled", "reverseDirection", "Ls1/m;", "flingBehavior", "Lu1/l;", "interactionSource", "g", "(Landroidx/compose/ui/d;Ls1/x;Ls1/p;ZZLs1/m;Lu1/l;)Landroidx/compose/ui/d;", "Lq1/n0;", "overscrollEffect", "Ls1/d;", "bringIntoViewSpec", "f", "(Landroidx/compose/ui/d;Ls1/x;Ls1/p;Lq1/n0;ZZLs1/m;Lu1/l;Ls1/d;)Landroidx/compose/ui/d;", "Ls1/z;", "Lj3/g;", "offset", "j", "(Ls1/z;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lv3/x;", "a", "Lwn0/l;", "CanDragCalculation", "Ls1/u;", "b", "Ls1/u;", "NoOpScrollScope", "Ld3/g;", "c", "Ld3/g;", "e", "()Ld3/g;", "DefaultScrollMotionDurationScale", "androidx/compose/foundation/gestures/d$d", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/foundation/gestures/d$d;", "UnityDensity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<PointerInputChange, Boolean> f4396a = a.f4400c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u f4397b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f4398c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0096d f4399d = new C0096d();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "change", "", "a", "(Lv3/x;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements l<PointerInputChange, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4400c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!k0.g(pointerInputChange.getType(), k0.INSTANCE.b()));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/d$b", "Ld3/g;", "", "t", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements g {
        b() {
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public <R> R fold(R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
            return (R) g.a.a(this, r11, pVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) g.a.b(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return g.a.c(this, key);
        }

        @Override // p013kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return g.a.d(this, coroutineContext);
        }

        @Override // d3.g
        public float t() {
            return 1.0f;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/d$c", "Ls1/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements u {
        c() {
        }

        @Override // p021s1.u
        public float a(float pixels) {
            return pixels;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/d$d", "Lw4/d;", "", "getDensity", "()F", "density", "M1", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0096d implements w4.d {
        C0096d() {
        }

        @Override // w4.l
        /* JADX INFO: renamed from: M1 */
        public float getFontScale() {
            return 1.0f;
        }

        @Override // w4.d
        public float getDensity() {
            return 1.0f;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0, 0}, l = {966}, m = "semanticsScrollBy-d-4ec7I", n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, s = {"L$0", "L$1"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4401n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4402o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f4403p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4404q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4403p = obj;
            this.f4404q |= Integer.MIN_VALUE;
            return d.j(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {967}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4405n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4406o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ z f4407p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f4408q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.k0 f4409r;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements p<Float, Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.k0 f4410c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ z f4411d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ o f4412e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p013kotlin.jvm.internal.k0 k0Var, z zVar, o oVar) {
                super(2);
                this.f4410c = k0Var;
                this.f4411d = zVar;
                this.f4412e = oVar;
            }

            public final void a(float f11, float f12) {
                float f13 = f11 - this.f4410c.f86525a;
                z zVar = this.f4411d;
                this.f4410c.f86525a += zVar.t(zVar.A(this.f4412e.b(zVar.B(zVar.t(f13)), u3.e.INSTANCE.c())));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Float f11, Float f12) {
                a(f11.floatValue(), f12.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z zVar, long j11, p013kotlin.jvm.internal.k0 k0Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f4407p = zVar;
            this.f4408q = j11;
            this.f4409r = k0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o oVar, Continuation<? super h0> continuation) {
            return ((f) create(oVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f4407p, this.f4408q, this.f4409r, continuation);
            fVar.f4406o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4405n;
            if (i11 == 0) {
                t.b(obj);
                o oVar = (o) this.f4406o;
                float fA = this.f4407p.A(this.f4408q);
                a aVar = new a(this.f4409r, this.f4407p, oVar);
                this.f4405n = 1;
                if (j1.e(BitmapDescriptorFactory.HUE_RED, fA, BitmapDescriptorFactory.HUE_RED, null, aVar, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    public static final g e() {
        return f4398c;
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, x xVar, p021s1.p pVar, n0 n0Var, boolean z11, boolean z12, m mVar, u1.l lVar, p021s1.d dVar2) {
        return dVar.g(new ScrollableElement(xVar, pVar, n0Var, z11, z12, mVar, lVar, dVar2));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, x xVar, p021s1.p pVar, boolean z11, boolean z12, m mVar, u1.l lVar) {
        return h(dVar, xVar, pVar, null, z11, z12, mVar, lVar, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, x xVar, p021s1.p pVar, n0 n0Var, boolean z11, boolean z12, m mVar, u1.l lVar, p021s1.d dVar2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return f(dVar, xVar, pVar, n0Var, z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : mVar, (i11 & 64) != 0 ? null : lVar, (i11 & 128) != 0 ? null : dVar2);
    }

    public static /* synthetic */ androidx.compose.ui.d i(androidx.compose.ui.d dVar, x xVar, p021s1.p pVar, boolean z11, boolean z12, m mVar, u1.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return g(dVar, xVar, pVar, z13, z12, (i11 & 16) != 0 ? null : mVar, (i11 & 32) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(z zVar, long j11, Continuation<? super j3.g> continuation) {
        e eVar;
        p013kotlin.jvm.internal.k0 k0Var;
        z zVar2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f4404q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f4404q = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f4403p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f4404q;
        if (i12 == 0) {
            t.b(obj);
            k0Var = new p013kotlin.jvm.internal.k0();
            q1.h0 h0Var = q1.h0.Default;
            f fVar = new f(zVar, j11, k0Var, null);
            eVar.f4401n = zVar;
            eVar.f4402o = k0Var;
            eVar.f4404q = 1;
            if (zVar.v(h0Var, fVar, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zVar2 = zVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p013kotlin.jvm.internal.k0 k0Var2 = (p013kotlin.jvm.internal.k0) eVar.f4402o;
            z zVar3 = (z) eVar.f4401n;
            t.b(obj);
            k0Var = k0Var2;
            zVar2 = zVar3;
        }
        return j3.g.d(zVar2.B(k0Var.f86525a));
    }
}
