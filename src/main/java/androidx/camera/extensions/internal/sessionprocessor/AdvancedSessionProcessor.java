package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.z;
import androidx.camera.core.impl.z2;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.p003lifecycle.i0;
import c0.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AdvancedSessionProcessor extends u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final SessionProcessorImpl f3468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final u0.p f3469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final Context f3470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i0<Integer> f3472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f3473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HashMap<CaptureRequest.Key<?>, Object> f3474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SessionProcessorImplCaptureCallbackAdapter f3475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i0<Integer> f3476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ExtensionMetadataMonitor f3477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f3478s;

    private static class CallbackAdapter implements t2.a {
        private final RequestProcessorImpl.Callback mCallback;

        CallbackAdapter(@NonNull RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(t2.b bVar) {
            u5.h.a(bVar instanceof RequestAdapter);
            return ((RequestAdapter) bVar).getImplRequest();
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureBufferLost(@NonNull t2.b bVar, long j11, int i11) {
            this.mCallback.onCaptureBufferLost(getImplRequest(bVar), j11, i11);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureCompleted(@NonNull t2.b bVar, z zVar) {
            CaptureResult captureResultJ = zVar.j();
            u5.h.b(captureResultJ instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(bVar), (TotalCaptureResult) captureResultJ);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureFailed(@NonNull t2.b bVar, androidx.camera.core.impl.r rVar) {
            Object objA = rVar.a();
            u5.h.b(objA instanceof CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(bVar), (CaptureFailure) objA);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureProgressed(@NonNull t2.b bVar, @NonNull z zVar) {
            CaptureResult captureResultJ = zVar.j();
            u5.h.b(captureResultJ != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(bVar), captureResultJ);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureSequenceAborted(int i11) {
            this.mCallback.onCaptureSequenceAborted(i11);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureSequenceCompleted(int i11, long j11) {
            this.mCallback.onCaptureSequenceCompleted(i11, j11);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureStarted(@NonNull t2.b bVar, long j11, long j12) {
            this.mCallback.onCaptureStarted(getImplRequest(bVar), j11, j12);
        }
    }

    private static class ExtensionMetadataMonitor {
        private final i0<Integer> mCurrentExtensionTypeLiveData;
        private final i0<Integer> mExtensionStrengthLiveData;

        ExtensionMetadataMonitor(i0<Integer> i0Var, i0<Integer> i0Var2) {
            this.mCurrentExtensionTypeLiveData = i0Var;
            this.mExtensionStrengthLiveData = i0Var2;
        }

        private int convertExtensionMode(int i11) {
            if (i11 == 0) {
                return 5;
            }
            if (i11 == 1) {
                return 4;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 != 3) {
                return i11 != 4 ? 0 : 3;
            }
            return 2;
        }

        void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            Object obj;
            Object obj2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    Integer num = (Integer) obj2;
                    if (!Objects.equals(this.mCurrentExtensionTypeLiveData.getValue(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.postValue(Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
                if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.getValue(), obj)) {
                    return;
                }
                this.mExtensionStrengthLiveData.postValue((Integer) obj);
            }
        }
    }

    private static class ImageProcessorAdapter implements l {
        private final ImageProcessorImpl mImpl;

        ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.l
        public void onNextImageAvailable(int i11, long j11, @NonNull n nVar, String str) {
            this.mImpl.onNextImageAvailable(i11, j11, new ImageReferenceImplAdapter(nVar), str);
        }
    }

    private static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final n mImageReference;

        ImageReferenceImplAdapter(n nVar) {
            this.mImageReference = nVar;
        }

        public boolean decrement() {
            return this.mImageReference.b();
        }

        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.a();
        }
    }

    private static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        OutputSurfaceConfigurationImplAdapter(@NonNull k2 k2Var) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(k2Var.e());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(k2Var.c());
            this.mAnalysisOutputSurface = k2Var.b() != null ? new OutputSurfaceImplAdapter(k2Var.b()) : null;
            this.mPostviewOutputSurface = k2Var.d() != null ? new OutputSurfaceImplAdapter(k2Var.d()) : null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    private static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final j2 mOutputSurface;

        OutputSurfaceImplAdapter(j2 j2Var) {
            this.mOutputSurface = j2Var;
        }

        public int getImageFormat() {
            return this.mOutputSurface.b();
        }

        @NonNull
        public Size getSize() {
            return this.mOutputSurface.c();
        }

        @NonNull
        public Surface getSurface() {
            return this.mOutputSurface.d();
        }
    }

    private static class RequestAdapter implements t2.b {
        private final RequestProcessorImpl.Request mImplRequest;
        private final x0 mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        RequestAdapter(@NonNull RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            u0.n.b bVar = new u0.n.b();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                bVar.d(key, request.getParameters().get(key));
            }
            this.mParameters = bVar.b();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.t2.b
        @NonNull
        public x0 getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.t2.b
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.t2.b
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    private class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final t2 mRequestProcessor;

        RequestProcessorImplAdapter(t2 t2Var) {
            this.mRequestProcessor = t2Var;
        }

        public void abortCaptures() {
            this.mRequestProcessor.b();
        }

        public void setImageProcessor(int i11, @NonNull ImageProcessorImpl imageProcessorImpl) {
            AdvancedSessionProcessor.this.r(i11, new ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.c(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.a();
        }

        public int submit(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.e(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(@NonNull List<RequestProcessorImpl.Request> list, @NonNull RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.d(arrayList, new CallbackAdapter(callback));
        }
    }

    private static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final z2.a mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;

        @NonNull
        private final g3 mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        SessionProcessorImplCaptureCallbackAdapter(@NonNull z2.a aVar, @NonNull g3 g3Var, boolean z11) {
            this(aVar, g3Var, null, z11);
        }

        public void onCaptureCompleted(long j11, int i11, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.b(j11, i11, new o(j11, this.mTagBundle, map));
                this.mCaptureCallback.a(i11);
            }
        }

        public void onCaptureFailed(int i11) {
            this.mCaptureCallback.c(i11);
        }

        public void onCaptureProcessProgressed(int i11) {
            this.mCaptureCallback.onCaptureProcessProgressed(i11);
        }

        public void onCaptureProcessStarted(int i11) {
            this.mCaptureCallback.e(i11);
        }

        public void onCaptureSequenceAborted(int i11) {
            this.mCaptureCallback.onCaptureSequenceAborted(i11);
        }

        public void onCaptureSequenceCompleted(int i11) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            z2.a aVar = this.mCaptureCallback;
            long j11 = this.mOnCaptureStartedTimestamp;
            aVar.b(j11, i11, new o(j11, this.mTagBundle, Collections.EMPTY_MAP));
            this.mCaptureCallback.a(i11);
        }

        public void onCaptureStarted(int i11, long j11) {
            this.mOnCaptureStartedTimestamp = j11;
            this.mCaptureCallback.d(i11, j11);
        }

        SessionProcessorImplCaptureCallbackAdapter(@NonNull z2.a aVar, @NonNull g3 g3Var, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z11) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = aVar;
            this.mTagBundle = g3Var;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z11;
        }
    }

    public AdvancedSessionProcessor(@NonNull SessionProcessorImpl sessionProcessorImpl, @NonNull List<CaptureRequest.Key> list, @NonNull u0.p pVar, @NonNull Context context, int i11) {
        super(list);
        this.f3473n = false;
        this.f3474o = new HashMap<>();
        this.f3475p = null;
        this.f3468i = sessionProcessorImpl;
        this.f3469j = pVar;
        this.f3470k = context;
        this.f3478s = pVar.k();
        this.f3471l = i11;
        i0<Integer> i0Var = u() ? new i0<>(Integer.valueOf(i11)) : null;
        this.f3472m = i0Var;
        i0<Integer> i0Var2 = v() ? new i0<>(100) : null;
        this.f3476q = i0Var2;
        if (i0Var == null && i0Var2 == null) {
            this.f3477r = null;
        } else {
            this.f3477r = new ExtensionMetadataMonitor(i0Var, i0Var2);
        }
    }

    @NonNull
    private static HashMap<CaptureRequest.Key<?>, Object> s(@NonNull x0 x0Var) {
        HashMap<CaptureRequest.Key<?>, Object> map = new HashMap<>();
        u0.n nVarB = u0.n.b.c(x0Var).b();
        for (x0.a<?> aVar : nVarB.g()) {
            map.put((CaptureRequest.Key) aVar.d(), nVarB.a(aVar));
        }
        return map;
    }

    private i t(@NonNull Camera2SessionConfigImpl camera2SessionConfigImpl) {
        j jVar = new j();
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            jVar.a(h.a((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            jVar.b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        jVar.d(camera2SessionConfigImpl.getSessionTemplateId());
        u0.q qVar = u0.q.f115245e;
        if (u0.g.d(qVar) && u0.h.g(qVar)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                jVar.e(sessionType);
            } catch (NoSuchMethodError unused) {
                jVar.e(0);
            }
        }
        return jVar.c();
    }

    @Override // androidx.camera.core.impl.z2
    public void a() {
        this.f3468i.stopRepeating();
        synchronized (this.f3576e) {
            this.f3475p = null;
        }
    }

    @Override // androidx.camera.core.impl.z2
    public void b(@NonNull t2 t2Var) {
        this.f3468i.onCaptureSessionStart(new RequestProcessorImplAdapter(t2Var));
    }

    @Override // androidx.camera.core.impl.z2
    public int c(@NonNull g3 g3Var, @NonNull z2.a aVar) {
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.f3576e) {
            sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(aVar, g3Var, this.f3477r, this.f3478s);
            this.f3475p = sessionProcessorImplCaptureCallbackAdapter;
        }
        return this.f3468i.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.core.impl.z2
    public void d() {
        this.f3468i.onCaptureSessionEnd();
    }

    @Override // androidx.camera.core.impl.z2
    @NonNull
    public Map<Integer, List<Size>> f(@NonNull Size size) {
        return this.f3469j.a(size);
    }

    @Override // androidx.camera.core.impl.z2
    public void g(@NonNull x0 x0Var) {
        HashMap<CaptureRequest.Key<?>, Object> mapS;
        synchronized (this.f3576e) {
            try {
                mapS = s(x0Var);
                int i11 = this.f3579h;
                if (i11 != -1 && Build.VERSION.SDK_INT >= 34) {
                    mapS.put(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(i11));
                }
                this.f3474o = mapS;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3468i.setParameters(mapS);
    }

    @Override // androidx.camera.core.impl.z2
    public int h(@NonNull x0 x0Var, @NonNull g3 g3Var, @NonNull z2.a aVar) {
        HashMap<CaptureRequest.Key<?>, Object> mapS = s(x0Var);
        u0.q qVar = u0.q.f115244d;
        if (u0.g.d(qVar) && u0.h.g(qVar)) {
            return this.f3468i.startTrigger(mapS, new SessionProcessorImplCaptureCallbackAdapter(aVar, g3Var, this.f3478s));
        }
        return -1;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u, androidx.camera.core.impl.z2
    @NonNull
    public /* bridge */ /* synthetic */ Set i() {
        return super.i();
    }

    @Override // androidx.camera.core.impl.z2
    public int j(boolean z11, @NonNull g3 g3Var, @NonNull z2.a aVar) {
        y0.a("AdvancedSessionProcessor", "startCapture postviewEnabled = " + z11 + " mWillReceiveOnCaptureCompleted = " + this.f3478s);
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(aVar, g3Var, this.f3478s);
        u0.q qVar = u0.q.f115245e;
        return (u0.g.d(qVar) && u0.h.g(qVar) && this.f3473n && z11 && this.f3469j.m()) ? this.f3468i.startCaptureWithPostview(sessionProcessorImplCaptureCallbackAdapter) : this.f3468i.startCapture(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u
    protected void o() {
        synchronized (this.f3576e) {
            this.f3474o = new HashMap<>();
            this.f3475p = null;
        }
        this.f3468i.deInitSession();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u
    @NonNull
    protected i q(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull k2 k2Var) {
        u0.q qVar = u0.q.f115245e;
        Camera2SessionConfigImpl camera2SessionConfigImplInitSession = (u0.g.d(qVar) && u0.h.g(qVar)) ? this.f3468i.initSession(str, map, this.f3470k, new OutputSurfaceConfigurationImplAdapter(k2Var)) : null;
        if (camera2SessionConfigImplInitSession == null) {
            camera2SessionConfigImplInitSession = this.f3468i.initSession(str, map, this.f3470k, new OutputSurfaceImplAdapter(k2Var.e()), new OutputSurfaceImplAdapter(k2Var.c()), k2Var.b() != null ? new OutputSurfaceImplAdapter(k2Var.b()) : null);
        }
        this.f3473n = k2Var.d() != null;
        i0<Integer> i0Var = this.f3472m;
        if (i0Var != null) {
            i0Var.postValue(Integer.valueOf(this.f3471l));
        }
        i0<Integer> i0Var2 = this.f3476q;
        if (i0Var2 != null) {
            i0Var2.postValue(100);
        }
        return t(camera2SessionConfigImplInitSession);
    }

    public boolean u() {
        return this.f3469j.d();
    }

    public boolean v() {
        return this.f3469j.h();
    }
}
