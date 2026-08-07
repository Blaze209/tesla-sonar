package w;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import c0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class i0 implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraDevice f120172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f120173b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f120174a;

        a(@NonNull Handler handler) {
            this.f120174a = handler;
        }
    }

    i0(@NonNull CameraDevice cameraDevice, Object obj) {
        this.f120172a = (CameraDevice) u5.h.g(cameraDevice);
        this.f120173b = obj;
    }

    private static void b(CameraDevice cameraDevice, @NonNull List<x.j> list) {
        String id2 = cameraDevice.getId();
        Iterator<x.j> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (strC != null && !strC.isEmpty()) {
                y0.l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + strC + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, x.p pVar) {
        u5.h.g(cameraDevice);
        u5.h.g(pVar);
        u5.h.g(pVar.e());
        List<x.j> listC = pVar.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (pVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, listC);
    }

    static List<Surface> d(@NonNull List<x.j> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<x.j> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }
}
