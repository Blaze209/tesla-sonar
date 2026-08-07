package hc;

import bo0.n;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import okio.i0;
import okio.o;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import yc.l;
import yc.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lhc/a;", "", "", Action.KEY_ATTRIBUTE, "Lhc/a$c;", "b", "(Ljava/lang/String;)Lhc/a$c;", "Lhc/a$b;", "a", "(Ljava/lang/String;)Lhc/a$b;", "Lokio/o;", "getFileSystem", "()Lokio/o;", "fileSystem", "c", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: hc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lhc/a$a;", "", "<init>", "()V", "Lokio/i0;", "directory", "b", "(Lokio/i0;)Lhc/a$a;", "Lhc/a;", "a", "()Lhc/a;", "Lokio/i0;", "Lokio/o;", "Lokio/o;", "fileSystem", "", "c", "D", "maxSizePercent", "", DateTokenConverter.CONVERTER_KEY, "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lkotlin/coroutines/CoroutineContext;", "g", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1519a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private i0 directory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private o fileSystem = m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long minimumMaxSizeBytes = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext cleanupCoroutineContext = EmptyCoroutineContext.INSTANCE;

        public final a a() {
            long jP;
            i0 i0Var = this.directory;
            if (i0Var == null) {
                throw new IllegalStateException("directory == null");
            }
            double d11 = this.maxSizePercent;
            if (d11 > 0.0d) {
                try {
                    jP = n.p((long) (d11 * l.a(this.fileSystem, i0Var)), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jP = this.minimumMaxSizeBytes;
                }
            } else {
                jP = this.maxSizeBytes;
            }
            return new e(jP, i0Var, this.fileSystem, this.cleanupCoroutineContext);
        }

        public final C1519a b(i0 directory) {
            this.directory = directory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lhc/a$b;", "", "Lhc/a$c;", "a", "()Lhc/a$c;", "Ljn0/h0;", "abort", "()V", "Lokio/i0;", "getMetadata", "()Lokio/i0;", OrcaKeys.METADATA, "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        c a();

        void abort();

        i0 getData();

        i0 getMetadata();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lhc/a$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lhc/a$b;", "e3", "()Lhc/a$b;", "Lokio/i0;", "getMetadata", "()Lokio/i0;", OrcaKeys.METADATA, "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends AutoCloseable {
        b e3();

        i0 getData();

        i0 getMetadata();
    }

    b a(String key);

    c b(String key);

    o getFileSystem();
}
