package oi0;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import java.util.List;
import mi0.UiComponentScreen;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "Loi0/n5;", "old", "new", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Loi0/n5;Loi0/n5;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "Loi0/p5;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Loi0/p5;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {
    public static final View a(CreatePersonaSheetComponent createPersonaSheetComponent, p5 uiComponentHelper) {
        p013kotlin.jvm.internal.s.k(createPersonaSheetComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        return null;
    }

    public static final CreatePersonaSheetComponent b(CreatePersonaSheetComponent createPersonaSheetComponent, n5 old, n5 n5Var) {
        p013kotlin.jvm.internal.s.k(createPersonaSheetComponent, "<this>");
        p013kotlin.jvm.internal.s.k(old, "old");
        p013kotlin.jvm.internal.s.k(n5Var, "new");
        UiComponentScreen screen = createPersonaSheetComponent.getScreen();
        List<n5> components = createPersonaSheetComponent.getScreen().getComponents();
        return CreatePersonaSheetComponent.b(createPersonaSheetComponent, null, null, null, false, false, false, false, UiComponentScreen.c(screen, components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.g.l(components, old, n5Var) : null, null, null, 6, null), 127, null);
    }
}
