package le;

import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function0;", "Ljn0/h0;", "callback", "a", "(Landroidx/lifecycle/LifecycleOwner;Lwn0/a;)V", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"le/g$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onResume", "(Landroidx/lifecycle/LifecycleOwner;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f89952a;

        a(wn0.a<h0> aVar) {
            this.f89952a = aVar;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            s.k(owner, "owner");
            this.f89952a.invoke();
        }
    }

    public static final void a(LifecycleOwner lifecycleOwner, wn0.a<h0> callback) {
        s.k(lifecycleOwner, "<this>");
        s.k(callback, "callback");
        lifecycleOwner.getLifecycle().a(new a(callback));
    }
}
