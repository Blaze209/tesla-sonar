package rc;

import android.view.View;
import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrc/s;", "Lrc/d;", "Landroid/view/View;", "view", "Lkotlinx/coroutines/Deferred;", "Lrc/j;", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "a", "Landroid/view/View;", "b", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "(Lkotlinx/coroutines/Deferred;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Deferred<? extends j> job;

    public s(View view, Deferred<? extends j> deferred) {
        this.view = view;
        this.job = deferred;
    }

    public void a(Deferred<? extends j> deferred) {
        this.job = deferred;
    }
}
