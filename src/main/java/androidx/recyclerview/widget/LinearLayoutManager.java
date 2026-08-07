package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutManager extends RecyclerView.q implements l.i, RecyclerView.b0.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f13114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f13115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    t f13116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f13119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f13120y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f13121z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t f13122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f13126e;

        a() {
            e();
        }

        void a() {
            this.f13124c = this.f13125d ? this.f13122a.i() : this.f13122a.m();
        }

        public void b(View view, int i11) {
            if (this.f13125d) {
                this.f13124c = this.f13122a.d(view) + this.f13122a.o();
            } else {
                this.f13124c = this.f13122a.g(view);
            }
            this.f13123b = i11;
        }

        public void c(View view, int i11) {
            int iO = this.f13122a.o();
            if (iO >= 0) {
                b(view, i11);
                return;
            }
            this.f13123b = i11;
            if (this.f13125d) {
                int i12 = (this.f13122a.i() - iO) - this.f13122a.d(view);
                this.f13124c = this.f13122a.i() - i12;
                if (i12 > 0) {
                    int iE = this.f13124c - this.f13122a.e(view);
                    int iM = this.f13122a.m();
                    int iMin = iE - (iM + Math.min(this.f13122a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f13124c += Math.min(i12, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f13122a.g(view);
            int iM2 = iG - this.f13122a.m();
            this.f13124c = iG;
            if (iM2 > 0) {
                int i13 = (this.f13122a.i() - Math.min(0, (this.f13122a.i() - iO) - this.f13122a.d(view))) - (iG + this.f13122a.e(view));
                if (i13 < 0) {
                    this.f13124c -= Math.min(iM2, -i13);
                }
            }
        }

        boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < c0Var.b();
        }

        void e() {
            this.f13123b = -1;
            this.f13124c = Integer.MIN_VALUE;
            this.f13125d = false;
            this.f13126e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f13123b + ", mCoordinate=" + this.f13124c + ", mLayoutFromEnd=" + this.f13125d + ", mValid=" + this.f13126e + CoreConstants.CURLY_RIGHT;
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13130d;

        protected b() {
        }

        void a() {
            this.f13127a = 0;
            this.f13128b = false;
            this.f13129c = false;
            this.f13130d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13137g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f13141k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f13143m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f13131a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13138h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13139i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13140j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<RecyclerView.g0> f13142l = null;

        c() {
        }

        private View e() {
            int size = this.f13142l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = this.f13142l.get(i11).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f13134d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f13134d = -1;
            } else {
                this.f13134d = ((RecyclerView.r) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.c0 c0Var) {
            int i11 = this.f13134d;
            return i11 >= 0 && i11 < c0Var.b();
        }

        View d(RecyclerView.x xVar) {
            if (this.f13142l != null) {
                return e();
            }
            View viewO = xVar.o(this.f13134d);
            this.f13134d += this.f13135e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f13142l.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.f13142l.get(i12).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (iA = (rVar.a() - this.f13134d) * this.f13135e) >= 0 && iA < i11) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i11 = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13146c;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f13144a >= 0;
        }

        void b() {
            this.f13144a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f13144a);
            parcel.writeInt(this.f13145b);
            parcel.writeInt(this.f13146c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f13144a = parcel.readInt();
            this.f13145b = parcel.readInt();
            this.f13146c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f13144a = dVar.f13144a;
            this.f13145b = dVar.f13145b;
            this.f13146c = dVar.f13146c;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.x xVar, int i11, int i12) {
        if (i11 < 0) {
            return;
        }
        int i13 = i11 - i12;
        int iP = P();
        if (!this.f13119x) {
            for (int i14 = 0; i14 < iP; i14++) {
                View viewO = O(i14);
                if (this.f13116u.d(viewO) > i13 || this.f13116u.p(viewO) > i13) {
                    y2(xVar, 0, i14);
                    return;
                }
            }
            return;
        }
        int i15 = iP - 1;
        for (int i16 = i15; i16 >= 0; i16--) {
            View viewO2 = O(i16);
            if (this.f13116u.d(viewO2) > i13 || this.f13116u.p(viewO2) > i13) {
                y2(xVar, i15, i16);
                return;
            }
        }
    }

    private void C2() {
        if (this.f13114s == 1 || !s2()) {
            this.f13119x = this.f13118w;
        } else {
            this.f13119x = !this.f13118w;
        }
    }

    private boolean I2(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        View viewL2;
        boolean z11 = false;
        if (P() == 0) {
            return false;
        }
        View viewB0 = b0();
        if (viewB0 != null && aVar.d(viewB0, c0Var)) {
            aVar.c(viewB0, m0(viewB0));
            return true;
        }
        boolean z12 = this.f13117v;
        boolean z13 = this.f13120y;
        if (z12 != z13 || (viewL2 = l2(xVar, c0Var, aVar.f13125d, z13)) == null) {
            return false;
        }
        aVar.b(viewL2, m0(viewL2));
        if (!c0Var.e() && R1()) {
            int iG = this.f13116u.g(viewL2);
            int iD = this.f13116u.d(viewL2);
            int iM = this.f13116u.m();
            int i11 = this.f13116u.i();
            boolean z14 = iD <= iM && iG < iM;
            if (iG >= i11 && iD > i11) {
                z11 = true;
            }
            if (z14 || z11) {
                if (aVar.f13125d) {
                    iM = i11;
                }
                aVar.f13124c = iM;
            }
        }
        return true;
    }

    private boolean J2(RecyclerView.c0 c0Var, a aVar) {
        int i11;
        if (!c0Var.e() && (i11 = this.A) != -1) {
            if (i11 >= 0 && i11 < c0Var.b()) {
                aVar.f13123b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z11 = this.D.f13146c;
                    aVar.f13125d = z11;
                    if (z11) {
                        aVar.f13124c = this.f13116u.i() - this.D.f13145b;
                    } else {
                        aVar.f13124c = this.f13116u.m() + this.D.f13145b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z12 = this.f13119x;
                    aVar.f13125d = z12;
                    if (z12) {
                        aVar.f13124c = this.f13116u.i() - this.B;
                    } else {
                        aVar.f13124c = this.f13116u.m() + this.B;
                    }
                    return true;
                }
                View viewI = I(this.A);
                if (viewI == null) {
                    if (P() > 0) {
                        aVar.f13125d = (this.A < m0(O(0))) == this.f13119x;
                    }
                    aVar.a();
                } else {
                    if (this.f13116u.e(viewI) > this.f13116u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f13116u.g(viewI) - this.f13116u.m() < 0) {
                        aVar.f13124c = this.f13116u.m();
                        aVar.f13125d = false;
                        return true;
                    }
                    if (this.f13116u.i() - this.f13116u.d(viewI) < 0) {
                        aVar.f13124c = this.f13116u.i();
                        aVar.f13125d = true;
                        return true;
                    }
                    aVar.f13124c = aVar.f13125d ? this.f13116u.d(viewI) + this.f13116u.o() : this.f13116u.g(viewI);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void K2(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        if (J2(c0Var, aVar) || I2(xVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f13123b = this.f13120y ? c0Var.b() - 1 : 0;
    }

    private void L2(int i11, int i12, boolean z11, RecyclerView.c0 c0Var) {
        int iM;
        this.f13115t.f13143m = B2();
        this.f13115t.f13136f = i11;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(c0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z12 = i11 == 1;
        c cVar = this.f13115t;
        int i13 = z12 ? iMax2 : iMax;
        cVar.f13138h = i13;
        if (!z12) {
            iMax = iMax2;
        }
        cVar.f13139i = iMax;
        if (z12) {
            cVar.f13138h = i13 + this.f13116u.j();
            View viewO2 = o2();
            c cVar2 = this.f13115t;
            cVar2.f13135e = this.f13119x ? -1 : 1;
            int iM0 = m0(viewO2);
            c cVar3 = this.f13115t;
            cVar2.f13134d = iM0 + cVar3.f13135e;
            cVar3.f13132b = this.f13116u.d(viewO2);
            iM = this.f13116u.d(viewO2) - this.f13116u.i();
        } else {
            View viewP2 = p2();
            this.f13115t.f13138h += this.f13116u.m();
            c cVar4 = this.f13115t;
            cVar4.f13135e = this.f13119x ? 1 : -1;
            int iM1 = m0(viewP2);
            c cVar5 = this.f13115t;
            cVar4.f13134d = iM1 + cVar5.f13135e;
            cVar5.f13132b = this.f13116u.g(viewP2);
            iM = (-this.f13116u.g(viewP2)) + this.f13116u.m();
        }
        c cVar6 = this.f13115t;
        cVar6.f13133c = i12;
        if (z11) {
            cVar6.f13133c = i12 - iM;
        }
        cVar6.f13137g = iM;
    }

    private void M2(int i11, int i12) {
        this.f13115t.f13133c = this.f13116u.i() - i12;
        c cVar = this.f13115t;
        cVar.f13135e = this.f13119x ? -1 : 1;
        cVar.f13134d = i11;
        cVar.f13136f = 1;
        cVar.f13132b = i12;
        cVar.f13137g = Integer.MIN_VALUE;
    }

    private void N2(a aVar) {
        M2(aVar.f13123b, aVar.f13124c);
    }

    private void O2(int i11, int i12) {
        this.f13115t.f13133c = i12 - this.f13116u.m();
        c cVar = this.f13115t;
        cVar.f13134d = i11;
        cVar.f13135e = this.f13119x ? 1 : -1;
        cVar.f13136f = -1;
        cVar.f13132b = i12;
        cVar.f13137g = Integer.MIN_VALUE;
    }

    private void P2(a aVar) {
        O2(aVar.f13123b, aVar.f13124c);
    }

    private int U1(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        Z1();
        return w.a(c0Var, this.f13116u, d2(!this.f13121z, true), c2(!this.f13121z, true), this, this.f13121z);
    }

    private int V1(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        Z1();
        return w.b(c0Var, this.f13116u, d2(!this.f13121z, true), c2(!this.f13121z, true), this, this.f13121z, this.f13119x);
    }

    private int W1(RecyclerView.c0 c0Var) {
        if (P() == 0) {
            return 0;
        }
        Z1();
        return w.c(c0Var, this.f13116u, d2(!this.f13121z, true), c2(!this.f13121z, true), this, this.f13121z);
    }

    private View b2() {
        return h2(0, P());
    }

    private View f2() {
        return h2(P() - 1, -1);
    }

    private View j2() {
        return this.f13119x ? b2() : f2();
    }

    private View k2() {
        return this.f13119x ? f2() : b2();
    }

    private int m2(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11) {
        int i12;
        int i13 = this.f13116u.i() - i11;
        if (i13 <= 0) {
            return 0;
        }
        int i14 = -D2(-i13, xVar, c0Var);
        int i15 = i11 + i14;
        if (!z11 || (i12 = this.f13116u.i() - i15) <= 0) {
            return i14;
        }
        this.f13116u.r(i12);
        return i12 + i14;
    }

    private int n2(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11) {
        int iM;
        int iM2 = i11 - this.f13116u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i12 = -D2(iM2, xVar, c0Var);
        int i13 = i11 + i12;
        if (!z11 || (iM = i13 - this.f13116u.m()) <= 0) {
            return i12;
        }
        this.f13116u.r(-iM);
        return i12 - iM;
    }

    private View o2() {
        return O(this.f13119x ? 0 : P() - 1);
    }

    private View p2() {
        return O(this.f13119x ? P() - 1 : 0);
    }

    private void v2(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11, int i12) {
        if (!c0Var.g() || P() == 0 || c0Var.e() || !R1()) {
            return;
        }
        List<RecyclerView.g0> listK = xVar.k();
        int size = listK.size();
        int iM0 = m0(O(0));
        int iE = 0;
        int iE2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.g0 g0Var = listK.get(i13);
            if (!g0Var.isRemoved()) {
                if ((g0Var.getLayoutPosition() < iM0) != this.f13119x) {
                    iE += this.f13116u.e(g0Var.itemView);
                } else {
                    iE2 += this.f13116u.e(g0Var.itemView);
                }
            }
        }
        this.f13115t.f13142l = listK;
        if (iE > 0) {
            O2(m0(p2()), i11);
            c cVar = this.f13115t;
            cVar.f13138h = iE;
            cVar.f13133c = 0;
            cVar.a();
            a2(xVar, this.f13115t, c0Var, false);
        }
        if (iE2 > 0) {
            M2(m0(o2()), i12);
            c cVar2 = this.f13115t;
            cVar2.f13138h = iE2;
            cVar2.f13133c = 0;
            cVar2.a();
            a2(xVar, this.f13115t, c0Var, false);
        }
        this.f13115t.f13142l = null;
    }

    private void x2(RecyclerView.x xVar, c cVar) {
        if (!cVar.f13131a || cVar.f13143m) {
            return;
        }
        int i11 = cVar.f13137g;
        int i12 = cVar.f13139i;
        if (cVar.f13136f == -1) {
            z2(xVar, i11, i12);
        } else {
            A2(xVar, i11, i12);
        }
    }

    private void y2(RecyclerView.x xVar, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                t1(i11, xVar);
                i11--;
            }
        } else {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                t1(i13, xVar);
            }
        }
    }

    private void z2(RecyclerView.x xVar, int i11, int i12) {
        int iP = P();
        if (i11 < 0) {
            return;
        }
        int iH = (this.f13116u.h() - i11) + i12;
        if (this.f13119x) {
            for (int i13 = 0; i13 < iP; i13++) {
                View viewO = O(i13);
                if (this.f13116u.g(viewO) < iH || this.f13116u.q(viewO) < iH) {
                    y2(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iP - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewO2 = O(i15);
            if (this.f13116u.g(viewO2) < iH || this.f13116u.q(viewO2) < iH) {
                y2(xVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.c0 c0Var) {
        return V1(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int B(RecyclerView.c0 c0Var) {
        return W1(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B0() {
        return this.f13118w;
    }

    boolean B2() {
        return this.f13116u.k() == 0 && this.f13116u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int C1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f13114s == 1) {
            return 0;
        }
        return D2(i11, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void D1(int i11) {
        this.A = i11;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        z1();
    }

    int D2(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (P() == 0 || i11 == 0) {
            return 0;
        }
        Z1();
        this.f13115t.f13131a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int iAbs = Math.abs(i11);
        L2(i12, iAbs, true, c0Var);
        c cVar = this.f13115t;
        int iA2 = cVar.f13137g + a2(xVar, cVar, c0Var, false);
        if (iA2 < 0) {
            return 0;
        }
        if (iAbs > iA2) {
            i11 = i12 * iA2;
        }
        this.f13116u.r(-i11);
        this.f13115t.f13141k = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int E1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f13114s == 0) {
            return 0;
        }
        return D2(i11, xVar, c0Var);
    }

    public void E2(int i11, int i12) {
        this.A = i11;
        this.B = i12;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        z1();
    }

    public void F2(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        m(null);
        if (i11 != this.f13114s || this.f13116u == null) {
            t tVarB = t.b(this, i11);
            this.f13116u = tVarB;
            this.E.f13122a = tVarB;
            this.f13114s = i11;
            z1();
        }
    }

    public void G2(boolean z11) {
        m(null);
        if (z11 == this.f13118w) {
            return;
        }
        this.f13118w = z11;
        z1();
    }

    public void H2(boolean z11) {
        m(null);
        if (this.f13120y == z11) {
            return;
        }
        this.f13120y = z11;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View I(int i11) {
        int iP = P();
        if (iP == 0) {
            return null;
        }
        int iM0 = i11 - m0(O(0));
        if (iM0 >= 0 && iM0 < iP) {
            View viewO = O(iM0);
            if (m0(viewO) == i11) {
                return viewO;
            }
        }
        return super.I(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.r J() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean M1() {
        return (d0() == 1073741824 || u0() == 1073741824 || !v0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void O0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.O0(recyclerView, xVar);
        if (this.C) {
            q1(xVar);
            xVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void O1(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i11) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i11);
        P1(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View P0(View view, int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int iX1;
        C2();
        if (P() == 0 || (iX1 = X1(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        Z1();
        L2(iX1, (int) (this.f13116u.n() * 0.33333334f), false, c0Var);
        c cVar = this.f13115t;
        cVar.f13137g = Integer.MIN_VALUE;
        cVar.f13131a = false;
        a2(xVar, cVar, c0Var, true);
        View viewK2 = iX1 == -1 ? k2() : j2();
        View viewP2 = iX1 == -1 ? p2() : o2();
        if (!viewP2.hasFocusable()) {
            return viewK2;
        }
        if (viewK2 == null) {
            return null;
        }
        return viewP2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (P() > 0) {
            accessibilityEvent.setFromIndex(e2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean R1() {
        return this.D == null && this.f13117v == this.f13120y;
    }

    protected void S1(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
        int i11;
        int iQ2 = q2(c0Var);
        if (this.f13115t.f13136f == -1) {
            i11 = 0;
        } else {
            i11 = iQ2;
            iQ2 = 0;
        }
        iArr[0] = iQ2;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void T0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.T0(xVar, c0Var, accessibilityNodeInfoCompat);
        RecyclerView.h hVar = this.f13251b.f13171m;
        if (hVar == null || hVar.getItemCount() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.B);
    }

    void T1(RecyclerView.c0 c0Var, c cVar, RecyclerView.q.c cVar2) {
        int i11 = cVar.f13134d;
        if (i11 < 0 || i11 >= c0Var.b()) {
            return;
        }
        cVar2.a(i11, Math.max(0, cVar.f13137g));
    }

    int X1(int i11) {
        if (i11 == 1) {
            return (this.f13114s != 1 && s2()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.f13114s != 1 && s2()) ? -1 : 1;
        }
        if (i11 == 17) {
            return this.f13114s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return this.f13114s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 != 66) {
            return (i11 == 130 && this.f13114s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f13114s == 0 ? 1 : Integer.MIN_VALUE;
    }

    c Y1() {
        return new c();
    }

    void Z1() {
        if (this.f13115t == null) {
            this.f13115t = Y1();
        }
    }

    int a2(RecyclerView.x xVar, c cVar, RecyclerView.c0 c0Var, boolean z11) {
        int i11 = cVar.f13133c;
        int i12 = cVar.f13137g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                cVar.f13137g = i12 + i11;
            }
            x2(xVar, cVar);
        }
        int i13 = cVar.f13133c + cVar.f13138h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f13143m && i13 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            u2(xVar, c0Var, cVar, bVar);
            if (!bVar.f13128b) {
                cVar.f13132b += bVar.f13127a * cVar.f13136f;
                if (!bVar.f13129c || cVar.f13142l != null || !c0Var.e()) {
                    int i14 = cVar.f13133c;
                    int i15 = bVar.f13127a;
                    cVar.f13133c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = cVar.f13137g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + bVar.f13127a;
                    cVar.f13137g = i17;
                    int i18 = cVar.f13133c;
                    if (i18 < 0) {
                        cVar.f13137g = i17 + i18;
                    }
                    x2(xVar, cVar);
                }
                if (z11 && bVar.f13130d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - cVar.f13133c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    @SuppressLint({"UnknownNullness"})
    public PointF c(int i11) {
        if (P() == 0) {
            return null;
        }
        int i12 = (i11 < m0(O(0))) != this.f13119x ? -1 : 1;
        return this.f13114s == 0 ? new PointF(i12, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, i12);
    }

    View c2(boolean z11, boolean z12) {
        return this.f13119x ? i2(0, P(), z11, z12) : i2(P() - 1, -1, z11, z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void d1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iM2;
        int i15;
        View viewI;
        int iG;
        int i16;
        int i17 = -1;
        if (!(this.D == null && this.A == -1) && c0Var.b() == 0) {
            q1(xVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f13144a;
        }
        Z1();
        this.f13115t.f13131a = false;
        C2();
        View viewB0 = b0();
        a aVar = this.E;
        if (!aVar.f13126e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f13125d = this.f13119x ^ this.f13120y;
            K2(xVar, c0Var, aVar2);
            this.E.f13126e = true;
        } else if (viewB0 != null && (this.f13116u.g(viewB0) >= this.f13116u.i() || this.f13116u.d(viewB0) <= this.f13116u.m())) {
            this.E.c(viewB0, m0(viewB0));
        }
        c cVar = this.f13115t;
        cVar.f13136f = cVar.f13141k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(c0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f13116u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f13116u.j();
        if (c0Var.e() && (i15 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewI = I(i15)) != null) {
            if (this.f13119x) {
                i16 = this.f13116u.i() - this.f13116u.d(viewI);
                iG = this.B;
            } else {
                iG = this.f13116u.g(viewI) - this.f13116u.m();
                i16 = this.B;
            }
            int i18 = i16 - iG;
            if (i18 > 0) {
                iMax += i18;
            } else {
                iMax2 -= i18;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f13125d ? !this.f13119x : this.f13119x) {
            i17 = 1;
        }
        w2(xVar, c0Var, aVar3, i17);
        C(xVar);
        this.f13115t.f13143m = B2();
        this.f13115t.f13140j = c0Var.e();
        this.f13115t.f13139i = 0;
        a aVar4 = this.E;
        if (aVar4.f13125d) {
            P2(aVar4);
            c cVar2 = this.f13115t;
            cVar2.f13138h = iMax;
            a2(xVar, cVar2, c0Var, false);
            c cVar3 = this.f13115t;
            i12 = cVar3.f13132b;
            int i19 = cVar3.f13134d;
            int i21 = cVar3.f13133c;
            if (i21 > 0) {
                iMax2 += i21;
            }
            N2(this.E);
            c cVar4 = this.f13115t;
            cVar4.f13138h = iMax2;
            cVar4.f13134d += cVar4.f13135e;
            a2(xVar, cVar4, c0Var, false);
            c cVar5 = this.f13115t;
            i11 = cVar5.f13132b;
            int i22 = cVar5.f13133c;
            if (i22 > 0) {
                O2(i19, i12);
                c cVar6 = this.f13115t;
                cVar6.f13138h = i22;
                a2(xVar, cVar6, c0Var, false);
                i12 = this.f13115t.f13132b;
            }
        } else {
            N2(aVar4);
            c cVar7 = this.f13115t;
            cVar7.f13138h = iMax2;
            a2(xVar, cVar7, c0Var, false);
            c cVar8 = this.f13115t;
            i11 = cVar8.f13132b;
            int i23 = cVar8.f13134d;
            int i24 = cVar8.f13133c;
            if (i24 > 0) {
                iMax += i24;
            }
            P2(this.E);
            c cVar9 = this.f13115t;
            cVar9.f13138h = iMax;
            cVar9.f13134d += cVar9.f13135e;
            a2(xVar, cVar9, c0Var, false);
            c cVar10 = this.f13115t;
            i12 = cVar10.f13132b;
            int i25 = cVar10.f13133c;
            if (i25 > 0) {
                M2(i23, i11);
                c cVar11 = this.f13115t;
                cVar11.f13138h = i25;
                a2(xVar, cVar11, c0Var, false);
                i11 = this.f13115t.f13132b;
            }
        }
        if (P() > 0) {
            if (this.f13119x ^ this.f13120y) {
                int iM3 = m2(i11, xVar, c0Var, true);
                i13 = i12 + iM3;
                i14 = i11 + iM3;
                iM2 = n2(i13, xVar, c0Var, false);
            } else {
                int iN2 = n2(i12, xVar, c0Var, true);
                i13 = i12 + iN2;
                i14 = i11 + iN2;
                iM2 = m2(i14, xVar, c0Var, false);
            }
            i12 = i13 + iM2;
            i11 = i14 + iM2;
        }
        v2(xVar, c0Var, i12, i11);
        if (c0Var.e()) {
            this.E.e();
        } else {
            this.f13116u.s();
        }
        this.f13117v = this.f13120y;
    }

    View d2(boolean z11, boolean z12) {
        return this.f13119x ? i2(P() - 1, -1, z11, z12) : i2(0, P(), z11, z12);
    }

    @Override // androidx.recyclerview.widget.l.i
    public void e(@NonNull View view, @NonNull View view2, int i11, int i12) {
        m("Cannot drop a view during a scroll or layout calculation");
        Z1();
        C2();
        int iM0 = m0(view);
        int iM1 = m0(view2);
        byte b11 = iM0 < iM1 ? (byte) 1 : (byte) -1;
        if (this.f13119x) {
            if (b11 == 1) {
                E2(iM1, this.f13116u.i() - (this.f13116u.g(view2) + this.f13116u.e(view)));
                return;
            } else {
                E2(iM1, this.f13116u.i() - this.f13116u.d(view2));
                return;
            }
        }
        if (b11 == -1) {
            E2(iM1, this.f13116u.g(view2));
        } else {
            E2(iM1, this.f13116u.d(view2) - this.f13116u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void e1(RecyclerView.c0 c0Var) {
        super.e1(c0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int e2() {
        View viewI2 = i2(0, P(), false, true);
        if (viewI2 == null) {
            return -1;
        }
        return m0(viewI2);
    }

    public int g2() {
        View viewI2 = i2(P() - 1, -1, false, true);
        if (viewI2 == null) {
            return -1;
        }
        return m0(viewI2);
    }

    View h2(int i11, int i12) {
        int i13;
        int i14;
        Z1();
        if (i12 <= i11 && i12 >= i11) {
            return O(i11);
        }
        if (this.f13116u.g(O(i11)) < this.f13116u.m()) {
            i13 = 16644;
            i14 = 16388;
        } else {
            i13 = 4161;
            i14 = 4097;
        }
        return this.f13114s == 0 ? this.f13254e.a(i11, i12, i13, i14) : this.f13255f.a(i11, i12, i13, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void i1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.b();
            }
            z1();
        }
    }

    View i2(int i11, int i12, boolean z11, boolean z12) {
        Z1();
        int i13 = z11 ? 24579 : 320;
        int i14 = z12 ? 320 : 0;
        return this.f13114s == 0 ? this.f13254e.a(i11, i12, i13, i14) : this.f13255f.a(i11, i12, i13, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public Parcelable j1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (P() <= 0) {
            dVar.b();
            return dVar;
        }
        Z1();
        boolean z11 = this.f13117v ^ this.f13119x;
        dVar.f13146c = z11;
        if (z11) {
            View viewO2 = o2();
            dVar.f13145b = this.f13116u.i() - this.f13116u.d(viewO2);
            dVar.f13144a = m0(viewO2);
            return dVar;
        }
        View viewP2 = p2();
        dVar.f13144a = m0(viewP2);
        dVar.f13145b = this.f13116u.g(viewP2) - this.f13116u.m();
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View l2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z11, boolean z12) {
        int i11;
        int iP;
        int i12;
        Z1();
        int iP2 = P();
        if (z12) {
            iP = P() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = iP2;
            iP = 0;
            i12 = 1;
        }
        int iB = c0Var.b();
        int iM = this.f13116u.m();
        int i13 = this.f13116u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iP != i11) {
            View viewO = O(iP);
            int iM0 = m0(viewO);
            int iG = this.f13116u.g(viewO);
            int iD = this.f13116u.d(viewO);
            if (iM0 >= 0 && iM0 < iB) {
                if (!((RecyclerView.r) viewO.getLayoutParams()).c()) {
                    boolean z13 = iD <= iM && iG < iM;
                    boolean z14 = iG >= i13 && iD > i13;
                    if (!z13 && !z14) {
                        return viewO;
                    }
                    if (z11) {
                        if (z14) {
                            view2 = viewO;
                        } else if (view == null) {
                            view = viewO;
                        }
                    } else if (z13) {
                        view2 = viewO;
                    } else if (view == null) {
                        view = viewO;
                    }
                } else if (view3 == null) {
                    view3 = viewO;
                }
            }
            iP += i12;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void m(String str) {
        if (this.D == null) {
            super.m(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean m1(int i11, Bundle bundle) {
        int iMin;
        if (super.m1(i11, bundle)) {
            return true;
        }
        if (i11 == 16908343 && bundle != null) {
            if (this.f13114s == 1) {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f13251b;
                iMin = Math.min(i12, p0(recyclerView.f13151c, recyclerView.f13166j0) - 1);
            } else {
                int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i13 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f13251b;
                iMin = Math.min(i13, T(recyclerView2.f13151c, recyclerView2.f13166j0) - 1);
            }
            if (iMin >= 0) {
                E2(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f13114s == 0;
    }

    @Deprecated
    protected int q2(RecyclerView.c0 c0Var) {
        if (c0Var.d()) {
            return this.f13116u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r() {
        return this.f13114s == 1;
    }

    public int r2() {
        return this.f13114s;
    }

    protected boolean s2() {
        return e0() == 1;
    }

    public boolean t2() {
        return this.f13121z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void u(int i11, int i12, RecyclerView.c0 c0Var, RecyclerView.q.c cVar) {
        if (this.f13114s != 0) {
            i11 = i12;
        }
        if (P() == 0 || i11 == 0) {
            return;
        }
        Z1();
        L2(i11 > 0 ? 1 : -1, Math.abs(i11), true, c0Var);
        T1(c0Var, this.f13115t, cVar);
    }

    void u2(RecyclerView.x xVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int iF;
        int i11;
        int i12;
        int i13;
        int iJ0;
        int iF2;
        int i14;
        int i15;
        View viewD = cVar.d(xVar);
        if (viewD == null) {
            bVar.f13128b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) viewD.getLayoutParams();
        if (cVar.f13142l == null) {
            if (this.f13119x == (cVar.f13136f == -1)) {
                j(viewD);
            } else {
                k(viewD, 0);
            }
        } else {
            if (this.f13119x == (cVar.f13136f == -1)) {
                h(viewD);
            } else {
                i(viewD, 0);
            }
        }
        G0(viewD, 0, 0);
        bVar.f13127a = this.f13116u.e(viewD);
        if (this.f13114s == 1) {
            if (s2()) {
                iF2 = t0() - k0();
                iJ0 = iF2 - this.f13116u.f(viewD);
            } else {
                iJ0 = j0();
                iF2 = this.f13116u.f(viewD) + iJ0;
            }
            if (cVar.f13136f == -1) {
                i15 = cVar.f13132b;
                i14 = i15 - bVar.f13127a;
            } else {
                i14 = cVar.f13132b;
                i15 = bVar.f13127a + i14;
            }
            int i16 = iJ0;
            i13 = i14;
            i12 = i16;
            iF = i15;
            i11 = iF2;
        } else {
            int iL0 = l0();
            iF = this.f13116u.f(viewD) + iL0;
            if (cVar.f13136f == -1) {
                int i17 = cVar.f13132b;
                i12 = i17 - bVar.f13127a;
                i11 = i17;
            } else {
                int i18 = cVar.f13132b;
                i11 = bVar.f13127a + i18;
                i12 = i18;
            }
            i13 = iL0;
        }
        F0(viewD, i12, i13, i11, iF);
        if (rVar.c() || rVar.b()) {
            bVar.f13129c = true;
        }
        bVar.f13130d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void v(int i11, RecyclerView.q.c cVar) {
        boolean z11;
        int i12;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            C2();
            z11 = this.f13119x;
            i12 = this.A;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z11 = dVar2.f13146c;
            i12 = dVar2.f13144a;
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.G && i12 >= 0 && i12 < i11; i14++) {
            cVar.a(i12, 0);
            i12 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.c0 c0Var) {
        return U1(c0Var);
    }

    void w2(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar, int i11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.c0 c0Var) {
        return V1(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.c0 c0Var) {
        return W1(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.c0 c0Var) {
        return U1(c0Var);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i11, boolean z11) {
        this.f13114s = 1;
        this.f13118w = false;
        this.f13119x = false;
        this.f13120y = false;
        this.f13121z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        F2(i11);
        G2(z11);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f13114s = 1;
        this.f13118w = false;
        this.f13119x = false;
        this.f13120y = false;
        this.f13121z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.q.d dVarN0 = RecyclerView.q.n0(context, attributeSet, i11, i12);
        F2(dVarN0.f13270a);
        G2(dVarN0.f13272c);
        H2(dVarN0.f13273d);
    }
}
