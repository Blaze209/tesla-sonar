package mi0;

import a30.ViewEnvironment;
import a30.c0;
import a30.z;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import java.util.Map;
import jn0.h0;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.q;

/* JADX INFO: renamed from: mi0.j, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0000048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b\u001b\u00106¨\u00068"}, d2 = {"Lmi0/j;", "La30/b;", "Lmi0/g;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Loi0/n5;", "Ljn0/h0;", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "", "hideWhenTappedOutside", "<init>", "(Lmi0/g;Ljava/util/List;Lwn0/a;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmi0/g;", "b", "Ljava/util/List;", "c", "Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "Z", "Lmi0/h;", "f", "Lmi0/h;", "h", "()Lmi0/h;", "j", "(Lmi0/h;)V", "uiScreenGenerationResult", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "La30/c0;", "La30/c0;", "()La30/c0;", "viewFactory", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UiStepBottomSheet implements a30.b<UiStepBottomSheet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, wn0.l<n5, h0>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onCancelled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cancelButtonName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideWhenTappedOutside;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private mi0.h uiScreenGenerationResult;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private BottomSheetBehavior<?> bottomSheetBehavior;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c0<UiStepBottomSheet> viewFactory;

    /* JADX INFO: renamed from: mi0.j$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgb/a;", "BindingT", "", "RenderingT", "binding", "La30/k;", "a", "(Lgb/a;)La30/k;"}, k = 3, mv = {2, 0, 0})
    public static final class a extends u implements wn0.l<bi0.a, a30.k<UiStepBottomSheet>> {

        /* JADX INFO: renamed from: mi0.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lgb/a;", "BindingT", "", "RenderingT", "rendering", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "a", "(Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C1970a<RenderingT> implements a30.k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gb.a f92252b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ UiStepBottomSheet f92253c;

            public C1970a(gb.a aVar, UiStepBottomSheet uiStepBottomSheet) {
                this.f92252b = aVar;
                this.f92253c = uiStepBottomSheet;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // a30.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                View viewD;
                s.k(rendering, "rendering");
                s.k(viewEnvironment, "viewEnvironment");
                UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) rendering;
                bi0.a aVar = (bi0.a) this.f92252b;
                ViewGroup.LayoutParams layoutParams = aVar.f17416b.getLayoutParams();
                s.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
                s.i(cVarF, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) cVarF;
                if (!ki0.f.f()) {
                    CoordinatorLayout root = aVar.getRoot();
                    s.j(root, "getRoot(...)");
                    ki0.f.d(root, false, false, false, false, 14, null);
                }
                c cVar = uiStepBottomSheet.new c();
                ConstraintLayout bottomSheet = aVar.f17416b;
                s.j(bottomSheet, "bottomSheet");
                ki0.b.b(bottomSheetBehavior, cVar, bottomSheet, aVar.f17418d, aVar.f17419e);
                this.f92253c.i(bottomSheetBehavior);
                aVar.getRoot().addOnAttachStateChangeListener(new d(bottomSheetBehavior));
                Context context = aVar.getRoot().getContext();
                m mVar = m.f92265a;
                s.h(context);
                mi0.h hVarH = m.h(mVar, context, this.f92253c.uiScreen, false, true, false, 16, null);
                this.f92253c.j(hVarH);
                aVar.f17417c.addView(hVarH.getContentView());
                Map<String, ComponentView> mapA = hVarH.getViewBindings().a();
                for (Pair pair : this.f92253c.componentNamesToActions) {
                    String str = (String) pair.e();
                    wn0.l lVar = (wn0.l) pair.f();
                    ComponentView componentView = mapA.get(str);
                    if (componentView != null) {
                        componentView.d().setOnClickListener(new e(lVar, componentView));
                    }
                }
                ComponentView componentView2 = mapA.get(this.f92253c.cancelButtonName);
                if (componentView2 != null && (viewD = componentView2.d()) != null) {
                    viewD.setOnClickListener(new f(bottomSheetBehavior));
                }
                ConstraintLayout bottomSheet2 = aVar.f17416b;
                s.j(bottomSheet2, "bottomSheet");
                a30.e.c(bottomSheet2, new g(bottomSheetBehavior));
                if (uiStepBottomSheet.hideWhenTappedOutside) {
                    aVar.f17419e.setOnClickListener(new h(bottomSheetBehavior));
                } else {
                    aVar.f17419e.setOnClickListener(null);
                }
                NestedScrollView contentScrollView = aVar.f17418d;
                s.j(contentScrollView, "contentScrollView");
                StepStyles.UiStepStyle styles = this.f92253c.uiScreen.getStyles();
                FrameLayout contentContainer = aVar.f17417c;
                s.j(contentContainer, "contentContainer");
                ui0.c.c(contentScrollView, styles, contentContainer, null, 4, null);
            }
        }

        public a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a30.k<UiStepBottomSheet> invoke(bi0.a binding) {
            s.k(binding, "binding");
            return new C1970a(binding, UiStepBottomSheet.this);
        }
    }

    /* JADX INFO: renamed from: mi0.j$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends p implements q<LayoutInflater, ViewGroup, Boolean, bi0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f92254a = new b();

        b() {
            super(3, bi0.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
        }

        public final bi0.a a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            s.k(p11, "p0");
            return bi0.a.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ bi0.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: mi0.j$c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements wn0.a<h0> {
        c() {
        }

        public final void a() {
            UiStepBottomSheet.this.onCancelled.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            a();
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: mi0.j$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"mi0/j$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<?> f92256a;

        /* JADX INFO: renamed from: mi0.j$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BottomSheetBehavior<?> f92257a;

            a(BottomSheetBehavior<?> bottomSheetBehavior) {
                this.f92257a = bottomSheetBehavior;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f92257a.Y0(3);
            }
        }

        d(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f92256a = bottomSheetBehavior;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.k(view, "view");
            view.postDelayed(new a(this.f92256a), 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.k(view, "view");
        }
    }

    /* JADX INFO: renamed from: mi0.j$e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l<n5, h0> f92258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentView f92259b;

        /* JADX WARN: Multi-variable type inference failed */
        e(wn0.l<? super n5, h0> lVar, ComponentView componentView) {
            this.f92258a = lVar;
            this.f92259b = componentView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f92258a.invoke(this.f92259b.c());
        }
    }

    /* JADX INFO: renamed from: mi0.j$f */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<?> f92260a;

        f(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f92260a = bottomSheetBehavior;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f92260a.Y0(5);
        }
    }

    /* JADX INFO: renamed from: mi0.j$g */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g implements wn0.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<?> f92261a;

        g(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f92261a = bottomSheetBehavior;
        }

        public final void a() {
            this.f92261a.Y0(5);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            a();
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: mi0.j$h */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<?> f92262a;

        h(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f92262a = bottomSheetBehavior;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f92262a.Y0(5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiStepBottomSheet(UiComponentScreen uiScreen, List<? extends Pair<String, ? extends wn0.l<? super n5, h0>>> componentNamesToActions, wn0.a<h0> onCancelled, String str, boolean z11) {
        s.k(uiScreen, "uiScreen");
        s.k(componentNamesToActions, "componentNamesToActions");
        s.k(onCancelled, "onCancelled");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.onCancelled = onCancelled;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z11;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new z(o0.b(UiStepBottomSheet.class), b.f92254a, new a());
    }

    @Override // a30.b
    public c0<UiStepBottomSheet> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepBottomSheet)) {
            return false;
        }
        UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) other;
        return s.f(this.uiScreen, uiStepBottomSheet.uiScreen) && s.f(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && s.f(this.onCancelled, uiStepBottomSheet.onCancelled) && s.f(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    public final BottomSheetBehavior<?> g() {
        return this.bottomSheetBehavior;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final mi0.h getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    public int hashCode() {
        int iHashCode = ((((this.uiScreen.hashCode() * 31) + this.componentNamesToActions.hashCode()) * 31) + this.onCancelled.hashCode()) * 31;
        String str = this.cancelButtonName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideWhenTappedOutside);
    }

    public final void i(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.bottomSheetBehavior = bottomSheetBehavior;
    }

    public final void j(mi0.h hVar) {
        this.uiScreenGenerationResult = hVar;
    }

    public String toString() {
        return "UiStepBottomSheet(uiScreen=" + this.uiScreen + ", componentNamesToActions=" + this.componentNamesToActions + ", onCancelled=" + this.onCancelled + ", cancelButtonName=" + this.cancelButtonName + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ")";
    }

    public /* synthetic */ UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, wn0.a aVar, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, aVar, str, (i11 & 16) != 0 ? true : z11);
    }
}
