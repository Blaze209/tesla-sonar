package hr;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f73375a = new p() { // from class: hr.o
        @Override // hr.p
        public final k[] d() {
            return p.e();
        }
    };

    static /* synthetic */ k[] e() {
        return new k[0];
    }

    default k[] b(Uri uri, Map<String, List<String>> map) {
        return d();
    }

    k[] d();
}
