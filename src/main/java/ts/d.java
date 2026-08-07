package ts;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f114979a = new j0();

    long a();

    void b();

    q c(Looper looper, Handler.Callback callback);

    long elapsedRealtime();
}
