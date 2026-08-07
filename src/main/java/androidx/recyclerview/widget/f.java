package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f13383a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f13387e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13386d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f13384b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f13385c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f13388a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f13389b;

        a() {
        }

        private void c() {
            if (this.f13389b == null) {
                this.f13389b = new a();
            }
        }

        void a(int i11) {
            if (i11 < 64) {
                this.f13388a &= ~(1 << i11);
                return;
            }
            a aVar = this.f13389b;
            if (aVar != null) {
                aVar.a(i11 - 64);
            }
        }

        int b(int i11) {
            a aVar = this.f13389b;
            if (aVar == null) {
                return i11 >= 64 ? Long.bitCount(this.f13388a) : Long.bitCount(this.f13388a & ((1 << i11) - 1));
            }
            return i11 < 64 ? Long.bitCount(this.f13388a & ((1 << i11) - 1)) : aVar.b(i11 - 64) + Long.bitCount(this.f13388a);
        }

        boolean d(int i11) {
            if (i11 < 64) {
                return (this.f13388a & (1 << i11)) != 0;
            }
            c();
            return this.f13389b.d(i11 - 64);
        }

        void e(int i11, boolean z11) {
            if (i11 >= 64) {
                c();
                this.f13389b.e(i11 - 64, z11);
                return;
            }
            long j11 = this.f13388a;
            boolean z12 = (Long.MIN_VALUE & j11) != 0;
            long j12 = (1 << i11) - 1;
            this.f13388a = ((j11 & (~j12)) << 1) | (j11 & j12);
            if (z11) {
                h(i11);
            } else {
                a(i11);
            }
            if (z12 || this.f13389b != null) {
                c();
                this.f13389b.e(0, z12);
            }
        }

        boolean f(int i11) {
            if (i11 >= 64) {
                c();
                return this.f13389b.f(i11 - 64);
            }
            long j11 = 1 << i11;
            long j12 = this.f13388a;
            boolean z11 = (j12 & j11) != 0;
            long j13 = j12 & (~j11);
            this.f13388a = j13;
            long j14 = j11 - 1;
            this.f13388a = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
            a aVar = this.f13389b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f13389b.f(0);
            }
            return z11;
        }

        void g() {
            this.f13388a = 0L;
            a aVar = this.f13389b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i11) {
            if (i11 < 64) {
                this.f13388a |= 1 << i11;
            } else {
                c();
                this.f13389b.h(i11 - 64);
            }
        }

        public String toString() {
            if (this.f13389b == null) {
                return Long.toBinaryString(this.f13388a);
            }
            return this.f13389b.toString() + "xx" + Long.toBinaryString(this.f13388a);
        }
    }

    interface b {
        void a(View view);

        RecyclerView.g0 b(View view);

        void c(View view, int i11);

        void d();

        void e(View view, int i11, ViewGroup.LayoutParams layoutParams);

        void f(int i11);

        int g(View view);

        View getChildAt(int i11);

        int getChildCount();

        void h(View view);

        void i(int i11);
    }

    f(b bVar) {
        this.f13383a = bVar;
    }

    private int h(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int childCount = this.f13383a.getChildCount();
        int i12 = i11;
        while (i12 < childCount) {
            int iB = i11 - (i12 - this.f13384b.b(i12));
            if (iB == 0) {
                while (this.f13384b.d(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f13385c.add(view);
        this.f13383a.a(view);
    }

    private boolean t(View view) {
        if (!this.f13385c.remove(view)) {
            return false;
        }
        this.f13383a.h(view);
        return true;
    }

    void a(View view, int i11, boolean z11) {
        int childCount = i11 < 0 ? this.f13383a.getChildCount() : h(i11);
        this.f13384b.e(childCount, z11);
        if (z11) {
            l(view);
        }
        this.f13383a.c(view, childCount);
    }

    void b(View view, boolean z11) {
        a(view, -1, z11);
    }

    void c(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        int childCount = i11 < 0 ? this.f13383a.getChildCount() : h(i11);
        this.f13384b.e(childCount, z11);
        if (z11) {
            l(view);
        }
        this.f13383a.e(view, childCount, layoutParams);
    }

    void d(int i11) {
        int iH = h(i11);
        this.f13384b.f(iH);
        this.f13383a.f(iH);
    }

    View e(int i11) {
        int size = this.f13385c.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f13385c.get(i12);
            RecyclerView.g0 g0VarB = this.f13383a.b(view);
            if (g0VarB.getLayoutPosition() == i11 && !g0VarB.isInvalid() && !g0VarB.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i11) {
        return this.f13383a.getChildAt(h(i11));
    }

    int g() {
        return this.f13383a.getChildCount() - this.f13385c.size();
    }

    View i(int i11) {
        return this.f13383a.getChildAt(i11);
    }

    int j() {
        return this.f13383a.getChildCount();
    }

    void k(View view) {
        int iG = this.f13383a.g(view);
        if (iG >= 0) {
            this.f13384b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iG = this.f13383a.g(view);
        if (iG == -1 || this.f13384b.d(iG)) {
            return -1;
        }
        return iG - this.f13384b.b(iG);
    }

    boolean n(View view) {
        return this.f13385c.contains(view);
    }

    void o() {
        this.f13384b.g();
        for (int size = this.f13385c.size() - 1; size >= 0; size--) {
            this.f13383a.h(this.f13385c.get(size));
            this.f13385c.remove(size);
        }
        this.f13383a.d();
    }

    void p(View view) {
        int i11 = this.f13386d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f13386d = 1;
            this.f13387e = view;
            int iG = this.f13383a.g(view);
            if (iG >= 0) {
                if (this.f13384b.f(iG)) {
                    t(view);
                }
                this.f13383a.i(iG);
            }
        } finally {
            this.f13386d = 0;
            this.f13387e = null;
        }
    }

    void q(int i11) {
        int i12 = this.f13386d;
        if (i12 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i12 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i11);
            View childAt = this.f13383a.getChildAt(iH);
            if (childAt != null) {
                this.f13386d = 1;
                this.f13387e = childAt;
                if (this.f13384b.f(iH)) {
                    t(childAt);
                }
                this.f13383a.i(iH);
            }
        } finally {
            this.f13386d = 0;
            this.f13387e = null;
        }
    }

    boolean r(View view) {
        int i11 = this.f13386d;
        if (i11 == 1) {
            if (this.f13387e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f13386d = 2;
            int iG = this.f13383a.g(view);
            if (iG == -1) {
                t(view);
                return true;
            }
            if (!this.f13384b.d(iG)) {
                return false;
            }
            this.f13384b.f(iG);
            t(view);
            this.f13383a.i(iG);
            return true;
        } finally {
            this.f13386d = 0;
        }
    }

    void s(View view) {
        int iG = this.f13383a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f13384b.d(iG)) {
            this.f13384b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f13384b.toString() + ", hidden list:" + this.f13385c.size();
    }
}
