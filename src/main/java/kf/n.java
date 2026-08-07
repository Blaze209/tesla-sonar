package kf;

import androidx.recyclerview.widget.RecyclerView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lkf/n;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lhf/c;", "binding", "<init>", "(Lhf/c;)V", "Lkf/m;", "item", "Ljn0/h0;", "a", "(Lkf/m;)V", "Lhf/c;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hf.c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hf.c binding) {
        super(binding.getRoot());
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
    }

    public final void a(m item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        this.binding.f72637b.setText(item.getText());
    }
}
