package androidx.p002activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.z0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/r;", "Landroidx/activity/x;", "<init>", "()V", "Landroidx/activity/g0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Ljn0/h0;", "b", "(Landroidx/activity/g0;Landroidx/activity/g0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r extends x {
    @Override // androidx.p002activity.y
    public void b(g0 statusBarStyle, g0 navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        s.k(statusBarStyle, "statusBarStyle");
        s.k(navigationBarStyle, "navigationBarStyle");
        s.k(window, "window");
        s.k(view, "view");
        z0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.getDarkScrim());
        new WindowInsetsControllerCompat(window, view).g(!statusBarIsDark);
    }
}
