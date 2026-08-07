package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import yu.d;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public bv.a b(yu.d dVar) {
        Context context = (Context) dVar.a(Context.class);
        return c.f(context, !bv.f.g(context));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        return Arrays.asList(yu.c.c(bv.a.class).h("fire-cls-ndk").b(q.k(Context.class)).f(new yu.g() { // from class: nv.a
            @Override // yu.g
            public final Object a(d dVar) {
                return this.f95473a.b(dVar);
            }
        }).e().d(), qw.h.b("fire-cls-ndk", "20.0.3"));
    }
}
