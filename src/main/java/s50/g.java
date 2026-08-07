package s50;

import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import q50.TopAppBarState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls50/f;", "b", "(Lr2/l;I)Ls50/f;", "Ls50/c;", "", "forceHideStripeLogo", "Lq50/b;", "c", "(Ls50/c;Z)Lq50/b;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {
    public static final f b(l lVar, int i11) {
        lVar.H(688516201);
        if (o.J()) {
            o.S(688516201, i11, -1, "com.stripe.android.financialconnections.presentation.parentViewModel (FinancialConnectionsSheetNativeViewModel.kt:596)");
        }
        f fVarW = b.b(lVar, 0).w();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return fVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState c(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, boolean z11) {
        return new TopAppBarState(financialConnectionsSheetNativeState.getReducedBranding(), z11, false, financialConnectionsSheetNativeState.getTheme(), financialConnectionsSheetNativeState.getTestMode(), false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
    }
}
