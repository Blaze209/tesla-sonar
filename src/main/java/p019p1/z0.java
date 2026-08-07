package p019p1;

import androidx.collection.i0;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.b2;
import p020r2.h1;
import p020r2.l1;
import p020r2.p1;
import p020r2.s3;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 h*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002/*B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0017R+\u0010\u0006\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010\u0005R+\u00101\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u0005R\"\u00104\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\b3\u0010,\"\u0004\b\u0001\u0010\u0005R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R+\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001f0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u00103R \u0010g\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010b¨\u0006i"}, d2 = {"Lp1/z0;", "S", "Lp1/n1;", "initialState", "<init>", "(Ljava/lang/Object;)V", "targetState", "Ljn0/h0;", "X", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fraction", "P", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/g0;", "animationSpec", "B", "(Ljava/lang/Object;Lp1/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/l1;", "transition", "f", "(Lp1/l1;)V", "g", "()V", "L", Gender.MALE, "E", Gender.OTHER, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", "A", "Lp1/z0$b;", "animation", "", "deltaPlayTimeNanos", Gender.NONE, "(Lp1/z0$b;J)V", "Z", "Y", "K", "R", "<set-?>", "b", "Lr2/p1;", "()Ljava/lang/Object;", "V", "c", "a", DateTokenConverter.CONVERTER_KEY, "currentState", "Ljava/lang/Object;", Gender.FEMALE, "composedTargetState", "e", "Lp1/l1;", "J", "()J", "W", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "Lwn0/a;", "recalculateTotalDurationNanos", "h", "Lr2/l1;", "I", "()F", Gender.UNKNOWN, "(F)V", "Lkotlinx/coroutines/CancellableContinuation;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CancellableContinuation;", "G", "()Lkotlinx/coroutines/CancellableContinuation;", "T", "(Lkotlinx/coroutines/CancellableContinuation;)V", "compositionContinuation", "Lkotlinx/coroutines/sync/Mutex;", "j", "Lkotlinx/coroutines/sync/Mutex;", "H", "()Lkotlinx/coroutines/sync/Mutex;", "compositionContinuationMutex", "Lp1/w0;", "k", "Lp1/w0;", "mutatorMutex", "l", "lastFrameTimeNanos", "Landroidx/collection/i0;", "m", "Landroidx/collection/i0;", "initialValueAnimations", "n", "Lp1/z0$b;", "currentAnimation", "Lkotlin/Function1;", "o", "Lwn0/l;", "firstFrameLambda", "p", "durationScale", "q", "animateOneFrameLambda", "r", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z0<S> extends n1<S> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f100686r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f100687s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final m f100688t = new m(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final m f100689u = new m(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 targetState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 currentState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private S composedTargetState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l1<S> transition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long totalDurationNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> recalculateTotalDurationNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l1 fraction;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CancellableContinuation<? super S> compositionContinuation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Mutex compositionContinuationMutex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final w0 mutatorMutex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i0<b> initialValueAnimations;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private b currentAnimation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final l<Long, h0> firstFrameLambda;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float durationScale;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l<Long, h0> animateOneFrameLambda;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lp1/z0$a;", "", "<init>", "()V", "Lp1/m;", "ZeroVelocity", "Lp1/m;", "b", "()Lp1/m;", "Target1", "a", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return z0.f100689u;
        }

        public final m b() {
            return z0.f100688t;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b-\u0010+R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b/\u0010\rR\"\u00102\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b1\u0010\r¨\u00063"}, d2 = {"Lp1/z0$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "n", "(J)V", "progressNanos", "Lp1/s1;", "Lp1/m;", "b", "Lp1/s1;", "()Lp1/s1;", IntegerTokenConverter.CONVERTER_KEY, "(Lp1/s1;)V", "animationSpec", "", "c", "Z", "h", "()Z", "k", "(Z)V", "isComplete", "", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "g", "()F", "o", "(F)V", "value", "Lp1/m;", "f", "()Lp1/m;", "setStart", "(Lp1/m;)V", "start", "m", "initialVelocity", "l", "durationNanos", "j", "animationSpecDuration", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long progressNanos;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private s1<m> animationSpec;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float value;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private m start = new m(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private m initialVelocity;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long durationNanos;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long animationSpecDuration;

        public final s1<m> a() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getDurationNanos() {
            return this.durationNanos;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getInitialVelocity() {
            return this.initialVelocity;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getProgressNanos() {
            return this.progressNanos;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final m getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void i(s1<m> s1Var) {
            this.animationSpec = s1Var;
        }

        public final void j(long j11) {
            this.animationSpecDuration = j11;
        }

        public final void k(boolean z11) {
            this.isComplete = z11;
        }

        public final void l(long j11) {
            this.durationNanos = j11;
        }

        public final void m(m mVar) {
            this.initialVelocity = mVar;
        }

        public final void n(long j11) {
            this.progressNanos = j11;
        }

        public final void o(float f11) {
            this.value = f11;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "frameTimeNanos", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<S> f100714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z0<S> z0Var) {
            super(1);
            this.f100714c = z0Var;
        }

        public final void a(long j11) {
            long j12 = j11 - ((z0) this.f100714c).lastFrameTimeNanos;
            ((z0) this.f100714c).lastFrameTimeNanos = j11;
            long jE = yn0.a.e(j12 / ((double) ((z0) this.f100714c).durationScale));
            if (((z0) this.f100714c).initialValueAnimations.d()) {
                i0 i0Var = ((z0) this.f100714c).initialValueAnimations;
                z0<S> z0Var = this.f100714c;
                Object[] objArr = i0Var.content;
                int i11 = i0Var._size;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    b bVar = (b) objArr[i13];
                    z0Var.N(bVar, jE);
                    bVar.k(true);
                }
                l1 l1Var = ((z0) this.f100714c).transition;
                if (l1Var != null) {
                    l1Var.Q();
                }
                i0 i0Var2 = ((z0) this.f100714c).initialValueAnimations;
                int i14 = i0Var2._size;
                Object[] objArr2 = i0Var2.content;
                bo0.j jVarW = n.w(0, i14);
                int first = jVarW.getFirst();
                int last = jVarW.getLast();
                if (first <= last) {
                    while (true) {
                        objArr2[first - i12] = objArr2[first];
                        if (((b) objArr2[first]).getIsComplete()) {
                            i12++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                p013kotlin.collections.n.z(objArr2, null, i14 - i12, i14);
                i0Var2._size -= i12;
            }
            b bVar2 = ((z0) this.f100714c).currentAnimation;
            if (bVar2 != null) {
                bVar2.l(this.f100714c.getTotalDurationNanos());
                this.f100714c.N(bVar2, jE);
                this.f100714c.U(bVar2.getValue());
                if (bVar2.getValue() == 1.0f) {
                    ((z0) this.f100714c).currentAnimation = null;
                }
                this.f100714c.R();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100715n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l1<S> f100716o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ z0<S> f100717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ S f100718q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g0<Float> f100719r;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2191, 636, 638, 690, 692}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f100720n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f100721o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f100722p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ z0<S> f100723q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ S f100724r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l1<S> f100725s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ g0<Float> f100726t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z0<S> z0Var, S s11, l1<S> l1Var, g0<Float> g0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100723q = z0Var;
                this.f100724r = s11;
                this.f100725s = l1Var;
                this.f100726t = g0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f100723q, this.f100724r, this.f100725s, this.f100726t, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:38:0x00df  */
            /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
            /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:47:0x0102  */
            /* JADX WARN: Code duplicated, block: B:49:0x0118  */
            /* JADX WARN: Code duplicated, block: B:51:0x0129  */
            /* JADX WARN: Code duplicated, block: B:52:0x012b  */
            /* JADX WARN: Code duplicated, block: B:62:0x015e  */
            /* JADX WARN: Code duplicated, block: B:64:0x0168  */
            /* JADX WARN: Code duplicated, block: B:67:0x019b  */
            /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
            /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
            
                if (r2.Y(r18) == r0) goto L75;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 504
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p1.z0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l1<S> l1Var, z0<S> z0Var, S s11, g0<Float> g0Var, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f100716o = l1Var;
            this.f100717p = z0Var;
            this.f100718q = s11;
            this.f100719r = g0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new d(this.f100716o, this.f100717p, this.f100718q, this.f100719r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100715n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = new a(this.f100717p, this.f100718q, this.f100716o, this.f100719r, null);
                this.f100715n = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f100716o.z();
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((d) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "frameTimeNanos", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<S> f100727c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z0<S> z0Var) {
            super(1);
            this.f100727c = z0Var;
        }

        public final void a(long j11) {
            ((z0) this.f100727c).lastFrameTimeNanos = j11;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<S> f100728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z0<S> z0Var) {
            super(0);
            this.f100728c = z0Var;
        }

        public final void b() {
            z0<S> z0Var = this.f100728c;
            l1 l1Var = ((z0) z0Var).transition;
            z0Var.W(l1Var != null ? l1Var.q() : 0L);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {370, 373}, m = "runAnimations", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f100730o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ z0<S> f100731p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f100732q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z0<S> z0Var, Continuation<? super g> continuation) {
            super(continuation);
            this.f100731p = z0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f100730o = obj;
            this.f100732q |= Integer.MIN_VALUE;
            return this.f100731p.O(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100733n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ S f100734o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ S f100735p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ z0<S> f100736q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l1<S> f100737r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f100738s;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f100739n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f100740o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ S f100741p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ S f100742q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ z0<S> f100743r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l1<S> f100744s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ float f100745t;

            /* JADX INFO: renamed from: p1.z0$h$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
            static final class C2134a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f100746n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ z0<S> f100747o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2134a(z0<S> z0Var, Continuation<? super C2134a> continuation) {
                    super(2, continuation);
                    this.f100747o = z0Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2134a(this.f100747o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f100746n;
                    if (i11 == 0) {
                        t.b(obj);
                        z0<S> z0Var = this.f100747o;
                        this.f100746n = 1;
                        if (z0Var.O(this) == coroutine_suspended) {
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
                    return ((C2134a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(S s11, S s12, z0<S> z0Var, l1<S> l1Var, float f11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100741p = s11;
                this.f100742q = s12;
                this.f100743r = z0Var;
                this.f100744s = l1Var;
                this.f100745t = f11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f100741p, this.f100742q, this.f100743r, this.f100744s, this.f100745t, continuation);
                aVar.f100740o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f100739n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f100740o;
                    if (s.f(this.f100741p, this.f100742q)) {
                        ((z0) this.f100743r).currentAnimation = null;
                        if (s.f(this.f100743r.a(), this.f100741p)) {
                            return h0.f84049a;
                        }
                    } else {
                        this.f100743r.K();
                    }
                    if (!s.f(this.f100741p, this.f100742q)) {
                        this.f100744s.R(this.f100741p);
                        this.f100744s.J(0L);
                        this.f100743r.V(this.f100741p);
                        this.f100744s.E(this.f100745t);
                    }
                    this.f100743r.U(this.f100745t);
                    if (((z0) this.f100743r).initialValueAnimations.d()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C2134a(this.f100743r, null), 3, null);
                    } else {
                        ((z0) this.f100743r).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    z0<S> z0Var = this.f100743r;
                    this.f100739n = 1;
                    if (z0Var.Z(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                this.f100743r.R();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(S s11, S s12, z0<S> z0Var, l1<S> l1Var, float f11, Continuation<? super h> continuation) {
            super(1, continuation);
            this.f100734o = s11;
            this.f100735p = s12;
            this.f100736q = z0Var;
            this.f100737r = l1Var;
            this.f100738s = f11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new h(this.f100734o, this.f100735p, this.f100736q, this.f100737r, this.f100738s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100733n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = new a(this.f100734o, this.f100735p, this.f100736q, this.f100737r, this.f100738s, null);
                this.f100733n = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((h) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100748n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ z0<S> f100749o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ S f100750p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l1<S> f100751q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(z0<S> z0Var, S s11, l1<S> l1Var, Continuation<? super i> continuation) {
            super(1, continuation);
            this.f100749o = z0Var;
            this.f100750p = s11;
            this.f100751q = l1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new i(this.f100749o, this.f100750p, this.f100751q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100748n;
            if (i11 == 0) {
                t.b(obj);
                this.f100749o.E();
                ((z0) this.f100749o).lastFrameTimeNanos = Long.MIN_VALUE;
                this.f100749o.U(BitmapDescriptorFactory.HUE_RED);
                S s11 = this.f100750p;
                if (s.f(s11, this.f100749o.a())) {
                    f11 = -4.0f;
                } else {
                    f11 = s.f(s11, this.f100749o.b()) ? -5.0f : -3.0f;
                }
                this.f100751q.R(this.f100750p);
                this.f100751q.J(0L);
                this.f100749o.V(this.f100750p);
                this.f100749o.U(BitmapDescriptorFactory.HUE_RED);
                this.f100749o.d(this.f100750p);
                this.f100751q.E(f11);
                if (f11 == -3.0f) {
                    z0<S> z0Var = this.f100749o;
                    this.f100748n = 1;
                    if (z0Var.Z(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f100751q.z();
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((i) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {566, 2186}, m = "waitForComposition", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f100753o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f100754p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ z0<S> f100755q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f100756r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(z0<S> z0Var, Continuation<? super j> continuation) {
            super(continuation);
            this.f100755q = z0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f100754p = obj;
            this.f100756r |= Integer.MIN_VALUE;
            return this.f100755q.Y(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {542, 2186}, m = "waitForCompositionAfterTargetStateChange", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f100758o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f100759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ z0<S> f100760q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f100761r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(z0<S> z0Var, Continuation<? super k> continuation) {
            super(continuation);
            this.f100760q = z0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f100759p = obj;
            this.f100761r |= Integer.MIN_VALUE;
            return this.f100760q.Z(this);
        }
    }

    public z0(S s11) {
        super(null);
        this.targetState = s3.d(s11, null, 2, null);
        this.currentState = s3.d(s11, null, 2, null);
        this.composedTargetState = s11;
        this.recalculateTotalDurationNanos = new f(this);
        this.fraction = b2.a(BitmapDescriptorFactory.HUE_RED);
        this.compositionContinuationMutex = MutexKt.Mutex$default(false, 1, null);
        this.mutatorMutex = new w0();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new i0<>(0, 1, null);
        this.firstFrameLambda = new e(this);
        this.animateOneFrameLambda = new c(this);
    }

    private final Object A(Continuation<? super h0> continuation) {
        float fN = j1.n(continuation.getContext());
        if (fN <= BitmapDescriptorFactory.HUE_RED) {
            E();
            return h0.f84049a;
        }
        this.durationScale = fN;
        Object objC = h1.c(this.animateOneFrameLambda, continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object C(z0 z0Var, Object obj, g0 g0Var, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = z0Var.b();
        }
        if ((i11 & 2) != 0) {
            g0Var = null;
        }
        return z0Var.B(obj, g0Var, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(Continuation<? super h0> continuation) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objC = h1.c(this.firstFrameLambda, continuation);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
        }
        Object objA = A(continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        l1<S> l1Var = this.transition;
        if (l1Var != null) {
            l1Var.g();
        }
        this.initialValueAnimations.h();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            U(1.0f);
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        l1<S> l1Var = this.transition;
        if (l1Var == null) {
            return;
        }
        b bVar = this.currentAnimation;
        if (bVar == null) {
            if (this.totalDurationNanos <= 0 || I() == 1.0f || s.f(a(), b())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.o(I());
                long j11 = this.totalDurationNanos;
                bVar.l(j11);
                bVar.j(yn0.a.e(j11 * (1.0d - ((double) I()))));
                bVar.getStart().e(0, I());
            }
        }
        if (bVar != null) {
            bVar.l(this.totalDurationNanos);
            this.initialValueAnimations.g(bVar);
            l1Var.I(bVar);
        }
        this.currentAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(b animation, long deltaPlayTimeNanos) {
        long progressNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.n(progressNanos);
        long animationSpecDuration = animation.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            animation.o(1.0f);
            return;
        }
        s1<m> s1VarA = animation.a();
        if (s1VarA == null) {
            animation.o(r1.k(animation.getStart().a(0), 1.0f, progressNanos / animationSpecDuration));
            return;
        }
        m start = animation.getStart();
        m mVar = f100689u;
        m initialVelocity = animation.getInitialVelocity();
        if (initialVelocity == null) {
            initialVelocity = f100688t;
        }
        animation.o(n.m(((m) s1VarA.e(progressNanos, start, mVar, initialVelocity)).a(0), BitmapDescriptorFactory.HUE_RED, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (p020r2.h1.c(r10, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p1.z0.g
            if (r0 == 0) goto L13
            r0 = r10
            p1.z0$g r0 = (p1.z0.g) r0
            int r1 = r0.f100732q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100732q = r1
            goto L18
        L13:
            p1.z0$g r0 = new p1.z0$g
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f100730o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f100732q
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.f100729n
            p1.z0 r2 = (p019p1.z0) r2
            jn0.t.b(r10)
            goto L76
        L3b:
            jn0.t.b(r10)
            androidx.collection.i0<p1.z0$b> r10 = r9.initialValueAnimations
            boolean r10 = r10.c()
            if (r10 == 0) goto L4d
            p1.z0$b r10 = r9.currentAnimation
            if (r10 != 0) goto L4d
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        L4d:
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            float r10 = p019p1.j1.n(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.E()
            r9.lastFrameTimeNanos = r5
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        L62:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            wn0.l<java.lang.Long, jn0.h0> r10 = r9.firstFrameLambda
            r0.f100729n = r9
            r0.f100732q = r4
            java.lang.Object r10 = p020r2.h1.c(r10, r0)
            if (r10 != r1) goto L75
            goto L92
        L75:
            r2 = r9
        L76:
            androidx.collection.i0<p1.z0$b> r10 = r2.initialValueAnimations
            boolean r10 = r10.d()
            if (r10 != 0) goto L88
            p1.z0$b r10 = r2.currentAnimation
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.lastFrameTimeNanos = r5
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        L88:
            r0.f100729n = r2
            r0.f100732q = r3
            java.lang.Object r10 = r2.A(r0)
            if (r10 != r1) goto L76
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p019p1.z0.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object Q(z0 z0Var, float f11, Object obj, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = z0Var.b();
        }
        return z0Var.P(f11, obj, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        l1<S> l1Var = this.transition;
        if (l1Var == null) {
            return;
        }
        l1Var.H(yn0.a.e(((double) I()) * l1Var.q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(float f11) {
        this.fraction.r(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(Continuation<? super h0> continuation) {
        j jVar;
        Object objB;
        z0 z0Var;
        Object obj;
        z0 z0Var2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f100756r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f100756r = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, continuation);
            }
        } else {
            jVar = new j(this, continuation);
        }
        Object obj2 = jVar.f100754p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f100756r;
        if (i12 == 0) {
            t.b(obj2);
            objB = b();
            Mutex mutex = this.compositionContinuationMutex;
            jVar.f100752n = this;
            jVar.f100753o = objB;
            jVar.f100756r = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, jVar, 1, null) != coroutine_suspended) {
                z0Var = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Object obj3 = jVar.f100753o;
            z0Var = (z0) jVar.f100752n;
            t.b(obj2);
            objB = obj3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = jVar.f100753o;
            z0Var2 = (z0) jVar.f100752n;
            t.b(obj2);
        }
        if (s.f(obj2, obj)) {
            return h0.f84049a;
        }
        z0Var2.lastFrameTimeNanos = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        jVar.f100752n = z0Var;
        jVar.f100753o = objB;
        jVar.f100756r = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(jVar), 1);
        cancellableContinuationImpl.initCancellability();
        z0Var.T(cancellableContinuationImpl);
        Mutex.DefaultImpls.unlock$default(z0Var.getCompositionContinuationMutex(), null, 1, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(jVar);
        }
        if (result != coroutine_suspended) {
            obj = objB;
            obj2 = result;
            z0Var2 = z0Var;
            if (s.f(obj2, obj)) {
                return h0.f84049a;
            }
            z0Var2.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a3, please report this as an issue */
    public final Object Z(Continuation<? super h0> continuation) {
        k kVar;
        Object objB;
        z0 z0Var;
        Object obj;
        z0 z0Var2;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f100761r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f100761r = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, continuation);
            }
        } else {
            kVar = new k(this, continuation);
        }
        Object obj2 = kVar.f100759p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f100761r;
        if (i12 == 0) {
            t.b(obj2);
            objB = b();
            Mutex mutex = this.compositionContinuationMutex;
            kVar.f100757n = this;
            kVar.f100758o = objB;
            kVar.f100761r = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, kVar, 1, null) != coroutine_suspended) {
                z0Var = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Object obj3 = kVar.f100758o;
            z0Var = (z0) kVar.f100757n;
            t.b(obj2);
            objB = obj3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = kVar.f100758o;
            z0Var2 = (z0) kVar.f100757n;
            t.b(obj2);
        }
        if (!s.f(obj2, obj)) {
            z0Var2.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return h0.f84049a;
        if (!s.f(objB, z0Var.composedTargetState)) {
            kVar.f100757n = z0Var;
            kVar.f100758o = objB;
            kVar.f100761r = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(kVar), 1);
            cancellableContinuationImpl.initCancellability();
            z0Var.T(cancellableContinuationImpl);
            Mutex.DefaultImpls.unlock$default(z0Var.getCompositionContinuationMutex(), null, 1, null);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(kVar);
            }
            if (result != coroutine_suspended) {
                obj = objB;
                obj2 = result;
                z0Var2 = z0Var;
                if (!s.f(obj2, obj)) {
                    z0Var2.lastFrameTimeNanos = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return coroutine_suspended;
        }
        Mutex.DefaultImpls.unlock$default(z0Var.compositionContinuationMutex, null, 1, null);
        return h0.f84049a;
    }

    public final Object B(S s11, g0<Float> g0Var, Continuation<? super h0> continuation) {
        l1<S> l1Var = this.transition;
        if (l1Var == null) {
            return h0.f84049a;
        }
        Object objE = w0.e(this.mutatorMutex, null, new d(l1Var, this, s11, g0Var, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public final S F() {
        return this.composedTargetState;
    }

    public final CancellableContinuation<S> G() {
        return this.compositionContinuation;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Mutex getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    public final float I() {
        return this.fraction.d();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public final void L() {
        m1.e().o(this, m1.f100497a, this.recalculateTotalDurationNanos);
    }

    public final void M() {
        long j11 = this.totalDurationNanos;
        L();
        long j12 = this.totalDurationNanos;
        if (j11 != j12) {
            b bVar = this.currentAnimation;
            if (bVar == null) {
                if (j12 != 0) {
                    R();
                }
            } else {
                bVar.l(j12);
                if (bVar.a() == null) {
                    bVar.j(yn0.a.e((1.0d - ((double) bVar.getStart().a(0))) * this.totalDurationNanos));
                }
            }
        }
    }

    public final Object P(float f11, S s11, Continuation<? super h0> continuation) {
        boolean z11 = false;
        if (BitmapDescriptorFactory.HUE_RED <= f11 && f11 <= 1.0f) {
            z11 = true;
        }
        if (!z11) {
            x0.a("Expecting fraction between 0 and 1. Got " + f11);
        }
        l1<S> l1Var = this.transition;
        if (l1Var == null) {
            return h0.f84049a;
        }
        Object objE = w0.e(this.mutatorMutex, null, new h(s11, b(), this, l1Var, f11, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public final void S(S s11) {
        this.composedTargetState = s11;
    }

    public final void T(CancellableContinuation<? super S> cancellableContinuation) {
        this.compositionContinuation = cancellableContinuation;
    }

    public void V(S s11) {
        this.targetState.setValue(s11);
    }

    public final void W(long j11) {
        this.totalDurationNanos = j11;
    }

    public final Object X(S s11, Continuation<? super h0> continuation) {
        l1<S> l1Var = this.transition;
        if (l1Var == null) {
            return h0.f84049a;
        }
        if (s.f(a(), s11) && s.f(b(), s11)) {
            return h0.f84049a;
        }
        Object objE = w0.e(this.mutatorMutex, null, new i(this, s11, l1Var, null), continuation, 1, null);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    @Override // p019p1.n1
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // p019p1.n1
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // p019p1.n1
    public void d(S s11) {
        this.currentState.setValue(s11);
    }

    @Override // p019p1.n1
    public void f(l1<S> transition) {
        l1<S> l1Var = this.transition;
        if (!(l1Var == null || s.f(transition, l1Var))) {
            x0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // p019p1.n1
    public void g() {
        this.transition = null;
        m1.e().k(this);
    }
}
