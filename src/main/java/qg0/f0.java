package qg0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.util.List;
import jn0.h0;
import oi0.Option;
import oi0.c2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import pg0.g5;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lqg0/f0;", "La30/k;", "Lpg0/g5$a;", "Ltg0/i;", "binding", "<init>", "(Ltg0/i;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "j", "(Ltg0/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;La30/a0;)V", "Loi0/c2;", "inputSelectComponent", "Lkotlin/Function1;", "Loi0/e4;", "onOptionSelected", "k", "(Loi0/c2;Lwn0/l;)V", "rendering", "m", "(Lpg0/g5$a;La30/a0;)V", "b", "Ltg0/i;", "Lsi0/k;", "c", "Lsi0/k;", "inputSelectBottomSheetController", DateTokenConverter.CONVERTER_KEY, "a", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 implements a30.k<g5.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tg0.i binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final si0.k inputSelectBottomSheetController;

    /* JADX INFO: renamed from: qg0.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqg0/f0$a;", "La30/c0;", "Lpg0/g5$a;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lpg0/g5$a;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<g5.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<g5.a> f105451a;

        /* JADX INFO: renamed from: qg0.f0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2237a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2237a f105452a = new C2237a();

            C2237a() {
                super(3, tg0.i.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;", 0);
            }

            public final tg0.i a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return tg0.i.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ tg0.i invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: qg0.f0$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<tg0.i, f0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f105453a = new b();

            b() {
                super(1, f0.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0 invoke(tg0.i p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new f0(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(g5.a initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f105451a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super g5.a> getType() {
            return this.f105451a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f105451a = new a30.z(o0.b(g5.a.class), C2237a.f105452a, b.f105453a);
        }
    }

    public f0(tg0.i binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        this.inputSelectBottomSheetController = new si0.k(coordinatorLayoutB);
        LinearLayout contentView = binding.f113515b;
        p013kotlin.jvm.internal.s.j(contentView, "contentView");
        ki0.f.d(contentView, false, false, false, false, 15, null);
    }

    private final void j(tg0.i iVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.InputSelectStyleContainer base3;
        InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            iVar.getRoot().setBackgroundColor(iIntValue);
            ji0.c.a(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView title = iVar.f113522i;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, base8, null, 2, null);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView countrySelectorText = iVar.f113518e;
            p013kotlin.jvm.internal.s.j(countrySelectorText, "countrySelectorText");
            ui0.e0.n(countrySelectorText, base6, null, 2, null);
            TextView idClassSelectorText = iVar.f113520g;
            p013kotlin.jvm.internal.s.j(idClassSelectorText, "idClassSelectorText");
            ui0.e0.n(idClassSelectorText, base6, null, 2, null);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout countrySelector = iVar.f113517d;
            p013kotlin.jvm.internal.s.j(countrySelector, "countrySelector");
            ui0.o.i(countrySelector, base4);
            TextInputLayout idClassSelector = iVar.f113519f;
            p013kotlin.jvm.internal.s.j(idClassSelector, "idClassSelector");
            ui0.o.i(idClassSelector, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button continueButton = iVar.f113516c;
        p013kotlin.jvm.internal.s.j(continueButton, "continueButton");
        ui0.e.f(continueButton, base2, false, false, 6, null);
    }

    private final void k(c2 inputSelectComponent, final wn0.l<? super Option, h0> onOptionSelected) {
        this.inputSelectBottomSheetController.u(inputSelectComponent, new wn0.l() { // from class: qg0.e0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return f0.l(onOptionSelected, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(wn0.l lVar, List selectedItems) {
        p013kotlin.jvm.internal.s.k(selectedItems, "selectedItems");
        Option option = (Option) p013kotlin.collections.v.q0(selectedItems);
        if (option == null) {
            return h0.f84049a;
        }
        lVar.invoke(option);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(g5.a aVar) {
        aVar.g().invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(g5.a aVar) {
        aVar.h().invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(f0 f0Var, g5.a aVar, View view) {
        f0Var.k(aVar.getCountrySelectComponent(), aVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(f0 f0Var, g5.a aVar, View view) {
        f0Var.k(aVar.getCountrySelectComponent(), aVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(f0 f0Var, g5.a aVar, View view) {
        f0Var.k(aVar.getIdClassSelectComponent(), aVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(f0 f0Var, g5.a aVar, View view) {
        f0Var.k(aVar.getIdClassSelectComponent(), aVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(g5.a aVar, View view) {
        aVar.i().invoke();
    }

    @Override // a30.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(final g5.a rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        tg0.i iVar = this.binding;
        ii0.a navigationState = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: qg0.x
            @Override // wn0.a
            public final Object invoke() {
                return f0.n(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: qg0.y
            @Override // wn0.a
            public final Object invoke() {
                return f0.o(rendering);
            }
        };
        Pi2NavigationBar navigationBar = iVar.f113521h;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = iVar.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        ii0.e.b(navigationState, aVar, aVar2, navigationBar, coordinatorLayoutB);
        iVar.f113522i.setText(rendering.getTitle());
        Option option = (Option) p013kotlin.collections.v.q0(rendering.getCountrySelectComponent().c());
        String text = option != null ? option.getText() : null;
        iVar.f113517d.setOnClickListener(new View.OnClickListener() { // from class: qg0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.p(this.f105492a, rendering, view);
            }
        });
        EditText editText = iVar.f113517d.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: qg0.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f0.q(this.f105436a, rendering, view);
                }
            });
        }
        EditText editText2 = iVar.f113517d.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            iVar.f113519f.setEnabled(true);
            EditText editText3 = iVar.f113519f.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            iVar.f113519f.setOnClickListener(new View.OnClickListener() { // from class: qg0.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f0.r(this.f105439a, rendering, view);
                }
            });
            EditText editText4 = iVar.f113519f.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() { // from class: qg0.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        f0.s(this.f105441a, rendering, view);
                    }
                });
            }
            EditText editText5 = iVar.f113519f.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) p013kotlin.collections.v.q0(rendering.getIdClassSelectComponent().c());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            iVar.f113519f.setEnabled(false);
            EditText editText6 = iVar.f113519f.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        iVar.f113518e.setText(rendering.getCountryInputTitle());
        iVar.f113520g.setText(rendering.getIdClassInputTitle());
        iVar.f113516c.setEnabled(rendering.getIsContinueEnabled());
        iVar.f113516c.setOnClickListener(new View.OnClickListener() { // from class: qg0.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.t(rendering, view);
            }
        });
        iVar.f113516c.setText(rendering.getContinueButtonText());
        j(iVar, rendering.getStyles(), viewEnvironment);
    }
}
