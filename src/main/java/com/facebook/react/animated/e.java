package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/animated/e;", "", "<init>", "()V", "", "frameTimeNanos", "Ljn0/h0;", "b", "(J)V", "Lcom/facebook/react/bridge/ReadableMap;", "config", "a", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", "Z", "hasFinished", "Lcom/facebook/react/animated/w;", "Lcom/facebook/react/animated/w;", "animatedValue", "Lcom/facebook/react/bridge/Callback;", "c", "Lcom/facebook/react/bridge/Callback;", "endCallback", "", DateTokenConverter.CONVERTER_KEY, "I", "id", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean hasFinished;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public w animatedValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Callback endCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int id;

    public void a(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    public abstract void b(long frameTimeNanos);
}
