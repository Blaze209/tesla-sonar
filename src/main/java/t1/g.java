package t1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.s;
import p019p1.AnimationState;
import p019p1.m;
import p019p1.z;
import p021s1.b0;
import p021s1.u;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010!\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010$\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Lt1/g;", "Ls1/b0;", "Lt1/i;", "snapLayoutInfoProvider", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "snapAnimationSpec", "<init>", "(Lt1/i;Lp1/z;Lp1/i;)V", "Ls1/u;", "initialVelocity", "Lkotlin/Function1;", "Ljn0/h0;", "onRemainingScrollOffsetUpdate", "Lt1/a;", "Lp1/m;", IntegerTokenConverter.CONVERTER_KEY, "(Ls1/u;FLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Lp1/k;", "l", "(Ls1/u;FFLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialTargetOffset", "onAnimationStep", "k", "", "j", "(FF)Z", "onRemainingDistanceUpdated", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lt1/i;", "Lp1/z;", "c", "Lp1/i;", "Ld3/g;", DateTokenConverter.CONVERTER_KEY, "Ld3/g;", "getMotionScaleDuration$foundation_release", "()Ld3/g;", "setMotionScaleDuration$foundation_release", "(Ld3/g;)V", "motionScaleDuration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i snapLayoutInfoProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p019p1.i<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d3.g motionScaleDuration = androidx.compose.foundation.gestures.d.e();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {123}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112038n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112039o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112041q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112039o = obj;
            this.f112041q |= Integer.MIN_VALUE;
            return g.this.i(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lt1/a;", "", "Lp1/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lt1/a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {142, 161}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super t1.a<Float, m>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112042n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f112043o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f112045q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.l<Float, h0> f112046r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ u f112047s;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Ljn0/h0;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f112048c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<Float, h0> f112049d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(k0 k0Var, wn0.l<? super Float, h0> lVar) {
                super(1);
                this.f112048c = k0Var;
                this.f112049d = lVar;
            }

            public final void a(float f11) {
                k0 k0Var = this.f112048c;
                float f12 = k0Var.f86525a - f11;
                k0Var.f86525a = f12;
                this.f112049d.invoke(Float.valueOf(f12));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Float f11) {
                a(f11.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: t1.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Ljn0/h0;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        static final class C2389b extends p013kotlin.jvm.internal.u implements wn0.l<Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f112050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<Float, h0> f112051d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2389b(k0 k0Var, wn0.l<? super Float, h0> lVar) {
                super(1);
                this.f112050c = k0Var;
                this.f112051d = lVar;
            }

            public final void a(float f11) {
                k0 k0Var = this.f112050c;
                float f12 = k0Var.f86525a - f11;
                k0Var.f86525a = f12;
                this.f112051d.invoke(Float.valueOf(f12));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Float f11) {
                a(f11.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f11, wn0.l<? super Float, h0> lVar, u uVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f112045q = f11;
            this.f112046r = lVar;
            this.f112047s = uVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new b(this.f112045q, this.f112046r, this.f112047s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            Object objL;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f112043o;
            if (i11 == 0) {
                t.b(obj);
                float fB = g.this.snapLayoutInfoProvider.b(this.f112045q, p019p1.b0.a(g.this.decayAnimationSpec, BitmapDescriptorFactory.HUE_RED, this.f112045q));
                if (Float.isNaN(fB)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                k0Var = new k0();
                float fAbs = Math.abs(fB) * Math.signum(this.f112045q);
                k0Var.f86525a = fAbs;
                this.f112046r.invoke(Boxing.boxFloat(fAbs));
                g gVar = g.this;
                u uVar = this.f112047s;
                float f11 = k0Var.f86525a;
                float f12 = this.f112045q;
                C2389b c2389b = new C2389b(k0Var, this.f112046r);
                this.f112042n = k0Var;
                this.f112043o = 1;
                objL = gVar.l(uVar, f11, f12, c2389b, this);
                if (objL != coroutine_suspended) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            k0 k0Var2 = (k0) this.f112042n;
            t.b(obj);
            k0Var = k0Var2;
            objL = obj;
            AnimationState animationState = (AnimationState) objL;
            float fA = g.this.snapLayoutInfoProvider.a(((Number) animationState.p()).floatValue());
            if (Float.isNaN(fA)) {
                throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            k0Var.f86525a = fA;
            u uVar2 = this.f112047s;
            AnimationState animationStateG = p019p1.l.g(animationState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, 30, null);
            p019p1.i iVar = g.this.snapAnimationSpec;
            a aVar = new a(k0Var, this.f112046r);
            this.f112042n = null;
            this.f112043o = 2;
            Object objH = h.h(uVar2, fA, fA, animationStateG, iVar, aVar, this);
            return objH == coroutine_suspended ? coroutine_suspended : objH;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super t1.a<Float, m>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {110}, m = "performFling", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112052n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112054p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112052n = obj;
            this.f112054p |= Integer.MIN_VALUE;
            return g.this.b(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {187}, m = "tryApproach", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112055n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112057p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112055n = obj;
            this.f112057p |= Integer.MIN_VALUE;
            return g.this.l(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    public g(i iVar, z<Float> zVar, p019p1.i<Float> iVar2) {
        this.snapLayoutInfoProvider = iVar;
        this.decayAnimationSpec = zVar;
        this.snapAnimationSpec = iVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(u uVar, float f11, wn0.l<? super Float, h0> lVar, Continuation<? super t1.a<Float, m>> continuation) {
        a aVar;
        wn0.l<? super Float, h0> lVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f112041q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f112041q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f112039o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f112041q;
        if (i12 == 0) {
            t.b(objWithContext);
            d3.g gVar = this.motionScaleDuration;
            b bVar = new b(f11, lVar, uVar, null);
            aVar.f112038n = lVar;
            aVar.f112041q = 1;
            objWithContext = BuildersKt.withContext(gVar, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar2 = lVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = (wn0.l) aVar.f112038n;
            t.b(objWithContext);
        }
        t1.a aVar2 = (t1.a) objWithContext;
        lVar2.invoke(Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED));
        return aVar2;
    }

    private final boolean j(float offset, float velocity) {
        return Math.abs(p019p1.b0.a(this.decayAnimationSpec, BitmapDescriptorFactory.HUE_RED, velocity)) >= Math.abs(offset);
    }

    private final Object k(u uVar, float f11, float f12, wn0.l<? super Float, h0> lVar, Continuation<? super t1.a<Float, m>> continuation) {
        return h.i(uVar, f11, f12, j(f11, f12) ? new t1.c(this.decayAnimationSpec) : new l(this.snapAnimationSpec), lVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object l(u uVar, float f11, float f12, wn0.l<? super Float, h0> lVar, Continuation<? super AnimationState<Float, m>> continuation) {
        d dVar;
        g gVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f112057p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f112057p = i11 - Integer.MIN_VALUE;
                gVar = this;
            } else {
                gVar = this;
                dVar = gVar.new d(continuation);
            }
        } else {
            gVar = this;
            dVar = gVar.new d(continuation);
        }
        d dVar2 = dVar;
        Object objK = dVar2.f112055n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar2.f112057p;
        if (i12 == 0) {
            t.b(objK);
            if (Math.abs(f11) == BitmapDescriptorFactory.HUE_RED || Math.abs(f12) == BitmapDescriptorFactory.HUE_RED) {
                return p019p1.l.c(f11, f12, 0L, 0L, false, 28, null);
            }
            dVar2.f112057p = 1;
            objK = gVar.k(uVar, f11, f12, lVar, dVar2);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objK);
        }
        return ((t1.a) objK).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p021s1.b0
    public Object b(u uVar, float f11, wn0.l<? super Float, h0> lVar, Continuation<? super Float> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f112054p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f112054p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objI = cVar.f112052n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f112054p;
        if (i12 == 0) {
            t.b(objI);
            cVar.f112054p = 1;
            objI = i(uVar, f11, lVar, cVar);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objI);
        }
        t1.a aVar = (t1.a) objI;
        float fFloatValue = ((Number) aVar.a()).floatValue();
        AnimationState animationStateB = aVar.b();
        float fFloatValue2 = BitmapDescriptorFactory.HUE_RED;
        if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
            fFloatValue2 = ((Number) animationStateB.p()).floatValue();
        }
        return Boxing.boxFloat(fFloatValue2);
    }

    public boolean equals(Object other) {
        if (other instanceof g) {
            g gVar = (g) other;
            if (s.f(gVar.snapAnimationSpec, this.snapAnimationSpec) && s.f(gVar.decayAnimationSpec, this.decayAnimationSpec) && s.f(gVar.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
