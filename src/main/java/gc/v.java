package gc;

import ch.qos.logback.core.joran.action.Action;
import com.fourthline.adapters.serialization.OrcaKeys;
import okio.i0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokio/i0;", Action.FILE_ATTRIBUTE, "Lokio/o;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lgc/u$a;", OrcaKeys.METADATA, "Lgc/u;", "b", "(Lokio/i0;Lokio/o;Ljava/lang/String;Ljava/lang/AutoCloseable;Lgc/u$a;)Lgc/u;", "Lokio/j;", "source", "a", "(Lokio/j;Lokio/o;Lgc/u$a;)Lgc/u;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final u a(okio.j jVar, okio.o oVar, u.a aVar) {
        return new x(jVar, oVar, aVar);
    }

    public static final u b(i0 i0Var, okio.o oVar, String str, AutoCloseable autoCloseable, u.a aVar) {
        return new t(i0Var, oVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ u c(okio.j jVar, okio.o oVar, u.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        return a(jVar, oVar, aVar);
    }

    public static /* synthetic */ u d(i0 i0Var, okio.o oVar, String str, AutoCloseable autoCloseable, u.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i11 & 16) != 0) {
            aVar = null;
        }
        return b(i0Var, oVar, str, autoCloseable, aVar);
    }
}
