package com.stripe.android.view;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/n2;", "", "<init>", "()V", "", "postalCode", "countryCode", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "Lcom/stripe/android/view/ShippingInfoWidget$a;", "optionalShippingInfoFields", "hiddenShippingInfoFields", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f55100a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Pattern> f55101b = p013kotlin.collections.v0.f(jn0.x.a(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u001e\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000e0\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/n2$a;", "", "<init>", "()V", "", "Lcom/stripe/android/view/ShippingInfoWidget$a;", "optionalShippingInfoFields", "hiddenShippingInfoFields", "", "b", "(Ljava/util/List;Ljava/util/List;)Z", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "POSTAL_CODE_PATTERNS", "Ljava/util/Map;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(List<? extends ShippingInfoWidget.a> optionalShippingInfoFields, List<? extends ShippingInfoWidget.a> hiddenShippingInfoFields) {
            ShippingInfoWidget.a aVar = ShippingInfoWidget.a.PostalCode;
            return optionalShippingInfoFields.contains(aVar) || hiddenShippingInfoFields.contains(aVar);
        }

        private a() {
        }
    }

    public final boolean a(String postalCode, String countryCode) {
        Matcher matcher;
        p013kotlin.jvm.internal.s.k(postalCode, "postalCode");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        Pattern pattern = f55101b.get(countryCode);
        if (pattern == null || (matcher = pattern.matcher(postalCode)) == null) {
            return (t30.d.f112276a.a(countryCode) && p013kotlin.text.t.y0(postalCode)) ? false : true;
        }
        return matcher.matches();
    }

    public final boolean b(String postalCode, String countryCode, List<? extends ShippingInfoWidget.a> optionalShippingInfoFields, List<? extends ShippingInfoWidget.a> hiddenShippingInfoFields) {
        Matcher matcher;
        p013kotlin.jvm.internal.s.k(postalCode, "postalCode");
        p013kotlin.jvm.internal.s.k(optionalShippingInfoFields, "optionalShippingInfoFields");
        p013kotlin.jvm.internal.s.k(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (countryCode == null) {
            return false;
        }
        if (p013kotlin.text.t.y0(postalCode) && f55100a.b(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            return true;
        }
        Pattern pattern = f55101b.get(countryCode);
        if (pattern == null || (matcher = pattern.matcher(postalCode)) == null) {
            return (t30.d.f112276a.a(countryCode) && p013kotlin.text.t.y0(postalCode)) ? false : true;
        }
        return matcher.matches();
    }
}
