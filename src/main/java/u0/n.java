package u0;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.x0;

/* JADX INFO: loaded from: classes.dex */
public class n implements s2 {

    @NonNull
    private x0 K;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d2 f115238a = d2.c0();

        public static /* synthetic */ boolean a(b bVar, x0 x0Var, x0.a aVar) {
            bVar.f115238a.m(aVar, x0Var.h(aVar), x0Var.a(aVar));
            return true;
        }

        @NonNull
        public static b c(@NonNull final x0 x0Var) {
            final b bVar = new b();
            x0Var.b("camera2.captureRequest.option.", new x0.b() { // from class: u0.o
                @Override // androidx.camera.core.impl.x0.b
                public final boolean a(x0.a aVar) {
                    return n.b.a(this.f115239a, x0Var, aVar);
                }
            });
            return bVar;
        }

        @NonNull
        public n b() {
            return new n(i2.b0(this.f115238a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> b d(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.f115238a.K(n.Z(key), valuet);
            return this;
        }
    }

    @NonNull
    static x0.a<Object> Z(@NonNull CaptureRequest.Key<?> key) {
        return x0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }

    private n(@NonNull x0 x0Var) {
        this.K = x0Var;
    }
}
