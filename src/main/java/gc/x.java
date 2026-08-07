package gc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import jn0.h0;
import okio.c0;
import okio.i0;
import p013kotlin.Metadata;
import yc.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u00060\u001aj\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lgc/x;", "Lgc/u;", "Lokio/j;", "source", "Lokio/o;", "fileSystem", "Lgc/u$a;", OrcaKeys.METADATA, "<init>", "(Lokio/j;Lokio/o;Lgc/u$a;)V", "Ljn0/h0;", "c", "()V", "()Lokio/j;", "Lokio/i0;", "y1", "()Lokio/i0;", "close", "a", "Lokio/o;", "getFileSystem", "()Lokio/o;", "b", "Lgc/u$a;", "getMetadata", "()Lgc/u$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "lock", "", DateTokenConverter.CONVERTER_KEY, "Z", "isClosed", "e", "Lokio/j;", "f", "Lokio/i0;", Action.FILE_ATTRIBUTE, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okio.o fileSystem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u.a metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private okio.j source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i0 file;

    public x(okio.j jVar, okio.o oVar, u.a aVar) {
        this.fileSystem = oVar;
        this.metadata = aVar;
        this.source = jVar;
    }

    private final void c() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                okio.j jVar = this.source;
                if (jVar != null) {
                    f0.h(jVar);
                }
                i0 i0Var = this.file;
                if (i0Var != null) {
                    getFileSystem().H(i0Var);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gc.u
    public okio.o getFileSystem() {
        return this.fileSystem;
    }

    @Override // gc.u
    public u.a getMetadata() {
        return this.metadata;
    }

    @Override // gc.u
    public okio.j source() {
        synchronized (this.lock) {
            c();
            okio.j jVar = this.source;
            if (jVar != null) {
                return jVar;
            }
            okio.o fileSystem = getFileSystem();
            i0 i0Var = this.file;
            p013kotlin.jvm.internal.s.h(i0Var);
            okio.j jVarD = c0.d(fileSystem.r0(i0Var));
            this.source = jVarD;
            return jVarD;
        }
    }

    @Override // gc.u
    public i0 y1() {
        i0 i0Var;
        synchronized (this.lock) {
            c();
            i0Var = this.file;
        }
        return i0Var;
    }
}
