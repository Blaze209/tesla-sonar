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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006\""}, d2 = {"Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/uimanager/events/d;", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "Lz90/b;", "dataBuilder", "", "useNativeAnimatedName", "Ljn0/h0;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lz90/b;Z)V", "onDispose", "", "getEventName", "()Ljava/lang/String;", "canCoalesce", "()Z", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lz90/b;", "b", "S", "coalescingKey", "Z", "useTopPrefixedName", DateTokenConverter.CONVERTER_KEY, "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.facebook.react.uimanager.events.d<d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u5.g<d> f55408e = new u5.g<>(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z90.b<?> dataBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private short coalescingKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean useTopPrefixedName;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/swmansion/gesturehandler/react/d$a;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "Lz90/b;", "dataBuilder", "", "useTopPrefixedName", "Lcom/swmansion/gesturehandler/react/d;", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lz90/b;Z)Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lz90/b;)Lcom/facebook/react/bridge/WritableMap;", "", "EVENT_NAME", "Ljava/lang/String;", "NATIVE_ANIMATED_EVENT_NAME", "", "TOUCH_EVENTS_POOL_SIZE", "I", "Lu5/g;", "EVENTS_POOL", "Lu5/g;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d c(Companion companion, GestureHandler gestureHandler, z90.b bVar, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.b(gestureHandler, bVar, z11);
        }

        public final WritableMap a(z90.b<?> dataBuilder) {
            s.k(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            s.h(writableMapCreateMap);
            dataBuilder.a(writableMapCreateMap);
            s.j(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final <T extends GestureHandler> d b(T handler, z90.b<T> dataBuilder, boolean useTopPrefixedName) {
            s.k(handler, "handler");
            s.k(dataBuilder, "dataBuilder");
            d dVar = (d) d.f55408e.b();
            if (dVar == null) {
                dVar = new d(null);
            }
            dVar.c(handler, dataBuilder, useTopPrefixedName);
            return dVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler> void c(T handler, z90.b<T> dataBuilder, boolean useNativeAnimatedName) {
        View view = handler.getView();
        s.h(view);
        super.init(b1.f(view), view.getId());
        this.dataBuilder = dataBuilder;
        this.useTopPrefixedName = useNativeAnimatedName;
        this.coalescingKey = handler.getEventCoalescingKey();
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        Companion companion = INSTANCE;
        z90.b<?> bVar = this.dataBuilder;
        s.h(bVar);
        return companion.a(bVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.useTopPrefixedName ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.dataBuilder = null;
        f55408e.a(this);
    }

    private d() {
    }
}
