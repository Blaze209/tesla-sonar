package com.tesla.oapi;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/tesla/oapi/CalendarData;", "", "accessDisabled", "", "phoneName", "", "notificationDisabled", "backgroundDisabled", "uuid", AnalyticsAttribute.Reason, "calendars", "", "Lcom/tesla/oapi/Calendar;", "<init>", "(ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccessDisabled", "()Z", "getPhoneName", "()Ljava/lang/String;", "getNotificationDisabled", "getBackgroundDisabled", "getUuid", "getReason", "getCalendars", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarData {

    @g(name = "access_disabled")
    private final boolean accessDisabled;

    @g(name = "background_disabled")
    private final boolean backgroundDisabled;

    @g(name = "calendars")
    private final List<Calendar> calendars;

    @g(name = "notification_disabled")
    private final boolean notificationDisabled;

    @g(name = "phone_name")
    private final String phoneName;

    @g(name = AnalyticsAttribute.Reason)
    private final String reason;

    @g(name = "uuid")
    private final String uuid;

    public CalendarData(boolean z11, String phoneName, boolean z12, boolean z13, String uuid, String reason, List<Calendar> calendars) {
        s.k(phoneName, "phoneName");
        s.k(uuid, "uuid");
        s.k(reason, "reason");
        s.k(calendars, "calendars");
        this.accessDisabled = z11;
        this.phoneName = phoneName;
        this.notificationDisabled = z12;
        this.backgroundDisabled = z13;
        this.uuid = uuid;
        this.reason = reason;
        this.calendars = calendars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarData copy$default(CalendarData calendarData, boolean z11, String str, boolean z12, boolean z13, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = calendarData.accessDisabled;
        }
        if ((i11 & 2) != 0) {
            str = calendarData.phoneName;
        }
        if ((i11 & 4) != 0) {
            z12 = calendarData.notificationDisabled;
        }
        if ((i11 & 8) != 0) {
            z13 = calendarData.backgroundDisabled;
        }
        if ((i11 & 16) != 0) {
            str2 = calendarData.uuid;
        }
        if ((i11 & 32) != 0) {
            str3 = calendarData.reason;
        }
        if ((i11 & 64) != 0) {
            list = calendarData.calendars;
        }
        String str4 = str3;
        List list2 = list;
        String str5 = str2;
        boolean z14 = z12;
        return calendarData.copy(z11, str, z14, z13, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAccessDisabled() {
        return this.accessDisabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNotificationDisabled() {
        return this.notificationDisabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBackgroundDisabled() {
        return this.backgroundDisabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final List<Calendar> component7() {
        return this.calendars;
    }

    public final CalendarData copy(boolean accessDisabled, String phoneName, boolean notificationDisabled, boolean backgroundDisabled, String uuid, String reason, List<Calendar> calendars) {
        s.k(phoneName, "phoneName");
        s.k(uuid, "uuid");
        s.k(reason, "reason");
        s.k(calendars, "calendars");
        return new CalendarData(accessDisabled, phoneName, notificationDisabled, backgroundDisabled, uuid, reason, calendars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarData)) {
            return false;
        }
        CalendarData calendarData = (CalendarData) other;
        return this.accessDisabled == calendarData.accessDisabled && s.f(this.phoneName, calendarData.phoneName) && this.notificationDisabled == calendarData.notificationDisabled && this.backgroundDisabled == calendarData.backgroundDisabled && s.f(this.uuid, calendarData.uuid) && s.f(this.reason, calendarData.reason) && s.f(this.calendars, calendarData.calendars);
    }

    public final boolean getAccessDisabled() {
        return this.accessDisabled;
    }

    public final boolean getBackgroundDisabled() {
        return this.backgroundDisabled;
    }

    public final List<Calendar> getCalendars() {
        return this.calendars;
    }

    public final boolean getNotificationDisabled() {
        return this.notificationDisabled;
    }

    public final String getPhoneName() {
        return this.phoneName;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.accessDisabled) * 31) + this.phoneName.hashCode()) * 31) + Boolean.hashCode(this.notificationDisabled)) * 31) + Boolean.hashCode(this.backgroundDisabled)) * 31) + this.uuid.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.calendars.hashCode();
    }

    public String toString() {
        return "CalendarData(accessDisabled=" + this.accessDisabled + ", phoneName=" + this.phoneName + ", notificationDisabled=" + this.notificationDisabled + ", backgroundDisabled=" + this.backgroundDisabled + ", uuid=" + this.uuid + ", reason=" + this.reason + ", calendars=" + this.calendars + ")";
    }
}
