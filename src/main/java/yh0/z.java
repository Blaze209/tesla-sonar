package yh0;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.material.snackbar.Snackbar;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/view/View;", "snackbarContainer", "", AnalyticsAttribute.Error, "Lkotlin/Function0;", "Ljn0/h0;", "onDismissed", "anchorView", "", "maxLines", "duration", "a", "(Landroid/view/View;Ljava/lang/String;Lwn0/a;Landroid/view/View;II)V", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"yh0/z$a", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "transientBottomBar", "", "event", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/android/material/snackbar/Snackbar;I)V", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends Snackbar.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f125597a;

        a(wn0.a<h0> aVar) {
            this.f125597a = aVar;
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar transientBottomBar, int event) {
            this.f125597a.invoke();
        }
    }

    public static final void a(View snackbarContainer, String str, wn0.a<h0> onDismissed, View view, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(snackbarContainer, "snackbarContainer");
        p013kotlin.jvm.internal.s.k(onDismissed, "onDismissed");
        if (str == null) {
            return;
        }
        Snackbar snackbarL0 = Snackbar.l0(snackbarContainer, str, i12);
        p013kotlin.jvm.internal.s.j(snackbarL0, "make(...)");
        snackbarL0.o0(i11);
        if (view != null) {
            snackbarL0.U(view);
        }
        snackbarL0.u(new a(onDismissed)).Z();
    }

    public static /* synthetic */ void b(View view, String str, wn0.a aVar, View view2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            view2 = null;
        }
        View view3 = view2;
        if ((i13 & 16) != 0) {
            i11 = 2;
        }
        int i14 = i11;
        if ((i13 & 32) != 0) {
            i12 = 0;
        }
        a(view, str, aVar, view3, i14, i12);
    }
}
