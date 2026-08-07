package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0012B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lu6/n;", "T", "Lu6/i0;", "Lu6/d0;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lu6/s;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lu6/d0;Lwn0/l;Lwn0/a;)V", "Lu6/j0;", "createConnection", "()Lu6/j0;", "a", "Lu6/d0;", "b", "Lwn0/l;", "c", "Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n<T> implements i0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f115658e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f115659f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<File, s> coordinatorProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<File> produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lu6/s;", "a", "(Ljava/io/File;)Lu6/s;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<File, s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f115663c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return u.a(it);
        }
    }

    /* JADX INFO: renamed from: u6.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu6/n$b;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> a() {
            return n.f115658e;
        }

        public final Object b() {
            return n.f115659f;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f115664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f115664c = file;
        }

        public final void b() {
            Companion companion = n.INSTANCE;
            Object objB = companion.b();
            File file = this.f115664c;
            synchronized (objB) {
                companion.a().remove(file.getAbsolutePath());
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(d0<T> serializer, wn0.l<? super File, ? extends s> coordinatorProducer, wn0.a<? extends File> produceFile) {
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        p013kotlin.jvm.internal.s.k(coordinatorProducer, "coordinatorProducer");
        p013kotlin.jvm.internal.s.k(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // u6.i0
    public j0<T> createConnection() throws IOException {
        File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (f115659f) {
            String path = file.getAbsolutePath();
            Set<String> set = f115658e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            p013kotlin.jvm.internal.s.j(path, "path");
            set.add(path);
        }
        p013kotlin.jvm.internal.s.j(file, "file");
        return new o(file, this.serializer, this.coordinatorProducer.invoke(file), new c(file));
    }

    public /* synthetic */ n(d0 d0Var, wn0.l lVar, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, (i11 & 2) != 0 ? a.f115663c : lVar, aVar);
    }
}
