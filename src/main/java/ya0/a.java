package ya0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJe\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 ¨\u0006\""}, d2 = {"Lya0/a;", "", "<init>", "()V", "", "id", "", "name", "color", "Ljn0/h0;", "a", "(ILjava/lang/String;Ljava/lang/String;)V", "", "Lcom/tesla/oapi/Calendar;", "c", "()Ljava/util/List;", "calendarId", "", "eventId", "title", "dtstart", "dtend", "", "allDay", "location", "organizer", PermissionsResponse.STATUS_KEY, "description", "b", "(IJLjava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "", "Lya0/a$a;", "Ljava/util/Map;", "calendars", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, Calendar> calendars = new LinkedHashMap();

    /* JADX INFO: renamed from: ya0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b(\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b*\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b$\u0010\u0016R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b\"\u0010'R\u0017\u00101\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b-\u0010'¨\u00062"}, d2 = {"Lya0/a$b;", "", "", "eventId", "", "name", "dtstart", "dtend", "", "allDay", "location", "color", "organizer", "", PermissionsResponse.STATUS_KEY, "description", "<init>", "(JLjava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "other", "a", "(Lya0/a$b;)I", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getEventId", "()J", "b", "Ljava/lang/String;", "h", "c", "f", DateTokenConverter.CONVERTER_KEY, "e", "Z", "()Z", "g", "getColor", IntegerTokenConverter.CONVERTER_KEY, "I", "getStatus", "j", "k", "cancelled", "l", "tentative", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarEvent implements Comparable<CalendarEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long eventId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long dtstart;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long dtend;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allDay;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String location;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String color;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String organizer;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final int status;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final boolean cancelled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final boolean tentative;

        public CalendarEvent(long j11, String name, long j12, long j13, boolean z11, String location, String color, String organizer, int i11, String description) {
            s.k(name, "name");
            s.k(location, "location");
            s.k(color, "color");
            s.k(organizer, "organizer");
            s.k(description, "description");
            this.eventId = j11;
            this.name = name;
            this.dtstart = j12;
            this.dtend = j13;
            this.allDay = z11;
            this.location = location;
            this.color = color;
            this.organizer = organizer;
            this.status = i11;
            this.description = description;
            this.cancelled = i11 == 2;
            this.tentative = i11 == 0;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(CalendarEvent other) {
            s.k(other, "other");
            long j11 = this.dtstart;
            long j12 = other.dtstart;
            if (j11 == j12) {
                j11 = this.eventId;
                j12 = other.eventId;
            }
            return (int) (j11 - j12);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getAllDay() {
            return this.allDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCancelled() {
            return this.cancelled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getDtend() {
            return this.dtend;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarEvent)) {
                return false;
            }
            CalendarEvent calendarEvent = (CalendarEvent) other;
            return this.eventId == calendarEvent.eventId && s.f(this.name, calendarEvent.name) && this.dtstart == calendarEvent.dtstart && this.dtend == calendarEvent.dtend && this.allDay == calendarEvent.allDay && s.f(this.location, calendarEvent.location) && s.f(this.color, calendarEvent.color) && s.f(this.organizer, calendarEvent.organizer) && this.status == calendarEvent.status && s.f(this.description, calendarEvent.description);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getDtstart() {
            return this.dtstart;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((((((((((((((((Long.hashCode(this.eventId) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.dtstart)) * 31) + Long.hashCode(this.dtend)) * 31) + Boolean.hashCode(this.allDay)) * 31) + this.location.hashCode()) * 31) + this.color.hashCode()) * 31) + this.organizer.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.description.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getOrganizer() {
            return this.organizer;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getTentative() {
            return this.tentative;
        }

        public String toString() {
            return "CalendarEvent(eventId=" + this.eventId + ", name=" + this.name + ", dtstart=" + this.dtstart + ", dtend=" + this.dtend + ", allDay=" + this.allDay + ", location=" + this.location + ", color=" + this.color + ", organizer=" + this.organizer + ", status=" + this.status + ", description=" + this.description + ")";
        }
    }

    public final void a(int id2, String name, String color) {
        s.k(name, "name");
        s.k(color, "color");
        this.calendars.put(Integer.valueOf(id2), new Calendar(id2, name, color, null, 8, null));
    }

    public final void b(int calendarId, long eventId, String title, long dtstart, long dtend, boolean allDay, String location, String color, String organizer, int status, String description) {
        s.k(title, "title");
        s.k(location, "location");
        s.k(color, "color");
        s.k(organizer, "organizer");
        s.k(description, "description");
        Calendar calendar = this.calendars.get(Integer.valueOf(calendarId));
        if (calendar != null) {
            calendar.a(new CalendarEvent(eventId, title, dtstart, dtend, allDay, location, color, organizer, status, description));
        }
    }

    public final List<com.tesla.oapi.Calendar> c() {
        Collection<Calendar> collectionValues = this.calendars.values();
        ArrayList arrayList = new ArrayList(v.y(collectionValues, 10));
        for (Calendar calendar : collectionValues) {
            String name = calendar.getName();
            String color = calendar.getColor();
            List<CalendarEvent> listD = calendar.d();
            ArrayList arrayList2 = new ArrayList(v.y(listD, 10));
            for (CalendarEvent calendarEvent : listD) {
                arrayList2.add(new com.tesla.oapi.Calendar.Event(calendarEvent.getAllDay(), calendarEvent.getDtstart(), calendarEvent.getDtend(), calendarEvent.getName(), calendarEvent.getLocation(), calendarEvent.getDescription(), calendarEvent.getOrganizer(), Boolean.valueOf(calendarEvent.getCancelled()), Boolean.valueOf(calendarEvent.getTentative())));
            }
            arrayList.add(new com.tesla.oapi.Calendar(name, color, arrayList2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ya0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0!8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"Lya0/a$a;", "", "", "id", "", "name", "color", "", "Lya0/a$b;", "_events", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "event", "", "a", "(Lya0/a$b;)Z", "other", "b", "(Lya0/a$a;)I", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "e", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "", "()Ljava/util/List;", "events", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Calendar implements Comparable<Calendar> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String color;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CalendarEvent> _events;

        public Calendar(int i11, String name, String color, List<CalendarEvent> _events) {
            s.k(name, "name");
            s.k(color, "color");
            s.k(_events, "_events");
            this.id = i11;
            this.name = name;
            this.color = color;
            this._events = _events;
        }

        public final boolean a(CalendarEvent event) {
            s.k(event, "event");
            return this._events.add(event);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Calendar other) {
            s.k(other, "other");
            return s.m(this.id, other.id);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        public final List<CalendarEvent> d() {
            return v.Y0(this._events);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Calendar)) {
                return false;
            }
            Calendar calendar = (Calendar) other;
            return this.id == calendar.id && s.f(this.name, calendar.name) && s.f(this.color, calendar.color) && s.f(this._events, calendar._events);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.color.hashCode()) * 31) + this._events.hashCode();
        }

        public String toString() {
            return "Calendar(id=" + this.id + ", name=" + this.name + ", color=" + this.color + ", _events=" + this._events + ")";
        }

        public /* synthetic */ Calendar(int i11, String str, String str2, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, (i12 & 8) != 0 ? new ArrayList() : list);
        }
    }
}
