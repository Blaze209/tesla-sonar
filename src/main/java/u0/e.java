package u0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.z2;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final List<CaptureRequest.Key> f115216h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PreviewExtenderImpl f115218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageCaptureExtenderImpl f115219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i0 f115220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f115221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CameraCharacteristics f115222f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0.d f115217a = new w0.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w0.a f115223g = new w0.a();

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        f115216h = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public e(int i11) {
        this.f115218b = null;
        this.f115219c = null;
        try {
            if (i11 == 1) {
                this.f115218b = new BokehPreviewExtenderImpl();
                this.f115219c = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i11 == 2) {
                this.f115218b = new HdrPreviewExtenderImpl();
                this.f115219c = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i11 == 3) {
                this.f115218b = new NightPreviewExtenderImpl();
                this.f115219c = new NightImageCaptureExtenderImpl();
            } else if (i11 == 4) {
                this.f115218b = new BeautyPreviewExtenderImpl();
                this.f115219c = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i11 != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.f115218b = new AutoPreviewExtenderImpl();
                this.f115219c = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            y0.c("BasicVendorExtender", "OEM implementation for extension mode " + i11 + "does not exist!");
        }
    }

    private int n() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.f115219c;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    private Size[] o(int i11) {
        return ((StreamConfigurationMap) this.f115222f.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i11);
    }

    private int p() {
        PreviewExtenderImpl previewExtenderImpl = this.f115218b;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    @NonNull
    private List<CaptureRequest.Key> q(Context context) {
        if (!h.g(q.f115244d)) {
            return Collections.unmodifiableList(f115216h);
        }
        try {
            List<CaptureRequest.Key> listA = this.f115223g.a(this.f115219c, this.f115221e, this.f115222f, context);
            if (listA != null) {
                return Collections.unmodifiableList(listA);
            }
        } catch (Exception e11) {
            y0.d("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e11);
        }
        return Collections.EMPTY_LIST;
    }

    private List<Pair<Integer, Size[]>> r(List<Pair<Integer, Size[]>> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).intValue() == i11) {
                arrayList.add(new Pair(Integer.valueOf(i11), (Size[]) pair.second));
                return arrayList;
            }
        }
        for (Pair<Integer, Size[]> pair2 : list) {
            if (((Integer) pair2.first).intValue() == i12) {
                arrayList.add(new Pair(Integer.valueOf(i11), (Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("Supported resolution should contain " + i11 + " format.");
    }

    @Override // u0.p
    @NonNull
    public Map<Integer, List<Size>> a(@NonNull Size size) {
        q qVar = q.f115245e;
        if (!g.d(qVar) || !h.g(qVar)) {
            return Collections.EMPTY_MAP;
        }
        List<Pair> supportedPostviewResolutions = this.f115219c.getSupportedPostviewResolutions(size);
        HashMap map = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            map.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(map);
    }

    @Override // u0.p
    @NonNull
    public List<Pair<Integer, Size[]>> b() {
        u5.h.h(this.f115220d, "VendorExtender#init() must be called first");
        if (this.f115219c != null && h.b().compareTo(q.f115242b) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f115219c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.f115219c.getCaptureProcessor() != null ? r(supportedResolutions, 35, 256) : supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int iN = n();
        return Arrays.asList(new Pair(Integer.valueOf(iN), o(iN)));
    }

    @Override // u0.p
    @NonNull
    public List<CaptureResult.Key> c() {
        if (h.g(q.f115244d)) {
            try {
                List availableCaptureResultKeys = this.f115219c.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception e11) {
                y0.d("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e11);
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // u0.p
    public boolean e(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        if (!this.f115217a.a(str) && this.f115218b != null && this.f115219c != null) {
            CameraCharacteristics cameraCharacteristics = map.get(str);
            if (this.f115218b.isExtensionAvailable(str, cameraCharacteristics) && this.f115219c.isExtensionAvailable(str, cameraCharacteristics)) {
                return true;
            }
        }
        return false;
    }

    @Override // u0.p
    public boolean f() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar)) {
            return this.f115219c.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // u0.p
    @NonNull
    public Size[] g() {
        u5.h.h(this.f115220d, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // u0.p
    public boolean h() {
        return false;
    }

    @Override // u0.p
    @NonNull
    public List<Pair<Integer, Size[]>> i() {
        u5.h.h(this.f115220d, "VendorExtender#init() must be called first");
        if (this.f115218b != null && h.b().compareTo(q.f115242b) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f115218b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return r(supportedResolutions, 34, 35);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, o(p())));
    }

    @Override // u0.p
    public z2 j(@NonNull Context context) {
        u5.h.h(this.f115220d, "VendorExtender#init() must be called first");
        return new androidx.camera.extensions.internal.sessionprocessor.f(this.f115218b, this.f115219c, q(context), this, context);
    }

    @Override // u0.p
    public void l(@NonNull c0.n nVar) {
        i0 i0Var = (i0) nVar;
        this.f115220d = i0Var;
        if (this.f115218b == null || this.f115219c == null) {
            return;
        }
        this.f115221e = i0Var.d();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.f115220d.p();
        this.f115222f = cameraCharacteristics;
        this.f115218b.init(this.f115221e, cameraCharacteristics);
        this.f115219c.init(this.f115221e, this.f115222f);
        y0.a("BasicVendorExtender", "PreviewExtender processorType= " + this.f115218b.getProcessorType());
        y0.a("BasicVendorExtender", "ImageCaptureExtender processor= " + this.f115219c.getCaptureProcessor());
    }

    @Override // u0.p
    public boolean m() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar)) {
            return this.f115219c.isPostviewAvailable();
        }
        return false;
    }
}
