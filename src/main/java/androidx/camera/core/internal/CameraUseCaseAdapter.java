package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.f0;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.u2;
import androidx.camera.core.impl.v2;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Consumer;
import c0.a2;
import c0.c2;
import c0.h1;
import c0.i;
import c0.j;
import c0.n;
import c0.r0;
import c0.y0;
import c0.z;
import c0.z1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h0.s;
import i0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.k;
import k0.m;
import n0.e;
import p0.z0;
import t0.f;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUseCaseAdapter implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final j0 f3377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f3378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f3379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3 f3380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3381e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0.a f3384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c2 f3385i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final b0 f3387k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a2 f3391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f3392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final u2 f3393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private final v2 f3394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v2 f3395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final z f3396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    private final z f3397u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<a2> f3382f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<a2> f3383g = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private List<j> f3386j = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f3388l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3389m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private x0 f3390n = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final e f3398v = new e();

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    public static abstract class a {
        @NonNull
        public static a a(@NonNull String str, @NonNull n1 n1Var) {
            return new androidx.camera.core.internal.a(str, n1Var);
        }

        @NonNull
        public abstract n1 b();

        @NonNull
        public abstract String c();
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o3<?> f3399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o3<?> f3400b;

        b(o3<?> o3Var, o3<?> o3Var2) {
            this.f3399a = o3Var;
            this.f3400b = o3Var2;
        }
    }

    public CameraUseCaseAdapter(@NonNull j0 j0Var, j0 j0Var2, @NonNull v2 v2Var, v2 v2Var2, @NonNull z zVar, @NonNull z zVar2, @NonNull d0.a aVar, @NonNull f0 f0Var, @NonNull p3 p3Var) {
        this.f3377a = j0Var;
        this.f3378b = j0Var2;
        this.f3396t = zVar;
        this.f3397u = zVar2;
        this.f3384h = aVar;
        this.f3379c = f0Var;
        this.f3380d = p3Var;
        b0 b0VarA = v2Var.A();
        this.f3387k = b0VarA;
        this.f3393q = new u2(j0Var.l(), b0VarA.I(null));
        this.f3394r = v2Var;
        this.f3395s = v2Var2;
        this.f3381e = B(v2Var, v2Var2);
    }

    @NonNull
    public static a B(@NonNull v2 v2Var, v2 v2Var2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v2Var.d());
        sb2.append(v2Var2 == null ? "" : v2Var2.d());
        return a.a(sb2.toString(), v2Var.A().E());
    }

    private static o3<?> C(@NonNull p3 p3Var, @NonNull f fVar) {
        o3<?> o3VarL = new h1.a().e().l(false, p3Var);
        if (o3VarL == null) {
            return null;
        }
        d2 d2VarD0 = d2.d0(o3VarL);
        d2VarD0.e0(k.I);
        return fVar.A(d2VarD0).d();
    }

    private int E() {
        synchronized (this.f3388l) {
            try {
                return this.f3384h.b() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map<a2, b> F(@NonNull Collection<a2> collection, @NonNull p3 p3Var, @NonNull p3 p3Var2) {
        HashMap map = new HashMap();
        for (a2 a2Var : collection) {
            map.put(a2Var, new b(f.u0(a2Var) ? C(p3Var, (f) a2Var) : a2Var.l(false, p3Var), a2Var.l(true, p3Var2)));
        }
        return map;
    }

    private int H(boolean z11) {
        int iG;
        synchronized (this.f3388l) {
            try {
                Iterator<j> it = this.f3386j.iterator();
                j jVar = null;
                while (true) {
                    iG = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    j next = it.next();
                    if (z0.d(next.g()) > 1) {
                        h.j(jVar == null, "Can only have one sharing effect.");
                        jVar = next;
                    }
                }
                if (jVar != null) {
                    iG = jVar.g();
                }
                if (z11) {
                    iG |= 3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iG;
    }

    @NonNull
    private Set<a2> I(@NonNull Collection<a2> collection, boolean z11) {
        HashSet hashSet = new HashSet();
        int iH = H(z11);
        for (a2 a2Var : collection) {
            h.b(!f.u0(a2Var), "Only support one level of sharing for now.");
            if (a2Var.C(iH)) {
                hashSet.add(a2Var);
            }
        }
        return hashSet;
    }

    private boolean K() {
        boolean z11;
        synchronized (this.f3388l) {
            z11 = this.f3387k.I(null) != null;
        }
        return z11;
    }

    private static boolean L(c3 c3Var, x2 x2Var) {
        x0 x0VarD = c3Var.d();
        x0 x0VarF = x2Var.f();
        if (x0VarD.g().size() != x2Var.f().g().size()) {
            return true;
        }
        for (x0.a<?> aVar : x0VarD.g()) {
            if (!x0VarF.e(aVar) || !Objects.equals(x0VarF.a(aVar), x0VarD.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(@NonNull Collection<a2> collection) {
        Iterator<a2> it = collection.iterator();
        while (it.hasNext()) {
            if (U(it.next().k().w())) {
                return true;
            }
        }
        return false;
    }

    private static boolean N(@NonNull Collection<a2> collection) {
        for (a2 a2Var : collection) {
            if (T(a2Var)) {
                o3<?> o3VarK = a2Var.k();
                x0.a<?> aVar = p1.P;
                if (o3VarK.e(aVar) && ((Integer) h.g((Integer) o3VarK.a(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean O(@NonNull Collection<a2> collection) {
        for (a2 a2Var : collection) {
            if (T(a2Var)) {
                o3<?> o3VarK = a2Var.k();
                x0.a<?> aVar = p1.P;
                if (o3VarK.e(aVar) && ((Integer) h.g((Integer) o3VarK.a(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean P(@NonNull Collection<a2> collection) {
        Iterator<a2> it = collection.iterator();
        while (it.hasNext()) {
            if (X(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean Q() {
        boolean z11;
        synchronized (this.f3388l) {
            z11 = true;
            if (this.f3387k.M() != 1) {
                z11 = false;
            }
        }
        return z11;
    }

    private static boolean R(@NonNull Collection<a2> collection) {
        boolean z11 = false;
        boolean z12 = false;
        for (a2 a2Var : collection) {
            if (V(a2Var) || f.u0(a2Var)) {
                z11 = true;
            } else if (T(a2Var)) {
                z12 = true;
            }
        }
        return z11 && !z12;
    }

    private static boolean S(@NonNull Collection<a2> collection) {
        boolean z11 = false;
        boolean z12 = false;
        for (a2 a2Var : collection) {
            if (V(a2Var) || f.u0(a2Var)) {
                z12 = true;
            } else if (T(a2Var)) {
                z11 = true;
            }
        }
        return z11 && !z12;
    }

    private static boolean T(a2 a2Var) {
        return a2Var instanceof r0;
    }

    private static boolean U(@NonNull c0.b0 b0Var) {
        return (b0Var.a() == 10) || (b0Var.b() != 1 && b0Var.b() != 0);
    }

    private static boolean V(a2 a2Var) {
        return a2Var instanceof h1;
    }

    static boolean W(@NonNull Collection<a2> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (a2 a2Var : collection) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (a2Var.C(i12)) {
                    if (hashSet.contains(Integer.valueOf(i12))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i12));
                }
            }
        }
        return true;
    }

    private static boolean X(a2 a2Var) {
        if (a2Var != null) {
            if (a2Var.k().e(o3.C)) {
                return a2Var.k().U() == p3.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", a2Var + " UseCase does not have capture type.");
        }
        return false;
    }

    private void Z() {
        synchronized (this.f3388l) {
            try {
                if (this.f3390n != null) {
                    this.f3377a.l().i(this.f3390n);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private static List<j> b0(@NonNull List<j> list, @NonNull Collection<a2> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (a2 a2Var : collection) {
            a2Var.T(null);
            for (j jVar : list) {
                if (a2Var.C(jVar.g())) {
                    h.j(a2Var.m() == null, a2Var + " already has effect" + a2Var.m());
                    a2Var.T(jVar);
                    arrayList.remove(jVar);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void d(z1 z1Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(z1Var.p().getWidth(), z1Var.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        z1Var.u(surface, c.b(), new Consumer() { // from class: k0.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraUseCaseAdapter.f(surface, surfaceTexture, (z1.g) obj);
            }
        });
    }

    private boolean d0(@NonNull Collection<a2> collection) {
        if (K() && P(collection)) {
            return true;
        }
        return this.f3398v.a(this.f3377a.e().d(), collection);
    }

    static void e0(@NonNull List<j> list, @NonNull Collection<a2> collection, @NonNull Collection<a2> collection2) {
        List<j> listB0 = b0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<j> listB1 = b0(listB0, arrayList);
        if (listB1.size() > 0) {
            y0.l("CameraUseCaseAdapter", "Unused effects: " + listB1);
        }
    }

    public static /* synthetic */ void f(Surface surface, SurfaceTexture surfaceTexture, z1.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    private void g0(@NonNull Map<a2, c3> map, @NonNull Collection<a2> collection) {
        Map<a2, c3> map2;
        synchronized (this.f3388l) {
            try {
                if (this.f3385i == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<a2, Rect> mapA = m.a(this.f3377a.l().l(), this.f3377a.e().f() == 0, this.f3385i.a(), this.f3377a.e().i(this.f3385i.c()), this.f3385i.d(), this.f3385i.b(), map2);
                    for (a2 a2Var : collection) {
                        a2Var.W((Rect) h.g(mapA.get(a2Var)));
                    }
                }
                for (a2 a2Var2 : collection) {
                    a2Var2.U(u(this.f3377a.l().l(), ((c3) h.g(map2.get(a2Var2))).e()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r() {
        synchronized (this.f3388l) {
            CameraControlInternal cameraControlInternalL = this.f3377a.l();
            this.f3390n = cameraControlInternalL.n();
            cameraControlInternalL.p();
        }
    }

    static Collection<a2> s(@NonNull Collection<a2> collection, a2 a2Var, f fVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (a2Var != null) {
            arrayList.add(a2Var);
        }
        if (fVar != null) {
            arrayList.add(fVar);
            arrayList.removeAll(fVar.l0());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    private a2 t(@NonNull Collection<a2> collection, f fVar) {
        a2 a2VarX;
        synchronized (this.f3388l) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (fVar != null) {
                    arrayList.add(fVar);
                    arrayList.removeAll(fVar.l0());
                }
                if (!Q()) {
                    a2VarX = null;
                } else if (S(arrayList)) {
                    a2VarX = V(this.f3391o) ? this.f3391o : y();
                } else if (R(arrayList)) {
                    a2VarX = T(this.f3391o) ? this.f3391o : x();
                } else {
                    a2VarX = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a2VarX;
    }

    @NonNull
    private static Matrix u(@NonNull Rect rect, @NonNull Size size) {
        h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<a2, c3> v(int i11, @NonNull i0 i0Var, @NonNull Collection<a2> collection, @NonNull Collection<a2> collection2, @NonNull Map<a2, b> map) {
        Rect rectL;
        ArrayList arrayList = new ArrayList();
        String strD = i0Var.d();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<a2> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a2 next = it.next();
            androidx.camera.core.impl.a aVarA = androidx.camera.core.impl.a.a(this.f3379c.a(i11, strD, next.n(), next.g()), next.n(), next.g(), ((c3) h.g(next.f())).b(), f.j0(next), next.f().d(), next.k().O(null));
            arrayList.add(aVarA);
            map3.put(aVarA, next);
            map2.put(next, next.f());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectL = this.f3377a.l().l();
            } catch (NullPointerException unused) {
                rectL = null;
            }
            k0.i iVar = new k0.i(i0Var, rectL != null ? s.m(rectL) : null);
            boolean z11 = false;
            for (a2 a2Var : collection) {
                b bVar = map.get(a2Var);
                o3<?> o3VarE = a2Var.E(i0Var, bVar.f3399a, bVar.f3400b);
                map4.put(o3VarE, a2Var);
                map5.put(o3VarE, iVar.m(o3VarE));
                if (a2Var.k() instanceof l2) {
                    z11 = ((l2) a2Var.k()).t() == 2;
                }
            }
            Pair<Map<o3<?>, c3>, Map<androidx.camera.core.impl.a, c3>> pairB = this.f3379c.b(i11, strD, arrayList, map5, z11, P(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((a2) entry.getValue(), (c3) ((Map) pairB.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairB.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((a2) map3.get(entry2.getKey()), (c3) entry2.getValue());
                }
            }
        }
        return map2;
    }

    private void w(@NonNull Collection<a2> collection) {
        if (K()) {
            if (M(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (O(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
            if (N(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f3388l) {
            try {
                if (!this.f3386j.isEmpty() && (O(collection) || N(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private r0 x() {
        return new r0.b().r("ImageCapture-Extra").e();
    }

    private h1 y() {
        h1 h1VarE = new h1.a().r("Preview-Extra").e();
        h1VarE.l0(new h1.c() { // from class: k0.c
            @Override // c0.h1.c
            public final void a(z1 z1Var) {
                CameraUseCaseAdapter.d(z1Var);
            }
        });
        return h1VarE;
    }

    private f z(@NonNull Collection<a2> collection, boolean z11) {
        synchronized (this.f3388l) {
            try {
                Set<a2> setI = I(collection, z11);
                if (setI.size() >= 2 || (K() && P(setI))) {
                    f fVar = this.f3392p;
                    if (fVar != null && fVar.l0().equals(setI)) {
                        f fVar2 = this.f3392p;
                        Objects.requireNonNull(fVar2);
                        return fVar2;
                    }
                    if (!W(setI)) {
                        return null;
                    }
                    return new f(this.f3377a, this.f3378b, this.f3396t, this.f3397u, setI, this.f3380d);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A() {
        synchronized (this.f3388l) {
            try {
                if (this.f3389m) {
                    this.f3377a.p(new ArrayList(this.f3383g));
                    j0 j0Var = this.f3378b;
                    if (j0Var != null) {
                        j0Var.p(new ArrayList(this.f3383g));
                    }
                    r();
                    this.f3389m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public a D() {
        return this.f3381e;
    }

    public n G() {
        return this.f3395s;
    }

    @NonNull
    public List<a2> J() {
        ArrayList arrayList;
        synchronized (this.f3388l) {
            arrayList = new ArrayList(this.f3382f);
        }
        return arrayList;
    }

    public void Y(@NonNull Collection<a2> collection) {
        synchronized (this.f3388l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3382f);
            linkedHashSet.removeAll(collection);
            j0 j0Var = this.f3378b;
            f0(linkedHashSet, j0Var != null, j0Var != null);
        }
    }

    public void a0(List<j> list) {
        synchronized (this.f3388l) {
            this.f3386j = list;
        }
    }

    @Override // c0.i
    @NonNull
    public CameraControl b() {
        return this.f3393q;
    }

    @Override // c0.i
    @NonNull
    public n c() {
        return this.f3394r;
    }

    public void c0(c2 c2Var) {
        synchronized (this.f3388l) {
            this.f3385i = c2Var;
        }
    }

    void f0(@NonNull Collection<a2> collection, boolean z11, boolean z12) {
        c3 c3Var;
        x0 x0VarD;
        synchronized (this.f3388l) {
            try {
                w(collection);
                if (!z11 && d0(collection)) {
                    f0(collection, true, z12);
                    return;
                }
                f fVarZ = z(collection, z11);
                a2 a2VarT = t(collection, fVarZ);
                Collection<a2> collectionS = s(collection, a2VarT, fVarZ);
                ArrayList<a2> arrayList = new ArrayList(collectionS);
                arrayList.removeAll(this.f3383g);
                ArrayList<a2> arrayList2 = new ArrayList(collectionS);
                arrayList2.retainAll(this.f3383g);
                ArrayList<a2> arrayList3 = new ArrayList(this.f3383g);
                arrayList3.removeAll(collectionS);
                Map<a2, b> mapF = F(arrayList, this.f3387k.j(), this.f3380d);
                Map<a2, c3> mapV = Collections.EMPTY_MAP;
                try {
                    Map<a2, c3> mapV2 = v(E(), this.f3377a.e(), arrayList, arrayList2, mapF);
                    if (this.f3378b != null) {
                        int iE = E();
                        j0 j0Var = this.f3378b;
                        Objects.requireNonNull(j0Var);
                        mapV = v(iE, j0Var.e(), arrayList, arrayList2, mapF);
                    }
                    g0(mapV2, collectionS);
                    e0(this.f3386j, collectionS, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((a2) it.next()).X(this.f3377a);
                    }
                    this.f3377a.p(arrayList3);
                    if (this.f3378b != null) {
                        for (a2 a2Var : arrayList3) {
                            j0 j0Var2 = this.f3378b;
                            Objects.requireNonNull(j0Var2);
                            a2Var.X(j0Var2);
                        }
                        j0 j0Var3 = this.f3378b;
                        Objects.requireNonNull(j0Var3);
                        j0Var3.p(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (a2 a2Var2 : arrayList2) {
                            if (mapV2.containsKey(a2Var2) && (x0VarD = (c3Var = mapV2.get(a2Var2)).d()) != null && L(c3Var, a2Var2.x())) {
                                a2Var2.a0(x0VarD);
                                if (this.f3389m) {
                                    this.f3377a.k(a2Var2);
                                    j0 j0Var4 = this.f3378b;
                                    if (j0Var4 != null) {
                                        Objects.requireNonNull(j0Var4);
                                        j0Var4.k(a2Var2);
                                    }
                                }
                            }
                        }
                    }
                    for (a2 a2Var3 : arrayList) {
                        b bVar = mapF.get(a2Var3);
                        Objects.requireNonNull(bVar);
                        j0 j0Var5 = this.f3378b;
                        if (j0Var5 != null) {
                            j0 j0Var6 = this.f3377a;
                            Objects.requireNonNull(j0Var5);
                            a2Var3.c(j0Var6, j0Var5, bVar.f3399a, bVar.f3400b);
                            a2Var3.Z((c3) h.g(mapV2.get(a2Var3)), mapV.get(a2Var3));
                        } else {
                            a2Var3.c(this.f3377a, null, bVar.f3399a, bVar.f3400b);
                            a2Var3.Z((c3) h.g(mapV2.get(a2Var3)), null);
                        }
                    }
                    if (this.f3389m) {
                        this.f3377a.o(arrayList);
                        j0 j0Var7 = this.f3378b;
                        if (j0Var7 != null) {
                            Objects.requireNonNull(j0Var7);
                            j0Var7.o(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((a2) it2.next()).I();
                    }
                    this.f3382f.clear();
                    this.f3382f.addAll(collection);
                    this.f3383g.clear();
                    this.f3383g.addAll(collectionS);
                    this.f3391o = a2VarT;
                    this.f3392p = fVarZ;
                } catch (IllegalArgumentException e11) {
                    if (z11 || K() || this.f3384h.b() == 2) {
                        throw e11;
                    }
                    f0(collection, true, z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(@NonNull Collection<a2> collection) {
        synchronized (this.f3388l) {
            try {
                this.f3377a.h(this.f3387k);
                j0 j0Var = this.f3378b;
                if (j0Var != null) {
                    j0Var.h(this.f3387k);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3382f);
                linkedHashSet.addAll(collection);
                try {
                    j0 j0Var2 = this.f3378b;
                    f0(linkedHashSet, j0Var2 != null, j0Var2 != null);
                } catch (IllegalArgumentException e11) {
                    throw new CameraException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k() {
        synchronized (this.f3388l) {
            try {
                if (!this.f3389m) {
                    if (!this.f3383g.isEmpty()) {
                        this.f3377a.h(this.f3387k);
                        j0 j0Var = this.f3378b;
                        if (j0Var != null) {
                            j0Var.h(this.f3387k);
                        }
                    }
                    this.f3377a.o(this.f3383g);
                    j0 j0Var2 = this.f3378b;
                    if (j0Var2 != null) {
                        j0Var2.o(this.f3383g);
                    }
                    Z();
                    Iterator<a2> it = this.f3383g.iterator();
                    while (it.hasNext()) {
                        it.next().I();
                    }
                    this.f3389m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(boolean z11) {
        this.f3377a.n(z11);
    }
}
