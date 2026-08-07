package com.fourthline.vision.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Size;
import android.view.Display;
import com.fourthline.core.internal.AndroidDevicesKt;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4312x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b f39069i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39070j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Size f39071k = new Size(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f39072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f39073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Display f39074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f39076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Size f39077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f39079h;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x$a */
    public enum a {
        PREVIEW,
        RECORDING;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39083d = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f39083d;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x$c */
    public enum c {
        FRONT,
        BACK;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39087d = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return f39087d;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x$d */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4312x(CameraManager delegate, c cameraDirection, Display display) throws CameraAccessException {
        String str;
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(cameraDirection, "cameraDirection");
        p013kotlin.jvm.internal.s.k(display, "display");
        this.f39072a = delegate;
        this.f39073b = cameraDirection;
        this.f39074c = display;
        String[] cameraIdList = delegate.getCameraIdList();
        p013kotlin.jvm.internal.s.j(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i11];
            Integer num = (Integer) delegate.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
            int i12 = d.$EnumSwitchMapping$0[this.f39073b.ordinal()];
            int i13 = 1;
            if (i12 == 1) {
                i13 = 0;
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null && num.intValue() == i13) {
                break;
            } else {
                i11++;
            }
        }
        this.f39075d = str;
        this.f39076e = getSize(SurfaceTexture.class);
        this.f39077f = getSize(ImageReader.class);
        this.f39078g = getRotationCompensation();
        this.f39079h = AndroidDevicesKt.isXiaomiRedmi9TDevice() ? a.PREVIEW : a.RECORDING;
    }

    private final List<Size> getAllSupportedSizes(Class<?> cls) {
        StreamConfigurationMap streamConfigurationMap;
        String str = this.f39075d;
        if (str == null || (streamConfigurationMap = (StreamConfigurationMap) this.f39072a.getCameraCharacteristics(str).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null || !StreamConfigurationMap.isOutputSupportedFor(cls)) {
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
        p013kotlin.jvm.internal.s.j(outputSizes, "getOutputSizes(...)");
        return p013kotlin.collections.n.h(outputSizes);
    }

    private final int getRotationCompensation() {
        int i11;
        if (this.f39075d == null) {
            return 0;
        }
        int rotation = this.f39074c.getRotation();
        if (rotation == 0) {
            i11 = 90;
        } else if (rotation == 1) {
            i11 = 0;
        } else if (rotation == 2) {
            i11 = 270;
        } else {
            if (rotation != 3) {
                if (getClass().isAnonymousClass()) {
                    String name = getClass().getName();
                    int length = name.length();
                    p013kotlin.jvm.internal.s.h(name);
                    if (length > 23) {
                        p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    String simpleName = getClass().getSimpleName();
                    int length2 = simpleName.length();
                    p013kotlin.jvm.internal.s.h(simpleName);
                    if (length2 > 23) {
                        p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                return 0;
            }
            i11 = 180;
        }
        Integer num = (Integer) this.f39072a.getCameraCharacteristics(this.f39075d).get(CameraCharacteristics.SENSOR_ORIENTATION);
        return ((i11 + (num != null ? num.intValue() : 0)) + EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE) % 360;
    }

    public final String getCameraId() {
        return this.f39075d;
    }

    public final Size getCameraPreviewSize() {
        return this.f39076e;
    }

    protected final CameraManager getDelegate() {
        return this.f39072a;
    }

    public Size getImageReaderSize() {
        return this.f39077f;
    }

    public final int getOrientationHint() {
        return this.f39078g;
    }

    protected final Size getSize(Class<?> expectedConsumerClass) {
        ArrayList arrayList;
        Size size;
        Object next;
        p013kotlin.jvm.internal.s.k(expectedConsumerClass, "expectedConsumerClass");
        List<Size> allSupportedSizes = getAllSupportedSizes(expectedConsumerClass);
        Size size2 = null;
        Object next2 = null;
        if (allSupportedSizes != null) {
            arrayList = new ArrayList();
            for (Object obj : allSupportedSizes) {
                if (((Size) obj).getHeight() >= 1080) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int height = ((Size) next).getHeight();
                    do {
                        Object next3 = it.next();
                        int height2 = ((Size) next3).getHeight();
                        if (height > height2) {
                            next = next3;
                            height = height2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            size = (Size) next;
        } else {
            size = null;
        }
        if (size != null) {
            return size;
        }
        if (allSupportedSizes != null) {
            Iterator<T> it2 = allSupportedSizes.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int height3 = ((Size) next2).getHeight();
                    do {
                        Object next4 = it2.next();
                        int height4 = ((Size) next4).getHeight();
                        if (height3 < height4) {
                            next2 = next4;
                            height3 = height4;
                        }
                    } while (it2.hasNext());
                }
            }
            size2 = (Size) next2;
        }
        return size2 == null ? f39071k : size2;
    }

    public final a getSupportedCameraTemplate() {
        return this.f39079h;
    }
}
