package androidx.p003lifecycle;

import l7.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: renamed from: androidx.lifecycle.g1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Ljn0/h0;", "b", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class View {

    /* JADX INFO: renamed from: androidx.lifecycle.g1$a, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "currentView", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class C0174a extends u implements l<android.view.View, android.view.View> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0174a f8805c = new C0174a();

        C0174a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View invoke(android.view.View currentView) {
            s.k(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.g1$b, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Landroidx/lifecycle/LifecycleOwner;", "a", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;"}, k = 3, mv = {1, 8, 0})
    static final class C0175b extends u implements l<android.view.View, LifecycleOwner> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0175b f8806c = new C0175b();

        C0175b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LifecycleOwner invoke(android.view.View viewParent) {
            s.k(viewParent, "viewParent");
            Object tag = viewParent.getTag(a.f89676a);
            if (tag instanceof LifecycleOwner) {
                return (LifecycleOwner) tag;
            }
            return null;
        }
    }

    public static final LifecycleOwner a(android.view.View view) {
        s.k(view, "<this>");
        return (LifecycleOwner) ho0.l.M(ho0.l.V(ho0.l.q(view, C0174a.f8805c), C0175b.f8806c));
    }

    public static final void b(android.view.View view, LifecycleOwner lifecycleOwner) {
        s.k(view, "<this>");
        view.setTag(a.f89676a, lifecycleOwner);
    }
}
