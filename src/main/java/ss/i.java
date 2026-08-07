package ss;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface i extends g {

    public interface a {
        i a();
    }

    default Map<String, List<String>> b() {
        return Collections.EMPTY_MAP;
    }

    void close();

    Uri getUri();

    long j(l lVar);

    void m(z zVar);
}
