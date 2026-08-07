package com.content.pushprovisioning;

import android.app.Activity;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import s10.e;
import wn0.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00102&\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/h;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/tasks/Task;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;", "token", "Lcom/facebook/react/bridge/WritableMap;", "f", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "", PermissionsResponse.STATUS_KEY, "", "g", "(I)Ljava/lang/String;", "newLastFour", "", "e", "(Ljava/lang/Object;Ljava/lang/String;)Z", "newCardLastFour", "Lkotlin/Function3;", "Ljn0/h0;", "Lcom/reactnativestripesdk/pushprovisioning/TokenCheckHandler;", "callback", "b", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/q;)V", "tokenReferenceId", "Lcom/facebook/react/bridge/ReadableMap;", "cardDescription", "h", "(Landroid/app/Activity;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)V", "Ljava/lang/Object;", "tapAndPayClient", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f48889a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Object tapAndPayClient;

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, q qVar, Task task) {
        s.k(task, "task");
        if (task.isSuccessful()) {
            for (Object obj : (List) task.getResult()) {
                h hVar = f48889a;
                if (hVar.e(obj, str)) {
                    qVar.invoke(Boolean.TRUE, hVar.f(obj), null);
                    return;
                }
            }
        } else {
            Log.e("StripeTapAndPay", "Unable to fetch existing tokens from Google TapAndPay.");
        }
        qVar.invoke(Boolean.FALSE, null, null);
    }

    private final Task<List<Object>> d(Activity activity) {
        try {
            Object objInvoke = Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getMethod("listTokens", null).invoke(Class.forName("com.google.android.gms.tapandpay.TapAndPay").getMethod("getClient", Activity.class).invoke(null, activity), null);
            s.i(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<kotlin.collections.List<kotlin.Any>>");
            return (Task) objInvoke;
        } catch (Exception e11) {
            Log.e("StripeTapAndPay", "There was a problem listing tokens with Google TapAndPay: " + e11.getMessage());
            return null;
        }
    }

    private final WritableMap f(Object token) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (token != null) {
            try {
                Class<?> cls = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo");
                Object objInvoke = cls.getMethod("getIssuerTokenId", null).invoke(token, null);
                s.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString("id", (String) objInvoke);
                Object objInvoke2 = cls.getMethod("getFpanLastFour", null).invoke(token, null);
                s.i(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) objInvoke2;
                writableNativeMap.putString("cardLastFour", str);
                writableNativeMap.putString("fpanLastFour", str);
                Object objInvoke3 = cls.getMethod("getDpanLastFour", null).invoke(token, null);
                s.i(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString("dpanLastFour", (String) objInvoke3);
                Object objInvoke4 = cls.getMethod("getIssuerName", null).invoke(token, null);
                s.i(objInvoke4, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString(IssuerListPaymentMethod.ISSUER, (String) objInvoke4);
                h hVar = f48889a;
                Object objInvoke5 = cls.getMethod("getTokenState", null).invoke(token, null);
                s.i(objInvoke5, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putString(PermissionsResponse.STATUS_KEY, hVar.g(((Integer) objInvoke5).intValue()));
                Object objInvoke6 = cls.getMethod("getNetwork", null).invoke(token, null);
                s.i(objInvoke6, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putInt("network", ((Integer) objInvoke6).intValue());
                Object objInvoke7 = cls.getMethod("getTokenServiceProvider", null).invoke(token, null);
                s.i(objInvoke7, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putInt("serviceProvider", ((Integer) objInvoke7).intValue());
                h0 h0Var = h0.f84049a;
            } catch (Exception e11) {
                Log.e("StripeTapAndPay", "There was a problem mapping the token information with Google TapAndPay: " + e11.getMessage());
            }
        }
        return writableNativeMap;
    }

    private final String g(int status) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tapandpay.TapAndPay");
            Object obj = cls.getField("TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION").get(cls);
            if ((obj instanceof Integer) && status == ((Number) obj).intValue()) {
                return "TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION";
            }
            Object obj2 = cls.getField("TOKEN_STATE_PENDING").get(cls);
            if ((obj2 instanceof Integer) && status == ((Number) obj2).intValue()) {
                return "TOKEN_STATE_PENDING";
            }
            Object obj3 = cls.getField("TOKEN_STATE_SUSPENDED").get(cls);
            if ((obj3 instanceof Integer) && status == ((Number) obj3).intValue()) {
                return "TOKEN_STATE_SUSPENDED";
            }
            Object obj4 = cls.getField("TOKEN_STATE_ACTIVE").get(cls);
            if ((obj4 instanceof Integer) && status == ((Number) obj4).intValue()) {
                return "TOKEN_STATE_ACTIVE";
            }
            Object obj5 = cls.getField("TOKEN_STATE_FELICA_PENDING_PROVISIONING").get(cls);
            if ((obj5 instanceof Integer) && status == ((Number) obj5).intValue()) {
                return "TOKEN_STATE_FELICA_PENDING_PROVISIONING";
            }
            Object obj6 = cls.getField("TOKEN_STATE_UNTOKENIZED").get(cls);
            return ((obj6 instanceof Integer) && status == ((Number) obj6).intValue()) ? "TOKEN_STATE_UNTOKENIZED" : "UNKNOWN";
        } catch (Exception e11) {
            Log.e("StripeTapAndPay", "There was a problem mapping the token state with Google TapAndPay: " + e11.getMessage());
            return "UNKNOWN";
        }
    }

    public final void b(Activity activity, final String newCardLastFour, final q<? super Boolean, ? super WritableMap, ? super WritableMap, h0> callback) {
        s.k(activity, "activity");
        s.k(newCardLastFour, "newCardLastFour");
        s.k(callback, "callback");
        Task<List<Object>> taskD = d(activity);
        if (taskD == null) {
            callback.invoke(Boolean.FALSE, null, e.d("Failed", "Google TapAndPay dependency not found."));
        } else {
            taskD.addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativestripesdk.pushprovisioning.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h.c(newCardLastFour, callback, task);
                }
            });
        }
    }

    public final boolean e(Object token, String newLastFour) {
        s.k(token, "token");
        s.k(newLastFour, "newLastFour");
        try {
            Object objInvoke = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo").getMethod("getFpanLastFour", null).invoke(token, null);
            s.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return s.f((String) objInvoke, newLastFour);
        } catch (Exception e11) {
            Log.e("StripeTapAndPay", "There was a problem getting the FPAN with Google TapAndPay: " + e11.getMessage());
            return false;
        }
    }

    public final void h(Activity activity, String tokenReferenceId, ReadableMap token, String cardDescription) {
        s.k(activity, "activity");
        s.k(tokenReferenceId, "tokenReferenceId");
        s.k(token, "token");
        s.k(cardDescription, "cardDescription");
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getClass();
            Class cls2 = Integer.TYPE;
            cls.getMethod("tokenize", Activity.class, String.class, cls2, String.class, cls2, cls2).invoke(tapAndPayClient, activity, tokenReferenceId, Integer.valueOf(token.getInt("serviceProvider")), cardDescription, Integer.valueOf(token.getInt("network")), 90909);
        } catch (Exception e11) {
            Log.e("StripeTapAndPay", "There was a problem tokenizing with Google TapAndPay: " + e11.getMessage());
        }
    }
}
