package r3;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lr3/c;", "Lr3/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lr3/b;", "hapticFeedbackType", "Ljn0/h0;", "a", "(I)V", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    public c(View view) {
        this.view = view;
    }

    @Override // r3.a
    public void a(int hapticFeedbackType) {
        b.Companion companion = b.INSTANCE;
        if (b.b(hapticFeedbackType, companion.a())) {
            this.view.performHapticFeedback(0);
        } else if (b.b(hapticFeedbackType, companion.b())) {
            this.view.performHapticFeedback(9);
        }
    }
}
