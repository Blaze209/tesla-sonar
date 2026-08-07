package com.adyen.checkout.card.internal.ui.view;

import ae.a;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardNumberInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "unformattedString", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "Ljn0/h0;", "setAmexCardFormat", "(Z)V", "Landroid/text/Editable;", "editable", "c", "(Landroid/text/Editable;)V", IntegerTokenConverter.CONVERTER_KEY, "Z", "isAmexCard", "getRawValue", "()Ljava/lang/String;", "rawValue", "j", "a", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberInput extends AdyenTextInputEditText {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List<Integer> f19752k = v.p(4, 6, 5, 4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<Integer> f19753l = v.p(4, 4, 4, 4, 3);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isAmexCard;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final String e(String unformattedString) {
        return a.f982a.a(unformattedString, this.isAmexCard ? f19752k : f19753l, " ");
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    protected void c(Editable editable) {
        s.k(editable, "editable");
        String string = editable.toString();
        String strE = e(t.V(string, " ", "", false, 4, null));
        if (!s.f(string, strE)) {
            editable.replace(0, string.length(), strE);
        }
        super.c(editable);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    public String getRawValue() {
        return t.V(String.valueOf(getText()), " ", "", false, 4, null);
    }

    public final void setAmexCardFormat(boolean value) {
        if (this.isAmexCard || !value) {
            this.isAmexCard = value;
            return;
        }
        this.isAmexCard = true;
        Editable editableText = getEditableText();
        s.j(editableText, "getEditableText(...)");
        c(editableText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ CardNumberInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        d(23);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
    }
}
