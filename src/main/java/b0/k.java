package b0;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.x0;
import c0.d0;

/* JADX INFO: loaded from: classes.dex */
public class k implements s2 {
    private final x0 K;

    public static final class a implements d0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d2 f15247a = d2.c0();

        public static /* synthetic */ boolean a(a aVar, x0 x0Var, x0.a aVar2) {
            aVar.b().m(aVar2, x0Var.h(aVar2), x0Var.a(aVar2));
            return true;
        }

        @NonNull
        public static a e(@NonNull final x0 x0Var) {
            final a aVar = new a();
            x0Var.b("camera2.captureRequest.option.", new x0.b() { // from class: b0.j
                @Override // androidx.camera.core.impl.x0.b
                public final boolean a(x0.a aVar2) {
                    return k.a.a(this.f15245a, x0Var, aVar2);
                }
            });
            return aVar;
        }

        @Override // c0.d0
        @NonNull
        public c2 b() {
            return this.f15247a;
        }

        @NonNull
        public k c() {
            return new k(i2.b0(this.f15247a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> a f(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.f15247a.K(u.a.Z(key), valuet);
            return this;
        }
    }

    public k(@NonNull x0 x0Var) {
        this.K = x0Var;
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }
}
