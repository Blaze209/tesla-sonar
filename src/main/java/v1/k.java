package v1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lv1/k;", "La4/d;", "Lkotlin/Function1;", "Lv1/m0;", "Ljn0/h0;", "block", "<init>", "(Lwn0/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "La4/k;", "scope", "h", "(La4/k;)V", "b", "Lwn0/l;", "c", "Lv1/m0;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k implements a4.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<m0, jn0.h0> block;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m0 oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public k(wn0.l<? super m0, jn0.h0> lVar) {
        this.block = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && ((k) other).block == this.block;
    }

    @Override // a4.d
    public void h(a4.k scope) {
        m0 m0Var = (m0) scope.I(p0.a());
        if (p013kotlin.jvm.internal.s.f(m0Var, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = m0Var;
        this.block.invoke(m0Var);
    }

    public int hashCode() {
        return this.block.hashCode();
    }
}
