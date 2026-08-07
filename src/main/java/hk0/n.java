package hk0;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
abstract class n implements lk0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f73052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f73053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f73054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f73055d;

    protected n(i iVar) {
        Map mapC = freemarker.core.n.c();
        this.f73053b = mapC;
        this.f73054c = freemarker.core.n.b(mapC);
        this.f73055d = new HashSet();
        this.f73052a = iVar;
    }

    void a() {
        synchronized (this.f73052a.i()) {
            this.f73053b.clear();
        }
    }
}
