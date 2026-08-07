package expo.modules.calendar;

import expo.modules.contacts.Columns;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\f\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004\"\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\t\u0010\u0004\"\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000b\u0010\u0004\"\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"findCalendarByIdQueryFields", "", "", "getFindCalendarByIdQueryFields", "()[Ljava/lang/String;", "[Ljava/lang/String;", "findAttendeesByEventIdQueryParameters", "getFindAttendeesByEventIdQueryParameters", "findEventByIdQueryParameters", "getFindEventByIdQueryParameters", "findEventsQueryParameters", "getFindEventsQueryParameters", "findCalendarsQueryParameters", "getFindCalendarsQueryParameters", "expo-calendar_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConstantsKt {
    private static final String[] findCalendarByIdQueryFields = {Columns.ID, "calendar_displayName", "account_name", "isPrimary", "calendar_access_level", "allowedAvailability", "name", "account_type", "calendar_color", "ownerAccount", "calendar_timezone", "allowedReminders", "allowedAttendeeTypes", "visible", "sync_events"};
    private static final String[] findAttendeesByEventIdQueryParameters = {Columns.ID, "attendeeName", "attendeeEmail", "attendeeRelationship", "attendeeType", "attendeeStatus"};
    private static final String[] findEventByIdQueryParameters = {Columns.ID, "title", "description", "dtstart", "dtend", "allDay", "eventLocation", "rrule", "calendar_id", "availability", "organizer", "eventTimezone", "eventEndTimezone", "accessLevel", "guestsCanModify", "guestsCanInviteOthers", "guestsCanSeeGuests", "original_id"};
    private static final String[] findEventsQueryParameters = {"event_id", "title", "description", "begin", "end", "allDay", "eventLocation", "rrule", "calendar_id", "availability", "organizer", "eventTimezone", "eventEndTimezone", "accessLevel", "guestsCanModify", "guestsCanInviteOthers", "guestsCanSeeGuests", "original_id", Columns.ID};
    private static final String[] findCalendarsQueryParameters = {Columns.ID, "calendar_displayName", "account_name", "isPrimary", "calendar_access_level", "allowedAvailability", "name", "account_type", "calendar_color", "ownerAccount", "calendar_timezone", "allowedReminders", "allowedAttendeeTypes", "visible", "sync_events"};

    public static final String[] getFindAttendeesByEventIdQueryParameters() {
        return findAttendeesByEventIdQueryParameters;
    }

    public static final String[] getFindCalendarByIdQueryFields() {
        return findCalendarByIdQueryFields;
    }

    public static final String[] getFindCalendarsQueryParameters() {
        return findCalendarsQueryParameters;
    }

    public static final String[] getFindEventByIdQueryParameters() {
        return findEventByIdQueryParameters;
    }

    public static final String[] getFindEventsQueryParameters() {
        return findEventsQueryParameters;
    }
}
