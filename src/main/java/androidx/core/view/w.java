package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f7860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f7861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f7862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f7864e;

    public w(View view) {
        this.f7862c = view;
    }

    private boolean g(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent viewParentH;
        int i16;
        int i17;
        int[] iArr3;
        if (!l() || (viewParentH = h(i15)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f7862c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i17 = iArr[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        u0.d(viewParentH, this.f7862c, i11, i12, i13, i14, i15, iArr3);
        if (iArr != null) {
            this.f7862c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i17;
        }
        return true;
    }

    private ViewParent h(int i11) {
        if (i11 == 0) {
            return this.f7860a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f7861b;
    }

    private int[] i() {
        if (this.f7864e == null) {
            this.f7864e = new int[2];
        }
        return this.f7864e;
    }

    private void n(int i11, ViewParent viewParent) {
        if (i11 == 0) {
            this.f7860a = viewParent;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f7861b = viewParent;
        }
    }

    public boolean a(float f11, float f12, boolean z11) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return u0.a(viewParentH, this.f7862c, f11, f12, z11);
    }

    public boolean b(float f11, float f12) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return u0.b(viewParentH, this.f7862c, f11, f12);
    }

    public boolean c(int i11, int i12, int[] iArr, int[] iArr2) {
        return d(i11, i12, iArr, iArr2, 0);
    }

    public boolean d(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent viewParentH;
        int i14;
        int i15;
        if (!l() || (viewParentH = h(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f7862c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        u0.c(viewParentH, this.f7862c, i11, i12, iArr3, i13);
        if (iArr2 != null) {
            this.f7862c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        g(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public boolean f(int i11, int i12, int i13, int i14, int[] iArr) {
        return g(i11, i12, i13, i14, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i11) {
        return h(i11) != null;
    }

    public boolean l() {
        return this.f7863d;
    }

    public void m(boolean z11) {
        if (this.f7863d) {
            ViewCompat.O0(this.f7862c);
        }
        this.f7863d = z11;
    }

    public boolean o(int i11) {
        return p(i11, 0);
    }

    public boolean p(int i11, int i12) {
        if (k(i12)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f7862c;
        for (ViewParent parent = this.f7862c.getParent(); parent != null; parent = parent.getParent()) {
            if (u0.f(parent, view, this.f7862c, i11, i12)) {
                n(i12, parent);
                u0.e(parent, view, this.f7862c, i11, i12);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i11) {
        ViewParent viewParentH = h(i11);
        if (viewParentH != null) {
            u0.g(viewParentH, this.f7862c, i11);
            n(i11, null);
        }
    }
}
