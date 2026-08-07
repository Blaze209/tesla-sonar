package expo.modules.kotlin.jni;

import expo.modules.core.interfaces.DoNotStrip;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001c\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "shouldCreateDestructorThread", "<init>", "(Z)V", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "Ljn0/h0;", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "deallocate$expo_modules_core_release", "()Ljn0/h0;", "deallocate", "", "inspectMemory", "()Ljava/util/List;", "close", "()V", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "", "Ljava/lang/ref/PhantomReference;", "Ljava/lang/ref/WeakReference;", "destructorMap", "Ljava/util/Map;", "expo/modules/kotlin/jni/JNIDeallocator$destructorThread$1", "destructorThread", "Lexpo/modules/kotlin/jni/JNIDeallocator$destructorThread$1;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class JNIDeallocator implements AutoCloseable {
    private final Map<PhantomReference<Destructible>, WeakReference<Destructible>> destructorMap;
    private final JNIDeallocator$destructorThread$1 destructorThread;
    private final ReferenceQueue<Destructible> referenceQueue;

    public JNIDeallocator() {
        this(false, 1, null);
    }

    @DoNotStrip
    public final void addReference(Destructible destructible) {
        s.k(destructible, "destructible");
        synchronized (this) {
            WeakReference<Destructible> weakReference = new WeakReference<>(destructible);
            this.destructorMap.put(new PhantomReference<>(destructible, this.referenceQueue), weakReference);
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        deallocate$expo_modules_core_release();
    }

    public final h0 deallocate$expo_modules_core_release() {
        h0 h0Var;
        synchronized (this) {
            try {
                Iterator<T> it = this.destructorMap.values().iterator();
                while (it.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                    if (destructible != null) {
                        destructible.deallocate();
                    }
                }
                this.destructorMap.clear();
                JNIDeallocator$destructorThread$1 jNIDeallocator$destructorThread$1 = this.destructorThread;
                if (jNIDeallocator$destructorThread$1 != null) {
                    jNIDeallocator$destructorThread$1.interrupt();
                    h0Var = h0.f84049a;
                } else {
                    h0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }

    public final List<Destructible> inspectMemory() {
        ArrayList arrayList;
        synchronized (this) {
            Collection<WeakReference<Destructible>> collectionValues = this.destructorMap.values();
            arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                if (destructible != null) {
                    arrayList.add(destructible);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JNIDeallocator(boolean z11) {
        JNIDeallocator$destructorThread$1 jNIDeallocator$destructorThread$1;
        this.referenceQueue = new ReferenceQueue<>();
        this.destructorMap = new LinkedHashMap();
        if (z11) {
            Thread thread = new Thread() { // from class: expo.modules.kotlin.jni.JNIDeallocator$destructorThread$1
                {
                    super("Expo JNI deallocator");
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    while (!isInterrupted()) {
                        try {
                            Reference referenceRemove = this.this$0.referenceQueue.remove();
                            JNIDeallocator jNIDeallocator = this.this$0;
                            synchronized (jNIDeallocator) {
                                try {
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            };
            thread.start();
            jNIDeallocator$destructorThread$1 = thread;
        } else {
            jNIDeallocator$destructorThread$1 = 0;
        }
        this.destructorThread = jNIDeallocator$destructorThread$1;
    }

    public /* synthetic */ JNIDeallocator(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
