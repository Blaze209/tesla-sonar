package ki0;

import a30.ViewEnvironment;
import a30.c0;
import a30.e0;
import a30.f0;
import a30.g0;
import a30.j0;
import a30.k0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.transition.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002\u0017#B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lki0/n;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lki0/k;", "newRendering", "La30/a0;", "newViewEnvironment", "Ljn0/h0;", "c", "(Lki0/k;La30/a0;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "Lki0/j;", "transition", "b", "(Landroid/view/View;Landroid/view/View;Lki0/j;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lc30/e;", "a", "Lc30/e;", "viewStateCache", "La30/n;", "La30/n;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class n extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c30.e viewStateCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a30.n<?> currentRendering;

    /* JADX INFO: renamed from: ki0.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lki0/n$a;", "La30/c0;", "Lki0/k;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Lki0/k;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements c0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.f<k> f86151a;

        /* JADX INFO: renamed from: ki0.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1843a extends p013kotlin.jvm.internal.p implements wn0.p<k, ViewEnvironment, h0> {
            C1843a(Object obj) {
                super(2, obj, n.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void a(k p11, ViewEnvironment p12) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                p013kotlin.jvm.internal.s.k(p12, "p1");
                ((n) this.receiver).c(p11, p12);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(k kVar, ViewEnvironment viewEnvironment) {
                a(kVar, viewEnvironment);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View c(k initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialEnv, "initialEnv");
            p013kotlin.jvm.internal.s.k(context, "context");
            n nVar = new n(context, null, 0, 0, 14, null);
            nVar.setId(yh0.m.f125543i);
            nVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            g0.a(nVar, initialRendering, initialEnv, new C1843a(nVar));
            return nVar;
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(k initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f86151a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super k> getType() {
            return this.f86151a.getType();
        }

        private Companion() {
            this.f86151a = new a30.f<>(o0.b(k.class), new wn0.r() { // from class: ki0.m
                @Override // wn0.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return n.Companion.c((k) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86153a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.SLIDE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.SLIDE_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86153a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        this(context, null, 0, 0, 14, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, wn0.a doStart) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(doStart, "doStart");
        b30.d.Companion.e(b30.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    protected void b(View oldViewMaybe, View newView, j transition) {
        Pair pairA;
        p013kotlin.jvm.internal.s.k(newView, "newView");
        p013kotlin.jvm.internal.s.k(transition, "transition");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View viewFindViewById = oldViewMaybe.findViewById(d30.a.f59342a);
        View viewFindViewById2 = newView.findViewById(d30.a.f59342a);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        int i11 = c.f86153a[transition.ordinal()];
        if (i11 == 1) {
            pairA = x.a(8388611, 8388613);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z.f(new androidx.transition.n(this, newView), null);
                return;
            }
            pairA = x.a(8388613, 8388611);
        }
        androidx.transition.c0 c0VarN0 = new androidx.transition.c0().w0(new androidx.transition.p(((Number) pairA.a()).intValue()).d(oldViewMaybe)).w0(new androidx.transition.p(((Number) pairA.b()).intValue()).d(viewFindViewById2)).n0(new AccelerateDecelerateInterpolator());
        p013kotlin.jvm.internal.s.j(c0VarN0, "setInterpolator(...)");
        z.d(this);
        z.f(new androidx.transition.n(this, newView), c0VarN0);
    }

    protected final void c(k newRendering, ViewEnvironment newViewEnvironment) {
        b30.d dVarC;
        p013kotlin.jvm.internal.s.k(newRendering, "newRendering");
        p013kotlin.jvm.internal.s.k(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentC = newViewEnvironment.c(x.a(c30.a.INSTANCE, c30.a.First));
        a30.n<?> nVar = new a30.n<>(newRendering.getCom.fourthline.analytics.internal.AnalyticsContext.Screen java.lang.String(), "screen_with_transition");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = g0.b(currentView, nVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(v.e(nVar));
                g0.g(view, nVar, viewEnvironmentC);
                return;
            }
        }
        e0 e0Var = (e0) viewEnvironmentC.a(e0.INSTANCE);
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        View viewC = f0.c(e0Var, nVar, viewEnvironmentC, context, this, new a30.h0() { // from class: ki0.l
            @Override // a30.h0
            public final void a(View view2, wn0.a aVar) {
                n.d(view2, aVar);
            }
        });
        g0.h(viewC);
        b(currentView, viewC, newRendering.getTransition());
        if (currentView != null && (dVarC = b30.d.INSTANCE.c(currentView)) != null) {
            dVarC.o();
        }
        this.currentRendering = nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.d dVarC = b30.c.f16002a.c(this);
        a30.g.Companion companion = a30.g.INSTANCE;
        j0<?> j0VarD = k0.d(this);
        Object objC = j0VarD == null ? null : j0VarD.c();
        if (objC == null) {
            objC = null;
        }
        p013kotlin.jvm.internal.s.h(objC);
        this.viewStateCache.a(a30.g.Companion.b(companion, objC, null, 2, null), dVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        b bVar = state instanceof b ? (b) state : null;
        if (bVar == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        } else {
            this.viewStateCache.f(bVar.getSavedViewState());
            super.onRestoreInstanceState(((b) state).getSuperState());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new b(parcelableOnSaveInstanceState, this.viewStateCache.g());
        }
        return null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lki0/n$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lc30/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lc30/e$a;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lc30/e$a;", "()Lc30/e$a;", "CREATOR", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c30.e.a savedViewState;

        /* JADX INFO: renamed from: ki0.n$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lki0/n$b$a;", "Landroid/os/Parcelable$Creator;", "Lki0/n$b;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lki0/n$b;", "", "size", "", "b", "(I)[Lki0/n$b;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<b> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel source) {
                p013kotlin.jvm.internal.s.k(source, "source");
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
        public b(Parcelable superState, c30.e.a savedViewState) {
            super(superState);
            p013kotlin.jvm.internal.s.k(superState, "superState");
            p013kotlin.jvm.internal.s.k(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.e.a getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            p013kotlin.jvm.internal.s.k(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcel source) {
            super(source);
            p013kotlin.jvm.internal.s.k(source, "source");
            Parcelable parcelable = source.readParcelable(c30.e.a.class.getClassLoader());
            p013kotlin.jvm.internal.s.h(parcelable);
            this.savedViewState = (c30.e.a) parcelable;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.viewStateCache = new c30.e();
    }
}
