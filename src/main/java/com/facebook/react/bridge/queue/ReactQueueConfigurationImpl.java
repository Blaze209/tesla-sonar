package com.facebook.react.bridge.queue;

import android.os.Looper;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "uiQueueThread", "nativeModulesQueueThread", "jsQueueThread", "<init>", "(Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;)V", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "getUIQueueThread", "()Lcom/facebook/react/bridge/queue/MessageQueueThread;", "getNativeModulesQueueThread", "getJSQueueThread", "Ljn0/h0;", "destroy", "()V", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactQueueConfigurationImpl implements ReactQueueConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MessageQueueThreadImpl jsQueueThread;
    private final MessageQueueThreadImpl nativeModulesQueueThread;
    private final MessageQueueThreadImpl uiQueueThread;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;", "spec", "Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec spec, QueueThreadExceptionHandler exceptionHandler) {
            s.k(spec, "spec");
            s.k(exceptionHandler, "exceptionHandler");
            MessageQueueThreadImpl.Companion companion = MessageQueueThreadImpl.INSTANCE;
            return new ReactQueueConfigurationImpl(companion.create(MessageQueueThreadSpec.INSTANCE.mainThreadSpec(), exceptionHandler), companion.create(spec.getNativeModulesQueueThreadSpec(), exceptionHandler), companion.create(spec.getJSQueueThreadSpec(), exceptionHandler), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageQueueThreadImpl, messageQueueThreadImpl2, messageQueueThreadImpl3);
    }

    public static final ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec reactQueueConfigurationSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return INSTANCE.create(reactQueueConfigurationSpec, queueThreadExceptionHandler);
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public void destroy() {
        if (!s.f(this.nativeModulesQueueThread.getLooper(), Looper.getMainLooper())) {
            this.nativeModulesQueueThread.quitSynchronous();
        }
        if (s.f(this.jsQueueThread.getLooper(), Looper.getMainLooper())) {
            return;
        }
        this.jsQueueThread.quitSynchronous();
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getJSQueueThread() {
        return this.jsQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getNativeModulesQueueThread() {
        return this.nativeModulesQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getUIQueueThread() {
        return this.uiQueueThread;
    }

    private ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.uiQueueThread = messageQueueThreadImpl;
        this.nativeModulesQueueThread = messageQueueThreadImpl2;
        this.jsQueueThread = messageQueueThreadImpl3;
    }
}
