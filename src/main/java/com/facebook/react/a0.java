package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u0012H&¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u00122\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H&¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020(H&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b2\u00103R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Lcom/facebook/react/a0;", "", "", "onBackPressed", "()Z", "Landroid/app/Activity;", "activity", "Lco/a;", "defaultBackButtonImpl", "Ljn0/h0;", "q", "(Landroid/app/Activity;Lco/a;)V", "l", "(Landroid/app/Activity;)V", "o", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "moduleName", "Landroid/os/Bundle;", "initialProps", "Lrn/a;", "m", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lrn/a;", "Lqn/a;", "Ljava/lang/Void;", "start", "()Lqn/a;", AnalyticsAttribute.Reason, "a", "(Ljava/lang/String;)Lqn/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "n", "(Ljava/lang/String;Ljava/lang/Exception;)Lqn/a;", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "hasFocus", "onWindowFocusChange", "(Z)V", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "j", "(Landroid/content/Context;)V", "Lcom/facebook/react/common/LifecycleState;", "p", "()Lcom/facebook/react/common/LifecycleState;", "lifecycleState", "Lcom/facebook/react/bridge/ReactContext;", "h", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "Lpn/e;", IntegerTokenConverter.CONVERTER_KEY, "()Lpn/e;", "devSupportManager", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a0 {
    qn.a<Void> a(String reason);

    ReactContext h();

    pn.e i();

    void j(Context context);

    void k(Activity activity);

    void l(Activity activity);

    rn.a m(Context context, String moduleName, Bundle initialProps);

    qn.a<Void> n(String reason, Exception ex2);

    void o(Activity activity);

    void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data);

    boolean onBackPressed();

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean hasFocus);

    LifecycleState p();

    void q(Activity activity, co.a defaultBackButtonImpl);

    qn.a<Void> start();
}
