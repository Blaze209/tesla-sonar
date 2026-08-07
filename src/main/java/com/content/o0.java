package com.content;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.u;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.Wallet;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Token;
import f30.a;
import f30.h0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s10.d;
import s10.e;
import s10.g;
import s10.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativestripesdk/o0;", "", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.reactnativestripesdk.o0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b#\u0010$J9\u0010+\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020%8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/reactnativestripesdk/o0$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lf30/i$d;", "b", "(Lcom/facebook/react/bridge/ReadableMap;)Lf30/i$d;", "Lf30/i$a;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lf30/i$a;", "Lf30/i$e;", "c", "(Lcom/facebook/react/bridge/ReadableMap;)Lf30/i$e;", "Lcom/google/android/gms/wallet/PaymentData;", "paymentData", "Lf30/h0;", "stripe", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "g", "(Lcom/google/android/gms/wallet/PaymentData;Lf30/h0;Lcom/facebook/react/bridge/Promise;)V", "h", "(Lcom/google/android/gms/wallet/PaymentData;Lcom/facebook/react/bridge/Promise;)V", "Landroidx/fragment/app/u;", "activity", "Lf30/i;", "factory", "googlePayParams", "Lcom/google/android/gms/tasks/Task;", "e", "(Landroidx/fragment/app/u;Lf30/i;Lcom/facebook/react/bridge/ReadableMap;)Lcom/google/android/gms/tasks/Task;", "request", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/android/gms/tasks/Task;Landroidx/fragment/app/u;)V", "", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "", "forToken", "f", "(ILandroid/content/Intent;Lf30/h0;ZLcom/facebook/react/bridge/Promise;)V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "I", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.reactnativestripesdk.o0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/o0$a$a", "Lf30/a;", "Lcom/stripe/android/model/v0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/v0;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0775a implements a<PaymentMethod> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Promise f48862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableNativeMap f48863b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f48864c;

            C0775a(Promise promise, WritableNativeMap writableNativeMap, JSONObject jSONObject) {
                this.f48862a = promise;
                this.f48863b = writableNativeMap;
                this.f48864c = jSONObject;
            }

            @Override // f30.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(PaymentMethod result) {
                s.k(result, "result");
                this.f48863b.putMap("paymentMethod", i.w(result));
                GooglePayResult googlePayResultB = GooglePayResult.INSTANCE.b(this.f48864c);
                WritableNativeMap writableNativeMap = this.f48863b;
                if (googlePayResultB.getShippingInformation() != null) {
                    writableNativeMap.putMap("shippingContact", i.z(googlePayResultB));
                }
                this.f48862a.resolve(this.f48863b);
            }

            @Override // f30.a
            public void onError(Exception e11) {
                s.k(e11, "e");
                this.f48862a.resolve(e.c("Failed", e11));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final f30.i.BillingAddressParameters a(ReadableMap params) {
            f30.i.BillingAddressParameters.b bVar;
            Boolean boolValueOf = params != null ? Boolean.valueOf(g.b(params, "isRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(g.b(params, "isPhoneNumberRequired", false)) : null;
            String string = params != null ? params.getString("format") : null;
            if (string == null) {
                string = "";
            }
            if (s.f(string, "FULL")) {
                bVar = f30.i.BillingAddressParameters.b.Full;
            } else {
                bVar = s.f(string, "MIN") ? f30.i.BillingAddressParameters.b.Min : f30.i.BillingAddressParameters.b.Min;
            }
            return new f30.i.BillingAddressParameters(boolValueOf != null ? boolValueOf.booleanValue() : false, bVar, boolValueOf2 != null ? boolValueOf2.booleanValue() : false);
        }

        private final f30.i.ShippingAddressParameters b(ReadableMap params) {
            ArrayList<Object> arrayList;
            Set setJ1 = null;
            Boolean boolValueOf = params != null ? Boolean.valueOf(g.b(params, "isPhoneNumberRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(g.b(params, "isRequired", false)) : null;
            if (params != null && params.hasKey("allowedCountryCodes")) {
                ReadableArray array = params.getArray("allowedCountryCodes");
                Set setR1 = (array == null || (arrayList = array.toArrayList()) == null) ? null : v.r1(arrayList);
                if (setR1 instanceof Set) {
                    setJ1 = setR1;
                }
            }
            boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
            if (setJ1 == null) {
                String[] iSOCountries = Locale.getISOCountries();
                s.j(iSOCountries, "getISOCountries(...)");
                setJ1 = n.J1(iSOCountries);
            }
            return new f30.i.ShippingAddressParameters(zBooleanValue, setJ1, boolValueOf != null ? boolValueOf.booleanValue() : false);
        }

        private final f30.i.TransactionInfo c(ReadableMap params) {
            String string = params.getString("merchantCountryCode");
            if (string == null) {
                string = "";
            }
            String str = string;
            String string2 = params.getString("currencyCode");
            if (string2 == null) {
                string2 = "USD";
            }
            String str2 = string2;
            int i11 = params.getInt("amount");
            return new f30.i.TransactionInfo(str2, f30.i.TransactionInfo.c.Estimated, str, null, Integer.valueOf(i11), params.getString(AnnotatedPrivateKey.LABEL), f30.i.TransactionInfo.a.Default, 8, null);
        }

        private final void g(PaymentData paymentData, h0 stripe, Promise promise) {
            JSONObject jSONObject = new JSONObject(paymentData.toJson());
            h0.h(stripe, PaymentMethodCreateParams.INSTANCE.D(jSONObject), null, null, new C0775a(promise, new WritableNativeMap(), jSONObject), 6, null);
        }

        private final void h(PaymentData paymentData, Promise promise) {
            GooglePayResult googlePayResultB = GooglePayResult.INSTANCE.b(new JSONObject(paymentData.toJson()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            Token token = googlePayResultB.getToken();
            if (token == null) {
                promise.resolve(e.d("Failed", "Unexpected response from Google Pay. No token was found."));
                return;
            }
            writableNativeMap.putMap("token", i.A(token));
            if (googlePayResultB.getShippingInformation() != null) {
                writableNativeMap.putMap("shippingContact", i.z(googlePayResultB));
            }
            promise.resolve(writableNativeMap);
        }

        public final void d(Task<PaymentData> request, u activity) {
            s.k(request, "request");
            s.k(activity, "activity");
            AutoResolveHelper.resolveTask(request, activity, 414243);
        }

        public final Task<PaymentData> e(u activity, f30.i factory, ReadableMap googlePayParams) throws JSONException {
            s.k(activity, "activity");
            s.k(factory, "factory");
            s.k(googlePayParams, "googlePayParams");
            f30.i.TransactionInfo transactionInfoC = c(googlePayParams);
            String string = googlePayParams.getString("merchantName");
            if (string == null) {
                string = "";
            }
            JSONObject jSONObjectD = factory.d(transactionInfoC, a(googlePayParams.getMap("billingAddressConfig")), b(googlePayParams.getMap("shippingAddressConfig")), g.b(googlePayParams, "isEmailRequired", false), new f30.i.MerchantInfo(string), Boolean.valueOf(g.b(googlePayParams, "allowCreditCards", true)));
            Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(googlePayParams.getBoolean("testEnv") ? 3 : 1).build();
            s.j(walletOptionsBuild, "build(...)");
            Task<PaymentData> taskLoadPaymentData = Wallet.getPaymentsClient((Activity) activity, walletOptionsBuild).loadPaymentData(PaymentDataRequest.fromJson(jSONObjectD.toString()));
            s.j(taskLoadPaymentData, "loadPaymentData(...)");
            return taskLoadPaymentData;
        }

        public final void f(int resultCode, Intent data, h0 stripe, boolean forToken, Promise promise) {
            PaymentData fromIntent;
            Status statusFromIntent;
            s.k(stripe, "stripe");
            s.k(promise, "promise");
            if (resultCode != -1) {
                if (resultCode == 0) {
                    promise.resolve(e.d(d.Canceled.toString(), "The payment has been canceled"));
                    return;
                } else {
                    if (resultCode == 1 && (statusFromIntent = AutoResolveHelper.getStatusFromIntent(data)) != null) {
                        promise.resolve(e.d(d.Failed.toString(), statusFromIntent.getStatusMessage()));
                        return;
                    }
                    return;
                }
            }
            if (data == null || (fromIntent = PaymentData.getFromIntent(data)) == null) {
                return;
            }
            if (forToken) {
                o0.INSTANCE.h(fromIntent, promise);
            } else {
                o0.INSTANCE.g(fromIntent, stripe, promise);
            }
        }

        private Companion() {
        }
    }
}
