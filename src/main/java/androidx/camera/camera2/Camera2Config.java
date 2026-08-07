package androidx.camera.camera2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.f0;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.t0;
import c0.p;
import c0.x;
import java.util.Set;
import v.i2;
import v.n2;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config {

    public static final class DefaultProvider implements x.b {
        @Override // c0.x.b
        @NonNull
        public x getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ p3 a(Context context) {
        return new n2(context);
    }

    public static /* synthetic */ f0 b(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new i2(context, obj, set);
        } catch (CameraUnavailableException e11) {
            throw new InitializationException(e11);
        }
    }

    @NonNull
    public static x c() {
        g0.a aVar = new g0.a() { // from class: t.a
            @Override // androidx.camera.core.impl.g0.a
            public final g0 a(Context context, t0 t0Var, p pVar, long j11) {
                return new v.x(context, t0Var, pVar, j11);
            }
        };
        f0.a aVar2 = new f0.a() { // from class: t.b
            @Override // androidx.camera.core.impl.f0.a
            public final f0 a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new x.a().c(aVar).d(aVar2).g(new p3.c() { // from class: t.c
            @Override // androidx.camera.core.impl.p3.c
            public final p3 newInstance(Context context) {
                return Camera2Config.a(context);
            }
        }).a();
    }
}
