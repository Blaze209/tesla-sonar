package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.d;
import java.util.List;
import vx.i;
import yu.c;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzcs.zzh(c.c(i.class).b(q.k(com.google.mlkit.common.sdkinternal.i.class)).f(new g() { // from class: vx.c
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new i((com.google.mlkit.common.sdkinternal.i) dVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d(), c.c(vx.g.class).b(q.k(i.class)).b(q.k(d.class)).b(q.k(com.google.mlkit.common.sdkinternal.i.class)).f(new g() { // from class: vx.d
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new g((i) dVar.a(i.class), (com.google.mlkit.common.sdkinternal.d) dVar.a(com.google.mlkit.common.sdkinternal.d.class), (com.google.mlkit.common.sdkinternal.i) dVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d());
    }
}
