package com.fourthline.vision.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f37680f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f37681g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession f37682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraCharacteristics f37683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraDevice f37684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4312x.a f37685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f37686e;

    private class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C4312x.a.values().length];
            try {
                iArr[C4312x.a.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4312x.a.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public F(CameraCaptureSession cameraCaptureSession, CameraCharacteristics cameraCharacteristics, CameraDevice camera, C4312x.a cameraTemplate, Handler cameraHandler) {
        p013kotlin.jvm.internal.s.k(cameraCaptureSession, "cameraCaptureSession");
        p013kotlin.jvm.internal.s.k(cameraCharacteristics, "cameraCharacteristics");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        p013kotlin.jvm.internal.s.k(cameraTemplate, "cameraTemplate");
        p013kotlin.jvm.internal.s.k(cameraHandler, "cameraHandler");
        this.f37682a = cameraCaptureSession;
        this.f37683b = cameraCharacteristics;
        this.f37684c = camera;
        this.f37685d = cameraTemplate;
        this.f37686e = cameraHandler;
    }

    private final CaptureRequest.Builder createCaptureRequestBuilder(List<? extends Surface> list) throws CameraAccessException {
        int i11 = c.$EnumSwitchMapping$0[this.f37685d.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 3;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = this.f37684c.createCaptureRequest(i12);
        p013kotlin.jvm.internal.s.j(builderCreateCaptureRequest, "createCaptureRequest(...)");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        return builderCreateCaptureRequest;
    }

    private final boolean isMeteringAreaAFSupported() {
        Integer num = (Integer) this.f37683b.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        int iIntValue = num != null ? num.intValue() : 0;
        if (F.class.isAnonymousClass()) {
            String name = F.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = F.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        return iIntValue > 0;
    }

    public static /* synthetic */ void setup$fourthline_vision_release$default(F f11, String str, List list, MeteringRectangle meteringRectangle, int i11, Object obj) throws CameraAccessException {
        if ((i11 & 4) != 0) {
            meteringRectangle = null;
        }
        f11.setup$fourthline_vision_release(str, list, meteringRectangle);
    }

    public final void setup$fourthline_vision_release(String cameraId, List<? extends Surface> targets, MeteringRectangle meteringRectangle) throws CameraAccessException {
        p013kotlin.jvm.internal.s.k(cameraId, "cameraId");
        p013kotlin.jvm.internal.s.k(targets, "targets");
        if (F.class.isAnonymousClass()) {
            String name = F.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = F.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        targets.size();
        Objects.toString(meteringRectangle);
        this.f37682a.stopRepeating();
        CaptureRequest.Builder builderCreateCaptureRequestBuilder = createCaptureRequestBuilder(targets);
        builderCreateCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        if (isMeteringAreaAFSupported() && meteringRectangle != null) {
            builderCreateCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        this.f37682a.setRepeatingRequest(builderCreateCaptureRequestBuilder.build(), new a(), this.f37686e);
    }
}
