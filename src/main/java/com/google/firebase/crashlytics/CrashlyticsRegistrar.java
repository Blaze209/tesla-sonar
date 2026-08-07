package com.google.firebase.crashlytics;

import bv.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import ev.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import qw.h;
import xu.a;
import xu.b;
import xu.c;
import yu.a0;
import yu.d;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0<ExecutorService> f43923a = a0.a(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<ExecutorService> f43924b = a0.a(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<ExecutorService> f43925c = a0.a(c.class, ExecutorService.class);

    static {
        ww.b.a(ww.c.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(d dVar) {
        i.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsB = FirebaseCrashlytics.b((f) dVar.a(f.class), (zv.f) dVar.a(zv.f.class), dVar.i(bv.a.class), dVar.i(wu.a.class), dVar.i(tw.a.class), (ExecutorService) dVar.d(this.f43923a), (ExecutorService) dVar.d(this.f43924b), (ExecutorService) dVar.d(this.f43925c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsB;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        return Arrays.asList(yu.c.c(FirebaseCrashlytics.class).h("fire-cls").b(q.k(f.class)).b(q.k(zv.f.class)).b(q.l(this.f43923a)).b(q.l(this.f43924b)).b(q.l(this.f43925c)).b(q.a(bv.a.class)).b(q.a(wu.a.class)).b(q.a(tw.a.class)).f(new yu.g() { // from class: av.f
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return this.f15146a.b(dVar);
            }
        }).e().d(), h.b("fire-cls", "20.0.3"));
    }
}
