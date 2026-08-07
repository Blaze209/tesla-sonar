package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00132\u00020\u0001:\u0004=A25B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u001cJ\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010\u001cJ%\u00105\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010)\u001a\u00020\u0017H&¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0010¢\u0006\u0004\b7\u0010 J\u0015\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/a1;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/a1$d;", "o", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/a1$d;", "p", "Landroidx/fragment/app/a1$d$b;", "finalState", "Landroidx/fragment/app/a1$d$a;", "lifecycleImpact", "Landroidx/fragment/app/p0;", "fragmentStateManager", "Ljn0/h0;", "g", "(Landroidx/fragment/app/a1$d$b;Landroidx/fragment/app/a1$d$a;Landroidx/fragment/app/p0;)V", "", "newPendingOperations", "", "x", "(Ljava/util/List;)Z", "w", "C", "()V", "", "operations", "B", "(Ljava/util/List;)V", "s", "(Landroidx/fragment/app/p0;)Landroidx/fragment/app/a1$d$a;", "j", "(Landroidx/fragment/app/a1$d$b;Landroidx/fragment/app/p0;)V", "m", "(Landroidx/fragment/app/p0;)V", "k", "l", "isPop", "D", "(Z)V", "z", "y", "()Z", "r", "n", "operation", "c", "(Landroidx/fragment/app/a1$d;)V", "q", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Z)V", "e", "Landroidx/activity/b;", "backEvent", "A", "(Landroidx/activity/b;)V", "f", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> pendingOperations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d> runningOperations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean runningNonSeekableTransition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean operationDirectionIsPop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isContainerPostponed;

    /* JADX INFO: renamed from: androidx.fragment.app.a1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/a1$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/a1;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/a1;", "Landroidx/fragment/app/b1;", "factory", "b", "(Landroid/view/ViewGroup;Landroidx/fragment/app/b1;)Landroidx/fragment/app/a1;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a1 a(ViewGroup container, FragmentManager fragmentManager) {
            p013kotlin.jvm.internal.s.k(container, "container");
            p013kotlin.jvm.internal.s.k(fragmentManager, "fragmentManager");
            b1 b1VarG0 = fragmentManager.G0();
            p013kotlin.jvm.internal.s.j(b1VarG0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, b1VarG0);
        }

        public final a1 b(ViewGroup container, b1 factory) {
            p013kotlin.jvm.internal.s.k(container, "container");
            p013kotlin.jvm.internal.s.k(factory, "factory");
            Object tag = container.getTag(f7.b.f64525b);
            if (tag instanceof a1) {
                return (a1) tag;
            }
            a1 a1VarA = factory.a(container);
            p013kotlin.jvm.internal.s.j(a1VarA, "factory.createController(container)");
            container.setTag(f7.b.f64525b, a1VarA);
            return a1VarA;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/a1$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Ljn0/h0;", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", DateTokenConverter.CONVERTER_KEY, "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSeekingSupported;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isCancelled;

        public final void a(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void c(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
        }

        public void d(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
        }

        public void e(androidx.p002activity.b backEvent, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(backEvent, "backEvent");
            p013kotlin.jvm.internal.s.k(container, "container");
        }

        public void f(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
        }

        public final void g(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/a1$c;", "Landroidx/fragment/app/a1$d;", "Landroidx/fragment/app/a1$d$b;", "finalState", "Landroidx/fragment/app/a1$d$a;", "lifecycleImpact", "Landroidx/fragment/app/p0;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/a1$d$b;Landroidx/fragment/app/a1$d$a;Landroidx/fragment/app/p0;)V", "Ljn0/h0;", "p", "()V", DateTokenConverter.CONVERTER_KEY, "l", "Landroidx/fragment/app/p0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final p0 fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, p0 fragmentStateManager) {
            p013kotlin.jvm.internal.s.k(finalState, "finalState");
            p013kotlin.jvm.internal.s.k(lifecycleImpact, "lifecycleImpact");
            p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
            Fragment fragmentK = fragmentStateManager.k();
            p013kotlin.jvm.internal.s.j(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.a1.d
        public void d() {
            super.d();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.a1.d
        public void p() {
            if (getIsStarted()) {
                return;
            }
            super.p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    Fragment fragmentK = this.fragmentStateManager.k();
                    p013kotlin.jvm.internal.s.j(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    p013kotlin.jvm.internal.s.j(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.fragmentStateManager.k();
            p013kotlin.jvm.internal.s.j(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = getFragment().requireView();
            p013kotlin.jvm.internal.s.j(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.fragmentStateManager.b();
                viewRequireView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            if (viewRequireView2.getAlpha() == BitmapDescriptorFactory.HUE_RED && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/a1$d;", "", "Landroidx/fragment/app/a1$d$b;", "finalState", "Landroidx/fragment/app/a1$d$a;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/a1$d$b;Landroidx/fragment/app/a1$d$a;Landroidx/fragment/app/Fragment;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "Ljn0/h0;", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/a1$d$b;Landroidx/fragment/app/a1$d$a;)V", "Ljava/lang/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/a1$b;", "effect", "b", "(Landroidx/fragment/app/a1$b;)V", "e", "p", "()V", DateTokenConverter.CONVERTER_KEY, "Landroidx/fragment/app/a1$d$b;", "g", "()Landroidx/fragment/app/a1$d$b;", "setFinalState", "(Landroidx/fragment/app/a1$d$b;)V", "Landroidx/fragment/app/a1$d$a;", IntegerTokenConverter.CONVERTER_KEY, "()Landroidx/fragment/app/a1$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/a1$d$a;)V", "Landroidx/fragment/app/Fragment;", "h", "()Landroidx/fragment/app/Fragment;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b finalState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a lifecycleImpact;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Fragment fragment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Runnable> completionListeners;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isAwaitingContainerChanges;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<b> _effects;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<b> effects;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/a1$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/a1$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "Ljn0/h0;", "applyState", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "Companion", "a", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: androidx.fragment.app.a1$d$b$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/a1$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/a1$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/a1$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/a1$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    p013kotlin.jvm.internal.s.k(view, "<this>");
                    return (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.a1$d$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class C0168b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f8469a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f8469a = iArr;
                }
            }

            public static final b from(int i11) {
                return INSTANCE.b(i11);
            }

            public final void applyState(View view, ViewGroup container) {
                p013kotlin.jvm.internal.s.k(view, "view");
                p013kotlin.jvm.internal.s.k(container, "container");
                int i11 = C0168b.f8469a[ordinal()];
                if (i11 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i11 == 3) {
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i11 != 4) {
                    return;
                }
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8470a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f8470a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, Fragment fragment) {
            p013kotlin.jvm.internal.s.k(finalState, "finalState");
            p013kotlin.jvm.internal.s.k(lifecycleImpact, "lifecycleImpact");
            p013kotlin.jvm.internal.s.k(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(Runnable listener) {
            p013kotlin.jvm.internal.s.k(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void b(b effect) {
            p013kotlin.jvm.internal.s.k(effect, "effect");
            this._effects.add(effect);
        }

        public final void c(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = p013kotlin.collections.v.m1(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            p013kotlin.jvm.internal.s.k(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        public final List<b> f() {
            return this.effects;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Fragment getFragment() {
            return this.fragment;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(b finalState, a lifecycleImpact) {
            p013kotlin.jvm.internal.s.k(finalState, "finalState");
            p013kotlin.jvm.internal.s.k(lifecycleImpact, "lifecycleImpact");
            int i11 = c.f8470a[lifecycleImpact.ordinal()];
            if (i11 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i11 == 2) {
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i11 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + CoreConstants.DOT);
                }
                this.finalState = finalState;
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public final void q(boolean z11) {
            this.isAwaitingContainerChanges = z11;
        }

        public final void r(boolean z11) {
            this.isSeeking = z11;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + CoreConstants.CURLY_RIGHT;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8471a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8471a = iArr;
        }
    }

    public a1(ViewGroup container) {
        p013kotlin.jvm.internal.s.k(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void B(List<d> operations) {
        int size = operations.size();
        for (int i11 = 0; i11 < size; i11++) {
            operations.get(i11).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            p013kotlin.collections.v.E(arrayList, ((d) it.next()).f());
        }
        List listM1 = p013kotlin.collections.v.m1(p013kotlin.collections.v.r1(arrayList));
        int size2 = listM1.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((b) listM1.get(i12)).g(this.container);
        }
    }

    private final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View viewRequireView = dVar.getFragment().requireView();
                p013kotlin.jvm.internal.s.j(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.INSTANCE.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b finalState, d.a lifecycleImpact, p0 fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragmentK = fragmentStateManager.k();
                p013kotlin.jvm.internal.s.j(fragmentK, "fragmentStateManager.fragment");
                d dVarO = o(fragmentK);
                if (dVarO == null) {
                    if (fragmentStateManager.k().mTransitioning) {
                        Fragment fragmentK2 = fragmentStateManager.k();
                        p013kotlin.jvm.internal.s.j(fragmentK2, "fragmentStateManager.fragment");
                        dVarO = p(fragmentK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        a1.h(this.f8702a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        a1.i(this.f8709a, cVar);
                    }
                });
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a1 this$0, c operation) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            p013kotlin.jvm.internal.s.j(view, "operation.fragment.mView");
            finalState.applyState(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a1 this$0, c operation) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final d o(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (p013kotlin.jvm.internal.s.f(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    private final d p(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (p013kotlin.jvm.internal.s.f(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public static final a1 u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return INSTANCE.a(viewGroup, fragmentManager);
    }

    public static final a1 v(ViewGroup viewGroup, b1 b1Var) {
        return INSTANCE.b(viewGroup, b1Var);
    }

    private final boolean w(List<d> newPendingOperations) {
        boolean z11;
        List<d> list = newPendingOperations;
        Iterator<T> it = list.iterator();
        loop0: while (true) {
            z11 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it2 = listF.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                        } while (((b) it2.next()).getIsSeekingSupported());
                    } else {
                        break;
                    }
                }
                z11 = false;
            }
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                p013kotlin.collections.v.E(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().mTransitioning) {
                z11 = false;
            }
        }
        return z11;
    }

    public final void A(androidx.p002activity.b backEvent) {
        p013kotlin.jvm.internal.s.k(backEvent, "backEvent");
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p013kotlin.collections.v.E(arrayList, ((d) it.next()).f());
        }
        List listM1 = p013kotlin.collections.v.m1(p013kotlin.collections.v.r1(arrayList));
        int size = listM1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((b) listM1.get(i11)).e(backEvent, this.container);
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(d operation) {
        p013kotlin.jvm.internal.s.k(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View viewRequireView = operation.getFragment().requireView();
            p013kotlin.jvm.internal.s.j(viewRequireView, "operation.fragment.requireView()");
            finalState.applyState(viewRequireView, this.container);
            operation.q(false);
        }
    }

    public abstract void d(List<d> operations, boolean isPop);

    public void e(List<d> operations) {
        p013kotlin.jvm.internal.s.k(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            p013kotlin.collections.v.E(arrayList, ((d) it.next()).f());
        }
        List listM1 = p013kotlin.collections.v.m1(p013kotlin.collections.v.r1(arrayList));
        int size = listM1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((b) listM1.get(i11)).d(this.container);
        }
        int size2 = operations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c(operations.get(i12));
        }
        List listM2 = p013kotlin.collections.v.m1(operations);
        int size3 = listM2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            d dVar = (d) listM2.get(i13);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void j(d.b finalState, p0 fragmentStateManager) {
        p013kotlin.jvm.internal.s.k(finalState, "finalState");
        p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(p0 fragmentStateManager) {
        p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(p0 fragmentStateManager) {
        p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(p0 fragmentStateManager) {
        p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z11;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listP1 = p013kotlin.collections.v.p1(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listP1.iterator();
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().mTransitioning) {
                        z11 = false;
                    }
                    dVar.r(z11);
                }
                for (d dVar2 : listP1) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> listP2 = p013kotlin.collections.v.p1(this.pendingOperations);
                    if (listP2.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listP2);
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listP2, this.operationDirectionIsPop);
                    boolean zW = w(listP2);
                    boolean zX = x(listP2);
                    if (!zX || zW) {
                        z11 = false;
                    }
                    this.runningNonSeekableTransition = z11;
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listP2);
                        e(listP2);
                    } else if (zW) {
                        B(listP2);
                        int size = listP2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            c(listP2.get(i11));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q() {
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> listP1 = p013kotlin.collections.v.p1(this.runningOperations);
                Iterator it = listP1.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listP1) {
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> listP2 = p013kotlin.collections.v.p1(this.pendingOperations);
                Iterator it2 = listP2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listP2) {
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.container);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            n();
        }
    }

    public final d.a s(p0 fragmentStateManager) {
        p013kotlin.jvm.internal.s.k(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        p013kotlin.jvm.internal.s.j(fragmentK, "fragmentStateManager.fragment");
        d dVarO = o(fragmentK);
        d.a lifecycleImpact = dVarO != null ? dVarO.getLifecycleImpact() : null;
        d dVarP = p(fragmentK);
        d.a lifecycleImpact2 = dVarP != null ? dVarP.getLifecycleImpact() : null;
        int i11 = lifecycleImpact == null ? -1 : e.f8471a[lifecycleImpact.ordinal()];
        return (i11 == -1 || i11 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b.Companion companion = d.b.INSTANCE;
                    View view = dVar.getFragment().mView;
                    p013kotlin.jvm.internal.s.j(view, "operation.fragment.mView");
                    d.b bVarA = companion.a(view);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                Fragment fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
