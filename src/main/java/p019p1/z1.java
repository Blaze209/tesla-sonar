package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001a\u0010#\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Lp1/z1;", "Lp1/q;", "V", "Lp1/s1;", "Lp1/v1;", "animation", "Lp1/y0;", "repeatMode", "Lp1/h1;", "initialStartOffset", "<init>", "(Lp1/v1;Lp1/y0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "h", "(J)J", "start", "startVelocity", "end", IntegerTokenConverter.CONVERTER_KEY, "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", "initialValue", "targetValue", "initialVelocity", "e", DateTokenConverter.CONVERTER_KEY, "b", "(Lp1/q;Lp1/q;Lp1/q;)J", "a", "Lp1/v1;", "Lp1/y0;", "c", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z1<V extends q> implements s1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v1<V> animation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y0 repeatMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ z1(v1 v1Var, y0 y0Var, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(v1Var, y0Var, j11);
    }

    private final long h(long playTimeNanos) {
        long j11 = this.initialOffsetNanos;
        if (playTimeNanos + j11 <= 0) {
            return 0L;
        }
        long j12 = playTimeNanos + j11;
        long j13 = this.durationNanos;
        long j14 = j12 / j13;
        return (this.repeatMode == y0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final V i(long playTimeNanos, V start, V startVelocity, V end) {
        long j11 = this.initialOffsetNanos;
        long j12 = playTimeNanos + j11;
        long j13 = this.durationNanos;
        return j12 > j13 ? this.animation.d(j13 - j11, start, end, startVelocity) : startVelocity;
    }

    @Override // p019p1.s1
    public boolean a() {
        return true;
    }

    @Override // p019p1.s1
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return Long.MAX_VALUE;
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.d(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.e(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    private z1(v1<V> v1Var, y0 y0Var, long j11) {
        this.animation = v1Var;
        this.repeatMode = y0Var;
        this.durationNanos = ((long) (v1Var.getDelayMillis() + v1Var.c())) * 1000000;
        this.initialOffsetNanos = j11 * 1000000;
    }
}
