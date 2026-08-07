package androidx.p002activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/g0;", "statusBarStyle", "navigationBarStyle", "Ljn0/h0;", "b", "(Landroidx/activity/ComponentActivity;Landroidx/activity/g0;Landroidx/activity/g0;)V", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Landroidx/activity/y;", "c", "Landroidx/activity/y;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1922a = Color.argb(EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1923b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static y f1924c;

    public static final void a(ComponentActivity componentActivity) {
        s.k(componentActivity, "<this>");
        c(componentActivity, null, null, 3, null);
    }

    public static final void b(ComponentActivity componentActivity, g0 statusBarStyle, g0 navigationBarStyle) {
        s.k(componentActivity, "<this>");
        s.k(statusBarStyle, "statusBarStyle");
        s.k(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        s.j(decorView, "window.decorView");
        l<Resources, Boolean> lVarB = statusBarStyle.b();
        Resources resources = decorView.getResources();
        s.j(resources, "view.resources");
        boolean zBooleanValue = lVarB.invoke(resources).booleanValue();
        l<Resources, Boolean> lVarB2 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        s.j(resources2, "view.resources");
        boolean zBooleanValue2 = lVarB2.invoke(resources2).booleanValue();
        y sVar = f1924c;
        if (sVar == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                sVar = new w();
            } else if (i11 >= 29) {
                sVar = new v();
            } else if (i11 >= 28) {
                sVar = new u();
            } else {
                sVar = i11 >= 26 ? new s() : new r();
            }
        }
        y yVar = sVar;
        Window window = componentActivity.getWindow();
        s.j(window, "window");
        yVar.b(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        s.j(window2, "window");
        yVar.a(window2);
    }

    public static /* synthetic */ void c(ComponentActivity componentActivity, g0 g0Var, g0 g0Var2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = g0.Companion.b(g0.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i11 & 2) != 0) {
            g0Var2 = g0.Companion.b(g0.INSTANCE, f1922a, f1923b, null, 4, null);
        }
        b(componentActivity, g0Var, g0Var2);
    }
}
