package yh0;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/Window;", "", "backgroundColor", "Ljn0/h0;", "a", "(Landroid/view/Window;I)V", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f0 {
    public static final void a(Window window, int i11) {
        p013kotlin.jvm.internal.s.k(window, "<this>");
        int iRgb = Color.rgb(Color.red(i11), Color.green(i11), Color.blue(i11));
        double d11 = k5.d.d(-1, iRgb);
        double d12 = k5.d.d(-16777216, iRgb);
        View decorView = window.getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "getDecorView(...)");
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, decorView);
        windowInsetsControllerCompat.g(d11 < d12);
        windowInsetsControllerCompat.f(d11 < d12);
    }
}
