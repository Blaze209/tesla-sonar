package expo.modules.kotlin.sharedobjects;

import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.InvalidSharedObjectIdException;
import expo.modules.kotlin.exception.UsingReleasedSharedObjectException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\u0019\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R>\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0.j\u0002`/0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "<init>", "(Lexpo/modules/kotlin/RuntimeContext;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "pullNextId-HSeVr_g", "()I", "pullNextId", "ensureWasNotRelease-tuC-2VU", "(I)I", "ensureWasNotRelease", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "native", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "js", "add-5WKnsLU$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;Lexpo/modules/kotlin/jni/JavaScriptObject;)I", "add", "id", "Ljn0/h0;", "delete-kyJHjyY$expo_modules_core_release", "(I)V", "delete", "toNativeObject-kyJHjyY$expo_modules_core_release", "(I)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toNativeObject", "toNativeObjectOrNull-kyJHjyY$expo_modules_core_release", "toNativeObjectOrNull", "toNativeObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/jni/JavaScriptObject;)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toJavaScriptObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObjectOrNull", "nativeObject", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectOrNull", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "currentId", "I", "", "Lkotlin/Pair;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectPair;", "pairs", "Ljava/util/Map;", "getPairs$expo_modules_core_release", "()Ljava/util/Map;", "setPairs$expo_modules_core_release", "(Ljava/util/Map;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedObjectRegistry {
    private int currentId;
    private Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> pairs;
    private final WeakReference<RuntimeContext> runtimeContextHolder;

    public SharedObjectRegistry(RuntimeContext runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        this.runtimeContextHolder = UtilsKt.weak(runtimeContext);
        this.currentId = SharedObjectId.m166constructorimpl(1);
        this.pairs = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ensureWasNotRelease-tuC-2VU, reason: not valid java name */
    private final int m176ensureWasNotReleasetuC2VU(int i11) throws UsingReleasedSharedObjectException {
        if (this.pairs.containsKey(SharedObjectId.m165boximpl(i11)) || i11 == 0 || i11 >= this.currentId) {
            return i11;
        }
        throw new UsingReleasedSharedObjectException();
    }

    /* JADX INFO: renamed from: pullNextId-HSeVr_g, reason: not valid java name */
    private final int m177pullNextIdHSeVr_g() {
        int i11;
        synchronized (this) {
            i11 = this.currentId;
            this.currentId = SharedObjectId.m166constructorimpl(i11 + 1);
        }
        return i11;
    }

    /* JADX INFO: renamed from: add-5WKnsLU$expo_modules_core_release, reason: not valid java name */
    public final int m178add5WKnsLU$expo_modules_core_release(SharedObject sharedObject, JavaScriptObject js2) throws Exceptions.AppContextLost {
        s.k(sharedObject, "native");
        s.k(js2, "js");
        int iM177pullNextIdHSeVr_g = m177pullNextIdHSeVr_g();
        sharedObject.m164setSharedObjectIdkyJHjyY$expo_modules_core_release(iM177pullNextIdHSeVr_g);
        JavaScriptObject.defineProperty$default(js2, SharedObjectRegistryKt.sharedObjectIdPropertyName, iM177pullNextIdHSeVr_g, (List) null, 4, (Object) null);
        RuntimeContext runtimeContext = this.runtimeContextHolder.get();
        if (runtimeContext == null) {
            throw new Exceptions.AppContextLost();
        }
        runtimeContext.getJsiContext$expo_modules_core_release().setNativeStateForSharedObject(iM177pullNextIdHSeVr_g, js2);
        int additionalMemoryPressure = sharedObject.getAdditionalMemoryPressure();
        if (additionalMemoryPressure > 0) {
            js2.setExternalMemoryPressure(additionalMemoryPressure);
        }
        if (sharedObject instanceof SharedRef) {
            JavaScriptObject.defineProperty$default(js2, "nativeRefType", ((SharedRef) sharedObject).getNativeRefType(), (List) null, 4, (Object) null);
        }
        JavaScriptWeakObject javaScriptWeakObjectCreateWeak = js2.createWeak();
        synchronized (this) {
            this.pairs.put(SharedObjectId.m165boximpl(iM177pullNextIdHSeVr_g), x.a(sharedObject, javaScriptWeakObjectCreateWeak));
            h0 h0Var = h0.f84049a;
        }
        if (sharedObject.getRuntimeContextHolder().get() == null) {
            sharedObject.setRuntimeContextHolder(UtilsKt.weak(runtimeContext));
        }
        return iM177pullNextIdHSeVr_g;
    }

    /* JADX INFO: renamed from: delete-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final void m179deletekyJHjyY$expo_modules_core_release(int id2) {
        Pair<SharedObject, JavaScriptWeakObject> pairRemove;
        synchronized (this) {
            pairRemove = this.pairs.remove(SharedObjectId.m165boximpl(id2));
        }
        if (pairRemove != null) {
            SharedObject sharedObjectA = pairRemove.a();
            sharedObjectA.m164setSharedObjectIdkyJHjyY$expo_modules_core_release(SharedObjectId.m166constructorimpl(0));
            sharedObjectA.sharedObjectDidRelease();
        }
    }

    public final Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> getPairs$expo_modules_core_release() {
        return this.pairs;
    }

    public final void setPairs$expo_modules_core_release(Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> map) {
        s.k(map, "<set-?>");
        this.pairs = map;
    }

    public final JavaScriptObject toJavaScriptObjectOrNull$expo_modules_core_release(SharedObject sharedObject) {
        JavaScriptObject javaScriptObjectLock;
        JavaScriptWeakObject javaScriptWeakObjectF;
        s.k(sharedObject, "native");
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m165boximpl(sharedObject.m163getSharedObjectIdHSeVr_g$expo_modules_core_release()));
            javaScriptObjectLock = (pair == null || (javaScriptWeakObjectF = pair.f()) == null) ? null : javaScriptWeakObjectF.lock();
        }
        return javaScriptObjectLock;
    }

    /* JADX INFO: renamed from: toNativeObject-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final SharedObject m180toNativeObjectkyJHjyY$expo_modules_core_release(int id2) throws InvalidSharedObjectIdException {
        Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m165boximpl(m176ensureWasNotReleasetuC2VU(id2)));
        SharedObject sharedObjectE = pair != null ? pair.e() : null;
        if (sharedObjectE != null) {
            return sharedObjectE;
        }
        throw new InvalidSharedObjectIdException();
    }

    public final SharedObject toNativeObjectOrNull$expo_modules_core_release(JavaScriptObject js2) {
        s.k(js2, "js");
        if (!js2.hasProperty(SharedObjectRegistryKt.sharedObjectIdPropertyName)) {
            return null;
        }
        Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m165boximpl(SharedObjectId.m166constructorimpl(js2.getProperty(SharedObjectRegistryKt.sharedObjectIdPropertyName).getInt())));
        if (pair != null) {
            return pair.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: toNativeObjectOrNull-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final SharedObject m181toNativeObjectOrNullkyJHjyY$expo_modules_core_release(int id2) {
        SharedObject sharedObjectE;
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m165boximpl(id2));
            sharedObjectE = pair != null ? pair.e() : null;
        }
        return sharedObjectE;
    }

    public final JavaScriptWeakObject toWeakJavaScriptObjectOrNull$expo_modules_core_release(SharedObject nativeObject) {
        JavaScriptWeakObject javaScriptWeakObjectF;
        s.k(nativeObject, "nativeObject");
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m165boximpl(nativeObject.m163getSharedObjectIdHSeVr_g$expo_modules_core_release()));
            javaScriptWeakObjectF = pair != null ? pair.f() : null;
        }
        return javaScriptWeakObjectF;
    }
}
