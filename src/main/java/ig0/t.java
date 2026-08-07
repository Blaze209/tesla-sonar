package ig0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lig0/t;", "La30/k;", "Lig0/r2$d$b;", "Ljg0/c;", "binding", "<init>", "(Ljg0/c;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;La30/a0;)V", "rendering", "g", "(Lig0/r2$d$b;La30/a0;)V", "b", "Ljg0/c;", "c", "a", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements a30.k<r2.d.ReviewCaptures> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jg0.c binding;

    /* JADX INFO: renamed from: ig0.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lig0/t$a;", "La30/c0;", "Lig0/r2$d$b;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lig0/r2$d$b;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<r2.d.ReviewCaptures> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<r2.d.ReviewCaptures> f77976a;

        /* JADX INFO: renamed from: ig0.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1648a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, jg0.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1648a f77977a = new C1648a();

            C1648a() {
                super(3, jg0.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            public final jg0.c a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return jg0.c.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ jg0.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: ig0.t$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<jg0.c, t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f77978a = new b();

            b() {
                super(1, t.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t invoke(jg0.c p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new t(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(r2.d.ReviewCaptures initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f77976a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super r2.d.ReviewCaptures> getType() {
            return this.f77976a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f77976a = new a30.z(p013kotlin.jvm.internal.o0.b(r2.d.ReviewCaptures.class), C1648a.f77977a, b.f77978a);
        }
    }

    public t(jg0.c binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        ki0.f.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    private final void f(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment) {
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        if (styles != null && (backgroundColorValue = styles.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            ji0.c.a(viewEnvironment, iIntValue);
        }
        if (styles != null) {
            Context context = this.binding.getRoot().getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            Drawable drawableA = wi0.c.a(styles, context);
            if (drawableA != null) {
                this.binding.getRoot().setBackground(drawableA);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f83711f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.f83715j;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.f83707b;
            p013kotlin.jvm.internal.s.j(body, "body");
            ui0.e0.n(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.f83709d;
            p013kotlin.jvm.internal.s.j(disclaimer, "disclaimer");
            ui0.e0.n(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) {
            return;
        }
        Button submitButton = this.binding.f83714i;
        p013kotlin.jvm.internal.s.j(submitButton, "submitButton");
        ui0.e.f(submitButton, buttonPrimaryStyleValue, false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jn0.h0 h(r2.d.ReviewCaptures bVar, d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof d.Remote) {
            bVar.k().invoke(it);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(r2.d.ReviewCaptures bVar, View view) {
        bVar.l().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(r2.d.ReviewCaptures bVar) {
        bVar.h().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k(r2.d.ReviewCaptures bVar) {
        bVar.i().invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(final r2.d.ReviewCaptures rendering, ViewEnvironment viewEnvironment) {
        x xVar;
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        jg0.c cVar = this.binding;
        cVar.f83715j.setText(rendering.getTitle());
        String strN = rendering.getPrompt();
        if (strN != null) {
            ql0.e.b(this.binding.getRoot().getContext()).c(cVar.f83707b, strN);
        }
        cVar.f83709d.setText(rendering.getDisclaimer());
        if (cVar.f83712g.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            xVar = new x(context, rendering.getImageLoader(), rendering.m(), rendering.getStyles());
            cVar.f83712g.setAdapter(xVar);
        } else {
            RecyclerView.h adapter = cVar.f83712g.getAdapter();
            p013kotlin.jvm.internal.s.i(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            xVar = (x) adapter;
        }
        xVar.i(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.d());
        xVar.h(new wn0.l() { // from class: ig0.p
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t.h(rendering, (d) obj);
            }
        });
        cVar.f83714i.setText(rendering.getSubmitButtonText());
        cVar.f83714i.setEnabled(rendering.getSubmitButtonEnabled());
        cVar.f83714i.setOnClickListener(new View.OnClickListener() { // from class: ig0.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t.i(rendering, view);
            }
        });
        ii0.a aVarG = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: ig0.r
            @Override // wn0.a
            public final Object invoke() {
                return t.j(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: ig0.s
            @Override // wn0.a
            public final Object invoke() {
                return t.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = cVar.f83711f;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = cVar.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        ii0.e.b(aVarG, aVar, aVar2, navigationBar, coordinatorLayoutB);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB2, "getRoot(...)");
        yh0.z.a(coordinatorLayoutB2, rendering.getError(), rendering.j(), this.binding.f83714i, 4, 10000);
        f(rendering.getStyles(), viewEnvironment);
    }
}
