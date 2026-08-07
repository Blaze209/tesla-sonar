package t1;

import p013kotlin.Metadata;
import p019p1.AnimationState;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lt1/a;", "T", "Lp1/q;", "V", "", "remainingOffset", "Lp1/k;", "currentAnimationState", "<init>", "(Ljava/lang/Object;Lp1/k;)V", "a", "()Ljava/lang/Object;", "b", "()Lp1/k;", "Ljava/lang/Object;", "getRemainingOffset", "Lp1/k;", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T remainingOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<T, V> currentAnimationState;

    public a(T t11, AnimationState<T, V> animationState) {
        this.remainingOffset = t11;
        this.currentAnimationState = animationState;
    }

    public final T a() {
        return this.remainingOffset;
    }

    public final AnimationState<T, V> b() {
        return this.currentAnimationState;
    }

    public final AnimationState<T, V> c() {
        return this.currentAnimationState;
    }
}
