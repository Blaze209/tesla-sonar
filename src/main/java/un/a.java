package un;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lun/a;", "Lcom/facebook/react/uimanager/events/d;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", "surfaceId", "viewTag", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)V", "getEventName", "()Ljava/lang/String;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Ljava/lang/String;", "b", "Lcom/facebook/react/bridge/WritableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WritableMap eventData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String eventName, WritableMap writableMap, int i11, int i12) {
        super(i11, i12);
        s.k(eventName, "eventName");
        this.eventName = eventName;
        this.eventData = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.eventData;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.eventName;
    }
}
