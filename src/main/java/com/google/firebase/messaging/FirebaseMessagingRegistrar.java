package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(yu.a0 a0Var, yu.d dVar) {
        return new FirebaseMessaging((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (xv.a) dVar.a(xv.a.class), dVar.h(qw.i.class), dVar.h(wv.j.class), (zv.f) dVar.a(zv.f.class), dVar.e(a0Var), (vv.d) dVar.a(vv.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<yu.c<?>> getComponents() {
        final yu.a0 a0VarA = yu.a0.a(pv.b.class, nq.j.class);
        return Arrays.asList(yu.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(yu.q.k(com.google.firebase.f.class)).b(yu.q.h(xv.a.class)).b(yu.q.i(qw.i.class)).b(yu.q.i(wv.j.class)).b(yu.q.k(zv.f.class)).b(yu.q.j(a0VarA)).b(yu.q.k(vv.d.class)).f(new yu.g() { // from class: com.google.firebase.messaging.d0
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebaseMessagingRegistrar.a(a0VarA, dVar);
            }
        }).c().d(), qw.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
