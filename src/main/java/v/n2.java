package v;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements androidx.camera.core.impl.p3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i3 f117127b;

    public n2(@NonNull Context context) {
        this.f117127b = i3.c(context);
    }

    @Override // androidx.camera.core.impl.p3
    @NonNull
    public androidx.camera.core.impl.x0 a(@NonNull androidx.camera.core.impl.p3.b bVar, int i11) {
        androidx.camera.core.impl.d2 d2VarC0 = androidx.camera.core.impl.d2.c0();
        androidx.camera.core.impl.x2.b bVar2 = new androidx.camera.core.impl.x2.b();
        bVar2.B(h5.b(bVar, i11));
        d2VarC0.K(androidx.camera.core.impl.o3.f3266u, bVar2.p());
        d2VarC0.K(androidx.camera.core.impl.o3.f3268w, m2.f117116a);
        androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
        aVar.v(h5.a(bVar, i11));
        d2VarC0.K(androidx.camera.core.impl.o3.f3267v, aVar.h());
        d2VarC0.K(androidx.camera.core.impl.o3.f3269x, bVar == androidx.camera.core.impl.p3.b.IMAGE_CAPTURE ? g4.f117008c : z0.f117419a);
        if (bVar == androidx.camera.core.impl.p3.b.PREVIEW) {
            d2VarC0.K(androidx.camera.core.impl.r1.f3292q, this.f117127b.f());
        }
        d2VarC0.K(androidx.camera.core.impl.r1.f3287l, Integer.valueOf(this.f117127b.d(true).getRotation()));
        if (bVar == androidx.camera.core.impl.p3.b.VIDEO_CAPTURE || bVar == androidx.camera.core.impl.p3.b.STREAM_SHARING) {
            d2VarC0.K(androidx.camera.core.impl.o3.A, Boolean.TRUE);
        }
        return androidx.camera.core.impl.i2.b0(d2VarC0);
    }
}
