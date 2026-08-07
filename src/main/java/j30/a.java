package j30;

import android.content.res.ColorStateList;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.h;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p017o70.AddressDetails;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0$8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020)0$8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'R\u0019\u00100\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0019\u00102\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b1\u0010\"R\u0019\u00107\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f0$8\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b\u001a\u0010'R\u0017\u0010=\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0010\u0010<¨\u0006>"}, d2 = {"Lj30/a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$b;", "b", "Lcom/stripe/android/paymentsheet/y$b;", "a", "()Lcom/stripe/android/paymentsheet/y$b;", "appearance", "Lcom/stripe/android/paymentsheet/y$c;", "c", "Lcom/stripe/android/paymentsheet/y$c;", "()Lcom/stripe/android/paymentsheet/y$c;", "billingDetails", "Lcom/stripe/android/paymentsheet/y$d;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/y$j;", "e", "Lcom/stripe/android/paymentsheet/y$j;", "()Lcom/stripe/android/paymentsheet/y$j;", "customer", "Lcom/stripe/android/paymentsheet/y$l;", "f", "Lcom/stripe/android/paymentsheet/y$l;", "g", "()Lcom/stripe/android/paymentsheet/y$l;", "googlePay", "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "headerTextForSelectionScreen", "", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "paymentMethodOrder", "Lcom/stripe/android/model/h;", "j", "preferredNetworks", "Landroid/content/res/ColorStateList;", "Landroid/content/res/ColorStateList;", "k", "()Landroid/content/res/ColorStateList;", "primaryButtonColor", "l", "primaryButtonLabel", "Lo70/a;", "Lo70/a;", "m", "()Lo70/a;", "shippingDetails", "externalPaymentMethods", "Lcom/stripe/android/paymentsheet/y$e;", "n", "Lcom/stripe/android/paymentsheet/y$e;", "()Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final y.CustomerConfiguration customer = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final y.GooglePayConfiguration googlePay = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final String headerTextForSelectionScreen = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final ColorStateList primaryButtonColor = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final String primaryButtonLabel = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final AddressDetails shippingDetails = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f82462a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final y.Appearance appearance = new y.Appearance();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final y.BillingDetails billingDetails = new y.BillingDetails(null, null, null, null, 15, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = new y.BillingDetailsCollectionConfiguration(null, null, null, null, false, 31, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final List<String> paymentMethodOrder = v.m();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final List<h> preferredNetworks = v.m();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final List<String> externalPaymentMethods = v.m();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final y.e cardBrandAcceptance = y.e.a.f53827b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f82476o = 8;

    private a() {
    }

    public final y.Appearance a() {
        return appearance;
    }

    public final y.BillingDetails b() {
        return billingDetails;
    }

    public final y.BillingDetailsCollectionConfiguration c() {
        return billingDetailsCollectionConfiguration;
    }

    public final y.e d() {
        return cardBrandAcceptance;
    }

    public final y.CustomerConfiguration e() {
        return customer;
    }

    public final List<String> f() {
        return externalPaymentMethods;
    }

    public final y.GooglePayConfiguration g() {
        return googlePay;
    }

    public final String h() {
        return headerTextForSelectionScreen;
    }

    public final List<String> i() {
        return paymentMethodOrder;
    }

    public final List<h> j() {
        return preferredNetworks;
    }

    public final ColorStateList k() {
        return primaryButtonColor;
    }

    public final String l() {
        return primaryButtonLabel;
    }

    public final AddressDetails m() {
        return shippingDetails;
    }
}
