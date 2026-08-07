package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0002\u00101¨\u00062"}, d2 = {"Lokio/p;", "Lokio/o;", "delegate", "<init>", "(Lokio/o;)V", "Lokio/i0;", "path", "", "functionName", "parameterName", "s0", "(Lokio/i0;Ljava/lang/String;Ljava/lang/String;)Lokio/i0;", "t0", "(Lokio/i0;Ljava/lang/String;)Lokio/i0;", "Lokio/n;", "c0", "(Lokio/i0;)Lokio/n;", "dir", "", "T", "(Lokio/i0;)Ljava/util/List;", Action.FILE_ATTRIBUTE, "Lokio/m;", "e0", "(Lokio/i0;)Lokio/m;", "Lokio/r0;", "r0", "(Lokio/i0;)Lokio/r0;", "", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "mustExist", "n", "Ljn0/h0;", "B", "(Lokio/i0;Z)V", "source", "target", "o", "(Lokio/i0;Lokio/i0;)V", "I", "close", "()V", "toString", "()Ljava/lang/String;", "e", "Lokio/o;", "()Lokio/o;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o delegate;

    public p(o delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.o
    public void B(i0 dir, boolean mustCreate) {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        this.delegate.B(s0(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // okio.o
    public void I(i0 path, boolean mustExist) {
        p013kotlin.jvm.internal.s.k(path, "path");
        this.delegate.I(s0(path, "delete", "path"), mustExist);
    }

    @Override // okio.o
    public List<i0> T(i0 dir) {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        List<i0> listT = this.delegate.T(s0(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(t0((i0) it.next(), "list"));
        }
        p013kotlin.collections.v.B(arrayList);
        return arrayList;
    }

    @Override // okio.o
    public n c0(i0 path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        n nVarC0 = this.delegate.c0(s0(path, "metadataOrNull", "path"));
        if (nVarC0 == null) {
            return null;
        }
        return nVarC0.getSymlinkTarget() == null ? nVarC0 : n.b(nVarC0, false, false, t0(nVarC0.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    @Override // okio.o, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.o
    public m e0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return this.delegate.e0(s0(file, "openReadOnly", Action.FILE_ATTRIBUTE));
    }

    @Override // okio.o
    public p0 n(i0 file, boolean mustExist) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return this.delegate.n(s0(file, "appendingSink", Action.FILE_ATTRIBUTE), mustExist);
    }

    @Override // okio.o
    public p0 n0(i0 file, boolean mustCreate) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return this.delegate.n0(s0(file, "sink", Action.FILE_ATTRIBUTE), mustCreate);
    }

    @Override // okio.o
    public void o(i0 source, i0 target) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(target, "target");
        this.delegate.o(s0(source, "atomicMove", "source"), s0(target, "atomicMove", "target"));
    }

    @Override // okio.o
    public r0 r0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return this.delegate.r0(s0(file, "source", Action.FILE_ATTRIBUTE));
    }

    public i0 s0(i0 path, String functionName, String parameterName) {
        p013kotlin.jvm.internal.s.k(path, "path");
        p013kotlin.jvm.internal.s.k(functionName, "functionName");
        p013kotlin.jvm.internal.s.k(parameterName, "parameterName");
        return path;
    }

    public i0 t0(i0 path, String functionName) {
        p013kotlin.jvm.internal.s.k(path, "path");
        p013kotlin.jvm.internal.s.k(functionName, "functionName");
        return path;
    }

    public String toString() {
        return p013kotlin.jvm.internal.o0.b(getClass()).l() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
