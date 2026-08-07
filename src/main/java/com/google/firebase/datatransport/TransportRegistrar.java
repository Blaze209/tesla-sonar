package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import nq.j;
import pq.u;
import pv.b;
import qw.h;
import yu.a0;
import yu.c;
import yu.d;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ j a(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().h(a.f39356g);
    }

    public static /* synthetic */ j b(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().h(a.f39357h);
    }

    public static /* synthetic */ j c(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().h(a.f39357h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(j.class).h(LIBRARY_NAME).b(q.k(Context.class)).f(new g() { // from class: pv.c
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return TransportRegistrar.c(dVar);
            }
        }).d(), c.e(a0.a(pv.a.class, j.class)).b(q.k(Context.class)).f(new g() { // from class: pv.d
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return TransportRegistrar.b(dVar);
            }
        }).d(), c.e(a0.a(b.class, j.class)).b(q.k(Context.class)).f(new g() { // from class: pv.e
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return TransportRegistrar.a(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
