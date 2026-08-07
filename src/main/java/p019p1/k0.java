package p019p1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lp1/k0;", "Lp1/h0;", "", "duration", "delay", "Lp1/d0;", "easing", "<init>", "(IILp1/d0;)V", "", "playTimeNanos", "f", "(J)J", "", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "c", "(FFF)J", "b", "a", "I", "getDuration", "()I", "getDelay", "Lp1/d0;", DateTokenConverter.CONVERTER_KEY, "J", "durationNanos", "delayNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 easing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long delayNanos;

    public k0(int i11, int i12, d0 d0Var) {
        this.duration = i11;
        this.delay = i12;
        this.easing = d0Var;
        this.durationNanos = ((long) i11) * 1000000;
        this.delayNanos = ((long) i12) * 1000000;
    }

    private final long f(long playTimeNanos) {
        return n.p(playTimeNanos - this.delayNanos, 0L, this.durationNanos);
    }

    @Override // p019p1.h0
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long jF = f(playTimeNanos);
        if (jF < 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (jF == 0) {
            return initialVelocity;
        }
        return (e(jF, initialValue, targetValue, initialVelocity) - e(jF - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // p019p1.h0
    public long c(float initialValue, float targetValue, float initialVelocity) {
        return ((long) (this.delay + this.duration)) * 1000000;
    }

    @Override // p019p1.h0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        float f11 = this.duration == 0 ? 1.0f : f(playTimeNanos) / this.durationNanos;
        d0 d0Var = this.easing;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = 0.0f;
        }
        return r1.k(initialValue, targetValue, d0Var.a(f11 <= 1.0f ? f11 : 1.0f));
    }
}
