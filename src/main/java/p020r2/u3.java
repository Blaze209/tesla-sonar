package p020r2;

import c3.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import xn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lr2/u3;", "", "Lc3/b;", "Lr2/a3;", "table", "", "parent", "Lr2/t0;", Kind.GROUP, "Lr2/v3;", "path", "<init>", "(Lr2/a3;ILr2/t0;Lr2/v3;)V", "", "hasNext", "()Z", "b", "()Lc3/b;", "a", "Lr2/a3;", "getTable", "()Lr2/a3;", "I", "getParent", "()I", "c", "Lr2/t0;", "getGroup", "()Lr2/t0;", DateTokenConverter.CONVERTER_KEY, "Lr2/v3;", "getPath", "()Lr2/v3;", "e", "version", "f", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u3 implements Iterator<b>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t0 group;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v3 path;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int index;

    public u3(a3 a3Var, int i11, t0 t0Var, v3 v3Var) {
        this.table = a3Var;
        this.parent = i11;
        this.group = t0Var;
        this.path = v3Var;
        this.version = a3Var.getVersion();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b next() {
        Object obj;
        ArrayList<Object> arrayListC = this.group.c();
        if (arrayListC != null) {
            int i11 = this.index;
            this.index = i11 + 1;
            obj = arrayListC.get(i11);
        } else {
            obj = null;
        }
        if (obj instanceof d) {
            return new b3(this.table, ((d) obj).getLocation(), this.version);
        }
        if (obj instanceof t0) {
            return new w3(this.table, this.parent, (t0) obj, new p2(this.path, this.index - 1));
        }
        o.t("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListC = this.group.c();
        return arrayListC != null && this.index < arrayListC.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
