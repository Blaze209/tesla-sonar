package p019p1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001a\u0010%\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001a\u0010)\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(R\u001a\u0010.\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lp1/y;", "T", "Lp1/q;", "V", "Lp1/d;", "Lp1/u1;", "animationSpec", "Lp1/p1;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Lp1/u1;Lp1/p1;Ljava/lang/Object;Lp1/q;)V", "Lp1/z;", "(Lp1/z;Lp1/p1;Ljava/lang/Object;Lp1/q;)V", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Lp1/q;", "a", "Lp1/u1;", "b", "Lp1/p1;", DateTokenConverter.CONVERTER_KEY, "()Lp1/p1;", "c", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "Lp1/q;", "initialValueVector", "getInitialVelocityVector", "()Lp1/q;", "f", "endVelocity", "targetValue", "h", "J", "()J", "durationNanos", "", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y<T, V extends q> implements d<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u1<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V initialValueVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final V endVelocity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isInfinite;

    public y(u1<V> u1Var, p1<T, V> p1Var, T t11, V v11) {
        this.animationSpec = u1Var;
        this.typeConverter = p1Var;
        this.initialValue = t11;
        V vInvoke = d().a().invoke(t11);
        this.initialValueVector = vInvoke;
        this.initialVelocityVector = (V) r.e(v11);
        this.targetValue = (T) d().b().invoke(u1Var.b(vInvoke, v11));
        this.durationNanos = u1Var.c(vInvoke, v11);
        V v12 = (V) r.e(u1Var.d(getDurationNanos(), vInvoke, v11));
        this.endVelocity = v12;
        int size = v12.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v13 = this.endVelocity;
            v13.e(i11, n.m(v13.a(i11), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // p019p1.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // p019p1.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // p019p1.d
    public p1<T, V> d() {
        return this.typeConverter;
    }

    @Override // p019p1.d
    public T e(long playTimeNanos) {
        return !b(playTimeNanos) ? (T) d().b().invoke(this.animationSpec.e(playTimeNanos, this.initialValueVector, this.initialVelocityVector)) : f();
    }

    @Override // p019p1.d
    public T f() {
        return this.targetValue;
    }

    @Override // p019p1.d
    public V g(long playTimeNanos) {
        return !b(playTimeNanos) ? (V) this.animationSpec.d(playTimeNanos, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    public y(z<T> zVar, p1<T, V> p1Var, T t11, V v11) {
        this(zVar.a(p1Var), p1Var, t11, v11);
    }
}
