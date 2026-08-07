package com.stripe.android.paymentsheet.addresselement;

import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/b;", "", "", PlaceTypes.ROUTE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lcom/stripe/android/paymentsheet/addresselement/b$a;", "Lcom/stripe/android/paymentsheet/addresselement/b$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String route;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/b$a;", "Lcom/stripe/android/paymentsheet/addresselement/b;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "c", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String country;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String country) {
            super("Autocomplete?country=" + country, null);
            s.k(country, "country");
            this.country = country;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/b$b;", "Lcom/stripe/android/paymentsheet/addresselement/b;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0980b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0980b f52385b = new C0980b();

        private C0980b() {
            super("InputAddress", null);
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getRoute() {
        return this.route;
    }

    private b(String str) {
        this.route = str;
    }
}
