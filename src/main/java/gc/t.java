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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lgc/t;", "Lgc/u;", "Lokio/i0;", Action.FILE_ATTRIBUTE, "Lokio/o;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lgc/u$a;", OrcaKeys.METADATA, "<init>", "(Lokio/i0;Lokio/o;Ljava/lang/String;Ljava/lang/AutoCloseable;Lgc/u$a;)V", "Ljn0/h0;", "c", "()V", "Lokio/j;", "source", "()Lokio/j;", "n", "()Lokio/i0;", "y1", "close", "a", "Lokio/i0;", "getFile$coil_core_release", "b", "Lokio/o;", "getFileSystem", "()Lokio/o;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/AutoCloseable;", "e", "Lgc/u$a;", "getMetadata", "()Lgc/u$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "isClosed", "h", "Lokio/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final okio.o fileSystem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AutoCloseable closeable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u.a metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private okio.j source;

    public t(i0 i0Var, okio.o oVar, String str, AutoCloseable autoCloseable, u.a aVar) {
        this.file = i0Var;
        this.fileSystem = oVar;
        this.diskCacheKey = str;
        this.closeable = autoCloseable;
        this.metadata = aVar;
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
                AutoCloseable autoCloseable = this.closeable;
                if (autoCloseable != null) {
                    f0.i(autoCloseable);
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

    public i0 n() {
        i0 i0Var;
        synchronized (this.lock) {
            c();
            i0Var = this.file;
        }
        return i0Var;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @Override // gc.u
    public okio.j source() {
        synchronized (this.lock) {
            c();
            okio.j jVar = this.source;
            if (jVar != null) {
                return jVar;
            }
            okio.j jVarD = c0.d(getFileSystem().r0(this.file));
            this.source = jVarD;
            return jVarD;
        }
    }

    @Override // gc.u
    public i0 y1() {
        return n();
    }
}
