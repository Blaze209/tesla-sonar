package vb0;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvb0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Bundle;", "bundle", "Landroid/app/PendingIntent;", AnalyticsAttribute.Intent, "Lvb0/b;", "a", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    Object a(Context context, Bundle bundle, PendingIntent pendingIntent, Continuation<? super NotificationPackage> continuation);
}
