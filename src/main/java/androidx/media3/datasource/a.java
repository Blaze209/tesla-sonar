package androidx.media3.datasource;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p7.j;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public interface a extends j {

    /* JADX INFO: renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    public interface InterfaceC0192a {
        a a();
    }

    default Map<String, List<String>> b() {
        return Collections.EMPTY_MAP;
    }

    void close();

    Uri getUri();

    long j(v7.j jVar);

    void n(q qVar);
}
