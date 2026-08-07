package oi0;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loi0/k5;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "config", "Landroid/widget/TextView;", "b", "(Loi0/k5;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;)Landroid/widget/TextView;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m5 {
    public static final TextView b(TitleComponent titleComponent, p5 uiComponentHelper, final Title config) {
        p013kotlin.jvm.internal.s.k(titleComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.x xVarC = ri0.x.c(uiComponentHelper.getLayoutInflater());
        Title.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            TextView textView = xVarC.f108404b;
            p013kotlin.jvm.internal.s.j(textView, "textView");
            pi0.g.d(textView, attributes.getText());
            uiComponentHelper.d(new wn0.a() { // from class: oi0.l5
                @Override // wn0.a
                public final Object invoke() {
                    return m5.c(config, xVarC);
                }
            });
        }
        TextView root = xVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(Title title, ri0.x xVar) {
        TextBasedComponentStyle styles = title.getStyles();
        if (styles != null) {
            TextView textView = xVar.f108404b;
            p013kotlin.jvm.internal.s.j(textView, "textView");
            ui0.e0.n(textView, styles, null, 2, null);
        }
        return jn0.h0.f84049a;
    }
}
