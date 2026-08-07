package hc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import okio.i0;
import okio.k;
import okio.o;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0003\u001a\u0011\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lhc/e;", "Lhc/a;", "", "maxSize", "Lokio/i0;", "directory", "Lokio/o;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLokio/i0;Lokio/o;Lkotlin/coroutines/CoroutineContext;)V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "Lhc/a$c;", "b", "(Ljava/lang/String;)Lhc/a$c;", "Lhc/a$b;", "a", "(Ljava/lang/String;)Lhc/a$b;", "J", DateTokenConverter.CONVERTER_KEY, "()J", "Lokio/i0;", "c", "()Lokio/i0;", "Lokio/o;", "getFileSystem", "()Lokio/o;", "Lhc/c;", "Lhc/c;", "cache", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o fileSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hc.c cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhc/e$b;", "Lhc/a$b;", "Lhc/c$b;", "Lhc/c;", "editor", "<init>", "(Lhc/c$b;)V", "Lhc/e$c;", "b", "()Lhc/e$c;", "Ljn0/h0;", "abort", "()V", "a", "Lhc/c$b;", "Lokio/i0;", "getMetadata", "()Lokio/i0;", OrcaKeys.METADATA, "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final hc.c.b editor;

        public b(hc.c.b bVar) {
            this.editor = bVar;
        }

        @Override // hc.a.b
        public void abort() {
            this.editor.a();
        }

        @Override // hc.a.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            hc.c.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // hc.a.b
        public i0 getData() {
            return this.editor.f(1);
        }

        @Override // hc.a.b
        public i0 getMetadata() {
            return this.editor.f(0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhc/e$c;", "Lhc/a$c;", "Lhc/c$d;", "Lhc/c;", "snapshot", "<init>", "(Lhc/c$d;)V", "Ljn0/h0;", "close", "()V", "Lhc/e$b;", "c", "()Lhc/e$b;", "a", "Lhc/c$d;", "Lokio/i0;", "getMetadata", "()Lokio/i0;", OrcaKeys.METADATA, "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final hc.c.d snapshot;

        public c(hc.c.d dVar) {
            this.snapshot = dVar;
        }

        @Override // hc.a.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b e3() {
            hc.c.b bVarC = this.snapshot.c();
            if (bVarC != null) {
                return new b(bVarC);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // hc.a.c
        public i0 getData() {
            return this.snapshot.n(1);
        }

        @Override // hc.a.c
        public i0 getMetadata() {
            return this.snapshot.n(0);
        }
    }

    public e(long j11, i0 i0Var, o oVar, CoroutineContext coroutineContext) {
        this.maxSize = j11;
        this.directory = i0Var;
        this.fileSystem = oVar;
        this.cache = new hc.c(getFileSystem(), getDirectory(), coroutineContext, getMaxSize(), 3, 2);
    }

    private final String e(String str) {
        return k.INSTANCE.f(str).C().m();
    }

    @Override // hc.a
    public a.b a(String key) {
        hc.c.b bVarT0 = this.cache.t0(e(key));
        if (bVarT0 != null) {
            return new b(bVarT0);
        }
        return null;
    }

    @Override // hc.a
    public a.c b(String key) {
        hc.c.d dVarU0 = this.cache.u0(e(key));
        if (dVarU0 != null) {
            return new c(dVarU0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public i0 getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // hc.a
    public o getFileSystem() {
        return this.fileSystem;
    }
}
