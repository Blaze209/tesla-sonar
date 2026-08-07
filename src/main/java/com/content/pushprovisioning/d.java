package com.content.pushprovisioning;

import android.app.Activity;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/d;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "description", "Lcom/reactnativestripesdk/pushprovisioning/e;", "provider", "Ljn0/h0;", "a", "(Landroid/app/Activity;Ljava/lang/String;Lcom/reactnativestripesdk/pushprovisioning/e;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {
    public final void a(Activity activity, String description, e provider) {
        s.k(activity, "activity");
        s.k(description, "description");
        s.k(provider, "provider");
        new PushProvisioningActivityStarter(activity, new PushProvisioningActivityStarter.Args(description, provider, false)).startForResult();
    }
}
