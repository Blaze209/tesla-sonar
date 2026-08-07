package v;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
class s2 {
    private static String a(w.m0 m0Var, Integer num, List<String> list) {
        if (num != null && list.contains(WebrtcBuildVersion.maint_version) && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) m0Var.c(WebrtcBuildVersion.maint_version).a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) m0Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return WebrtcBuildVersion.maint_version;
            }
        }
        return null;
    }

    static List<String> b(@NonNull x xVar, c0.p pVar) throws InitializationException {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(xVar.d().d());
            if (pVar == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = a(xVar.d(), pVar.d(), listAsList);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strA)) {
                        arrayList2.add(xVar.f(str));
                    }
                }
                Iterator<c0.n> it2 = pVar.b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((androidx.camera.core.impl.i0) it2.next()).d());
                }
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e11) {
            throw new InitializationException(u2.a(e11));
        } catch (CameraUnavailableException e12) {
            throw new InitializationException(e12);
        }
    }
}
