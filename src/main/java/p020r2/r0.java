package p020r2;

import c3.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p013kotlin.Metadata;
import xn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lr2/r0;", "", "Lc3/b;", "Lr2/a3;", "table", "", "start", "end", "<init>", "(Lr2/a3;II)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "", "hasNext", "()Z", "b", "()Lc3/b;", "a", "Lr2/a3;", "getTable", "()Lr2/a3;", "I", "getEnd", "()I", "c", "index", "version", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r0 implements Iterator<b>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public r0(a3 a3Var, int i11, int i12) {
        this.table = a3Var;
        this.end = i12;
        this.index = i11;
        this.version = a3Var.getVersion();
        if (a3Var.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b next() {
        d();
        int i11 = this.index;
        this.index = c3.I(this.table.getGroups(), i11) + i11;
        return new b3(this.table, i11, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
