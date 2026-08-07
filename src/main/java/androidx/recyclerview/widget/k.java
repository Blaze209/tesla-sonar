package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class k implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<k> f13489e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator<c> f13490f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f13493c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f13491a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<c> f13494d = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f13502d;
            if ((recyclerView == null) != (cVar2.f13502d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z11 = cVar.f13499a;
            if (z11 != cVar2.f13499a) {
                return z11 ? -1 : 1;
            }
            int i11 = cVar2.f13500b - cVar.f13500b;
            if (i11 != 0) {
                return i11;
            }
            int i12 = cVar.f13501c - cVar2.f13501c;
            if (i12 != 0) {
                return i12;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f13497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13498d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i13 = this.f13498d;
            int i14 = i13 * 2;
            int[] iArr = this.f13497c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f13497c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i14 >= iArr.length) {
                int[] iArr3 = new int[i13 * 4];
                this.f13497c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f13497c;
            iArr4[i14] = i11;
            iArr4[i14 + 1] = i12;
            this.f13498d++;
        }

        void b() {
            int[] iArr = this.f13497c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13498d = 0;
        }

        void c(RecyclerView recyclerView, boolean z11) {
            this.f13498d = 0;
            int[] iArr = this.f13497c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f13173n;
            if (recyclerView.f13171m == null || qVar == null || !qVar.z0()) {
                return;
            }
            if (z11) {
                if (!recyclerView.f13155e.p()) {
                    qVar.v(recyclerView.f13171m.getItemCount(), this);
                }
            } else if (!recyclerView.w0()) {
                qVar.u(this.f13495a, this.f13496b, recyclerView.f13166j0, this);
            }
            int i11 = this.f13498d;
            if (i11 > qVar.f13262m) {
                qVar.f13262m = i11;
                qVar.f13263n = z11;
                recyclerView.f13151c.P();
            }
        }

        boolean d(int i11) {
            if (this.f13497c != null) {
                int i12 = this.f13498d * 2;
                for (int i13 = 0; i13 < i12; i13 += 2) {
                    if (this.f13497c[i13] == i11) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i11, int i12) {
            this.f13495a = i11;
            this.f13496b = i12;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f13502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13503e;

        c() {
        }

        public void a() {
            this.f13499a = false;
            this.f13500b = 0;
            this.f13501c = 0;
            this.f13502d = null;
            this.f13503e = 0;
        }
    }

    k() {
    }

    private void b() {
        c cVar;
        int size = this.f13491a.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView = this.f13491a.get(i12);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f13164i0.c(recyclerView, false);
                i11 += recyclerView.f13164i0.f13498d;
            }
        }
        this.f13494d.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView2 = this.f13491a.get(i14);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f13164i0;
                int iAbs = Math.abs(bVar.f13495a) + Math.abs(bVar.f13496b);
                for (int i15 = 0; i15 < bVar.f13498d * 2; i15 += 2) {
                    if (i13 >= this.f13494d.size()) {
                        cVar = new c();
                        this.f13494d.add(cVar);
                    } else {
                        cVar = this.f13494d.get(i13);
                    }
                    int[] iArr = bVar.f13497c;
                    int i16 = iArr[i15 + 1];
                    cVar.f13499a = i16 <= iAbs;
                    cVar.f13500b = iAbs;
                    cVar.f13501c = i16;
                    cVar.f13502d = recyclerView2;
                    cVar.f13503e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(this.f13494d, f13490f);
    }

    private void c(c cVar, long j11) {
        RecyclerView.g0 g0VarI = i(cVar.f13502d, cVar.f13503e, cVar.f13499a ? Long.MAX_VALUE : j11);
        if (g0VarI == null || g0VarI.mNestedRecyclerView == null || !g0VarI.isBound() || g0VarI.isInvalid()) {
            return;
        }
        h(g0VarI.mNestedRecyclerView.get(), j11);
    }

    private void d(long j11) {
        for (int i11 = 0; i11 < this.f13494d.size(); i11++) {
            c cVar = this.f13494d.get(i11);
            if (cVar.f13502d == null) {
                return;
            }
            c(cVar, j11);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i11) {
        int iJ = recyclerView.f13157f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            RecyclerView.g0 g0VarO0 = RecyclerView.o0(recyclerView.f13157f.i(i12));
            if (g0VarO0.mPosition == i11 && !g0VarO0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j11) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.F && recyclerView.f13157f.j() != 0) {
            recyclerView.h1();
        }
        b bVar = recyclerView.f13164i0;
        bVar.c(recyclerView, true);
        if (bVar.f13498d != 0) {
            try {
                Trace.beginSection(j11 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f13166j0.f(recyclerView.f13171m);
                for (int i11 = 0; i11 < bVar.f13498d * 2; i11 += 2) {
                    i(recyclerView, bVar.f13497c[i11], j11);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    private RecyclerView.g0 i(RecyclerView recyclerView, int i11, long j11) {
        if (e(recyclerView, i11)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f13151c;
        if (j11 == Long.MAX_VALUE) {
            try {
                if (q5.k.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.T0(false);
                Trace.endSection();
            }
        }
        recyclerView.R0();
        RecyclerView.g0 g0VarN = xVar.N(i11, false, j11);
        if (g0VarN != null) {
            if (!g0VarN.isBound() || g0VarN.isInvalid()) {
                xVar.a(g0VarN, false);
            } else {
                xVar.G(g0VarN.itemView);
            }
        }
        return g0VarN;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.G0 && this.f13491a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f13491a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.G0 && !this.f13491a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f13492b == 0) {
                this.f13492b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f13164i0.e(i11, i12);
    }

    void g(long j11) {
        b();
        d(j11);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f13491a.remove(recyclerView);
        if (RecyclerView.G0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f13491a.isEmpty()) {
                int size = this.f13491a.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = this.f13491a.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f13493c);
                }
            }
        } finally {
            this.f13492b = 0L;
            Trace.endSection();
        }
    }
}
