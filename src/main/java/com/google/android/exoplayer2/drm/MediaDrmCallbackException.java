package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss.l f39804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f39805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f39806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39807d;

    public MediaDrmCallbackException(ss.l lVar, Uri uri, Map<String, List<String>> map, long j11, Throwable th2) {
        super(th2);
        this.f39804a = lVar;
        this.f39805b = uri;
        this.f39806c = map;
        this.f39807d = j11;
    }
}
