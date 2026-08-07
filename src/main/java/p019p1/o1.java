package p019p1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lp1/o1;", "T", "Lp1/c0;", "", "durationMillis", "delay", "Lp1/d0;", "easing", "<init>", "(IILp1/d0;)V", "Lp1/q;", "V", "Lp1/p1;", "converter", "Lp1/e2;", "f", "(Lp1/p1;)Lp1/e2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDurationMillis", "b", "getDelay", "c", "Lp1/d0;", "getEasing", "()Lp1/d0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o1<T> implements c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 easing;

    public o1(int i11, int i12, d0 d0Var) {
        this.durationMillis = i11;
        this.delay = i12;
        this.easing = d0Var;
    }

    public boolean equals(Object other) {
        if (other instanceof o1) {
            o1 o1Var = (o1) other;
            if (o1Var.durationMillis == this.durationMillis && o1Var.delay == this.delay && s.f(o1Var.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019p1.g0, p019p1.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends q> e2<V> a(p1<T, V> converter) {
        return new e2<>(this.durationMillis, this.delay, this.easing);
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public /* synthetic */ o1(int i11, int i12, d0 d0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? f0.c() : d0Var);
    }
}
