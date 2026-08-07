package ce;

import androidx.p003lifecycle.s0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lce/q;", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "a", "Landroidx/lifecycle/s0;", "", "paymentData", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "getNativeRedirectData", "b", "nativeRedirectData", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    public q(s0 savedStateHandle) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    public final String a() {
        return (String) this.savedStateHandle.f("payment_data");
    }

    public final void b(String str) {
        this.savedStateHandle.n("native_redirect_data", str);
    }

    public final void c(String str) {
        this.savedStateHandle.n("payment_data", str);
    }
}
