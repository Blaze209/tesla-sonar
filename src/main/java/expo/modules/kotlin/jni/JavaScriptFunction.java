package expo.modules.kotlin.jni;

import co0.q;
import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.types.JSTypeConverter;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProviderImpl;
import java.util.ArrayList;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u0011\b\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u000e\u001a\u00028\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR*\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", "", "ReturnType", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "thisValue", "", "args", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedReturnType", "invoke", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", "", "isValid", "()Z", "Lexpo/modules/kotlin/AppContext;", "appContext", "([Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "Ljn0/h0;", "finalize", "()V", "deallocate", "Lcom/facebook/jni/HybridData;", "Lco0/q;", "returnType", "Lco0/q;", "getReturnType", "()Lco0/q;", "setReturnType", "(Lco0/q;)V", "getReturnType$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptFunction<ReturnType> implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;
    private q returnType;

    @DoNotStrip
    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static /* synthetic */ void getReturnType$annotations() {
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    public static /* synthetic */ Object invoke$default(JavaScriptFunction javaScriptFunction, Object[] objArr, JavaScriptObject javaScriptObject, AppContext appContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaScriptObject = null;
        }
        if ((i11 & 4) != 0) {
            appContext = null;
        }
        return javaScriptFunction.invoke(objArr, javaScriptObject, appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q invoke$lambda$1() {
        return o0.o(h0.class);
    }

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    protected final void finalize() {
        deallocate();
    }

    public final q getReturnType() {
        return this.returnType;
    }

    public final ReturnType invoke(Object[] args, JavaScriptObject thisValue, AppContext appContext) {
        s.k(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            arrayList.add(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, obj, null, false, 6, null));
        }
        Object[] array = arrayList.toArray(new Object[0]);
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        q lazyKType = this.returnType;
        if (lazyKType == null) {
            lazyKType = new LazyKType(o0.b(h0.class), false, new wn0.a() { // from class: expo.modules.kotlin.jni.a
                @Override // wn0.a
                public final Object invoke() {
                    return JavaScriptFunction.invoke$lambda$1();
                }
            });
        }
        TypeConverter<?> typeConverterObtainTypeConverter = typeConverterProviderImpl.obtainTypeConverter(lazyKType);
        return (ReturnType) typeConverterObtainTypeConverter.convert(invoke(thisValue, array, typeConverterObtainTypeConverter.getCppRequiredTypes()), appContext);
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final void setReturnType(q qVar) {
        this.returnType = qVar;
    }
}
