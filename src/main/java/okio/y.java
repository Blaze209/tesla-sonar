package okio;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010#J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lokio/y;", "Lokio/o;", "<init>", "()V", "Lokio/i0;", "dir", "", "throwOnFailure", "", "s0", "(Lokio/i0;Z)Ljava/util/List;", "Ljn0/h0;", "u0", "(Lokio/i0;)V", "t0", "path", "Lokio/n;", "c0", "(Lokio/i0;)Lokio/n;", "T", "(Lokio/i0;)Ljava/util/List;", Action.FILE_ATTRIBUTE, "Lokio/m;", "e0", "(Lokio/i0;)Lokio/m;", "Lokio/r0;", "r0", "(Lokio/i0;)Lokio/r0;", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "mustExist", "n", "B", "(Lokio/i0;Z)V", "source", "target", "o", "(Lokio/i0;Lokio/i0;)V", "I", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class y extends o {
    private final List<i0> s0(i0 dir, boolean throwOnFailure) throws IOException {
        File file = dir.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                p013kotlin.jvm.internal.s.h(str);
                arrayList.add(dir.i(str));
            }
            p013kotlin.collections.v.B(arrayList);
            return arrayList;
        }
        if (!throwOnFailure) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + dir);
        }
        throw new FileNotFoundException("no such file: " + dir);
    }

    private final void t0(i0 i0Var) throws IOException {
        if (J(i0Var)) {
            throw new IOException(i0Var + " already exists.");
        }
    }

    private final void u0(i0 i0Var) throws IOException {
        if (J(i0Var)) {
            return;
        }
        throw new IOException(i0Var + " doesn't exist.");
    }

    @Override // okio.o
    public void B(i0 dir, boolean mustCreate) throws IOException {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        n nVarC0 = c0(dir);
        if (nVarC0 == null || !nVarC0.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // okio.o
    public void I(i0 path, boolean mustExist) throws IOException {
        p013kotlin.jvm.internal.s.k(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.o
    public List<i0> T(i0 dir) throws IOException {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        List<i0> listS0 = s0(dir, true);
        p013kotlin.jvm.internal.s.h(listS0);
        return listS0;
    }

    @Override // okio.o
    public n c0(i0 path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new n(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // okio.o
    public m e0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return new x(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.o
    public p0 n(i0 file, boolean mustExist) throws IOException {
        p013kotlin.jvm.internal.s.k(file, "file");
        if (mustExist) {
            u0(file);
        }
        return c0.h(file.toFile(), true);
    }

    @Override // okio.o
    public p0 n0(i0 file, boolean mustCreate) throws IOException {
        p013kotlin.jvm.internal.s.k(file, "file");
        if (mustCreate) {
            t0(file);
        }
        return d0.h(file.toFile(), false, 1, null);
    }

    @Override // okio.o
    public void o(i0 source, i0 target) throws IOException {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.o
    public r0 r0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return c0.l(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
