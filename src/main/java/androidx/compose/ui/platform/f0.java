package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import p013kotlin.Metadata;
import v3.AndroidPointerIcon;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/f0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lv3/s;", "icon", "Ljn0/h0;", "a", "(Landroid/view/View;Lv3/s;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f5700a = new f0();

    private f0() {
    }

    public final void a(View view, v3.s icon) {
        PointerIcon systemIcon;
        if (icon instanceof v3.a) {
            systemIcon = ((v3.a) icon).a();
        } else {
            systemIcon = icon instanceof AndroidPointerIcon ? PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIcon) icon).getType()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (p013kotlin.jvm.internal.s.f(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
