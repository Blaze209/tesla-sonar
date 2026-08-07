package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.z;
import androidx.camera.core.impl.z2;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import c0.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class f extends u {
    static AtomicInteger C = new AtomicInteger(0);
    private final u0.p A;
    private final boolean B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final Context f3501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final PreviewExtenderImpl f3502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final ImageCaptureExtenderImpl f3503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    volatile StillCaptureProcessor f3504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile PreviewProcessor f3505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile RequestUpdateProcessorImpl f3506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile androidx.camera.extensions.internal.sessionprocessor.g f3507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile androidx.camera.extensions.internal.sessionprocessor.g f3508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile androidx.camera.extensions.internal.sessionprocessor.g f3509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile j2 f3510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile j2 f3511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile t2 f3512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    volatile boolean f3513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicInteger f3514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Map<CaptureRequest.Key<?>, Object> f3515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map<Integer, Long> f3516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private w0.e f3517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private j2 f3518z;

    class a implements l {
        a() {
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.l
        public void onNextImageAvailable(int i11, long j11, @NonNull n nVar, String str) {
            if (f.this.f3505m != null) {
                f.this.f3505m.notifyImage(nVar);
            } else {
                nVar.b();
            }
        }
    }

    class b implements t2.a {
        b() {
        }
    }

    class c implements t2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z2.a f3521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3522b;

        c(z2.a aVar, int i11) {
            this.f3521a = aVar;
            this.f3522b = i11;
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureCompleted(@NonNull t2.b bVar, @NonNull z zVar) {
            Long l11;
            CaptureResult captureResultJ = zVar.j();
            u5.h.b(captureResultJ instanceof TotalCaptureResult, "Cannot get TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultJ;
            if (f.this.f3505m != null) {
                f.this.f3505m.notifyCaptureResult(totalCaptureResult);
            } else {
                u0.q qVar = u0.q.f115244d;
                if (u0.g.d(qVar) && u0.h.g(qVar) && (l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                    this.f3521a.b(l11.longValue(), this.f3522b, new u0.f(totalCaptureResult));
                }
            }
            if (f.this.f3506n != null && f.this.f3506n.process(totalCaptureResult) != null) {
                f.this.C(this.f3522b, this.f3521a);
            }
            this.f3521a.a(this.f3522b);
        }
    }

    class d implements t2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3524a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3525b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z2.a f3526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g3 f3528e;

        d(z2.a aVar, int i11, g3 g3Var) {
            this.f3526c = aVar;
            this.f3527d = i11;
            this.f3528e = g3Var;
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureCompleted(@NonNull t2.b bVar, @NonNull z zVar) {
            CaptureResult captureResultJ = zVar.j();
            u5.h.b(captureResultJ instanceof TotalCaptureResult, "Cannot get capture TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultJ;
            r.a aVar = (r.a) bVar;
            if (f.this.f3504l != null) {
                synchronized (f.this.f3576e) {
                    try {
                        if (!f.this.f3516x.containsKey(Integer.valueOf(this.f3527d))) {
                            f.this.f3516x.put(Integer.valueOf(this.f3527d), Long.valueOf(zVar.a()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                f.this.f3504l.notifyCaptureResult(totalCaptureResult, aVar.a());
                return;
            }
            f.this.f3513u = false;
            if (f.this.f3512t == null) {
                this.f3526c.onCaptureSequenceAborted(this.f3527d);
                return;
            }
            this.f3526c.e(this.f3527d);
            this.f3526c.b(zVar.a(), this.f3527d, new u0.f(this.f3528e, zVar.j()));
            this.f3526c.a(this.f3527d);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureFailed(@NonNull t2.b bVar, @NonNull androidx.camera.core.impl.r rVar) {
            if (this.f3524a) {
                return;
            }
            this.f3524a = true;
            this.f3526c.c(this.f3527d);
            this.f3526c.onCaptureSequenceAborted(this.f3527d);
            f.this.f3513u = false;
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureSequenceAborted(int i11) {
            this.f3526c.onCaptureSequenceAborted(this.f3527d);
            f.this.f3513u = false;
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureStarted(@NonNull t2.b bVar, long j11, long j12) {
            if (this.f3525b) {
                return;
            }
            this.f3525b = true;
            this.f3526c.d(this.f3527d, j12);
        }
    }

    class e implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3530a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z2.a f3531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3532c;

        e(z2.a aVar, int i11) {
            this.f3531b = aVar;
            this.f3532c = i11;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.l
        public void onNextImageAvailable(int i11, long j11, @NonNull n nVar, String str) {
            y0.a("BasicSessionProcessor", "onNextImageAvailable  outputStreamId=" + i11);
            if (f.this.f3504l != null) {
                f.this.f3504l.notifyImage(nVar);
            } else {
                nVar.b();
            }
            if (this.f3530a) {
                this.f3531b.e(this.f3532c);
                this.f3530a = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.f$f, reason: collision with other inner class name */
    class C0069f implements StillCaptureProcessor.OnCaptureResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z2.a f3535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3 f3536c;

        C0069f(int i11, z2.a aVar, g3 g3Var) {
            this.f3534a = i11;
            this.f3535b = aVar;
            this.f3536c = g3Var;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
            if (f.this.B) {
                this.f3535b.b(j11, this.f3534a, new o(j11, this.f3536c, f.this.z(list)));
                this.f3535b.a(this.f3534a);
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCaptureProcessProgressed(int i11) {
            this.f3535b.onCaptureProcessProgressed(i11);
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onError(@NonNull Exception exc) {
            this.f3535b.c(this.f3534a);
            f.this.f3513u = false;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onProcessCompleted() {
            if (!f.this.B) {
                long jA = f.this.A(this.f3534a);
                if (jA == -1) {
                    y0.c("BasicSessionProcessor", "Cannot get timestamp for the capture result");
                    this.f3535b.c(this.f3534a);
                    this.f3535b.onCaptureSequenceAborted(this.f3534a);
                    f.this.f3513u = false;
                    return;
                }
                this.f3535b.b(jA, this.f3534a, new o(jA, this.f3536c, Collections.EMPTY_MAP));
                this.f3535b.a(this.f3534a);
            }
            f.this.f3513u = false;
        }
    }

    class g implements t2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z2.a f3538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3 f3540c;

        g(z2.a aVar, int i11, g3 g3Var) {
            this.f3538a = aVar;
            this.f3539b = i11;
            this.f3540c = g3Var;
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureCompleted(@NonNull t2.b bVar, @NonNull z zVar) {
            this.f3538a.b(zVar.a(), this.f3539b, new u0.f(this.f3540c, zVar.j()));
            this.f3538a.a(this.f3539b);
        }

        @Override // androidx.camera.core.impl.t2.a
        public void onCaptureFailed(@NonNull t2.b bVar, @NonNull androidx.camera.core.impl.r rVar) {
            this.f3538a.c(this.f3539b);
        }
    }

    public f(@NonNull PreviewExtenderImpl previewExtenderImpl, @NonNull ImageCaptureExtenderImpl imageCaptureExtenderImpl, @NonNull List<CaptureRequest.Key> list, @NonNull u0.p pVar, @NonNull Context context) {
        super(list);
        this.f3504l = null;
        this.f3505m = null;
        this.f3506n = null;
        this.f3509q = null;
        this.f3513u = false;
        this.f3514v = new AtomicInteger(0);
        this.f3515w = new LinkedHashMap();
        this.f3516x = new HashMap();
        this.f3517y = new w0.e();
        this.f3502j = previewExtenderImpl;
        this.f3503k = imageCaptureExtenderImpl;
        this.f3501i = context;
        this.A = pVar;
        this.B = pVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A(int i11) {
        synchronized (this.f3576e) {
            try {
                Long l11 = this.f3516x.get(Integer.valueOf(i11));
                if (l11 == null) {
                    return -1L;
                }
                this.f3516x.remove(Integer.valueOf(i11));
                return l11.longValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void B(t2 t2Var, List<CaptureStageImpl> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureStageImpl captureStageImpl : list) {
            r rVar = new r();
            rVar.a(this.f3507o.getId());
            if (this.f3509q != null) {
                rVar.a(this.f3509q.getId());
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                rVar.d((CaptureRequest.Key) pair.first, pair.second);
            }
            rVar.e(1);
            arrayList.add(rVar.b());
        }
        t2Var.d(arrayList, new b());
    }

    private void x(r rVar) {
        synchronized (this.f3576e) {
            try {
                for (CaptureRequest.Key<?> key : this.f3515w.keySet()) {
                    Object obj = this.f3515w.get(key);
                    if (obj != null) {
                        rVar.d(key, obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void y(r rVar) {
        CaptureStageImpl captureStage = this.f3502j.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                rVar.d((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    void C(int i11, @NonNull z2.a aVar) {
        if (this.f3512t == null) {
            y0.a("BasicSessionProcessor", "mRequestProcessor is null, ignore repeating request");
            return;
        }
        r rVar = new r();
        rVar.a(this.f3507o.getId());
        if (this.f3509q != null) {
            rVar.a(this.f3509q.getId());
        }
        rVar.e(1);
        x(rVar);
        y(rVar);
        c cVar = new c(aVar, i11);
        y0.a("BasicSessionProcessor", "requestProcessor setRepeating");
        this.f3512t.c(rVar.b(), cVar);
    }

    @Override // androidx.camera.core.impl.z2
    public void a() {
        this.f3512t.a();
    }

    @Override // androidx.camera.core.impl.z2
    public void b(@NonNull t2 t2Var) {
        this.f3512t = t2Var;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnEnableSession = this.f3502j.onEnableSession();
        y0.a("BasicSessionProcessor", "preview onEnableSession: " + captureStageImplOnEnableSession);
        if (captureStageImplOnEnableSession != null) {
            arrayList.add(captureStageImplOnEnableSession);
        }
        CaptureStageImpl captureStageImplOnEnableSession2 = this.f3503k.onEnableSession();
        y0.a("BasicSessionProcessor", "capture onEnableSession:" + captureStageImplOnEnableSession2);
        if (captureStageImplOnEnableSession2 != null) {
            arrayList.add(captureStageImplOnEnableSession2);
        }
        this.f3517y.c();
        if (!arrayList.isEmpty()) {
            B(t2Var, arrayList);
        }
        if (this.f3505m != null) {
            this.f3505m.resume();
            r(this.f3507o.getId(), new a());
        }
    }

    @Override // androidx.camera.core.impl.z2
    public int c(@NonNull final g3 g3Var, @NonNull final z2.a aVar) {
        final int andIncrement = this.f3514v.getAndIncrement();
        if (this.f3512t == null) {
            aVar.c(andIncrement);
            aVar.onCaptureSequenceAborted(andIncrement);
            return andIncrement;
        }
        if (this.f3505m != null) {
            this.f3505m.start(new PreviewProcessor.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.e
                @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                public final void onCaptureResult(long j11, List list) {
                    aVar.b(j11, andIncrement, new o(j11, g3Var, this.f3497a.z(list)));
                }
            });
        }
        C(andIncrement, aVar);
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.z2
    public void d() {
        this.f3517y.b();
        if (this.f3505m != null) {
            this.f3505m.pause();
        }
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnDisableSession = this.f3502j.onDisableSession();
        y0.a("BasicSessionProcessor", "preview onDisableSession: " + captureStageImplOnDisableSession);
        if (captureStageImplOnDisableSession != null) {
            arrayList.add(captureStageImplOnDisableSession);
        }
        CaptureStageImpl captureStageImplOnDisableSession2 = this.f3503k.onDisableSession();
        y0.a("BasicSessionProcessor", "capture onDisableSession:" + captureStageImplOnDisableSession2);
        if (captureStageImplOnDisableSession2 != null) {
            arrayList.add(captureStageImplOnDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            B(this.f3512t, arrayList);
        }
        this.f3512t = null;
        this.f3513u = false;
    }

    @Override // androidx.camera.core.impl.z2
    @NonNull
    public Map<Integer, List<Size>> f(@NonNull Size size) {
        return this.A.a(size);
    }

    @Override // androidx.camera.core.impl.z2
    public void g(@NonNull x0 x0Var) {
        synchronized (this.f3576e) {
            try {
                HashMap map = new HashMap();
                u0.n nVarB = u0.n.b.c(x0Var).b();
                for (x0.a<?> aVar : nVarB.g()) {
                    map.put((CaptureRequest.Key) aVar.d(), nVarB.a(aVar));
                }
                this.f3515w.clear();
                this.f3515w.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.z2
    public int h(@NonNull x0 x0Var, @NonNull g3 g3Var, @NonNull z2.a aVar) {
        y0.a("BasicSessionProcessor", "startTrigger");
        int andIncrement = this.f3514v.getAndIncrement();
        r rVar = new r();
        rVar.a(this.f3507o.getId());
        if (this.f3509q != null) {
            rVar.a(this.f3509q.getId());
        }
        rVar.e(1);
        x(rVar);
        y(rVar);
        u0.n nVarB = u0.n.b.c(x0Var).b();
        for (x0.a<?> aVar2 : nVarB.g()) {
            rVar.d((CaptureRequest.Key) aVar2.d(), nVarB.a(aVar2));
        }
        this.f3512t.e(rVar.b(), new g(aVar, andIncrement, g3Var));
        return andIncrement;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u, androidx.camera.core.impl.z2
    @NonNull
    public /* bridge */ /* synthetic */ Set i() {
        return super.i();
    }

    @Override // androidx.camera.core.impl.z2
    public int j(boolean z11, @NonNull g3 g3Var, @NonNull z2.a aVar) {
        y0.a("BasicSessionProcessor", "startCapture postviewEnabled = " + z11 + " mWillReceiveOnCaptureCompleted = " + this.B);
        int andIncrement = this.f3514v.getAndIncrement();
        if (this.f3512t == null || this.f3513u) {
            y0.a("BasicSessionProcessor", "startCapture failed");
            aVar.c(andIncrement);
            aVar.onCaptureSequenceAborted(andIncrement);
            return andIncrement;
        }
        this.f3513u = true;
        ArrayList arrayList = new ArrayList();
        List<CaptureStageImpl> captureStages = this.f3503k.getCaptureStages();
        ArrayList arrayList2 = new ArrayList();
        for (CaptureStageImpl captureStageImpl : captureStages) {
            r rVar = new r();
            rVar.a(this.f3508p.getId());
            rVar.e(2);
            rVar.c(captureStageImpl.getId());
            arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
            x(rVar);
            y(rVar);
            for (Pair pair : captureStageImpl.getParameters()) {
                rVar.d((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(rVar.b());
        }
        y0.a("BasicSessionProcessor", "Wait for capture stage id: " + arrayList2);
        d dVar = new d(aVar, andIncrement, g3Var);
        y0.a("BasicSessionProcessor", "startCapture");
        if (this.f3504l != null) {
            r(this.f3508p.getId(), new e(aVar, andIncrement));
            this.f3504l.startCapture(z11, arrayList2, new C0069f(andIncrement, aVar, g3Var));
        }
        this.f3512t.d(arrayList, dVar);
        return andIncrement;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u
    protected void o() {
        if (this.f3505m != null) {
            this.f3505m.close();
            this.f3505m = null;
        }
        if (this.f3504l != null) {
            this.f3504l.close();
            this.f3504l = null;
        }
        y0.a("BasicSessionProcessor", "preview onDeInit");
        this.f3502j.onDeInit();
        y0.a("BasicSessionProcessor", "capture onDeInit");
        this.f3503k.onDeInit();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.u
    @NonNull
    protected i q(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull k2 k2Var) {
        y0.a("BasicSessionProcessor", "PreviewExtenderImpl.onInit");
        this.f3502j.onInit(str, map.get(str), this.f3501i);
        y0.a("BasicSessionProcessor", "ImageCaptureExtenderImpl.onInit");
        this.f3503k.onInit(str, map.get(str), this.f3501i);
        this.f3510r = k2Var.e();
        this.f3511s = k2Var.c();
        this.f3518z = k2Var.d();
        PreviewExtenderImpl.ProcessorType processorType = this.f3502j.getProcessorType();
        y0.a("BasicSessionProcessor", "preview processorType=" + processorType);
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.f3507o = m.e(C.getAndIncrement(), this.f3510r.c(), 35, 2);
            this.f3505m = new PreviewProcessor(this.f3502j.getProcessor(), this.f3510r.d(), this.f3510r.c());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.f3507o = x.e(C.getAndIncrement(), this.f3510r.d());
            this.f3506n = this.f3502j.getProcessor();
        } else {
            this.f3507o = x.e(C.getAndIncrement(), this.f3510r.d());
        }
        CaptureProcessorImpl captureProcessor = this.f3503k.getCaptureProcessor();
        y0.a("BasicSessionProcessor", "CaptureProcessor=" + captureProcessor);
        if (captureProcessor != null) {
            this.f3508p = m.e(C.getAndIncrement(), this.f3511s.c(), 35, this.f3503k.getMaxCaptureStage());
            this.f3504l = new StillCaptureProcessor(captureProcessor, this.f3511s.d(), this.f3511s.c(), this.f3518z, !this.B);
        } else {
            this.f3508p = x.e(C.getAndIncrement(), this.f3511s.d());
        }
        if (k2Var.b() != null) {
            this.f3509q = x.e(C.getAndIncrement(), k2Var.b().d());
        }
        j jVarD = new j().a(this.f3507o).a(this.f3508p).d(1);
        u0.q qVar = u0.q.f115245e;
        if (u0.g.d(qVar) && u0.h.g(qVar)) {
            int iOnSessionType = this.f3502j.onSessionType();
            u5.h.b(iOnSessionType == this.f3503k.onSessionType(), "Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl");
            if (iOnSessionType == -1) {
                iOnSessionType = 0;
            }
            jVarD.e(iOnSessionType);
        }
        if (this.f3509q != null) {
            jVarD.a(this.f3509q);
        }
        CaptureStageImpl captureStageImplOnPresetSession = this.f3502j.onPresetSession();
        y0.a("BasicSessionProcessor", "preview onPresetSession:" + captureStageImplOnPresetSession);
        CaptureStageImpl captureStageImplOnPresetSession2 = this.f3503k.onPresetSession();
        y0.a("BasicSessionProcessor", "capture onPresetSession:" + captureStageImplOnPresetSession2);
        if (captureStageImplOnPresetSession != null && captureStageImplOnPresetSession.getParameters() != null) {
            for (Pair pair : captureStageImplOnPresetSession.getParameters()) {
                jVarD.b((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (captureStageImplOnPresetSession2 != null && captureStageImplOnPresetSession2.getParameters() != null) {
            for (Pair pair2 : captureStageImplOnPresetSession2.getParameters()) {
                jVarD.b((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return jVarD.c();
    }

    Map<CaptureResult.Key, Object> z(List<Pair<CaptureResult.Key, Object>> list) {
        HashMap map = new HashMap();
        for (Pair<CaptureResult.Key, Object> pair : list) {
            map.put((CaptureResult.Key) pair.first, pair.second);
        }
        return map;
    }
}
