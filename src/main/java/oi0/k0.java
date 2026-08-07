package oi0;

import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loi0/i0;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "config", "Landroid/widget/ImageView;", "b", "(Loi0/i0;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k0 {
    public static final ImageView b(ImagePreviewComponent imagePreviewComponent, p5 uiComponentHelper, final CombinedStepImagePreview config) {
        p013kotlin.jvm.internal.s.k(imagePreviewComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final bi0.f fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.d(new wn0.a() { // from class: oi0.j0
            @Override // wn0.a
            public final Object invoke() {
                return k0.c(fVarC, config);
            }
        });
        ImageView root = fVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(bi0.f fVar, CombinedStepImagePreview combinedStepImagePreview) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ui0.g.b(imageView, combinedStepImagePreview.getStyles());
        return jn0.h0.f84049a;
    }
}
