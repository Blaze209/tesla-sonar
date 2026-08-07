package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"Lp1/d2;", "Lp1/q;", "V", "Lp1/w1;", "", "dampingRatio", "stiffness", "Lp1/s;", "anims", "<init>", "(FFLp1/s;)V", "visibilityThreshold", "(FFLp1/q;)V", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lp1/q;Lp1/q;Lp1/q;)J", "f", "(Lp1/q;Lp1/q;Lp1/q;)Lp1/q;", "playTimeNanos", "e", "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", DateTokenConverter.CONVERTER_KEY, "a", Gender.FEMALE, "getDampingRatio", "()F", "getStiffness", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d2<V extends q> implements w1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x1<V> f100355c;

    private d2(float f11, float f12, s sVar) {
        this.dampingRatio = f11;
        this.stiffness = f12;
        this.f100355c = new x1<>(sVar);
    }

    @Override // p019p1.w1, p019p1.s1
    public boolean a() {
        return this.f100355c.a();
    }

    @Override // p019p1.s1
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.f100355c.b(initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f100355c.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f100355c.e(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.s1
    public V f(V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f100355c.f(initialValue, targetValue, initialVelocity);
    }

    public d2(float f11, float f12, V v11) {
        this(f11, f12, t1.c(v11, f11, f12));
    }
}
