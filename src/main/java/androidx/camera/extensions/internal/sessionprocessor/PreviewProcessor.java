package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import c0.y0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";

    @NonNull
    private final PreviewImageProcessorImpl mPreviewImageProcessor;

    @NonNull
    private final k mCaptureResultImageMatcher = new k();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    interface OnCaptureResultCallback {
        void onCaptureResult(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list);
    }

    PreviewProcessor(@NonNull PreviewImageProcessorImpl previewImageProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, n nVar, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    nVar.b();
                    y0.a(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    u0.q qVar = u0.q.f115244d;
                    if (u0.g.d(qVar) && u0.h.g(qVar)) {
                        this.mPreviewImageProcessor.process(nVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j11, list);
                            }

                            public void onCaptureProcessProgressed(int i12) {
                            }
                        }, i0.c.d());
                    } else {
                        this.mPreviewImageProcessor.process(nVar.get(), totalCaptureResult);
                    }
                    nVar.b();
                } catch (Throwable th2) {
                    nVar.b();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.d();
            this.mCaptureResultImageMatcher.e();
        }
    }

    void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.b(totalCaptureResult);
    }

    void notifyImage(@NonNull n nVar) {
        this.mCaptureResultImageMatcher.g(nVar);
    }

    void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    void start(@NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.l(new k.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.q
            @Override // androidx.camera.extensions.internal.sessionprocessor.k.a
            public final void a(n nVar, TotalCaptureResult totalCaptureResult, int i11) {
                this.f3558a.lambda$start$0(onCaptureResultCallback, nVar, totalCaptureResult, i11);
            }
        });
    }
}
