package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f2359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f2363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f2366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f2367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f2369l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z11, int i11) {
        this(context, eVar, view, z11, i11, 0);
    }

    @NonNull
    private h a() {
        Display defaultDisplay = ((WindowManager) this.f2358a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f2358a.getResources().getDimensionPixelSize(i.d.f73761c) ? new b(this.f2358a, this.f2363f, this.f2361d, this.f2362e, this.f2360c) : new l(this.f2358a, this.f2359b, this.f2363f, this.f2361d, this.f2362e, this.f2360c);
        bVar.m(this.f2359b);
        bVar.v(this.f2369l);
        bVar.q(this.f2363f);
        bVar.i(this.f2366i);
        bVar.s(this.f2365h);
        bVar.t(this.f2364g);
        return bVar;
    }

    private void l(int i11, int i12, boolean z11, boolean z12) {
        h hVarC = c();
        hVarC.w(z12);
        if (z11) {
            if ((androidx.core.view.k.b(this.f2364g, ViewCompat.A(this.f2363f)) & 7) == 5) {
                i11 -= this.f2363f.getWidth();
            }
            hVarC.u(i11);
            hVarC.x(i12);
            int i13 = (int) ((this.f2358a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.r(new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13));
        }
        hVarC.show();
    }

    public void b() {
        if (d()) {
            this.f2367j.dismiss();
        }
    }

    @NonNull
    public h c() {
        if (this.f2367j == null) {
            this.f2367j = a();
        }
        return this.f2367j;
    }

    public boolean d() {
        h hVar = this.f2367j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f2367j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2368k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(@NonNull View view) {
        this.f2363f = view;
    }

    public void g(boolean z11) {
        this.f2365h = z11;
        h hVar = this.f2367j;
        if (hVar != null) {
            hVar.s(z11);
        }
    }

    public void h(int i11) {
        this.f2364g = i11;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f2368k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f2366i = aVar;
        h hVar = this.f2367j;
        if (hVar != null) {
            hVar.i(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f2363f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i11, int i12) {
        if (d()) {
            return true;
        }
        if (this.f2363f == null) {
            return false;
        }
        l(i11, i12, true, true);
        return true;
    }

    public i(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z11, int i11, int i12) {
        this.f2364g = 8388611;
        this.f2369l = new a();
        this.f2358a = context;
        this.f2359b = eVar;
        this.f2363f = view;
        this.f2360c = z11;
        this.f2361d = i11;
        this.f2362e = i12;
    }
}
