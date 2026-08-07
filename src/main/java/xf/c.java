package xf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p019p1.l0;
import p020r2.h1;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import q1.i0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0018\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019Jl\u0010$\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b$\u0010%R+\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\u0016\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001c8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u001b\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0015R+\u0010#\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u001b\u0010G\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010?R/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010O\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010(\u001a\u0004\bM\u0010?\"\u0004\bN\u0010\u0015R+\u0010\u0012\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010?\"\u0004\bR\u0010\u0015R+\u0010W\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010Y\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010E\u001a\u0004\bX\u0010?R\u001b\u0010[\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\bA\u0010*R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lxf/c;", "Lxf/b;", "<init>", "()V", "", "iterations", "", "H", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "frameNanos", Gender.NONE, "(IJ)Z", "", "Ltf/i;", "composition", Gender.OTHER, "(FLtf/i;)F", ReactProgressBarViewManager.PROP_PROGRESS, "Ljn0/h0;", "a0", "(F)V", "iteration", "resetLastFrameNanos", "x", "(Ltf/i;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverseOnRepeat", "speed", "Lxf/j;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lxf/i;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "j", "(Ltf/i;IIZFLxf/j;FZLxf/i;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "a", "Lr2/p1;", "isPlaying", "()Z", Gender.UNKNOWN, "(Z)V", "b", "w", "()I", "R", "(I)V", "c", "l", "S", DateTokenConverter.CONVERTER_KEY, "v", "X", "e", "y", "()Lxf/j;", "P", "(Lxf/j;)V", "f", "m", "()F", "Y", "g", Gender.MALE, "Z", "h", "Lr2/y3;", "J", "frameSpeed", IntegerTokenConverter.CONVERTER_KEY, "s", "()Ltf/i;", "Q", "(Ltf/i;)V", "L", "W", "progressRaw", "k", "getProgress", "V", "K", "()J", "T", "(J)V", "lastFrameNanos", "I", "endProgress", "n", "isAtEnd", "Lq1/i0;", "o", "Lq1/i0;", "mutex", "getValue", "()Ljava/lang/Float;", "value", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class c implements xf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 isPlaying;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 iteration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 iterations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 reverseOnRepeat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 clipSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 speed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 useCompositionFrameRate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y3 frameSpeed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 composition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 progressRaw;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 progress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p1 lastFrameNanos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final y3 endProgress;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final y3 isAtEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final i0 mutex;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123322n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f123324p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f123325q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f123326r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f123327s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f123328t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ tf.i f123329u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ float f123330v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f123331w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f123332x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ i f123333y;

        /* JADX INFO: renamed from: xf.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C2674a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f123334n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i f123335o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Job f123336p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f123337q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f123338r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ c f123339s;

            /* JADX INFO: renamed from: xf.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C2675a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f123340a;

                static {
                    int[] iArr = new int[i.values().length];
                    try {
                        iArr[i.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f123340a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2674a(i iVar, Job job, int i11, int i12, c cVar, Continuation<? super C2674a> continuation) {
                super(2, continuation);
                this.f123335o = iVar;
                this.f123336p = job;
                this.f123337q = i11;
                this.f123338r = i12;
                this.f123339s = cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2674a(this.f123335o, this.f123336p, this.f123337q, this.f123338r, this.f123339s, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0026  */
            /* JADX WARN: Code duplicated, block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Code duplicated, block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0049
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r3.f123334n
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    jn0.t.b(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    jn0.t.b(r4)
                L1a:
                    xf.i r4 = r3.f123335o
                    int[] r1 = xf.c.a.C2674a.C2675a.f123340a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    kotlinx.coroutines.Job r4 = r3.f123336p
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L31
                    int r4 = r3.f123337q
                    goto L36
                L31:
                    int r4 = r3.f123338r
                    goto L36
                L34:
                    int r4 = r3.f123337q
                L36:
                    xf.c r1 = r3.f123339s
                    r3.f123334n = r2
                    java.lang.Object r4 = xf.c.k(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    jn0.h0 r4 = jn0.h0.f84049a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: xf.c.a.C2674a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2674a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f123341a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f123341a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, boolean z11, float f11, j jVar, tf.i iVar, float f12, boolean z12, boolean z13, i iVar2, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f123324p = i11;
            this.f123325q = i12;
            this.f123326r = z11;
            this.f123327s = f11;
            this.f123328t = jVar;
            this.f123329u = iVar;
            this.f123330v = f12;
            this.f123331w = z12;
            this.f123332x = z13;
            this.f123333y = iVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(this.f123324p, this.f123325q, this.f123326r, this.f123327s, this.f123328t, this.f123329u, this.f123330v, this.f123331w, this.f123332x, this.f123333y, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineContext coroutineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f123322n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    c.this.R(this.f123324p);
                    c.this.S(this.f123325q);
                    c.this.X(this.f123326r);
                    c.this.Y(this.f123327s);
                    c.this.P(this.f123328t);
                    c.this.Q(this.f123329u);
                    c.this.a0(this.f123330v);
                    c.this.Z(this.f123331w);
                    if (!this.f123332x) {
                        c.this.T(Long.MIN_VALUE);
                    }
                    if (this.f123329u == null) {
                        c.this.U(false);
                        return h0.f84049a;
                    }
                    if (Float.isInfinite(this.f123327s)) {
                        c cVar = c.this;
                        cVar.a0(cVar.I());
                        c.this.U(false);
                        c.this.R(this.f123325q);
                        return h0.f84049a;
                    }
                    c.this.U(true);
                    int i12 = b.f123341a[this.f123333y.ordinal()];
                    if (i12 == 1) {
                        coroutineContext = NonCancellable.INSTANCE;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        coroutineContext = EmptyCoroutineContext.INSTANCE;
                    }
                    C2674a c2674a = new C2674a(this.f123333y, JobKt.getJob(getContext()), this.f123325q, this.f123324p, c.this, null);
                    this.f123322n = 1;
                    if (BuildersKt.withContext(coroutineContext, c2674a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                JobKt.ensureActive(getContext());
                c.this.U(false);
                return h0.f84049a;
            } catch (Throwable th2) {
                c.this.U(false);
                throw th2;
            }
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<Long, Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f123343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(1);
            this.f123343d = i11;
        }

        public final Boolean a(long j11) {
            return Boolean.valueOf(c.this.N(this.f123343d, j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    /* JADX INFO: renamed from: xf.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class C2676c extends u implements wn0.l<Long, Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f123345d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2676c(int i11) {
            super(1);
            this.f123345d = i11;
        }

        public final Boolean a(long j11) {
            return Boolean.valueOf(c.this.N(this.f123345d, j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<Float> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            tf.i iVarS = c.this.s();
            float fA = BitmapDescriptorFactory.HUE_RED;
            if (iVarS != null) {
                if (c.this.m() < BitmapDescriptorFactory.HUE_RED) {
                    j jVarY = c.this.y();
                    if (jVarY != null) {
                        fA = jVarY.b(iVarS);
                    }
                } else {
                    j jVarY2 = c.this.y();
                    fA = jVarY2 != null ? jVarY2.a(iVarS) : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<Float> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf((c.this.v() && c.this.w() % 2 == 0) ? -c.this.m() : c.this.m());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<Boolean> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.w() == c.this.l() && c.this.getProgress() == c.this.I());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123349n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ tf.i f123351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f123352q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f123353r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f123354s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(tf.i iVar, float f11, int i11, boolean z11, Continuation<? super g> continuation) {
            super(1, continuation);
            this.f123351p = iVar;
            this.f123352q = f11;
            this.f123353r = i11;
            this.f123354s = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new g(this.f123351p, this.f123352q, this.f123353r, this.f123354s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f123349n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            c.this.Q(this.f123351p);
            c.this.a0(this.f123352q);
            c.this.R(this.f123353r);
            c.this.U(false);
            if (this.f123354s) {
                c.this.T(Long.MIN_VALUE);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((g) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = s3.d(bool, null, 2, null);
        this.iteration = s3.d(1, null, 2, null);
        this.iterations = s3.d(1, null, 2, null);
        this.reverseOnRepeat = s3.d(bool, null, 2, null);
        this.clipSpec = s3.d(null, null, 2, null);
        this.speed = s3.d(Float.valueOf(1.0f), null, 2, null);
        this.useCompositionFrameRate = s3.d(bool, null, 2, null);
        this.frameSpeed = n3.e(new e());
        this.composition = s3.d(null, null, 2, null);
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.progressRaw = s3.d(fValueOf, null, 2, null);
        this.progress = s3.d(fValueOf, null, 2, null);
        this.lastFrameNanos = s3.d(Long.MIN_VALUE, null, 2, null);
        this.endProgress = n3.e(new d());
        this.isAtEnd = n3.e(new f());
        this.mutex = new i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(int i11, Continuation<? super Boolean> continuation) {
        return i11 == Integer.MAX_VALUE ? l0.a(new b(i11), continuation) : h1.c(new C2676c(i11), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float I() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    private final float J() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float L() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(int iterations, long frameNanos) {
        tf.i iVarS = s();
        if (iVarS == null) {
            return true;
        }
        long jK = K() == Long.MIN_VALUE ? 0L : frameNanos - K();
        T(frameNanos);
        j jVarY = y();
        float fB = jVarY != null ? jVarY.b(iVarS) : 0.0f;
        j jVarY2 = y();
        float fA = jVarY2 != null ? jVarY2.a(iVarS) : 1.0f;
        float fD = ((jK / ((long) 1000000)) / iVarS.d()) * J();
        float fL = J() < BitmapDescriptorFactory.HUE_RED ? fB - (L() + fD) : (L() + fD) - fA;
        if (fL < BitmapDescriptorFactory.HUE_RED) {
            a0(bo0.n.m(L(), fB, fA) + fD);
        } else {
            float f11 = fA - fB;
            int i11 = (int) (fL / f11);
            int i12 = i11 + 1;
            if (w() + i12 > iterations) {
                a0(I());
                R(iterations);
                return false;
            }
            R(w() + i12);
            float f12 = fL - (i11 * f11);
            a0(J() < BitmapDescriptorFactory.HUE_RED ? fA - f12 : fB + f12);
        }
        return true;
    }

    private final float O(float f11, tf.i iVar) {
        if (iVar == null) {
            return f11;
        }
        return f11 - (f11 % (1 / iVar.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(j jVar) {
        this.clipSpec.setValue(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(tf.i iVar) {
        this.composition.setValue(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i11) {
        this.iteration.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i11) {
        this.iterations.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(long j11) {
        this.lastFrameNanos.setValue(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(boolean z11) {
        this.isPlaying.setValue(Boolean.valueOf(z11));
    }

    private void V(float f11) {
        this.progress.setValue(Float.valueOf(f11));
    }

    private final void W(float f11) {
        this.progressRaw.setValue(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(boolean z11) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(float f11) {
        this.speed.setValue(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z11) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(float progress) {
        W(progress);
        if (M()) {
            progress = O(progress, s());
        }
        V(progress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long K() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean M() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    @Override // xf.h
    public boolean g() {
        return ((Boolean) this.isAtEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    @Override // xf.b
    public Object j(tf.i iVar, int i11, int i12, boolean z11, float f11, j jVar, float f12, boolean z12, i iVar2, boolean z13, boolean z14, Continuation<? super h0> continuation) {
        Object objE = i0.e(this.mutex, null, new a(i11, i12, z11, f11, jVar, iVar, f12, z14, z12, iVar2, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public int l() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public float m() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public tf.i s() {
        return (tf.i) this.composition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public boolean v() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public int w() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    @Override // xf.b
    public Object x(tf.i iVar, float f11, int i11, boolean z11, Continuation<? super h0> continuation) {
        Object objE = i0.e(this.mutex, null, new g(iVar, f11, i11, z11, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xf.h
    public j y() {
        return (j) this.clipSpec.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p020r2.y3
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}
