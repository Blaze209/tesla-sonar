package mi0;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import oi0.ActionButtonComponent;
import oi0.BrandingComponent;
import oi0.CancelButtonComponent;
import oi0.CombinedStepButtonComponent;
import oi0.CompleteButtonComponent;
import oi0.FooterComponent;
import oi0.HorizontalStackComponent;
import oi0.ImagePreviewComponent;
import oi0.LocalImageComponent;
import oi0.PrivacyPolicyComponent;
import oi0.QRCodeComponent;
import oi0.RemoteImageComponent;
import oi0.SpacerComponent;
import oi0.SubmitButtonComponent;
import oi0.TextComponent;
import oi0.TitleComponent;
import oi0.a1;
import oi0.b2;
import oi0.b4;
import oi0.c0;
import oi0.c1;
import oi0.c5;
import oi0.e1;
import oi0.e2;
import oi0.g2;
import oi0.g5;
import oi0.h4;
import oi0.i2;
import oi0.j5;
import oi0.k0;
import oi0.k4;
import oi0.m5;
import oi0.n;
import oi0.n0;
import oi0.n5;
import oi0.o1;
import oi0.p;
import oi0.p5;
import oi0.q;
import oi0.q1;
import oi0.r0;
import oi0.s1;
import oi0.t5;
import oi0.u0;
import oi0.u4;
import oi0.u5;
import oi0.v1;
import oi0.w3;
import oi0.x;
import oi0.z;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.text.t;
import ri0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ]\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"JU\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062$\u0010&\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0$0#0\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b+\u0010,JM\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u00062&\u00100\u001a\"\u0012\u0004\u0012\u00020-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0017\u0012\u0004\u0012\u00020%\u0018\u00010/2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b2\u00103J7\u00104\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020%2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lmi0/m;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmi0/g;", "uiScreen", "", "isLoading", "", "", "Lmi0/a;", "viewBindings", "Loi0/p5;", "uiComponentHelper", "isModal", "shouldApplyFocus", "Landroid/view/View;", "f", "(Landroid/content/Context;Lmi0/g;ZLjava/util/Map;Loi0/p5;ZZ)Landroid/view/View;", "Loi0/y;", "component", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", "e", "(Landroid/content/Context;Loi0/y;Ljava/util/Map;ZLjava/util/Map;Loi0/p5;)Landroid/view/View;", "", "Loi0/n5;", "components", "", "componentViews", "k", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Loi0/p5;)Ljava/util/List;", "Lkotlin/Pair;", "Lkotlin/Function1;", "Ljn0/h0;", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lmi0/j;", "j", "(Lmi0/g;Ljava/util/List;Lwn0/a;Ljava/lang/String;)Lmi0/j;", "Lbi0/b;", "binding", "Lkotlin/Function2;", "initialRendering", "Lmi0/h;", "l", "(Lbi0/b;Lmi0/g;Lwn0/p;Z)Lmi0/h;", "g", "(Landroid/content/Context;Lmi0/g;ZZZ)Lmi0/h;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f92265a = new m();

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View e(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, p5 uiComponentHelper) {
        ArrayList arrayList = new ArrayList();
        List<View> listK = k(v.e(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper);
        for (Object obj : arrayList) {
            viewBindings.put(((ComponentView) obj).c().getName(), obj);
        }
        return (View) v.o0(listK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View f(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, p5 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends n5> listM;
        int i11;
        ComponentView componentView;
        View viewD;
        s sVarC = s.c(uiComponentHelper.getLayoutInflater());
        p013kotlin.jvm.internal.s.j(sVarC, "inflate(...)");
        ConstraintLayout constraintLayoutB = sVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        List<n5> components = uiScreen.getComponents();
        if (components != null) {
            listM = new ArrayList<>();
            for (Object obj : components) {
                if (!(((n5) obj) instanceof FooterComponent)) {
                    listM.add(obj);
                }
            }
        } else {
            listM = v.m();
        }
        List<? extends n5> list = listM;
        ArrayList arrayList = new ArrayList();
        List<View> listK = k(list, com.withpersona.sdk2.inquiry.steps.ui.components.g.i(uiScreen.t0()), context, isLoading, arrayList, uiComponentHelper);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(constraintLayoutB);
        Iterator<View> it = listK.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            next.setId(View.generateViewId());
            next.setSaveEnabled(false);
            constraintLayoutB.addView(next);
            dVar.r(next.getId(), 6, 0, 6);
            dVar.r(next.getId(), 7, 0, 7);
            dVar.v(next.getId(), -2);
            dVar.u(next.getId(), 0);
            dVar.e0(next.getId(), 0.5f);
        }
        for (Object obj2 : arrayList) {
            viewBindings.put(((ComponentView) obj2).c().getName(), obj2);
        }
        if (listK.size() > 1) {
            List<View> list2 = listK;
            ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            dVar.A(0, 3, 0, 4, v.l1(arrayList2), null, 3);
            if (uiScreen.getStyles() == null) {
                for (n5 n5Var : list) {
                    int i12 = i11 + 1;
                    if (!(n5Var instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(n5Var.getName())) != null && (viewD = componentView.d()) != null && i11 != v.o(list)) {
                        dVar.b0(viewD.getId(), 4, (int) yh0.h.a(16.0d));
                    }
                    i11 = i12;
                }
            }
        }
        if (!isModal) {
            constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), constraintLayoutB.getPaddingTop(), constraintLayoutB.getPaddingRight(), (int) yh0.h.a(24.0d));
        }
        dVar.i(constraintLayoutB);
        Context context2 = sVarC.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
        if (!yh0.f.f(context2) && shouldApplyFocus) {
            c(constraintLayoutB);
        }
        ConstraintLayout constraintLayoutB2 = sVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB2, "getRoot(...)");
        return constraintLayoutB2;
    }

    public static /* synthetic */ h h(m mVar, Context context, UiComponentScreen gVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z13 = true;
        }
        return mVar.g(context, gVar, z11, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(p5 p5Var) {
        p5Var.c();
        return h0.f84049a;
    }

    private final List<View> k(List<? extends n5> components, Map<String, ? extends UiComponentConfig> componentNameToComponent, Context context, boolean isLoading, List<ComponentView> componentViews, p5 uiComponentHelper) {
        View viewB;
        ArrayList arrayList = new ArrayList();
        for (n5 n5Var : components) {
            if (n5Var instanceof ActionButtonComponent) {
                ActionButtonComponent aVar = (ActionButtonComponent) n5Var;
                UiComponentConfig uiComponentConfig = componentNameToComponent.get(aVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton");
                viewB = oi0.b.a(aVar, uiComponentHelper, (ActionButton) uiComponentConfig);
            } else if (n5Var instanceof CancelButtonComponent) {
                CancelButtonComponent iVar = (CancelButtonComponent) n5Var;
                UiComponentConfig uiComponentConfig2 = componentNameToComponent.get(iVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton");
                viewB = oi0.j.a(iVar, uiComponentHelper, (CancelButton) uiComponentConfig2);
            } else if (n5Var instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent mVar = (CombinedStepButtonComponent) n5Var;
                UiComponentConfig uiComponentConfig3 = componentNameToComponent.get(mVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton");
                viewB = n.a(mVar, uiComponentHelper, (CombinedStepButton) uiComponentConfig3);
            } else if (n5Var instanceof CompleteButtonComponent) {
                CompleteButtonComponent oVar = (CompleteButtonComponent) n5Var;
                UiComponentConfig uiComponentConfig4 = componentNameToComponent.get(oVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton");
                viewB = p.a(oVar, uiComponentHelper, (CompleteButton) uiComponentConfig4);
            } else if (n5Var instanceof SubmitButtonComponent) {
                SubmitButtonComponent f5Var = (SubmitButtonComponent) n5Var;
                UiComponentConfig uiComponentConfig5 = componentNameToComponent.get(f5Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton");
                viewB = g5.a(f5Var, uiComponentHelper, (SubmitButton) uiComponentConfig5);
            } else if (n5Var instanceof ESignatureComponent) {
                ESignatureComponent eSignatureComponent = (ESignatureComponent) n5Var;
                UiComponentConfig uiComponentConfig6 = componentNameToComponent.get(eSignatureComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                viewB = x.c(eSignatureComponent, uiComponentHelper, (ESignature) uiComponentConfig6);
            } else if (n5Var instanceof GovernmentIdNfcScanComponent) {
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) n5Var;
                UiComponentConfig uiComponentConfig7 = componentNameToComponent.get(governmentIdNfcScanComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan");
                viewB = c0.c(governmentIdNfcScanComponent, uiComponentHelper, (GovernmentIdNfcScan) uiComponentConfig7);
            } else if (n5Var instanceof ImagePreviewComponent) {
                ImagePreviewComponent i0Var = (ImagePreviewComponent) n5Var;
                UiComponentConfig uiComponentConfig8 = componentNameToComponent.get(i0Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview");
                viewB = k0.b(i0Var, uiComponentHelper, (CombinedStepImagePreview) uiComponentConfig8);
            } else if (n5Var instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) n5Var;
                UiComponentConfig uiComponentConfig9 = componentNameToComponent.get(inputAddressComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
                viewB = n0.g(inputAddressComponent, uiComponentHelper, (InputAddress) uiComponentConfig9);
            } else if (n5Var instanceof InputCheckboxComponent) {
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) n5Var;
                UiComponentConfig uiComponentConfig10 = componentNameToComponent.get(inputCheckboxComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox");
                viewB = r0.d(inputCheckboxComponent, uiComponentHelper, (InputCheckbox) uiComponentConfig10);
            } else if (n5Var instanceof InputCheckboxGroupComponent) {
                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) n5Var;
                UiComponentConfig uiComponentConfig11 = componentNameToComponent.get(inputCheckboxGroupComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup");
                viewB = u0.c(inputCheckboxGroupComponent, uiComponentHelper, (InputCheckboxGroup) uiComponentConfig11);
            } else if (n5Var instanceof InputConfirmationCodeComponent) {
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) n5Var;
                UiComponentConfig uiComponentConfig12 = componentNameToComponent.get(inputConfirmationCodeComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode");
                viewB = a1.f(inputConfirmationCodeComponent, uiComponentHelper, (InputConfirmationCode) uiComponentConfig12);
            } else if (n5Var instanceof InputDateComponent) {
                InputDateComponent inputDateComponent = (InputDateComponent) n5Var;
                UiComponentConfig uiComponentConfig13 = componentNameToComponent.get(inputDateComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate");
                viewB = e1.c(inputDateComponent, uiComponentHelper, null, (InputDate) uiComponentConfig13, 2, null);
            } else if (n5Var instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) n5Var;
                UiComponentConfig uiComponentConfig14 = componentNameToComponent.get(inputMaskedTextComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText");
                viewB = o1.g(inputMaskedTextComponent, uiComponentHelper, (InputMaskedText) uiComponentConfig14);
            } else if (n5Var instanceof InputMultiSelectComponent) {
                InputMultiSelectComponent dVar = (InputMultiSelectComponent) n5Var;
                UiComponentConfig uiComponentConfig15 = componentNameToComponent.get(dVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect");
                viewB = q1.b(dVar, uiComponentHelper, (InputMultiSelect) uiComponentConfig15);
            } else if (n5Var instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) n5Var;
                UiComponentConfig uiComponentConfig16 = componentNameToComponent.get(inputNumberComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber");
                viewB = s1.b(inputNumberComponent, uiComponentHelper, (InputNumber) uiComponentConfig16);
            } else if (n5Var instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) n5Var;
                UiComponentConfig uiComponentConfig17 = componentNameToComponent.get(inputPhoneNumberComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber");
                viewB = v1.c(inputPhoneNumberComponent, uiComponentHelper, (InputPhoneNumber) uiComponentConfig17);
            } else if (n5Var instanceof InputRadioGroupComponent) {
                InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) n5Var;
                UiComponentConfig uiComponentConfig18 = componentNameToComponent.get(inputRadioGroupComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup");
                viewB = b2.f(inputRadioGroupComponent, uiComponentHelper, (InputRadioGroup) uiComponentConfig18);
            } else if (n5Var instanceof InputSelectComponent) {
                InputSelectComponent eVar = (InputSelectComponent) n5Var;
                UiComponentConfig uiComponentConfig19 = componentNameToComponent.get(eVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect");
                viewB = e2.b(eVar, uiComponentHelper, (InputSelect) uiComponentConfig19);
            } else if (n5Var instanceof InputTextComponent) {
                InputTextComponent inputTextComponent = (InputTextComponent) n5Var;
                UiComponentConfig uiComponentConfig20 = componentNameToComponent.get(inputTextComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText");
                viewB = i2.c(inputTextComponent, uiComponentHelper, (InputText) uiComponentConfig20, null, 4, null);
            } else if (n5Var instanceof LocalImageComponent) {
                LocalImageComponent k2Var = (LocalImageComponent) n5Var;
                UiComponentConfig uiComponentConfig21 = componentNameToComponent.get(k2Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig21, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage");
                viewB = w3.O(k2Var, uiComponentHelper, (LocalImage) uiComponentConfig21);
            } else if (n5Var instanceof PrivacyPolicyComponent) {
                PrivacyPolicyComponent f4Var = (PrivacyPolicyComponent) n5Var;
                UiComponentConfig uiComponentConfig22 = componentNameToComponent.get(f4Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig22, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy");
                viewB = h4.b(f4Var, uiComponentHelper, (PrivacyPolicy) uiComponentConfig22);
            } else if (n5Var instanceof QRCodeComponent) {
                QRCodeComponent i4Var = (QRCodeComponent) n5Var;
                UiComponentConfig uiComponentConfig23 = componentNameToComponent.get(i4Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig23, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode");
                viewB = k4.b(i4Var, uiComponentHelper, (QRCode) uiComponentConfig23);
            } else if (n5Var instanceof RemoteImageComponent) {
                RemoteImageComponent l4Var = (RemoteImageComponent) n5Var;
                UiComponentConfig uiComponentConfig24 = componentNameToComponent.get(l4Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig24, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage");
                viewB = u4.m(l4Var, uiComponentHelper, (RemoteImage) uiComponentConfig24);
            } else if (n5Var instanceof SpacerComponent) {
                viewB = c5.b((SpacerComponent) n5Var, uiComponentHelper);
            } else if (n5Var instanceof TextComponent) {
                TextComponent h5Var = (TextComponent) n5Var;
                UiComponentConfig uiComponentConfig25 = componentNameToComponent.get(h5Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig25, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Text");
                viewB = j5.b(h5Var, uiComponentHelper, (Text) uiComponentConfig25);
            } else if (n5Var instanceof TitleComponent) {
                TitleComponent k5Var = (TitleComponent) n5Var;
                UiComponentConfig uiComponentConfig26 = componentNameToComponent.get(k5Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig26, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Title");
                viewB = m5.b(k5Var, uiComponentHelper, (Title) uiComponentConfig26);
            } else if (n5Var instanceof InputTextAreaComponent) {
                InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) n5Var;
                UiComponentConfig uiComponentConfig27 = componentNameToComponent.get(inputTextAreaComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig27, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea");
                viewB = g2.b(inputTextAreaComponent, uiComponentHelper, (InputTextArea) uiComponentConfig27);
            } else if (n5Var instanceof BrandingComponent) {
                viewB = oi0.g.b((BrandingComponent) n5Var, uiComponentHelper);
            } else if (n5Var instanceof CreatePersonaSheetComponent) {
                viewB = q.a((CreatePersonaSheetComponent) n5Var, uiComponentHelper);
            } else if (n5Var instanceof t5) {
                t5 t5Var = (t5) n5Var;
                UiComponentConfig uiComponentConfig28 = componentNameToComponent.get(t5Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig28, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton");
                viewB = u5.a(t5Var, uiComponentHelper, (VerifyPersonaButton) uiComponentConfig28);
            } else if (n5Var instanceof ClickableStackComponent) {
                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) n5Var;
                List<View> listK = f92265a.k(clickableStackComponent.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig29 = componentNameToComponent.get(clickableStackComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig29, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack");
                viewB = oi0.l.b(clickableStackComponent, uiComponentHelper, componentViews, listK, (ClickableStack) uiComponentConfig29);
            } else if (n5Var instanceof HorizontalStackComponent) {
                HorizontalStackComponent f0Var = (HorizontalStackComponent) n5Var;
                List<View> listK2 = f92265a.k(f0Var.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig30 = componentNameToComponent.get(f0Var.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig30, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack");
                viewB = oi0.h0.b(f0Var, uiComponentHelper, componentViews, listK2, (HorizontalStack) uiComponentConfig30);
            } else if (n5Var instanceof FooterComponent) {
                FooterComponent yVar = (FooterComponent) n5Var;
                List<View> listK3 = f92265a.k(yVar.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig31 = componentNameToComponent.get(yVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig31, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer");
                viewB = z.a(yVar, uiComponentHelper, componentViews, listK3, (Footer) uiComponentConfig31);
            } else if (n5Var instanceof InputCurrencyComponent) {
                InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) n5Var;
                UiComponentConfig uiComponentConfig32 = componentNameToComponent.get(inputCurrencyComponent.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig32, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency");
                viewB = c1.b(inputCurrencyComponent, uiComponentHelper, (InputCurrency) uiComponentConfig32);
            } else if (n5Var instanceof InputInternationalDbComponent) {
                InputInternationalDbComponent bVar = (InputInternationalDbComponent) n5Var;
                UiComponentConfig uiComponentConfig33 = componentNameToComponent.get(bVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig33, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb");
                viewB = com.withpersona.sdk2.inquiry.steps.ui.components.c.j(bVar, uiComponentHelper, (InputInternationalDb) uiComponentConfig33);
            } else {
                if (!(n5Var instanceof MdocComponent)) {
                    throw new NoWhenBranchMatchedException();
                }
                MdocComponent fVar = (MdocComponent) n5Var;
                UiComponentConfig uiComponentConfig34 = componentNameToComponent.get(fVar.getName());
                p013kotlin.jvm.internal.s.i(uiComponentConfig34, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc");
                viewB = b4.b(fVar, uiComponentHelper, (Mdoc) uiComponentConfig34);
            }
            if (viewB != null) {
                componentViews.add(new ComponentView(n5Var, viewB));
            }
            if (viewB != null) {
                arrayList.add(viewB);
            }
        }
        return arrayList;
    }

    public final void c(ConstraintLayout parentView) {
        Object next;
        Editable text;
        p013kotlin.jvm.internal.s.k(parentView, "parentView");
        ArrayList<View> focusables = parentView.getFocusables(2);
        p013kotlin.jvm.internal.s.j(focusables, "getFocusables(...)");
        Iterator<T> it = focusables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = (View) next;
            if ((view instanceof EditText) && ((text = ((EditText) view).getText()) == null || t.y0(text))) {
                break;
            }
        }
        final View view2 = (View) next;
        if (view2 != null) {
            view2.requestFocus();
            view2.post(new Runnable() { // from class: mi0.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.d(view2);
                }
            });
        }
    }

    public final h g(Context context, UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
        FooterComponent yVar;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final p5 p5Var = new p5(context);
        View viewF = f(context, uiScreen, isLoading, linkedHashMap, p5Var, isModal, shouldApplyFocus);
        List<n5> components = uiScreen.getComponents();
        View viewE = null;
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            yVar = (FooterComponent) v.q0(arrayList);
        } else {
            yVar = null;
        }
        if (yVar != null) {
            viewE = e(context, yVar, com.withpersona.sdk2.inquiry.steps.ui.components.g.i(uiScreen.t0()), isLoading, linkedHashMap, p5Var);
            linkedHashMap = linkedHashMap;
            p5Var = p5Var;
        }
        ki0.s.b(viewF, new wn0.a() { // from class: mi0.k
            @Override // wn0.a
            public final Object invoke() {
                return m.i(p5Var);
            }
        });
        return new h(new i(linkedHashMap), viewF, viewE);
    }

    public final UiStepBottomSheet j(UiComponentScreen uiScreen, List<? extends Pair<String, ? extends wn0.l<? super n5, h0>>> componentNamesToActions, wn0.a<h0> onCancelled, String cancelButtonName) {
        p013kotlin.jvm.internal.s.k(uiScreen, "uiScreen");
        p013kotlin.jvm.internal.s.k(componentNamesToActions, "componentNamesToActions");
        p013kotlin.jvm.internal.s.k(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    public final h l(bi0.b binding, UiComponentScreen uiScreen, wn0.p<? super bi0.b, ? super Map<String, ComponentView>, h0> initialRendering, boolean shouldApplyFocus) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        p013kotlin.jvm.internal.s.k(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.h(context);
        h hVarH = h(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.f() == StyleElements.PositionType.CENTER) {
            binding.f17422c.setFillViewport(true);
            hVarH.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = hVarH.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            contentView.setLayoutParams(layoutParams2);
        }
        binding.f17421b.addView(hVarH.getContentView());
        ConstraintLayout constraintLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        ki0.f.d(constraintLayoutB, false, false, false, false, 13, null);
        if (hVarH.getFooterView() != null) {
            binding.f17423d.addView(hVarH.getFooterView());
            ki0.f.d(hVarH.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, hVarH.getViewBindings().a());
        }
        Integer numE = uiScreen.e();
        if (numE != null) {
            binding.f17424e.setControlsColor(numE.intValue());
        }
        return hVarH;
    }
}
