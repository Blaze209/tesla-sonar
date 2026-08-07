package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a3;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z2;
import c0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class u implements z2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f3574c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f3577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Set<Integer> f3578g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Map<Integer, ImageReader> f3572a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, g> f3573b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<DeferrableSurface> f3575d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Object f3576e = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f3579h = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Image f3581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f3582c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3580a = 1;

        a(@NonNull Image image) {
            this.f3581b = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.n
        public boolean a() {
            synchronized (this.f3582c) {
                try {
                    int i11 = this.f3580a;
                    if (i11 <= 0) {
                        return false;
                    }
                    this.f3580a = i11 + 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.n
        public boolean b() {
            synchronized (this.f3582c) {
                try {
                    int i11 = this.f3580a;
                    if (i11 <= 0) {
                        return false;
                    }
                    int i12 = i11 - 1;
                    this.f3580a = i12;
                    if (i12 <= 0) {
                        this.f3581b.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.n
        public Image get() {
            return this.f3581b;
        }
    }

    u(@NonNull List<CaptureRequest.Key> list) {
        this.f3578g = p(list);
    }

    public static /* synthetic */ void l(l lVar, int i11, String str, ImageReader imageReader) {
        try {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            lVar.onNextImageAvailable(i11, imageAcquireNextImage.getTimestamp(), new a(imageAcquireNextImage), str);
        } catch (IllegalStateException e11) {
            y0.d("SessionProcessorBase", "Failed to acquire next image.", e11);
        }
    }

    @NonNull
    private static a3 n(@NonNull g gVar, Map<Integer, ImageReader> map) {
        if (gVar instanceof x) {
            return new a3(((x) gVar).f(), gVar.getId());
        }
        if (gVar instanceof m) {
            m mVar = (m) gVar;
            final ImageReader imageReaderNewInstance = ImageReader.newInstance(mVar.h().getWidth(), mVar.h().getHeight(), mVar.f(), mVar.g());
            map.put(Integer.valueOf(gVar.getId()), imageReaderNewInstance);
            a3 a3Var = new a3(imageReaderNewInstance.getSurface(), gVar.getId());
            a3Var.k().b(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.t
                @Override // java.lang.Runnable
                public final void run() {
                    imageReaderNewInstance.close();
                }
            }, i0.c.b());
            return a3Var;
        }
        if (gVar instanceof p) {
            throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
        }
        throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + gVar);
    }

    private Set<Integer> p(@NonNull List<CaptureRequest.Key> list) {
        HashSet hashSet = new HashSet();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            if (list.contains(CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i11 >= 34 && list.contains(CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.z2
    public final void e() {
        y0.c("SessionProcessorBase", "deInitSession: cameraId=" + this.f3577f);
        o();
        synchronized (this.f3576e) {
            try {
                Iterator<DeferrableSurface> it = this.f3575d.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
                this.f3575d.clear();
                this.f3572a.clear();
                this.f3573b.clear();
                this.f3579h = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerThread handlerThread = this.f3574c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f3574c = null;
        }
    }

    @Override // androidx.camera.core.impl.z2
    @NonNull
    public Set<Integer> i() {
        return this.f3578g;
    }

    @Override // androidx.camera.core.impl.z2
    @NonNull
    public final x2 k(@NonNull c0.n nVar, @NonNull k2 k2Var) {
        i0 i0Var = (i0) nVar;
        i iVarQ = q(i0Var.d(), u0.j.a(i0Var), k2Var);
        x2.b bVar = new x2.b();
        synchronized (this.f3576e) {
            try {
                for (g gVar : iVarQ.e()) {
                    a3 a3VarN = n(gVar, this.f3572a);
                    this.f3575d.add(a3VarN);
                    this.f3573b.put(Integer.valueOf(gVar.getId()), gVar);
                    x2.f.a aVarF = x2.f.a(a3VarN).d(gVar.a()).f(gVar.b());
                    List<g> listC = gVar.c();
                    if (listC != null && !listC.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (g gVar2 : listC) {
                            this.f3573b.put(Integer.valueOf(gVar2.getId()), gVar2);
                            arrayList.add(n(gVar2, this.f3572a));
                        }
                        aVarF.e(arrayList);
                    }
                    bVar.j(aVarF.a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u0.n.b bVar2 = new u0.n.b();
        for (CaptureRequest.Key<?> key : iVarQ.c().keySet()) {
            bVar2.d(key, iVarQ.c().get(key));
        }
        bVar.w(bVar2.b());
        bVar.B(iVarQ.d());
        bVar.A(iVarQ.b());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f3574c = handlerThread;
        handlerThread.start();
        this.f3577f = i0Var.d();
        y0.a("SessionProcessorBase", "initSession: cameraId=" + this.f3577f);
        return bVar.p();
    }

    protected abstract void o();

    @NonNull
    protected abstract i q(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull k2 k2Var);

    protected void r(final int i11, @NonNull final l lVar) {
        ImageReader imageReader;
        final String strA;
        synchronized (this.f3576e) {
            imageReader = this.f3572a.get(Integer.valueOf(i11));
            g gVar = this.f3573b.get(Integer.valueOf(i11));
            strA = gVar == null ? null : gVar.a();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.s
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    u.l(lVar, i11, strA, imageReader2);
                }
            }, new Handler(this.f3574c.getLooper()));
        }
    }
}
