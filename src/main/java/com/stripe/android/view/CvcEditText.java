package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/model/h;", "cardBrand", "", "Landroid/text/InputFilter;", "q", "(Lcom/stripe/android/model/h;)[Landroid/text/InputFilter;", "", "customHintText", "customPlaceholderText", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Ljn0/h0;", "r", "(Lcom/stripe/android/model/h;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V", "v", "Lcom/stripe/android/model/h;", "Lkotlin/Function0;", "w", "Lwn0/a;", "getCompletionCallback$payments_core_release", "()Lwn0/a;", "setCompletionCallback$payments_core_release", "(Lwn0/a;)V", "completionCallback", "Lh30/h$b;", "getUnvalidatedCvc", "()Lh30/h$b;", "unvalidatedCvc", "Lh30/h$c;", "getCvc$payments_core_release", "()Lh30/h$c;", "cvc", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CvcEditText extends StripeEditText {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ wn0.a<jn0.h0> completionCallback;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54564a;

        static {
            int[] iArr = new int[com.stripe.android.model.h.values().length];
            try {
                iArr[com.stripe.android.model.h.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f54564a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54565c = new b();

        b() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            CvcEditText.this.setShouldShowError(false);
            if (CvcEditText.this.cardBrand.isMaxCvc(CvcEditText.this.getUnvalidatedCvc().getNormalized())) {
                CvcEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h30.h.Unvalidated getUnvalidatedCvc() {
        return new h30.h.Unvalidated(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(CvcEditText this$0, View view, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (z11 || !this$0.getUnvalidatedCvc().c(this$0.cardBrand.getMaxCvcLength())) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    private final InputFilter[] q(com.stripe.android.model.h cardBrand) {
        return new InputFilter[]{new InputFilter.LengthFilter(cardBrand.getMaxCvcLength())};
    }

    public static /* synthetic */ void s(CvcEditText cvcEditText, com.stripe.android.model.h hVar, String str, String str2, TextInputLayout textInputLayout, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            textInputLayout = null;
        }
        cvcEditText.r(hVar, str, str2, textInputLayout);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(f30.d0.f63938c, getText());
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    public final wn0.a<jn0.h0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final h30.h.Validated getCvc$payments_core_release() {
        return getUnvalidatedCvc().d(this.cardBrand.getMaxCvcLength());
    }

    public final /* synthetic */ void r(com.stripe.android.model.h cardBrand, String customHintText, String customPlaceholderText, TextInputLayout textInputLayout) {
        p013kotlin.jvm.internal.s.k(cardBrand, "cardBrand");
        this.cardBrand = cardBrand;
        setFilters(q(cardBrand));
        if (customHintText == null) {
            customHintText = cardBrand == com.stripe.android.model.h.AmericanExpress ? getResources().getString(f30.d0.f63941d0) : getResources().getString(f30.d0.f63947g0);
            p013kotlin.jvm.internal.s.h(customHintText);
        }
        if (getUnvalidatedCvc().getNormalized().length() > 0) {
            setShouldShowError(getUnvalidatedCvc().d(cardBrand.getMaxCvcLength()) == null);
        }
        if (textInputLayout == null) {
            setHint(customHintText);
            return;
        }
        textInputLayout.setHint(customHintText);
        if (customPlaceholderText == null) {
            customPlaceholderText = getResources().getString(a.f54564a[cardBrand.ordinal()] == 1 ? f30.d0.f63945f0 : f30.d0.f63943e0);
        }
        textInputLayout.setPlaceholderText(customPlaceholderText);
    }

    public final void setCompletionCallback$payments_core_release(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        com.stripe.android.model.h hVar = com.stripe.android.model.h.Unknown;
        this.cardBrand = hVar;
        this.completionCallback = b.f54565c;
        setErrorMessage(getResources().getString(f30.d0.f63981x0));
        setHint(f30.d0.f63947g0);
        setMaxLines(1);
        setFilters(q(hVar));
        setNumberOnlyInputType();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardSecurityCode"});
        }
        addTextChangedListener(new c());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.g1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CvcEditText.n(this.f54909a, view, z11);
            }
        });
        setLayoutDirection(0);
    }
}
