package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class Camera1Helper {
    public static Size findClosestCaptureFormat(int i11, int i12, int i13) {
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(i11);
        ArrayList arrayList = new ArrayList();
        if (supportedFormats != null) {
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                arrayList.add(new Size(captureFormat.width, captureFormat.height));
            }
        }
        return CameraEnumerationAndroid.getClosestSupportedSize(arrayList, i12, i13);
    }

    public static int getCameraId(String str) {
        return Camera1Enumerator.getCameraIndex(str);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i11) {
        return Camera1Enumerator.getSupportedFormats(i11);
    }
}
