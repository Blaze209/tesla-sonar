package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class n extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f2750b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2751a;

    public n(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet, i11, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        b1 b1VarV = b1.v(context, attributeSet, i.j.f73918j2, i11, i12);
        if (b1VarV.s(i.j.f73928l2)) {
            b(b1VarV.a(i.j.f73928l2, false));
        }
        setBackgroundDrawable(b1VarV.g(i.j.f73923k2));
        b1VarV.w();
    }

    private void b(boolean z11) {
        if (f2750b) {
            this.f2751a = z11;
        } else {
            androidx.core.widget.l.a(this, z11);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12) {
        if (f2750b && this.f2751a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i11, int i12, int i13, int i14) {
        if (f2750b && this.f2751a) {
            i12 -= view.getHeight();
        }
        super.update(view, i11, i12, i13, i14);
    }

    public n(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        a(context, attributeSet, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12, int i13) {
        if (f2750b && this.f2751a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12, i13);
    }
}
