package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import p019p1.m;
import p019p1.r1;
import p019p1.s1;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Ls1/f0;", "", "Lp1/i;", "", "animationSpec", "<init>", "(Lp1/i;)V", "Lkotlin/Function1;", "Ljn0/h0;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(Lwn0/l;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/s1;", "Lp1/m;", "a", "Lp1/s1;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "c", "Lp1/m;", "lastVelocity", "", DateTokenConverter.CONVERTER_KEY, "Z", "isRunning", "e", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "j", "(F)V", "value", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f109498f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f109499g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final m f109500h = new m(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s1<m> vectorizedSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m lastVelocity = f109500h;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls1/f0$a;", "", "<init>", "()V", "", "", "b", "(F)Z", "Lp1/m;", "ZeroVector", "Lp1/m;", "a", "()Lp1/m;", "VisibilityThreshold", Gender.FEMALE, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return f0.f109500h;
        }

        public final boolean b(float f11) {
            return Math.abs(f11) < 0.01f;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109506n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109507o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f109508p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f109509q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f109510r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f109512t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109510r = obj;
            this.f109512t |= Integer.MIN_VALUE;
            return f0.this.h(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f109514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Float, h0> f109515e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f11, l<? super Float, h0> lVar) {
            super(1);
            this.f109514d = f11;
            this.f109515e = lVar;
        }

        public final void a(long j11) {
            if (f0.this.lastFrameTime == Long.MIN_VALUE) {
                f0.this.lastFrameTime = j11;
            }
            m mVar = new m(f0.this.getValue());
            long jB = this.f109514d == BitmapDescriptorFactory.HUE_RED ? f0.this.vectorizedSpec.b(new m(f0.this.getValue()), f0.f109498f.a(), f0.this.lastVelocity) : yn0.a.f((j11 - f0.this.lastFrameTime) / this.f109514d);
            float value = ((m) f0.this.vectorizedSpec.e(jB, mVar, f0.f109498f.a(), f0.this.lastVelocity)).getValue();
            f0 f0Var = f0.this;
            f0Var.lastVelocity = (m) f0Var.vectorizedSpec.d(jB, mVar, f0.f109498f.a(), f0.this.lastVelocity);
            f0.this.lastFrameTime = j11;
            float value2 = f0.this.getValue() - value;
            f0.this.j(value);
            this.f109515e.invoke(Float.valueOf(value2));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Float, h0> f109517d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l<? super Float, h0> lVar) {
            super(1);
            this.f109517d = lVar;
        }

        public final void a(long j11) {
            float value = f0.this.getValue();
            f0.this.j(BitmapDescriptorFactory.HUE_RED);
            this.f109517d.invoke(Float.valueOf(value));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    public f0(i<Float> iVar) {
        this.vectorizedSpec = iVar.a(r1.e(p013kotlin.jvm.internal.l.f86526a));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r12 r13 r14
      0x0082: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r2v4 s1.f0$b) = (r2v2 s1.f0$b), (r2v5 s1.f0$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r12v7 float) = (r12v4 float), (r12v8 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r13v7 wn0.l<? super java.lang.Float, jn0.h0>) = (r13v4 wn0.l<? super java.lang.Float, jn0.h0>), (r13v8 wn0.l<? super java.lang.Float, jn0.h0>) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r14v15 s1.f0) = (r14v9 s1.f0), (r14v16 s1.f0) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[PHI: r0 r2 r13 r14
      0x00a9: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r2v3 s1.f0$b) = (r2v4 s1.f0$b), (r2v5 s1.f0$b) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r13v5 wn0.l<? super java.lang.Float, jn0.h0>) = (r13v7 wn0.l<? super java.lang.Float, jn0.h0>), (r13v8 wn0.l<? super java.lang.Float, jn0.h0>) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r14v11 s1.f0) = (r14v15 s1.f0), (r14v16 s1.f0) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d1, B:42:0x00b1, B:45:0x00bc), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[EXC_TOP_SPLITTER, PHI: r0 r2 r12 r13 r14
      0x00a2: PHI (r0v10 ??) = (r0v14 ??), (r0v11 ??) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r2v5 s1.f0$b) = (r2v4 s1.f0$b), (r2v8 s1.f0$b) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r12v8 float) = (r12v7 float), (r12v13 float) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r13v8 wn0.l<? super java.lang.Float, jn0.h0>) = (r13v7 wn0.l<? super java.lang.Float, jn0.h0>), (r13v15 wn0.l<? super java.lang.Float, jn0.h0>) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r14v16 s1.f0) = (r14v15 s1.f0), (r14v18 s1.f0) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [wn0.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [wn0.a] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [wn0.a<jn0.h0>] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [s1.f0] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [s1.f0] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(wn0.l<? super java.lang.Float, jn0.h0> r12, wn0.a<jn0.h0> r13, p013kotlin.coroutines.Continuation<? super jn0.h0> r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.f0.h(wn0.l, wn0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final void j(float f11) {
        this.value = f11;
    }
}
