package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f2682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f2683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f2684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f2685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f2686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f2687g;

    f1(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2684d = layoutParams;
        this.f2685e = new Rect();
        this.f2686f = new int[2];
        this.f2687g = new int[2];
        this.f2681a = context;
        View viewInflate = LayoutInflater.from(context).inflate(i.g.f73844s, (ViewGroup) null);
        this.f2682b = viewInflate;
        this.f2683c = (TextView) viewInflate.findViewById(i.f.f73819t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.i.f73860a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i11, int i12, boolean z11, WindowManager.LayoutParams layoutParams) {
        int height;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2681a.getResources().getDimensionPixelOffset(i.d.f73771m);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2681a.getResources().getDimensionPixelOffset(i.d.f73770l);
            height = i12 + dimensionPixelOffset2;
            i13 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i13 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2681a.getResources().getDimensionPixelOffset(z11 ? i.d.f73773o : i.d.f73772n);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f2685e);
        Rect rect = this.f2685e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2681a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2685e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f2687g);
        view.getLocationOnScreen(this.f2686f);
        int[] iArr = this.f2686f;
        int i14 = iArr[0];
        int[] iArr2 = this.f2687g;
        int i15 = i14 - iArr2[0];
        iArr[0] = i15;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i15 + i11) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2682b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f2682b.getMeasuredHeight();
        int i16 = this.f2686f[1];
        int i17 = ((i13 + i16) - dimensionPixelOffset3) - measuredHeight;
        int i18 = i16 + height + dimensionPixelOffset3;
        if (z11) {
            if (i17 >= 0) {
                layoutParams.y = i17;
                return;
            } else {
                layoutParams.y = i18;
                return;
            }
        }
        if (measuredHeight + i18 <= this.f2685e.height()) {
            layoutParams.y = i18;
        } else {
            layoutParams.y = i17;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f2681a.getSystemService("window")).removeView(this.f2682b);
        }
    }

    boolean d() {
        return this.f2682b.getParent() != null;
    }

    void e(View view, int i11, int i12, boolean z11, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f2683c.setText(charSequence);
        a(view, i11, i12, z11, this.f2684d);
        ((WindowManager) this.f2681a.getSystemService("window")).addView(this.f2682b, this.f2684d);
    }
}
