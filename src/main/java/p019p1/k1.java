package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R*\u0010(\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010+\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0016\u0010-\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u0010/\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010\u000b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00106\u001a\u00028\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00105R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010%R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00108R\u0014\u0010;\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010:¨\u0006<"}, d2 = {"Lp1/k1;", "T", "Lp1/q;", "V", "Lp1/d;", "Lp1/s1;", "animationSpec", "Lp1/p1;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Lp1/s1;Lp1/p1;Ljava/lang/Object;Ljava/lang/Object;Lp1/q;)V", "Lp1/i;", "(Lp1/i;Lp1/p1;Ljava/lang/Object;Ljava/lang/Object;Lp1/q;)V", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Lp1/q;", "", "toString", "()Ljava/lang/String;", "a", "Lp1/s1;", "getAnimationSpec$animation_core_release", "()Lp1/s1;", "b", "Lp1/p1;", DateTokenConverter.CONVERTER_KEY, "()Lp1/p1;", "value", "c", "Ljava/lang/Object;", "getMutableTargetValue$animation_core_release", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "mutableTargetValue", "getMutableInitialValue$animation_core_release", "j", "mutableInitialValue", "Lp1/q;", "initialValueVector", "f", "targetValueVector", "h", "J", "_durationNanos", IntegerTokenConverter.CONVERTER_KEY, "_endVelocity", "()Lp1/q;", "endVelocity", "", "()Z", "isInfinite", "()J", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k1<T, V extends q> implements d<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s1<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T mutableTargetValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private T mutableInitialValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V initialValueVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V targetValueVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long _durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private V _endVelocity;

    public k1(s1<V> s1Var, p1<T, V> p1Var, T t11, T t12, V v11) {
        V v12;
        this.animationSpec = s1Var;
        this.typeConverter = p1Var;
        this.mutableTargetValue = t12;
        this.mutableInitialValue = t11;
        this.initialValueVector = d().a().invoke(t11);
        this.targetValueVector = d().a().invoke(t12);
        this.initialVelocityVector = (v11 == null || (v12 = (V) r.e(v11)) == null) ? (V) r.g(d().a().invoke(t11)) : v12;
        this._durationNanos = -1L;
    }

    private final V h() {
        V v11 = this._endVelocity;
        if (v11 != null) {
            return v11;
        }
        V v12 = (V) this.animationSpec.f(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v12;
        return v12;
    }

    @Override // p019p1.d
    public boolean a() {
        return this.animationSpec.a();
    }

    @Override // p019p1.d
    public long c() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.b(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    @Override // p019p1.d
    public p1<T, V> d() {
        return this.typeConverter;
    }

    @Override // p019p1.d
    public T e(long playTimeNanos) {
        if (b(playTimeNanos)) {
            return f();
        }
        q qVarE = this.animationSpec.e(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size = qVarE.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (Float.isNaN(qVarE.a(i11))) {
                x0.b("AnimationVector cannot contain a NaN. " + qVarE + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos);
            }
        }
        return (T) d().b().invoke(qVarE);
    }

    @Override // p019p1.d
    public T f() {
        return this.mutableTargetValue;
    }

    @Override // p019p1.d
    public V g(long playTimeNanos) {
        return !b(playTimeNanos) ? (V) this.animationSpec.d(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : (V) h();
    }

    public final T i() {
        return this.mutableInitialValue;
    }

    public final void j(T t11) {
        if (s.f(t11, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t11;
        this.initialValueVector = d().a().invoke(t11);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void k(T t11) {
        if (s.f(this.mutableTargetValue, t11)) {
            return;
        }
        this.mutableTargetValue = t11;
        this.targetValueVector = d().a().invoke(t11);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + f() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + f.b(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ k1(i iVar, p1 p1Var, Object obj, Object obj2, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i<Object>) iVar, (p1<Object, q>) p1Var, obj, obj2, (i11 & 16) != 0 ? null : qVar);
    }

    public k1(i<T> iVar, p1<T, V> p1Var, T t11, T t12, V v11) {
        this(iVar.a(p1Var), p1Var, t11, t12, v11);
    }
}
