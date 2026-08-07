package bl0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbl0/k;", "Ldl0/w;", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface k extends dl0.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f17625a;

    /* JADX INFO: renamed from: bl0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lbl0/k$a;", "", "<init>", "()V", "Lbl0/k;", "b", "Lbl0/k;", "a", "()Lbl0/k;", "getEmpty$annotations", "Empty", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17625a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final k Empty = e.f17600c;

        private Companion() {
        }

        public final k a() {
            return Empty;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static void a(k kVar, wn0.p<? super String, ? super List<String>, jn0.h0> body) {
            p013kotlin.jvm.internal.s.k(body, "body");
            dl0.w.a.a(kVar, body);
        }

        public static String b(k kVar, String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            return dl0.w.a.b(kVar, name);
        }
    }
}
