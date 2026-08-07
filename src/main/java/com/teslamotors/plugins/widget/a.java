package com.teslamotors.plugins.widget;

import android.content.Context;
import android.content.Intent;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "a", "(Landroid/content/Context;Landroid/content/Intent;)V", "tesla-oem-widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final void a(Context context, Intent intent) {
        s.k(context, "<this>");
        s.k(intent, "intent");
        OemWidgetCardProvider.Companion companion = OemWidgetCardProvider.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        companion.c(applicationContext, intent);
    }
}
