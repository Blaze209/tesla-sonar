package bn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0007\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lbn/b;", "", "<init>", "()V", "", "name", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "b", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Lbn/b$a;", "Lbn/b$a;", "NO_OP_ARGS_BUILDER", "Lbn/b$c;", "c", "Lbn/b$c;", "_instance", "()Lbn/b$c;", "instance", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17832a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final a NO_OP_ARGS_BUILDER = new C0356b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static c _instance;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbn/b$a;", "", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
    }

    /* JADX INFO: renamed from: bn.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbn/b$b;", "Lbn/b$a;", "<init>", "()V", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C0356b implements a {
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbn/b$c;", "", "", "name", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "b", "()V", "", "isTracing", "()Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        void a(String name);

        void b();

        boolean isTracing();
    }

    private b() {
    }

    public static final void a(String name) {
        s.k(name, "name");
        f17832a.c().a(name);
    }

    public static final void b() {
        f17832a.c().b();
    }

    private final c c() {
        bn.a aVar;
        c cVar = _instance;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new bn.a();
            _instance = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f17832a.c().isTracing();
    }
}
