package p020r2;

import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lr2/j0;", "Lr2/r2;", "Lkotlin/Function1;", "Lr2/l0;", "Lr2/k0;", "effect", "<init>", "(Lwn0/l;)V", "Ljn0/h0;", "onRemembered", "()V", "onForgotten", "onAbandoned", "a", "Lwn0/l;", "b", "Lr2/k0;", "onDispose", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j0 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<l0, k0> effect;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private k0 onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(l<? super l0, ? extends k0> lVar) {
        this.effect = lVar;
    }

    @Override // p020r2.r2
    public void onForgotten() {
        k0 k0Var = this.onDispose;
        if (k0Var != null) {
            k0Var.dispose();
        }
        this.onDispose = null;
    }

    @Override // p020r2.r2
    public void onRemembered() {
        this.onDispose = this.effect.invoke(Function0.f106740a);
    }

    @Override // p020r2.r2
    public void onAbandoned() {
    }
}
