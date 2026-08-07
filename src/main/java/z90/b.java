package z90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lz90/b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "Ljn0/h0;", "a", "(Lcom/facebook/react/bridge/WritableMap;)V", "", "I", "numberOfPointers", "b", "handlerTag", "c", "state", DateTokenConverter.CONVERTER_KEY, "pointerType", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T extends GestureHandler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int numberOfPointers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int handlerTag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int pointerType;

    public b(T handler) {
        s.k(handler, "handler");
        this.numberOfPointers = handler.getNumberOfPointers();
        this.handlerTag = handler.getTag();
        this.state = handler.getState();
        this.pointerType = handler.getPointerType();
    }

    public void a(WritableMap eventData) {
        s.k(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.numberOfPointers);
        eventData.putInt("handlerTag", this.handlerTag);
        eventData.putInt("state", this.state);
        eventData.putInt("pointerType", this.pointerType);
    }
}
