package p019p1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lp1/q0;", "T", "", "value", "Lp1/d0;", "easing", "<init>", "(Ljava/lang/Object;Lp1/d0;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lp1/d0;", "()Lp1/d0;", "c", "(Lp1/d0;)V", "Lp1/r0$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d0 easing;

    public /* synthetic */ q0(Object obj, d0 d0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, d0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d0 getEasing() {
        return this.easing;
    }

    public final T b() {
        return this.value;
    }

    public final void c(d0 d0Var) {
        this.easing = d0Var;
    }

    private q0(T t11, d0 d0Var) {
        this.value = t11;
        this.easing = d0Var;
    }
}
