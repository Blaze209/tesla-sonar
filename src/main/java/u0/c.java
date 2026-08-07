package u0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.z2;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor;
import c0.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0.d f115208a = new w0.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdvancedExtenderImpl f115209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f115210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f115211d;

    public c(int i11) {
        try {
            if (i11 == 1) {
                this.f115209b = new BokehAdvancedExtenderImpl();
            } else if (i11 == 2) {
                this.f115209b = new HdrAdvancedExtenderImpl();
            } else if (i11 == 3) {
                this.f115209b = new NightAdvancedExtenderImpl();
            } else if (i11 == 4) {
                this.f115209b = new BeautyAdvancedExtenderImpl();
            } else {
                if (i11 != 5) {
                    throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                }
                this.f115209b = new AutoAdvancedExtenderImpl();
            }
            this.f115211d = i11;
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    @NonNull
    private List<Pair<Integer, Size[]>> n(@NonNull Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) map.get(num).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    private List<CaptureRequest.Key> o() {
        List<CaptureRequest.Key> list = Collections.EMPTY_LIST;
        if (h.b().compareTo(q.f115244d) >= 0) {
            try {
                return Collections.unmodifiableList(this.f115209b.getAvailableCaptureRequestKeys());
            } catch (Exception e11) {
                y0.d("AdvancedVendorExtender", "AdvancedExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e11);
            }
        }
        return list;
    }

    @Override // u0.p
    @NonNull
    public Map<Integer, List<Size>> a(@NonNull Size size) {
        q qVar = q.f115245e;
        return (g.d(qVar) && h.g(qVar)) ? Collections.unmodifiableMap(this.f115209b.getSupportedPostviewResolutions(size)) : Collections.EMPTY_MAP;
    }

    @Override // u0.p
    @NonNull
    public List<Pair<Integer, Size[]>> b() {
        u5.h.h(this.f115210c, "VendorExtender#init() must be called first");
        return n(this.f115209b.getSupportedCaptureOutputResolutions(this.f115210c));
    }

    @Override // u0.p
    @NonNull
    public List<CaptureResult.Key> c() {
        List<CaptureResult.Key> list = Collections.EMPTY_LIST;
        if (h.b().compareTo(q.f115244d) >= 0) {
            try {
                return Collections.unmodifiableList(this.f115209b.getAvailableCaptureResultKeys());
            } catch (Exception e11) {
                y0.d("AdvancedVendorExtender", "AdvancedExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e11);
            }
        }
        return list;
    }

    @Override // u0.p
    public boolean d() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar) && Build.VERSION.SDK_INT >= 34) {
            return c().contains(CaptureResult.EXTENSION_CURRENT_TYPE);
        }
        return false;
    }

    @Override // u0.p
    public boolean e(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        if (this.f115208a.a(str)) {
            return false;
        }
        return this.f115209b.isExtensionAvailable(str, map);
    }

    @Override // u0.p
    public boolean f() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar)) {
            return this.f115209b.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // u0.p
    @NonNull
    public Size[] g() {
        u5.h.h(this.f115210c, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // u0.p
    public boolean h() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar) && Build.VERSION.SDK_INT >= 34) {
            return o().contains(CaptureRequest.EXTENSION_STRENGTH);
        }
        return false;
    }

    @Override // u0.p
    @NonNull
    public List<Pair<Integer, Size[]>> i() {
        u5.h.h(this.f115210c, "VendorExtender#init() must be called first");
        return n(this.f115209b.getSupportedPreviewOutputResolutions(this.f115210c));
    }

    @Override // u0.p
    public z2 j(@NonNull Context context) {
        u5.h.h(this.f115210c, "VendorExtender#init() must be called first");
        return new AdvancedSessionProcessor(this.f115209b.createSessionProcessor(), o(), this, context, this.f115211d);
    }

    @Override // u0.p
    public void l(@NonNull c0.n nVar) {
        i0 i0Var = (i0) nVar;
        this.f115210c = i0Var.d();
        this.f115209b.init(this.f115210c, j.a(i0Var));
    }

    @Override // u0.p
    public boolean m() {
        q qVar = q.f115245e;
        if (g.d(qVar) && h.g(qVar)) {
            return this.f115209b.isPostviewAvailable();
        }
        return false;
    }
}
