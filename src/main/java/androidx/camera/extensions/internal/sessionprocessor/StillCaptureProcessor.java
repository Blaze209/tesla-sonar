package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j2;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import c0.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    w0.c mCaptureOutputSurface;

    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;

    @NonNull
    final k mCaptureResultImageMatcher = new k();
    final Object mLock = new Object();

    @NonNull
    HashMap<Integer, Pair<n, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    interface OnCaptureResultCallback {
        void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i11);

        void onError(@NonNull Exception exc);

        void onProcessCompleted();
    }

    StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, j2 j2Var, boolean z11) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        w0.c cVar = new w0.c(surface, size, z11);
        this.mCaptureOutputSurface = cVar;
        captureProcessorImpl.onOutputSurface(cVar.c(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = j2Var != null;
        if (j2Var != null) {
            u0.q qVar = u0.q.f115245e;
            if (u0.g.d(qVar) && u0.h.g(qVar)) {
                u5.h.a(j2Var.b() == 35);
                captureProcessorImpl.onResolutionUpdate(size, j2Var.c());
                captureProcessorImpl.onPostviewOutputSurface(j2Var.d());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    public static /* synthetic */ void a(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, boolean z11, n nVar, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (stillCaptureProcessor.mLock) {
            try {
                if (stillCaptureProcessor.mIsClosed) {
                    nVar.b();
                    y0.a(TAG, "Ignore image in closed state");
                    return;
                }
                y0.a(TAG, "onImageReferenceIncoming  captureStageId=" + i11);
                stillCaptureProcessor.mCaptureResults.put(Integer.valueOf(i11), new Pair<>(nVar, totalCaptureResult));
                y0.a(TAG, "mCaptureResult has capture stage Id: " + stillCaptureProcessor.mCaptureResults.keySet());
                if (stillCaptureProcessor.mCaptureResults.keySet().containsAll(list)) {
                    stillCaptureProcessor.process(stillCaptureProcessor.mCaptureResults, onCaptureResultCallback, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(boolean z11, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                        if (this.mIsClosed) {
                            y0.a(TAG, "Ignore process() in closed state.");
                            y0.a(TAG, "CaptureProcessorImpl.process() finish");
                            OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                            if (onCaptureResultCallback2 != null) {
                                onCaptureResultCallback2.onProcessCompleted();
                                this.mOnCaptureResultCallback = null;
                            }
                            clearCaptureResults();
                            return;
                        }
                        y0.a(TAG, "CaptureProcessorImpl.process() begin");
                        u0.q qVar = u0.q.f115245e;
                        if (u0.h.g(qVar) && u0.g.d(qVar) && z11 && this.mIsPostviewConfigured) {
                            this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                                public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j11, list);
                                }

                                public void onCaptureProcessProgressed(int i11) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                }
                            }, i0.c.b());
                        } else {
                            u0.q qVar2 = u0.q.f115244d;
                            if (u0.h.g(qVar2) && u0.g.d(qVar2)) {
                                this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                    public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                        onCaptureResultCallback.onCaptureCompleted(j11, list);
                                    }

                                    public void onCaptureProcessProgressed(int i11) {
                                        onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                    }
                                }, i0.c.b());
                            } else {
                                this.mCaptureProcessorImpl.process(map);
                            }
                        }
                        y0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                    } catch (Exception e11) {
                        y0.d(TAG, "mCaptureProcessorImpl.process exception ", e11);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e11);
                        }
                        y0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback4 != null) {
                            onCaptureResultCallback4.onProcessCompleted();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                y0.a(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th3;
            }
        }
    }

    void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<n, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((n) it.next().first).b();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            y0.a(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.e();
            this.mCaptureResultImageMatcher.d();
            this.mCaptureOutputSurface.b();
        }
    }

    void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        Long l11;
        this.mCaptureResultImageMatcher.c(totalCaptureResult, i11);
        if (this.mTimeStampForOutputImage == -1 && (l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l11.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            this.mCaptureOutputSurface.d(jLongValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void notifyImage(@NonNull n nVar) {
        this.mCaptureResultImageMatcher.g(nVar);
    }

    void process(@NonNull Map<Integer, Pair<n, TotalCaptureResult>> map, @NonNull final OnCaptureResultCallback onCaptureResultCallback, final boolean z11) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<n, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((n) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i0.c.d().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f3583a.lambda$process$1(z11, map2, onCaptureResultCallback);
            }
        });
    }

    void startCapture(final boolean z11, @NonNull final List<Integer> list, @NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        y0.a(TAG, "Start the capture: enablePostview=" + z11);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            u5.h.j(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.d();
        this.mCaptureResultImageMatcher.l(new k.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.w
            @Override // androidx.camera.extensions.internal.sessionprocessor.k.a
            public final void a(n nVar, TotalCaptureResult totalCaptureResult, int i11) {
                StillCaptureProcessor.a(this.f3587a, list, onCaptureResultCallback, z11, nVar, totalCaptureResult, i11);
            }
        });
    }
}
