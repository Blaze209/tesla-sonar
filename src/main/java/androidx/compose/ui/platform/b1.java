package androidx.compose.ui.platform;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/b1;", "Landroidx/compose/ui/platform/r2;", "Lo4/q0;", "textInputService", "<init>", "(Lo4/q0;)V", "Ljn0/h0;", "show", "()V", "hide", "a", "Lo4/q0;", "getTextInputService", "()Lo4/q0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b1 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o4.q0 textInputService;

    public b1(o4.q0 q0Var) {
        this.textInputService = q0Var;
    }

    @Override // androidx.compose.ui.platform.r2
    public void hide() {
        this.textInputService.b();
    }

    @Override // androidx.compose.ui.platform.r2
    public void show() {
        this.textInputService.c();
    }
}
