package d80;

import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld80/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;", "viewModel", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "a", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.paymentdatacollection.polling.b viewModel;

    public c(com.stripe.android.paymentsheet.paymentdatacollection.polling.b viewModel) {
        s.k(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStart(owner);
        this.viewModel.u();
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        s.k(owner, "owner");
        this.viewModel.s();
        super.onStop(owner);
    }
}
