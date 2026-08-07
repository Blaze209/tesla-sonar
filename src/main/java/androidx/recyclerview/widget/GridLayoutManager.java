package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set<Integer> U = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE))));
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    d O;
    final Rect P;
    private boolean Q;
    private int R;
    int S;
    int T;

    private static class a {
        static boolean a(@NonNull View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i11) {
            return 1;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f13110a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f13111b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13112c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13113d = false;

        static int a(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 < 0 || i14 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i14);
        }

        int b(int i11, int i12) {
            if (!this.f13113d) {
                return d(i11, i12);
            }
            int i13 = this.f13111b.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int iD = d(i11, i12);
            this.f13111b.put(i11, iD);
            return iD;
        }

        int c(int i11, int i12) {
            if (!this.f13112c) {
                return e(i11, i12);
            }
            int i13 = this.f13110a.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int iE = e(i11, i12);
            this.f13110a.put(i11, iE);
            return iE;
        }

        public int d(int i11, int i12) {
            int i13;
            int i14;
            int iC;
            int iA;
            if (!this.f13113d || (iA = a(this.f13111b, i11)) == -1) {
                i13 = 0;
                i14 = 0;
                iC = 0;
            } else {
                i13 = this.f13111b.get(iA);
                i14 = iA + 1;
                iC = c(iA, i12) + f(iA);
                if (iC == i12) {
                    i13++;
                    iC = 0;
                }
            }
            int iF = f(i11);
            while (i14 < i11) {
                int iF2 = f(i14);
                iC += iF2;
                if (iC == i12) {
                    i13++;
                    iC = 0;
                } else if (iC > i12) {
                    i13++;
                    iC = iF2;
                }
                i14++;
            }
            return iC + iF > i12 ? i13 + 1 : i13;
        }

        public abstract int e(int i11, int i12);

        public abstract int f(int i11);

        public void g() {
            this.f13111b.clear();
        }

        public void h() {
            this.f13110a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(RecyclerView.q.n0(context, attributeSet, i11, i12).f13271b);
    }

    private void Q2(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (z11) {
            i14 = 1;
            i13 = i11;
            i12 = 0;
        } else {
            i12 = i11 - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View view = this.L[i12];
            c cVar = (c) view.getLayoutParams();
            int iP3 = p3(xVar, c0Var, m0(view));
            cVar.f13109f = iP3;
            cVar.f13108e = i15;
            i15 += iP3;
            i12 += i14;
        }
    }

    private void R2() {
        int iP = P();
        for (int i11 = 0; i11 < iP; i11++) {
            c cVar = (c) O(i11).getLayoutParams();
            int iA = cVar.a();
            this.M.put(iA, cVar.f());
            this.N.put(iA, cVar.e());
        }
    }

    private void S2(int i11) {
        this.K = T2(this.K, this.J, i11);
    }

    static int[] T2(int[] iArr, int i11, int i12) {
        int i13;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i11 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 <= 0 || i11 - i14 >= i16) {
                i13 = i15;
            } else {
                i13 = i15 + 1;
                i14 -= i11;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    private void U2() {
        this.M.clear();
        this.N.clear();
    }

    private int V2(RecyclerView.c0 c0Var) {
        if (P() != 0 && c0Var.b() != 0) {
            Z1();
            boolean zT2 = t2();
            View viewD2 = d2(!zT2, true);
            View viewC2 = c2(!zT2, true);
            if (viewD2 != null && viewC2 != null) {
                int iB = this.O.b(m0(viewD2), this.J);
                int iB2 = this.O.b(m0(viewC2), this.J);
                int iMax = this.f13119x ? Math.max(0, ((this.O.b(c0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zT2) {
                    return Math.round((iMax * (Math.abs(this.f13116u.d(viewC2) - this.f13116u.g(viewD2)) / ((this.O.b(m0(viewC2), this.J) - this.O.b(m0(viewD2), this.J)) + 1))) + (this.f13116u.m() - this.f13116u.g(viewD2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int W2(RecyclerView.c0 c0Var) {
        if (P() != 0 && c0Var.b() != 0) {
            Z1();
            View viewD2 = d2(!t2(), true);
            View viewC2 = c2(!t2(), true);
            if (viewD2 != null && viewC2 != null) {
                if (!t2()) {
                    return this.O.b(c0Var.b() - 1, this.J) + 1;
                }
                return (int) (((this.f13116u.d(viewC2) - this.f13116u.g(viewD2)) / ((this.O.b(m0(viewC2), this.J) - this.O.b(m0(viewD2), this.J)) + 1)) * (this.O.b(c0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void X2(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i11) {
        boolean z11 = i11 == 1;
        int iO3 = o3(xVar, c0Var, aVar.f13123b);
        if (z11) {
            while (iO3 > 0) {
                int i12 = aVar.f13123b;
                if (i12 <= 0) {
                    return;
                }
                int i13 = i12 - 1;
                aVar.f13123b = i13;
                iO3 = o3(xVar, c0Var, i13);
            }
            return;
        }
        int iB = c0Var.b() - 1;
        int i14 = aVar.f13123b;
        while (i14 < iB) {
            int i15 = i14 + 1;
            int iO4 = o3(xVar, c0Var, i15);
            if (iO4 <= iO3) {
                break;
            }
            i14 = i15;
            iO3 = iO4;
        }
        aVar.f13123b = i14;
    }

    private void Y2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private View Z2() {
        for (int i11 = 0; i11 < P(); i11++) {
            View viewO = O(i11);
            Objects.requireNonNull(viewO);
            if (a.a(viewO)) {
                return O(i11);
            }
        }
        return null;
    }

    private int c3(int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            int iI3 = i3(i14);
            int iG3 = g3(i14);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f13114s == 1) {
                if (iI3 < i11 && h3(i14).contains(Integer.valueOf(i12))) {
                    this.S = iI3;
                    return i14;
                }
            } else if (iI3 < i11 && iG3 == i12) {
                this.S = ((Integer) Collections.max(j3(i14))).intValue();
                return i14;
            }
        }
        return -1;
    }

    private int d3(int i11, int i12, int i13) {
        for (int i14 = i13 + 1; i14 < a(); i14++) {
            int iI3 = i3(i14);
            int iG3 = g3(i14);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f13114s == 1) {
                if (iI3 > i11 && (iG3 == i12 || h3(i14).contains(Integer.valueOf(i12)))) {
                    this.S = iI3;
                    return i14;
                }
            } else if (iI3 > i11 && iG3 == i12) {
                this.S = i3(i14);
                return i14;
            }
        }
        return -1;
    }

    private int e3(int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            int iI3 = i3(i14);
            int iG3 = g3(i14);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f13114s == 1) {
                if ((iI3 == i11 && iG3 < i12) || iI3 < i11) {
                    this.S = iI3;
                    this.T = iG3;
                    return i14;
                }
            } else if (j3(i14).contains(Integer.valueOf(i11)) && iG3 < i12) {
                this.T = iG3;
                return i14;
            }
        }
        return -1;
    }

    private int f3(int i11, int i12, int i13) {
        for (int i14 = i13 + 1; i14 < a(); i14++) {
            int iI3 = i3(i14);
            int iG3 = g3(i14);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f13114s == 1) {
                if ((iI3 == i11 && iG3 > i12) || iI3 > i11) {
                    this.S = iI3;
                    this.T = iG3;
                    return i14;
                }
            } else if (iG3 > i12 && j3(i14).contains(Integer.valueOf(i11))) {
                this.T = iG3;
                return i14;
            }
        }
        return -1;
    }

    private int g3(int i11) {
        if (this.f13114s == 0) {
            RecyclerView recyclerView = this.f13251b;
            return n3(recyclerView.f13151c, recyclerView.f13166j0, i11);
        }
        RecyclerView recyclerView2 = this.f13251b;
        return o3(recyclerView2.f13151c, recyclerView2.f13166j0, i11);
    }

    private Set<Integer> h3(int i11) {
        return k3(g3(i11), i11);
    }

    private int i3(int i11) {
        if (this.f13114s == 1) {
            RecyclerView recyclerView = this.f13251b;
            return n3(recyclerView.f13151c, recyclerView.f13166j0, i11);
        }
        RecyclerView recyclerView2 = this.f13251b;
        return o3(recyclerView2.f13151c, recyclerView2.f13166j0, i11);
    }

    private Set<Integer> j3(int i11) {
        return k3(i3(i11), i11);
    }

    private Set<Integer> k3(int i11, int i12) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f13251b;
        int iP3 = p3(recyclerView.f13151c, recyclerView.f13166j0, i12);
        for (int i13 = i11; i13 < i11 + iP3; i13++) {
            hashSet.add(Integer.valueOf(i13));
        }
        return hashSet;
    }

    private int n3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11) {
        if (!c0Var.e()) {
            return this.O.b(i11, this.J);
        }
        int iF = xVar.f(i11);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i11);
        return 0;
    }

    private int o3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11) {
        if (!c0Var.e()) {
            return this.O.c(i11, this.J);
        }
        int i12 = this.N.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iF = xVar.f(i11);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 0;
    }

    private int p3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11) {
        if (!c0Var.e()) {
            return this.O.f(i11);
        }
        int i12 = this.M.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iF = xVar.f(i11);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 1;
    }

    private void q3(float f11, int i11) {
        S2(Math.max(Math.round(f11 * this.J), i11));
    }

    private boolean r3(int i11) {
        return (j3(i11).contains(Integer.valueOf(this.S)) && h3(i11).contains(Integer.valueOf(this.T))) ? false : true;
    }

    private void s3(View view, int i11, boolean z11) {
        int iQ;
        int iQ2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f13275b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iL3 = l3(cVar.f13108e, cVar.f13109f);
        if (this.f13114s == 1) {
            iQ2 = RecyclerView.q.Q(iL3, i11, i13, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            iQ = RecyclerView.q.Q(this.f13116u.n(), d0(), i12, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int iQ3 = RecyclerView.q.Q(iL3, i11, i12, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int iQ4 = RecyclerView.q.Q(this.f13116u.n(), u0(), i13, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            iQ = iQ3;
            iQ2 = iQ4;
        }
        t3(view, iQ2, iQ, z11);
    }

    private void t3(View view, int i11, int i12, boolean z11) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z11 ? N1(view, i11, i12, rVar) : L1(view, i11, i12, rVar)) {
            view.measure(i11, i12);
        }
    }

    private void v3() {
        int iC0;
        int iL0;
        if (r2() == 1) {
            iC0 = t0() - k0();
            iL0 = j0();
        } else {
            iC0 = c0() - i0();
            iL0 = l0();
        }
        S2(iC0 - iL0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.c0 c0Var) {
        return this.Q ? V2(c0Var) : super.A(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int B(RecyclerView.c0 c0Var) {
        return this.Q ? W2(c0Var) : super.B(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int C1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        v3();
        Y2();
        return super.C1(i11, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int E1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        v3();
        Y2();
        return super.E1(i11, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void H2(boolean z11) {
        if (z11) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.H2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I1(Rect rect, int i11, int i12) {
        int iT;
        int iT2;
        if (this.K == null) {
            super.I1(rect, i11, i12);
        }
        int iJ0 = j0() + k0();
        int iL0 = l0() + i0();
        if (this.f13114s == 1) {
            iT2 = RecyclerView.q.t(i12, rect.height() + iL0, g0());
            int[] iArr = this.K;
            iT = RecyclerView.q.t(i11, iArr[iArr.length - 1] + iJ0, h0());
        } else {
            iT = RecyclerView.q.t(i11, rect.width() + iJ0, h0());
            int[] iArr2 = this.K;
            iT2 = RecyclerView.q.t(i12, iArr2[iArr2.length - 1] + iL0, g0());
        }
        H1(iT, iT2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J() {
        return this.f13114s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View P0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.c0 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean R1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int T(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f13114s == 1) {
            return Math.min(this.J, a());
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return n3(xVar, c0Var, c0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void T0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.T0(xVar, c0Var, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.t0(GridView.class.getName());
        RecyclerView.h hVar = this.f13251b.f13171m;
        if (hVar == null || hVar.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.V);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void T1(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int iF = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(c0Var) && iF > 0; i11++) {
            int i12 = cVar.f13134d;
            cVar2.a(i12, Math.max(0, cVar.f13137g));
            iF -= this.O.f(i12);
            cVar.f13134d += cVar.f13135e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(RecyclerView.x xVar, RecyclerView.c0 c0Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.U0(view, accessibilityNodeInfoCompat);
            return;
        }
        c cVar = (c) layoutParams;
        int iN3 = n3(xVar, c0Var, cVar.a());
        if (this.f13114s == 0) {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(cVar.e(), cVar.f(), iN3, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(iN3, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a1(RecyclerView recyclerView, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    int a3(int i11) {
        if (i11 < 0 || this.f13114s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i12 = 0; i12 < a(); i12++) {
            for (Integer num : j3(i12)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i12));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i11) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    int b3(int i11) {
        if (i11 < 0 || this.f13114s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i12 = 0; i12 < a(); i12++) {
            for (Integer num : j3(i12)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i12));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i11) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = g3(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.e()) {
            R2();
        }
        super.d1(xVar, c0Var);
        U2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView.c0 c0Var) {
        View viewI;
        super.e1(c0Var);
        this.I = false;
        int i11 = this.R;
        if (i11 == -1 || (viewI = I(i11)) == null) {
            return;
        }
        viewI.sendAccessibilityEvent(67108864);
        this.R = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View l2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11, boolean z12) {
        int i11;
        int iP;
        int iP2 = P();
        int i12 = 1;
        if (z12) {
            iP = P() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = iP2;
            iP = 0;
        }
        int iB = c0Var.b();
        Z1();
        int iM = this.f13116u.m();
        int i13 = this.f13116u.i();
        View view = null;
        View view2 = null;
        while (iP != i11) {
            View viewO = O(iP);
            int iM0 = m0(viewO);
            if (iM0 >= 0 && iM0 < iB && o3(xVar, c0Var, iM0) == 0) {
                if (((RecyclerView.r) viewO.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewO;
                    }
                } else {
                    if (this.f13116u.g(viewO) < i13 && this.f13116u.d(viewO) >= iM) {
                        return viewO;
                    }
                    if (view == null) {
                        view = viewO;
                    }
                }
            }
            iP += i12;
        }
        return view != null ? view : view2;
    }

    int l3(int i11, int i12) {
        if (this.f13114s != 1 || !s2()) {
            int[] iArr = this.K;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.K;
        int i13 = this.J;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    boolean m1(int i11, Bundle bundle) {
        RecyclerView.g0 g0VarN0;
        int iE3;
        if (i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.V.b() || i11 == -1) {
            if (i11 != 16908343 || bundle == null) {
                return super.m1(i11, bundle);
            }
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i12 != -1 && i13 != -1) {
                int itemCount = this.f13251b.f13171m.getItemCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= itemCount) {
                        i14 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f13251b;
                    int iO3 = o3(recyclerView.f13151c, recyclerView.f13166j0, i14);
                    RecyclerView recyclerView2 = this.f13251b;
                    int iN3 = n3(recyclerView2.f13151c, recyclerView2.f13166j0, i14);
                    if (this.f13114s != 1) {
                        if (iO3 == i12 && iN3 == i13) {
                            break;
                        }
                        i14++;
                    } else {
                        if (iO3 == i13 && iN3 == i12) {
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 > -1) {
                    E2(i14, 0);
                    return true;
                }
            }
            return false;
        }
        View viewZ2 = Z2();
        if (viewZ2 == null || bundle == null) {
            return false;
        }
        int i15 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!U.contains(Integer.valueOf(i15)) || (g0VarN0 = this.f13251b.n0(viewZ2)) == null) {
            return false;
        }
        int absoluteAdapterPosition = g0VarN0.getAbsoluteAdapterPosition();
        int iI3 = i3(absoluteAdapterPosition);
        int iG3 = g3(absoluteAdapterPosition);
        if (iI3 >= 0 && iG3 >= 0) {
            if (r3(absoluteAdapterPosition)) {
                this.S = iI3;
                this.T = iG3;
            }
            int i16 = this.S;
            if (i16 == -1) {
                i16 = iI3;
            }
            int i17 = this.T;
            if (i17 != -1) {
                iG3 = i17;
            }
            if (i15 == 17) {
                iE3 = e3(i16, iG3, absoluteAdapterPosition);
            } else if (i15 == 33) {
                iE3 = c3(i16, iG3, absoluteAdapterPosition);
            } else if (i15 == 66) {
                iE3 = f3(i16, iG3, absoluteAdapterPosition);
            } else {
                if (i15 != 130) {
                    return false;
                }
                iE3 = d3(i16, iG3, absoluteAdapterPosition);
            }
            if (iE3 == -1 && this.f13114s == 0) {
                if (i15 == 17) {
                    iE3 = b3(iI3);
                } else if (i15 == 66) {
                    iE3 = a3(iI3);
                }
            }
            if (iE3 != -1) {
                D1(iE3);
                this.R = iE3;
                return true;
            }
        }
        return false;
    }

    public int m3() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int p0(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f13114s == 0) {
            return Math.min(this.J, a());
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return n3(xVar, c0Var, c0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean s(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i11;
        int i12;
        int iJ0;
        int iL0;
        int iF;
        int iF2;
        int i13;
        int iQ;
        int iQ2;
        View viewD;
        int iL = this.f13116u.l();
        boolean z11 = iL != 1073741824;
        int i14 = P() > 0 ? this.K[this.J] : 0;
        if (z11) {
            v3();
        }
        boolean z12 = cVar.f13135e == 1;
        int iO3 = this.J;
        if (!z12) {
            iO3 = o3(xVar, c0Var, cVar.f13134d) + p3(xVar, c0Var, cVar.f13134d);
        }
        int i15 = 0;
        while (i15 < this.J && cVar.c(c0Var) && iO3 > 0) {
            int i16 = cVar.f13134d;
            int iP3 = p3(xVar, c0Var, i16);
            if (iP3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i16 + " requires " + iP3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iO3 -= iP3;
            if (iO3 < 0 || (viewD = cVar.d(xVar)) == null) {
                break;
            }
            this.L[i15] = viewD;
            i15++;
        }
        if (i15 == 0) {
            bVar.f13128b = true;
            return;
        }
        Q2(xVar, c0Var, i15, z12);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            View view = this.L[i18];
            if (cVar.f13142l == null) {
                if (z12) {
                    j(view);
                } else {
                    k(view, 0);
                }
            } else if (z12) {
                h(view);
            } else {
                i(view, 0);
            }
            p(view, this.P);
            s3(view, iL, false);
            int iE = this.f13116u.e(view);
            if (iE > i17) {
                i17 = iE;
            }
            float f12 = (this.f13116u.f(view) * 1.0f) / ((c) view.getLayoutParams()).f13109f;
            if (f12 > f11) {
                f11 = f12;
            }
        }
        if (z11) {
            q3(f11, i14);
            i17 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                View view2 = this.L[i19];
                s3(view2, 1073741824, true);
                int iE2 = this.f13116u.e(view2);
                if (iE2 > i17) {
                    i17 = iE2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view3 = this.L[i21];
            if (this.f13116u.e(view3) != i17) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f13275b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iL3 = l3(cVar2.f13108e, cVar2.f13109f);
                if (this.f13114s == 1) {
                    iQ2 = RecyclerView.q.Q(iL3, 1073741824, i23, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    iQ = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i23, 1073741824);
                    iQ = RecyclerView.q.Q(iL3, 1073741824, i22, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    iQ2 = iMakeMeasureSpec;
                }
                t3(view3, iQ2, iQ, true);
            }
        }
        bVar.f13127a = i17;
        if (this.f13114s == 1) {
            if (cVar.f13136f == -1) {
                iF2 = cVar.f13132b;
                i13 = iF2 - i17;
            } else {
                i13 = cVar.f13132b;
                iF2 = i13 + i17;
            }
            iL0 = i13;
            iF = 0;
            iJ0 = 0;
        } else {
            if (cVar.f13136f == -1) {
                i12 = cVar.f13132b;
                i11 = i12 - i17;
            } else {
                i11 = cVar.f13132b;
                i12 = i11 + i17;
            }
            iJ0 = i11;
            iL0 = 0;
            iF = i12;
            iF2 = 0;
        }
        for (int i24 = 0; i24 < i15; i24++) {
            View view4 = this.L[i24];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.f13114s != 1) {
                iL0 = this.K[cVar3.f13108e] + l0();
                iF2 = this.f13116u.f(view4) + iL0;
            } else if (s2()) {
                iF = j0() + this.K[this.J - cVar3.f13108e];
                iJ0 = iF - this.f13116u.f(view4);
            } else {
                iJ0 = this.K[cVar3.f13108e] + j0();
                iF = this.f13116u.f(view4) + iJ0;
            }
            int i25 = iF2;
            int i26 = iL0;
            int i27 = iF;
            int i28 = iJ0;
            F0(view4, i28, i26, i27, i25);
            iF2 = i25;
            iJ0 = i28;
            iF = i27;
            iL0 = i26;
            if (cVar3.c() || cVar3.b()) {
                bVar.f13129c = true;
            }
            bVar.f13130d = view4.hasFocusable() | bVar.f13130d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    public void u3(int i11) {
        if (i11 == this.J) {
            return;
        }
        this.I = true;
        if (i11 >= 1) {
            this.J = i11;
            this.O.h();
            z1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void w2(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i11) {
        super.w2(xVar, c0Var, aVar, i11);
        v3();
        if (c0Var.b() > 0 && !c0Var.e()) {
            X2(xVar, c0Var, aVar, i11);
        }
        Y2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.c0 c0Var) {
        return this.Q ? V2(c0Var) : super.x(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.c0 c0Var) {
        return this.Q ? W2(c0Var) : super.y(c0Var);
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13109f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13108e = -1;
            this.f13109f = 0;
        }

        public int e() {
            return this.f13108e;
        }

        public int f() {
            return this.f13109f;
        }

        public c(int i11, int i12) {
            super(i11, i12);
            this.f13108e = -1;
            this.f13109f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13108e = -1;
            this.f13109f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13108e = -1;
            this.f13109f = 0;
        }
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(i11);
    }
}
