package expo.modules.calendar;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class CalendarModule$saveAttendeeForEvent$attendeeBuilder$1 extends p implements l<String, Integer> {
    public static final CalendarModule$saveAttendeeForEvent$attendeeBuilder$1 INSTANCE = new CalendarModule$saveAttendeeForEvent$attendeeBuilder$1();

    CalendarModule$saveAttendeeForEvent$attendeeBuilder$1() {
        super(1, JsValuesMappersKt.class, "attendeeRelationshipConstantMatchingString", "attendeeRelationshipConstantMatchingString(Ljava/lang/String;)I", 1);
    }

    @Override // wn0.l
    public final Integer invoke(String p11) {
        s.k(p11, "p0");
        return Integer.valueOf(JsValuesMappersKt.attendeeRelationshipConstantMatchingString(p11));
    }
}
