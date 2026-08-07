package wi0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.g;
import jn0.h0;
import oi0.p5;
import oi0.u4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "", "centerVertical", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final View b(RemoteImage remoteImage, ConstraintLayout container, boolean z11) {
        s.k(remoteImage, "<this>");
        s.k(container, "container");
        Context context = container.getContext();
        s.j(context, "getContext(...)");
        final p5 p5Var = new p5(context);
        View viewM = u4.m(g.j(remoteImage), p5Var, remoteImage);
        container.addView(viewM);
        ViewGroup.LayoutParams layoutParams = viewM.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f6900i = 0;
        bVar.f6922t = 0;
        bVar.f6926v = 0;
        if (z11) {
            bVar.f6906l = 0;
        }
        viewM.setLayoutParams(bVar);
        ki0.s.b(container, new wn0.a() { // from class: wi0.a
            @Override // wn0.a
            public final Object invoke() {
                return b.d(p5Var);
            }
        });
        return viewM;
    }

    public static /* synthetic */ View c(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return b(remoteImage, constraintLayout, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(p5 p5Var) {
        p5Var.c();
        return h0.f84049a;
    }
}
