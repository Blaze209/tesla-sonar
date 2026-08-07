package p020r2;

import c3.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr2/z;", "", "Lc3/c;", "observer", "", "root", "<init>", "(Lc3/c;Z)V", "a", "Z", "b", "()Z", "setRoot", "(Z)V", "Lc3/c;", "()Lc3/c;", "c", "(Lc3/c;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean root;

    public z(c cVar, boolean z11) {
        this.root = z11;
    }

    public final c a() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRoot() {
        return this.root;
    }

    public /* synthetic */ z(c cVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? false : z11);
    }

    public final void c(c cVar) {
    }
}
