package p021s1;

import androidx.compose.foundation.gestures.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.u;
import p019p1.AnimationState;
import p019p1.h;
import p019p1.j1;
import p019p1.m;
import p019p1.z;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ls1/g;", "Ls1/m;", "Lp1/z;", "", "flingDecay", "Ld3/g;", "motionDurationScale", "<init>", "(Lp1/z;Ld3/g;)V", "Ls1/u;", "initialVelocity", "a", "(Ls1/u;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/z;", DateTokenConverter.CONVERTER_KEY, "()Lp1/z;", "f", "(Lp1/z;)V", "b", "Ld3/g;", "", "c", "I", "e", "()I", "g", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z<Float> flingDecay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d3.g motionDurationScale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {893}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109521n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109522o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109523p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f109524q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f109525r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ u f109526s;

        /* JADX INFO: renamed from: s1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2325a extends u implements l<h<Float, m>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f109527c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u f109528d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ k0 f109529e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f109530f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2325a(k0 k0Var, u uVar, k0 k0Var2, g gVar) {
                super(1);
                this.f109527c = k0Var;
                this.f109528d = uVar;
                this.f109529e = k0Var2;
                this.f109530f = gVar;
            }

            public final void a(h<Float, m> hVar) {
                float fFloatValue = hVar.e().floatValue() - this.f109527c.f86525a;
                float fA = this.f109528d.a(fFloatValue);
                this.f109527c.f86525a = hVar.e().floatValue();
                this.f109529e.f86525a = hVar.f().floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    hVar.a();
                }
                g gVar = this.f109530f;
                gVar.g(gVar.getLastAnimationCycleCount() + 1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(h<Float, m> hVar) {
                a(hVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, g gVar, u uVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f109524q = f11;
            this.f109525r = gVar;
            this.f109526s = uVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f109524q, this.f109525r, this.f109526s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f11;
            AnimationState animationState;
            k0 k0Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109523p;
            if (i11 == 0) {
                t.b(obj);
                if (Math.abs(this.f109524q) > 1.0f) {
                    k0 k0Var2 = new k0();
                    k0Var2.f86525a = this.f109524q;
                    k0 k0Var3 = new k0();
                    AnimationState animationStateC = p019p1.l.c(BitmapDescriptorFactory.HUE_RED, this.f109524q, 0L, 0L, false, 28, null);
                    try {
                        z<Float> zVarD = this.f109525r.d();
                        C2325a c2325a = new C2325a(k0Var3, this.f109526s, k0Var2, this.f109525r);
                        this.f109521n = k0Var2;
                        this.f109522o = animationStateC;
                        this.f109523p = 1;
                        animationState = animationStateC;
                        try {
                            if (j1.h(animationState, zVarD, false, c2325a, this, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            k0Var = k0Var2;
                            f11 = k0Var.f86525a;
                        } catch (CancellationException unused) {
                            k0Var = k0Var2;
                            k0Var.f86525a = ((Number) animationState.p()).floatValue();
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateC;
                    }
                } else {
                    f11 = this.f109524q;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.f109522o;
                k0Var = (k0) this.f109521n;
                try {
                    t.b(obj);
                } catch (CancellationException unused3) {
                    k0Var.f86525a = ((Number) animationState.p()).floatValue();
                }
                f11 = k0Var.f86525a;
            }
            return Boxing.boxFloat(f11);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(z<Float> zVar, d3.g gVar) {
        this.flingDecay = zVar;
        this.motionDurationScale = gVar;
    }

    @Override // p021s1.m
    public Object a(u uVar, float f11, Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new a(f11, this, uVar, null), continuation);
    }

    public final z<Float> d() {
        return this.flingDecay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void f(z<Float> zVar) {
        this.flingDecay = zVar;
    }

    public final void g(int i11) {
        this.lastAnimationCycleCount = i11;
    }

    public /* synthetic */ g(z zVar, d3.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, (i11 & 2) != 0 ? d.e() : gVar);
    }
}
