package oi0;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loi0/t5;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "a", "(Loi0/t5;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u5 {
    public static final ButtonWithLoadingIndicator a(t5 t5Var, p5 uiComponentHelper, VerifyPersonaButton config) {
        p013kotlin.jvm.internal.s.k(t5Var, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        if (t5Var.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() != null) {
            return com.withpersona.sdk2.inquiry.steps.ui.components.g.e(t5Var, uiComponentHelper, config);
        }
        return null;
    }
}
