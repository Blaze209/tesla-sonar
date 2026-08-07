package p019p1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp1/a0;", "T", "Lp1/z;", "Lp1/i0;", "floatDecaySpec", "<init>", "(Lp1/i0;)V", "Lp1/q;", "V", "Lp1/p1;", "typeConverter", "Lp1/u1;", "a", "(Lp1/p1;)Lp1/u1;", "Lp1/i0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a0<T> implements z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 floatDecaySpec;

    public a0(i0 i0Var) {
        this.floatDecaySpec = i0Var;
    }

    @Override // p019p1.z
    public <V extends q> u1<V> a(p1<T, V> typeConverter) {
        return new y1(this.floatDecaySpec);
    }
}
