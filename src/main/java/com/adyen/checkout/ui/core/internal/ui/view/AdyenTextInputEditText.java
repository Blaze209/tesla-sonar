package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000  2\u00020\u0001:\u0002!\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "setOnChangeListener", "(Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$b;)V", "Landroid/text/Editable;", "editable", "c", "(Landroid/text/Editable;)V", "maxLength", DateTokenConverter.CONVERTER_KEY, "(I)V", "g", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$b;", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "textWatcher", "", "getRawValue", "()Ljava/lang/String;", "rawValue", "h", "a", "b", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AdyenTextInputEditText extends TextInputEditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$b;", "", "Landroid/text/Editable;", "editable", "Ljn0/h0;", "a", "(Landroid/text/Editable;)V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(Editable editable);
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "a", "Z", "isEditing", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isEditing;

        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            s.k(s11, "s");
            if (this.isEditing) {
                return;
            }
            this.isEditing = true;
            AdyenTextInputEditText.this.c(s11);
            this.isEditing = false;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            s.k(s11, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            s.k(s11, "s");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final TextWatcher getTextWatcher() {
        return new c();
    }

    protected void c(Editable editable) {
        b bVar;
        s.k(editable, "editable");
        if (!isEnabled() || (bVar = this.listener) == null) {
            return;
        }
        bVar.a(editable);
    }

    protected final void d(int maxLength) {
        if (maxLength != -1) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
        }
    }

    public String getRawValue() {
        String string;
        Editable text = getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final void setOnChangeListener(b listener) {
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ AdyenTextInputEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11 == 0 ? zs.c.f128603y : i11);
        s.k(context, "context");
        addTextChangedListener(getTextWatcher());
    }
}
