package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import ay.d;
import ay.f;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.i;
import java.util.List;
import yu.c;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbn.zzi(c.c(f.class).b(q.k(i.class)).f(new g() { // from class: ay.l
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new f((com.google.mlkit.common.sdkinternal.i) dVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d(), c.c(d.class).b(q.k(f.class)).b(q.k(com.google.mlkit.common.sdkinternal.d.class)).f(new g() { // from class: ay.m
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new d((f) dVar.a(f.class), (com.google.mlkit.common.sdkinternal.d) dVar.a(com.google.mlkit.common.sdkinternal.d.class));
            }
        }).d());
    }
}
