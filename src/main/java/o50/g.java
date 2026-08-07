package o50;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lo50/g;", "Lo50/f;", "<init>", "()V", "", PlaceTypes.ROUTE, "Lo50/i;", "popUpTo", "", "isSingleTop", "Ljn0/h0;", "a", "(Ljava/lang/String;Lo50/i;Z)V", "c", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lo50/e;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_navigationFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "b", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "navigationFlow", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<e> _navigationFlow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<e> navigationFlow;

    public g() {
        MutableSharedFlow<e> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this._navigationFlow = mutableSharedFlowMutableSharedFlow$default;
        this.navigationFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // o50.f
    public void a(String route, i popUpTo, boolean isSingleTop) {
        s.k(route, "route");
        this._navigationFlow.tryEmit(new e.NavigateTo(route, popUpTo, isSingleTop));
    }

    @Override // o50.f
    public SharedFlow<e> b() {
        return this.navigationFlow;
    }

    @Override // o50.f
    public void c() {
        this._navigationFlow.tryEmit(e.a.f96769a);
    }
}
