package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lp1/j0;", "Lp1/h0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "b", DateTokenConverter.CONVERTER_KEY, "(FFF)F", "c", "(FFF)J", "a", Gender.FEMALE, "getDampingRatio", "()F", "getStiffness", "Lp1/c1;", "Lp1/c1;", "spring", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibilityThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c1 spring;

    public j0() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7, null);
    }

    @Override // p019p1.h0
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.e(targetValue);
        return t0.c(this.spring.g(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    @Override // p019p1.h0
    public long c(float initialValue, float targetValue, float initialVelocity) {
        float fB = this.spring.b();
        float dampingRatio = this.spring.getDampingRatio();
        float f11 = initialValue - targetValue;
        float f12 = this.visibilityThreshold;
        return b1.b(fB, dampingRatio, initialVelocity / f12, f11 / f12, 1.0f) * 1000000;
    }

    @Override // p019p1.h0
    public float d(float initialValue, float targetValue, float initialVelocity) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // p019p1.h0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.e(targetValue);
        return t0.b(this.spring.g(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    public j0(float f11, float f12, float f13) {
        this.dampingRatio = f11;
        this.stiffness = f12;
        this.visibilityThreshold = f13;
        c1 c1Var = new c1(1.0f);
        c1Var.d(f11);
        c1Var.f(f12);
        this.spring = c1Var;
    }

    public /* synthetic */ j0(float f11, float f12, float f13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? 0.01f : f13);
    }
}
