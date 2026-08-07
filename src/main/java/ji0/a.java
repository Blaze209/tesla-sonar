package ji0;

import android.graphics.Color;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import k5.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lji0/a;", "", "Landroid/view/Window;", "window", "", "controlNavigationBar", "controlStatusBar", "<init>", "(Landroid/view/Window;ZZ)V", "", "backgroundColor", "Ljn0/h0;", "b", "(Landroid/view/Window;I)V", "a", "(I)V", "Landroid/view/Window;", "Z", "c", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean controlNavigationBar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean controlStatusBar;

    public a(Window window, boolean z11, boolean z12) {
        s.k(window, "window");
        this.window = window;
        this.controlNavigationBar = z11;
        this.controlStatusBar = z12;
    }

    private final void b(Window window, int i11) {
        int iRgb = Color.rgb(Color.red(i11), Color.green(i11), Color.blue(i11));
        double d11 = d.d(-1, iRgb);
        double d12 = d.d(-16777216, iRgb);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        if (this.controlNavigationBar) {
            windowInsetsControllerCompat.f(d11 < d12);
        }
        if (this.controlStatusBar) {
            windowInsetsControllerCompat.g(d11 < d12);
        }
    }

    public final void a(int backgroundColor) {
        b(this.window, backgroundColor);
    }
}
