package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lp1/y1;", "Lp1/q;", "V", "Lp1/u1;", "Lp1/i0;", "floatDecaySpec", "<init>", "(Lp1/i0;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JLp1/q;Lp1/q;)Lp1/q;", "c", "(Lp1/q;Lp1/q;)J", DateTokenConverter.CONVERTER_KEY, "b", "(Lp1/q;Lp1/q;)Lp1/q;", "a", "Lp1/i0;", "getFloatDecaySpec", "()Lp1/i0;", "Lp1/q;", "valueVector", "velocityVector", "targetVector", "", Gender.FEMALE, "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y1<V extends q> implements u1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 floatDecaySpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V targetVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    public y1(i0 i0Var) {
        this.floatDecaySpec = i0Var;
        this.absVelocityThreshold = i0Var.a();
    }

    @Override // p019p1.u1
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // p019p1.u1
    public V b(V initialValue, V initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = (V) r.g(initialValue);
        }
        V v11 = this.targetVector;
        if (v11 == null) {
            s.B("targetVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.targetVector;
            if (v12 == null) {
                s.B("targetVector");
                v12 = null;
            }
            v12.e(i11, this.floatDecaySpec.d(initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.targetVector;
        if (v13 != null) {
            return v13;
        }
        s.B("targetVector");
        return null;
    }

    @Override // p019p1.u1
    public long c(V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) r.g(initialValue);
        }
        V v11 = this.velocityVector;
        if (v11 == null) {
            s.B("velocityVector");
            v11 = null;
        }
        int size = v11.getSize();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.floatDecaySpec.c(initialValue.a(i11), initialVelocity.a(i11)));
        }
        return jMax;
    }

    @Override // p019p1.u1
    public V d(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) r.g(initialValue);
        }
        V v11 = this.velocityVector;
        if (v11 == null) {
            s.B("velocityVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.velocityVector;
            if (v12 == null) {
                s.B("velocityVector");
                v12 = null;
            }
            v12.e(i11, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.velocityVector;
        if (v13 != null) {
            return v13;
        }
        s.B("velocityVector");
        return null;
    }

    @Override // p019p1.u1
    public V e(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) r.g(initialValue);
        }
        V v11 = this.valueVector;
        if (v11 == null) {
            s.B("valueVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.valueVector;
            if (v12 == null) {
                s.B("valueVector");
                v12 = null;
            }
            v12.e(i11, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.valueVector;
        if (v13 != null) {
            return v13;
        }
        s.B("valueVector");
        return null;
    }
}
