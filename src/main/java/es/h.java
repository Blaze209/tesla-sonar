package es;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f63142h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss.l f63144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f63145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f63146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f63149g;

    public h(long j11, ss.l lVar, long j12) {
        this(j11, lVar, lVar.f111661a, Collections.EMPTY_MAP, j12, 0L, 0L);
    }

    public static long a() {
        return f63142h.getAndIncrement();
    }

    public h(long j11, ss.l lVar, Uri uri, Map<String, List<String>> map, long j12, long j13, long j14) {
        this.f63143a = j11;
        this.f63144b = lVar;
        this.f63145c = uri;
        this.f63146d = map;
        this.f63147e = j12;
        this.f63148f = j13;
        this.f63149g = j14;
    }
}
