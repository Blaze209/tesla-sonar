package oi0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "config", "Landroid/widget/LinearLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b4 {
    public static final LinearLayout b(MdocComponent mdocComponent, p5 uiComponentHelper, final Mdoc config) {
        p013kotlin.jvm.internal.s.k(mdocComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        linearLayout.setOrientation(1);
        ri0.y yVarC = ri0.y.c(LayoutInflater.from(linearLayout.getContext()), linearLayout, false);
        p013kotlin.jvm.internal.s.j(yVarC, "inflate(...)");
        linearLayout.addView(yVarC.getRoot());
        ConstraintLayout root = yVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        root.setLayoutParams(layoutParams2);
        final TextView textView = new TextView(linearLayout.getContext());
        textView.setId(mi0.e.f92173h0);
        uiComponentHelper.d(new wn0.a() { // from class: oi0.a4
            @Override // wn0.a
            public final Object invoke() {
                return b4.c(textView, config);
            }
        });
        linearLayout.addView(textView);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = (int) yh0.h.a(8.0d);
        layoutParams4.gravity = 17;
        textView.setLayoutParams(layoutParams4);
        ConstraintLayout root2 = yVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
        linearLayout.setTag(new c4(root2, textView));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(TextView textView, Mdoc mdoc) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        Mdoc.MdocComponentStyle styles = mdoc.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            ui0.e0.n(textView, errorLabelStyle, null, 2, null);
        }
        return jn0.h0.f84049a;
    }
}
