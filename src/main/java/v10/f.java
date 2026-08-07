package v10;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lv10/f;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "", "codeStringValue", "codeFormat", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Ljava/lang/String;", "b", "c", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.facebook.react.uimanager.events.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String codeStringValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String codeFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, int i12, String str, String codeFormat) {
        super(i11, i12);
        s.k(codeFormat, "codeFormat");
        this.codeStringValue = str;
        this.codeFormat = codeFormat;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("codeFormat", this.codeFormat);
        writableMapCreateMap.putString("codeStringValue", this.codeStringValue);
        s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topReadCode";
    }
}
