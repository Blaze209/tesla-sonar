package com.tesla.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.widget.worker.WidgetCommandExecutionWorker;
import ne0.c;
import ne0.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/widget/WidgetCommandReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetCommandReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        String queryParameter;
        String queryParameter2;
        c cVarE;
        String queryParameter3;
        Integer numX;
        s.k(context, "context");
        s.k(intent, "intent");
        if (!s.f(intent.getAction(), "com.teslamotors.tesla.action.ACTION_VEHICLE_COMMAND") || (data = intent.getData()) == null || (queryParameter = data.getQueryParameter("vin")) == null || (queryParameter2 = data.getQueryParameter("command")) == null || (cVarE = d.e(queryParameter2)) == null || (queryParameter3 = data.getQueryParameter("app_widget_id")) == null || (numX = t.x(queryParameter3)) == null) {
            return;
        }
        int iIntValue = numX.intValue();
        me0.c.a().a("Widget-" + iIntValue + " Command: " + cVarE + " Broadcast received for vehicle " + queryParameter);
        WidgetCommandExecutionWorker.INSTANCE.b(context, iIntValue, queryParameter, cVarE);
    }
}
