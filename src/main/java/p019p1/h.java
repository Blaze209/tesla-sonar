package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p019p1.q;
import p020r2.p1;
import p020r2.s3;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R+\u0010'\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001c\"\u0004\b%\u0010&R*\u0010.\u001a\u00028\u00012\u0006\u0010\"\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b\u001d\u0010 \"\u0004\b/\u00100R*\u00103\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b2\u00100R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b1\u00104\"\u0004\b5\u00106R\u0011\u00107\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u00068"}, d2 = {"Lp1/h;", "T", "Lp1/q;", "V", "", "initialValue", "Lp1/p1;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "Ljn0/h0;", "onCancel", "<init>", "(Ljava/lang/Object;Lp1/p1;Lp1/q;JLjava/lang/Object;JZLwn0/a;)V", "a", "()V", "Lp1/p1;", "getTypeConverter", "()Lp1/p1;", "b", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "c", "J", DateTokenConverter.CONVERTER_KEY, "()J", "Lwn0/a;", "<set-?>", "e", "Lr2/p1;", "l", "(Ljava/lang/Object;)V", "value", "f", "Lp1/q;", "g", "()Lp1/q;", "m", "(Lp1/q;)V", "velocityVector", "j", "(J)V", "h", IntegerTokenConverter.CONVERTER_KEY, "finishedTimeNanos", "()Z", "k", "(Z)V", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startTimeNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a<h0> onCancel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long finishedTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 isRunning;

    public h(T t11, p1<T, V> p1Var, V v11, long j11, T t12, long j12, boolean z11, a<h0> aVar) {
        this.typeConverter = p1Var;
        this.targetValue = t12;
        this.startTimeNanos = j12;
        this.onCancel = aVar;
        this.value = s3.d(t11, null, 2, null);
        this.velocityVector = (V) r.e(v11);
        this.lastFrameTimeNanos = j11;
        this.isRunning = s3.d(Boolean.valueOf(z11), null, 2, null);
    }

    public final void a() {
        k(false);
        this.onCancel.invoke();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T e() {
        return this.value.getValue();
    }

    public final T f() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    public final V g() {
        return this.velocityVector;
    }

    public final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void i(long j11) {
        this.finishedTimeNanos = j11;
    }

    public final void j(long j11) {
        this.lastFrameTimeNanos = j11;
    }

    public final void k(boolean z11) {
        this.isRunning.setValue(Boolean.valueOf(z11));
    }

    public final void l(T t11) {
        this.value.setValue(t11);
    }

    public final void m(V v11) {
        this.velocityVector = v11;
    }
}
