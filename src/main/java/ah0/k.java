package ah0;

import a30.ViewEnvironment;
import a30.c0;
import a30.z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import mi0.ComponentView;
import mi0.UiComponentScreen;
import oi0.ActionButtonComponent;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r0\u000b0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020 ¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R5\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r0\u000b0\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u0011\u00108R&\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0000098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b&\u0010<¨\u0006@"}, d2 = {"Lah0/k;", "La30/b;", "Landroid/os/Parcelable;", "Lmi0/g;", "uiScreen", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Loi0/n5;", "componentNameToAction", "", "isLoading", "<init>", "(Lmi0/g;Lii0/a;Lwn0/a;Ljava/util/List;Z)V", "Lbi0/b;", "binding", "rendering", "La30/a0;", "viewEnvironment", "", "Lmi0/a;", "componentNameToComponentView", "g", "(Lbi0/b;Lah0/k;La30/a0;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Lmi0/g;", "getUiScreen", "()Lmi0/g;", "b", "Lii0/a;", "getNavigationState", "()Lii0/a;", "c", "Lwn0/a;", "getOnBack", "()Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getComponentNameToAction", "()Ljava/util/List;", "e", "Z", "()Z", "La30/c0;", "f", "La30/c0;", "()La30/c0;", "getViewFactory$annotations", "()V", "viewFactory", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements a30.b<k>, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ii0.a navigationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onBack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<String, wn0.l<n5, h0>>> componentNameToAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c0<k> viewFactory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            UiComponentScreen uiComponentScreen = (UiComponentScreen) parcel.readParcelable(k.class.getClassLoader());
            ii0.a aVar = (ii0.a) parcel.readParcelable(k.class.getClassLoader());
            wn0.a aVar2 = (wn0.a) parcel.readSerializable();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readSerializable());
            }
            return new k(uiComponentScreen, aVar, aVar2, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i11) {
            return new k[i11];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, bi0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1073a = new b();

        public b() {
            super(3, bi0.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        public final bi0.b a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            s.k(p11, "p0");
            return bi0.b.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ bi0.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements wn0.l<bi0.b, a30.k<k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UiComponentScreen f1074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.p f1075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.r f1077d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<RenderingT> implements a30.k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiComponentScreen f1078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ bi0.b f1079c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.r f1080d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ mi0.h f1081e;

            public a(UiComponentScreen uiComponentScreen, bi0.b bVar, wn0.r rVar, mi0.h hVar) {
                this.f1078b = uiComponentScreen;
                this.f1079c = bVar;
                this.f1080d = rVar;
                this.f1081e = hVar;
            }

            @Override // a30.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                s.k(rendering, "rendering");
                s.k(viewEnvironment, "viewEnvironment");
                Integer numD = this.f1078b.d();
                if (numD != null) {
                    bi0.b bVar = this.f1079c;
                    int iIntValue = numD.intValue();
                    bVar.getRoot().setBackgroundColor(iIntValue);
                    ji0.c.a(viewEnvironment, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.f1078b;
                Context context = this.f1079c.getRoot().getContext();
                s.j(context, "getContext(...)");
                Drawable drawableA = uiComponentScreen.a(context);
                if (drawableA != null) {
                    bi0.b bVar2 = this.f1079c;
                    bVar2.getRoot().setBackground(drawableA);
                    bVar2.f17423d.setBackgroundColor(0);
                }
                wn0.r rVar = this.f1080d;
                bi0.b bVar3 = this.f1079c;
                s.h(bVar3);
                rVar.invoke(bVar3, rendering, viewEnvironment, this.f1081e.getViewBindings().a());
            }
        }

        public c(UiComponentScreen uiComponentScreen, wn0.p pVar, boolean z11, wn0.r rVar) {
            this.f1074a = uiComponentScreen;
            this.f1075b = pVar;
            this.f1076c = z11;
            this.f1077d = rVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a30.k<k> invoke(bi0.b binding) {
            s.k(binding, "binding");
            return new a(this.f1074a, binding, this.f1077d, mi0.m.f92265a.l(binding, this.f1074a, this.f1075b, this.f1076c));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.r<bi0.b, k, ViewEnvironment, Map<String, ? extends ComponentView>, h0> {
        d(Object obj) {
            super(4, obj, k.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Lcom/squareup/workflow1/ui/ViewEnvironment;Ljava/util/Map;)V", 0);
        }

        public final void a(bi0.b p11, k p12, ViewEnvironment p13, Map<String, ComponentView> p14) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            s.k(p13, "p2");
            s.k(p14, "p3");
            ((k) this.receiver).g(p11, p12, p13, p14);
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(bi0.b bVar, k kVar, ViewEnvironment viewEnvironment, Map<String, ? extends ComponentView> map) {
            a(bVar, kVar, viewEnvironment, map);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(UiComponentScreen uiScreen, ii0.a navigationState, wn0.a<h0> onBack, List<? extends Pair<String, ? extends wn0.l<? super n5, h0>>> componentNameToAction, boolean z11) {
        s.k(uiScreen, "uiScreen");
        s.k(navigationState, "navigationState");
        s.k(onBack, "onBack");
        s.k(componentNameToAction, "componentNameToAction");
        this.uiScreen = uiScreen;
        this.navigationState = navigationState;
        this.onBack = onBack;
        this.componentNameToAction = componentNameToAction;
        this.isLoading = z11;
        mi0.m mVar = mi0.m.f92265a;
        wn0.p pVar = new wn0.p() { // from class: ah0.g
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return k.k((bi0.b) obj, (Map) obj2);
            }
        };
        d dVar = new d(this);
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new z(o0.b(k.class), b.f1073a, new c(uiScreen, pVar, true, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(bi0.b binding, final k rendering, ViewEnvironment viewEnvironment, Map<String, ComponentView> componentNameToComponentView) {
        for (Pair<String, wn0.l<n5, h0>> pair : this.componentNameToAction) {
            String strE = pair.e();
            final wn0.l<n5, h0> lVarF = pair.f();
            final ComponentView componentView = componentNameToComponentView.get(strE);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: ah0.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.h(lVarF, componentView, view);
                    }
                });
                if (componentView.c() instanceof ActionButtonComponent) {
                    View viewD = componentView.d();
                    s.i(viewD, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
                    ((ButtonWithLoadingIndicator) viewD).setIsLoading(rendering.isLoading);
                }
            }
        }
        ii0.a aVar = rendering.navigationState;
        wn0.a aVar2 = new wn0.a() { // from class: ah0.i
            @Override // wn0.a
            public final Object invoke() {
                return k.i(this.f1066a);
            }
        };
        wn0.a aVar3 = new wn0.a() { // from class: ah0.j
            @Override // wn0.a
            public final Object invoke() {
                return k.j();
            }
        };
        Pi2NavigationBar navigationBar = binding.f17424e;
        s.j(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        s.j(root, "getRoot(...)");
        ii0.e.b(aVar, aVar2, aVar3, navigationBar, root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(wn0.l lVar, ComponentView componentView, View view) {
        lVar.invoke(componentView.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(k kVar) {
        kVar.onBack.invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(bi0.b binding, Map map) {
        s.k(binding, "binding");
        s.k(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
        return h0.f84049a;
    }

    @Override // a30.b
    public c0<k> a() {
        return this.viewFactory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeParcelable(this.uiScreen, flags);
        dest.writeParcelable(this.navigationState, flags);
        dest.writeSerializable((Serializable) this.onBack);
        List<Pair<String, wn0.l<n5, h0>>> list = this.componentNameToAction;
        dest.writeInt(list.size());
        Iterator<Pair<String, wn0.l<n5, h0>>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeInt(this.isLoading ? 1 : 0);
    }
}
