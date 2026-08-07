package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ#\u0010\u001c\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010!\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\"R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010.\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R+\u0010\u000b\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010-\"\u0004\b2\u0010\u000eR\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "includeSeparatorGaps", "Ljn0/h0;", "w", "(Z)V", "k", "()V", "", "month", "year", "u", "(Ljava/lang/String;Ljava/lang/String;)Z", "include", "setIncludeSeparatorGaps", "expiryMonth", "expiryYear", "setText$payments_core_release", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setText", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "v", "(IIII)I", "Lkotlin/Function0;", "Lwn0/a;", "getCompletionCallback$payments_core_release", "()Lwn0/a;", "setCompletionCallback$payments_core_release", "(Lwn0/a;)V", "completionCallback", "<set-?>", "Z", "t", "()Z", "isDateValid", "x", "Lkotlin/properties/d;", "getIncludeSeparatorGaps$payments_core_release", "setIncludeSeparatorGaps$payments_core_release", "y", "I", "dateDigitsLength", "z", "Ljava/lang/String;", "separator", "Lcom/stripe/android/model/k0$b;", "getValidatedDate", "()Lcom/stripe/android/model/k0$b;", "validatedDate", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "A", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExpiryDateEditText extends StripeEditText {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ wn0.a<jn0.h0> completionCallback;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isDateValid;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d includeSeparatorGaps;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int dateDigitsLength;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private String separator;
    static final /* synthetic */ co0.m<Object>[] B = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};
    private static final a A = new a(null);
    public static final int C = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$a;", "", "<init>", "()V", "", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "Z", "", "INVALID_INPUT", "I", "", "SEPARATOR_WITHOUT_GAPS", "Ljava/lang/String;", "SEPARATOR_WITH_GAPS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54572c = new b();

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

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"com/stripe/android/view/ExpiryDateEditText$c", "Lcom/stripe/android/view/v2;", "", "s", "", "start", "count", "after", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "a", "I", "latestChangeStart", "b", "latestInsertionSize", "Lcom/stripe/android/model/k0$a;", "c", "Lcom/stripe/android/model/k0$a;", "expirationDate", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "newCursorPosition", "", "e", "Ljava/lang/String;", "formattedDate", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int latestChangeStart;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int latestInsertionSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private com.stripe.android.model.k0.Unvalidated expirationDate = com.stripe.android.model.k0.Unvalidated.INSTANCE.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Integer newCursorPosition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String formattedDate;

        c() {
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            int i11;
            String str = this.formattedDate;
            boolean z11 = false;
            if (str != null) {
                ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                    expiryDateEditText.setSelection(bo0.n.n(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                }
            }
            String month = this.expirationDate.getMonth();
            String year = this.expirationDate.getYear();
            boolean z12 = month.length() == 2 && !this.expirationDate.getIsMonthValid();
            if (month.length() == 2 && year.length() == 2) {
                boolean isDateValid = ExpiryDateEditText.this.getIsDateValid();
                ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                expiryDateEditText2.isDateValid = expiryDateEditText2.u(month, year);
                boolean z13 = !ExpiryDateEditText.this.getIsDateValid();
                if (!isDateValid && ExpiryDateEditText.this.getIsDateValid()) {
                    ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
                z12 = z13;
            } else {
                ExpiryDateEditText.this.isDateValid = false;
            }
            ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
            Resources resources = expiryDateEditText3.getResources();
            if (this.expirationDate.getIsPartialEntry()) {
                i11 = f90.h.F;
            } else {
                i11 = !this.expirationDate.getIsMonthValid() ? f90.h.H : f90.h.I;
            }
            expiryDateEditText3.setErrorMessage(resources.getString(i11));
            ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
            if (z12 && (this.expirationDate.getIsPartialEntry() || this.expirationDate.getIsComplete())) {
                z11 = true;
            }
            expiryDateEditText4.setShouldShowError(z11);
            this.formattedDate = null;
            this.newCursorPosition = null;
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            this.latestChangeStart = start;
            this.latestInsertionSize = after;
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws IOException {
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
            if (string2.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
                char cCharAt2 = string2.charAt(0);
                if (cCharAt2 != '0' && cCharAt2 != '1') {
                    string2 = WebrtcBuildVersion.maint_version + string2;
                    this.latestInsertionSize++;
                }
            } else if (string2.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
                string2 = string2.substring(0, 1);
                p013kotlin.jvm.internal.s.j(string2, "substring(...)");
            }
            com.stripe.android.model.k0.Unvalidated unvalidatedA = com.stripe.android.model.k0.Unvalidated.INSTANCE.a(string2);
            this.expirationDate = unvalidatedA;
            boolean isMonthValid = unvalidatedA.getIsMonthValid();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(unvalidatedA.getMonth());
            if ((unvalidatedA.getMonth().length() == 2 && this.latestInsertionSize > 0 && isMonthValid) || string2.length() > 2) {
                sb3.append(ExpiryDateEditText.this.separator);
            }
            sb3.append(unvalidatedA.getYear());
            String string3 = sb3.toString();
            p013kotlin.jvm.internal.s.j(string3, "toString(...)");
            this.newCursorPosition = Integer.valueOf(ExpiryDateEditText.this.v(string3.length(), this.latestChangeStart, this.latestInsertionSize, ExpiryDateEditText.this.dateDigitsLength + ExpiryDateEditText.this.separator.length()));
            this.formattedDate = string3;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/ExpiryDateEditText$d", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ObservableProperty<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExpiryDateEditText f54579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ExpiryDateEditText expiryDateEditText) {
            super(obj);
            this.f54579a = expiryDateEditText;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Boolean oldValue, Boolean newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            oldValue.getClass();
            this.f54579a.w(zBooleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void k() {
        addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ExpiryDateEditText this$0, View view, boolean z11) {
        Editable text;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (z11 || (text = this$0.getText()) == null || text.length() == 0 || this$0.isDateValid) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(String month, String year) {
        Object objB;
        int iIntValue;
        Object objB2;
        int iIntValue2 = -1;
        Object obj = -1;
        if (month.length() != 2) {
            iIntValue = -1;
        } else {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(Integer.valueOf(Integer.parseInt(month)));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = obj;
            }
            iIntValue = ((Number) objB).intValue();
        }
        if (year.length() == 2) {
            try {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(Integer.valueOf(h1.f54917a.a(Integer.parseInt(year))));
            } catch (Throwable th3) {
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(jn0.t.a(th3));
            }
            iIntValue2 = ((Number) (jn0.s.g(objB2) ? -1 : objB2)).intValue();
        }
        return h1.c(iIntValue, iIntValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(boolean includeSeparatorGaps) {
        this.separator = includeSeparatorGaps ? " / " : "/";
        setFilters((InputFilter[]) p013kotlin.collections.v.e(new InputFilter.LengthFilter(this.dateDigitsLength + this.separator.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    static /* synthetic */ void x(ExpiryDateEditText expiryDateEditText, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        expiryDateEditText.w(z11);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(f30.d0.f63942e, getText());
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    public final wn0.a<jn0.h0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps.getValue(this, B[0])).booleanValue();
    }

    public final com.stripe.android.model.k0.Validated getValidatedDate() {
        boolean z11 = this.isDateValid;
        if (z11) {
            return com.stripe.android.model.k0.Unvalidated.INSTANCE.a(getFieldText$payments_core_release()).h();
        }
        if (z11) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public final void setCompletionCallback$payments_core_release(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setIncludeSeparatorGaps(boolean include) {
        setIncludeSeparatorGaps$payments_core_release(include);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z11) {
        this.includeSeparatorGaps.setValue(this, B[0], Boolean.valueOf(z11));
    }

    public final void setText$payments_core_release(Integer expiryMonth, Integer expiryYear) {
        if (expiryMonth == null || expiryYear == null) {
            return;
        }
        setText(p013kotlin.collections.v.y0(p013kotlin.collections.v.p(p013kotlin.text.t.K0(expiryMonth.toString(), 2, '0'), p013kotlin.text.t.K0(p013kotlin.text.t.U1(expiryYear.toString(), 2), 2, '0')), this.separator, null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsDateValid() {
        return this.isDateValid;
    }

    public final int v(int newLength, int editActionStart, int editActionAddition, int maxInputLength) {
        int length = 0;
        int length2 = (editActionStart > 2 || editActionStart + editActionAddition < 2) ? 0 : this.separator.length();
        boolean z11 = editActionAddition == 0 && editActionStart == this.separator.length() + 2;
        int i11 = editActionStart + editActionAddition + length2;
        if (z11 && i11 > 0) {
            length = this.separator.length();
        }
        return Math.min(maxInputLength, Math.min(i11 - length, newLength));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.completionCallback = b.f54572c;
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.includeSeparatorGaps = new d(Boolean.FALSE, this);
        this.dateDigitsLength = context.getResources().getInteger(f30.a0.f63900a);
        this.separator = "/";
        setNumberOnlyInputType();
        x(this, false, 1, null);
        k();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.n1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ExpiryDateEditText.n(this.f55099a, view, z11);
            }
        });
        setLayoutDirection(0);
    }
}
