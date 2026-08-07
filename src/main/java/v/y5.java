package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class y5 implements u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final w.z f117407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final o0.e f117408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f117409c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f117410d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f117411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f117412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.camera.core.q f117413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.p f117414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DeferrableSurface f117415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ImageWriter f117416j;

    y5(@NonNull w.z zVar) {
        this.f117411e = false;
        this.f117412f = false;
        this.f117407a = zVar;
        this.f117411e = z5.a(zVar, 4);
        this.f117412f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f117408b = new o0.e(3, new o0.b.a() { // from class: v.v5
            @Override // o0.b.a
            public final void a(Object obj) {
                ((androidx.camera.core.n) obj).close();
            }
        });
    }

    public static /* synthetic */ void h(y5 y5Var, androidx.camera.core.impl.s1 s1Var) {
        y5Var.getClass();
        try {
            androidx.camera.core.n nVarD = s1Var.d();
            if (nVarD != null) {
                y5Var.f117408b.b(nVarD);
            }
        } catch (IllegalStateException e11) {
            c0.y0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e11.getMessage());
        }
    }

    private void j() {
        o0.e eVar = this.f117408b;
        while (!eVar.isEmpty()) {
            eVar.a().close();
        }
        DeferrableSurface deferrableSurface = this.f117415i;
        if (deferrableSurface != null) {
            androidx.camera.core.q qVar = this.f117413g;
            if (qVar != null) {
                deferrableSurface.k().b(new x5(qVar), i0.c.e());
                this.f117413g = null;
            }
            deferrableSurface.d();
            this.f117415i = null;
        }
        ImageWriter imageWriter = this.f117416j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f117416j = null;
        }
    }

    @NonNull
    private Map<Integer, Size> k(@NonNull w.z zVar) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e11) {
            c0.y0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e11.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i11 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i11);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new h0.e(true));
                map.put(Integer.valueOf(i11), inputSizes[0]);
            }
        }
        return map;
    }

    private boolean l(@NonNull w.z zVar, int i11) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i11)) == null) {
            return false;
        }
        for (int i12 : validOutputFormatsForInput) {
            if (i12 == 256) {
                return true;
            }
        }
        return false;
    }

    @Override // v.u5
    public void a(@NonNull androidx.camera.core.impl.x2.b bVar) {
        j();
        if (this.f117409c) {
            bVar.B(1);
            return;
        }
        if (this.f117412f) {
            bVar.B(1);
            return;
        }
        Map<Integer, Size> mapK = k(this.f117407a);
        if (!this.f117411e || mapK.isEmpty() || !mapK.containsKey(34) || !l(this.f117407a, 34)) {
            bVar.B(1);
            return;
        }
        Size size = mapK.get(34);
        androidx.camera.core.p pVar = new androidx.camera.core.p(size.getWidth(), size.getHeight(), 34, 9);
        this.f117414h = pVar.m();
        this.f117413g = new androidx.camera.core.q(pVar);
        pVar.g(new androidx.camera.core.impl.s1.a() { // from class: v.w5
            @Override // androidx.camera.core.impl.s1.a
            public final void a(androidx.camera.core.impl.s1 s1Var) {
                y5.h(this.f117366a, s1Var);
            }
        }, i0.c.d());
        androidx.camera.core.impl.t1 t1Var = new androidx.camera.core.impl.t1(this.f117413g.getSurface(), new Size(this.f117413g.getWidth(), this.f117413g.getHeight()), 34);
        this.f117415i = t1Var;
        androidx.camera.core.q qVar = this.f117413g;
        com.google.common.util.concurrent.s<Void> sVarK = t1Var.k();
        Objects.requireNonNull(qVar);
        sVarK.b(new x5(qVar), i0.c.e());
        bVar.m(this.f117415i);
        bVar.e(this.f117414h);
        bVar.l(new a());
        bVar.x(new InputConfiguration(this.f117413g.getWidth(), this.f117413g.getHeight(), this.f117413g.a()));
    }

    @Override // v.u5
    public boolean b() {
        return this.f117409c;
    }

    @Override // v.u5
    public void c(boolean z11) {
        this.f117410d = z11;
    }

    @Override // v.u5
    public void d(boolean z11) {
        this.f117409c = z11;
    }

    @Override // v.u5
    public androidx.camera.core.n e() {
        try {
            return this.f117408b.a();
        } catch (NoSuchElementException unused) {
            c0.y0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // v.u5
    public boolean f(@NonNull androidx.camera.core.n nVar) {
        Image image = nVar.getImage();
        ImageWriter imageWriter = this.f117416j;
        if (imageWriter != null && image != null) {
            try {
                l0.a.d(imageWriter, image);
                return true;
            } catch (IllegalStateException e11) {
                c0.y0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e11.getMessage());
            }
        }
        return false;
    }

    @Override // v.u5
    public boolean g() {
        return this.f117410d;
    }

    class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                y5.this.f117416j = l0.a.c(inputSurface, 1);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }
    }
}
