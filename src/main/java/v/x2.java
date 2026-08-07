package v;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class x2 {
    static CameraCaptureSession.CaptureCallback a(androidx.camera.core.impl.p pVar) {
        if (pVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(pVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : y0.a(arrayList);
    }

    static void b(androidx.camera.core.impl.p pVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (pVar instanceof androidx.camera.core.impl.q.a) {
            Iterator<androidx.camera.core.impl.p> it = ((androidx.camera.core.impl.q.a) pVar).f().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (pVar instanceof w2) {
            list.add(((w2) pVar).g());
        } else {
            list.add(new v2(pVar));
        }
    }
}
