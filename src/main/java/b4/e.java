package b4;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lb4/e;", "Landroidx/compose/ui/focus/k;", "<init>", "()V", "", "a", "()Z", "Ljn0/h0;", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "v", "r", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements androidx.compose.ui.focus.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16051a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Boolean canFocusValue;

    private e() {
    }

    public final boolean a() {
        return canFocusValue != null;
    }

    public final void b() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.k
    public void r(boolean z11) {
        canFocusValue = Boolean.valueOf(z11);
    }

    @Override // androidx.compose.ui.focus.k
    public boolean v() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        y3.a.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }
}
