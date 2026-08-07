package androidx.p003lifecycle;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/e;", "Landroidx/lifecycle/u;", "", "Landroidx/lifecycle/m;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/m;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "a", "[Landroidx/lifecycle/m;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m[] generatedAdapters;

    public e(m[] generatedAdapters) {
        s.k(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
        s.k(source, "source");
        s.k(event, "event");
        h0 h0Var = new h0();
        for (m mVar : this.generatedAdapters) {
            mVar.a(source, event, false, h0Var);
        }
        for (m mVar2 : this.generatedAdapters) {
            mVar2.a(source, event, true, h0Var);
        }
    }
}
