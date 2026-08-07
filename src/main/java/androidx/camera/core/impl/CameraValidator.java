package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class CameraValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0.p f3085a = new c0.p.a().d(2).b();

    public static class CameraIdListIncorrectException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3086a;

        public CameraIdListIncorrectException(String str, int i11, Throwable th2) {
            super(str, th2);
            this.f3086a = i11;
        }

        public int a() {
            return this.f3086a;
        }
    }

    private static class a {
        static int a(@NonNull Context context) {
            return context.getDeviceId();
        }
    }

    public static void a(@NonNull Context context, @NonNull p0 p0Var, c0.p pVar) throws CameraIdListIncorrectException {
        Integer numD;
        int i11 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<j0> linkedHashSetD = p0Var.d();
            if (linkedHashSetD.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            c0.y0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + linkedHashSetD.size() + " cameras. Skipping validation.");
            return;
        }
        if (pVar != null) {
            try {
                numD = pVar.d();
                if (numD == null) {
                    c0.y0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                c0.y0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            numD = null;
        }
        c0.y0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (pVar == null || numD.intValue() == 1)) {
                c0.p.f18377d.e(p0Var.d());
                i11 = 1;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            c0.y0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (pVar == null || numD.intValue() == 0)) {
                c0.p.f18376c.e(p0Var.d());
                i11++;
            }
        } catch (IllegalArgumentException e13) {
            illegalArgumentException = e13;
            c0.y0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f3085a.e(p0Var.d());
            c0.y0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i11++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        c0.y0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + p0Var.d());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i11, illegalArgumentException);
    }
}
