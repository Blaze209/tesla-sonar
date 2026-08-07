package expo.modules.calendar;

import android.content.ContentValues;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.arguments.ReadableArguments;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J;\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u000e\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/calendar/AttendeeBuilder;", "", "Lexpo/modules/core/arguments/ReadableArguments;", "attendeeDetails", "<init>", "(Lexpo/modules/core/arguments/ReadableArguments;)V", "", Action.KEY_ATTRIBUTE, "", "value", "put", "(Ljava/lang/String;Ljava/lang/Integer;)Lexpo/modules/calendar/AttendeeBuilder;", "detailsKey", "detailsString", "putString", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/calendar/AttendeeBuilder;", "", "isRequired", "(Ljava/lang/String;Ljava/lang/String;Z)Lexpo/modules/calendar/AttendeeBuilder;", "Lkotlin/Function1;", "mapper", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lwn0/l;)Lexpo/modules/calendar/AttendeeBuilder;", "Landroid/content/ContentValues;", "build", "()Landroid/content/ContentValues;", "Lexpo/modules/core/arguments/ReadableArguments;", "attendeeValues", "Landroid/content/ContentValues;", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AttendeeBuilder {
    private final ReadableArguments attendeeDetails;
    private final ContentValues attendeeValues;

    public AttendeeBuilder(ReadableArguments attendeeDetails) {
        s.k(attendeeDetails, "attendeeDetails");
        this.attendeeDetails = attendeeDetails;
        this.attendeeValues = new ContentValues();
    }

    /* JADX INFO: renamed from: build, reason: from getter */
    public final ContentValues getAttendeeValues() {
        return this.attendeeValues;
    }

    public final AttendeeBuilder put(String key, Integer value) {
        s.k(key, "key");
        this.attendeeValues.put(key, value);
        return this;
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString) {
        s.k(detailsKey, "detailsKey");
        s.k(detailsString, "detailsString");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            this.attendeeValues.put(detailsString, this.attendeeDetails.getString(detailsKey));
        }
        return this;
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString, boolean isRequired) throws Exception {
        s.k(detailsKey, "detailsKey");
        s.k(detailsString, "detailsString");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            this.attendeeValues.put(detailsString, this.attendeeDetails.getString(detailsKey));
            return this;
        }
        if (!isRequired) {
            return this;
        }
        throw new Exception("new attendees require `" + detailsKey + "`");
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString, Boolean isRequired, l<? super String, Integer> mapper) throws Exception {
        s.k(detailsKey, "detailsKey");
        s.k(detailsString, "detailsString");
        s.k(mapper, "mapper");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            ContentValues contentValues = this.attendeeValues;
            String string = this.attendeeDetails.getString(detailsKey);
            s.j(string, "getString(...)");
            contentValues.put(detailsString, mapper.invoke(string));
            return this;
        }
        if (!s.f(isRequired, Boolean.TRUE)) {
            return this;
        }
        throw new Exception("new attendees require `" + detailsKey + "`");
    }
}
