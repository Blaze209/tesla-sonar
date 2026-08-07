package com.facebook.react.reactperflogger;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.jni.HybridData;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0015\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "a", "()Lcom/facebook/jni/HybridData;", "", "moduleName", "", "id", "Ljn0/h0;", "j", "(Ljava/lang/String;I)V", "c", "e", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "h", "f", "g", "b", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "mHybridData", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NativeModulePerfLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HybridData mHybridData;

    protected NativeModulePerfLogger() {
        b();
        this.mHybridData = a();
    }

    protected abstract HybridData a();

    protected final synchronized void b() {
    }

    public abstract void c(String moduleName, int id2);

    public abstract void d(String moduleName, int id2);

    public abstract void e(String moduleName, int id2);

    public abstract void f(String moduleName, int id2);

    public abstract void g(String moduleName, int id2);

    public abstract void h(String moduleName, int id2);

    public abstract void i(String moduleName, int id2);

    public abstract void j(String moduleName, int id2);
}
