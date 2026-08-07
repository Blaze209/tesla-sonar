package expo.modules.calendar.dialogs;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lexpo/modules/calendar/dialogs/ViewEventContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/calendar/dialogs/ViewedEventOptions;", "Lexpo/modules/calendar/dialogs/ViewEventIntentResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "input", "parseResult", StatusResponse.RESULT_CODE, "", AnalyticsAttribute.Intent, "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewEventContract implements AppContextActivityResultContract<ViewedEventOptions, ViewEventIntentResult> {
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, ViewedEventOptions input) {
        s.k(context, "context");
        s.k(input, "input");
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(input.getId()));
        s.j(uriWithAppendedId, "withAppendedId(...)");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uriWithAppendedId);
        boolean startNewActivityTask = input.getStartNewActivityTask();
        Boolean boolValueOf = Boolean.valueOf(startNewActivityTask);
        if (!startNewActivityTask) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public ViewEventIntentResult parseResult(ViewedEventOptions input, int resultCode, Intent intent) {
        s.k(input, "input");
        return new ViewEventIntentResult(null, 1, null);
    }
}
