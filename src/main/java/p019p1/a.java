package p019p1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.q;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u000f\u001a\u00028\u00002\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u001b\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u0012\u0004\bM\u0010\u001aR\u001a\u0010P\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u0010L\u0012\u0004\bO\u0010\u001aR\u0016\u0010Q\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010LR\u0011\u0010\u0016\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010AR\u0011\u0010V\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Y"}, d2 = {"Lp1/a;", "T", "Lp1/q;", "V", "", "initialValue", "Lp1/p1;", "typeConverter", "visibilityThreshold", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/Object;Lp1/p1;Ljava/lang/Object;Ljava/lang/String;)V", "Lp1/d;", "animation", "initialVelocity", "Lkotlin/Function1;", "Ljn0/h0;", "block", "Lp1/g;", "q", "(Lp1/d;Ljava/lang/Object;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "()V", "targetValue", "Lp1/i;", "animationSpec", "e", "(Ljava/lang/Object;Lp1/i;Ljava/lang/Object;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr2/y3;", "g", "()Lr2/y3;", "a", "Lp1/p1;", "l", "()Lp1/p1;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lp1/k;", DateTokenConverter.CONVERTER_KEY, "Lp1/k;", "j", "()Lp1/k;", "internalState", "", "<set-?>", "Lr2/p1;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Lp1/w0;", "Lp1/w0;", "mutatorMutex", "Lp1/e1;", "Lp1/e1;", "getDefaultSpringSpec$animation_core_release", "()Lp1/e1;", "defaultSpringSpec", "Lp1/q;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lp1/q;", "velocityVector", "n", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 isRunning;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 targetValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w0 mutatorMutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e1<T> defaultSpringSpec;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final V negativeInfinityBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lowerBoundVector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V upperBoundVector;

    /* JADX INFO: renamed from: p1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Lp1/g;", "<anonymous>", "()Lp1/g;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
    static final class C2128a extends SuspendLambda implements l<Continuation<? super AnimationResult<T, V>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100277n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f100278o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f100279p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a<T, V> f100280q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ T f100281r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d<T, V> f100282s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f100283t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ l<a<T, V>, h0> f100284u;

        /* JADX INFO: renamed from: p1.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lp1/h;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2129a extends u implements l<h<T, V>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<T, V> f100285c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f100286d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l<a<T, V>, h0> f100287e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ j0 f100288f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2129a(a<T, V> aVar, AnimationState<T, V> animationState, l<? super a<T, V>, h0> lVar, j0 j0Var) {
                super(1);
                this.f100285c = aVar;
                this.f100286d = animationState;
                this.f100287e = lVar;
                this.f100288f = j0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(h<T, V> hVar) {
                j1.o(hVar, this.f100285c.j());
                Object objH = this.f100285c.h(hVar.e());
                if (s.f(objH, hVar.e())) {
                    l<a<T, V>, h0> lVar = this.f100287e;
                    if (lVar != null) {
                        lVar.invoke(this.f100285c);
                        return;
                    }
                    return;
                }
                this.f100285c.j().D(objH);
                this.f100286d.D((T) objH);
                l<a<T, V>, h0> lVar2 = this.f100287e;
                if (lVar2 != null) {
                    lVar2.invoke(this.f100285c);
                }
                hVar.a();
                this.f100288f.f86523a = true;
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
                a((h) obj);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2128a(a<T, V> aVar, T t11, d<T, V> dVar, long j11, l<? super a<T, V>, h0> lVar, Continuation<? super C2128a> continuation) {
            super(1, continuation);
            this.f100280q = aVar;
            this.f100281r = t11;
            this.f100282s = dVar;
            this.f100283t = j11;
            this.f100284u = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new C2128a(this.f100280q, this.f100281r, this.f100282s, this.f100283t, this.f100284u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            j0 j0Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100279p;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    this.f100280q.j().E(this.f100280q.l().a().invoke(this.f100281r));
                    this.f100280q.s(this.f100282s.f());
                    this.f100280q.r(true);
                    AnimationState animationStateH = l.h(this.f100280q.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    j0 j0Var2 = new j0();
                    d<T, V> dVar = this.f100282s;
                    long j11 = this.f100283t;
                    C2129a c2129a = new C2129a(this.f100280q, animationStateH, this.f100284u, j0Var2);
                    this.f100277n = animationStateH;
                    this.f100278o = j0Var2;
                    this.f100279p = 1;
                    if (j1.c(animationStateH, dVar, j11, c2129a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animationState = animationStateH;
                    j0Var = j0Var2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j0Var = (j0) this.f100278o;
                    animationState = (AnimationState) this.f100277n;
                    t.b(obj);
                }
                e eVar = j0Var.f86523a ? e.BoundReached : e.Finished;
                this.f100280q.i();
                return new AnimationResult(animationState, eVar);
            } catch (CancellationException e11) {
                this.f100280q.i();
                throw e11;
            }
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super AnimationResult<T, V>> continuation) {
            return ((C2128a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100289n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<T, V> f100290o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ T f100291p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T, V> aVar, T t11, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f100290o = aVar;
            this.f100291p = t11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new b(this.f100290o, this.f100291p, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f100289n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f100290o.i();
            Object objH = this.f100290o.h(this.f100291p);
            this.f100290o.j().D(objH);
            this.f100290o.s(objH);
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((b) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100292n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<T, V> f100293o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<T, V> aVar, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f100293o = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new c(this.f100293o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f100292n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f100293o.i();
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((c) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(T t11, p1<T, V> p1Var, T t12, String str) {
        this.typeConverter = p1Var;
        this.visibilityThreshold = t12;
        this.label = str;
        this.internalState = new AnimationState<>(p1Var, t11, null, 0L, 0L, false, 60, null);
        this.isRunning = s3.d(Boolean.FALSE, null, 2, null);
        this.targetValue = s3.d(t11, null, 2, null);
        this.mutatorMutex = new w0();
        this.defaultSpringSpec = new e1<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, t12, 3, null);
        q qVarO = o();
        V v11 = qVarO instanceof m ? p019p1.b.f100303e : qVarO instanceof n ? p019p1.b.f100304f : qVarO instanceof o ? p019p1.b.f100305g : p019p1.b.f100306h;
        s.i(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v11;
        q qVarO2 = o();
        V v12 = qVarO2 instanceof m ? p019p1.b.f100299a : qVarO2 instanceof n ? p019p1.b.f100300b : qVarO2 instanceof o ? p019p1.b.f100301c : p019p1.b.f100302d;
        s.i(v12, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v12;
        this.lowerBoundVector = v11;
        this.upperBoundVector = v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(a aVar, Object obj, i iVar, Object obj2, l lVar, Continuation continuation, int i11, Object obj3) {
        if ((i11 & 2) != 0) {
            iVar = aVar.defaultSpringSpec;
        }
        i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            obj2 = aVar.n();
        }
        Object obj4 = obj2;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return aVar.e(obj, iVar2, obj4, lVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T value) {
        if (s.f(this.lowerBoundVector, this.negativeInfinityBounds) && s.f(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.a().invoke(value);
        int size = vInvoke.getSize();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            if (vInvoke.a(i11) < this.lowerBoundVector.a(i11) || vInvoke.a(i11) > this.upperBoundVector.a(i11)) {
                vInvoke.e(i11, n.m(vInvoke.a(i11), this.lowerBoundVector.a(i11), this.upperBoundVector.a(i11)));
                z11 = true;
            }
        }
        return z11 ? this.typeConverter.b().invoke(vInvoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.q().d();
        animationState.B(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(d<T, V> dVar, T t11, l<? super a<T, V>, h0> lVar, Continuation<? super AnimationResult<T, V>> continuation) {
        return w0.e(this.mutatorMutex, null, new C2128a(this, t11, dVar, this.internalState.getLastFrameTimeNanos(), lVar, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z11) {
        this.isRunning.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t11) {
        this.targetValue.setValue(t11);
    }

    public final Object e(T t11, i<T> iVar, T t12, l<? super a<T, V>, h0> lVar, Continuation<? super AnimationResult<T, V>> continuation) {
        return q(f.a(iVar, this.typeConverter, m(), t11, t12), t12, lVar, continuation);
    }

    public final y3<T> g() {
        return this.internalState;
    }

    public final AnimationState<T, V> j() {
        return this.internalState;
    }

    public final T k() {
        return this.targetValue.getValue();
    }

    public final p1<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.internalState.getValue();
    }

    public final T n() {
        return (T) this.typeConverter.b().invoke(o());
    }

    public final V o() {
        return (V) this.internalState.q();
    }

    public final boolean p() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object t(T t11, Continuation<? super h0> continuation) {
        Object objE = w0.e(this.mutatorMutex, null, new b(this, t11, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public final Object u(Continuation<? super h0> continuation) {
        Object objE = w0.e(this.mutatorMutex, null, new c(this, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public /* synthetic */ a(Object obj, p1 p1Var, Object obj2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, p1Var, (i11 & 4) != 0 ? null : obj2, (i11 & 8) != 0 ? "Animatable" : str);
    }
}
