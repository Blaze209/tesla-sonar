package expo.modules.calendar.dialogs;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.calendar.EventRecurrenceUtils;
import expo.modules.calendar.JsValuesMappersKt;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import java.text.ParseException;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lexpo/modules/calendar/dialogs/CreateEventContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/calendar/dialogs/CreatedEventOptions;", "Lexpo/modules/calendar/dialogs/CreateEventIntentResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "input", "getTimestamp", "", "it", "", "parseResult", StatusResponse.RESULT_CODE, "", AnalyticsAttribute.Intent, "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateEventContract implements AppContextActivityResultContract<CreatedEventOptions, CreateEventIntentResult> {
    private final long getTimestamp(String it) throws ParseException {
        Date date = EventRecurrenceUtils.INSTANCE.getDateFormat().parse(it);
        Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        throw new IllegalArgumentException("Invalid date format");
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, CreatedEventOptions input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent data = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
        s.j(data, "setData(...)");
        String title = input.getTitle();
        if (title != null) {
            data.putExtra("title", title);
        }
        Boolean allDay = input.getAllDay();
        if (allDay != null) {
            data.putExtra("allDay", allDay.booleanValue());
        }
        String notes = input.getNotes();
        if (notes != null) {
            data.putExtra("description", notes);
        }
        String location = input.getLocation();
        if (location != null) {
            data.putExtra("eventLocation", location);
        }
        String startDate = input.getStartDate();
        if (startDate != null) {
            data.putExtra("beginTime", getTimestamp(startDate));
        }
        String endDate = input.getEndDate();
        if (endDate != null) {
            data.putExtra("endTime", getTimestamp(endDate));
        }
        String timeZone = input.getTimeZone();
        if (timeZone != null) {
            data.putExtra("eventTimezone", timeZone);
        }
        String availability = input.getAvailability();
        if (availability != null) {
            data.putExtra("availability", JsValuesMappersKt.availabilityConstantMatchingString(availability));
        }
        ReadableArguments recurrenceRule = input.getRecurrenceRule();
        if (recurrenceRule != null) {
            EventRecurrenceUtils eventRecurrenceUtils = EventRecurrenceUtils.INSTANCE;
            data.putExtra("rrule", eventRecurrenceUtils.createRecurrenceRule(eventRecurrenceUtils.extractRecurrence(recurrenceRule)));
        }
        boolean startNewActivityTask = input.getStartNewActivityTask();
        Boolean boolValueOf = Boolean.valueOf(startNewActivityTask);
        if (!startNewActivityTask) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            data.addFlags(268435456);
        }
        return data;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public CreateEventIntentResult parseResult(CreatedEventOptions input, int resultCode, Intent intent) {
        s.k(input, "input");
        return new CreateEventIntentResult(null, 1, null);
    }
}
