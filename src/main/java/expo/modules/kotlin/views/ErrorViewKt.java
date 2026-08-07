package expo.modules.kotlin.views;

import android.view.View;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isErrorView", "", "Landroid/view/View;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorViewKt {
    public static final boolean isErrorView(View view) {
        s.k(view, "<this>");
        return (view instanceof ErrorView) || (view instanceof ErrorGroupView);
    }
}
