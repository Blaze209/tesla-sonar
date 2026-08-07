package lq;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.e;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u0007H\u0082\u0010¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroid/view/Window;", "window", "Llq/b;", "e", "(Landroid/view/Window;Lr2/l;II)Llq/b;", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)Landroid/view/Window;", "Landroid/content/Context;", "c", "(Landroid/content/Context;)Landroid/view/Window;", "Lk3/p1;", "a", "J", "BlackScrim", "Lkotlin/Function1;", "b", "Lwn0/l;", "BlackScrimmed", "systemuicontroller_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f90667a = r1.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.3f, null, 16, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l<p1, p1> f90668b = a.f90669c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk3/p1;", "original", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<p1, p1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f90669c = new a();

        a() {
            super(1);
        }

        public final long a(long j11) {
            return r1.h(c.f90667a, j11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p1 invoke(p1 p1Var) {
            return p1.l(a(p1Var.getValue()));
        }
    }

    private static final Window c(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.j(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }

    private static final Window d(p020r2.l lVar, int i11) {
        lVar.H(1009281237);
        if (o.J()) {
            o.S(1009281237, i11, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:208)");
        }
        ViewParent parent = ((View) lVar.U(AndroidCompositionLocals_androidKt.k())).getParent();
        k kVar = parent instanceof k ? (k) parent : null;
        Window window = kVar != null ? kVar.getWindow() : null;
        if (window == null) {
            Context context = ((View) lVar.U(AndroidCompositionLocals_androidKt.k())).getContext();
            s.j(context, "getContext(...)");
            window = c(context);
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return window;
    }

    @e
    public static final b e(Window window, p020r2.l lVar, int i11, int i12) {
        lVar.H(-715745933);
        if ((i12 & 1) != 0) {
            window = d(lVar, 0);
        }
        if (o.J()) {
            o.S(-715745933, i11, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:201)");
        }
        View view = (View) lVar.U(AndroidCompositionLocals_androidKt.k());
        lVar.H(-1044852491);
        boolean zN = lVar.n(view) | lVar.n(window);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new lq.a(view, window);
            lVar.B(objI);
        }
        lq.a aVar = (lq.a) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return aVar;
    }
}
