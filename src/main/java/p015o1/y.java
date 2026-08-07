package p015o1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p019p1.i0;
import w4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lo1/y;", "Lp1/i0;", "Lw4/d;", "density", "<init>", "(Lw4/d;)V", "", "startVelocity", "f", "(F)F", "initialValue", "initialVelocity", DateTokenConverter.CONVERTER_KEY, "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "Lo1/n;", "a", "Lo1/n;", "flingCalculator", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n flingCalculator;

    public y(d dVar) {
        this.flingCalculator = new n(z.a(), dVar);
    }

    private final float f(float startVelocity) {
        return this.flingCalculator.b(startVelocity) * Math.signum(startVelocity);
    }

    @Override // p019p1.i0
    public float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // p019p1.i0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).b(playTimeNanos / 1000000);
    }

    @Override // p019p1.i0
    public long c(float initialValue, float initialVelocity) {
        return this.flingCalculator.c(initialVelocity) * 1000000;
    }

    @Override // p019p1.i0
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // p019p1.i0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.flingCalculator.d(initialVelocity).a(playTimeNanos / 1000000);
    }
}
