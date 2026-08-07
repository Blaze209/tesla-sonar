package com.google.mlkit.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.a;
import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.j;
import com.google.mlkit.common.sdkinternal.n;
import java.util.List;
import rx.b;
import yu.c;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzaf.zzi(n.f45079b, c.c(b.class).b(q.k(i.class)).f(new g() { // from class: ox.a
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new rx.b((i) dVar.a(i.class));
            }
        }).d(), c.c(j.class).f(new g() { // from class: ox.b
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new j();
            }
        }).d(), c.c(qx.c.class).b(q.o(qx.c.a.class)).f(new g() { // from class: ox.c
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new qx.c(dVar.f(qx.c.a.class));
            }
        }).d(), c.c(d.class).b(q.m(j.class)).f(new g() { // from class: ox.d
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new com.google.mlkit.common.sdkinternal.d(dVar.h(j.class));
            }
        }).d(), c.c(a.class).f(new g() { // from class: ox.e
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return com.google.mlkit.common.sdkinternal.a.a();
            }
        }).d(), c.c(com.google.mlkit.common.sdkinternal.b.class).b(q.k(a.class)).f(new g() { // from class: ox.f
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new com.google.mlkit.common.sdkinternal.b((com.google.mlkit.common.sdkinternal.a) dVar.a(com.google.mlkit.common.sdkinternal.a.class));
            }
        }).d(), c.c(px.a.class).b(q.k(i.class)).f(new g() { // from class: ox.g
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new px.a((i) dVar.a(i.class));
            }
        }).d(), c.m(qx.c.a.class).b(q.m(px.a.class)).f(new g() { // from class: ox.h
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new qx.c.a(qx.a.class, dVar.h(px.a.class));
            }
        }).d());
    }
}
