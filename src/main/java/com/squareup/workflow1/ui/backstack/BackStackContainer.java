package com.squareup.workflow1.ui.backstack;

import a30.ViewEnvironment;
import a30.c0;
import a30.e0;
import a30.f;
import a30.f0;
import a30.g;
import a30.g0;
import a30.h;
import a30.j0;
import a30.k0;
import a30.n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.transition.z;
import c30.e;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import d30.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002#\u0017B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lc30/c;", "newRendering", "La30/a0;", "newViewEnvironment", "Ljn0/h0;", "c", "(Lc30/c;La30/a0;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "", "popped", "b", "(Landroid/view/View;Landroid/view/View;Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lc30/e;", "a", "Lc30/e;", "viewStateCache", "La30/n;", "Lc30/c;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class BackStackContainer extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e viewStateCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c30.c<n<?>> currentRendering;

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$a;", "La30/c0;", "Lc30/c;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lc30/c;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements c0<c30.c<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ f<c30.c<?>> f49585a;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lc30/c;", "initialRendering", "La30/a0;", "initialEnv", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Lc30/c;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
        static final class C0785a extends u implements r<c30.c<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0785a f49586c = new C0785a();

            /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* synthetic */ class C0786a extends p implements wn0.p<c30.c<?>, ViewEnvironment, h0> {
                C0786a(Object obj) {
                    super(2, obj, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void a(c30.c<?> p11, ViewEnvironment p12) {
                    s.k(p11, "p0");
                    s.k(p12, "p1");
                    ((BackStackContainer) this.receiver).c(p11, p12);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(c30.c<?> cVar, ViewEnvironment viewEnvironment) {
                    a(cVar, viewEnvironment);
                    return h0.f84049a;
                }
            }

            C0785a() {
                super(4);
            }

            @Override // wn0.r
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(c30.c<?> initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
                s.k(initialRendering, "initialRendering");
                s.k(initialEnv, "initialEnv");
                s.k(context, "context");
                BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                backStackContainer.setId(a.f59344c);
                backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                g0.a(backStackContainer, initialRendering, initialEnv, new C0786a(backStackContainer));
                return backStackContainer;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(c30.c<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f49585a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public d<? super c30.c<?>> getType() {
            return this.f49585a.getType();
        }

        private Companion() {
            this.f49585a = new f<>(o0.b(c30.c.class), C0785a.f49586c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "La30/n;", "b", "(Ljava/lang/Object;)La30/n;"}, k = 3, mv = {1, 6, 0})
    static final class c extends u implements l<Object, n<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f49588c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n<?> invoke(Object it) {
            s.k(it, "it");
            return new n<>(it, "backstack");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, wn0.a doStart) {
        s.k(view, "view");
        s.k(doStart, "doStart");
        b30.d.Companion.e(b30.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    protected void b(View oldViewMaybe, View newView, boolean popped) {
        Pair pairA;
        s.k(newView, "newView");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View viewFindViewById = oldViewMaybe.findViewById(a.f59342a);
        View viewFindViewById2 = newView.findViewById(a.f59342a);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        if (!popped) {
            pairA = x.a(8388611, 8388613);
        } else {
            if (!popped) {
                throw new NoWhenBranchMatchedException();
            }
            pairA = x.a(8388613, 8388611);
        }
        androidx.transition.c0 c0VarE0 = new androidx.transition.c0().w0(new androidx.transition.p(((Number) pairA.a()).intValue()).d(oldViewMaybe)).w0(new androidx.transition.p(((Number) pairA.b()).intValue()).d(viewFindViewById2)).n0(new AccelerateDecelerateInterpolator());
        s.j(c0VarE0, "TransitionSet()\n        …DecelerateInterpolator())");
        z.d(this);
        z.f(new androidx.transition.n(this, newView), c0VarE0);
    }

    protected final void c(c30.c<?> newRendering, ViewEnvironment newViewEnvironment) {
        b30.d dVarC;
        List<n<?>> listA;
        s.k(newRendering, "newRendering");
        s.k(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentC = newViewEnvironment.c(x.a(c30.a.INSTANCE, newRendering.a().isEmpty() ? c30.a.First : c30.a.Other));
        c30.c cVarD = newRendering.d(c.f49588c);
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = g0.b(currentView, cVarD.c()) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(cVarD.b());
                g0.g(view, cVarD.c(), viewEnvironmentC);
                return;
            }
        }
        e0 e0Var = (e0) viewEnvironmentC.a(e0.INSTANCE);
        Object objC = cVarD.c();
        Context context = getContext();
        s.j(context, "this.context");
        View viewC = f0.c(e0Var, objC, viewEnvironmentC, context, this, new a30.h0() { // from class: c30.b
            @Override // a30.h0
            public final void a(View view2, wn0.a aVar) {
                BackStackContainer.d(view2, aVar);
            }
        });
        g0.h(viewC);
        this.viewStateCache.h(cVarD.a(), currentView, viewC);
        c30.c<n<?>> cVar = this.currentRendering;
        boolean z11 = false;
        if (cVar != null && (listA = cVar.a()) != null) {
            List<n<?>> list = listA;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (h.a((n) it.next(), cVarD.c())) {
                        z11 = true;
                        break;
                    }
                }
            }
        }
        b(currentView, viewC, z11);
        if (currentView != null && (dVarC = b30.d.INSTANCE.c(currentView)) != null) {
            dVarC.o();
        }
        this.currentRendering = cVarD;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.d dVarC = b30.c.f16002a.c(this);
        g.Companion companion = g.INSTANCE;
        j0<?> j0VarD = k0.d(this);
        Object objC = j0VarD == null ? null : j0VarD.c();
        if (objC == null) {
            objC = null;
        }
        s.h(objC);
        this.viewStateCache.a(g.Companion.b(companion, objC, null, 2, null), dVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        s.k(state, "state");
        h0 h0Var = null;
        b bVar = state instanceof b ? (b) state : null;
        if (bVar != null) {
            this.viewStateCache.f(bVar.getSavedViewState());
            super.onRestoreInstanceState(((b) state).getSuperState());
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new b(parcelableOnSaveInstanceState, this.viewStateCache.g());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lc30/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lc30/e$a;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lc30/e$a;", "()Lc30/e$a;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e.a savedViewState;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<b> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel source) {
                s.k(source, "source");
                return new b(source);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int size) {
                return new b[size];
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcelable superState, e.a savedViewState) {
            super(superState);
            s.k(superState, "superState");
            s.k(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e.a getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            s.k(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcel source) {
            super(source);
            s.k(source, "source");
            Parcelable parcelable = source.readParcelable(e.a.class.getClassLoader());
            s.h(parcelable);
            s.j(parcelable, "source.readParcelable(Vi…class.java.classLoader)!!");
            this.savedViewState = (e.a) parcelable;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
        this.viewStateCache = new e();
    }
}
