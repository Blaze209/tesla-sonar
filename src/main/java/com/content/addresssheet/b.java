package com.content.addresssheet;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0014\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/b;", "Lcom/facebook/react/uimanager/events/d;", "", "viewTag", "Lcom/reactnativestripesdk/addresssheet/b$b;", "eventType", "Lcom/facebook/react/bridge/WritableMap;", "eventMap", "<init>", "(ILcom/reactnativestripesdk/addresssheet/b$b;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Ljn0/h0;", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "", "getEventName", "()Ljava/lang/String;", "a", "Lcom/reactnativestripesdk/addresssheet/b$b;", "b", "Lcom/facebook/react/bridge/WritableMap;", "c", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC0772b eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WritableMap eventMap;

    /* JADX INFO: renamed from: com.reactnativestripesdk.addresssheet.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "OnSubmit", "OnError", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC0772b {
        OnSubmit,
        OnError;

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

        public static EnumEntries<EnumC0772b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48742a;

        static {
            int[] iArr = new int[EnumC0772b.values().length];
            try {
                iArr[EnumC0772b.OnSubmit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0772b.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48742a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, EnumC0772b eventType, WritableMap writableMap) {
        super(i11);
        s.k(eventType, "eventType");
        this.eventType = eventType;
        this.eventMap = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.k(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), this.eventMap);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        int i11 = c.f48742a[this.eventType.ordinal()];
        if (i11 == 1) {
            return "onSubmitAction";
        }
        if (i11 == 2) {
            return "onErrorAction";
        }
        throw new NoWhenBranchMatchedException();
    }
}
