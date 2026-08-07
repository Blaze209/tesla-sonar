package yh0;

import androidx.recyclerview.widget.RecyclerView;
import gb.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lyh0/b0;", "Lgb/a;", "T", "Landroidx/recyclerview/widget/RecyclerView$g0;", "binding", "<init>", "(Lgb/a;)V", "a", "Lgb/a;", "()Lgb/a;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0<T extends gb.a> extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(T binding) {
        super(binding.getRoot());
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
    }

    public final T a() {
        return this.binding;
    }
}
