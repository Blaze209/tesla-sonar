package com.facebook.react.uimanager.events;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcher;", "", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "h", "(Lcom/facebook/react/uimanager/events/d;)V", DateTokenConverter.CONVERTER_KEY, "()V", "Lcom/facebook/react/uimanager/events/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "(Lcom/facebook/react/uimanager/events/g;)V", "c", "Lcom/facebook/react/uimanager/events/a;", "e", "(Lcom/facebook/react/uimanager/events/a;)V", IntegerTokenConverter.CONVERTER_KEY, "", "uiManagerType", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventEmitter", "a", "(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "j", "(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "f", "(I)V", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EventDispatcher {
    @jn0.e
    void a(int uiManagerType, RCTEventEmitter eventEmitter);

    void b();

    void c(g listener);

    void d();

    void e(a listener);

    void f(int uiManagerType);

    void g(g listener);

    void h(d<?> event);

    void i(a listener);

    void j(int uiManagerType, RCTModernEventEmitter eventEmitter);
}
