package kotlin;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.r2;
import i3.f;
import p013kotlin.jvm.internal.u;
import t3.b;
import t3.c;
import t3.d;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "Lb2/b0;", "state", "Li3/f;", "focusManager", "b", "(Landroidx/compose/ui/d;Lb2/b0;Li3/f;)Landroidx/compose/ui/d;", "Lt3/b;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt3/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<b, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f15858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f15859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, b0 b0Var) {
            super(1);
            this.f15858c = fVar;
            this.f15859d = b0Var;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zH = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && c.e(d.b(keyEvent), c.INSTANCE.a()) && keyEvent.getSource() != 257) {
                if (r0.c(keyEvent, 19)) {
                    zH = this.f15858c.h(androidx.compose.ui.focus.d.INSTANCE.h());
                } else if (r0.c(keyEvent, 20)) {
                    zH = this.f15858c.h(androidx.compose.ui.focus.d.INSTANCE.a());
                } else if (r0.c(keyEvent, 21)) {
                    zH = this.f15858c.h(androidx.compose.ui.focus.d.INSTANCE.d());
                } else if (r0.c(keyEvent, 22)) {
                    zH = this.f15858c.h(androidx.compose.ui.focus.d.INSTANCE.g());
                } else if (r0.c(keyEvent, 23)) {
                    r2 keyboardController = this.f15859d.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.show();
                    }
                    zH = true;
                }
            }
            return Boolean.valueOf(zH);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(b bVar) {
            return a(bVar.getNativeKeyEvent());
        }
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, b0 b0Var, f fVar) {
        return androidx.compose.ui.input.key.a.b(dVar, new a(fVar, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i11) {
        return t3.f.b(d.a(keyEvent)) == i11;
    }
}
