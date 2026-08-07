package v;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements androidx.camera.core.impl.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.z f117377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0.h f117378c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f117380e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final a<c0.q> f117383h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.r2 f117385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.i1 f117386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private final w.m0 f117387l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f117379d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a<Integer> f117381f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a<c0.d2> f117382g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Pair<androidx.camera.core.impl.p, Executor>> f117384i = null;

    static class a<T> extends androidx.p003lifecycle.g0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.p003lifecycle.d0<T> f117388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final T f117389d;

        a(T t11) {
            this.f117389d = t11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void d(@NonNull androidx.p003lifecycle.d0<T> d0Var) {
            androidx.p003lifecycle.d0<T> d0Var2 = this.f117388c;
            if (d0Var2 != null) {
                super.c(d0Var2);
            }
            this.f117388c = d0Var;
            super.b(d0Var, new androidx.p003lifecycle.j0() { // from class: v.w0
                @Override // androidx.p003lifecycle.j0
                public final void onChanged(Object obj) {
                    this.f117360a.setValue(obj);
                }
            });
        }

        @Override // androidx.p003lifecycle.d0
        public T getValue() {
            androidx.p003lifecycle.d0<T> d0Var = this.f117388c;
            return d0Var == null ? this.f117389d : d0Var.getValue();
        }
    }

    public x0(@NonNull String str, @NonNull w.m0 m0Var) {
        String str2 = (String) u5.h.g(str);
        this.f117376a = str2;
        this.f117387l = m0Var;
        w.z zVarC = m0Var.c(str2);
        this.f117377b = zVarC;
        this.f117378c = new b0.h(this);
        androidx.camera.core.impl.r2 r2VarA = androidx.camera.camera2.internal.compat.quirk.a.a(str, zVarC);
        this.f117385j = r2VarA;
        this.f117386k = new j2(str, r2VarA);
        this.f117383h = new a<>(c0.q.a(c0.q.b.CLOSED));
    }

    private void G() {
        H();
    }

    private void H() {
        String str;
        int iE = E();
        if (iE == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iE == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iE == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iE == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iE != 4) {
            str = "Unknown value: " + iE;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        c0.y0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @NonNull
    public b0.h A() {
        return this.f117378c;
    }

    @NonNull
    public w.z B() {
        return this.f117377b;
    }

    @NonNull
    public Map<String, CameraCharacteristics> C() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f117376a, this.f117377b.g());
        for (String str : this.f117377b.c()) {
            if (!Objects.equals(str, this.f117376a)) {
                try {
                    linkedHashMap.put(str, this.f117387l.c(str).g());
                } catch (CameraAccessExceptionCompat e11) {
                    c0.y0.d("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e11);
                }
            }
        }
        return linkedHashMap;
    }

    int D() {
        Integer num = (Integer) this.f117377b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        u5.h.g(num);
        return num.intValue();
    }

    int E() {
        Integer num = (Integer) this.f117377b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        u5.h.g(num);
        return num.intValue();
    }

    void F(@NonNull v vVar) {
        synchronized (this.f117379d) {
            try {
                this.f117380e = vVar;
                a<c0.d2> aVar = this.f117382g;
                if (aVar != null) {
                    aVar.d(vVar.U().h());
                }
                a<Integer> aVar2 = this.f117381f;
                if (aVar2 != null) {
                    aVar2.d(this.f117380e.S().f());
                }
                List<Pair<androidx.camera.core.impl.p, Executor>> list = this.f117384i;
                if (list != null) {
                    for (Pair<androidx.camera.core.impl.p, Executor> pair : list) {
                        this.f117380e.B((Executor) pair.second, (androidx.camera.core.impl.p) pair.first);
                    }
                    this.f117384i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    void I(@NonNull androidx.p003lifecycle.d0<c0.q> d0Var) {
        this.f117383h.d(d0Var);
    }

    @Override // c0.n
    @NonNull
    public androidx.p003lifecycle.d0<c0.q> a() {
        return this.f117383h;
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public Set<c0.b0> b() {
        return x.f.a(this.f117377b).c();
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public String d() {
        return this.f117376a;
    }

    @Override // androidx.camera.core.impl.i0
    public void e(@NonNull Executor executor, @NonNull androidx.camera.core.impl.p pVar) {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar != null) {
                    vVar.B(executor, pVar);
                    return;
                }
                if (this.f117384i == null) {
                    this.f117384i = new ArrayList();
                }
                this.f117384i.add(new Pair<>(pVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.n
    public int f() {
        Integer num = (Integer) this.f117377b.a(CameraCharacteristics.LENS_FACING);
        u5.h.b(num != null, "Unable to get the lens facing of the camera.");
        return h4.a(num.intValue());
    }

    @Override // c0.n
    @NonNull
    public Set<Range<Integer>> g() {
        Range[] rangeArr = (Range[]) this.f117377b.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.impl.i0
    public void h(@NonNull androidx.camera.core.impl.p pVar) {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar != null) {
                    vVar.d0(pVar);
                    return;
                }
                List<Pair<androidx.camera.core.impl.p, Executor>> list = this.f117384i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<androidx.camera.core.impl.p, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == pVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.n
    public int i(int i11) {
        return h0.c.a(h0.c.b(i11), D(), 1 == f());
    }

    @Override // c0.n
    public boolean j(@NonNull c0.e0 e0Var) {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar == null) {
                    return false;
                }
                return vVar.H().K(e0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public androidx.camera.core.impl.i1 k() {
        return this.f117386k;
    }

    @Override // c0.n
    @NonNull
    public androidx.p003lifecycle.d0<c0.d2> l() {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar == null) {
                    if (this.f117382g == null) {
                        this.f117382g = new a<>(s5.f(this.f117377b));
                    }
                    return this.f117382g;
                }
                a<c0.d2> aVar = this.f117382g;
                if (aVar != null) {
                    return aVar;
                }
                return vVar.U().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.n
    public int m() {
        return i(0);
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public List<Size> o(int i11) {
        Size[] sizeArrA = this.f117377b.d().a(i11);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public Object p() {
        return this.f117377b.g();
    }

    @Override // c0.n
    public boolean q() {
        w.z zVar = this.f117377b;
        Objects.requireNonNull(zVar);
        return z.g.a(new v0(zVar));
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public androidx.camera.core.impl.r2 r() {
        return this.f117385j;
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public List<Size> s(int i11) {
        Size[] sizeArrC = this.f117377b.d().c(i11);
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.i0
    public boolean t() {
        int[] iArr = (int[]) this.f117377b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c0.n
    @NonNull
    public androidx.p003lifecycle.d0<Integer> u() {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar == null) {
                    if (this.f117381f == null) {
                        this.f117381f = new a<>(0);
                    }
                    return this.f117381f;
                }
                a<Integer> aVar = this.f117381f;
                if (aVar != null) {
                    return aVar;
                }
                return vVar.S().f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.n
    @NonNull
    public c0.c0 v() {
        synchronized (this.f117379d) {
            try {
                v vVar = this.f117380e;
                if (vVar == null) {
                    return n3.e(this.f117377b);
                }
                return vVar.F().f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.i0
    @NonNull
    public androidx.camera.core.impl.h3 w() {
        Integer num = (Integer) this.f117377b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        u5.h.g(num);
        return num.intValue() != 1 ? androidx.camera.core.impl.h3.UPTIME : androidx.camera.core.impl.h3.REALTIME;
    }

    @Override // c0.n
    @NonNull
    public String x() {
        return E() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.impl.i0
    public Object y(@NonNull String str) {
        try {
            if (this.f117377b.c().contains(str)) {
                return this.f117387l.c(str).g();
            }
            return null;
        } catch (CameraAccessExceptionCompat e11) {
            c0.y0.d("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e11);
            return null;
        }
    }

    @Override // androidx.camera.core.impl.i0
    public boolean z() {
        int[] iArr = (int[]) this.f117377b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
