package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import ey.s;
import ey.t;
import java.util.List;
import yu.c;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbk.zzi(c.c(t.class).b(q.k(i.class)).f(new g() { // from class: ey.w
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new t((com.google.mlkit.common.sdkinternal.i) dVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d(), c.c(s.class).b(q.k(t.class)).b(q.k(d.class)).f(new g() { // from class: ey.x
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return new s((t) dVar.a(t.class), (com.google.mlkit.common.sdkinternal.d) dVar.a(com.google.mlkit.common.sdkinternal.d.class));
            }
        }).d());
    }
}
