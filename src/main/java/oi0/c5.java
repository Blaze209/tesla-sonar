package oi0;

import android.view.View;
import android.view.ViewGroup;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loi0/a5;", "Loi0/p5;", "uiComponentHelper", "Landroid/view/View;", "b", "(Loi0/a5;Loi0/p5;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c5 {
    public static final View b(final SpacerComponent spacerComponent, p5 uiComponentHelper) {
        p013kotlin.jvm.internal.s.k(spacerComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        final View view = new View(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        uiComponentHelper.d(new wn0.a() { // from class: oi0.b5
            @Override // wn0.a
            public final Object invoke() {
                return c5.c(view, spacerComponent);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(View view, SpacerComponent spacerComponent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = bo0.n.f(spacerComponent.getHeight(), 1);
        view.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }
}
