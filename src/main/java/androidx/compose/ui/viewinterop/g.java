package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import b4.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Landroidx/compose/ui/d$c;", "Landroid/view/View;", "g", "(Landroidx/compose/ui/d$c;)Landroid/view/View;", "other", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Landroid/view/View;)Z", "Li3/i;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Li3/i;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.focus.i.a(androidx.compose.ui.focus.i.a(dVar.g(FocusGroupPropertiesElement.f6170b)).g(FocusTargetPropertiesElement.f6171b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(i3.i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        j3.i iVarO = iVar.o();
        if (iVarO == null) {
            return null;
        }
        return new Rect((((int) iVarO.getLeft()) + iArr[0]) - iArr2[0], (((int) iVarO.getTop()) + iArr[1]) - iArr2[1], (((int) iVarO.getRight()) + iArr[0]) - iArr2[0], (((int) iVarO.getBottom()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(androidx.compose.ui.d.c cVar) {
        View viewQ = k.m(cVar.getNode()).Q();
        if (viewQ != null) {
            return viewQ;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
