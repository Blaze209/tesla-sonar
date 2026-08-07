package p020r2;

import c3.b;
import ezvcard.property.Kind;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p013kotlin.Metadata;
import xn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lr2/b3;", "Lc3/b;", "", "Lr2/a3;", "table", "", Kind.GROUP, "version", "<init>", "(Lr2/a3;II)V", "Ljn0/h0;", "b", "()V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lr2/a3;", "getTable", "()Lr2/a3;", "I", "getGroup", "()I", "c", "getVersion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b3 implements b, Iterable<b>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public b3(a3 a3Var, int i11, int i12) {
        this.table = a3Var;
        this.group = i11;
        this.version = i12;
    }

    private final void b() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        b();
        t0 t0VarA = this.table.A(this.group);
        if (t0VarA != null) {
            a3 a3Var = this.table;
            int i11 = this.group;
            return new u3(a3Var, i11, t0VarA, new e(i11));
        }
        a3 a3Var2 = this.table;
        int i12 = this.group;
        return new r0(a3Var2, i12 + 1, i12 + c3.I(a3Var2.getGroups(), this.group));
    }
}
