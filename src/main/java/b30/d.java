package b30;

import android.view.View;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lb30/d;", "Landroidx/lifecycle/LifecycleOwner;", "Ljn0/h0;", "o", "()V", "l1", "a", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface d extends LifecycleOwner {

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16004a;

    /* JADX INFO: renamed from: b30.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb30/d$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/lifecycle/Lifecycle;", "b", "(Landroid/view/View;)Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function1;", "findParentLifecycle", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Lwn0/l;)V", "Lb30/d;", "c", "(Landroid/view/View;)Lb30/d;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16004a = new Companion();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: b30.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "v", "Landroidx/lifecycle/Lifecycle;", "a", "(Landroid/view/View;)Landroidx/lifecycle/Lifecycle;"}, k = 3, mv = {1, 6, 0})
        public static final class C0303a extends u implements l<View, Lifecycle> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0303a f16005c = new C0303a();

            C0303a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Lifecycle invoke(View v11) {
                s.k(v11, "v");
                return Companion.f16004a.b(v11);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lifecycle b(View view) {
            LifecycleOwner lifecycleOwnerA;
            Object parent = view.getParent();
            Lifecycle lifecycle = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && (lifecycleOwnerA = c.f16002a.a(view2)) != null) {
                lifecycle = lifecycleOwnerA.getLifecycle();
            }
            if (lifecycle != null) {
                return lifecycle;
            }
            throw new IllegalStateException(("Expected parent or context of " + view + " to have or be a ViewTreeLifecycleOwner").toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(Companion companion, View view, l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                lVar = C0303a.f16005c;
            }
            companion.d(view, lVar);
        }

        public final d c(View view) {
            s.k(view, "view");
            LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
            if (lifecycleOwnerA instanceof d) {
                return (d) lifecycleOwnerA;
            }
            return null;
        }

        public final void d(View view, l<? super View, ? extends Lifecycle> findParentLifecycle) {
            s.k(view, "view");
            s.k(findParentLifecycle, "findParentLifecycle");
            b bVar = new b(findParentLifecycle, false, 2, null);
            androidx.p003lifecycle.View.b(view, bVar);
            view.addOnAttachStateChangeListener(bVar);
        }
    }

    void o();
}
