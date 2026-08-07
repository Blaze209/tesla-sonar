package py;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f104077a;

    c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(com.henninghall.date_picker.j.f45213k);
        this.f104077a = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    void a(View view) {
        this.f104077a.addView(view);
    }

    void b() {
        this.f104077a.removeAllViews();
    }
}
