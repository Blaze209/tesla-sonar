package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.swmansion.rnscreens.t;
import com.swmansion.rnscreens.w;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/t;", "", "isSheetFitToContents", "(Lcom/swmansion/rnscreens/t;)Z", "usesFormSheetPresentation", "requiresEnterTransitionPostponing", "Landroid/view/View;", "isLaidOutOrHasCachedLayout", "(Landroid/view/View;)Z", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {
    public static final boolean isLaidOutOrHasCachedLayout(View view) {
        s.k(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean isSheetFitToContents(t tVar) {
        s.k(tVar, "<this>");
        return tVar.getStackPresentation() == t.e.FORM_SHEET && tVar.getSheetDetents().size() == 1 && ((Number) v.o0(tVar.getSheetDetents())).doubleValue() == -1.0d;
    }

    public static final boolean requiresEnterTransitionPostponing(t tVar) {
        w contentWrapper;
        s.k(tVar, "<this>");
        if (usesFormSheetPresentation(tVar)) {
            return (isLaidOutOrHasCachedLayout(tVar) && (contentWrapper = tVar.getContentWrapper()) != null && isLaidOutOrHasCachedLayout(contentWrapper)) ? false : true;
        }
        return false;
    }

    public static final boolean usesFormSheetPresentation(t tVar) {
        s.k(tVar, "<this>");
        return tVar.getStackPresentation() == t.e.FORM_SHEET;
    }
}
