package androidx.compose.foundation.lazy.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import k3.g3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.g0;
import p019p1.m;
import p019p1.r1;
import p020r2.p1;
import p020r2.s3;
import w4.n;
import w4.o;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00101\"\u0004\b;\u00107R+\u0010@\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00101\"\u0004\b?\u00107R+\u0010C\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bA\u00101\"\u0004\bB\u00107R(\u0010H\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010F\"\u0004\bD\u0010GR(\u0010K\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010D\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010GR(\u0010P\u001a\u0004\u0018\u00010L2\b\u0010-\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010OR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020U0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010SR1\u0010Z\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010F\"\u0004\bY\u0010GR(\u0010\\\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u0010D\u001a\u0004\bW\u0010F\"\u0004\b[\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lk3/g3;", "graphicsContext", "Lkotlin/Function0;", "Ljn0/h0;", "onLayerPropertyChanged", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lk3/g3;Lwn0/a;)V", "n", "()V", "Lw4/n;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "y", "a", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lk3/g3;", "c", "Lwn0/a;", "Lp1/g0;", "", DateTokenConverter.CONVERTER_KEY, "Lp1/g0;", "getFadeInSpec", "()Lp1/g0;", "C", "(Lp1/g0;)V", "fadeInSpec", "e", "getPlacementSpec", "I", "placementSpec", "f", "getFadeOutSpec", "D", "fadeOutSpec", "<set-?>", "g", "Z", "x", "()Z", "isRunningMovingAwayAnimation", "h", "Lr2/p1;", "w", "G", "(Z)V", "isPlacementAnimationInProgress", IntegerTokenConverter.CONVERTER_KEY, "t", "z", "isAppearanceAnimationInProgress", "j", "v", "B", "isDisappearanceAnimationInProgress", "u", "A", "isDisappearanceAnimationFinished", "J", "s", "()J", "(J)V", "rawOffset", "o", "E", "finalOffset", "Ln3/c;", "Ln3/c;", "p", "()Ln3/c;", "layer", "Lp1/a;", "Lp1/n;", "Lp1/a;", "placementDeltaAnimation", "Lp1/m;", "visibilityAnimation", "q", "r", "H", "placementDelta", Gender.FEMALE, "lookaheadOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f4728t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f4729u = o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g3 graphicsContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onLayerPropertyChanged;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g0<Float> fadeInSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private g0<n> placementSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private g0<Float> fadeOutSpec;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p1 isPlacementAnimationInProgress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 isAppearanceAnimationInProgress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 isDisappearanceAnimationInProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 isDisappearanceAnimationFinished;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rawOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long finalOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private n3.c layer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<n, p019p1.n> placementDeltaAnimation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<Float, m> visibilityAnimation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p1 placementDelta;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b$a;", "", "<init>", "()V", "Lw4/n;", "NotInitialized", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f4729u;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class C0100b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4748n;

        C0100b(Continuation<? super C0100b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0100b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4748n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = b.this.visibilityAnimation;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                this.f4748n = 1;
                if (aVar.t(fBoxFloat, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C0100b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {195, 197}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f4751o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f4752p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g0<Float> f4753q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n3.c f4754r;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/a;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<p019p1.a<Float, m>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n3.c f4755c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f4756d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n3.c cVar, b bVar) {
                super(1);
                this.f4755c = cVar;
                this.f4756d = bVar;
            }

            public final void a(p019p1.a<Float, m> aVar) {
                this.f4755c.J(aVar.m().floatValue());
                this.f4756d.onLayerPropertyChanged.invoke();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p019p1.a<Float, m> aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, b bVar, g0<Float> g0Var, n3.c cVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f4751o = z11;
            this.f4752p = bVar;
            this.f4753q = g0Var;
            this.f4754r = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f4751o, this.f4752p, this.f4753q, this.f4754r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (p019p1.a.f(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f4750n
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                jn0.t.b(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L64
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L72
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                jn0.t.b(r13)     // Catch: java.lang.Throwable -> L14
                goto L40
            L24:
                jn0.t.b(r13)
                boolean r13 = r12.f4751o     // Catch: java.lang.Throwable -> L6f
                if (r13 == 0) goto L40
                androidx.compose.foundation.lazy.layout.b r13 = r12.f4752p     // Catch: java.lang.Throwable -> L14
                p1.a r13 = androidx.compose.foundation.lazy.layout.b.d(r13)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                java.lang.Float r1 = p013kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)     // Catch: java.lang.Throwable -> L14
                r12.f4750n = r4     // Catch: java.lang.Throwable -> L14
                java.lang.Object r13 = r13.t(r1, r12)     // Catch: java.lang.Throwable -> L14
                if (r13 != r0) goto L40
                r9 = r12
                goto L63
            L40:
                androidx.compose.foundation.lazy.layout.b r13 = r12.f4752p     // Catch: java.lang.Throwable -> L6f
                p1.a r4 = androidx.compose.foundation.lazy.layout.b.d(r13)     // Catch: java.lang.Throwable -> L6f
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = p013kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)     // Catch: java.lang.Throwable -> L6f
                p1.g0<java.lang.Float> r6 = r12.f4753q     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.b$c$a r8 = new androidx.compose.foundation.lazy.layout.b$c$a     // Catch: java.lang.Throwable -> L6f
                n3.c r13 = r12.f4754r     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.b r1 = r12.f4752p     // Catch: java.lang.Throwable -> L6f
                r8.<init>(r13, r1)     // Catch: java.lang.Throwable -> L6f
                r12.f4750n = r3     // Catch: java.lang.Throwable -> L6f
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = p019p1.a.f(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.foundation.lazy.layout.b r13 = r9.f4752p
                androidx.compose.foundation.lazy.layout.b.e(r13, r2)
                jn0.h0 r13 = jn0.h0.f84049a
                return r13
            L6c:
                r0 = move-exception
            L6d:
                r13 = r0
                goto L72
            L6f:
                r0 = move-exception
                r9 = r12
                goto L6d
            L72:
                androidx.compose.foundation.lazy.layout.b r0 = r9.f4752p
                androidx.compose.foundation.lazy.layout.b.e(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4757n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ g0<Float> f4759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n3.c f4760q;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/a;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<p019p1.a<Float, m>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n3.c f4761c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f4762d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n3.c cVar, b bVar) {
                super(1);
                this.f4761c = cVar;
                this.f4762d = bVar;
            }

            public final void a(p019p1.a<Float, m> aVar) {
                this.f4761c.J(aVar.m().floatValue());
                this.f4762d.onLayerPropertyChanged.invoke();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p019p1.a<Float, m> aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g0<Float> g0Var, n3.c cVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f4759p = g0Var;
            this.f4760q = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(this.f4759p, this.f4760q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            d dVar;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4757n;
            if (i11 == 0) {
                t.b(obj);
                try {
                    p019p1.a aVar = b.this.visibilityAnimation;
                    Float fBoxFloat = Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED);
                    g0<Float> g0Var = this.f4759p;
                    a aVar2 = new a(this.f4760q, b.this);
                    this.f4757n = 1;
                    dVar = this;
                    try {
                        if (p019p1.a.f(aVar, fBoxFloat, g0Var, null, aVar2, dVar, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        b.this.B(false);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dVar = this;
                    th2 = th;
                    b.this.B(false);
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    t.b(obj);
                    dVar = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    dVar = this;
                    b.this.B(false);
                    throw th2;
                }
            }
            b.this.A(true);
            b.this.B(false);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {151, 158}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4763n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f4764o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g0<n> f4766q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f4767r;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/a;", "Lw4/n;", "Lp1/n;", "Ljn0/h0;", "a", "(Lp1/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<p019p1.a<n, p019p1.n>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4768c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f4769d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, long j11) {
                super(1);
                this.f4768c = bVar;
                this.f4769d = j11;
            }

            public final void a(p019p1.a<n, p019p1.n> aVar) {
                this.f4768c.H(n.k(aVar.m().getPackedValue(), this.f4769d));
                this.f4768c.onLayerPropertyChanged.invoke();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p019p1.a<n, p019p1.n> aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0<n> g0Var, long j11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f4766q = g0Var;
            this.f4767r = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new e(this.f4766q, this.f4767r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            if (p019p1.a.f(r12, r4, r5, null, r7, r8, 4, null) == r0) goto L33;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f4764o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                jn0.t.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r11
                goto Lb0
            L14:
                r8 = r11
                goto Lbb
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f4763n
                p1.g0 r1 = (p019p1.g0) r1
                jn0.t.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                goto L6c
            L27:
                jn0.t.b(r12)
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                p1.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 == 0) goto L45
                p1.g0<w4.n> r12 = r11.f4766q     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r1 = r12 instanceof p019p1.e1     // Catch: java.util.concurrent.CancellationException -> L14
                if (r1 == 0) goto L3f
                p1.e1 r12 = (p019p1.e1) r12     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L3f:
                p1.e1 r12 = p024x1.p.a()     // Catch: java.util.concurrent.CancellationException -> L14
            L43:
                r1 = r12
                goto L48
            L45:
                p1.g0<w4.n> r12 = r11.f4766q     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L48:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                p1.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != 0) goto L75
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                p1.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                long r4 = r11.f4767r     // Catch: java.util.concurrent.CancellationException -> L14
                w4.n r4 = w4.n.b(r4)     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f4763n = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f4764o = r3     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != r0) goto L6c
                r8 = r11
                goto Laf
            L6c:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                wn0.a r12 = androidx.compose.foundation.lazy.layout.b.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
            L75:
                r5 = r1
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                p1.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> L14
                w4.n r12 = (w4.n) r12     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = r12.getPackedValue()     // Catch: java.util.concurrent.CancellationException -> L14
                long r6 = r11.f4767r     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = w4.n.k(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                p1.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = r3
                w4.n r4 = w4.n.b(r6)     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r6
                androidx.compose.foundation.lazy.layout.b$e$a r7 = new androidx.compose.foundation.lazy.layout.b$e$a     // Catch: java.util.concurrent.CancellationException -> L14
                androidx.compose.foundation.lazy.layout.b r1 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> L14
                r7.<init>(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L14
                r1 = 0
                r11.f4763n = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f4764o = r2     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = 0
                r9 = 4
                r10 = 0
                r8 = r11
                r3 = r12
                java.lang.Object r12 = p019p1.a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r12 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                r0 = 0
                androidx.compose.foundation.lazy.layout.b.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                androidx.compose.foundation.lazy.layout.b.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            Lbb:
                jn0.h0 r12 = jn0.h0.f84049a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4770n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4770n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = b.this.placementDeltaAnimation;
                n nVarB = n.b(n.INSTANCE.a());
                this.f4770n = 1;
                if (aVar.t(nVarB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            b.this.H(n.INSTANCE.a());
            b.this.G(false);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4772n;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4772n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = b.this.placementDeltaAnimation;
                this.f4772n = 1;
                if (aVar.u(this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4774n;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4774n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = b.this.visibilityAnimation;
                this.f4774n = 1;
                if (aVar.u(this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4776n;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4776n;
            if (i11 == 0) {
                t.b(obj);
                p019p1.a aVar = b.this.visibilityAnimation;
                this.f4776n = 1;
                if (aVar.u(this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(CoroutineScope coroutineScope, g3 g3Var, wn0.a<h0> aVar) {
        this.coroutineScope = coroutineScope;
        this.graphicsContext = g3Var;
        this.onLayerPropertyChanged = aVar;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = s3.d(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = s3.d(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = s3.d(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = s3.d(bool, null, 2, null);
        long j11 = f4729u;
        this.rawOffset = j11;
        n.Companion companion = n.INSTANCE;
        this.finalOffset = companion.a();
        this.layer = g3Var != null ? g3Var.a() : null;
        String str = null;
        this.placementDeltaAnimation = new p019p1.a<>(n.b(companion.a()), r1.i(companion), null, str, 12, null);
        this.visibilityAnimation = new p019p1.a<>(Float.valueOf(1.0f), r1.e(p013kotlin.jvm.internal.l.f86526a), str, null, 12, null);
        this.placementDelta = s3.d(n.b(companion.a()), null, 2, null);
        this.lookaheadOffset = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z11) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z11) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z11) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j11) {
        this.placementDelta.setValue(n.b(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z11) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z11));
    }

    public final void C(g0<Float> g0Var) {
        this.fadeInSpec = g0Var;
    }

    public final void D(g0<Float> g0Var) {
        this.fadeOutSpec = g0Var;
    }

    public final void E(long j11) {
        this.finalOffset = j11;
    }

    public final void F(long j11) {
        this.lookaheadOffset = j11;
    }

    public final void I(g0<n> g0Var) {
        this.placementSpec = g0Var;
    }

    public final void J(long j11) {
        this.rawOffset = j11;
    }

    public final void k() {
        n3.c cVar = this.layer;
        g0<Float> g0Var = this.fadeInSpec;
        if (t() || g0Var == null || cVar == null) {
            if (v()) {
                if (cVar != null) {
                    cVar.J(1.0f);
                }
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C0100b(null), 3, null);
                return;
            }
            return;
        }
        z(true);
        boolean zV = v();
        boolean z11 = !zV;
        if (!zV) {
            cVar.J(BitmapDescriptorFactory.HUE_RED);
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(z11, this, g0Var, cVar, null), 3, null);
    }

    public final void l() {
        n3.c cVar = this.layer;
        g0<Float> g0Var = this.fadeOutSpec;
        if (cVar == null || v() || g0Var == null) {
            return;
        }
        B(true);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(g0Var, cVar, null), 3, null);
    }

    public final void m(long delta, boolean isMovingAway) {
        g0<n> g0Var = this.placementSpec;
        if (g0Var == null) {
            return;
        }
        long jK = n.k(r(), delta);
        H(jK);
        G(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new e(g0Var, jK, null), 3, null);
    }

    public final void n() {
        if (w()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new f(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final n3.c getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((n) this.placementDelta.getValue()).getPackedValue();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void y() {
        g3 g3Var;
        if (w()) {
            G(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new g(null), 3, null);
        }
        if (t()) {
            z(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new h(null), 3, null);
        }
        if (v()) {
            B(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new i(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        H(n.INSTANCE.a());
        this.rawOffset = f4729u;
        n3.c cVar = this.layer;
        if (cVar != null && (g3Var = this.graphicsContext) != null) {
            g3Var.b(cVar);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }
}
