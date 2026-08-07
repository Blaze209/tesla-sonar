package rj;

import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class k implements j, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Set<l> f108417a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Lifecycle f108418b;

    k(Lifecycle lifecycle) {
        this.f108418b = lifecycle;
        lifecycle.a(this);
    }

    @Override // rj.j
    public void a(@NonNull l lVar) {
        this.f108417a.add(lVar);
        if (this.f108418b.getState() == Lifecycle.State.DESTROYED) {
            lVar.onDestroy();
        } else if (this.f108418b.getState().isAtLeast(Lifecycle.State.STARTED)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @Override // rj.j
    public void b(@NonNull l lVar) {
        this.f108417a.remove(lVar);
    }

    @k0(Lifecycle.a.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = xj.l.k(this.f108417a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().d(this);
    }

    @k0(Lifecycle.a.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = xj.l.k(this.f108417a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @k0(Lifecycle.a.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = xj.l.k(this.f108417a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
