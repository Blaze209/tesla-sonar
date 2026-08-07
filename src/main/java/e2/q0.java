package e2;

import androidx.compose.ui.platform.e2;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.r2;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le2/q0;", "Lo4/j0;", "<init>", "()V", "Le2/q0$a;", "node", "Ljn0/h0;", "j", "(Le2/q0$a;)V", "l", "h", "f", "k", "<set-?>", "a", "Le2/q0$a;", IntegerTokenConverter.CONVERTER_KEY, "()Le2/q0$a;", "textInputModifierNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q0 implements o4.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a textInputModifierNode;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u0004\u0018\u00010\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Le2/q0$a;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/e2;", "Lkotlin/coroutines/Continuation;", "", "block", "Lkotlinx/coroutines/Job;", "f0", "(Lwn0/p;)Lkotlinx/coroutines/Job;", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "Lz3/v;", "i0", "()Lz3/v;", "layoutCoordinates", "Lb2/b0;", "K0", "()Lb2/b0;", "legacyTextFieldState", "Lh2/h0;", "x0", "()Lh2/h0;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        kotlin.b0 K0();

        Job f0(wn0.p<? super e2, ? super Continuation<?>, ? extends Object> block);

        r2 getSoftwareKeyboardController();

        e3 getViewConfiguration();

        z3.v i0();

        p007h2.h0 x0();
    }

    @Override // o4.j0
    public final void f() {
        r2 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // o4.j0
    public final void h() {
        r2 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final a getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void j(a node) {
        if (this.textInputModifierNode != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = node;
    }

    public abstract void k();

    public final void l(a node) {
        if (this.textInputModifierNode == node) {
            this.textInputModifierNode = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + node + " but was " + this.textInputModifierNode).toString());
    }
}
