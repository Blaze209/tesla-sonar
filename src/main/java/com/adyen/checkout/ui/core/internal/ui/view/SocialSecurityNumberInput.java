package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import nf.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/SocialSecurityNumberInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "socialSecurityNumber", "Ljn0/h0;", "setSocialSecurityNumber", "(Ljava/lang/String;)V", "Landroid/text/Editable;", "editable", "c", "(Landroid/text/Editable;)V", IntegerTokenConverter.CONVERTER_KEY, "a", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SocialSecurityNumberInput extends AdyenTextInputEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    protected void c(Editable editable) throws IOException {
        s.k(editable, "editable");
        String string = editable.toString();
        String strA = i.f94914a.a(string);
        if (!s.f(strA, string)) {
            editable.replace(0, string.length(), strA);
        }
        super.c(editable);
    }

    public final void setSocialSecurityNumber(String socialSecurityNumber) {
        s.k(socialSecurityNumber, "socialSecurityNumber");
        setText(i.f94914a.a(socialSecurityNumber));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ SocialSecurityNumberInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        d(i.f94914a.b().size() + 14);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789./-"));
    }
}
