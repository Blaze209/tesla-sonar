package t1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.u;
import p019p1.AnimationState;
import p019p1.j1;
import p019p1.m;
import p019p1.z;
import p021s1.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a^\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001af\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\"\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lt1/i;", "snapLayoutInfoProvider", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "snapAnimationSpec", "Ls1/b0;", "l", "(Lt1/i;Lp1/z;Lp1/i;)Ls1/b0;", "Ls1/u;", "initialTargetOffset", "initialVelocity", "Lt1/b;", "Lp1/m;", "animation", "Lkotlin/Function1;", "Ljn0/h0;", "onAnimationStep", "Lt1/a;", IntegerTokenConverter.CONVERTER_KEY, "(Ls1/u;FFLt1/b;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetOffset", "Lp1/k;", "animationState", "f", "(Ls1/u;FLp1/k;Lp1/z;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "h", "(Ls1/u;FFLp1/k;Lp1/i;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "j", "(FF)F", "Lw4/h;", "a", Gender.FEMALE, "k", "()F", "MinFlingVelocityDp", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f112058a = w4.h.g(400);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {334}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f112059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f112062q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f112063r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112062q = obj;
            this.f112063r |= Integer.MIN_VALUE;
            return h.f(null, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<p019p1.h<Float, m>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f112064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f112065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p021s1.u f112066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<Float, h0> f112067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f11, k0 k0Var, p021s1.u uVar, wn0.l<? super Float, h0> lVar) {
            super(1);
            this.f112064c = f11;
            this.f112065d = k0Var;
            this.f112066e = uVar;
            this.f112067f = lVar;
        }

        public final void a(p019p1.h<Float, m> hVar) {
            if (Math.abs(hVar.e().floatValue()) < Math.abs(this.f112064c)) {
                h.g(hVar, this.f112066e, this.f112067f, hVar.e().floatValue() - this.f112065d.f86525a);
                this.f112065d.f86525a = hVar.e().floatValue();
                return;
            }
            float fJ = h.j(hVar.e().floatValue(), this.f112064c);
            h.g(hVar, this.f112066e, this.f112067f, fJ - this.f112065d.f86525a);
            hVar.a();
            this.f112065d.f86525a = fJ;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, m> hVar) {
            a(hVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {379}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f112068n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f112069o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112070p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112071q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f112072r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f112073s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112072r = obj;
            this.f112073s |= Integer.MIN_VALUE;
            return h.h(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<p019p1.h<Float, m>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f112074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f112075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p021s1.u f112076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<Float, h0> f112077f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f11, k0 k0Var, p021s1.u uVar, wn0.l<? super Float, h0> lVar) {
            super(1);
            this.f112074c = f11;
            this.f112075d = k0Var;
            this.f112076e = uVar;
            this.f112077f = lVar;
        }

        public final void a(p019p1.h<Float, m> hVar) {
            float fJ = h.j(hVar.e().floatValue(), this.f112074c);
            float f11 = fJ - this.f112075d.f86525a;
            float fA = this.f112076e.a(f11);
            this.f112077f.invoke(Float.valueOf(fA));
            if (Math.abs(f11 - fA) > 0.5f || fJ != hVar.e().floatValue()) {
                hVar.a();
            }
            this.f112075d.f86525a += fA;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, m> hVar) {
            a(hVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(p021s1.u uVar, float f11, AnimationState<Float, m> animationState, z<Float> zVar, wn0.l<? super Float, h0> lVar, Continuation<? super t1.a<Float, m>> continuation) {
        a aVar;
        k0 k0Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f112063r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f112063r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f112062q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f112063r;
        if (i12 == 0) {
            t.b(obj);
            k0 k0Var2 = new k0();
            boolean z11 = animationState.p().floatValue() == BitmapDescriptorFactory.HUE_RED;
            b bVar = new b(f11, k0Var2, uVar, lVar);
            aVar.f112060o = animationState;
            aVar.f112061p = k0Var2;
            aVar.f112059n = f11;
            aVar.f112063r = 1;
            if (j1.g(animationState, zVar, !z11, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            k0Var = k0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f11 = aVar.f112059n;
            k0Var = (k0) aVar.f112061p;
            animationState = (AnimationState) aVar.f112060o;
            t.b(obj);
        }
        return new t1.a(Boxing.boxFloat(f11 - k0Var.f86525a), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p019p1.h<Float, m> hVar, p021s1.u uVar, wn0.l<? super Float, h0> lVar, float f11) {
        float fA = uVar.a(f11);
        lVar.invoke(Float.valueOf(fA));
        if (Math.abs(f11 - fA) > 0.5f) {
            hVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object h(p021s1.u uVar, float f11, float f12, AnimationState<Float, m> animationState, p019p1.i<Float> iVar, wn0.l<? super Float, h0> lVar, Continuation<? super t1.a<Float, m>> continuation) {
        c cVar;
        float f13;
        AnimationState<Float, m> animationState2;
        k0 k0Var;
        float f14;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f112073s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f112073s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f112072r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f112073s;
        if (i12 == 0) {
            t.b(obj);
            k0 k0Var2 = new k0();
            float fFloatValue = animationState.p().floatValue();
            Float fBoxFloat = Boxing.boxFloat(f11);
            boolean z11 = animationState.p().floatValue() == BitmapDescriptorFactory.HUE_RED;
            d dVar = new d(f12, k0Var2, uVar, lVar);
            cVar2.f112070p = animationState;
            cVar2.f112071q = k0Var2;
            f13 = f11;
            cVar2.f112068n = f13;
            cVar2.f112069o = fFloatValue;
            cVar2.f112073s = 1;
            if (j1.i(animationState, fBoxFloat, iVar, !z11, dVar, cVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            animationState2 = animationState;
            k0Var = k0Var2;
            f14 = fFloatValue;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f14 = cVar2.f112069o;
            float f15 = cVar2.f112068n;
            k0Var = (k0) cVar2.f112071q;
            AnimationState<Float, m> animationState3 = (AnimationState) cVar2.f112070p;
            t.b(obj);
            f13 = f15;
            animationState2 = animationState3;
        }
        return new t1.a(Boxing.boxFloat(f13 - k0Var.f86525a), p019p1.l.g(animationState2, BitmapDescriptorFactory.HUE_RED, j(animationState2.p().floatValue(), f14), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(p021s1.u uVar, float f11, float f12, t1.b<Float, m> bVar, wn0.l<? super Float, h0> lVar, Continuation<? super t1.a<Float, m>> continuation) {
        return bVar.a(uVar, Boxing.boxFloat(f11), Boxing.boxFloat(f12), lVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f11, float f12) {
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return f12 > BitmapDescriptorFactory.HUE_RED ? n.i(f11, f12) : n.e(f11, f12);
    }

    public static final float k() {
        return f112058a;
    }

    public static final b0 l(i iVar, z<Float> zVar, p019p1.i<Float> iVar2) {
        return new g(iVar, zVar, iVar2);
    }
}
