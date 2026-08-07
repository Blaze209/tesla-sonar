package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h2 {

    static class a {
        static CaptureRequest.Builder a(@NonNull CameraDevice cameraDevice, @NonNull TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(@NonNull androidx.camera.core.impl.v0 v0Var, @NonNull CaptureRequest.Builder builder) {
        if (v0Var.e().equals(androidx.camera.core.impl.c3.f3148a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, v0Var.e());
    }

    private static void b(CaptureRequest.Builder builder, androidx.camera.core.impl.x0 x0Var) {
        b0.k kVarC = b0.k.a.e(x0Var).c();
        for (androidx.camera.core.impl.x0.a<?> aVar : kVarC.g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, kVarC.a(aVar));
            } catch (IllegalArgumentException unused) {
                c0.y0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(@NonNull CaptureRequest.Builder builder, int i11, @NonNull z.z zVar) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : zVar.a(i11).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    static void d(@NonNull androidx.camera.core.impl.v0 v0Var, @NonNull CaptureRequest.Builder builder) {
        if (v0Var.h() == 1 || v0Var.l() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (v0Var.h() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (v0Var.l() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    public static CaptureRequest e(@NonNull androidx.camera.core.impl.v0 v0Var, CameraDevice cameraDevice, @NonNull Map<DeferrableSurface, Surface> map, boolean z11, @NonNull z.z zVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listG = g(v0Var.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        androidx.camera.core.impl.z zVarD = v0Var.d();
        if (v0Var.k() == 5 && zVarD != null && (zVarD.j() instanceof TotalCaptureResult)) {
            c0.y0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) zVarD.j());
        } else {
            c0.y0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (v0Var.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z11 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(v0Var.k());
            }
        }
        c(builderCreateCaptureRequest, v0Var.k(), zVar);
        a(v0Var, builderCreateCaptureRequest);
        d(v0Var, builderCreateCaptureRequest);
        androidx.camera.core.impl.x0 x0VarG = v0Var.g();
        androidx.camera.core.impl.x0.a<Integer> aVar = androidx.camera.core.impl.v0.f3311i;
        if (x0VarG.e(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) v0Var.g().a(aVar));
        }
        androidx.camera.core.impl.x0 x0VarG2 = v0Var.g();
        androidx.camera.core.impl.x0.a<Integer> aVar2 = androidx.camera.core.impl.v0.f3312j;
        if (x0VarG2.e(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v0Var.g().a(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, v0Var.g());
        Iterator<Surface> it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget(it.next());
        }
        builderCreateCaptureRequest.setTag(v0Var.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(@NonNull androidx.camera.core.impl.v0 v0Var, CameraDevice cameraDevice, @NonNull z.z zVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        c0.y0.a("Camera2CaptureRequestBuilder", "template type = " + v0Var.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(v0Var.k());
        c(builderCreateCaptureRequest, v0Var.k(), zVar);
        a(v0Var, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, v0Var.g());
        return builderCreateCaptureRequest.build();
    }

    @NonNull
    private static List<Surface> g(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
