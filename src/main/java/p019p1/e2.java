package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lp1/e2;", "Lp1/q;", "V", "Lp1/v1;", "", "durationMillis", "delayMillis", "Lp1/d0;", "easing", "<init>", "(IILp1/d0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", DateTokenConverter.CONVERTER_KEY, "a", "I", "c", "()I", "b", "g", "Lp1/d0;", "getEasing", "()Lp1/d0;", "Lp1/x1;", "Lp1/x1;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e2<V extends q> implements v1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 easing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x1<V> anim;

    public e2(int i11, int i12, d0 d0Var) {
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.easing = d0Var;
        this.anim = new x1<>(new k0(getDurationMillis(), getDelayMillis(), d0Var));
    }

    @Override // p019p1.v1
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.e(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // p019p1.v1
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }
}
