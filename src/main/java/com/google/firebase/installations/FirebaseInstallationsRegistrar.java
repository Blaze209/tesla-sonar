package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import wv.i;
import yu.a0;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ zv.f a(yu.d dVar) {
        return new c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), dVar.h(i.class), (ExecutorService) dVar.d(a0.a(xu.a.class, ExecutorService.class)), zu.i.b((Executor) dVar.d(a0.a(xu.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        return Arrays.asList(yu.c.c(zv.f.class).h(LIBRARY_NAME).b(q.k(com.google.firebase.f.class)).b(q.i(i.class)).b(q.l(a0.a(xu.a.class, ExecutorService.class))).b(q.l(a0.a(xu.b.class, Executor.class))).f(new yu.g() { // from class: zv.g
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebaseInstallationsRegistrar.a(dVar);
            }
        }).d(), wv.h.a(), qw.h.b(LIBRARY_NAME, "19.0.1"));
    }
}
