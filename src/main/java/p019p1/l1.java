package p019p1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.a0;
import p020r2.b2;
import p020r2.g3;
import p020r2.h1;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n1;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y3;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004DF,'B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u0012J'\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u001a2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u001a2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\u001a2\u0018\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\u00102\u0018\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0001¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u0010\u001fJ\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0015H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0000¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0010H\u0000¢\u0006\u0004\b=\u0010\u0012J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020\u00102\u0018\u0010A\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030@R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\bK\u0010?R+\u0010\"\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00101R7\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000Q2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000Q8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010M\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010Z\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010\u000f\"\u0004\bY\u0010\u001fR+\u0010]\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010W\u001a\u0004\b[\u0010\u000f\"\u0004\b\\\u0010\u001fR+\u0010c\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR,\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001e\u0010i\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR+\u0010l\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u001a8G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010M\u001a\u0004\bj\u0010`\"\u0004\bk\u0010bR\"\u0010p\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bm\u0010\u000f\"\u0004\bo\u0010\u001fR\u001b\u0010t\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010\u000fR\u0011\u0010u\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\be\u0010OR\u0011\u0010w\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bv\u0010`R$\u0010#\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010\u000f\"\u0004\bn\u0010\u001fR)\u0010{\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u00000y8F¢\u0006\u0006\u001a\u0004\b^\u0010zR\u001a\u0010}\u001a\u00020\u001a8GX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0012\u001a\u0004\bh\u0010`¨\u0006~"}, d2 = {"Lp1/l1;", "S", "", "Lp1/n1;", "transitionState", "parentTransition", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lp1/n1;Lp1/l1;Ljava/lang/String;)V", "(Lp1/n1;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "f", "()J", "Ljn0/h0;", Gender.FEMALE, "()V", "v", "frameTimeNanos", "", "durationScale", "x", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "y", "(JZ)V", "A", "(J)V", "w", "z", "targetState", "playTimeNanos", "G", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", DateTokenConverter.CONVERTER_KEY, "(Lp1/l1;)Z", "D", "Lp1/l1$d;", "animation", "c", "(Lp1/l1$d;)Z", "C", "(Lp1/l1$d;)V", "R", "(Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;Lr2/l;I)V", "H", "Lp1/z0$b;", "animationState", "I", "(Lp1/z0$b;)V", "fraction", "E", "(F)V", "g", "Q", "toString", "()Ljava/lang/String;", "Lp1/l1$a;", "deferredAnimation", "B", "(Lp1/l1$a;)V", "a", "Lp1/n1;", "b", "Lp1/l1;", "getParentTransition", "()Lp1/l1;", "Ljava/lang/String;", "k", "<set-?>", "Lr2/p1;", "p", "()Ljava/lang/Object;", Gender.NONE, "Lp1/l1$b;", "n", "()Lp1/l1$b;", "L", "(Lp1/l1$b;)V", "segment", "Lr2/n1;", "s", "P", "_playTimeNanos", "o", Gender.MALE, "startTimeNanos", "h", "r", "()Z", Gender.OTHER, "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/k;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/compose/runtime/snapshots/k;", "_animations", "j", "_transitions", "u", "K", "isSeeking", "l", "J", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "m", "Lr2/y3;", "q", "totalDurationNanos", "currentState", "t", "isRunning", "value", "", "()Ljava/util/List;", "animations", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l1<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n1<S> transitionState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1<?> parentTransition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 targetState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 segment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n1 _playTimeNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n1 startTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p1 updateChildrenNeeded;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<l1<S>.d<?, ?>> _animations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<l1<?>> _transitions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 isSeeking;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final y3 totalDurationNanos;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0011B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010$\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e2.\u0010\u001f\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Lp1/l1$a;", "T", "Lp1/q;", "V", "", "Lp1/p1;", "typeConverter", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lp1/l1;Lp1/p1;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lp1/l1$b;", "Lp1/g0;", "transitionSpec", "targetValueByState", "Lr2/y3;", "a", "(Lwn0/l;Lwn0/l;)Lr2/y3;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Lp1/p1;", "getTypeConverter", "()Lp1/p1;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lp1/l1$a$a;", "Lp1/l1;", "<set-?>", "c", "Lr2/p1;", "()Lp1/l1$a$a;", "(Lp1/l1$a$a;)V", "data", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a<T, V extends q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p1<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p1 data = s3.d(null, null, 2, null);

        /* JADX INFO: renamed from: p1.l1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R:\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010\"\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lp1/l1$a$a;", "T", "Lp1/q;", "V", "Lr2/y3;", "Lp1/l1$d;", "Lp1/l1;", "animation", "Lkotlin/Function1;", "Lp1/l1$b;", "Lp1/g0;", "transitionSpec", "targetValueByState", "<init>", "(Lp1/l1$a;Lp1/l1$d;Lwn0/l;Lwn0/l;)V", "segment", "Ljn0/h0;", "t", "(Lp1/l1$b;)V", "a", "Lp1/l1$d;", "k", "()Lp1/l1$d;", "b", "Lwn0/l;", "o", "()Lwn0/l;", "q", "(Lwn0/l;)V", "c", "n", "p", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class C2130a<T, V extends q> implements y3<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final l1<S>.d<T, V> animation;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private l<? super b<S>, ? extends g0<T>> transitionSpec;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private l<? super S, ? extends T> targetValueByState;

            public C2130a(l1<S>.d<T, V> dVar, l<? super b<S>, ? extends g0<T>> lVar, l<? super S, ? extends T> lVar2) {
                this.animation = dVar;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            @Override // p020r2.y3
            public T getValue() {
                t(l1.this.n());
                return this.animation.getValue();
            }

            public final l1<S>.d<T, V> k() {
                return this.animation;
            }

            public final l<S, T> n() {
                return this.targetValueByState;
            }

            public final l<b<S>, g0<T>> o() {
                return this.transitionSpec;
            }

            public final void p(l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void q(l<? super b<S>, ? extends g0<T>> lVar) {
                this.transitionSpec = lVar;
            }

            public final void t(b<S> segment) {
                T tInvoke = this.targetValueByState.invoke(segment.e());
                if (!l1.this.u()) {
                    this.animation.S(tInvoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.Q(this.targetValueByState.invoke(segment.getInitialState()), tInvoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public a(p1<T, V> p1Var, String str) {
            this.typeConverter = p1Var;
            this.label = str;
        }

        public final y3<T> a(l<? super b<S>, ? extends g0<T>> transitionSpec, l<? super S, ? extends T> targetValueByState) {
            l1<S>.C2130a<T, V>.C0000a<T, V> c2130aB = b();
            if (c2130aB == null) {
                l1<S> l1Var = l1.this;
                c2130aB = new C2130a<>(l1Var.new d(targetValueByState.invoke(l1Var.i()), l.i(this.typeConverter, targetValueByState.invoke(l1.this.i())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                l1<S> l1Var2 = l1.this;
                c(c2130aB);
                l1Var2.c(c2130aB.k());
            }
            l1<S> l1Var3 = l1.this;
            c2130aB.p(targetValueByState);
            c2130aB.q(transitionSpec);
            c2130aB.t(l1Var3.n());
            return c2130aB;
        }

        public final l1<S>.C2130a<T, V>.C0000a<T, V> b() {
            return (C2130a) this.data.getValue();
        }

        public final void c(l1<S>.C2130a<T, V>.C0000a<T, V> c2130a) {
            this.data.setValue(c2130a);
        }

        public final void d() {
            l1<S>.C2130a<T, V>.C0000a<T, V> c2130aB = b();
            if (c2130aB != null) {
                l1<S> l1Var = l1.this;
                c2130aB.k().Q(c2130aB.n().invoke(l1Var.n().getInitialState()), c2130aB.n().invoke(l1Var.n().e()), c2130aB.o().invoke(l1Var.n()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lp1/l1$b;", "S", "", "targetState", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getInitialState", "()Ljava/lang/Object;", "initialState", "e", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b<S> {
        default boolean b(S s11, S s12) {
            return s.f(s11, getInitialState()) && s.f(s12, e());
        }

        S e();

        S getInitialState();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lp1/l1$c;", "S", "Lp1/l1$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "getInitialState", "()Ljava/lang/Object;", "b", "e", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        public c(S s11, S s12) {
            this.initialState = s11;
            this.targetState = s12;
        }

        @Override // p1.l1.b
        public S e() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return s.f(getInitialState(), bVar.getInitialState()) && s.f(e(), bVar.e());
        }

        @Override // p1.l1.b
        public S getInitialState() {
            return this.initialState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S sE = e();
            return iHashCode + (sE != null ? sE.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b,\u0010-R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010&R+\u0010'\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R7\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010(8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRC\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020E2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020E8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00107\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010Q\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010#R$\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR+\u0010Z\u001a\u00020\r2\u0006\u00105\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u00107\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010`\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u001fR\u0016\u0010b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010aR+\u0010f\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00107\u001a\u0004\bd\u00109\"\u0004\be\u0010;R\u0016\u0010i\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR+\u0010n\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010\u0018R\u0016\u0010o\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010aR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010p¨\u0006r"}, d2 = {"Lp1/l1$d;", "T", "Lp1/q;", "V", "Lr2/y3;", "initialValue", "initialVelocityVector", "Lp1/p1;", "typeConverter", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lp1/l1;Ljava/lang/Object;Lp1/q;Lp1/p1;Ljava/lang/String;)V", "", "isInterrupted", "Ljn0/h0;", Gender.OTHER, "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "C", "(JZ)V", Gender.FEMALE, "(J)V", "R", "()V", "D", "", "fraction", "E", "(F)V", "Lp1/z0$b;", "animationState", "K", "(Lp1/z0$b;)V", "k", "toString", "()Ljava/lang/String;", "targetValue", "Lp1/g0;", "animationSpec", "S", "(Ljava/lang/Object;Lp1/g0;)V", "Q", "(Ljava/lang/Object;Ljava/lang/Object;Lp1/g0;)V", "a", "Lp1/p1;", "getTypeConverter", "()Lp1/p1;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "c", "Lr2/p1;", "u", "()Ljava/lang/Object;", Gender.MALE, "(Ljava/lang/Object;)V", "Lp1/e1;", DateTokenConverter.CONVERTER_KEY, "Lp1/e1;", "defaultSpring", "e", "o", "()Lp1/g0;", "H", "(Lp1/g0;)V", "Lp1/k1;", "f", "n", "()Lp1/k1;", "G", "(Lp1/k1;)V", "animation", "g", "Lp1/z0$b;", "q", "()Lp1/z0$b;", "setInitialValueState$animation_core_release", "initialValueState", "h", "Lp1/k1;", "initialValueAnimation", IntegerTokenConverter.CONVERTER_KEY, "B", "()Z", "J", "(Z)V", "isFinished", "j", "Lr2/l1;", "t", "()F", "L", "resetSnapValue", "Z", "useOnlyInitialValue", "l", "getValue", Gender.NONE, "value", "m", "Lp1/q;", "velocityVector", "Lr2/n1;", "p", "()J", "I", "durationNanos", "isSeeking", "Lp1/g0;", "interruptionSpec", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d<T, V extends q> implements y3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p1<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p1 targetValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final e1<T> defaultSpring;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final p1 animationSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final p1 animation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private z0.b initialValueState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private k1<T, V> initialValueAnimation;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final p1 isFinished;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final p020r2.l1 resetSnapValue;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final p1 value;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private V velocityVector;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final n1 durationNanos;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final g0<T> interruptionSpec;

        public d(T t11, V v11, p1<T, V> p1Var, String str) {
            T tInvoke;
            this.typeConverter = p1Var;
            this.label = str;
            this.targetValue = s3.d(t11, null, 2, null);
            e1<T> e1VarJ = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            this.defaultSpring = e1VarJ;
            this.animationSpec = s3.d(e1VarJ, null, 2, null);
            this.animation = s3.d(new k1(o(), p1Var, t11, u(), v11), null, 2, null);
            this.isFinished = s3.d(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = b2.a(-1.0f);
            this.value = s3.d(t11, null, 2, null);
            this.velocityVector = v11;
            this.durationNanos = g3.a(n().getDurationNanos());
            Float f11 = f2.h().get(p1Var);
            if (f11 != null) {
                float fFloatValue = f11.floatValue();
                V vInvoke = p1Var.a().invoke(t11);
                int size = vInvoke.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    vInvoke.e(i11, fFloatValue);
                }
                tInvoke = this.typeConverter.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, tInvoke, 3, null);
        }

        private final void G(k1<T, V> k1Var) {
            this.animation.setValue(k1Var);
        }

        private final void H(g0<T> g0Var) {
            this.animationSpec.setValue(g0Var);
        }

        private final void M(T t11) {
            this.targetValue.setValue(t11);
        }

        private final void O(T initialValue, boolean isInterrupted) {
            k1<T, V> k1Var = this.initialValueAnimation;
            if (s.f(k1Var != null ? k1Var.f() : null, u())) {
                G(new k1<>(this.interruptionSpec, this.typeConverter, initialValue, initialValue, r.g(this.velocityVector)));
                this.useOnlyInitialValue = true;
                I(n().getDurationNanos());
                return;
            }
            i iVarO = (!isInterrupted || this.isSeeking || (o() instanceof e1)) ? o() : this.interruptionSpec;
            if (l1.this.m() > 0) {
                iVarO = j.c(iVarO, l1.this.m());
            }
            G(new k1<>(iVarO, this.typeConverter, initialValue, u(), this.velocityVector));
            I(n().getDurationNanos());
            this.useOnlyInitialValue = false;
            l1.this.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void P(d dVar, Object obj, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            dVar.O(obj, z11);
        }

        private final T u() {
            return this.targetValue.getValue();
        }

        public final boolean B() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void C(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = n().getDurationNanos();
            }
            N(n().e(playTimeNanos));
            this.velocityVector = (V) n().g(playTimeNanos);
            if (n().b(playTimeNanos)) {
                J(true);
            }
        }

        public final void D() {
            L(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void E(float fraction) {
            if (fraction != -4.0f && fraction != -5.0f) {
                L(fraction);
                return;
            }
            k1<T, V> k1Var = this.initialValueAnimation;
            if (k1Var != null) {
                n().j(k1Var.f());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object objI = fraction == -4.0f ? n().i() : n().f();
            n().j(objI);
            n().k(objI);
            N(objI);
            I(n().getDurationNanos());
        }

        public final void F(long playTimeNanos) {
            if (t() == -1.0f) {
                this.isSeeking = true;
                if (s.f(n().f(), n().i())) {
                    N(n().f());
                } else {
                    N(n().e(playTimeNanos));
                    this.velocityVector = (V) n().g(playTimeNanos);
                }
            }
        }

        public final void I(long j11) {
            this.durationNanos.z(j11);
        }

        public final void J(boolean z11) {
            this.isFinished.setValue(Boolean.valueOf(z11));
        }

        public final void K(z0.b animationState) {
            if (!s.f(n().f(), n().i())) {
                this.initialValueAnimation = n();
                this.initialValueState = animationState;
            }
            G(new k1<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), r.g(this.velocityVector)));
            I(n().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void L(float f11) {
            this.resetSnapValue.r(f11);
        }

        public void N(T t11) {
            this.value.setValue(t11);
        }

        public final void Q(T initialValue, T targetValue, g0<T> animationSpec) {
            M(targetValue);
            H(animationSpec);
            if (s.f(n().i(), initialValue) && s.f(n().f(), targetValue)) {
                return;
            }
            P(this, initialValue, false, 2, null);
        }

        public final void R() {
            k1<T, V> k1Var;
            z0.b bVar = this.initialValueState;
            if (bVar == null || (k1Var = this.initialValueAnimation) == null) {
                return;
            }
            long jE = yn0.a.e(bVar.getDurationNanos() * ((double) bVar.getValue()));
            T tE = k1Var.e(jE);
            if (this.useOnlyInitialValue) {
                n().k(tE);
            }
            n().j(tE);
            I(n().getDurationNanos());
            if (t() == -2.0f || this.useOnlyInitialValue) {
                N(tE);
            } else {
                F(l1.this.m());
            }
            if (jE < bVar.getDurationNanos()) {
                bVar.k(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void S(T targetValue, g0<T> animationSpec) {
            if (this.useOnlyInitialValue) {
                k1<T, V> k1Var = this.initialValueAnimation;
                if (s.f(targetValue, k1Var != null ? k1Var.f() : null)) {
                    return;
                }
            }
            if (s.f(u(), targetValue) && t() == -1.0f) {
                return;
            }
            M(targetValue);
            H(animationSpec);
            O(t() == -3.0f ? targetValue : getValue(), !B());
            J(t() == -3.0f);
            if (t() >= BitmapDescriptorFactory.HUE_RED) {
                N(n().e((long) (n().getDurationNanos() * t())));
            } else if (t() == -3.0f) {
                N(targetValue);
            }
            this.useOnlyInitialValue = false;
            L(-1.0f);
        }

        @Override // p020r2.y3
        public T getValue() {
            return this.value.getValue();
        }

        public final void k() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final k1<T, V> n() {
            return (k1) this.animation.getValue();
        }

        public final g0<T> o() {
            return (g0) this.animationSpec.getValue();
        }

        public final long p() {
            return this.durationNanos.c();
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final z0.b getInitialValueState() {
            return this.initialValueState;
        }

        public final float t() {
            return this.resetSnapValue.d();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + u() + ", spec: " + o();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<S> f100487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ S f100488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f100489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l1<S> l1Var, S s11, int i11) {
            super(2);
            this.f100487c = l1Var;
            this.f100488d = s11;
            this.f100489e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            this.f100487c.e(this.f100488d, lVar, k2.a(this.f100489e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.a<Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<S> f100490c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l1<S> l1Var) {
            super(0);
            this.f100490c = l1Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f100490c.f());
        }
    }

    public l1(n1<S> n1Var, l1<?> l1Var, String str) {
        this.transitionState = n1Var;
        this.parentTransition = l1Var;
        this.label = str;
        this.targetState = s3.d(i(), null, 2, null);
        this.segment = s3.d(new c(i(), i()), null, 2, null);
        this._playTimeNanos = g3.a(0L);
        this.startTimeNanos = g3.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = s3.d(bool, null, 2, null);
        this._animations = n3.f();
        this._transitions = n3.f();
        this.isSeeking = s3.d(bool, null, 2, null);
        this.totalDurationNanos = n3.e(new g(this));
        n1Var.f(this);
    }

    private final void F() {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).D();
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).F();
        }
    }

    private final void L(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void O(boolean z11) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z11));
    }

    private final void P(long j11) {
        this._playTimeNanos.z(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, snapshotStateList.get(i11).p());
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i12).f());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean r() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final long s() {
        return this._playTimeNanos.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        O(true);
        if (u()) {
            SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                l1<S>.d<?, ?> dVar = snapshotStateList.get(i11);
                jMax = Math.max(jMax, dVar.p());
                dVar.F(this.lastSeekedTimeNanos);
            }
            O(false);
        }
    }

    public final void A(long frameTimeNanos) {
        M(frameTimeNanos);
        this.transitionState.e(true);
    }

    public final void B(l1<S>.a<?, ?> deferredAnimation) {
        l1<S>.d<?, ?> dVarK;
        l1<S>.C2130a<?, ?>.C0000a<?, V> c2130aB = deferredAnimation.b();
        if (c2130aB == 0 || (dVarK = c2130aB.k()) == null) {
            return;
        }
        C(dVarK);
    }

    public final void C(l1<S>.d<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final boolean D(l1<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void E(float fraction) {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).E(fraction);
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).E(fraction);
        }
    }

    public final void G(S initialState, S targetState, long playTimeNanos) {
        M(Long.MIN_VALUE);
        this.transitionState.e(false);
        if (!u() || !s.f(i(), initialState) || !s.f(p(), targetState)) {
            if (!s.f(i(), initialState)) {
                n1<S> n1Var = this.transitionState;
                if (n1Var instanceof u0) {
                    n1Var.d(initialState);
                }
            }
            N(targetState);
            K(true);
            L(new c(initialState, targetState));
        }
        SnapshotStateList<l1<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            l1<?> l1Var = snapshotStateList.get(i11);
            s.i(l1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (l1Var.u()) {
                l1Var.G(l1Var.i(), l1Var.p(), playTimeNanos);
            }
        }
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).F(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void H(long playTimeNanos) {
        if (o() == Long.MIN_VALUE) {
            M(playTimeNanos);
        }
        J(playTimeNanos);
        O(false);
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).F(playTimeNanos);
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l1<?> l1Var = snapshotStateList2.get(i12);
            if (!s.f(l1Var.p(), l1Var.i())) {
                l1Var.H(playTimeNanos);
            }
        }
    }

    public final void I(z0.b animationState) {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).K(animationState);
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).I(animationState);
        }
    }

    public final void J(long j11) {
        if (this.parentTransition == null) {
            P(j11);
        }
    }

    public final void K(boolean z11) {
        this.isSeeking.setValue(Boolean.valueOf(z11));
    }

    public final void M(long j11) {
        this.startTimeNanos.z(j11);
    }

    public final void N(S s11) {
        this.targetState.setValue(s11);
    }

    public final void Q() {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).R();
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).Q();
        }
    }

    public final void R(S targetState) {
        if (s.f(p(), targetState)) {
            return;
        }
        L(new c(p(), targetState));
        if (!s.f(i(), p())) {
            this.transitionState.d(p());
        }
        N(targetState);
        if (!t()) {
            O(true);
        }
        F();
    }

    public final boolean c(l1<S>.d<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final boolean d(l1<?> transition) {
        return this._transitions.add(transition);
    }

    public final void e(S s11, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1493585151);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(s11) : lVarV.K(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(this) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1493585151, i12, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (u()) {
                lVarV.o(1823992347);
                lVarV.l();
            } else {
                lVarV.o(1822507602);
                R(s11);
                if (!s.f(s11, i()) || t() || r()) {
                    lVarV.o(1822738893);
                    Object objI = lVarV.I();
                    p020r2.l.Companion companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        a0 a0Var = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                        lVarV.B(a0Var);
                        objI = a0Var;
                    }
                    CoroutineScope coroutineScope = ((a0) objI).getCoroutineScope();
                    int i13 = i12 & 112;
                    boolean zK = (i13 == 32) | lVarV.K(coroutineScope);
                    Object objI2 = lVarV.I();
                    if (zK || objI2 == companion.a()) {
                        objI2 = new e(coroutineScope, this);
                        lVarV.B(objI2);
                    }
                    Function0.b(coroutineScope, this, (l) objI2, lVarV, i13);
                    lVarV.l();
                } else {
                    lVarV.o(1823982427);
                    lVarV.l();
                }
                lVarV.l();
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(this, s11, i11));
        }
    }

    public final void g() {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).k();
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).g();
        }
    }

    public final List<l1<S>.d<?, ?>> h() {
        return this._animations;
    }

    public final S i() {
        return this.transitionState.a();
    }

    public final boolean j() {
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (snapshotStateList.get(i11).getInitialValueState() != null) {
                return true;
            }
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (snapshotStateList2.get(i12).j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long m() {
        l1<?> l1Var = this.parentTransition;
        return l1Var != null ? l1Var.m() : s();
    }

    public final b<S> n() {
        return (b) this.segment.getValue();
    }

    public final long o() {
        return this.startTimeNanos.c();
    }

    public final S p() {
        return (S) this.targetState.getValue();
    }

    public final long q() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public final boolean t() {
        return o() != Long.MIN_VALUE;
    }

    public String toString() {
        List<l1<S>.d<?, ?>> listH = h();
        int size = listH.size();
        String str = "Transition animation values: ";
        for (int i11 = 0; i11 < size; i11++) {
            str = str + listH.get(i11) + ", ";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void w() {
        z();
        this.transitionState.g();
    }

    public final void x(long frameTimeNanos, float durationScale) {
        if (o() == Long.MIN_VALUE) {
            A(frameTimeNanos);
        }
        long jO = frameTimeNanos - o();
        if (durationScale != BitmapDescriptorFactory.HUE_RED) {
            jO = yn0.a.e(jO / ((double) durationScale));
        }
        J(jO);
        y(jO, durationScale == BitmapDescriptorFactory.HUE_RED);
    }

    public final void y(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z11 = true;
        if (o() == Long.MIN_VALUE) {
            A(scaledPlayTimeNanos);
        } else if (!this.transitionState.c()) {
            this.transitionState.e(true);
        }
        O(false);
        SnapshotStateList<l1<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            l1<S>.d<?, ?> dVar = snapshotStateList.get(i11);
            if (!dVar.B()) {
                dVar.C(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!dVar.B()) {
                z11 = false;
            }
        }
        SnapshotStateList<l1<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l1<?> l1Var = snapshotStateList2.get(i12);
            if (!s.f(l1Var.p(), l1Var.i())) {
                l1Var.y(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!s.f(l1Var.p(), l1Var.i())) {
                z11 = false;
            }
        }
        if (z11) {
            z();
        }
    }

    public final void z() {
        M(Long.MIN_VALUE);
        n1<S> n1Var = this.transitionState;
        if (n1Var instanceof u0) {
            n1Var.d(p());
        }
        J(0L);
        this.transitionState.e(false);
        SnapshotStateList<l1<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).z();
        }
    }

    public l1(n1<S> n1Var, String str) {
        this(n1Var, null, str);
    }

    public l1(S s11, String str) {
        this(new u0(s11), null, str);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f100479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1<S> f100480d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1227}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            float f100481n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f100482o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private /* synthetic */ Object f100483p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ l1<S> f100484q;

            /* JADX INFO: renamed from: p1.l1$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            static final class C2131a extends u implements l<Long, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ l1<S> f100485c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f100486d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2131a(l1<S> l1Var, float f11) {
                    super(1);
                    this.f100485c = l1Var;
                    this.f100486d = f11;
                }

                public final void a(long j11) {
                    if (this.f100485c.u()) {
                        return;
                    }
                    this.f100485c.x(j11, this.f100486d);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
                    a(l11.longValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l1<S> l1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100484q = l1Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f100484q, continuation);
                aVar.f100483p = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                float fN;
                CoroutineScope coroutineScope;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f100482o;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f100483p;
                    fN = j1.n(coroutineScope2.getCoroutineContext());
                    coroutineScope = coroutineScope2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f100481n;
                    coroutineScope = (CoroutineScope) this.f100483p;
                    t.b(obj);
                }
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    C2131a c2131a = new C2131a(this.f100484q, fN);
                    this.f100483p = coroutineScope;
                    this.f100481n = fN;
                    this.f100482o = 1;
                    if (h1.c(c2131a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CoroutineScope coroutineScope, l1<S> l1Var) {
            super(1);
            this.f100479c = coroutineScope;
            this.f100480d = l1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            BuildersKt__Builders_commonKt.launch$default(this.f100479c, null, CoroutineStart.UNDISPATCHED, new a(this.f100480d, null), 1, null);
            return new b();
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/l1$e$b", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements k0 {
            @Override // p020r2.k0
            public void dispose() {
            }
        }
    }
}
