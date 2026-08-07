package n8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f93556h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.j f93558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f93559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f93560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f93561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f93562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f93563g;

    public i(long j11, v7.j jVar, long j12) {
        this(j11, jVar, jVar.f118101a, Collections.EMPTY_MAP, j12, 0L, 0L);
    }

    public static long a() {
        return f93556h.getAndIncrement();
    }

    public i(long j11, v7.j jVar, Uri uri, Map<String, List<String>> map, long j12, long j13, long j14) {
        this.f93557a = j11;
        this.f93558b = jVar;
        this.f93559c = uri;
        this.f93560d = map;
        this.f93561e = j12;
        this.f93562f = j13;
        this.f93563g = j14;
    }
}
