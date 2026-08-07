package lb;

import p013kotlin.Metadata;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Llb/x;", "", "Lsb/z;", "id", "<init>", "(Lsb/z;)V", "a", "Lsb/z;", "()Lsb/z;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkGenerationalId id;

    public x(WorkGenerationalId id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        this.id = id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
