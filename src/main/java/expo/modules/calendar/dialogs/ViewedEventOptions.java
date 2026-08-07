package expo.modules.calendar.dialogs;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.io.Serializable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/calendar/dialogs/ViewedEventOptions;", "Lexpo/modules/kotlin/records/Record;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/String;", "startNewActivityTask", "", "getStartNewActivityTask$annotations", "getStartNewActivityTask", "()Z", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewedEventOptions implements Record, Serializable {
    private final String id = "";
    private final boolean startNewActivityTask = true;

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    @Field
    public static /* synthetic */ void getStartNewActivityTask$annotations() {
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getStartNewActivityTask() {
        return this.startNewActivityTask;
    }
}
