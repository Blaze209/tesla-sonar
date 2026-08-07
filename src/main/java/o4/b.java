package o4;

import android.view.inputmethod.CursorAnchorInfo;
import k3.z3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo4/b;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lj3/i;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lj3/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f96385a = new b();

    private b() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, j3.i decorationBoxBounds) {
        return builder.setEditorBoundsInfo(e2.f.a().setEditorBounds(z3.c(decorationBoxBounds)).setHandwritingBounds(z3.c(decorationBoxBounds)).build());
    }
}
