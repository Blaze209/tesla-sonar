package p020r2;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr2/s2;", "", "Lr2/r2;", "wrapped", "Lr2/d;", "after", "<init>", "(Lr2/r2;Lr2/d;)V", "a", "Lr2/r2;", "b", "()Lr2/r2;", "setWrapped", "(Lr2/r2;)V", "Lr2/d;", "()Lr2/d;", "setAfter", "(Lr2/d;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private r2 wrapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d after;

    public s2(r2 r2Var, d dVar) {
        this.wrapped = r2Var;
        this.after = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getAfter() {
        return this.after;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r2 getWrapped() {
        return this.wrapped;
    }
}
