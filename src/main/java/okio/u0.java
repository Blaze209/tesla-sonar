package okio;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 72\u00020\u0001:\u00018B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lokio/u0;", "Lokio/o;", "Lokio/i0;", "zipPath", "fileSystem", "", "Lip0/l;", "entries", "", "comment", "<init>", "(Lokio/i0;Lokio/o;Ljava/util/Map;Ljava/lang/String;)V", "path", "s0", "(Lokio/i0;)Lokio/i0;", "dir", "", "throwOnFailure", "", "t0", "(Lokio/i0;Z)Ljava/util/List;", "Lokio/n;", "c0", "(Lokio/i0;)Lokio/n;", Action.FILE_ATTRIBUTE, "Lokio/m;", "e0", "(Lokio/i0;)Lokio/m;", "T", "(Lokio/i0;)Ljava/util/List;", "Lokio/r0;", "r0", "(Lokio/i0;)Lokio/r0;", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "mustExist", "n", "Ljn0/h0;", "B", "(Lokio/i0;Z)V", "source", "target", "o", "(Lokio/i0;Lokio/i0;)V", "I", "e", "Lokio/i0;", "f", "Lokio/o;", "g", "Ljava/util/Map;", "h", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f98005i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i0 f98006j = i0.Companion.e(i0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i0 zipPath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o fileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<i0, ip0.l> entries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String comment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/u0$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u0(i0 zipPath, o fileSystem, Map<i0, ip0.l> entries, String str) {
        p013kotlin.jvm.internal.s.k(zipPath, "zipPath");
        p013kotlin.jvm.internal.s.k(fileSystem, "fileSystem");
        p013kotlin.jvm.internal.s.k(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final i0 s0(i0 path) {
        return f98006j.j(path, true);
    }

    private final List<i0> t0(i0 dir, boolean throwOnFailure) throws IOException {
        ip0.l lVar = this.entries.get(s0(dir));
        if (lVar != null) {
            return p013kotlin.collections.v.m1(lVar.c());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // okio.o
    public void B(i0 dir, boolean mustCreate) throws IOException {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.o
    public void I(i0 path, boolean mustExist) throws IOException {
        p013kotlin.jvm.internal.s.k(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.o
    public List<i0> T(i0 dir) throws IOException {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        List<i0> listT0 = t0(dir, true);
        p013kotlin.jvm.internal.s.h(listT0);
        return listT0;
    }

    @Override // okio.o
    public n c0(i0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        p013kotlin.jvm.internal.s.k(path, "path");
        ip0.l lVarQ = this.entries.get(s0(path));
        if (lVarQ == null) {
            return null;
        }
        if (lVarQ.getOffset() != -1) {
            m mVarE0 = this.fileSystem.e0(this.zipPath);
            try {
                j jVarD = c0.d(mVarE0.J(lVarQ.getOffset()));
                try {
                    lVarQ = ip0.q.q(jVarD, lVarQ);
                    if (jVarD != null) {
                        try {
                            jVarD.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (jVarD != null) {
                        try {
                            jVarD.close();
                        } catch (Throwable th6) {
                            jn0.g.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    lVarQ = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (mVarE0 != null) {
                    try {
                        mVarE0.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (mVarE0 != null) {
                    try {
                        mVarE0.close();
                    } catch (Throwable th9) {
                        jn0.g.a(th8, th9);
                    }
                }
                th2 = th8;
                lVarQ = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new n(!lVarQ.getIsDirectory(), lVarQ.getIsDirectory(), null, lVarQ.getIsDirectory() ? null : Long.valueOf(lVarQ.getSize()), lVarQ.f(), lVarQ.h(), lVarQ.g(), null, 128, null);
    }

    @Override // okio.o
    public m e0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.o
    public p0 n(i0 file, boolean mustExist) throws IOException {
        p013kotlin.jvm.internal.s.k(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.o
    public p0 n0(i0 file, boolean mustCreate) throws IOException {
        p013kotlin.jvm.internal.s.k(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.o
    public void o(i0 source, i0 target) throws IOException {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // okio.o
    public r0 r0(i0 file) throws IOException {
        p013kotlin.jvm.internal.s.k(file, "file");
        ip0.l lVar = this.entries.get(s0(file));
        if (lVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        m mVarE0 = this.fileSystem.e0(this.zipPath);
        j th2 = null;
        try {
            j jVarD = c0.d(mVarE0.J(lVar.getOffset()));
            if (mVarE0 != null) {
                try {
                    mVarE0.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = jVarD;
        } catch (Throwable th4) {
            th = th4;
            if (mVarE0 != null) {
                try {
                    mVarE0.close();
                } catch (Throwable th5) {
                    jn0.g.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        ip0.q.u(th2);
        return lVar.getCompressionMethod() == 0 ? new ip0.h(th2, lVar.getSize(), true) : new ip0.h(new v(new ip0.h(th2, lVar.getCompressedSize(), true), new Inflater(true)), lVar.getSize(), false);
    }
}
