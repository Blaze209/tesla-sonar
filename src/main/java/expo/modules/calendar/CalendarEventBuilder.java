package expo.modules.calendar;

import android.content.ContentValues;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.arguments.ReadableArguments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\tJ!\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0016\"\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u000fJ1\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\u0004\b\u001c\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u000fJ%\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u000fJ9\u0010%\u001a\u00020\u0000\"\u0004\b\u0000\u0010#2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b%\u0010\u001fJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lexpo/modules/calendar/CalendarEventBuilder;", "", "Lexpo/modules/core/arguments/ReadableArguments;", "eventDetails", "<init>", "(Lexpo/modules/core/arguments/ReadableArguments;)V", "", Action.KEY_ATTRIBUTE, "checkDetailsContainsRequiredKey", "(Ljava/lang/String;)Lexpo/modules/calendar/CalendarEventBuilder;", "", "getAsLong", "(Ljava/lang/String;)J", "value", "put", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/calendar/CalendarEventBuilder;", "", "(Ljava/lang/String;I)Lexpo/modules/calendar/CalendarEventBuilder;", "(Ljava/lang/String;J)Lexpo/modules/calendar/CalendarEventBuilder;", "", "(Ljava/lang/String;Z)Lexpo/modules/calendar/CalendarEventBuilder;", "putNull", "", "keys", "checkIfContainsRequiredKeys", "([Ljava/lang/String;)Lexpo/modules/calendar/CalendarEventBuilder;", "eventKey", "detailsKey", "putEventString", "Lkotlin/Function1;", "mapper", "(Ljava/lang/String;Ljava/lang/String;Lwn0/l;)Lexpo/modules/calendar/CalendarEventBuilder;", "putEventBoolean", "(Ljava/lang/String;Ljava/lang/String;Z)Lexpo/modules/calendar/CalendarEventBuilder;", "putEventTimeZone", "OutputListItemType", "mappingMethod", "putEventDetailsList", "Landroid/content/ContentValues;", "build", "()Landroid/content/ContentValues;", "Lexpo/modules/core/arguments/ReadableArguments;", "eventValues", "Landroid/content/ContentValues;", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarEventBuilder {
    private final ReadableArguments eventDetails;
    private final ContentValues eventValues;

    public CalendarEventBuilder(ReadableArguments eventDetails) {
        s.k(eventDetails, "eventDetails");
        this.eventDetails = eventDetails;
        this.eventValues = new ContentValues();
    }

    private final CalendarEventBuilder checkDetailsContainsRequiredKey(String key) throws Exception {
        if (this.eventDetails.containsKey(key)) {
            return this;
        }
        throw new Exception("new calendars require " + key);
    }

    /* JADX INFO: renamed from: build, reason: from getter */
    public final ContentValues getEventValues() {
        return this.eventValues;
    }

    public final CalendarEventBuilder checkIfContainsRequiredKeys(String... keys) throws Exception {
        s.k(keys, "keys");
        for (String str : keys) {
            checkDetailsContainsRequiredKey(str);
        }
        return this;
    }

    public final long getAsLong(String key) {
        s.k(key, "key");
        Long asLong = this.eventValues.getAsLong(key);
        s.j(asLong, "getAsLong(...)");
        return asLong.longValue();
    }

    public final CalendarEventBuilder put(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        this.eventValues.put(key, value);
        return this;
    }

    public final CalendarEventBuilder putEventBoolean(String eventKey, String detailsKey) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, Integer.valueOf(this.eventDetails.getBoolean(detailsKey) ? 1 : 0));
        }
        return this;
    }

    public final <OutputListItemType> CalendarEventBuilder putEventDetailsList(String eventKey, String detailsKey, l<Object, ? extends OutputListItemType> mappingMethod) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        s.k(mappingMethod, "mappingMethod");
        if (this.eventDetails.containsKey(eventKey)) {
            List list = this.eventDetails.getList(eventKey);
            s.h(list);
            List list2 = list;
            ArrayList arrayList = new ArrayList(v.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(mappingMethod.invoke(it.next()));
            }
            this.eventValues.put(detailsKey, TextUtils.join(",", arrayList));
        }
        return this;
    }

    public final CalendarEventBuilder putEventString(String eventKey, String detailsKey) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, this.eventDetails.getString(detailsKey));
        }
        return this;
    }

    public final CalendarEventBuilder putEventTimeZone(String eventKey, String detailsKey) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        this.eventValues.put(eventKey, this.eventDetails.containsKey(detailsKey) ? this.eventDetails.getString(detailsKey) : TimeZone.getDefault().getID());
        return this;
    }

    public final CalendarEventBuilder putNull(String key) {
        s.k(key, "key");
        this.eventValues.putNull(key);
        return this;
    }

    public final CalendarEventBuilder put(String key, int value) {
        s.k(key, "key");
        this.eventValues.put(key, Integer.valueOf(value));
        return this;
    }

    public final CalendarEventBuilder put(String key, long value) {
        s.k(key, "key");
        this.eventValues.put(key, Long.valueOf(value));
        return this;
    }

    public final CalendarEventBuilder putEventBoolean(String eventKey, String detailsKey, boolean value) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, Boolean.valueOf(value));
        }
        return this;
    }

    public final CalendarEventBuilder putEventString(String eventKey, String detailsKey, l<? super String, Integer> mapper) {
        s.k(eventKey, "eventKey");
        s.k(detailsKey, "detailsKey");
        s.k(mapper, "mapper");
        if (this.eventDetails.containsKey(detailsKey)) {
            ContentValues contentValues = this.eventValues;
            String string = this.eventDetails.getString(detailsKey);
            s.j(string, "getString(...)");
            contentValues.put(eventKey, mapper.invoke(string));
        }
        return this;
    }

    public final CalendarEventBuilder put(String key, boolean value) {
        s.k(key, "key");
        this.eventValues.put(key, Boolean.valueOf(value));
        return this;
    }
}
