package ih0;

import a30.ViewEnvironment;
import a30.c0;
import a30.e0;
import a30.f;
import a30.f0;
import a30.g;
import a30.g0;
import a30.j0;
import a30.k0;
import a30.n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bh0.n2;
import c30.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002\u0010\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lih0/c;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lih0/d;", "newRendering", "La30/a0;", "newViewEnvironment", "Landroid/view/View;", "b", "(Lih0/d;La30/a0;)Landroid/view/View;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lih0/d;La30/a0;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ldh0/b;", "a", "Ldh0/b;", "binding", "Lc30/e;", "Lc30/e;", "viewStateCache", "getCurrentView", "()Landroid/view/View;", "currentView", "c", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dh0.b binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e viewStateCache;

    /* JADX INFO: renamed from: ih0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lih0/c$a;", "La30/c0;", "Lih0/d;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Lih0/d;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements c0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ f<d> f78076a;

        /* JADX INFO: renamed from: ih0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1653a extends p implements wn0.p<d, ViewEnvironment, h0> {
            C1653a(Object obj) {
                super(2, obj, c.class, "update", "update(Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void a(d p11, ViewEnvironment p12) {
                s.k(p11, "p0");
                s.k(p12, "p1");
                ((c) this.receiver).d(p11, p12);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(d dVar, ViewEnvironment viewEnvironment) {
                a(dVar, viewEnvironment);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View c(d initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
            s.k(initialRendering, "initialRendering");
            s.k(initialEnv, "initialEnv");
            s.k(context, "context");
            c cVar = new c(context, null, 0, 0, 14, null);
            cVar.setId(n2.f17313i);
            cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            g0.a(cVar, initialRendering, initialEnv, new C1653a(cVar));
            return cVar;
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(d initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f78076a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super d> getType() {
            return this.f78076a.getType();
        }

        private Companion() {
            this.f78076a = new f<>(o0.b(d.class), new r() { // from class: ih0.b
                @Override // wn0.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return c.Companion.c((d) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    private final View b(d newRendering, ViewEnvironment newViewEnvironment) {
        b30.d dVarC;
        n nVar = new n(newRendering.getCom.fourthline.analytics.internal.AnalyticsContext.Screen java.lang.String(), "disableable_container");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = g0.b(currentView, nVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(v.e(nVar));
                g0.g(view, nVar, newViewEnvironment);
                return view;
            }
        }
        e0 e0Var = (e0) newViewEnvironment.a(e0.INSTANCE);
        Context context = getContext();
        s.j(context, "getContext(...)");
        View viewC = f0.c(e0Var, nVar, newViewEnvironment, context, this, new a30.h0() { // from class: ih0.a
            @Override // a30.h0
            public final void a(View view2, wn0.a aVar) {
                c.c(view2, aVar);
            }
        });
        g0.h(viewC);
        this.viewStateCache.h(v.m(), currentView, viewC);
        this.binding.f60625c.removeView(currentView);
        this.binding.f60625c.addView(viewC);
        if (currentView != null && (dVarC = b30.d.INSTANCE.c(currentView)) != null) {
            dVarC.o();
        }
        return viewC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, wn0.a doStart) {
        s.k(view, "view");
        s.k(doStart, "doStart");
        b30.d.Companion.e(b30.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (this.binding.f60625c.getChildCount() > 0) {
            return this.binding.f60625c.getChildAt(0);
        }
        return null;
    }

    public final void d(d newRendering, ViewEnvironment newViewEnvironment) {
        s.k(newRendering, "newRendering");
        s.k(newViewEnvironment, "newViewEnvironment");
        View viewB = b(newRendering, newViewEnvironment);
        setEnabled(newRendering.getIsEnabled());
        if (isEnabled()) {
            viewB.setAlpha(1.0f);
            this.binding.f60624b.setVisibility(8);
        } else {
            viewB.setAlpha(0.5f);
            this.binding.f60624b.setVisibility(0);
        }
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lih0/c$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lc30/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lc30/e$a;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lc30/e$a;", "()Lc30/e$a;", "CREATOR", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e.a savedViewState;

        /* JADX INFO: renamed from: ih0.c$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lih0/c$b$a;", "Landroid/os/Parcelable$Creator;", "Lih0/c$b;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lih0/c$b;", "", "size", "", "b", "(I)[Lih0/c$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            this.savedViewState = (e.a) parcelable;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
        dh0.b bVarB = dh0.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.binding = bVarB;
        this.viewStateCache = new e();
    }
}
