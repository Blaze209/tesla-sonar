package androidx.compose.ui.viewinterop;

import android.view.View;
import b4.g0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "Lb4/g0;", "layoutNode", "Ljn0/h0;", "f", "(Landroid/view/View;Lb4/g0;)V", "", "", "g", "(I)F", "h", "(F)F", "type", "Lu3/e;", IntegerTokenConverter.CONVERTER_KEY, "(I)I", "androidx/compose/ui/viewinterop/e$a", "a", "Landroidx/compose/ui/viewinterop/e$a;", "NoOpScrollConnection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f6253a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/e$a", "Lu3/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements u3.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, g0 g0Var) {
        long jF = w.f(g0Var.getCoordinates());
        int iRound = Math.round(j3.g.m(jF));
        int iRound2 = Math.round(j3.g.n(jF));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i11) {
        return i11 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f11) {
        return f11 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i11) {
        return i11 == 0 ? u3.e.INSTANCE.c() : u3.e.INSTANCE.b();
    }
}
