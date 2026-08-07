package p019p1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.q;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;

/* JADX INFO: renamed from: p1.k, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b'\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u001b¨\u00067"}, d2 = {"Lp1/k;", "T", "Lp1/q;", "V", "Lr2/y3;", "Lp1/p1;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lp1/p1;Ljava/lang/Object;Lp1/q;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Lp1/p1;", "o", "()Lp1/p1;", "<set-?>", "b", "Lr2/p1;", "getValue", "()Ljava/lang/Object;", "D", "(Ljava/lang/Object;)V", "value", "c", "Lp1/q;", "q", "()Lp1/q;", "E", "(Lp1/q;)V", "velocityVector", DateTokenConverter.CONVERTER_KEY, "J", "n", "()J", "B", "(J)V", "e", "k", "u", "f", "Z", "t", "()Z", "C", "(Z)V", "p", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnimationState<T, V extends q> implements y3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(p1<T, V> p1Var, T t11, V v11, long j11, long j12, boolean z11) {
        V v12;
        this.typeConverter = p1Var;
        this.value = s3.d(t11, null, 2, null);
        this.velocityVector = (v11 == null || (v12 = (V) r.e(v11)) == null) ? (V) l.i(p1Var, t11) : v12;
        this.lastFrameTimeNanos = j11;
        this.finishedTimeNanos = j12;
        this.isRunning = z11;
    }

    public final void B(long j11) {
        this.lastFrameTimeNanos = j11;
    }

    public final void C(boolean z11) {
        this.isRunning = z11;
    }

    public void D(T t11) {
        this.value.setValue(t11);
    }

    public final void E(V v11) {
        this.velocityVector = v11;
    }

    @Override // p020r2.y3
    public T getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final p1<T, V> o() {
        return this.typeConverter;
    }

    public final T p() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    public final V q() {
        return this.velocityVector;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + p() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u(long j11) {
        this.finishedTimeNanos = j11;
    }

    public /* synthetic */ AnimationState(p1 p1Var, Object obj, q qVar, long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(p1Var, obj, (i11 & 4) != 0 ? null : qVar, (i11 & 8) != 0 ? Long.MIN_VALUE : j11, (i11 & 16) != 0 ? Long.MIN_VALUE : j12, (i11 & 32) != 0 ? false : z11);
    }
}
