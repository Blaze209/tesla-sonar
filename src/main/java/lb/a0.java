package lb;

import java.util.List;
import p013kotlin.Metadata;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Llb/a0;", "Llb/y;", "delegate", "<init>", "(Llb/y;)V", "Lsb/z;", "id", "Llb/x;", "b", "(Lsb/z;)Llb/x;", "a", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lsb/z;)Z", "Llb/y;", "", "c", "Ljava/lang/Object;", "lock", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0 implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public a0(y delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // lb.y
    public x a(WorkGenerationalId id2) {
        x xVarA;
        p013kotlin.jvm.internal.s.k(id2, "id");
        synchronized (this.lock) {
            xVarA = this.delegate.a(id2);
        }
        return xVarA;
    }

    @Override // lb.y
    public x b(WorkGenerationalId id2) {
        x xVarB;
        p013kotlin.jvm.internal.s.k(id2, "id");
        synchronized (this.lock) {
            xVarB = this.delegate.b(id2);
        }
        return xVarB;
    }

    @Override // lb.y
    public boolean e(WorkGenerationalId id2) {
        boolean zE;
        p013kotlin.jvm.internal.s.k(id2, "id");
        synchronized (this.lock) {
            zE = this.delegate.e(id2);
        }
        return zE;
    }

    @Override // lb.y
    public List<x> remove(String workSpecId) {
        List<x> listRemove;
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
