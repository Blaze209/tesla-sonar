package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.b0.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f[] f13295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    t f13296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    t f13297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f13299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    private final o f13300y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13294s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13301z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.Y1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f13307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f13308f;

        b() {
            c();
        }

        void a() {
            this.f13304b = this.f13305c ? StaggeredGridLayoutManager.this.f13296u.i() : StaggeredGridLayoutManager.this.f13296u.m();
        }

        void b(int i11) {
            if (this.f13305c) {
                this.f13304b = StaggeredGridLayoutManager.this.f13296u.i() - i11;
            } else {
                this.f13304b = StaggeredGridLayoutManager.this.f13296u.m() + i11;
            }
        }

        void c() {
            this.f13303a = -1;
            this.f13304b = Integer.MIN_VALUE;
            this.f13305c = false;
            this.f13306d = false;
            this.f13307e = false;
            int[] iArr = this.f13308f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f13308f;
            if (iArr == null || iArr.length < length) {
                this.f13308f = new int[StaggeredGridLayoutManager.this.f13295t.length];
            }
            for (int i11 = 0; i11 < length; i11++) {
                this.f13308f[i11] = fVarArr[i11].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f13310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f13311f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f13310e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f13332e;
        }

        public boolean f() {
            return this.f13311f;
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f13321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f13323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<d.a> f13324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13327j;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i11) {
                return new e[i11];
            }
        }

        public e() {
        }

        void a() {
            this.f13321d = null;
            this.f13320c = 0;
            this.f13318a = -1;
            this.f13319b = -1;
        }

        void b() {
            this.f13321d = null;
            this.f13320c = 0;
            this.f13322e = 0;
            this.f13323f = null;
            this.f13324g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f13318a);
            parcel.writeInt(this.f13319b);
            parcel.writeInt(this.f13320c);
            if (this.f13320c > 0) {
                parcel.writeIntArray(this.f13321d);
            }
            parcel.writeInt(this.f13322e);
            if (this.f13322e > 0) {
                parcel.writeIntArray(this.f13323f);
            }
            parcel.writeInt(this.f13325h ? 1 : 0);
            parcel.writeInt(this.f13326i ? 1 : 0);
            parcel.writeInt(this.f13327j ? 1 : 0);
            parcel.writeList(this.f13324g);
        }

        e(Parcel parcel) {
            this.f13318a = parcel.readInt();
            this.f13319b = parcel.readInt();
            int i11 = parcel.readInt();
            this.f13320c = i11;
            if (i11 > 0) {
                int[] iArr = new int[i11];
                this.f13321d = iArr;
                parcel.readIntArray(iArr);
            }
            int i12 = parcel.readInt();
            this.f13322e = i12;
            if (i12 > 0) {
                int[] iArr2 = new int[i12];
                this.f13323f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f13325h = parcel.readInt() == 1;
            this.f13326i = parcel.readInt() == 1;
            this.f13327j = parcel.readInt() == 1;
            this.f13324g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f13320c = eVar.f13320c;
            this.f13318a = eVar.f13318a;
            this.f13319b = eVar.f13319b;
            this.f13321d = eVar.f13321d;
            this.f13322e = eVar.f13322e;
            this.f13323f = eVar.f13323f;
            this.f13325h = eVar.f13325h;
            this.f13326i = eVar.f13326i;
            this.f13327j = eVar.f13327j;
            this.f13324g = eVar.f13324g;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<View> f13328a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13329b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13330c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13331d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f13332e;

        f(int i11) {
            this.f13332e = i11;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f13310e = this;
            this.f13328a.add(view);
            this.f13330c = Integer.MIN_VALUE;
            if (this.f13328a.size() == 1) {
                this.f13329b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13331d += StaggeredGridLayoutManager.this.f13296u.e(view);
            }
        }

        void b(boolean z11, int i11) {
            int iL = z11 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z11 || iL >= StaggeredGridLayoutManager.this.f13296u.i()) {
                if (z11 || iL <= StaggeredGridLayoutManager.this.f13296u.m()) {
                    if (i11 != Integer.MIN_VALUE) {
                        iL += i11;
                    }
                    this.f13330c = iL;
                    this.f13329b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f13328a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f13330c = StaggeredGridLayoutManager.this.f13296u.d(view);
            if (cVarN.f13311f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f13315b == 1) {
                this.f13330c += aVarF.a(this.f13332e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f13328a.get(0);
            c cVarN = n(view);
            this.f13329b = StaggeredGridLayoutManager.this.f13296u.g(view);
            if (cVarN.f13311f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f13315b == -1) {
                this.f13329b -= aVarF.a(this.f13332e);
            }
        }

        void e() {
            this.f13328a.clear();
            q();
            this.f13331d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f13301z ? i(this.f13328a.size() - 1, -1, true) : i(0, this.f13328a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f13301z ? i(0, this.f13328a.size(), true) : i(this.f13328a.size() - 1, -1, true);
        }

        int h(int i11, int i12, boolean z11, boolean z12, boolean z13) {
            int iM = StaggeredGridLayoutManager.this.f13296u.m();
            int i13 = StaggeredGridLayoutManager.this.f13296u.i();
            int i14 = i12 > i11 ? 1 : -1;
            while (i11 != i12) {
                View view = this.f13328a.get(i11);
                int iG = StaggeredGridLayoutManager.this.f13296u.g(view);
                int iD = StaggeredGridLayoutManager.this.f13296u.d(view);
                boolean z14 = false;
                boolean z15 = !z13 ? iG >= i13 : iG > i13;
                if (!z13 ? iD > iM : iD >= iM) {
                    z14 = true;
                }
                if (z15 && z14) {
                    if (z11 && z12) {
                        if (iG >= iM && iD <= i13) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                    } else {
                        if (z12) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                        if (iG < iM || iD > i13) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                    }
                }
                i11 += i14;
            }
            return -1;
        }

        int i(int i11, int i12, boolean z11) {
            return h(i11, i12, false, false, z11);
        }

        public int j() {
            return this.f13331d;
        }

        int k() {
            int i11 = this.f13330c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            c();
            return this.f13330c;
        }

        int l(int i11) {
            int i12 = this.f13330c;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f13328a.size() == 0) {
                return i11;
            }
            c();
            return this.f13330c;
        }

        public View m(int i11, int i12) {
            View view = null;
            if (i12 != -1) {
                int size = this.f13328a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f13328a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f13301z && staggeredGridLayoutManager.m0(view2) >= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f13301z && staggeredGridLayoutManager2.m0(view2) <= i11) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f13328a.size();
            int i13 = 0;
            while (i13 < size2) {
                View view3 = this.f13328a.get(i13);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f13301z && staggeredGridLayoutManager3.m0(view3) <= i11) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f13301z && staggeredGridLayoutManager4.m0(view3) >= i11) || !view3.hasFocusable()) {
                    break;
                }
                i13++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i11 = this.f13329b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            d();
            return this.f13329b;
        }

        int p(int i11) {
            int i12 = this.f13329b;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f13328a.size() == 0) {
                return i11;
            }
            d();
            return this.f13329b;
        }

        void q() {
            this.f13329b = Integer.MIN_VALUE;
            this.f13330c = Integer.MIN_VALUE;
        }

        void r(int i11) {
            int i12 = this.f13329b;
            if (i12 != Integer.MIN_VALUE) {
                this.f13329b = i12 + i11;
            }
            int i13 = this.f13330c;
            if (i13 != Integer.MIN_VALUE) {
                this.f13330c = i13 + i11;
            }
        }

        void s() {
            int size = this.f13328a.size();
            View viewRemove = this.f13328a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f13310e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f13331d -= StaggeredGridLayoutManager.this.f13296u.e(viewRemove);
            }
            if (size == 1) {
                this.f13329b = Integer.MIN_VALUE;
            }
            this.f13330c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f13328a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f13310e = null;
            if (this.f13328a.size() == 0) {
                this.f13330c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13331d -= StaggeredGridLayoutManager.this.f13296u.e(viewRemove);
            }
            this.f13329b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f13310e = this;
            this.f13328a.add(0, view);
            this.f13329b = Integer.MIN_VALUE;
            if (this.f13328a.size() == 1) {
                this.f13330c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13331d += StaggeredGridLayoutManager.this.f13296u.e(view);
            }
        }

        void v(int i11) {
            this.f13329b = i11;
            this.f13330c = i11;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView.q.d dVarN0 = RecyclerView.q.n0(context, attributeSet, i11, i12);
        N2(dVarN0.f13270a);
        P2(dVarN0.f13271b);
        O2(dVarN0.f13272c);
        this.f13300y = new o();
        g2();
    }

    private void A2(View view, int i11, int i12, boolean z11) {
        p(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iX2 = X2(i11, i13 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iX3 = X2(i12, i14 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z11 ? N1(view, iX2, iX3, cVar) : L1(view, iX2, iX3, cVar)) {
            view.measure(iX2, iX3);
        }
    }

    private void B2(View view, c cVar, boolean z11) {
        if (cVar.f13311f) {
            if (this.f13298w == 1) {
                A2(view, this.J, RecyclerView.q.Q(c0(), d0(), l0() + i0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z11);
                return;
            } else {
                A2(view, RecyclerView.q.Q(t0(), u0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z11);
                return;
            }
        }
        if (this.f13298w == 1) {
            A2(view, RecyclerView.q.Q(this.f13299x, u0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.Q(c0(), d0(), l0() + i0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z11);
        } else {
            A2(view, RecyclerView.q.Q(t0(), u0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.Q(this.f13299x, d0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void C2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11) {
        boolean z12;
        e eVar;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && c0Var.b() == 0) {
            q1(xVar);
            bVar.c();
            return;
        }
        boolean z13 = (bVar.f13307e && this.C == -1 && this.I == null) ? false : true;
        if (z13) {
            bVar.c();
            if (this.I != null) {
                T1(bVar);
            } else {
                K2();
                bVar.f13305c = this.A;
            }
            T2(c0Var, bVar);
            bVar.f13307e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f13305c != this.G || z2() != this.H)) {
            this.E.b();
            bVar.f13306d = true;
        }
        if (P() > 0 && ((eVar = this.I) == null || eVar.f13320c < 1)) {
            if (bVar.f13306d) {
                for (int i11 = 0; i11 < this.f13294s; i11++) {
                    this.f13295t[i11].e();
                    int i12 = bVar.f13304b;
                    if (i12 != Integer.MIN_VALUE) {
                        this.f13295t[i11].v(i12);
                    }
                }
            } else if (z13 || this.L.f13308f == null) {
                for (int i13 = 0; i13 < this.f13294s; i13++) {
                    this.f13295t[i13].b(this.A, bVar.f13304b);
                }
                this.L.d(this.f13295t);
            } else {
                for (int i14 = 0; i14 < this.f13294s; i14++) {
                    f fVar = this.f13295t[i14];
                    fVar.e();
                    fVar.v(this.L.f13308f[i14]);
                }
            }
        }
        C(xVar);
        this.f13300y.f13561a = false;
        this.M = false;
        V2(this.f13297v.n());
        U2(bVar.f13303a, c0Var);
        if (bVar.f13305c) {
            M2(-1);
            h2(xVar, this.f13300y, c0Var);
            M2(1);
            o oVar = this.f13300y;
            oVar.f13563c = bVar.f13303a + oVar.f13564d;
            h2(xVar, oVar, c0Var);
        } else {
            M2(1);
            h2(xVar, this.f13300y, c0Var);
            M2(-1);
            o oVar2 = this.f13300y;
            oVar2.f13563c = bVar.f13303a + oVar2.f13564d;
            h2(xVar, oVar2, c0Var);
        }
        J2();
        if (P() > 0) {
            if (this.A) {
                n2(xVar, c0Var, true);
                o2(xVar, c0Var, false);
            } else {
                o2(xVar, c0Var, true);
                n2(xVar, c0Var, false);
            }
        }
        if (z11 && !c0Var.e() && this.F != 0 && P() > 0 && (this.M || x2() != null)) {
            u1(this.P);
            z12 = Y1();
        }
        if (c0Var.e()) {
            this.L.c();
        }
        this.G = bVar.f13305c;
        this.H = z2();
        if (z12) {
            this.L.c();
            C2(xVar, c0Var, false);
        }
    }

    private boolean D2(int i11) {
        if (this.f13298w == 0) {
            return (i11 == -1) != this.A;
        }
        return ((i11 == -1) == this.A) == z2();
    }

    private void F2(View view) {
        for (int i11 = this.f13294s - 1; i11 >= 0; i11--) {
            this.f13295t[i11].u(view);
        }
    }

    private void G2(RecyclerView.x xVar, o oVar) {
        int iMin;
        if (!oVar.f13561a || oVar.f13569i) {
            return;
        }
        if (oVar.f13562b == 0) {
            if (oVar.f13565e == -1) {
                H2(xVar, oVar.f13567g);
                return;
            } else {
                I2(xVar, oVar.f13566f);
                return;
            }
        }
        if (oVar.f13565e == -1) {
            int i11 = oVar.f13566f;
            int iS2 = i11 - s2(i11);
            H2(xVar, iS2 < 0 ? oVar.f13567g : oVar.f13567g - Math.min(iS2, oVar.f13562b));
        } else {
            int iT2 = t2(oVar.f13567g) - oVar.f13567g;
            if (iT2 < 0) {
                iMin = oVar.f13566f;
            } else {
                iMin = Math.min(iT2, oVar.f13562b) + oVar.f13566f;
            }
            I2(xVar, iMin);
        }
    }

    private void H2(RecyclerView.x xVar, int i11) {
        for (int iP = P() - 1; iP >= 0; iP--) {
            View viewO = O(iP);
            if (this.f13296u.g(viewO) < i11 || this.f13296u.q(viewO) < i11) {
                return;
            }
            c cVar = (c) viewO.getLayoutParams();
            if (cVar.f13311f) {
                for (int i12 = 0; i12 < this.f13294s; i12++) {
                    if (this.f13295t[i12].f13328a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f13294s; i13++) {
                    this.f13295t[i13].s();
                }
            } else if (cVar.f13310e.f13328a.size() == 1) {
                return;
            } else {
                cVar.f13310e.s();
            }
            s1(viewO, xVar);
        }
    }

    private void I2(RecyclerView.x xVar, int i11) {
        while (P() > 0) {
            View viewO = O(0);
            if (this.f13296u.d(viewO) > i11 || this.f13296u.p(viewO) > i11) {
                return;
            }
            c cVar = (c) viewO.getLayoutParams();
            if (cVar.f13311f) {
                for (int i12 = 0; i12 < this.f13294s; i12++) {
                    if (this.f13295t[i12].f13328a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f13294s; i13++) {
                    this.f13295t[i13].t();
                }
            } else if (cVar.f13310e.f13328a.size() == 1) {
                return;
            } else {
                cVar.f13310e.t();
            }
            s1(viewO, xVar);
        }
    }

    private void J2() {
        if (this.f13297v.k() == 1073741824) {
            return;
        }
        int iP = P();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < iP; i11++) {
            View viewO = O(i11);
            float fE = this.f13297v.e(viewO);
            if (fE >= fMax) {
                if (((c) viewO.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f13294s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i12 = this.f13299x;
        int iRound = Math.round(fMax * this.f13294s);
        if (this.f13297v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f13297v.n());
        }
        V2(iRound);
        if (this.f13299x == i12) {
            return;
        }
        for (int i13 = 0; i13 < iP; i13++) {
            View viewO2 = O(i13);
            c cVar = (c) viewO2.getLayoutParams();
            if (!cVar.f13311f) {
                if (z2() && this.f13298w == 1) {
                    int i14 = this.f13294s;
                    int i15 = cVar.f13310e.f13332e;
                    viewO2.offsetLeftAndRight(((-((i14 - 1) - i15)) * this.f13299x) - ((-((i14 - 1) - i15)) * i12));
                } else {
                    int i16 = cVar.f13310e.f13332e;
                    int i17 = this.f13299x * i16;
                    int i18 = i16 * i12;
                    if (this.f13298w == 1) {
                        viewO2.offsetLeftAndRight(i17 - i18);
                    } else {
                        viewO2.offsetTopAndBottom(i17 - i18);
                    }
                }
            }
        }
    }

    private void K2() {
        if (this.f13298w == 1 || !z2()) {
            this.A = this.f13301z;
        } else {
            this.A = !this.f13301z;
        }
    }

    private void M2(int i11) {
        o oVar = this.f13300y;
        oVar.f13565e = i11;
        oVar.f13564d = this.A != (i11 == -1) ? -1 : 1;
    }

    private void Q2(int i11, int i12) {
        for (int i13 = 0; i13 < this.f13294s; i13++) {
            if (!this.f13295t[i13].f13328a.isEmpty()) {
                W2(this.f13295t[i13], i11, i12);
            }
        }
    }

    private boolean R2(RecyclerView.c0 c0Var, b bVar) {
        bVar.f13303a = this.G ? m2(c0Var.b()) : i2(c0Var.b());
        bVar.f13304b = Integer.MIN_VALUE;
        return true;
    }

    private void S1(View view) {
        for (int i11 = this.f13294s - 1; i11 >= 0; i11--) {
            this.f13295t[i11].a(view);
        }
    }

    private void T1(b bVar) {
        e eVar = this.I;
        int i11 = eVar.f13320c;
        if (i11 > 0) {
            if (i11 == this.f13294s) {
                for (int i12 = 0; i12 < this.f13294s; i12++) {
                    this.f13295t[i12].e();
                    e eVar2 = this.I;
                    int i13 = eVar2.f13321d[i12];
                    if (i13 != Integer.MIN_VALUE) {
                        i13 += eVar2.f13326i ? this.f13296u.i() : this.f13296u.m();
                    }
                    this.f13295t[i12].v(i13);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f13318a = eVar3.f13319b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f13327j;
        O2(eVar4.f13325h);
        K2();
        e eVar5 = this.I;
        int i14 = eVar5.f13318a;
        if (i14 != -1) {
            this.C = i14;
            bVar.f13305c = eVar5.f13326i;
        } else {
            bVar.f13305c = this.A;
        }
        if (eVar5.f13322e > 1) {
            d dVar = this.E;
            dVar.f13312a = eVar5.f13323f;
            dVar.f13313b = eVar5.f13324g;
        }
    }

    private void U2(int i11, RecyclerView.c0 c0Var) {
        int iN;
        int iN2;
        int iC;
        o oVar = this.f13300y;
        boolean z11 = false;
        oVar.f13562b = 0;
        oVar.f13563c = i11;
        if (!D0() || (iC = c0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i11)) {
                iN = this.f13296u.n();
                iN2 = 0;
            } else {
                iN2 = this.f13296u.n();
                iN = 0;
            }
        }
        if (S()) {
            this.f13300y.f13566f = this.f13296u.m() - iN2;
            this.f13300y.f13567g = this.f13296u.i() + iN;
        } else {
            this.f13300y.f13567g = this.f13296u.h() + iN;
            this.f13300y.f13566f = -iN2;
        }
        o oVar2 = this.f13300y;
        oVar2.f13568h = false;
        oVar2.f13561a = true;
        if (this.f13296u.k() == 0 && this.f13296u.h() == 0) {
            z11 = true;
        }
        oVar2.f13569i = z11;
    }

    private void W1(View view, c cVar, o oVar) {
        if (oVar.f13565e == 1) {
            if (cVar.f13311f) {
                S1(view);
                return;
            } else {
                cVar.f13310e.a(view);
                return;
            }
        }
        if (cVar.f13311f) {
            F2(view);
        } else {
            cVar.f13310e.u(view);
        }
    }

    private void W2(f fVar, int i11, int i12) {
        int iJ = fVar.j();
        if (i11 == -1) {
            if (fVar.o() + iJ <= i12) {
                this.B.set(fVar.f13332e, false);
            }
        } else if (fVar.k() - iJ >= i12) {
            this.B.set(fVar.f13332e, false);
        }
    }

    private int X1(int i11) {
        if (P() == 0) {
            return this.A ? 1 : -1;
        }
        return (i11 < p2()) != this.A ? -1 : 1;
    }

    private int X2(int i11, int i12, int i13) {
        int mode;
        return (!(i12 == 0 && i13 == 0) && ((mode = View.MeasureSpec.getMode(i11)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    private boolean Z1(f fVar) {
        boolean z11;
        if (!this.A) {
            if (fVar.o() > this.f13296u.m()) {
                z11 = fVar.n(fVar.f13328a.get(0)).f13311f;
                return !z11;
            }
            return false;
        }
        if (fVar.k() < this.f13296u.i()) {
            ArrayList<View> arrayList = fVar.f13328a;
            z11 = fVar.n(arrayList.get(arrayList.size() - 1)).f13311f;
            return !z11;
        }
        return false;
    }

    private int a2(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        return w.a(c0Var, this.f13296u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int b2(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        return w.b(c0Var, this.f13296u, k2(!this.N), j2(!this.N), this, this.N, this.A);
    }

    private int c2(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        return w.c(c0Var, this.f13296u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int d2(int i11) {
        if (i11 == 1) {
            return (this.f13298w != 1 && z2()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.f13298w != 1 && z2()) ? -1 : 1;
        }
        if (i11 == 17) {
            return this.f13298w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return this.f13298w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 != 66) {
            return (i11 == 130 && this.f13298w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f13298w == 0 ? 1 : Integer.MIN_VALUE;
    }

    private d.a e2(int i11) {
        d.a aVar = new d.a();
        aVar.f13316c = new int[this.f13294s];
        for (int i12 = 0; i12 < this.f13294s; i12++) {
            aVar.f13316c[i12] = i11 - this.f13295t[i12].l(i11);
        }
        return aVar;
    }

    private d.a f2(int i11) {
        d.a aVar = new d.a();
        aVar.f13316c = new int[this.f13294s];
        for (int i12 = 0; i12 < this.f13294s; i12++) {
            aVar.f13316c[i12] = this.f13295t[i12].p(i11) - i11;
        }
        return aVar;
    }

    private void g2() {
        this.f13296u = t.b(this, this.f13298w);
        this.f13297v = t.b(this, 1 - this.f13298w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int h2(RecyclerView.x xVar, o oVar, RecyclerView.c0 c0Var) {
        int i11;
        int iR2;
        f fVarV2;
        int iU2;
        int iE;
        int iM;
        int iE2;
        ?? r11;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r12 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.f13294s, true);
        if (staggeredGridLayoutManager.f13300y.f13569i) {
            i11 = oVar.f13565e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i11 = oVar.f13565e == 1 ? oVar.f13567g + oVar.f13562b : oVar.f13566f - oVar.f13562b;
        }
        int i12 = i11;
        staggeredGridLayoutManager.Q2(oVar.f13565e, i12);
        int i13 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.f13296u.i() : staggeredGridLayoutManager.f13296u.m();
        boolean z11 = false;
        ?? r13 = staggeredGridLayoutManager;
        while (oVar.a(c0Var) && (r13.f13300y.f13569i || !r13.B.isEmpty())) {
            View viewB = oVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r13.E.g(iA);
            ?? r14 = iG == -1 ? 1 : r12;
            if (r14 != 0) {
                fVarV2 = cVar.f13311f ? r13.f13295t[r12] : r13.v2(oVar);
                r13.E.n(iA, fVarV2);
            } else {
                fVarV2 = r13.f13295t[iG];
            }
            f fVar = fVarV2;
            cVar.f13310e = fVar;
            if (oVar.f13565e == 1) {
                r13.j(viewB);
            } else {
                r13.k(viewB, r12);
            }
            r13.B2(viewB, cVar, r12);
            if (oVar.f13565e == 1) {
                iE = cVar.f13311f ? r13.r2(i13) : fVar.l(i13);
                iU2 = r13.f13296u.e(viewB) + iE;
                if (r14 != 0 && cVar.f13311f) {
                    d.a aVarE2 = r13.e2(iE);
                    aVarE2.f13315b = -1;
                    aVarE2.f13314a = iA;
                    r13.E.a(aVarE2);
                }
            } else {
                iU2 = cVar.f13311f ? r13.u2(i13) : fVar.p(i13);
                iE = iU2 - r13.f13296u.e(viewB);
                if (r14 != 0 && cVar.f13311f) {
                    d.a aVarF2 = r13.f2(iU2);
                    aVarF2.f13315b = 1;
                    aVarF2.f13314a = iA;
                    r13.E.a(aVarF2);
                }
            }
            if (cVar.f13311f && oVar.f13564d == -1) {
                if (r14 != 0) {
                    r13.M = true;
                } else {
                    if (!(oVar.f13565e == 1 ? r13.U1() : r13.V1())) {
                        d.a aVarF = r13.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f13317d = true;
                        }
                        r13.M = true;
                    }
                }
            }
            r13.W1(viewB, cVar, oVar);
            if (r13.z2() && r13.f13298w == 1) {
                iE2 = cVar.f13311f ? r13.f13297v.i() : r13.f13297v.i() - (((r13.f13294s - 1) - fVar.f13332e) * r13.f13299x);
                iM = iE2 - r13.f13297v.e(viewB);
            } else {
                iM = cVar.f13311f ? r13.f13297v.m() : (fVar.f13332e * r13.f13299x) + r13.f13297v.m();
                iE2 = r13.f13297v.e(viewB) + iM;
            }
            int i14 = iE2;
            int i15 = iM;
            if (r13.f13298w == 1) {
                r13.F0(viewB, i15, iE, i14, iU2);
                r11 = this;
            } else {
                r13.F0(viewB, iE, i15, iU2, i14);
                r11 = r13;
            }
            if (cVar.f13311f) {
                r11.Q2(r11.f13300y.f13565e, i12);
            } else {
                r11.W2(fVar, r11.f13300y.f13565e, i12);
            }
            r11.G2(xVar, r11.f13300y);
            if (r11.f13300y.f13568h && viewB.hasFocusable()) {
                if (cVar.f13311f) {
                    r11.B.clear();
                } else {
                    r11.B.set(fVar.f13332e, false);
                }
            }
            z11 = true;
            r12 = 0;
            r13 = r11;
        }
        if (!z11) {
            r13.G2(xVar, r13.f13300y);
        }
        if (r13.f13300y.f13565e == -1) {
            iR2 = r13.f13296u.m() - r13.u2(r13.f13296u.m());
        } else {
            iR2 = r13.r2(r13.f13296u.i()) - r13.f13296u.i();
        }
        if (iR2 > 0) {
            return Math.min(oVar.f13562b, iR2);
        }
        return 0;
    }

    private int i2(int i11) {
        int iP = P();
        for (int i12 = 0; i12 < iP; i12++) {
            int iM0 = m0(O(i12));
            if (iM0 >= 0 && iM0 < i11) {
                return iM0;
            }
        }
        return 0;
    }

    private int m2(int i11) {
        for (int iP = P() - 1; iP >= 0; iP--) {
            int iM0 = m0(O(iP));
            if (iM0 >= 0 && iM0 < i11) {
                return iM0;
            }
        }
        return 0;
    }

    private void n2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11) {
        int i11;
        int iR2 = r2(Integer.MIN_VALUE);
        if (iR2 != Integer.MIN_VALUE && (i11 = this.f13296u.i() - iR2) > 0) {
            int i12 = i11 - (-L2(-i11, xVar, c0Var));
            if (!z11 || i12 <= 0) {
                return;
            }
            this.f13296u.r(i12);
        }
    }

    private void o2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11) {
        int iM;
        int iU2 = u2(Integer.MAX_VALUE);
        if (iU2 != Integer.MAX_VALUE && (iM = iU2 - this.f13296u.m()) > 0) {
            int iL2 = iM - L2(iM, xVar, c0Var);
            if (!z11 || iL2 <= 0) {
                return;
            }
            this.f13296u.r(-iL2);
        }
    }

    private int r2(int i11) {
        int iL = this.f13295t[0].l(i11);
        for (int i12 = 1; i12 < this.f13294s; i12++) {
            int iL2 = this.f13295t[i12].l(i11);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i11) {
        int iP = this.f13295t[0].p(i11);
        for (int i12 = 1; i12 < this.f13294s; i12++) {
            int iP2 = this.f13295t[i12].p(i11);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int t2(int i11) {
        int iL = this.f13295t[0].l(i11);
        for (int i12 = 1; i12 < this.f13294s; i12++) {
            int iL2 = this.f13295t[i12].l(i11);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int u2(int i11) {
        int iP = this.f13295t[0].p(i11);
        for (int i12 = 1; i12 < this.f13294s; i12++) {
            int iP2 = this.f13295t[i12].p(i11);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f v2(o oVar) {
        int i11;
        int i12;
        int i13;
        if (D2(oVar.f13565e)) {
            i12 = this.f13294s - 1;
            i11 = -1;
            i13 = -1;
        } else {
            i11 = this.f13294s;
            i12 = 0;
            i13 = 1;
        }
        f fVar = null;
        if (oVar.f13565e == 1) {
            int iM = this.f13296u.m();
            int i14 = Integer.MAX_VALUE;
            while (i12 != i11) {
                f fVar2 = this.f13295t[i12];
                int iL = fVar2.l(iM);
                if (iL < i14) {
                    fVar = fVar2;
                    i14 = iL;
                }
                i12 += i13;
            }
            return fVar;
        }
        int i15 = this.f13296u.i();
        int i16 = Integer.MIN_VALUE;
        while (i12 != i11) {
            f fVar3 = this.f13295t[i12];
            int iP = fVar3.p(i15);
            if (iP > i16) {
                fVar = fVar3;
                i16 = iP;
            }
            i12 += i13;
        }
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void w2(int i11, int i12, int i13) {
        int i14;
        int i15;
        int iQ2;
        int iQ3 = this.A ? q2() : p2();
        if (i13 == 8) {
            if (i11 < i12) {
                i14 = i12 + 1;
            } else {
                i14 = i11 + 1;
                i15 = i12;
            }
            this.E.h(i15);
            if (i13 != 1) {
                this.E.j(i11, i12);
            } else if (i13 != 2) {
                this.E.k(i11, i12);
            } else if (i13 == 8) {
                this.E.k(i11, 1);
                this.E.j(i12, 1);
            }
            if (i14 <= iQ3) {
                return;
            }
            if (this.A) {
                iQ2 = p2();
            } else {
                iQ2 = q2();
            }
            if (i15 <= iQ2) {
                z1();
            }
        }
        i14 = i11 + i12;
        i15 = i11;
        this.E.h(i15);
        if (i13 != 1) {
            this.E.j(i11, i12);
        } else if (i13 != 2) {
            this.E.k(i11, i12);
        } else if (i13 == 8) {
            this.E.k(i11, 1);
            this.E.j(i12, 1);
        }
        if (i14 <= iQ3) {
            return;
        }
        if (this.A) {
            iQ2 = p2();
        } else {
            iQ2 = q2();
        }
        if (i15 <= iQ2) {
            z1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.c0 c0Var) {
        return b2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B(RecyclerView.c0 c0Var) {
        return c2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B0() {
        return this.f13301z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int C1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return L2(i11, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void D1(int i11) {
        e eVar = this.I;
        if (eVar != null && eVar.f13318a != i11) {
            eVar.a();
        }
        this.C = i11;
        this.D = Integer.MIN_VALUE;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int E1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return L2(i11, xVar, c0Var);
    }

    void E2(int i11, RecyclerView.c0 c0Var) {
        int iP2;
        int i12;
        if (i11 > 0) {
            iP2 = q2();
            i12 = 1;
        } else {
            iP2 = p2();
            i12 = -1;
        }
        this.f13300y.f13561a = true;
        U2(iP2, c0Var);
        M2(i12);
        o oVar = this.f13300y;
        oVar.f13563c = iP2 + oVar.f13564d;
        oVar.f13562b = Math.abs(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i11) {
        super.I0(i11);
        for (int i12 = 0; i12 < this.f13294s; i12++) {
            this.f13295t[i12].r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I1(Rect rect, int i11, int i12) {
        int iT;
        int iT2;
        int iJ0 = j0() + k0();
        int iL0 = l0() + i0();
        if (this.f13298w == 1) {
            iT2 = RecyclerView.q.t(i12, rect.height() + iL0, g0());
            iT = RecyclerView.q.t(i11, (this.f13299x * this.f13294s) + iJ0, h0());
        } else {
            iT = RecyclerView.q.t(i11, rect.width() + iJ0, h0());
            iT2 = RecyclerView.q.t(i12, (this.f13299x * this.f13294s) + iL0, g0());
        }
        H1(iT, iT2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J() {
        return this.f13298w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void J0(int i11) {
        super.J0(i11);
        for (int i12 = 0; i12 < this.f13294s; i12++) {
            this.f13295t[i12].r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void K0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i11 = 0; i11 < this.f13294s; i11++) {
            this.f13295t[i11].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int L2(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (P() == 0 || i11 == 0) {
            return 0;
        }
        E2(i11, c0Var);
        int iH2 = h2(xVar, this.f13300y, c0Var);
        if (this.f13300y.f13562b >= iH2) {
            i11 = i11 < 0 ? -iH2 : iH2;
        }
        this.f13296u.r(-i11);
        this.G = this.A;
        o oVar = this.f13300y;
        oVar.f13562b = 0;
        G2(xVar, oVar);
        return i11;
    }

    public void N2(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        m(null);
        if (i11 == this.f13298w) {
            return;
        }
        this.f13298w = i11;
        t tVar = this.f13296u;
        this.f13296u = this.f13297v;
        this.f13297v = tVar;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void O0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.O0(recyclerView, xVar);
        u1(this.P);
        for (int i11 = 0; i11 < this.f13294s; i11++) {
            this.f13295t[i11].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void O1(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i11) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i11);
        P1(pVar);
    }

    public void O2(boolean z11) {
        m(null);
        e eVar = this.I;
        if (eVar != null && eVar.f13325h != z11) {
            eVar.f13325h = z11;
        }
        this.f13301z = z11;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View P0(View view, int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        View viewH;
        View viewM;
        if (P() == 0 || (viewH = H(view)) == null) {
            return null;
        }
        K2();
        int iD2 = d2(i11);
        if (iD2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewH.getLayoutParams();
        boolean z11 = cVar.f13311f;
        f fVar = cVar.f13310e;
        int iQ2 = iD2 == 1 ? q2() : p2();
        U2(iQ2, c0Var);
        M2(iD2);
        o oVar = this.f13300y;
        oVar.f13563c = oVar.f13564d + iQ2;
        oVar.f13562b = (int) (this.f13296u.n() * 0.33333334f);
        o oVar2 = this.f13300y;
        oVar2.f13568h = true;
        oVar2.f13561a = false;
        h2(xVar, oVar2, c0Var);
        this.G = this.A;
        if (!z11 && (viewM = fVar.m(iQ2, iD2)) != null && viewM != viewH) {
            return viewM;
        }
        if (D2(iD2)) {
            for (int i12 = this.f13294s - 1; i12 >= 0; i12--) {
                View viewM2 = this.f13295t[i12].m(iQ2, iD2);
                if (viewM2 != null && viewM2 != viewH) {
                    return viewM2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f13294s; i13++) {
                View viewM3 = this.f13295t[i13].m(iQ2, iD2);
                if (viewM3 != null && viewM3 != viewH) {
                    return viewM3;
                }
            }
        }
        boolean z12 = (this.f13301z ^ true) == (iD2 == -1);
        if (!z11) {
            View viewI = I(z12 ? fVar.f() : fVar.g());
            if (viewI != null && viewI != viewH) {
                return viewI;
            }
        }
        if (D2(iD2)) {
            for (int i14 = this.f13294s - 1; i14 >= 0; i14--) {
                if (i14 != fVar.f13332e) {
                    View viewI2 = I(z12 ? this.f13295t[i14].f() : this.f13295t[i14].g());
                    if (viewI2 != null && viewI2 != viewH) {
                        return viewI2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f13294s; i15++) {
                View viewI3 = I(z12 ? this.f13295t[i15].f() : this.f13295t[i15].g());
                if (viewI3 != null && viewI3 != viewH) {
                    return viewI3;
                }
            }
        }
        return null;
    }

    public void P2(int i11) {
        m(null);
        if (i11 != this.f13294s) {
            y2();
            this.f13294s = i11;
            this.B = new BitSet(this.f13294s);
            this.f13295t = new f[this.f13294s];
            for (int i12 = 0; i12 < this.f13294s; i12++) {
                this.f13295t[i12] = new f(i12);
            }
            z1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (P() > 0) {
            View viewK2 = k2(false);
            View viewJ2 = j2(false);
            if (viewK2 == null || viewJ2 == null) {
                return;
            }
            int iM0 = m0(viewK2);
            int iM1 = m0(viewJ2);
            if (iM0 < iM1) {
                accessibilityEvent.setFromIndex(iM0);
                accessibilityEvent.setToIndex(iM1);
            } else {
                accessibilityEvent.setFromIndex(iM1);
                accessibilityEvent.setToIndex(iM0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean R1() {
        return this.I == null;
    }

    boolean S2(RecyclerView.c0 c0Var, b bVar) {
        int i11;
        if (!c0Var.e() && (i11 = this.C) != -1) {
            if (i11 >= 0 && i11 < c0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f13318a == -1 || eVar.f13320c < 1) {
                    View viewI = I(this.C);
                    if (viewI != null) {
                        bVar.f13303a = this.A ? q2() : p2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f13305c) {
                                bVar.f13304b = (this.f13296u.i() - this.D) - this.f13296u.d(viewI);
                            } else {
                                bVar.f13304b = (this.f13296u.m() + this.D) - this.f13296u.g(viewI);
                            }
                            return true;
                        }
                        if (this.f13296u.e(viewI) > this.f13296u.n()) {
                            bVar.f13304b = bVar.f13305c ? this.f13296u.i() : this.f13296u.m();
                            return true;
                        }
                        int iG = this.f13296u.g(viewI) - this.f13296u.m();
                        if (iG < 0) {
                            bVar.f13304b = -iG;
                            return true;
                        }
                        int i12 = this.f13296u.i() - this.f13296u.d(viewI);
                        if (i12 < 0) {
                            bVar.f13304b = i12;
                            return true;
                        }
                        bVar.f13304b = Integer.MIN_VALUE;
                    } else {
                        int i13 = this.C;
                        bVar.f13303a = i13;
                        int i14 = this.D;
                        if (i14 == Integer.MIN_VALUE) {
                            bVar.f13305c = X1(i13) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i14);
                        }
                        bVar.f13306d = true;
                    }
                } else {
                    bVar.f13304b = Integer.MIN_VALUE;
                    bVar.f13303a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int T(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        if (this.f13298w == 1) {
            return Math.min(this.f13294s, c0Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void T0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.T0(xVar, c0Var, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.t0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    void T2(RecyclerView.c0 c0Var, b bVar) {
        if (S2(c0Var, bVar) || R2(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f13303a = 0;
    }

    boolean U1() {
        int iL = this.f13295t[0].l(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f13294s; i11++) {
            if (this.f13295t[i11].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.U0(view, accessibilityNodeInfoCompat);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f13298w == 0) {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(cVar.e(), cVar.f13311f ? this.f13294s : 1, -1, -1, false, false));
        } else {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(-1, -1, cVar.e(), cVar.f13311f ? this.f13294s : 1, false, false));
        }
    }

    boolean V1() {
        int iP = this.f13295t[0].p(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f13294s; i11++) {
            if (this.f13295t[i11].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void V2(int i11) {
        this.f13299x = i11 / this.f13294s;
        this.J = View.MeasureSpec.makeMeasureSpec(i11, this.f13297v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView, int i11, int i12) {
        w2(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView) {
        this.E.b();
        z1();
    }

    boolean Y1() {
        int iP2;
        int iQ2;
        if (P() == 0 || this.F == 0 || !w0()) {
            return false;
        }
        if (this.A) {
            iP2 = q2();
            iQ2 = p2();
        } else {
            iP2 = p2();
            iQ2 = q2();
        }
        if (iP2 == 0 && x2() != null) {
            this.E.b();
            A1();
            z1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i11 = this.A ? -1 : 1;
        int i12 = iQ2 + 1;
        d.a aVarE = this.E.e(iP2, i12, i11, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i12);
            return false;
        }
        d.a aVarE2 = this.E.e(iP2, aVarE.f13314a, i11 * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.f13314a);
        } else {
            this.E.d(aVarE2.f13314a + 1);
        }
        A1();
        z1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i11, int i12, int i13) {
        w2(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a1(RecyclerView recyclerView, int i11, int i12) {
        w2(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF c(int i11) {
        int iX1 = X1(i11);
        PointF pointF = new PointF();
        if (iX1 == 0) {
            return null;
        }
        if (this.f13298w == 0) {
            pointF.x = iX1;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
            return pointF;
        }
        pointF.x = BitmapDescriptorFactory.HUE_RED;
        pointF.y = iX1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView recyclerView, int i11, int i12, Object obj) {
        w2(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        C2(xVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView.c0 c0Var) {
        super.e1(c0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void i1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.b();
            }
            z1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable j1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f13325h = this.f13301z;
        eVar.f13326i = this.G;
        eVar.f13327j = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f13312a) == null) {
            eVar.f13322e = 0;
        } else {
            eVar.f13323f = iArr;
            eVar.f13322e = iArr.length;
            eVar.f13324g = dVar.f13313b;
        }
        if (P() <= 0) {
            eVar.f13318a = -1;
            eVar.f13319b = -1;
            eVar.f13320c = 0;
            return eVar;
        }
        eVar.f13318a = this.G ? q2() : p2();
        eVar.f13319b = l2();
        int i11 = this.f13294s;
        eVar.f13320c = i11;
        eVar.f13321d = new int[i11];
        for (int i12 = 0; i12 < this.f13294s; i12++) {
            if (this.G) {
                iP = this.f13295t[i12].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f13296u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f13295t[i12].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f13296u.m();
                    iP -= iM;
                }
            }
            eVar.f13321d[i12] = iP;
        }
        return eVar;
    }

    View j2(boolean z11) {
        int iM = this.f13296u.m();
        int i11 = this.f13296u.i();
        View view = null;
        for (int iP = P() - 1; iP >= 0; iP--) {
            View viewO = O(iP);
            int iG = this.f13296u.g(viewO);
            int iD = this.f13296u.d(viewO);
            if (iD > iM && iG < i11) {
                if (iD <= i11 || !z11) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void k1(int i11) {
        if (i11 == 0) {
            Y1();
        }
    }

    View k2(boolean z11) {
        int iM = this.f13296u.m();
        int i11 = this.f13296u.i();
        int iP = P();
        View view = null;
        for (int i12 = 0; i12 < iP; i12++) {
            View viewO = O(i12);
            int iG = this.f13296u.g(viewO);
            if (this.f13296u.d(viewO) > iM && iG < i11) {
                if (iG >= iM || !z11) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    int l2() {
        View viewJ2 = this.A ? j2(true) : k2(true);
        if (viewJ2 == null) {
            return -1;
        }
        return m0(viewJ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void m(String str) {
        if (this.I == null) {
            super.m(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int p0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        if (this.f13298w == 0) {
            return Math.min(this.f13294s, c0Var.b());
        }
        return -1;
    }

    int p2() {
        if (P() == 0) {
            return 0;
        }
        return m0(O(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f13298w == 0;
    }

    int q2() {
        int iP = P();
        if (iP == 0) {
            return 0;
        }
        return m0(O(iP - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r() {
        return this.f13298w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean s(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void u(int i11, int i12, RecyclerView.c0 c0Var, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f13298w != 0) {
            i11 = i12;
        }
        if (P() == 0 || i11 == 0) {
            return;
        }
        E2(i11, c0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f13294s) {
            this.O = new int[this.f13294s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f13294s; i14++) {
            o oVar = this.f13300y;
            if (oVar.f13564d == -1) {
                iL = oVar.f13566f;
                iP = this.f13295t[i14].p(iL);
            } else {
                iL = this.f13295t[i14].l(oVar.f13567g);
                iP = this.f13300y.f13567g;
            }
            int i15 = iL - iP;
            if (i15 >= 0) {
                this.O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f13300y.a(c0Var); i16++) {
            cVar.a(this.f13300y.f13563c, this.O[i16]);
            o oVar2 = this.f13300y;
            oVar2.f13563c += oVar2.f13564d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.c0 c0Var) {
        return a2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.c0 c0Var) {
        return b2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x0() {
        return this.F != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    View x2() {
        int i11;
        View viewO;
        int iG;
        int iG2;
        boolean z11;
        boolean z12;
        int iD;
        int iD2;
        int iP = P();
        int i12 = iP - 1;
        BitSet bitSet = new BitSet(this.f13294s);
        bitSet.set(0, this.f13294s, true);
        byte b11 = (this.f13298w == 1 && z2()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            iP = -1;
        } else {
            i12 = 0;
        }
        int i13 = i12 < iP ? 1 : -1;
        while (i12 != iP) {
            View viewO2 = O(i12);
            c cVar = (c) viewO2.getLayoutParams();
            if (!bitSet.get(cVar.f13310e.f13332e)) {
                if (!cVar.f13311f && (i11 = i12 + i13) != iP) {
                    viewO = O(i11);
                    if (this.A) {
                        iD = this.f13296u.d(viewO2);
                        iD2 = this.f13296u.d(viewO);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f13310e.f13332e - ((c) viewO.getLayoutParams()).f13310e.f13332e < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f13296u.g(viewO2);
                        iG2 = this.f13296u.g(viewO);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f13310e.f13332e - ((c) viewO.getLayoutParams()).f13310e.f13332e < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i12 += i13;
            } else if (!Z1(cVar.f13310e)) {
                bitSet.clear(cVar.f13310e.f13332e);
                if (!cVar.f13311f) {
                    viewO = O(i11);
                    if (this.A) {
                        iD = this.f13296u.d(viewO2);
                        iD2 = this.f13296u.d(viewO);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f13310e.f13332e - ((c) viewO.getLayoutParams()).f13310e.f13332e < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f13296u.g(viewO2);
                        iG2 = this.f13296u.g(viewO);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f13310e.f13332e - ((c) viewO.getLayoutParams()).f13310e.f13332e < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i12 += i13;
            }
            return viewO2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.c0 c0Var) {
        return c2(c0Var);
    }

    public void y2() {
        this.E.b();
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.c0 c0Var) {
        return a2(c0Var);
    }

    boolean z2() {
        return e0() == 1;
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f13312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f13313b;

        d() {
        }

        private int i(int i11) {
            if (this.f13313b == null) {
                return -1;
            }
            a aVarF = f(i11);
            if (aVarF != null) {
                this.f13313b.remove(aVarF);
            }
            int size = this.f13313b.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                if (this.f13313b.get(i12).f13314a >= i11) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return -1;
            }
            a aVar = this.f13313b.get(i12);
            this.f13313b.remove(i12);
            return aVar.f13314a;
        }

        private void l(int i11, int i12) {
            List<a> list = this.f13313b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13313b.get(size);
                int i13 = aVar.f13314a;
                if (i13 >= i11) {
                    aVar.f13314a = i13 + i12;
                }
            }
        }

        private void m(int i11, int i12) {
            List<a> list = this.f13313b;
            if (list == null) {
                return;
            }
            int i13 = i11 + i12;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13313b.get(size);
                int i14 = aVar.f13314a;
                if (i14 >= i11) {
                    if (i14 < i13) {
                        this.f13313b.remove(size);
                    } else {
                        aVar.f13314a = i14 - i12;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f13313b == null) {
                this.f13313b = new ArrayList();
            }
            int size = this.f13313b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar2 = this.f13313b.get(i11);
                if (aVar2.f13314a == aVar.f13314a) {
                    this.f13313b.remove(i11);
                }
                if (aVar2.f13314a >= aVar.f13314a) {
                    this.f13313b.add(i11, aVar);
                    return;
                }
            }
            this.f13313b.add(aVar);
        }

        void b() {
            int[] iArr = this.f13312a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13313b = null;
        }

        void c(int i11) {
            int[] iArr = this.f13312a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i11, 10) + 1];
                this.f13312a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[o(i11)];
                this.f13312a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f13312a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i11) {
            List<a> list = this.f13313b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f13313b.get(size).f13314a >= i11) {
                        this.f13313b.remove(size);
                    }
                }
            }
            return h(i11);
        }

        public a e(int i11, int i12, int i13, boolean z11) {
            List<a> list = this.f13313b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                a aVar = this.f13313b.get(i14);
                int i15 = aVar.f13314a;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || aVar.f13315b == i13 || (z11 && aVar.f13317d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i11) {
            List<a> list = this.f13313b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13313b.get(size);
                if (aVar.f13314a == i11) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i11) {
            int[] iArr = this.f13312a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }

        int h(int i11) {
            int[] iArr = this.f13312a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                int[] iArr2 = this.f13312a;
                Arrays.fill(iArr2, i11, iArr2.length, -1);
                return this.f13312a.length;
            }
            int iMin = Math.min(i12 + 1, this.f13312a.length);
            Arrays.fill(this.f13312a, i11, iMin, -1);
            return iMin;
        }

        void j(int i11, int i12) {
            int[] iArr = this.f13312a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            c(i13);
            int[] iArr2 = this.f13312a;
            System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
            Arrays.fill(this.f13312a, i11, i13, -1);
            l(i11, i12);
        }

        void k(int i11, int i12) {
            int[] iArr = this.f13312a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            c(i13);
            int[] iArr2 = this.f13312a;
            System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
            int[] iArr3 = this.f13312a;
            Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
            m(i11, i12);
        }

        void n(int i11, f fVar) {
            c(i11);
            this.f13312a[i11] = fVar.f13332e;
        }

        int o(int i11) {
            int length = this.f13312a.length;
            while (length <= i11) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0217a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f13315b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f13316c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f13317d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0217a implements Parcelable.Creator<a> {
                C0217a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            a(Parcel parcel) {
                this.f13314a = parcel.readInt();
                this.f13315b = parcel.readInt();
                this.f13317d = parcel.readInt() == 1;
                int i11 = parcel.readInt();
                if (i11 > 0) {
                    int[] iArr = new int[i11];
                    this.f13316c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i11) {
                int[] iArr = this.f13316c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i11];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f13314a + ", mGapDir=" + this.f13315b + ", mHasUnwantedGapAfter=" + this.f13317d + ", mGapPerSpan=" + Arrays.toString(this.f13316c) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f13314a);
                parcel.writeInt(this.f13315b);
                parcel.writeInt(this.f13317d ? 1 : 0);
                int[] iArr = this.f13316c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f13316c);
                }
            }

            a() {
            }
        }
    }
}
