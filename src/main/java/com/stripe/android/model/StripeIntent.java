package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004/012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H'¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0004R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0016\u0010.\u001a\u0004\u0018\u00010\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000b\u0082\u0001\u000234¨\u00065"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lt30/f;", "", "f2", "()Z", "", "", "", "z2", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "id", "n", "isLiveMode", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "paymentMethod", "z0", "paymentMethodId", "", "t", "()Ljava/util/List;", "paymentMethodTypes", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "P0", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "p", "clientSecret", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", PermissionsResponse.STATUS_KEY, "Lcom/stripe/android/model/StripeIntent$a;", "O1", "()Lcom/stripe/android/model/StripeIntent$a;", "nextActionData", "v3", "isConfirmed", "m3", "unactivatedPaymentMethods", "u3", "linkFundingSources", "getCountryCode", "countryCode", "a", "NextActionType", "Status", "Usage", "Lcom/stripe/android/model/u0;", "Lcom/stripe/android/model/d1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StripeIntent extends t30.f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "Companion", "a", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "UpiAwaitNotification", "CashAppRedirect", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "SwishRedirect", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum NextActionType {
        RedirectToUrl("redirect_to_url"),
        UseStripeSdk("use_stripe_sdk"),
        DisplayOxxoDetails("oxxo_display_details"),
        AlipayRedirect("alipay_handle_redirect"),
        BlikAuthorize("blik_authorize"),
        WeChatPayRedirect("wechat_pay_redirect_to_android_app"),
        VerifyWithMicrodeposits("verify_with_microdeposits"),
        UpiAwaitNotification("upi_await_notification"),
        CashAppRedirect("cashapp_handle_redirect_or_display_qr_code"),
        DisplayBoletoDetails("boleto_display_details"),
        DisplayKonbiniDetails("konbini_display_details"),
        DisplayMultibancoDetails("multibanco_display_details"),
        SwishRedirect("swish_handle_redirect_or_display_qr_code");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$NextActionType$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NextActionType a(String code) {
                NextActionType next;
                Iterator<NextActionType> it = NextActionType.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        NextActionType(String str) {
            this.code = str;
        }

        public static EnumEntries<NextActionType> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "Companion", "a", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Status {
        Canceled("canceled"),
        Processing("processing"),
        RequiresAction("requires_action"),
        RequiresConfirmation("requires_confirmation"),
        RequiresPaymentMethod("requires_payment_method"),
        Succeeded("succeeded"),
        RequiresCapture("requires_capture");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$Status$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/StripeIntent$Status;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status a(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Status(String str) {
            this.code = str;
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "Companion", "a", "OnSession", "OffSession", "OneTime", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Usage {
        OnSession("on_session"),
        OffSession("off_session"),
        OneTime("one_time");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$Usage$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/StripeIntent$Usage;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage a(String code) {
                Usage next;
                Iterator<Usage> it = Usage.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Usage(String str) {
            this.code = str;
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a;", "Lt30/f;", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "Lcom/stripe/android/model/StripeIntent$a$a;", "Lcom/stripe/android/model/StripeIntent$a$b;", "Lcom/stripe/android/model/StripeIntent$a$c;", "Lcom/stripe/android/model/StripeIntent$a$d;", "Lcom/stripe/android/model/StripeIntent$a$e;", "Lcom/stripe/android/model/StripeIntent$a$f;", "Lcom/stripe/android/model/StripeIntent$a$g;", "Lcom/stripe/android/model/StripeIntent$a$i;", "Lcom/stripe/android/model/StripeIntent$a$j;", "Lcom/stripe/android/model/StripeIntent$a$k;", "Lcom/stripe/android/model/StripeIntent$a$l;", "Lcom/stripe/android/model/StripeIntent$a$m;", "Lcom/stripe/android/model/StripeIntent$a$n;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements t30.f {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$b;", "Lcom/stripe/android/model/StripeIntent$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f51019a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0867a();

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0867a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return b.f51019a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$c;", "Lcom/stripe/android/model/StripeIntent$a;", "", "mobileAuthUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CashAppRedirect extends a {
            public static final Parcelable.Creator<CashAppRedirect> CREATOR = new C0868a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String mobileAuthUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0868a implements Parcelable.Creator<CashAppRedirect> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CashAppRedirect createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new CashAppRedirect(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CashAppRedirect[] newArray(int i11) {
                    return new CashAppRedirect[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashAppRedirect(String mobileAuthUrl) {
                super(null);
                p013kotlin.jvm.internal.s.k(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CashAppRedirect) && p013kotlin.jvm.internal.s.f(this.mobileAuthUrl, ((CashAppRedirect) other).mobileAuthUrl);
            }

            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.mobileAuthUrl);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$d;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/model/StripeIntent$a$h;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisplayBoletoDetails extends a implements h {
            public static final Parcelable.Creator<DisplayBoletoDetails> CREATOR = new C0869a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedVoucherUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0869a implements Parcelable.Creator<DisplayBoletoDetails> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DisplayBoletoDetails createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new DisplayBoletoDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DisplayBoletoDetails[] newArray(int i11) {
                    return new DisplayBoletoDetails[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayBoletoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayBoletoDetails) && p013kotlin.jvm.internal.s.f(this.hostedVoucherUrl, ((DisplayBoletoDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayBoletoDetails(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public DisplayBoletoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$e;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/model/StripeIntent$a$h;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisplayKonbiniDetails extends a implements h {
            public static final Parcelable.Creator<DisplayKonbiniDetails> CREATOR = new C0870a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedVoucherUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0870a implements Parcelable.Creator<DisplayKonbiniDetails> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DisplayKonbiniDetails createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new DisplayKonbiniDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DisplayKonbiniDetails[] newArray(int i11) {
                    return new DisplayKonbiniDetails[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayKonbiniDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayKonbiniDetails) && p013kotlin.jvm.internal.s.f(this.hostedVoucherUrl, ((DisplayKonbiniDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayKonbiniDetails(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public DisplayKonbiniDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$f;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/model/StripeIntent$a$h;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisplayMultibancoDetails extends a implements h {
            public static final Parcelable.Creator<DisplayMultibancoDetails> CREATOR = new C0871a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedVoucherUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$f$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0871a implements Parcelable.Creator<DisplayMultibancoDetails> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DisplayMultibancoDetails createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new DisplayMultibancoDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DisplayMultibancoDetails[] newArray(int i11) {
                    return new DisplayMultibancoDetails[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayMultibancoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayMultibancoDetails) && p013kotlin.jvm.internal.s.f(this.hostedVoucherUrl, ((DisplayMultibancoDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayMultibancoDetails(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public DisplayMultibancoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$g, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$g;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/model/StripeIntent$a$h;", "", "expiresAfter", "", InquiryField.FloatField.TYPE2, "hostedVoucherUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "b", "Ljava/lang/String;", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisplayOxxoDetails extends a implements h {
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new C0872a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int expiresAfter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String number;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedVoucherUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$g$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0872a implements Parcelable.Creator<DisplayOxxoDetails> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DisplayOxxoDetails[] newArray(int i11) {
                    return new DisplayOxxoDetails[i11];
                }
            }

            public DisplayOxxoDetails() {
                this(0, null, null, 7, null);
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayOxxoDetails)) {
                    return false;
                }
                DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) other;
                return this.expiresAfter == displayOxxoDetails.expiresAfter && p013kotlin.jvm.internal.s.f(this.number, displayOxxoDetails.number) && p013kotlin.jvm.internal.s.f(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.expiresAfter + ", number=" + this.number + ", hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(this.expiresAfter);
                parcel.writeString(this.number);
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayOxxoDetails(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
            }

            public DisplayOxxoDetails(int i11, String str, String str2) {
                super(null);
                this.expiresAfter = i11;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$h;", "", "", "a", "()Ljava/lang/String;", "hostedVoucherUrl", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface h {
            /* JADX INFO: renamed from: a */
            String getHostedVoucherUrl();
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$i, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$i;", "Lcom/stripe/android/model/StripeIntent$a;", "Landroid/net/Uri;", ImagesContract.URL, "", "returnUrl", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "Ljava/lang/String;", "getReturnUrl", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RedirectToUrl extends a {
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new C0873a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Uri url;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String returnUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$i$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0873a implements Parcelable.Creator<RedirectToUrl> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RedirectToUrl[] newArray(int i11) {
                    return new RedirectToUrl[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri url, String str) {
                super(null);
                p013kotlin.jvm.internal.s.k(url, "url");
                this.url = url;
                this.returnUrl = str;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Uri getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RedirectToUrl)) {
                    return false;
                }
                RedirectToUrl redirectToUrl = (RedirectToUrl) other;
                return p013kotlin.jvm.internal.s.f(this.url, redirectToUrl.url) && p013kotlin.jvm.internal.s.f(this.returnUrl, redirectToUrl.returnUrl);
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public int hashCode() {
                int iHashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.url + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeParcelable(this.url, flags);
                parcel.writeString(this.returnUrl);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$j;", "Lcom/stripe/android/model/StripeIntent$a;", "<init>", "()V", "a", "b", "Lcom/stripe/android/model/StripeIntent$a$j$a;", "Lcom/stripe/android/model/StripeIntent$a$j$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class j extends a {

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$j$a;", "Lcom/stripe/android/model/StripeIntent$a$j;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Use3DS1 extends j {
                public static final Parcelable.Creator<Use3DS1> CREATOR = new C0875a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String url;

                /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C0875a implements Parcelable.Creator<Use3DS1> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new Use3DS1(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Use3DS1[] newArray(int i11) {
                        return new Use3DS1[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS1(String url) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(url, "url");
                    this.url = url;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Use3DS1) && p013kotlin.jvm.internal.s.f(this.url, ((Use3DS1) other).url);
                }

                public int hashCode() {
                    return this.url.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.url + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    p013kotlin.jvm.internal.s.k(parcel, "out");
                    parcel.writeString(this.url);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$b, reason: from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\"\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b&\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b \u0010\r¨\u0006'"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$j$b;", "Lcom/stripe/android/model/StripeIntent$a$j;", "", "source", "serverName", "transactionId", "Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "serverEncryption", "threeDS2IntentId", "publishableKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$a$j$b$b;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "e", "b", DateTokenConverter.CONVERTER_KEY, "c", "g", "Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "()Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Use3DS2 extends j {
                public static final Parcelable.Creator<Use3DS2> CREATOR = new C0876a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String source;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String serverName;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String transactionId;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final DirectoryServerEncryption serverEncryption;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final String threeDS2IntentId;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final String publishableKey;

                /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$b$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C0876a implements Parcelable.Creator<Use3DS2> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Use3DS2[] newArray(int i11) {
                        return new Use3DS2[i11];
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$b$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u000b¨\u0006\""}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "Landroid/os/Parcelable;", "", "directoryServerId", "dsCertificateData", "", "rootCertsData", "keyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class DirectoryServerEncryption implements Parcelable {
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new C0878a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String directoryServerId;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String dsCertificateData;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    private final List<String> rootCertsData;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String keyId;

                    /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$j$b$b$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C0878a implements Parcelable.Creator<DirectoryServerEncryption> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            p013kotlin.jvm.internal.s.k(parcel, "parcel");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final DirectoryServerEncryption[] newArray(int i11) {
                            return new DirectoryServerEncryption[i11];
                        }
                    }

                    public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
                        p013kotlin.jvm.internal.s.k(dsCertificateData, "dsCertificateData");
                        p013kotlin.jvm.internal.s.k(rootCertsData, "rootCertsData");
                        this.directoryServerId = directoryServerId;
                        this.dsCertificateData = dsCertificateData;
                        this.rootCertsData = rootCertsData;
                        this.keyId = str;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final String getKeyId() {
                        return this.keyId;
                    }

                    public final List<String> d() {
                        return this.rootCertsData;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof DirectoryServerEncryption)) {
                            return false;
                        }
                        DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
                        return p013kotlin.jvm.internal.s.f(this.directoryServerId, directoryServerEncryption.directoryServerId) && p013kotlin.jvm.internal.s.f(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && p013kotlin.jvm.internal.s.f(this.rootCertsData, directoryServerEncryption.rootCertsData) && p013kotlin.jvm.internal.s.f(this.keyId, directoryServerEncryption.keyId);
                    }

                    public int hashCode() {
                        int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.dsCertificateData.hashCode()) * 31) + this.rootCertsData.hashCode()) * 31;
                        String str = this.keyId;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", dsCertificateData=" + this.dsCertificateData + ", rootCertsData=" + this.rootCertsData + ", keyId=" + this.keyId + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        p013kotlin.jvm.internal.s.k(parcel, "out");
                        parcel.writeString(this.directoryServerId);
                        parcel.writeString(this.dsCertificateData);
                        parcel.writeStringList(this.rootCertsData);
                        parcel.writeString(this.keyId);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS2(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String str, String str2) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(source, "source");
                    p013kotlin.jvm.internal.s.k(serverName, "serverName");
                    p013kotlin.jvm.internal.s.k(transactionId, "transactionId");
                    p013kotlin.jvm.internal.s.k(serverEncryption, "serverEncryption");
                    this.source = source;
                    this.serverName = serverName;
                    this.transactionId = transactionId;
                    this.serverEncryption = serverEncryption;
                    this.threeDS2IntentId = str;
                    this.publishableKey = str2;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getPublishableKey() {
                    return this.publishableKey;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getServerName() {
                    return this.serverName;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getSource() {
                    return this.source;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Use3DS2)) {
                        return false;
                    }
                    Use3DS2 use3DS2 = (Use3DS2) other;
                    return p013kotlin.jvm.internal.s.f(this.source, use3DS2.source) && p013kotlin.jvm.internal.s.f(this.serverName, use3DS2.serverName) && p013kotlin.jvm.internal.s.f(this.transactionId, use3DS2.transactionId) && p013kotlin.jvm.internal.s.f(this.serverEncryption, use3DS2.serverEncryption) && p013kotlin.jvm.internal.s.f(this.threeDS2IntentId, use3DS2.threeDS2IntentId) && p013kotlin.jvm.internal.s.f(this.publishableKey, use3DS2.publishableKey);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final String getThreeDS2IntentId() {
                    return this.threeDS2IntentId;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final String getTransactionId() {
                    return this.transactionId;
                }

                public int hashCode() {
                    int iHashCode = ((((((this.source.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.serverEncryption.hashCode()) * 31;
                    String str = this.threeDS2IntentId;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.publishableKey;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Use3DS2(source=" + this.source + ", serverName=" + this.serverName + ", transactionId=" + this.transactionId + ", serverEncryption=" + this.serverEncryption + ", threeDS2IntentId=" + this.threeDS2IntentId + ", publishableKey=" + this.publishableKey + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    p013kotlin.jvm.internal.s.k(parcel, "out");
                    parcel.writeString(this.source);
                    parcel.writeString(this.serverName);
                    parcel.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(parcel, flags);
                    parcel.writeString(this.threeDS2IntentId);
                    parcel.writeString(this.publishableKey);
                }
            }

            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$k, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$k;", "Lcom/stripe/android/model/StripeIntent$a;", "", "mobileAuthUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SwishRedirect extends a {
            public static final Parcelable.Creator<SwishRedirect> CREATOR = new C0879a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String mobileAuthUrl;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$k$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0879a implements Parcelable.Creator<SwishRedirect> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SwishRedirect createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new SwishRedirect(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SwishRedirect[] newArray(int i11) {
                    return new SwishRedirect[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SwishRedirect(String mobileAuthUrl) {
                super(null);
                p013kotlin.jvm.internal.s.k(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SwishRedirect) && p013kotlin.jvm.internal.s.f(this.mobileAuthUrl, ((SwishRedirect) other).mobileAuthUrl);
            }

            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.mobileAuthUrl);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$l;", "Lcom/stripe/android/model/StripeIntent$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class l extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f51041a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0880a();

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$l$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0880a implements Parcelable.Creator<l> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return l.f51041a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i11) {
                    return new l[i11];
                }
            }

            private l() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$m, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$m;", "Lcom/stripe/android/model/StripeIntent$a;", "", "arrivalDate", "", "hostedVerificationUrl", "Lcom/stripe/android/model/r0;", "microdepositType", "<init>", "(JLjava/lang/String;Lcom/stripe/android/model/r0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "J", "b", "()J", "Ljava/lang/String;", "c", "Lcom/stripe/android/model/r0;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/r0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerifyWithMicrodeposits extends a {
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new C0881a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long arrivalDate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedVerificationUrl;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final r0 microdepositType;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$m$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0881a implements Parcelable.Creator<VerifyWithMicrodeposits> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), r0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final VerifyWithMicrodeposits[] newArray(int i11) {
                    return new VerifyWithMicrodeposits[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyWithMicrodeposits(long j11, String hostedVerificationUrl, r0 microdepositType) {
                super(null);
                p013kotlin.jvm.internal.s.k(hostedVerificationUrl, "hostedVerificationUrl");
                p013kotlin.jvm.internal.s.k(microdepositType, "microdepositType");
                this.arrivalDate = j11;
                this.hostedVerificationUrl = hostedVerificationUrl;
                this.microdepositType = microdepositType;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getArrivalDate() {
                return this.arrivalDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getHostedVerificationUrl() {
                return this.hostedVerificationUrl;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final r0 getMicrodepositType() {
                return this.microdepositType;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerifyWithMicrodeposits)) {
                    return false;
                }
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) other;
                return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && p013kotlin.jvm.internal.s.f(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
            }

            public int hashCode() {
                return (((Long.hashCode(this.arrivalDate) * 31) + this.hostedVerificationUrl.hashCode()) * 31) + this.microdepositType.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.arrivalDate + ", hostedVerificationUrl=" + this.hostedVerificationUrl + ", microdepositType=" + this.microdepositType + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeLong(this.arrivalDate);
                parcel.writeString(this.hostedVerificationUrl);
                parcel.writeString(this.microdepositType.name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$n, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$n;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/model/u1;", "weChat", "<init>", "(Lcom/stripe/android/model/u1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/u1;", "b", "()Lcom/stripe/android/model/u1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WeChatPayRedirect extends a {
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new C0882a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeChat weChat;

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$n$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0882a implements Parcelable.Creator<WeChatPayRedirect> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final WeChatPayRedirect[] newArray(int i11) {
                    return new WeChatPayRedirect[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat) {
                super(null);
                p013kotlin.jvm.internal.s.k(weChat, "weChat");
                this.weChat = weChat;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final WeChat getWeChat() {
                return this.weChat;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WeChatPayRedirect) && p013kotlin.jvm.internal.s.f(this.weChat, ((WeChatPayRedirect) other).weChat);
            }

            public int hashCode() {
                return this.weChat.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.weChat + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                this.weChat.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\f¨\u0006'"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$a;", "Lcom/stripe/android/model/StripeIntent$a;", "", "data", "authCompleteUrl", "Landroid/net/Uri;", "webViewUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getData", "b", "getAuthCompleteUrl", "c", "Landroid/net/Uri;", "()Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "getReturnUrl", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AlipayRedirect extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String authCompleteUrl;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Uri webViewUrl;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String returnUrl;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final C0866a f51013e = new C0866a(null);

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f51014f = 8;
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new b();

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$a$a$a;", "", "<init>", "()V", "", "data", "b", "(Ljava/lang/String;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class C0866a {
                public /* synthetic */ C0866a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:8:0x002c  */
                public final String b(String data) {
                    Object objB;
                    try {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        String queryParameter = Uri.parse("alipay://url?" + data).getQueryParameter("return_url");
                        if (queryParameter != null) {
                            s90.c cVar = s90.c.f110652a;
                            p013kotlin.jvm.internal.s.h(queryParameter);
                            if (!cVar.a(queryParameter)) {
                                queryParameter = null;
                            }
                        } else {
                            queryParameter = null;
                        }
                        objB = jn0.s.b(queryParameter);
                    } catch (Throwable th2) {
                        jn0.s.Companion companion2 = jn0.s.INSTANCE;
                        objB = jn0.s.b(jn0.t.a(th2));
                    }
                    return (String) (jn0.s.g(objB) ? null : objB);
                }

                private C0866a() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.StripeIntent$a$a$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<AlipayRedirect> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AlipayRedirect[] newArray(int i11) {
                    return new AlipayRedirect[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                p013kotlin.jvm.internal.s.k(data, "data");
                p013kotlin.jvm.internal.s.k(webViewUrl, "webViewUrl");
                this.data = data;
                this.authCompleteUrl = str;
                this.webViewUrl = webViewUrl;
                this.returnUrl = str2;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AlipayRedirect)) {
                    return false;
                }
                AlipayRedirect alipayRedirect = (AlipayRedirect) other;
                return p013kotlin.jvm.internal.s.f(this.data, alipayRedirect.data) && p013kotlin.jvm.internal.s.f(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && p013kotlin.jvm.internal.s.f(this.webViewUrl, alipayRedirect.webViewUrl) && p013kotlin.jvm.internal.s.f(this.returnUrl, alipayRedirect.returnUrl);
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.webViewUrl.hashCode()) * 31;
                String str2 = this.returnUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.data + ", authCompleteUrl=" + this.authCompleteUrl + ", webViewUrl=" + this.webViewUrl + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.data);
                parcel.writeString(this.authCompleteUrl);
                parcel.writeParcelable(this.webViewUrl, flags);
                parcel.writeString(this.returnUrl);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AlipayRedirect(String data, String webViewUrl, String str) {
                p013kotlin.jvm.internal.s.k(data, "data");
                p013kotlin.jvm.internal.s.k(webViewUrl, "webViewUrl");
                String strB = f51013e.b(data);
                Uri uri = Uri.parse(webViewUrl);
                p013kotlin.jvm.internal.s.j(uri, "parse(...)");
                this(data, strB, uri, str);
            }
        }
    }

    /* JADX INFO: renamed from: O1 */
    a getNextActionData();

    NextActionType P0();

    /* JADX INFO: renamed from: Z2 */
    PaymentMethod getPaymentMethod();

    boolean f2();

    String getCountryCode();

    String getId();

    Status getStatus();

    List<String> m3();

    /* JADX INFO: renamed from: n */
    boolean getIsLiveMode();

    /* JADX INFO: renamed from: p */
    String getClientSecret();

    List<String> t();

    List<String> u3();

    boolean v3();

    /* JADX INFO: renamed from: z0 */
    String getPaymentMethodId();

    Map<String, Object> z2();
}
