package com.withpersona.sdk2.inquiry.steps.ui.components;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
import oi0.h;
import oi0.n5;
import oi0.o5;
import oi0.p5;
import oi0.t5;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0019\u001a\u00020\u0018*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0016H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"", "Loi0/n5;", "old", "new", "l", "(Ljava/util/List;Loi0/n5;Loi0/n5;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "h", "(Ljava/util/List;)Ljava/util/List;", "", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/util/Map;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;)Loi0/n5;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Loi0/l4;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Loi0/l4;", "Loi0/h;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "config", "Lcom/google/android/material/button/MaterialButton;", "c", "(Loi0/h;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "e", "(Loi0/h;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)I", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58685a;

        static {
            int[] iArr = new int[Button.ButtonType.values().length];
            try {
                iArr[Button.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58685a = iArr;
        }
    }

    public static final MaterialButton c(h hVar, p5 uiComponentHelper, Button config) {
        s.k(hVar, "<this>");
        s.k(uiComponentHelper, "uiComponentHelper");
        s.k(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            MaterialButton materialButton = new MaterialButton(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), null, g(config));
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                materialButton.setText(attributes.getText());
            }
            return materialButton;
        }
        final MaterialButton materialButton2 = new MaterialButton(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            materialButton2.setText(attributes2.getText());
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.r5
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.g.d(materialButton2, styles);
            }
        });
        return materialButton2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(MaterialButton materialButton, BaseButtonComponentStyle baseButtonComponentStyle) {
        ui0.e.f(materialButton, baseButtonComponentStyle, false, false, 6, null);
        return h0.f84049a;
    }

    public static final ButtonWithLoadingIndicator e(h hVar, p5 uiComponentHelper, Button config) {
        s.k(hVar, "<this>");
        s.k(uiComponentHelper, "uiComponentHelper");
        s.k(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), g(config));
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            return buttonWithLoadingIndicator;
        }
        final ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), 0);
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.q5
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.g.f(buttonWithLoadingIndicator2, styles);
            }
        });
        return buttonWithLoadingIndicator2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
        ui0.e.d(buttonWithLoadingIndicator, baseButtonComponentStyle);
        return h0.f84049a;
    }

    private static final int g(Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i11 = buttonType == null ? -1 : a.f58685a[buttonType.ordinal()];
        if (i11 == -1) {
            return zs.c.J;
        }
        if (i11 == 1) {
            return zs.c.J;
        }
        if (i11 == 2) {
            return qh0.a.f105516a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<n5> h(List<? extends UiComponentConfig> list) {
        s.k(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            n5 n5VarK = k((UiComponentConfig) it.next());
            if (n5VarK != null) {
                arrayList.add(n5VarK);
            }
        }
        return arrayList;
    }

    public static final Map<String, UiComponentConfig> i(List<? extends UiComponentConfig> list) {
        UiComponentConfig uiComponentConfig;
        s.k(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        while (!linkedList.isEmpty() && (uiComponentConfig = (UiComponentConfig) linkedList.poll()) != null) {
            if (uiComponentConfig instanceof UiComponentContainerConfig) {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
                List<UiComponentConfig> children = ((UiComponentContainerConfig) uiComponentConfig).getChildren();
                if (children == null) {
                    children = v.m();
                }
                linkedList.addAll(children);
            } else {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
            }
        }
        return linkedHashMap;
    }

    public static final RemoteImageComponent j(RemoteImage remoteImage) {
        s.k(remoteImage, "<this>");
        return new RemoteImageComponent(remoteImage);
    }

    public static final n5 k(UiComponentConfig uiComponentConfig) {
        s.k(uiComponentConfig, "<this>");
        if (uiComponentConfig instanceof Branding) {
            return new BrandingComponent((Branding) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Button) {
            Button button = (Button) uiComponentConfig;
            if (button instanceof ActionButton) {
                return new ActionButtonComponent((ActionButton) uiComponentConfig);
            }
            if (button instanceof CancelButton) {
                return new CancelButtonComponent((CancelButton) uiComponentConfig);
            }
            if (button instanceof CombinedStepButton) {
                return new CombinedStepButtonComponent((CombinedStepButton) uiComponentConfig);
            }
            if (button instanceof CompleteButton) {
                return new CompleteButtonComponent((CompleteButton) uiComponentConfig);
            }
            if (button instanceof SubmitButton) {
                return new SubmitButtonComponent((SubmitButton) uiComponentConfig);
            }
            if (button instanceof VerifyPersonaButton) {
                return new t5((VerifyPersonaButton) uiComponentConfig);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (uiComponentConfig instanceof UiComponentContainerConfig) {
            UiComponentContainerConfig uiComponentContainerConfig = (UiComponentContainerConfig) uiComponentConfig;
            if (uiComponentContainerConfig instanceof ClickableStack) {
                return new ClickableStackComponent((ClickableStack) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof Footer) {
                return new FooterComponent((Footer) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof HorizontalStack) {
                return new HorizontalStackComponent((HorizontalStack) uiComponentConfig);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (uiComponentConfig instanceof CombinedStepImagePreview) {
            return new ImagePreviewComponent((CombinedStepImagePreview) uiComponentConfig);
        }
        if (uiComponentConfig instanceof ESignature) {
            return new ESignatureComponent((ESignature) uiComponentConfig);
        }
        if (uiComponentConfig instanceof GovernmentIdNfcScan) {
            return new GovernmentIdNfcScanComponent((GovernmentIdNfcScan) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputAddress) {
            return InputAddressComponent.INSTANCE.a((InputAddress) uiComponentConfig);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (uiComponentConfig instanceof InputCheckbox) {
            return new InputCheckboxComponent((InputCheckbox) uiComponentConfig, false, 2, defaultConstructorMarker);
        }
        if (uiComponentConfig instanceof InputCheckboxGroup) {
            return new InputCheckboxGroupComponent((InputCheckboxGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputConfirmationCode) {
            return new InputConfirmationCodeComponent((InputConfirmationCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputDate) {
            return new InputDateComponent((InputDate) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMaskedText) {
            return new InputMaskedTextComponent((InputMaskedText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMultiSelect) {
            return InputMultiSelectComponent.INSTANCE.a((InputMultiSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputNumber) {
            return new InputNumberComponent((InputNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            return InputPhoneNumberComponent.INSTANCE.a((InputPhoneNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputRadioGroup) {
            return new InputRadioGroupComponent((InputRadioGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputSelect) {
            return InputSelectComponent.INSTANCE.a((InputSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputText) {
            return new InputTextComponent((InputText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputTextArea) {
            return new InputTextAreaComponent((InputTextArea) uiComponentConfig);
        }
        if (uiComponentConfig instanceof LocalImage) {
            return new LocalImageComponent((LocalImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PrivacyPolicy) {
            return new PrivacyPolicyComponent((PrivacyPolicy) uiComponentConfig);
        }
        if (uiComponentConfig instanceof QRCode) {
            return new QRCodeComponent((QRCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof RemoteImage) {
            return j((RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Spacer) {
            return new SpacerComponent((Spacer) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Text) {
            return new TextComponent((Text) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Title) {
            return new TitleComponent((Title) uiComponentConfig);
        }
        if (uiComponentConfig instanceof CreatePersonaSheet) {
            return CreatePersonaSheetComponent.INSTANCE.a((CreatePersonaSheet) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCurrency) {
            return new InputCurrencyComponent((InputCurrency) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputInternationalDb) {
            return InputInternationalDbComponent.INSTANCE.a((InputInternationalDb) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Mdoc) {
            return MdocComponent.INSTANCE.a((Mdoc) uiComponentConfig);
        }
        if (s.f(uiComponentConfig, UnknownComponentConfig.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public static final List<n5> l(List<? extends n5> list, n5 old, n5 n5Var) {
        s.k(list, "<this>");
        s.k(old, "old");
        s.k(n5Var, "new");
        List<? extends n5> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (n5 n5VarG0 : list2) {
            if (n5VarG0 instanceof o5) {
                if (s.f(n5VarG0, old)) {
                    n5VarG0 = n5Var;
                } else {
                    o5 o5Var = (o5) n5VarG0;
                    n5VarG0 = o5Var.G0(l(o5Var.getChildren(), old, n5Var));
                }
            } else if (s.f(n5VarG0, old)) {
                n5VarG0 = n5Var;
            }
            arrayList.add(n5VarG0);
        }
        return arrayList;
    }
}
