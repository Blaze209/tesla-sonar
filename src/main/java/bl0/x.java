package bl0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbl0/x;", "Ldl0/w;", "b", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x extends dl0.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f17758a;

    /* JADX INFO: renamed from: bl0.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lbl0/x$a;", "", "<init>", "()V", "Lbl0/x;", "b", "Lbl0/x;", "a", "()Lbl0/x;", "Empty", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17758a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final x Empty = f.f17601c;

        private Companion() {
        }

        public final x a() {
            return Empty;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static void a(x xVar, wn0.p<? super String, ? super List<String>, jn0.h0> body) {
            p013kotlin.jvm.internal.s.k(body, "body");
            dl0.w.a.a(xVar, body);
        }
    }
}
