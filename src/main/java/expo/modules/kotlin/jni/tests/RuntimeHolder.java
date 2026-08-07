package expo.modules.kotlin.jni.tests;

import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import expo.modules.core.interfaces.DoNotStrip;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/jni/tests/RuntimeHolder;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Ljn0/h0;", "release", "", "createRuntime", "()J", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "createCallInvoker", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "finalize", "close", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasDeallocated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class RuntimeHolder implements AutoCloseable {

    @DoNotStrip
    private final HybridData mHybridData = initHybrid();
    private AtomicBoolean wasDeallocated = new AtomicBoolean(false);

    private final native HybridData initHybrid();

    private final native void release();

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.wasDeallocated.compareAndSet(false, true)) {
            release();
            this.mHybridData.resetNative();
        }
    }

    public final native CallInvokerHolderImpl createCallInvoker();

    public final native long createRuntime();

    protected final void finalize() {
        close();
    }
}
