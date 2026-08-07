package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.h1;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001az\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001at\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001aj\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0080@¢\u0006\u0004\b \u0010!\u001aJ\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000b\"\b\b\u0002\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Lp1/i;", "animationSpec", "Lkotlin/Function2;", "Ljn0/h0;", "block", "b", "(FFFLp1/i;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lp1/q;", "V", "Lp1/p1;", "typeConverter", DateTokenConverter.CONVERTER_KEY, "(Lp1/p1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/i;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/k;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lp1/h;", IntegerTokenConverter.CONVERTER_KEY, "(Lp1/k;Ljava/lang/Object;Lp1/i;ZLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/z;", "g", "(Lp1/k;Lp1/z;ZLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/d;", "animation", "", "startTimeNanos", "c", "(Lp1/k;Lp1/d;JLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "onFrame", "k", "(Lp1/d;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "o", "(Lp1/h;Lp1/k;)V", "frameTimeNanos", "durationScale", "anim", "m", "(Lp1/h;JFLp1/d;Lp1/k;Lwn0/l;)V", "playTimeNanos", "l", "(Lp1/h;JJLp1/d;Lp1/k;Lwn0/l;)V", "Lkotlin/coroutines/CoroutineContext;", "n", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lp1/h;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    static final class a<T, V> extends u implements l<p019p1.h<T, V>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T, T, h0> f100391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<T, V> f100392d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super T, ? super T, h0> pVar, p1<T, V> p1Var) {
            super(1);
            this.f100391c = pVar;
            this.f100392d = p1Var;
        }

        public final void a(p019p1.h<T, V> hVar) {
            this.f100391c.invoke(hVar.e(), this.f100392d.b().invoke(hVar.g()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            a((p019p1.h) obj);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class b<T, V extends q> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100393n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f100394o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f100395p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f100396q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f100397r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f100398s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f100397r = obj;
            this.f100398s |= Integer.MIN_VALUE;
            return j1.c(null, null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lp1/q;", "V", "", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<p019p1.h<T, V>> f100400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f100401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p019p1.d<T, V> f100402e;

        /* JADX INFO: Incorrect field signature: TV; */
        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f100403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f100404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f100405h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ l<p019p1.h<T, V>, h0> f100406i;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f100407c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AnimationState<T, V> animationState) {
                super(0);
                this.f100407c = animationState;
            }

            public final void b() {
                this.f100407c.C(false);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/n0<Lp1/h<TT;TV;>;>;TT;Lp1/d<TT;TV;>;TV;Lp1/k<TT;TV;>;FLwn0/l<-Lp1/h<TT;TV;>;Ljn0/h0;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(n0 n0Var, Object obj, p019p1.d dVar, q qVar, AnimationState animationState, float f11, l lVar) {
            super(1);
            this.f100400c = n0Var;
            this.f100401d = obj;
            this.f100402e = dVar;
            this.f100403f = qVar;
            this.f100404g = animationState;
            this.f100405h = f11;
            this.f100406i = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, p1.h] */
        public final void a(long j11) {
            n0<p019p1.h<T, V>> n0Var = this.f100400c;
            ?? hVar = new p019p1.h(this.f100401d, this.f100402e.d(), this.f100403f, j11, this.f100402e.f(), j11, true, new a(this.f100404g));
            j1.m(hVar, j11, this.f100405h, this.f100402e, this.f100404g, this.f100406i);
            n0Var.f86529a = hVar;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f100408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AnimationState<T, V> animationState) {
            super(0);
            this.f100408c = animationState;
        }

        public final void b() {
            this.f100408c.C(false);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lp1/q;", "V", "", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<p019p1.h<T, V>> f100409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f100410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p019p1.d<T, V> f100411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f100412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<p019p1.h<T, V>, h0> f100413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(n0<p019p1.h<T, V>> n0Var, float f11, p019p1.d<T, V> dVar, AnimationState<T, V> animationState, l<? super p019p1.h<T, V>, h0> lVar) {
            super(1);
            this.f100409c = n0Var;
            this.f100410d = f11;
            this.f100411e = dVar;
            this.f100412f = animationState;
            this.f100413g = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j11) {
            T t11 = this.f100409c.f86529a;
            s.h(t11);
            j1.m((p019p1.h) t11, j11, this.f100410d, this.f100411e, this.f100412f, this.f100413g);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lp1/q;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class i<R> extends u implements l<Long, R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Long, R> f100416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(l<? super Long, ? extends R> lVar) {
            super(1);
            this.f100416c = lVar;
        }

        public final R a(long j11) {
            return this.f100416c.invoke(Long.valueOf(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    public static final Object b(float f11, float f12, float f13, p019p1.i<Float> iVar, p<? super Float, ? super Float, h0> pVar, Continuation<? super h0> continuation) {
        Object objD = d(r1.e(p013kotlin.jvm.internal.l.f86526a), Boxing.boxFloat(f11), Boxing.boxFloat(f12), Boxing.boxFloat(f13), iVar, pVar, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, p1.h] */
    public static final <T, V extends q> Object c(AnimationState<T, V> animationState, p019p1.d<T, V> dVar, long j11, l<? super p019p1.h<T, V>, h0> lVar, Continuation<? super h0> continuation) {
        b bVar;
        n0 n0Var;
        AnimationState<T, V> animationState2;
        AnimationState<T, V> animationState3;
        n0 n0Var2;
        l<? super p019p1.h<T, V>, h0> lVar2;
        p019p1.h hVar;
        p019p1.h hVar2;
        f fVar;
        p019p1.d<T, V> dVar2 = dVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f100398s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f100398s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f100397r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f100398s;
        if (i12 == 0) {
            t.b(obj);
            T tE = dVar2.e(0L);
            q qVarG = dVar2.g(0L);
            n0Var = new n0();
            if (j11 == Long.MIN_VALUE) {
                try {
                    animationState2 = animationState;
                    try {
                        d dVar3 = new d(n0Var, tE, dVar2, qVarG, animationState2, n(bVar2.getContext()), lVar);
                        n0Var2 = n0Var;
                        try {
                            bVar2.f100393n = animationState2;
                            bVar2.f100394o = dVar2;
                            bVar2.f100395p = lVar;
                            bVar2.f100396q = n0Var2;
                            bVar2.f100398s = 1;
                            if (k(dVar2, dVar3, bVar2) != coroutine_suspended) {
                                animationState3 = animationState2;
                                lVar2 = lVar;
                                n0Var = n0Var2;
                            }
                            return coroutine_suspended;
                        } catch (CancellationException e11) {
                            e = e11;
                            animationState3 = animationState2;
                            n0Var = n0Var2;
                            hVar = (p019p1.h) n0Var.f86529a;
                            if (hVar != null) {
                                hVar.k(false);
                            }
                            hVar2 = (p019p1.h) n0Var.f86529a;
                            if (hVar2 != null && hVar2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                                animationState3.C(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e12) {
                        e = e12;
                        animationState3 = animationState2;
                        hVar = (p019p1.h) n0Var.f86529a;
                        if (hVar != null) {
                            hVar.k(false);
                        }
                        hVar2 = (p019p1.h) n0Var.f86529a;
                        if (hVar2 != null) {
                            animationState3.C(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e13) {
                    e = e13;
                    animationState2 = animationState;
                }
            } else {
                n0Var2 = n0Var;
                try {
                    ?? r12 = (T) new p019p1.h(tE, dVar2.d(), qVarG, j11, dVar2.f(), j11, true, new e(animationState));
                    m(r12, j11, n(bVar2.getContext()), dVar2, animationState, lVar);
                    n0Var2.f86529a = r12;
                    animationState3 = animationState;
                    dVar2 = dVar;
                    lVar2 = lVar;
                    n0Var = n0Var2;
                } catch (CancellationException e14) {
                    e = e14;
                    animationState3 = animationState;
                    n0Var = n0Var2;
                    hVar = (p019p1.h) n0Var.f86529a;
                    if (hVar != null) {
                        hVar.k(false);
                    }
                    hVar2 = (p019p1.h) n0Var.f86529a;
                    if (hVar2 != null) {
                        animationState3.C(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) bVar2.f100396q;
            lVar2 = (l) bVar2.f100395p;
            dVar2 = (p019p1.d) bVar2.f100394o;
            animationState3 = (AnimationState) bVar2.f100393n;
            try {
                t.b(obj);
            } catch (CancellationException e15) {
                e = e15;
                hVar = (p019p1.h) n0Var.f86529a;
                if (hVar != null) {
                    hVar.k(false);
                }
                hVar2 = (p019p1.h) n0Var.f86529a;
                if (hVar2 != null) {
                    animationState3.C(false);
                }
                throw e;
            }
        }
        do {
            T t11 = n0Var.f86529a;
            s.h(t11);
            if (!((p019p1.h) t11).h()) {
                return h0.f84049a;
            }
            n0 n0Var3 = n0Var;
            l<? super p019p1.h<T, V>, h0> lVar3 = lVar2;
            p019p1.d<T, V> dVar4 = dVar2;
            AnimationState<T, V> animationState4 = animationState3;
            try {
                fVar = new f(n0Var3, n(bVar2.getContext()), dVar4, animationState4, lVar3);
                n0Var = n0Var3;
                dVar2 = dVar4;
                animationState3 = animationState4;
                lVar2 = lVar3;
                bVar2.f100393n = animationState3;
                bVar2.f100394o = dVar2;
                bVar2.f100395p = lVar2;
                bVar2.f100396q = n0Var;
                bVar2.f100398s = 2;
            } catch (CancellationException e16) {
                e = e16;
                n0Var = n0Var3;
                animationState3 = animationState4;
                hVar = (p019p1.h) n0Var.f86529a;
                if (hVar != null) {
                    hVar.k(false);
                }
                hVar2 = (p019p1.h) n0Var.f86529a;
                if (hVar2 != null) {
                    animationState3.C(false);
                }
                throw e;
            }
        } while (k(dVar2, fVar, bVar2) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static final <T, V extends q> Object d(p1<T, V> p1Var, T t11, T t12, T t13, p019p1.i<T> iVar, p<? super T, ? super T, h0> pVar, Continuation<? super h0> continuation) {
        V vG;
        if (t13 == null || (vG = p1Var.a().invoke(t13)) == null) {
            vG = r.g(p1Var.a().invoke(t11));
        }
        q qVar = vG;
        Object objF = f(new AnimationState(p1Var, t11, qVar, 0L, 0L, false, 56, null), new k1(iVar, p1Var, t11, t12, qVar), 0L, new a(pVar, p1Var), continuation, 2, null);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
    }

    public static /* synthetic */ Object e(float f11, float f12, float f13, p019p1.i iVar, p pVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            iVar = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return b(f11, f12, f13, iVar, pVar, continuation);
    }

    public static /* synthetic */ Object f(AnimationState animationState, p019p1.d dVar, long j11, l lVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Long.MIN_VALUE;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            lVar = c.f100399c;
        }
        return c(animationState, dVar, j12, lVar, continuation);
    }

    public static final <T, V extends q> Object g(AnimationState<T, V> animationState, z<T> zVar, boolean z11, l<? super p019p1.h<T, V>, h0> lVar, Continuation<? super h0> continuation) {
        Object objC = c(animationState, new y(zVar, animationState.o(), animationState.getValue(), animationState.q()), z11 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    public static /* synthetic */ Object h(AnimationState animationState, z zVar, boolean z11, l lVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            lVar = g.f100414c;
        }
        return g(animationState, zVar, z11, lVar, continuation);
    }

    public static final <T, V extends q> Object i(AnimationState<T, V> animationState, T t11, p019p1.i<T> iVar, boolean z11, l<? super p019p1.h<T, V>, h0> lVar, Continuation<? super h0> continuation) {
        Object objC = c(animationState, new k1(iVar, animationState.o(), animationState.getValue(), t11, animationState.q()), z11 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    public static /* synthetic */ Object j(AnimationState animationState, Object obj, p019p1.i iVar, boolean z11, l lVar, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            iVar = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        p019p1.i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            lVar = h.f100415c;
        }
        return i(animationState, obj, iVar2, z12, lVar, continuation);
    }

    private static final <R, T, V extends q> Object k(p019p1.d<T, V> dVar, l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        return dVar.getIsInfinite() ? l0.a(lVar, continuation) : h1.c(new i(lVar), continuation);
    }

    private static final <T, V extends q> void l(p019p1.h<T, V> hVar, long j11, long j12, p019p1.d<T, V> dVar, AnimationState<T, V> animationState, l<? super p019p1.h<T, V>, h0> lVar) {
        hVar.j(j11);
        hVar.l(dVar.e(j12));
        hVar.m(dVar.g(j12));
        if (dVar.b(j12)) {
            hVar.i(hVar.getLastFrameTimeNanos());
            hVar.k(false);
        }
        o(hVar, animationState);
        lVar.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> void m(p019p1.h<T, V> hVar, long j11, float f11, p019p1.d<T, V> dVar, AnimationState<T, V> animationState, l<? super p019p1.h<T, V>, h0> lVar) {
        l(hVar, j11, f11 == BitmapDescriptorFactory.HUE_RED ? dVar.getDurationNanos() : (long) ((j11 - hVar.getStartTimeNanos()) / f11), dVar, animationState, lVar);
    }

    public static final float n(CoroutineContext coroutineContext) {
        d3.g gVar = (d3.g) coroutineContext.get(d3.g.INSTANCE);
        float fT = gVar != null ? gVar.t() : 1.0f;
        if (!(fT >= BitmapDescriptorFactory.HUE_RED)) {
            x0.b("negative scale factor");
        }
        return fT;
    }

    public static final <T, V extends q> void o(p019p1.h<T, V> hVar, AnimationState<T, V> animationState) {
        animationState.D(hVar.e());
        r.f(animationState.q(), hVar.g());
        animationState.u(hVar.getFinishedTimeNanos());
        animationState.B(hVar.getLastFrameTimeNanos());
        animationState.C(hVar.h());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lp1/h;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f100399c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p019p1.h) obj);
            return h0.f84049a;
        }

        public final void a(p019p1.h hVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lp1/h;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g extends u implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f100414c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p019p1.h) obj);
            return h0.f84049a;
        }

        public final void a(p019p1.h hVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lp1/h;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h extends u implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f100415c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p019p1.h) obj);
            return h0.f84049a;
        }

        public final void a(p019p1.h hVar) {
        }
    }
}
