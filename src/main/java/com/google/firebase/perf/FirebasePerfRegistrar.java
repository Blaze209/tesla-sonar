package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import hw.b;
import hw.e;
import iw.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import nq.j;
import qw.h;
import yu.a0;
import yu.d;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ b b(a0 a0Var, d dVar) {
        return new b((f) dVar.a(f.class), (n) dVar.h(n.class).get(), (Executor) dVar.d(a0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(d dVar) {
        dVar.a(b.class);
        return a.a().b(new jw.a((f) dVar.a(f.class), (zv.f) dVar.a(zv.f.class), dVar.h(c.class), dVar.h(j.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<yu.c<?>> getComponents() {
        final a0 a0VarA = a0.a(xu.d.class, Executor.class);
        return Arrays.asList(yu.c.c(e.class).h(LIBRARY_NAME).b(q.k(f.class)).b(q.m(c.class)).b(q.k(zv.f.class)).b(q.m(j.class)).b(q.k(b.class)).f(new g() { // from class: hw.c
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebasePerfRegistrar.providesFirebasePerformance(dVar);
            }
        }).d(), yu.c.c(b.class).h(EARLY_LIBRARY_NAME).b(q.k(f.class)).b(q.i(n.class)).b(q.l(a0VarA)).e().f(new g() { // from class: hw.d
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebasePerfRegistrar.b(a0VarA, dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "22.0.3"));
    }
}
