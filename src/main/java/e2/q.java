package e2;

import android.view.inputmethod.EditorInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le2/q;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Ljn0/h0;", "a", "(Landroid/view/inputmethod/EditorInfo;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f61524a = new q();

    private q() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(p013kotlin.collections.v.p(j.a(), l.a(), m.a(), k.a(), n.a(), o.a(), p.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(d1.i(j.a(), l.a(), m.a(), k.a()));
    }
}
