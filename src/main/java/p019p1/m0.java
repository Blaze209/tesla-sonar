package p019p1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lp1/m0;", "T", "Lp1/i;", "Lp1/c0;", "animation", "Lp1/y0;", "repeatMode", "Lp1/h1;", "initialStartOffset", "<init>", "(Lp1/c0;Lp1/y0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp1/q;", "V", "Lp1/p1;", "converter", "Lp1/s1;", "a", "(Lp1/p1;)Lp1/s1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lp1/c0;", "getAnimation", "()Lp1/c0;", "b", "Lp1/y0;", "getRepeatMode", "()Lp1/y0;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0<T> implements i<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100493d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0<T> animation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y0 repeatMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ m0(c0 c0Var, y0 y0Var, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, y0Var, j11);
    }

    @Override // p019p1.i
    public <V extends q> s1<V> a(p1<T, V> converter) {
        return new z1(this.animation.a((p1) converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (other instanceof m0) {
            m0 m0Var = (m0) other;
            if (s.f(m0Var.animation, this.animation) && m0Var.repeatMode == this.repeatMode && h1.d(m0Var.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + h1.e(this.initialStartOffset);
    }

    private m0(c0<T> c0Var, y0 y0Var, long j11) {
        this.animation = c0Var;
        this.repeatMode = y0Var;
        this.initialStartOffset = j11;
    }
}
