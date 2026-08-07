package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R0\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\f0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isError", "Ljn0/h0;", "s", "(Z)V", "", "bsb", "q", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/view/q;", "v", "Lcom/stripe/android/view/q;", "banks", "Lkotlin/Function1;", "Lcom/stripe/android/view/q$a;", "w", "Lwn0/l;", "getOnBankChangedCallback", "()Lwn0/l;", "setOnBankChangedCallback", "(Lwn0/l;)V", "onBankChangedCallback", "Lkotlin/Function0;", "x", "Lwn0/a;", "getOnCompletedCallback", "()Lwn0/a;", "setOnCompletedCallback", "(Lwn0/a;)V", "onCompletedCallback", "r", "()Z", "isComplete", "getBank", "()Lcom/stripe/android/view/q$a;", PlaceTypes.BANK, "getBsb$payments_core_release", "()Ljava/lang/String;", "y", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BecsDebitBsbEditText extends StripeEditText {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final b f54428y = new b(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f54429z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q banks;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super q.Bank, jn0.h0> onBankChangedCallback;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> onCompletedCallback;

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"com/stripe/android/view/BecsDebitBsbEditText$a", "Lcom/stripe/android/view/v2;", "", "s", "", "start", "before", "count", "Ljn0/h0;", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "a", "Z", "ignoreChanges", "b", "Ljava/lang/Integer;", "newCursorPosition", "", "c", "Ljava/lang/String;", "formattedBsb", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean ignoreChanges;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Integer newCursorPosition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String formattedBsb;

        a() {
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            String str;
            if (this.ignoreChanges) {
                return;
            }
            this.ignoreChanges = true;
            if (!BecsDebitBsbEditText.this.getIsLastKeyDelete() && (str = this.formattedBsb) != null) {
                BecsDebitBsbEditText.this.setText(str);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    BecsDebitBsbEditText becsDebitBsbEditText = BecsDebitBsbEditText.this;
                    becsDebitBsbEditText.setSelection(bo0.n.n(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.formattedBsb = null;
            this.newCursorPosition = null;
            this.ignoreChanges = false;
            boolean z11 = BecsDebitBsbEditText.this.getBank() == null && BecsDebitBsbEditText.this.getFieldText$payments_core_release().length() >= 2;
            BecsDebitBsbEditText becsDebitBsbEditText2 = BecsDebitBsbEditText.this;
            becsDebitBsbEditText2.setErrorMessage$payments_core_release(z11 ? becsDebitBsbEditText2.getResources().getString(f30.d0.S) : null);
            BecsDebitBsbEditText becsDebitBsbEditText3 = BecsDebitBsbEditText.this;
            becsDebitBsbEditText3.setShouldShowError(becsDebitBsbEditText3.getErrorMessage() != null);
            BecsDebitBsbEditText.this.getOnBankChangedCallback().invoke(BecsDebitBsbEditText.this.getBank());
            BecsDebitBsbEditText.this.s(z11);
            if (BecsDebitBsbEditText.this.r()) {
                BecsDebitBsbEditText.this.getOnCompletedCallback().invoke();
            }
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws IOException {
            if (!this.ignoreChanges && start <= 4) {
                String string = s11 != null ? s11.toString() : null;
                if (string == null) {
                    string = "";
                }
                StringBuilder sb2 = new StringBuilder();
                int length = string.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = string.charAt(i11);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String string2 = sb2.toString();
                p013kotlin.jvm.internal.s.j(string2, "toString(...)");
                String strQ = BecsDebitBsbEditText.this.q(string2);
                this.formattedBsb = strQ;
                this.newCursorPosition = strQ != null ? Integer.valueOf(strQ.length()) : null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText$b;", "", "<init>", "()V", "", "MAX_LENGTH", "I", "MIN_VALIDATION_THRESHOLD", "", "SEPARATOR", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/q$a;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/view/q$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<q.Bank, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f54437c = new c();

        c() {
            super(1);
        }

        public final void a(q.Bank bank) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q.Bank bank) {
            a(bank);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f54438c = new d();

        d() {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q.Bank getBank() {
        return this.banks.a(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q(String bsb) {
        return bsb.length() >= 3 ? p013kotlin.collections.v.y0(p013kotlin.collections.v.p(p013kotlin.text.t.T1(bsb, 3), p013kotlin.text.t.U1(bsb, bsb.length() - 3)), "-", null, null, 0, null, null, 62, null) : bsb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(boolean isError) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(isError ? f30.y.f64233o : f30.y.f64226h, 0, 0, 0);
    }

    public final String getBsb$payments_core_release() throws IOException {
        String string;
        if (getFieldText$payments_core_release().length() < 2) {
            string = getResources().getString(f30.d0.R);
        } else if (getBank() == null) {
            string = getResources().getString(f30.d0.S);
        } else {
            string = getFieldText$payments_core_release().length() < 7 ? getResources().getString(f30.d0.R) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb2 = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = fieldText$payments_core_release.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string2 = sb2.toString();
        p013kotlin.jvm.internal.s.j(string2, "toString(...)");
        if (r()) {
            return string2;
        }
        return null;
    }

    public final wn0.l<q.Bank, jn0.h0> getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final wn0.a<jn0.h0> getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnBankChangedCallback(wn0.l<? super q.Bank, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onBankChangedCallback = lVar;
    }

    public final void setOnCompletedCallback(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onCompletedCallback = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.banks = new q(context, false, 2, null);
        this.onBankChangedCallback = c.f54437c;
        this.onCompletedCallback = d.f54438c;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new a());
    }
}
