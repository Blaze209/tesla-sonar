package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class l2 implements androidx.camera.core.impl.t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c3 f117093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<androidx.camera.core.impl.a3> f117094c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile androidx.camera.core.impl.x2 f117096e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f117092a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f117095d = false;

    private class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.t2.a f117097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.camera.core.impl.t2.b f117098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f117099c;

        a(@NonNull androidx.camera.core.impl.t2.b bVar, androidx.camera.core.impl.t2.a aVar, boolean z11) {
            this.f117097a = aVar;
            this.f117098b = bVar;
            this.f117099c = z11;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j11) {
            this.f117097a.onCaptureBufferLost(this.f117098b, j11, l2.this.h(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            this.f117097a.onCaptureCompleted(this.f117098b, new h(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            this.f117097a.onCaptureFailed(this.f117098b, new g(androidx.camera.core.impl.r.a.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            this.f117097a.onCaptureProgressed(this.f117098b, new h(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
            if (this.f117099c) {
                this.f117097a.onCaptureSequenceAborted(i11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            if (this.f117099c) {
                this.f117097a.onCaptureSequenceCompleted(i11, j11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
            this.f117097a.onCaptureStarted(this.f117098b, j12, j11);
        }
    }

    public l2(@NonNull c3 c3Var, @NonNull List<androidx.camera.core.impl.a3> list) {
        u5.h.b(c3Var.f116865i == c3.c.OPENED, "CaptureSession state must be OPENED. Current state:" + c3Var.f116865i);
        this.f117093b = c3Var;
        this.f117094c = Collections.unmodifiableList(new ArrayList(list));
    }

    private boolean f(@NonNull List<androidx.camera.core.impl.t2.b> list) {
        Iterator<androidx.camera.core.impl.t2.b> it = list.iterator();
        while (it.hasNext()) {
            if (!j(it.next())) {
                return false;
            }
        }
        return true;
    }

    private DeferrableSurface i(int i11) {
        synchronized (this.f117092a) {
            try {
                List<androidx.camera.core.impl.a3> list = this.f117094c;
                if (list == null) {
                    return null;
                }
                for (androidx.camera.core.impl.a3 a3Var : list) {
                    if (a3Var.q() == i11) {
                        return a3Var;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean j(@NonNull androidx.camera.core.impl.t2.b bVar) {
        if (bVar.getTargetOutputConfigIds().isEmpty()) {
            c0.y0.c("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : bVar.getTargetOutputConfigIds()) {
            if (i(num.intValue()) == null) {
                c0.y0.c("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.t2
    public void a() {
        c3 c3Var;
        synchronized (this.f117092a) {
            try {
                if (!this.f117095d && (c3Var = this.f117093b) != null) {
                    c3Var.x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.t2
    public void b() {
        c3 c3Var;
        synchronized (this.f117092a) {
            try {
                if (!this.f117095d && (c3Var = this.f117093b) != null) {
                    c3Var.n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.t2
    public int c(@NonNull androidx.camera.core.impl.t2.b bVar, @NonNull androidx.camera.core.impl.t2.a aVar) {
        synchronized (this.f117092a) {
            try {
                if (!this.f117095d && j(bVar) && this.f117093b != null) {
                    androidx.camera.core.impl.x2.b bVar2 = new androidx.camera.core.impl.x2.b();
                    bVar2.B(bVar.getTemplateId());
                    bVar2.w(bVar.getParameters());
                    bVar2.e(w2.f(new a(bVar, aVar, true)));
                    if (this.f117096e != null) {
                        Iterator<androidx.camera.core.impl.p> it = this.f117096e.j().iterator();
                        while (it.hasNext()) {
                            bVar2.e(it.next());
                        }
                        androidx.camera.core.impl.g3 g3VarJ = this.f117096e.k().j();
                        for (String str : g3VarJ.e()) {
                            bVar2.o(str, g3VarJ.d(str));
                        }
                    }
                    Iterator<Integer> it2 = bVar.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        bVar2.m(i(it2.next().intValue()));
                    }
                    return this.f117093b.v(bVar2.p());
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.t2
    public int d(@NonNull List<androidx.camera.core.impl.t2.b> list, @NonNull androidx.camera.core.impl.t2.a aVar) {
        synchronized (this.f117092a) {
            try {
                if (!this.f117095d && f(list) && this.f117093b != null) {
                    ArrayList arrayList = new ArrayList();
                    boolean z11 = true;
                    for (androidx.camera.core.impl.t2.b bVar : list) {
                        androidx.camera.core.impl.v0.a aVar2 = new androidx.camera.core.impl.v0.a();
                        aVar2.v(bVar.getTemplateId());
                        aVar2.s(bVar.getParameters());
                        aVar2.c(w2.f(new a(bVar, aVar, z11)));
                        Iterator<Integer> it = bVar.getTargetOutputConfigIds().iterator();
                        while (it.hasNext()) {
                            aVar2.f(i(it.next().intValue()));
                        }
                        arrayList.add(aVar2.h());
                        z11 = false;
                    }
                    return this.f117093b.t(arrayList);
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.t2
    public int e(@NonNull androidx.camera.core.impl.t2.b bVar, @NonNull androidx.camera.core.impl.t2.a aVar) {
        return d(Arrays.asList(bVar), aVar);
    }

    public void g() {
        synchronized (this.f117092a) {
            this.f117095d = true;
            this.f117093b = null;
            this.f117096e = null;
            this.f117094c = null;
        }
    }

    int h(@NonNull Surface surface) {
        synchronized (this.f117092a) {
            try {
                List<androidx.camera.core.impl.a3> list = this.f117094c;
                if (list == null) {
                    return -1;
                }
                for (androidx.camera.core.impl.a3 a3Var : list) {
                    try {
                        if (a3Var.j().get() == surface) {
                            return a3Var.q();
                        }
                        continue;
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(androidx.camera.core.impl.x2 x2Var) {
        synchronized (this.f117092a) {
            this.f117096e = x2Var;
        }
    }
}
