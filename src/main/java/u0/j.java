package u0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j {

    private static class a {
        static Set<String> a(@NonNull CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (Exception unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    @NonNull
    public static Map<String, CameraCharacteristics> a(@NonNull i0 i0Var) {
        Set<String> setA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strD = i0Var.d();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) i0Var.p();
        linkedHashMap.put(strD, cameraCharacteristics);
        if (Build.VERSION.SDK_INT >= 28 && (setA = a.a(cameraCharacteristics)) != null) {
            for (String str : setA) {
                if (!Objects.equals(str, strD)) {
                    linkedHashMap.put(str, (CameraCharacteristics) i0Var.y(str));
                }
            }
        }
        return linkedHashMap;
    }
}
