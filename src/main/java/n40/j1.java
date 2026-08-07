package n40;

import p013kotlin.Metadata;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln40/j1;", "Ln40/e0;", "Ls50/c;", "initialState", "<init>", "(Ls50/c;)V", "", "invoke", "()Z", "a", "Ls50/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j1 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FinancialConnectionsSheetNativeState initialState;

    public j1(FinancialConnectionsSheetNativeState initialState) {
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        this.initialState = initialState;
    }

    @Override // n40.e0
    public boolean invoke() {
        return this.initialState.getIsLinkWithStripe();
    }
}
