package androidx.compose.ui.platform;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/n3;", "Landroidx/compose/ui/platform/m3;", "<init>", "()V", "Lr2/p1;", "", "a", "Lr2/p1;", "_isWindowFocused", "value", "()Z", "c", "(Z)V", "isWindowFocused", "Lv3/j0;", "getKeyboardModifiers-k7X9c1A", "()I", "b", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "keyboardModifiers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n3 implements m3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p020r2.p1<v3.j0> f5887c = p020r2.s3.d(v3.j0.a(v3.q.a()), null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1<Boolean> _isWindowFocused = p020r2.s3.d(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.m3
    public boolean a() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    public void b(int i11) {
        f5887c.setValue(v3.j0.a(i11));
    }

    public void c(boolean z11) {
        this._isWindowFocused.setValue(Boolean.valueOf(z11));
    }
}
