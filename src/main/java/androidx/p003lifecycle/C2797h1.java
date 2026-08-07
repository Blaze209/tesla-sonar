package androidx.p003lifecycle;

import android.view.View;
import m7.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: renamed from: androidx.lifecycle.h1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Ljn0/h0;", "b", "(Landroid/view/View;Landroidx/lifecycle/f1;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/f1;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C2797h1 {

    /* JADX INFO: renamed from: androidx.lifecycle.h1$a, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class C0176a extends u implements l<View, View> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0176a f8811c = new C0176a();

        C0176a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            s.k(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h1$b, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/lifecycle/f1;", "a", "(Landroid/view/View;)Landroidx/lifecycle/f1;"}, k = 3, mv = {1, 8, 0})
    static final class C0177b extends u implements l<View, f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0177b f8812c = new C0177b();

        C0177b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1 invoke(View view) {
            s.k(view, "view");
            Object tag = view.getTag(c.f91563a);
            if (tag instanceof f1) {
                return (f1) tag;
            }
            return null;
        }
    }

    public static final f1 a(View view) {
        s.k(view, "<this>");
        return (f1) ho0.l.M(ho0.l.V(ho0.l.q(view, C0176a.f8811c), C0177b.f8812c));
    }

    public static final void b(View view, f1 f1Var) {
        s.k(view, "<this>");
        view.setTag(c.f91563a, f1Var);
    }
}
