package i3;

import androidx.compose.ui.focus.FocusTargetNode;
import b4.g0;
import b4.j1;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Li3/t;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetNode;)Li3/t;", "Ljn0/h0;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "b", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final t b(FocusTargetNode focusTargetNode) {
        g0 layoutNode;
        j1 owner;
        i focusOwner;
        z0 coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        b4.k.n(focusTargetNode).getFocusOwner().j(focusTargetNode);
    }

    public static final t d(FocusTargetNode focusTargetNode) {
        return b4.k.n(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
