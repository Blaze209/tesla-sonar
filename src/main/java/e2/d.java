package e2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le2/d;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/view/View;", "view", "Ljn0/h0;", "a", "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f61480a = new d();

    private d() {
    }

    public final void a(InputMethodManager imm, View view) {
        imm.startStylusHandwriting(view);
    }
}
