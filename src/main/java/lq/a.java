package lq;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010$\"\u0004\b\u0014\u0010&R$\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010-\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R$\u0010.\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Llq/a;", "Llq/b;", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroid/view/View;Landroid/view/Window;)V", "Lk3/p1;", "color", "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(JZLwn0/l;)V", "navigationBarContrastEnforced", "h", "(JZZLwn0/l;)V", "a", "Landroid/view/View;", "b", "Landroid/view/Window;", "Landroidx/core/view/WindowInsetsControllerCompat;", "c", "Landroidx/core/view/WindowInsetsControllerCompat;", "windowInsetsController", "", "value", "getSystemBarsBehavior", "()I", "setSystemBarsBehavior", "(I)V", "systemBarsBehavior", "isStatusBarVisible", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isNavigationBarVisible", "getStatusBarDarkContentEnabled", "l", "statusBarDarkContentEnabled", "getNavigationBarDarkContentEnabled", "k", "navigationBarDarkContentEnabled", "isNavigationBarContrastEnforced", "j", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WindowInsetsControllerCompat windowInsetsController;

    public a(View view, Window window) {
        s.k(view, "view");
        this.view = view;
        this.window = window;
        this.windowInsetsController = window != null ? z0.a(window, view) : null;
    }

    @Override // lq.b
    public void a(boolean z11) {
        if (z11) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.i(WindowInsetsCompat.n.f());
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.windowInsetsController;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.c(WindowInsetsCompat.n.f());
        }
    }

    @Override // lq.b
    public void d(boolean z11) {
        if (z11) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.i(WindowInsetsCompat.n.g());
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.windowInsetsController;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.c(WindowInsetsCompat.n.g());
        }
    }

    @Override // lq.b
    public void h(long color, boolean darkIcons, boolean navigationBarContrastEnforced, l<? super p1, p1> transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        s.k(transformColorForLightContent, "transformColorForLightContent");
        k(darkIcons);
        j(navigationBarContrastEnforced);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && ((windowInsetsControllerCompat = this.windowInsetsController) == null || !windowInsetsControllerCompat.d())) {
            color = transformColorForLightContent.invoke(p1.l(color)).getValue();
        }
        window.setNavigationBarColor(r1.k(color));
    }

    @Override // lq.b
    public void i(long color, boolean darkIcons, l<? super p1, p1> transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        s.k(transformColorForLightContent, "transformColorForLightContent");
        l(darkIcons);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (darkIcons && ((windowInsetsControllerCompat = this.windowInsetsController) == null || !windowInsetsControllerCompat.e())) {
            color = transformColorForLightContent.invoke(p1.l(color)).getValue();
        }
        window.setStatusBarColor(r1.k(color));
    }

    public void j(boolean z11) {
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (window = this.window) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z11);
    }

    public void k(boolean z11) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.f(z11);
    }

    public void l(boolean z11) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.g(z11);
    }

    @Override // lq.b
    public void setSystemBarsBehavior(int i11) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.h(i11);
    }
}
