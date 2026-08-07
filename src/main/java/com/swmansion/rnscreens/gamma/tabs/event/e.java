package com.swmansion.rnscreens.gamma.tabs.event;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/event/e;", "Lcom/facebook/react/uimanager/events/d;", "Lcom/swmansion/rnscreens/gamma/tabs/event/a;", "Lcom/swmansion/rnscreens/gamma/common/c;", "", "surfaceId", "viewId", "", e.EVENT_KEY_TAB_KEY, "<init>", "(IILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getEventRegistrationName", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "Ljava/lang/String;", "getTabKey", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.facebook.react.uimanager.events.d<a> implements com.swmansion.rnscreens.gamma.common.c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EVENT_KEY_TAB_KEY = "tabKey";
    public static final String EVENT_NAME = "topNativeFocusChange";
    public static final String EVENT_REGISTRATION_NAME = "onNativeFocusChange";
    private final String tabKey;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.event.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/event/e$a;", "Lcom/swmansion/rnscreens/gamma/common/c;", "<init>", "()V", "", "getEventName", "()Ljava/lang/String;", "getEventRegistrationName", "EVENT_NAME", "Ljava/lang/String;", "EVENT_REGISTRATION_NAME", "EVENT_KEY_TAB_KEY", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements com.swmansion.rnscreens.gamma.common.c {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.swmansion.rnscreens.gamma.common.c
        public String getEventName() {
            return e.EVENT_NAME;
        }

        @Override // com.swmansion.rnscreens.gamma.common.c
        public String getEventRegistrationName() {
            return e.EVENT_REGISTRATION_NAME;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, int i12, String tabKey) {
        super(i11, i12);
        s.k(tabKey, "tabKey");
        this.tabKey = tabKey;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(EVENT_KEY_TAB_KEY, this.tabKey);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.swmansion.rnscreens.gamma.common.c
    public String getEventRegistrationName() {
        return EVENT_REGISTRATION_NAME;
    }

    public final String getTabKey() {
        return this.tabKey;
    }
}
