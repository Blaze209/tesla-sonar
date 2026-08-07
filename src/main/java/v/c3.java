package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class c3 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f116857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.v0> f116858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f116859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    v4.a f116860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    v4 f116861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.camera.core.impl.x2 f116862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<DeferrableSurface, Surface> f116863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List<DeferrableSurface> f116864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c f116865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.google.common.util.concurrent.s<Void> f116866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f116867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private Map<DeferrableSurface, Long> f116868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z.w f116869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z.a0 f116870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z.t f116871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x.f f116872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z.z f116873q;

    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            synchronized (c3.this.f116857a) {
                try {
                    androidx.camera.core.impl.x2 x2Var = c3.this.f116862f;
                    if (x2Var == null) {
                        return;
                    }
                    androidx.camera.core.impl.v0 v0VarK = x2Var.k();
                    c0.y0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    c3 c3Var = c3.this;
                    c3Var.e(Collections.singletonList(c3Var.f116870n.a(v0VarK)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    final class d extends v4.c {
        d() {
        }

        @Override // v.v4.c
        public void r(@NonNull v4 v4Var) {
            synchronized (c3.this.f116857a) {
                try {
                    switch (c3.this.f116865i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + c3.this.f116865i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            c3.this.q();
                            break;
                        case RELEASED:
                            c0.y0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    c0.y0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + c3.this.f116865i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.v4.c
        public void s(@NonNull v4 v4Var) {
            synchronized (c3.this.f116857a) {
                try {
                    switch (c3.this.f116865i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + c3.this.f116865i);
                        case OPENING:
                            c3 c3Var = c3.this;
                            c3Var.f116865i = c.OPENED;
                            c3Var.f116861e = v4Var;
                            c0.y0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            c3 c3Var2 = c3.this;
                            c3Var2.v(c3Var2.f116862f);
                            c3.this.u();
                            break;
                        case CLOSED:
                            c3.this.f116861e = v4Var;
                            break;
                        case RELEASING:
                            v4Var.close();
                            break;
                    }
                    c0.y0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + c3.this.f116865i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.v4.c
        public void t(@NonNull v4 v4Var) {
            synchronized (c3.this.f116857a) {
                try {
                    if (c3.this.f116865i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + c3.this.f116865i);
                    }
                    c0.y0.a("CaptureSession", "CameraCaptureSession.onReady() " + c3.this.f116865i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.v4.c
        /* JADX INFO: renamed from: u */
        public void A(@NonNull v4 v4Var) {
            synchronized (c3.this.f116857a) {
                try {
                    if (c3.this.f116865i == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + c3.this.f116865i);
                    }
                    c0.y0.a("CaptureSession", "onSessionFinished()");
                    c3.this.q();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c3(@NonNull x.f fVar) {
        this(fVar, new androidx.camera.core.impl.r2(Collections.EMPTY_LIST));
    }

    public static /* synthetic */ void j(c3 c3Var) {
        synchronized (c3Var.f116857a) {
            if (c3Var.f116858b.isEmpty()) {
                return;
            }
            try {
                c3Var.t(c3Var.f116858b);
                c3Var.f116858b.clear();
            } catch (Throwable th2) {
                c3Var.f116858b.clear();
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object k(c3 c3Var, androidx.concurrent.futures.c.a aVar) {
        String str;
        synchronized (c3Var.f116857a) {
            u5.h.j(c3Var.f116867k == null, "Release completer expected to be null");
            c3Var.f116867k = aVar;
            str = "Release[session=" + c3Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(c3 c3Var, CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
        synchronized (c3Var.f116857a) {
            try {
                if (c3Var.f116865i == c.OPENED) {
                    c3Var.v(c3Var.f116862f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback p(List<androidx.camera.core.impl.p> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<androidx.camera.core.impl.p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x2.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return y0.a(arrayList);
    }

    @NonNull
    private x.j r(@NonNull androidx.camera.core.impl.x2.f fVar, @NonNull Map<DeferrableSurface, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = map.get(fVar.f());
        u5.h.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        x.j jVar = new x.j(fVar.g(), surface);
        if (str != null) {
            jVar.g(str);
        } else {
            jVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            jVar.f(1);
        } else if (fVar.c() == 1) {
            jVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            jVar.b();
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                u5.h.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                jVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f116872p.d()) == null) {
            jLongValue = 1;
        } else {
            c0.b0 b0VarB = fVar.b();
            Long lA = x.c.a(b0VarB, dynamicRangeProfilesD);
            if (lA == null) {
                c0.y0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b0VarB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        jVar.e(jLongValue);
        return jVar;
    }

    @NonNull
    private List<x.j> s(@NonNull List<x.j> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (x.j jVar : list) {
            if (!arrayList.contains(jVar.d())) {
                arrayList.add(jVar.d());
                arrayList2.add(jVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.common.util.concurrent.s<Void> w(@NonNull List<Surface> list, @NonNull androidx.camera.core.impl.x2 x2Var, @NonNull CameraDevice cameraDevice) {
        synchronized (this.f116857a) {
            try {
                int iOrdinal = this.f116865i.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.f116863g.clear();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            this.f116863g.put(this.f116864h.get(i11), list.get(i11));
                        }
                        this.f116865i = c.OPENING;
                        c0.y0.a("CaptureSession", "Opening capture session.");
                        v4.c cVarW = g5.w(this.f116859c, new g5.a(x2Var.l()));
                        u.a aVar = new u.a(x2Var.f());
                        androidx.camera.core.impl.v0.a aVarK = androidx.camera.core.impl.v0.a.k(x2Var.k());
                        ArrayList arrayList = new ArrayList();
                        String strD0 = aVar.d0(null);
                        for (androidx.camera.core.impl.x2.f fVar : x2Var.h()) {
                            x.j jVarR = r(fVar, this.f116863g, strD0);
                            if (this.f116868l.containsKey(fVar.f())) {
                                jVarR.h(this.f116868l.get(fVar.f()).longValue());
                            }
                            arrayList.add(jVarR);
                        }
                        x.p pVarI = this.f116860d.i(x2Var.m(), s(arrayList), cVarW);
                        if (x2Var.p() == 5 && x2Var.g() != null) {
                            pVarI.f(x.i.b(x2Var.g()));
                        }
                        try {
                            CaptureRequest captureRequestF = h2.f(aVarK.h(), cameraDevice, this.f116873q);
                            if (captureRequestF != null) {
                                pVarI.g(captureRequestF);
                            }
                            return this.f116860d.l(cameraDevice, pVarI, this.f116864h);
                        } catch (CameraAccessException e11) {
                            return j0.n.n(e11);
                        }
                    }
                    if (iOrdinal != 4) {
                        return j0.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f116865i));
                    }
                }
                return j0.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f116865i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.d3
    @NonNull
    public com.google.common.util.concurrent.s<Void> a(boolean z11) {
        synchronized (this.f116857a) {
            switch (this.f116865i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f116865i);
                case GET_SURFACE:
                    u5.h.h(this.f116860d, "The Opener shouldn't null in state:" + this.f116865i);
                    this.f116860d.stop();
                case INITIALIZED:
                    this.f116865i = c.RELEASED;
                    return j0.n.p(null);
                case OPENED:
                case CLOSED:
                    v4 v4Var = this.f116861e;
                    if (v4Var != null) {
                        if (z11) {
                            try {
                                v4Var.b();
                            } catch (CameraAccessException e11) {
                                c0.y0.d("CaptureSession", "Unable to abort captures.", e11);
                            }
                        }
                        this.f116861e.close();
                        break;
                    }
                case OPENING:
                    this.f116865i = c.RELEASING;
                    this.f116871o.g();
                    u5.h.h(this.f116860d, "The Opener shouldn't null in state:" + this.f116865i);
                    if (this.f116860d.stop()) {
                        q();
                        return j0.n.p(null);
                    }
                case RELEASING:
                    if (this.f116866j == null) {
                        this.f116866j = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.y2
                            @Override // androidx.concurrent.futures.c.InterfaceC0146c
                            public final Object a(androidx.concurrent.futures.c.a aVar) {
                                return c3.k(this.f117401a, aVar);
                            }
                        });
                    }
                    return this.f116866j;
                default:
                    return j0.n.p(null);
            }
        }
    }

    @Override // v.d3
    public androidx.camera.core.impl.x2 b() {
        androidx.camera.core.impl.x2 x2Var;
        synchronized (this.f116857a) {
            x2Var = this.f116862f;
        }
        return x2Var;
    }

    @Override // v.d3
    @NonNull
    public com.google.common.util.concurrent.s<Void> c(@NonNull final androidx.camera.core.impl.x2 x2Var, @NonNull final CameraDevice cameraDevice, @NonNull v4.a aVar) {
        synchronized (this.f116857a) {
            try {
                if (this.f116865i.ordinal() == 1) {
                    this.f116865i = c.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(x2Var.o());
                    this.f116864h = arrayList;
                    this.f116860d = aVar;
                    j0.d dVarF = j0.d.a(aVar.n(arrayList, DeviceOrientationRequest.OUTPUT_PERIOD_FAST)).f(new j0.a() { // from class: v.z2
                        @Override // j0.a
                        public final com.google.common.util.concurrent.s apply(Object obj) {
                            return this.f117422a.w((List) obj, x2Var, cameraDevice);
                        }
                    }, this.f116860d.c());
                    j0.n.j(dVarF, new a(), this.f116860d.c());
                    return j0.n.s(dVarF);
                }
                c0.y0.c("CaptureSession", "Open not allowed in state: " + this.f116865i);
                return j0.n.n(new IllegalStateException("open() should not allow the state: " + this.f116865i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.d3
    public void close() {
        synchronized (this.f116857a) {
            try {
                int iOrdinal = this.f116865i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f116865i);
                }
                if (iOrdinal == 1) {
                    this.f116865i = c.RELEASED;
                } else if (iOrdinal == 2) {
                    u5.h.h(this.f116860d, "The Opener shouldn't null in state:" + this.f116865i);
                    this.f116860d.stop();
                    this.f116865i = c.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    u5.h.h(this.f116860d, "The Opener shouldn't null in state:" + this.f116865i);
                    this.f116860d.stop();
                    this.f116865i = c.CLOSED;
                    this.f116871o.g();
                    this.f116862f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.d3
    public void d(androidx.camera.core.impl.x2 x2Var) {
        synchronized (this.f116857a) {
            try {
                switch (this.f116865i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f116865i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f116862f = x2Var;
                        break;
                    case OPENED:
                        this.f116862f = x2Var;
                        if (x2Var == null) {
                            return;
                        }
                        if (!this.f116863g.keySet().containsAll(x2Var.o())) {
                            c0.y0.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            c0.y0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            v(this.f116862f);
                        }
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.d3
    public void e(@NonNull List<androidx.camera.core.impl.v0> list) {
        synchronized (this.f116857a) {
            try {
                switch (this.f116865i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f116865i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f116858b.addAll(list);
                        break;
                    case OPENED:
                        this.f116858b.addAll(list);
                        u();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.d3
    public boolean f() {
        boolean z11;
        synchronized (this.f116857a) {
            try {
                c cVar = this.f116865i;
                z11 = cVar == c.OPENED || cVar == c.OPENING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // v.d3
    public void g() {
        ArrayList<androidx.camera.core.impl.v0> arrayList;
        synchronized (this.f116857a) {
            try {
                if (this.f116858b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f116858b);
                    this.f116858b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.v0 v0Var : arrayList) {
                Iterator<androidx.camera.core.impl.p> it = v0Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(v0Var.f());
                }
            }
        }
    }

    @Override // v.d3
    @NonNull
    public List<androidx.camera.core.impl.v0> h() {
        List<androidx.camera.core.impl.v0> listUnmodifiableList;
        synchronized (this.f116857a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f116858b);
        }
        return listUnmodifiableList;
    }

    @Override // v.d3
    public void i(@NonNull Map<DeferrableSurface, Long> map) {
        synchronized (this.f116857a) {
            this.f116868l = map;
        }
    }

    void n() {
        synchronized (this.f116857a) {
            if (this.f116865i == c.OPENED) {
                try {
                    this.f116861e.b();
                } catch (CameraAccessException e11) {
                    c0.y0.d("CaptureSession", "Unable to abort captures.", e11);
                }
            } else {
                c0.y0.c("CaptureSession", "Unable to abort captures. Incorrect state:" + this.f116865i);
            }
        }
    }

    void q() {
        c cVar = this.f116865i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            c0.y0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f116865i = cVar2;
        this.f116861e = null;
        androidx.concurrent.futures.c.a<Void> aVar = this.f116867k;
        if (aVar != null) {
            aVar.c(null);
            this.f116867k = null;
        }
    }

    int t(List<androidx.camera.core.impl.v0> list) {
        synchronized (this.f116857a) {
            try {
                if (this.f116865i != c.OPENED) {
                    c0.y0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    o2 o2Var = new o2();
                    ArrayList arrayList = new ArrayList();
                    c0.y0.a("CaptureSession", "Issuing capture request.");
                    boolean z11 = false;
                    for (androidx.camera.core.impl.v0 v0Var : list) {
                        if (!v0Var.i().isEmpty()) {
                            Iterator<DeferrableSurface> it = v0Var.i().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (v0Var.k() == 2) {
                                        z11 = true;
                                    }
                                    androidx.camera.core.impl.v0.a aVarK = androidx.camera.core.impl.v0.a.k(v0Var);
                                    if (v0Var.k() == 5 && v0Var.d() != null) {
                                        aVarK.p(v0Var.d());
                                    }
                                    androidx.camera.core.impl.x2 x2Var = this.f116862f;
                                    if (x2Var != null) {
                                        aVarK.e(x2Var.k().g());
                                    }
                                    aVarK.e(v0Var.g());
                                    CaptureRequest captureRequestE = h2.e(aVarK.h(), this.f116861e.f(), this.f116863g, false, this.f116873q);
                                    if (captureRequestE != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator<androidx.camera.core.impl.p> it2 = v0Var.c().iterator();
                                        while (it2.hasNext()) {
                                            x2.b(it2.next(), arrayList2);
                                        }
                                        o2Var.a(captureRequestE, arrayList2);
                                        arrayList.add(captureRequestE);
                                        break;
                                    }
                                    c0.y0.a("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                DeferrableSurface next = it.next();
                                if (!this.f116863g.containsKey(next)) {
                                    c0.y0.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            }
                        } else {
                            c0.y0.a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        c0.y0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.f116869m.a(arrayList, z11)) {
                        this.f116861e.a();
                        o2Var.c(new o2.a() { // from class: v.b3
                            @Override // v.o2.a
                            public final void a(CameraCaptureSession cameraCaptureSession, int i11, boolean z12) {
                                c3.m(this.f116828a, cameraCaptureSession, i11, z12);
                            }
                        });
                    }
                    if (this.f116870n.b(arrayList, z11)) {
                        o2Var.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                    }
                    return this.f116861e.g(arrayList, o2Var);
                } catch (CameraAccessException e11) {
                    c0.y0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u() {
        this.f116871o.e().b(new Runnable() { // from class: v.a3
            @Override // java.lang.Runnable
            public final void run() {
                c3.j(this.f116818a);
            }
        }, i0.c.b());
    }

    int v(androidx.camera.core.impl.x2 x2Var) {
        synchronized (this.f116857a) {
            try {
                if (x2Var == null) {
                    c0.y0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.f116865i != c.OPENED) {
                    c0.y0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                androidx.camera.core.impl.v0 v0VarK = x2Var.k();
                if (v0VarK.i().isEmpty()) {
                    c0.y0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f116861e.a();
                    } catch (CameraAccessException e11) {
                        c0.y0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    c0.y0.a("CaptureSession", "Issuing request for session.");
                    CaptureRequest captureRequestE = h2.e(v0VarK, this.f116861e.f(), this.f116863g, true, this.f116873q);
                    if (captureRequestE == null) {
                        c0.y0.a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    return this.f116861e.m(captureRequestE, this.f116871o.d(p(v0VarK.c(), new CameraCaptureSession.CaptureCallback[0])));
                } catch (CameraAccessException e12) {
                    c0.y0.c("CaptureSession", "Unable to access camera: " + e12.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void x() {
        synchronized (this.f116857a) {
            if (this.f116865i == c.OPENED) {
                try {
                    this.f116861e.a();
                } catch (CameraAccessException e11) {
                    c0.y0.d("CaptureSession", "Unable to stop repeating.", e11);
                }
            } else {
                c0.y0.c("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.f116865i);
            }
        }
    }

    c3(@NonNull x.f fVar, @NonNull androidx.camera.core.impl.r2 r2Var) {
        this.f116857a = new Object();
        this.f116858b = new ArrayList();
        this.f116863g = new HashMap();
        this.f116864h = Collections.EMPTY_LIST;
        this.f116865i = c.UNINITIALIZED;
        this.f116868l = new HashMap();
        this.f116869m = new z.w();
        this.f116870n = new z.a0();
        this.f116865i = c.INITIALIZED;
        this.f116872p = fVar;
        this.f116859c = new d();
        this.f116871o = new z.t(r2Var.a(CaptureNoResponseQuirk.class));
        this.f116873q = new z.z(r2Var);
    }

    class a implements j0.c<Void> {
        a() {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            synchronized (c3.this.f116857a) {
                try {
                    c3.this.f116860d.stop();
                    int iOrdinal = c3.this.f116865i.ordinal();
                    if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        c0.y0.m("CaptureSession", "Opening session with fail " + c3.this.f116865i, th2);
                        c3.this.q();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }
    }
}
