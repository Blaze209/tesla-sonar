package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.q f13580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f13582c;

    class a extends t {
        a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f13580a.Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f13580a.Y(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f13580a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f13580a.W(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f13580a.t0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f13580a.t0() - this.f13580a.k0();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f13580a.k0();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f13580a.u0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f13580a.d0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f13580a.j0();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f13580a.t0() - this.f13580a.j0()) - this.f13580a.k0();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f13580a.s0(view, true, this.f13582c);
            return this.f13582c.right;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f13580a.s0(view, true, this.f13582c);
            return this.f13582c.left;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i11) {
            this.f13580a.I0(i11);
        }
    }

    class b extends t {
        b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f13580a.U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f13580a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f13580a.Y(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f13580a.a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f13580a.c0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f13580a.c0() - this.f13580a.i0();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f13580a.i0();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f13580a.d0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f13580a.u0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f13580a.l0();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f13580a.c0() - this.f13580a.l0()) - this.f13580a.i0();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f13580a.s0(view, true, this.f13582c);
            return this.f13582c.bottom;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f13580a.s0(view, true, this.f13582c);
            return this.f13582c.top;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i11) {
            this.f13580a.J0(i11);
        }
    }

    /* synthetic */ t(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static t a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static t b(RecyclerView.q qVar, int i11) {
        if (i11 == 0) {
            return a(qVar);
        }
        if (i11 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static t c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f13581b) {
            return 0;
        }
        return n() - this.f13581b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i11);

    public void s() {
        this.f13581b = n();
    }

    private t(RecyclerView.q qVar) {
        this.f13581b = Integer.MIN_VALUE;
        this.f13582c = new Rect();
        this.f13580a = qVar;
    }
}
