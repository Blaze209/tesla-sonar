package com.swmansion.gesturehandler.react;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001f¨\u0006!"}, d2 = {"Lcom/swmansion/gesturehandler/react/n;", "Lcom/facebook/react/uimanager/events/d;", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "", "newState", "oldState", "Lz90/b;", "dataBuilder", "Ljn0/h0;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;IILz90/b;)V", "onDispose", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lz90/b;", "b", "I", DateTokenConverter.CONVERTER_KEY, "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends com.facebook.react.uimanager.events.d<n> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u5.g<n> f55437e = new u5.g<>(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z90.b<?> dataBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int newState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int oldState;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/swmansion/gesturehandler/react/n$a;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "", "newState", "oldState", "Lz90/b;", "dataBuilder", "Lcom/swmansion/gesturehandler/react/n;", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;IILz90/b;)Lcom/swmansion/gesturehandler/react/n;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lz90/b;II)Lcom/facebook/react/bridge/WritableMap;", "", "EVENT_NAME", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "Lu5/g;", "EVENTS_POOL", "Lu5/g;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(z90.b<?> dataBuilder, int newState, int oldState) {
            s.k(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            s.h(writableMapCreateMap);
            dataBuilder.a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", newState);
            writableMapCreateMap.putInt("oldState", oldState);
            s.j(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final <T extends GestureHandler> n b(T handler, int newState, int oldState, z90.b<T> dataBuilder) {
            s.k(handler, "handler");
            s.k(dataBuilder, "dataBuilder");
            n nVar = (n) n.f55437e.b();
            if (nVar == null) {
                nVar = new n(null);
            }
            nVar.c(handler, newState, oldState, dataBuilder);
            return nVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler> void c(T handler, int newState, int oldState, z90.b<T> dataBuilder) {
        View view = handler.getView();
        s.h(view);
        super.init(b1.f(view), view.getId());
        this.dataBuilder = dataBuilder;
        this.newState = newState;
        this.oldState = oldState;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        Companion companion = INSTANCE;
        z90.b<?> bVar = this.dataBuilder;
        s.h(bVar);
        return companion.a(bVar, this.newState, this.oldState);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.dataBuilder = null;
        this.newState = 0;
        this.oldState = 0;
        f55437e.a(this);
    }

    private n() {
    }
}
