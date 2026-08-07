package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"Lp1/g1;", "Lp1/q;", "V", "Lp1/s1;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Lp1/s1;J)V", "initialValue", "targetValue", "initialVelocity", "b", "(Lp1/q;Lp1/q;Lp1/q;)J", "playTimeNanos", DateTokenConverter.CONVERTER_KEY, "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", "e", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp1/s1;", "getVectorizedAnimationSpec", "()Lp1/s1;", "J", "getStartDelayNanos", "()J", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g1<V extends q> implements s1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s1<V> vectorizedAnimationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long startDelayNanos;

    public g1(s1<V> s1Var, long j11) {
        this.vectorizedAnimationSpec = s1Var;
        this.startDelayNanos = j11;
    }

    @Override // p019p1.s1
    public boolean a() {
        return this.vectorizedAnimationSpec.a();
    }

    @Override // p019p1.s1
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.vectorizedAnimationSpec.b(initialValue, targetValue, initialVelocity) + this.startDelayNanos;
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j11 = this.startDelayNanos;
        return playTimeNanos < j11 ? initialVelocity : (V) this.vectorizedAnimationSpec.d(playTimeNanos - j11, initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j11 = this.startDelayNanos;
        return playTimeNanos < j11 ? initialValue : (V) this.vectorizedAnimationSpec.e(playTimeNanos - j11, initialValue, targetValue, initialVelocity);
    }

    public boolean equals(Object other) {
        if (!(other instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) other;
        return g1Var.startDelayNanos == this.startDelayNanos && s.f(g1Var.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }
}
