package com.content.pushprovisioning;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s10.e;
import wn0.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2&\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\b0\u001aj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/f;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/reactnativestripesdk/pushprovisioning/b;", "view", "Ljn0/h0;", "c", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/b;)V", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "", "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "cardDescription", "ephemeralKey", "Lcom/facebook/react/bridge/ReadableMap;", "token", "e", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "Landroid/app/Activity;", "activity", "cardLastFour", "Lkotlin/Function3;", "Lcom/facebook/react/bridge/WritableMap;", "Lcom/reactnativestripesdk/pushprovisioning/TokenCheckHandler;", "callback", "f", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/q;)V", "b", "Ljava/lang/String;", "description", "Lcom/facebook/react/bridge/ReadableMap;", "tokenRequiringTokenization", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48883a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String description = "Added by Stripe";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static ReadableMap tokenRequiringTokenization;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/pushprovisioning/f$a", "Lcom/facebook/react/bridge/BaseActivityEventListener;", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends BaseActivityEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f48886a;

        a(b bVar) {
            this.f48886a = bVar;
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            s.k(activity, "activity");
            super.onActivityResult(activity, requestCode, resultCode, data);
            if (requestCode != 8000) {
                if (requestCode != 90909) {
                    return;
                }
                this.f48886a.e(resultCode != -1 ? e.h("Failed", "Failed to verify identity.", null, null, null, null) : null);
                return;
            }
            if (resultCode != -1) {
                if (resultCode == 500 && data != null) {
                    b bVar = this.f48886a;
                    PushProvisioningActivityStarter.Error errorFromIntent = PushProvisioningActivityStarter.Error.fromIntent(data);
                    s.j(errorFromIntent, "fromIntent(...)");
                    bVar.e(e.h(errorFromIntent.code.toString(), errorFromIntent.message, null, null, null, null));
                    return;
                }
                return;
            }
            ReadableMap readableMap = f.tokenRequiringTokenization;
            if (readableMap == null) {
                this.f48886a.e(null);
                return;
            }
            b bVar2 = this.f48886a;
            String string = readableMap.getString("id");
            if (string == null || t.y0(string)) {
                bVar2.e(e.h("Failed", "Token object passed to `<AddToWalletButton />` is missing the `id` field.", null, null, null, null));
            } else {
                h.f48889a.h(activity, string, readableMap, f.description);
            }
        }
    }

    private f() {
    }

    private final void c(ReactApplicationContext context, b view) {
        context.addActivityEventListener(new a(view));
    }

    public final String d() {
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivity");
            return "2019-09-09";
        } catch (Exception unused) {
            Log.e("StripePushProvisioning", "PushProvisioning dependency not found");
            return "";
        }
    }

    public final void e(ReactApplicationContext context, b view, String cardDescription, String ephemeralKey, ReadableMap token) {
        s.k(context, "context");
        s.k(view, "view");
        s.k(cardDescription, "cardDescription");
        s.k(ephemeralKey, "ephemeralKey");
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivityStarter");
            description = cardDescription;
            tokenRequiringTokenization = token;
            c(context, view);
            Activity currentActivity = context.getCurrentActivity();
            if (currentActivity != null) {
                new d().a(currentActivity, description, new e(ephemeralKey));
            } else {
                view.e(e.d("Failed", "Activity doesn't exist yet. You can safely retry."));
            }
        } catch (Exception e11) {
            Log.e("StripePushProvisioning", "There was a problem using Stripe Android PushProvisioning: " + e11.getMessage());
        }
    }

    public final void f(Activity activity, String cardLastFour, q<? super Boolean, ? super WritableMap, ? super WritableMap, h0> callback) {
        s.k(activity, "activity");
        s.k(cardLastFour, "cardLastFour");
        s.k(callback, "callback");
        h.f48889a.b(activity, cardLastFour, callback);
    }

    public final boolean g(ReactApplicationContext context) {
        NfcAdapter defaultAdapter;
        s.k(context, "context");
        if (!context.getPackageManager().hasSystemFeature("android.hardware.nfc") || (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) == null) {
            return false;
        }
        return defaultAdapter.isEnabled();
    }
}
