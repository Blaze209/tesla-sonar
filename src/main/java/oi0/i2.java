package oi0;

import android.os.Build;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "config", "La30/t;", "textController", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;La30/t;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i2 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f97631b;

        static {
            int[] iArr = new int[InputText.InputType.values().length];
            try {
                iArr[InputText.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputText.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputText.InputType.NUMBER_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97630a = iArr;
            int[] iArr2 = new int[InputText.AutofillHint.values().length];
            try {
                iArr2[InputText.AutofillHint.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InputText.AutofillHint.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InputText.AutofillHint.CITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InputText.AutofillHint.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            f97631b = iArr2;
        }
    }

    public static final TextInputLayout b(InputTextComponent inputTextComponent, p5 uiComponentHelper, final InputText config, a30.t textController) {
        p013kotlin.jvm.internal.s.k(inputTextComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(textController, "textController");
        final ri0.o oVarC = ri0.o.c(uiComponentHelper.getLayoutInflater());
        TextInputEditText editText = oVarC.f108371b;
        p013kotlin.jvm.internal.s.j(editText, "editText");
        a30.u.b(textController, editText);
        InputText.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                oVarC.f108372c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                oVarC.f108372c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = oVarC.f108372c;
                p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
                ki0.o.a(inputLayout);
            }
            oVarC.f108371b.setInputType(e(attributes.getInputType()));
            if (Build.VERSION.SDK_INT >= 26) {
                InputText.AutofillHint autofillHint = attributes.getAutofillHint();
                oVarC.f108372c.setAutofillHints(new String[]{autofillHint != null ? f(autofillHint) : null});
            }
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.h2
            @Override // wn0.a
            public final Object invoke() {
                return i2.d(config, oVarC);
            }
        });
        TextInputLayout textInputLayoutB = oVarC.getRoot();
        p013kotlin.jvm.internal.s.j(textInputLayoutB, "getRoot(...)");
        return textInputLayoutB;
    }

    public static /* synthetic */ TextInputLayout c(InputTextComponent inputTextComponent, p5 p5Var, InputText inputText, a30.t tVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            tVar = inputTextComponent.getTextController();
        }
        return b(inputTextComponent, p5Var, inputText, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(InputText inputText, ri0.o oVar) {
        InputTextBasedComponentStyle styles = inputText.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = oVar.f108372c;
            p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
            ui0.z.k(inputLayout, styles);
        }
        return jn0.h0.f84049a;
    }

    private static final int e(InputText.InputType inputType) {
        int i11 = a.f97630a[inputType.ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 32;
        }
        if (i11 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String f(InputText.AutofillHint autofillHint) {
        switch (a.f97631b[autofillHint.ordinal()]) {
            case 1:
                return "personName";
            case 2:
                return "personGivenName";
            case 3:
                return "personMiddleName";
            case 4:
                return "personFamilyName";
            case 5:
                return "emailAddress";
            case 6:
                return "streetAddress";
            case 7:
                return "extendedAddress";
            case 8:
                return "addressLocality";
            case 9:
                return "addressCountry";
            case 10:
                return "postalCode";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
