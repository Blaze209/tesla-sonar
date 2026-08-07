package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import yu.c;
import yu.d;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzp.zzi(c.c(a.class).b(q.o(a.C0706a.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // yu.g
            public final Object a(d dVar) {
                return new a(dVar.f(a.C0706a.class));
            }
        }).d());
    }
}
