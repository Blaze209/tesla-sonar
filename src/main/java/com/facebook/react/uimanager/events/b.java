package com.facebook.react.uimanager.events;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/uimanager/events/b;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "()V", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "h", "(Lcom/facebook/react/uimanager/events/d;)V", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/uimanager/events/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "(Lcom/facebook/react/uimanager/events/g;)V", "c", "Lcom/facebook/react/uimanager/events/a;", "e", "(Lcom/facebook/react/uimanager/events/a;)V", IntegerTokenConverter.CONVERTER_KEY, "", "uiManagerType", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventEmitter", "a", "(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "j", "(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "f", "(I)V", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements EventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final EventDispatcher f23136b = new b();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.events.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/events/b$a;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "a", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventDispatcher a() {
            return b.f23136b;
        }

        private Companion() {
        }
    }

    private b() {
    }

    public static final EventDispatcher l() {
        return INSTANCE.a();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @jn0.e
    public void a(int uiManagerType, RCTEventEmitter eventEmitter) {
        p013kotlin.jvm.internal.s.k(eventEmitter, "eventEmitter");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(g listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(a listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(int uiManagerType) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g(g listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(d<?> event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        qk.a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(a listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(int uiManagerType, RCTModernEventEmitter eventEmitter) {
        p013kotlin.jvm.internal.s.k(eventEmitter, "eventEmitter");
    }
}
