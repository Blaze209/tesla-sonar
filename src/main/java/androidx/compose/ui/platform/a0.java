package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/a0;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "Landroid/view/View;", "view", "Ljn0/h0;", "a", "(Landroid/view/ViewStructure;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f5641a = new a0();

    private a0() {
    }

    public final void a(ViewStructure structure, View view) {
        structure.setClassName(view.getAccessibilityClassName().toString());
    }
}
