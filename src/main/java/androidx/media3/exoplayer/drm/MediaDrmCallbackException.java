package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.j f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f9785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f9786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9787d;

    public MediaDrmCallbackException(v7.j jVar, Uri uri, Map<String, List<String>> map, long j11, Throwable th2) {
        super(th2);
        this.f9784a = jVar;
        this.f9785b = uri;
        this.f9786c = map;
        this.f9787d = j11;
    }
}
