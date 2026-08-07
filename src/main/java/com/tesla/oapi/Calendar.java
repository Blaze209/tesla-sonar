package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tesla/oapi/Calendar;", "", "name", "", "color", "events", "", "Lcom/tesla/oapi/Calendar$Event;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getColor", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Event", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Calendar {

    @g(name = "color")
    private final String color;

    @g(name = "events")
    private final List<Event> events;

    @g(name = "name")
    private final String name;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\r\u0010 \u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010!\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ|\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001c¨\u0006/"}, d2 = {"Lcom/tesla/oapi/Calendar$Event;", "", "allDay", "", "start", "", "Lcom/tesla/oapi/MillisecondsSince1970;", "end", "name", "", "location", "notes", "organizer", "cancelled", "tentative", "<init>", "(ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAllDay", "()Z", "getStart", "()J", "getEnd", "getName", "()Ljava/lang/String;", "getLocation", "getNotes", "getOrganizer", "getCancelled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTentative", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tesla/oapi/Calendar$Event;", "equals", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event {

        @g(name = "all_day")
        private final boolean allDay;

        @g(name = "cancelled")
        private final Boolean cancelled;

        @g(name = "end")
        private final long end;

        @g(name = "location")
        private final String location;

        @g(name = "name")
        private final String name;

        @g(name = "description")
        private final String notes;

        @g(name = "organizer")
        private final String organizer;

        @g(name = "start")
        private final long start;

        @g(name = "tentative")
        private final Boolean tentative;

        public Event(boolean z11, long j11, long j12, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
            this.allDay = z11;
            this.start = j11;
            this.end = j12;
            this.name = str;
            this.location = str2;
            this.notes = str3;
            this.organizer = str4;
            this.cancelled = bool;
            this.tentative = bool2;
        }

        public static /* synthetic */ Event copy$default(Event event, boolean z11, long j11, long j12, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = event.allDay;
            }
            if ((i11 & 2) != 0) {
                j11 = event.start;
            }
            if ((i11 & 4) != 0) {
                j12 = event.end;
            }
            if ((i11 & 8) != 0) {
                str = event.name;
            }
            if ((i11 & 16) != 0) {
                str2 = event.location;
            }
            if ((i11 & 32) != 0) {
                str3 = event.notes;
            }
            if ((i11 & 64) != 0) {
                str4 = event.organizer;
            }
            if ((i11 & 128) != 0) {
                bool = event.cancelled;
            }
            if ((i11 & 256) != 0) {
                bool2 = event.tentative;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            long j13 = j12;
            return event.copy(z11, j11, j13, str, str2, str3, str4, bool3, bool4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAllDay() {
            return this.allDay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOrganizer() {
            return this.organizer;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getCancelled() {
            return this.cancelled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getTentative() {
            return this.tentative;
        }

        public final Event copy(boolean allDay, long start, long end, String name, String location, String notes, String organizer, Boolean cancelled, Boolean tentative) {
            return new Event(allDay, start, end, name, location, notes, organizer, cancelled, tentative);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return this.allDay == event.allDay && this.start == event.start && this.end == event.end && s.f(this.name, event.name) && s.f(this.location, event.location) && s.f(this.notes, event.notes) && s.f(this.organizer, event.organizer) && s.f(this.cancelled, event.cancelled) && s.f(this.tentative, event.tentative);
        }

        public final boolean getAllDay() {
            return this.allDay;
        }

        public final Boolean getCancelled() {
            return this.cancelled;
        }

        public final long getEnd() {
            return this.end;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final String getOrganizer() {
            return this.organizer;
        }

        public final long getStart() {
            return this.start;
        }

        public final Boolean getTentative() {
            return this.tentative;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.allDay) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end)) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.location;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.notes;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.organizer;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.cancelled;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.tentative;
            return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Event(allDay=" + this.allDay + ", start=" + this.start + ", end=" + this.end + ", name=" + this.name + ", location=" + this.location + ", notes=" + this.notes + ", organizer=" + this.organizer + ", cancelled=" + this.cancelled + ", tentative=" + this.tentative + ")";
        }
    }

    public Calendar(String name, String color, List<Event> events) {
        s.k(name, "name");
        s.k(color, "color");
        s.k(events, "events");
        this.name = name;
        this.color = color;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Calendar copy$default(Calendar calendar, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = calendar.name;
        }
        if ((i11 & 2) != 0) {
            str2 = calendar.color;
        }
        if ((i11 & 4) != 0) {
            list = calendar.events;
        }
        return calendar.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final List<Event> component3() {
        return this.events;
    }

    public final Calendar copy(String name, String color, List<Event> events) {
        s.k(name, "name");
        s.k(color, "color");
        s.k(events, "events");
        return new Calendar(name, color, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Calendar)) {
            return false;
        }
        Calendar calendar = (Calendar) other;
        return s.f(this.name, calendar.name) && s.f(this.color, calendar.color) && s.f(this.events, calendar.events);
    }

    public final String getColor() {
        return this.color;
    }

    public final List<Event> getEvents() {
        return this.events;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.color.hashCode()) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "Calendar(name=" + this.name + ", color=" + this.color + ", events=" + this.events + ")";
    }
}
