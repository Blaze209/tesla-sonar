package oi0;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TextInputLayout b(InputCurrencyComponent inputCurrencyComponent, p5 uiComponentHelper, final InputCurrency config) {
        p013kotlin.jvm.internal.s.k(inputCurrencyComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.k kVarC = ri0.k.c(uiComponentHelper.getLayoutInflater());
        InputCurrency.Attributes attributes = config.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                kVarC.f108360c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                kVarC.f108360c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = kVarC.f108360c;
                p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
                ki0.o.a(inputLayout);
            }
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        NumberFormat numberFormat = NumberFormat.getInstance();
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        Editable text = kVarC.f108359b.getText();
        n0Var.f86529a = text != null ? text.toString() : 0;
        a aVar = new a(n0Var, kVarC, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        if (inputCurrencyComponent.getValue() != null) {
            try {
                kVarC.f108359b.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        kVarC.f108359b.addTextChangedListener(aVar);
        uiComponentHelper.d(new wn0.a() { // from class: oi0.b1
            @Override // wn0.a
            public final Object invoke() {
                return c1.c(config, kVarC);
            }
        });
        TextInputLayout root = kVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InputCurrency inputCurrency, ri0.k kVar) {
        InputTextBasedComponentStyle styles = inputCurrency.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = kVar.f108360c;
            p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
            ui0.z.k(inputLayout, styles);
        }
        return jn0.h0.f84049a;
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"oi0/c1$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<String> f97562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ri0.k f97563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Currency f97564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NumberFormat f97565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ NumberFormat f97566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InputCurrencyComponent f97567f;

        a(p013kotlin.jvm.internal.n0<String> n0Var, ri0.k kVar, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
            this.f97562a = n0Var;
            this.f97563b = kVar;
            this.f97564c = currency;
            this.f97565d = numberFormat;
            this.f97566e = numberFormat2;
            this.f97567f = inputCurrencyComponent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) throws IOException, ParseException {
            if (p013kotlin.jvm.internal.s.f(String.valueOf(s11), this.f97562a.f86529a) || s11 == null || p013kotlin.text.t.y0(s11)) {
                return;
            }
            this.f97563b.f108359b.removeTextChangedListener(this);
            String strQuote = Pattern.quote(this.f97564c.getSymbol());
            p013kotlin.jvm.internal.s.j(strQuote, "quote(...)");
            String strJ = new p013kotlin.text.q(strQuote).j(s11, "");
            StringBuilder sb2 = new StringBuilder();
            int length = strJ.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = strJ.charAt(i11);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            Number number = this.f97565d.parse(sb2.toString());
            if (number != null) {
                double dDoubleValue = number.doubleValue() / 100.0d;
                ?? r11 = this.f97566e.format(dDoubleValue);
                this.f97562a.f86529a = r11;
                this.f97563b.f108359b.setText((CharSequence) r11);
                this.f97563b.f108359b.setSelection(r11.length());
                this.f97563b.f108359b.addTextChangedListener(this);
                this.f97567f.getNumberController().c(Double.valueOf(dDoubleValue));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
