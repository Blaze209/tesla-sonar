package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g0 f80588b = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f80589a = new CopyOnWriteArrayList();

    public interface a {
    }

    private g0() {
    }

    public static g0 a() {
        return f80588b;
    }

    public void b(a aVar) {
        this.f80589a.add(aVar);
    }
}
