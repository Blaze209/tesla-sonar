package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.io.IOException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/stripe/android/view/s;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "companyName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "b", "(Landroid/util/AttributeSet;)V", "Lh40/i;", "a", "Lkotlin/Lazy;", "getViewBinding$payments_core_release", "()Lh40/i;", "viewBinding", "Lcom/stripe/android/view/s$c;", "Lcom/stripe/android/view/s$c;", "getValidParamsCallback", "()Lcom/stripe/android/view/s$c;", "setValidParamsCallback", "(Lcom/stripe/android/view/s$c;)V", "validParamsCallback", "", "c", "()Z", "isInputValid", "Lcom/stripe/android/model/w0;", "getParams", "()Lcom/stripe/android/model/w0;", "params", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c validParamsCallback;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/q$a;", PlaceTypes.BANK, "Ljn0/h0;", "a", "(Lcom/stripe/android/view/q$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q.Bank, jn0.h0> {
        a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
        public final void a(q.Bank bank) {
            int i11;
            String prefix;
            String strT1 = null;
            if (bank != null) {
                s.this.getViewBinding$payments_core_release().f70697e.setHelperText(bank.getName());
                s.this.getViewBinding$payments_core_release().f70697e.setHelperTextEnabled(true);
            } else {
                s.this.getViewBinding$payments_core_release().f70697e.setHelperText(null);
                s.this.getViewBinding$payments_core_release().f70697e.setHelperTextEnabled(false);
            }
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = s.this.getViewBinding$payments_core_release().f70694b;
            if (bank != null && (prefix = bank.getPrefix()) != null) {
                strT1 = p013kotlin.text.t.T1(prefix, 2);
            }
            if (strT1 != null) {
                int iHashCode = strT1.hashCode();
                i11 = 9;
                if (iHashCode != 1536) {
                    if (iHashCode != 1537) {
                        if (iHashCode != 1539) {
                            if (iHashCode != 1542) {
                                if (iHashCode != 1544) {
                                    if (iHashCode != 1756) {
                                        if (iHashCode == 1784 && strT1.equals("80")) {
                                            i11 = 4;
                                        }
                                    } else if (strT1.equals("73")) {
                                        i11 = 6;
                                    }
                                    i11 = 5;
                                } else if (!strT1.equals("08")) {
                                    i11 = 5;
                                }
                            } else if (strT1.equals("06")) {
                                i11 = 8;
                            } else {
                                i11 = 5;
                            }
                        } else if (strT1.equals("03")) {
                            i11 = 6;
                        } else {
                            i11 = 5;
                        }
                    } else if (!strT1.equals("01")) {
                        i11 = 5;
                    }
                } else if (!strT1.equals("00")) {
                    i11 = 5;
                }
            } else {
                i11 = 5;
            }
            becsDebitAccountNumberEditText.setMinLength(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q.Bank bank) {
            a(bank);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        b() {
            super(0);
        }

        public final void b() {
            s.this.getViewBinding$payments_core_release().f70695c.requestFocus();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/s$c;", "", "", "isValid", "Ljn0/h0;", "a", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(boolean isValid);
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            s.this.getValidParamsCallback().a(s.this.c());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StripeEditText f55160a;

        public e(StripeEditText stripeEditText) {
            this.f55160a = stripeEditText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            this.f55160a.setShouldShowError(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/view/s$f", "Lcom/stripe/android/view/s$c;", "", "isValid", "Ljn0/h0;", "a", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements c {
        f() {
        }

        @Override // com.stripe.android.view.s.c
        public void a(boolean isValid) {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh40/i;", "b", "()Lh40/i;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<h40.i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f55161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f55162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, s sVar) {
            super(0);
            this.f55161c = context;
            this.f55162d = sVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h40.i invoke() {
            h40.i iVarB = h40.i.b(LayoutInflater.from(this.f55161c), this.f55162d);
            p013kotlin.jvm.internal.s.j(iVarB, "inflate(...)");
            return iVarB;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        this(context, null, 0, null, 14, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void b(AttributeSet attrs) {
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        int[] BecsDebitWidget = f30.f0.f63994a;
        p013kotlin.jvm.internal.s.j(BecsDebitWidget, "BecsDebitWidget");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, BecsDebitWidget, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(f30.f0.f63995b);
        if (string != null) {
            getViewBinding$payments_core_release().f70700h.setCompanyName(string);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c() throws IOException {
        String fieldText$payments_core_release = getViewBinding$payments_core_release().f70701i.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().f70698f.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().f70696d.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().f70694b.getAccountNumber();
        return (p013kotlin.text.t.y0(fieldText$payments_core_release) || email == null || p013kotlin.text.t.y0(email) || bsb$payments_core_release == null || p013kotlin.text.t.y0(bsb$payments_core_release) || accountNumber == null || p013kotlin.text.t.y0(accountNumber)) ? false : true;
    }

    private final void d() {
        if (!getViewBinding$payments_core_release().f70700h.g()) {
            throw new IllegalArgumentException("A company name is required to render a BecsDebitWidget.");
        }
    }

    public final PaymentMethodCreateParams getParams() throws IOException {
        String fieldText$payments_core_release = getViewBinding$payments_core_release().f70701i.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().f70698f.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().f70696d.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().f70694b.getAccountNumber();
        getViewBinding$payments_core_release().f70701i.setShouldShowError(p013kotlin.text.t.y0(fieldText$payments_core_release));
        boolean z11 = true;
        getViewBinding$payments_core_release().f70698f.setShouldShowError(email == null || p013kotlin.text.t.y0(email));
        getViewBinding$payments_core_release().f70696d.setShouldShowError(bsb$payments_core_release == null || p013kotlin.text.t.y0(bsb$payments_core_release));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().f70694b;
        if (accountNumber != null && !p013kotlin.text.t.y0(accountNumber)) {
            z11 = false;
        }
        becsDebitAccountNumberEditText.setShouldShowError(z11);
        if (p013kotlin.text.t.y0(fieldText$payments_core_release) || email == null || p013kotlin.text.t.y0(email) || bsb$payments_core_release == null || p013kotlin.text.t.y0(bsb$payments_core_release) || accountNumber == null || p013kotlin.text.t.y0(accountNumber)) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.i(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.AuBecsDebit(bsb$payments_core_release, accountNumber), new PaymentMethod.BillingDetails(null, email, fieldText$payments_core_release, null, 9, null), null, null, 12, null);
    }

    public final c getValidParamsCallback() {
        return this.validParamsCallback;
    }

    public final h40.i getViewBinding$payments_core_release() {
        return (h40.i) this.viewBinding.getValue();
    }

    public final void setValidParamsCallback(c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<set-?>");
        this.validParamsCallback = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ s(Context context, AttributeSet attributeSet, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i11, String companyName) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(companyName, "companyName");
        this.viewBinding = jn0.m.b(new g(context, this));
        this.validParamsCallback = new f();
        if (Build.VERSION.SDK_INT >= 26) {
            getViewBinding$payments_core_release().f70701i.setAutofillHints(new String[]{"name"});
            getViewBinding$payments_core_release().f70698f.setAutofillHints(new String[]{"emailAddress"});
        }
        for (StripeEditText stripeEditText : p013kotlin.collections.d1.i(getViewBinding$payments_core_release().f70701i, getViewBinding$payments_core_release().f70698f, getViewBinding$payments_core_release().f70696d, getViewBinding$payments_core_release().f70694b)) {
            p013kotlin.jvm.internal.s.h(stripeEditText);
            stripeEditText.addTextChangedListener(new d());
        }
        getViewBinding$payments_core_release().f70696d.setOnBankChangedCallback(new a());
        getViewBinding$payments_core_release().f70696d.setOnCompletedCallback(new b());
        EmailEditText emailEditText = getViewBinding$payments_core_release().f70698f;
        StripeEditText nameEditText = getViewBinding$payments_core_release().f70701i;
        p013kotlin.jvm.internal.s.j(nameEditText, "nameEditText");
        emailEditText.setDeleteEmptyListener(new o(nameEditText));
        BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().f70696d;
        EmailEditText emailEditText2 = getViewBinding$payments_core_release().f70698f;
        p013kotlin.jvm.internal.s.j(emailEditText2, "emailEditText");
        becsDebitBsbEditText.setDeleteEmptyListener(new o(emailEditText2));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().f70694b;
        BecsDebitBsbEditText bsbEditText = getViewBinding$payments_core_release().f70696d;
        p013kotlin.jvm.internal.s.j(bsbEditText, "bsbEditText");
        becsDebitAccountNumberEditText.setDeleteEmptyListener(new o(bsbEditText));
        getViewBinding$payments_core_release().f70701i.setErrorMessage$payments_core_release(getResources().getString(f30.d0.V));
        StripeEditText stripeEditText2 = getViewBinding$payments_core_release().f70701i;
        TextInputLayout nameTextInputLayout = getViewBinding$payments_core_release().f70702j;
        p013kotlin.jvm.internal.s.j(nameTextInputLayout, "nameTextInputLayout");
        stripeEditText2.setErrorMessageListener(new m1(nameTextInputLayout));
        EmailEditText emailEditText3 = getViewBinding$payments_core_release().f70698f;
        TextInputLayout emailTextInputLayout = getViewBinding$payments_core_release().f70699g;
        p013kotlin.jvm.internal.s.j(emailTextInputLayout, "emailTextInputLayout");
        emailEditText3.setErrorMessageListener(new m1(emailTextInputLayout));
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().f70696d;
        TextInputLayout bsbTextInputLayout = getViewBinding$payments_core_release().f70697e;
        p013kotlin.jvm.internal.s.j(bsbTextInputLayout, "bsbTextInputLayout");
        becsDebitBsbEditText2.setErrorMessageListener(new m1(bsbTextInputLayout));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().f70694b;
        TextInputLayout accountNumberTextInputLayout = getViewBinding$payments_core_release().f70695c;
        p013kotlin.jvm.internal.s.j(accountNumberTextInputLayout, "accountNumberTextInputLayout");
        becsDebitAccountNumberEditText2.setErrorMessageListener(new m1(accountNumberTextInputLayout));
        for (StripeEditText stripeEditText3 : p013kotlin.collections.d1.i(getViewBinding$payments_core_release().f70701i, getViewBinding$payments_core_release().f70698f)) {
            p013kotlin.jvm.internal.s.h(stripeEditText3);
            stripeEditText3.addTextChangedListener(new e(stripeEditText3));
        }
        companyName = p013kotlin.text.t.y0(companyName) ? null : companyName;
        if (companyName != null) {
            getViewBinding$payments_core_release().f70700h.setCompanyName(companyName);
        }
        b(attributeSet);
        d();
    }
}
