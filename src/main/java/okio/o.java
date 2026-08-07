package okio;

import ch.qos.logback.core.joran.action.Action;
import java.io.Closeable;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ!\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lokio/o;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lokio/i0;", "path", "Lokio/n;", "b0", "(Lokio/i0;)Lokio/n;", "c0", "", "J", "(Lokio/i0;)Z", "dir", "", "T", "(Lokio/i0;)Ljava/util/List;", Action.FILE_ATTRIBUTE, "Lokio/m;", "e0", "(Lokio/i0;)Lokio/m;", "Lokio/r0;", "r0", "(Lokio/i0;)Lokio/r0;", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "k0", "(Lokio/i0;)Lokio/p0;", "mustExist", "n", "c", "Ljn0/h0;", "B", "(Lokio/i0;Z)V", "t", "p", "(Lokio/i0;)V", "source", "target", "o", "(Lokio/i0;Lokio/i0;)V", "I", "H", "close", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f97987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f97988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f97989d;

    static {
        o yVar;
        try {
            Class.forName("java.nio.file.Files");
            yVar = new b0();
        } catch (ClassNotFoundException unused) {
            yVar = new y();
        }
        f97987b = yVar;
        i0.Companion companion = i0.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        p013kotlin.jvm.internal.s.j(property, "getProperty(...)");
        f97988c = i0.Companion.e(companion, property, false, 1, null);
        ClassLoader classLoader = ip0.k.class.getClassLoader();
        p013kotlin.jvm.internal.s.j(classLoader, "getClassLoader(...)");
        f97989d = new ip0.k(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ void C(o oVar, i0 i0Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        oVar.B(i0Var, z11);
    }

    public abstract void B(i0 dir, boolean mustCreate);

    public final void H(i0 path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        I(path, false);
    }

    public abstract void I(i0 path, boolean mustExist);

    public final boolean J(i0 path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        return ip0.d.b(this, path);
    }

    public abstract List<i0> T(i0 dir);

    public final n b0(i0 path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        return ip0.d.c(this, path);
    }

    public final p0 c(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return n(file, false);
    }

    public abstract n c0(i0 path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract m e0(i0 file);

    public final p0 k0(i0 file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        return n0(file, false);
    }

    public abstract p0 n(i0 file, boolean mustExist);

    public abstract p0 n0(i0 file, boolean mustCreate);

    public abstract void o(i0 source, i0 target);

    public final void p(i0 dir) {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        t(dir, false);
    }

    public abstract r0 r0(i0 file);

    public final void t(i0 dir, boolean mustCreate) {
        p013kotlin.jvm.internal.s.k(dir, "dir");
        ip0.d.a(this, dir, mustCreate);
    }
}
