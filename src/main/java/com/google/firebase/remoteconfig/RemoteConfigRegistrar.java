package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import qw.h;
import yu.a0;
import yu.d;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(a0 a0Var, d dVar) {
        return new c((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.d(a0Var), (f) dVar.a(f.class), (zv.f) dVar.a(zv.f.class), ((com.google.firebase.abt.component.a) dVar.a(com.google.firebase.abt.component.a.class)).b("frc"), dVar.h(wu.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        final a0 a0VarA = a0.a(xu.b.class, ScheduledExecutorService.class);
        return Arrays.asList(yu.c.d(c.class, tw.a.class).h(LIBRARY_NAME).b(q.k(Context.class)).b(q.l(a0VarA)).b(q.k(f.class)).b(q.k(zv.f.class)).b(q.k(com.google.firebase.abt.component.a.class)).b(q.i(wu.a.class)).f(new g() { // from class: rw.m
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return RemoteConfigRegistrar.a(a0VarA, dVar);
            }
        }).e().d(), h.b(LIBRARY_NAME, "23.0.1"));
    }
}
