package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y3;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lp1/n0;", "", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "Lp1/n0$a;", "animation", "f", "(Lp1/n0$a;)V", "j", "k", "(Lr2/l;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lt2/b;", "b", "Lt2/b;", "_animations", "", "<set-?>", "c", "Lr2/p1;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", DateTokenConverter.CONVERTER_KEY, "J", "startTimeNanos", "e", "h", "m", "isRunning", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100525f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a<?, ?>> _animations = new t2.b<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 refreshChildNeeded = s3.d(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 isRunning = s3.d(Boolean.TRUE, null, 2, null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R+\u0010/\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lp1/n0$a;", "T", "Lp1/q;", "V", "Lr2/y3;", "initialValue", "targetValue", "Lp1/p1;", "typeConverter", "Lp1/i;", "animationSpec", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lp1/n0;Ljava/lang/Object;Ljava/lang/Object;Lp1/p1;Lp1/i;Ljava/lang/String;)V", "Ljn0/h0;", "B", "(Ljava/lang/Object;Ljava/lang/Object;Lp1/i;)V", "", "playTimeNanos", "p", "(J)V", "u", "()V", "q", "a", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "b", "n", "setTargetValue$animation_core_release", "c", "Lp1/p1;", "getTypeConverter", "()Lp1/p1;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Lr2/p1;", "getValue", "t", "value", "f", "Lp1/i;", "getAnimationSpec", "()Lp1/i;", "Lp1/k1;", "g", "Lp1/k1;", "getAnimation", "()Lp1/k1;", "setAnimation$animation_core_release", "(Lp1/k1;)V", "animation", "", "h", "Z", "o", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", IntegerTokenConverter.CONVERTER_KEY, "startOnTheNextFrame", "j", "J", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a<T, V extends q> implements y3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p1<T, V> typeConverter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final p1 value;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private i<T> animationSpec;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private k1<T, V> animation;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        public a(T t11, T t12, p1<T, V> p1Var, i<T> iVar, String str) {
            this.initialValue = t11;
            this.targetValue = t12;
            this.typeConverter = p1Var;
            this.label = str;
            this.value = s3.d(t11, null, 2, null);
            this.animationSpec = iVar;
            this.animation = new k1<>(this.animationSpec, p1Var, this.initialValue, this.targetValue, null, 16, null);
        }

        public final void B(T initialValue, T targetValue, i<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new k1<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            n0.this.l(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        @Override // p020r2.y3
        public T getValue() {
            return this.value.getValue();
        }

        public final T k() {
            return this.initialValue;
        }

        public final T n() {
            return this.targetValue;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void p(long playTimeNanos) {
            n0.this.l(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j11 = playTimeNanos - this.playTimeNanosOffset;
            t(this.animation.e(j11));
            this.isFinished = this.animation.b(j11);
        }

        public final void q() {
            this.startOnTheNextFrame = true;
        }

        public void t(T t11) {
            this.value.setValue(t11);
        }

        public final void u() {
            t(this.animation.f());
            this.startOnTheNextFrame = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100542n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f100543o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f100544p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<y3<Long>> f100545q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n0 f100546r;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<Long, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1<y3<Long>> f100547c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f100548d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ k0 f100549e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f100550f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p1<y3<Long>> p1Var, n0 n0Var, k0 k0Var, CoroutineScope coroutineScope) {
                super(1);
                this.f100547c = p1Var;
                this.f100548d = n0Var;
                this.f100549e = k0Var;
                this.f100550f = coroutineScope;
            }

            public final void a(long j11) {
                y3<Long> value = this.f100547c.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j11;
                int i11 = 0;
                if (this.f100548d.startTimeNanos == Long.MIN_VALUE || this.f100549e.f86525a != j1.n(this.f100550f.getCoroutineContext())) {
                    this.f100548d.startTimeNanos = j11;
                    t2.b bVar = this.f100548d._animations;
                    int size = bVar.getSize();
                    if (size > 0) {
                        Object[] objArrM = bVar.m();
                        int i12 = 0;
                        do {
                            ((a) objArrM[i12]).q();
                            i12++;
                        } while (i12 < size);
                    }
                    this.f100549e.f86525a = j1.n(this.f100550f.getCoroutineContext());
                }
                if (this.f100549e.f86525a != BitmapDescriptorFactory.HUE_RED) {
                    this.f100548d.i((long) ((jLongValue - this.f100548d.startTimeNanos) / this.f100549e.f86525a));
                    return;
                }
                t2.b bVar2 = this.f100548d._animations;
                int size2 = bVar2.getSize();
                if (size2 > 0) {
                    Object[] objArrM2 = bVar2.m();
                    do {
                        ((a) objArrM2[i11]).u();
                        i11++;
                    } while (i11 < size2);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
                a(l11.longValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: p1.n0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        static final class C2132b extends u implements wn0.a<Float> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f100551c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2132b(CoroutineScope coroutineScope) {
                super(0);
                this.f100551c = coroutineScope;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(j1.n(this.f100551c.getCoroutineContext()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements p<Float, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f100552n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ float f100553o;

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            public final Object a(float f11, Continuation<? super Boolean> continuation) {
                return ((c) create(Float.valueOf(f11), continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.f100553o = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Float f11, Continuation<? super Boolean> continuation) {
                return a(f11.floatValue(), continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f100552n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return Boxing.boxBoolean(this.f100553o > BitmapDescriptorFactory.HUE_RED);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p1<y3<Long>> p1Var, n0 n0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f100545q = p1Var;
            this.f100546r = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f100545q, this.f100546r, continuation);
            bVar.f100544p = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r1 r8
          0x0040: PHI (r1v3 kotlin.jvm.internal.k0) = 
          (r1v1 kotlin.jvm.internal.k0)
          (r1v2 kotlin.jvm.internal.k0)
          (r1v2 kotlin.jvm.internal.k0)
          (r1v7 kotlin.jvm.internal.k0)
         binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r8v4 kotlinx.coroutines.CoroutineScope) = 
          (r8v2 kotlinx.coroutines.CoroutineScope)
          (r8v3 kotlinx.coroutines.CoroutineScope)
          (r8v3 kotlinx.coroutines.CoroutineScope)
          (r8v7 kotlinx.coroutines.CoroutineScope)
         binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r1 r8
          0x0056: PHI (r1v2 kotlin.jvm.internal.k0) = (r1v3 kotlin.jvm.internal.k0), (r1v5 kotlin.jvm.internal.k0) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0056: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v5 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f100543o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f100542n
                kotlin.jvm.internal.k0 r1 = (p013kotlin.jvm.internal.k0) r1
                java.lang.Object r4 = r7.f100544p
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                jn0.t.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f100542n
                kotlin.jvm.internal.k0 r1 = (p013kotlin.jvm.internal.k0) r1
                java.lang.Object r4 = r7.f100544p
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                jn0.t.b(r8)
                r8 = r4
                goto L56
            L30:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f100544p
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                kotlin.jvm.internal.k0 r1 = new kotlin.jvm.internal.k0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f86525a = r4
            L40:
                p1.n0$b$a r4 = new p1.n0$b$a
                r2.p1<r2.y3<java.lang.Long>> r5 = r7.f100545q
                p1.n0 r6 = r7.f100546r
                r4.<init>(r5, r6, r1, r8)
                r7.f100544p = r8
                r7.f100542n = r1
                r7.f100543o = r3
                java.lang.Object r4 = p019p1.l0.a(r4, r7)
                if (r4 != r0) goto L56
                goto L78
            L56:
                float r4 = r1.f86525a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                p1.n0$b$b r4 = new p1.n0$b$b
                r4.<init>(r8)
                kotlinx.coroutines.flow.Flow r4 = p020r2.n3.p(r4)
                p1.n0$b$c r5 = new p1.n0$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f100544p = r8
                r7.f100542n = r1
                r7.f100543o = r2
                java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.first(r4, r5, r7)
                if (r4 != r0) goto L40
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.n0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f100555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f100555d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n0.this.k(lVar, k2.a(this.f100555d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public n0(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long playTimeNanos) {
        boolean z11;
        t2.b<a<?, ?>> bVar = this._animations;
        int size = bVar.getSize();
        if (size > 0) {
            a<?, ?>[] aVarArrM = bVar.m();
            z11 = true;
            int i11 = 0;
            do {
                a<?, ?> aVar = aVarArrM[i11];
                if (!aVar.getIsFinished()) {
                    aVar.p(playTimeNanos);
                }
                if (!aVar.getIsFinished()) {
                    z11 = false;
                }
                i11++;
            } while (i11 < size);
        } else {
            z11 = true;
        }
        m(!z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z11) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z11));
    }

    private final void m(boolean z11) {
        this.isRunning.setValue(Boolean.valueOf(z11));
    }

    public final void f(a<?, ?> animation) {
        this._animations.b(animation);
        l(true);
    }

    public final void j(a<?, ?> animation) {
        this._animations.t(animation);
    }

    public final void k(p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-318043801);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-318043801, i12, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1 p1Var = (p1) objI;
            if (h() || g()) {
                lVarV.o(1719915818);
                boolean zK = lVarV.K(this);
                Object objI2 = lVarV.I();
                if (zK || objI2 == companion.a()) {
                    objI2 = new b(p1Var, this, null);
                    lVarV.B(objI2);
                }
                Function0.g(this, (p) objI2, lVarV, i12 & 14);
                lVarV.l();
            } else {
                lVarV.o(1721436120);
                lVarV.l();
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(i11));
        }
    }
}
