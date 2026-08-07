package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import v.y0;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.google.common.util.concurrent.s<Void>> f126053b = Collections.synchronizedList(new ArrayList());

    static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final com.google.common.util.concurrent.s<Void> f126054a = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z.s
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return t.a.a(this.f126051a, aVar);
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.concurrent.futures.c.a<Void> f126055b;

        a() {
        }

        public static /* synthetic */ Object a(a aVar, androidx.concurrent.futures.c.a aVar2) {
            aVar.f126055b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        private void b() {
            androidx.concurrent.futures.c.a<Void> aVar = this.f126055b;
            if (aVar != null) {
                aVar.c(null);
                this.f126055b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
            b();
        }
    }

    public t(boolean z11) {
        this.f126052a = z11;
    }

    public static /* synthetic */ void a(t tVar, a aVar, com.google.common.util.concurrent.s sVar) {
        tVar.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + tVar);
        tVar.f126053b.remove(sVar);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    private CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final com.google.common.util.concurrent.s<Void> sVar = aVar.f126054a;
        this.f126053b.add(sVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        sVar.b(new Runnable() { // from class: z.q
            @Override // java.lang.Runnable
            public final void run() {
                t.a(this.f126048a, aVar, sVar);
            }
        }, i0.c.b());
        return aVar;
    }

    @NonNull
    public CameraCaptureSession.CaptureCallback d(@NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return f() ? y0.b(c(), captureCallback) : captureCallback;
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> e() {
        return this.f126053b.isEmpty() ? j0.n.p(null) : j0.n.s(j0.n.x(j0.n.w(new ArrayList(this.f126053b)), new r.a() { // from class: z.r
            @Override // r.a
            public final Object apply(Object obj) {
                return t.b((List) obj);
            }
        }, i0.c.b()));
    }

    public boolean f() {
        return this.f126052a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f126053b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.s sVar = (com.google.common.util.concurrent.s) linkedList.poll();
            Objects.requireNonNull(sVar);
            sVar.cancel(true);
        }
    }
}
