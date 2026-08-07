package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tesla/oapi/CalendarSyncBody;", "", "calendarData", "Lcom/tesla/oapi/CalendarData;", "<init>", "(Lcom/tesla/oapi/CalendarData;)V", "getCalendarData", "()Lcom/tesla/oapi/CalendarData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarSyncBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CalendarSyncBody EMPTY = new CalendarSyncBody(new CalendarData(false, "", false, false, "", "", v.m()));

    @g(name = "calendar_data")
    private final CalendarData calendarData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/CalendarSyncBody$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/tesla/oapi/CalendarSyncBody;", "getEMPTY", "()Lcom/tesla/oapi/CalendarSyncBody;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CalendarSyncBody getEMPTY() {
            return CalendarSyncBody.EMPTY;
        }

        private Companion() {
        }
    }

    public CalendarSyncBody(CalendarData calendarData) {
        s.k(calendarData, "calendarData");
        this.calendarData = calendarData;
    }

    public static /* synthetic */ CalendarSyncBody copy$default(CalendarSyncBody calendarSyncBody, CalendarData calendarData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            calendarData = calendarSyncBody.calendarData;
        }
        return calendarSyncBody.copy(calendarData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CalendarData getCalendarData() {
        return this.calendarData;
    }

    public final CalendarSyncBody copy(CalendarData calendarData) {
        s.k(calendarData, "calendarData");
        return new CalendarSyncBody(calendarData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalendarSyncBody) && s.f(this.calendarData, ((CalendarSyncBody) other).calendarData);
    }

    public final CalendarData getCalendarData() {
        return this.calendarData;
    }

    public int hashCode() {
        return this.calendarData.hashCode();
    }

    public String toString() {
        return "CalendarSyncBody(calendarData=" + this.calendarData + ")";
    }
}
