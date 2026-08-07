package b30;

import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lb30/a;", "Lxa/d;", "Landroidx/lifecycle/LifecycleOwner;", "", Action.KEY_ATTRIBUTE, "lifecycleOwner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lxa/c;", "c", "Lxa/c;", "()Lxa/c;", "controller", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a implements xa.d, LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ LifecycleOwner f15994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xa.c controller;

    public a(String key, LifecycleOwner lifecycleOwner) {
        s.k(key, "key");
        s.k(lifecycleOwner, "lifecycleOwner");
        this.key = key;
        this.f15994b = lifecycleOwner;
        xa.c cVarA = xa.c.a(this);
        s.j(cVarA, "create(this)");
        this.controller = cVarA;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final xa.c getController() {
        return this.controller;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.f15994b.getLifecycle();
    }

    @Override // xa.d
    public SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistry savedStateRegistry = this.controller.getSavedStateRegistry();
        s.j(savedStateRegistry, "controller.savedStateRegistry");
        return savedStateRegistry;
    }
}
