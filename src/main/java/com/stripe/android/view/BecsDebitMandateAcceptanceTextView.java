package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/view/r;", "f", "Lcom/stripe/android/view/r;", "factory", "", "<set-?>", "g", "Lkotlin/properties/d;", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyName", "", "()Z", "isValid", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f54439h = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f54440i = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r factory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d companyName;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/BecsDebitMandateAcceptanceTextView$a", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ObservableProperty<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BecsDebitMandateAcceptanceTextView f54443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
            super(obj);
            this.f54443a = becsDebitMandateAcceptanceTextView;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            CharSequence charSequenceA;
            p013kotlin.jvm.internal.s.k(property, "property");
            String str = newValue;
            BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this.f54443a;
            if (p013kotlin.text.t.y0(str)) {
                str = null;
            }
            if (str == null || (charSequenceA = this.f54443a.factory.a(str)) == null) {
                charSequenceA = "";
            }
            becsDebitMandateAcceptanceTextView.setText(charSequenceA);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public final boolean g() {
        CharSequence text = getText();
        return !(text == null || p013kotlin.text.t.y0(text));
    }

    public final String getCompanyName() {
        return (String) this.companyName.getValue(this, f54439h[0]);
    }

    public final void setCompanyName(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        this.companyName.setValue(this, f54439h[0], str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.textViewStyle : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.factory = new r(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.companyName = new a("", this);
    }
}
