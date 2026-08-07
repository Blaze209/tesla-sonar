package expo.modules.calendar.dialogs;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/calendar/dialogs/ViewEventIntentResult;", "Lexpo/modules/kotlin/records/Record;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction$annotations", "()V", "getAction", "()Ljava/lang/String;", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ViewEventIntentResult implements Record {
    private final String action;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEventIntentResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Field
    public static /* synthetic */ void getAction$annotations() {
    }

    public final String getAction() {
        return this.action;
    }

    public ViewEventIntentResult(String action) {
        s.k(action, "action");
        this.action = action;
    }

    public /* synthetic */ ViewEventIntentResult(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "done" : str);
    }
}
