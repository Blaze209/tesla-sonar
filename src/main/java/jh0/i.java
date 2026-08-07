package jh0;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u0013\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljh0/i;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Ljn0/h0;", "g", "()V", "s", "Landroidx/lifecycle/s0;", "f", "()Landroidx/lifecycle/s0;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljh0/i$a;", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ljh0/i;", "a", "(Landroidx/lifecycle/s0;)Ljh0/i;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        i a(s0 savedStateHandle);
    }

    public i(s0 savedStateHandle) {
        s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final void g() {
        Iterator<T> it = this.savedStateHandle.j().iterator();
        while (it.hasNext()) {
            this.savedStateHandle.n((String) it.next(), null);
        }
    }
}
