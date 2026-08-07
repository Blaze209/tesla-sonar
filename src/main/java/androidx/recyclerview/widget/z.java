package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f13596b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13597a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13601e;

        a() {
        }

        void a(int i11) {
            this.f13597a = i11 | this.f13597a;
        }

        boolean b() {
            int i11 = this.f13597a;
            if ((i11 & 7) != 0 && (i11 & c(this.f13600d, this.f13598b)) == 0) {
                return false;
            }
            int i12 = this.f13597a;
            if ((i12 & 112) != 0 && (i12 & (c(this.f13600d, this.f13599c) << 4)) == 0) {
                return false;
            }
            int i13 = this.f13597a;
            if ((i13 & 1792) != 0 && (i13 & (c(this.f13601e, this.f13598b) << 8)) == 0) {
                return false;
            }
            int i14 = this.f13597a;
            return (i14 & 28672) == 0 || (i14 & (c(this.f13601e, this.f13599c) << 12)) != 0;
        }

        int c(int i11, int i12) {
            if (i11 > i12) {
                return 1;
            }
            return i11 == i12 ? 2 : 4;
        }

        void d() {
            this.f13597a = 0;
        }

        void e(int i11, int i12, int i13, int i14) {
            this.f13598b = i11;
            this.f13599c = i12;
            this.f13600d = i13;
            this.f13601e = i14;
        }
    }

    interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View getChildAt(int i11);
    }

    z(b bVar) {
        this.f13595a = bVar;
    }

    View a(int i11, int i12, int i13, int i14) {
        int iA = this.f13595a.a();
        int iB = this.f13595a.b();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View childAt = this.f13595a.getChildAt(i11);
            this.f13596b.e(iA, iB, this.f13595a.c(childAt), this.f13595a.d(childAt));
            if (i13 != 0) {
                this.f13596b.d();
                this.f13596b.a(i13);
                if (this.f13596b.b()) {
                    return childAt;
                }
            }
            if (i14 != 0) {
                this.f13596b.d();
                this.f13596b.a(i14);
                if (this.f13596b.b()) {
                    view = childAt;
                }
            }
            i11 += i15;
        }
        return view;
    }

    boolean b(View view, int i11) {
        this.f13596b.e(this.f13595a.a(), this.f13595a.b(), this.f13595a.c(view), this.f13595a.d(view));
        if (i11 == 0) {
            return false;
        }
        this.f13596b.d();
        this.f13596b.a(i11);
        return this.f13596b.b();
    }
}
