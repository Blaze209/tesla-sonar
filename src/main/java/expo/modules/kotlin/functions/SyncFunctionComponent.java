package expo.modules.kotlin.functions;

import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.ReturnType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR,\u0010\u000b\u001a\u001a\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AnyFunction;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "argTypes", "Lexpo/modules/kotlin/types/ReturnType;", "returnType", "Lkotlin/Function1;", "", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lwn0/l;)V", "args", "Lexpo/modules/kotlin/AppContext;", "appContext", "callUserImplementation", "([Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "moduleName", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "getJNIFunctionBody$expo_modules_core_release", "(Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/jni/JNIFunctionBody;", "getJNIFunctionBody", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "Ljn0/h0;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "Lexpo/modules/kotlin/types/ReturnType;", "Lwn0/l;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncFunctionComponent extends AnyFunction {
    private final l<Object[], Object> body;
    private final ReturnType returnType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SyncFunctionComponent(String name, AnyType[] argTypes, ReturnType returnType, l<? super Object[], ? extends Object> body) {
        super(name, argTypes);
        s.k(name, "name");
        s.k(argTypes, "argTypes");
        s.k(returnType, "returnType");
        s.k(body, "body");
        this.returnType = returnType;
        this.body = body;
    }

    public static /* synthetic */ Object callUserImplementation$default(SyncFunctionComponent syncFunctionComponent, Object[] objArr, AppContext appContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            appContext = null;
        }
        return syncFunctionComponent.callUserImplementation(objArr, appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJNIFunctionBody$lambda$2(SyncFunctionComponent syncFunctionComponent, String str, AppContext appContext, Object[] args) throws FunctionCallException {
        CodedException unexpectedException;
        s.k(args, "args");
        try {
            return syncFunctionComponent.returnType.convertToJS(syncFunctionComponent.callUserImplementation(args, appContext));
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                String code = codedException.getCode();
                s.j(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new FunctionCallException(syncFunctionComponent.getName(), str, unexpectedException);
        }
    }

    @Override // expo.modules.kotlin.functions.AnyFunction
    public void attachToJSObject(AppContext appContext, JSDecoratorsBridgingObject jsObject, String moduleName) {
        s.k(appContext, "appContext");
        s.k(jsObject, "jsObject");
        s.k(moduleName, "moduleName");
        jsObject.registerSyncFunction(getName(), getTakesOwner$expo_modules_core_release(), getIsEnumerable(), (ExpectedType[]) getCppRequiredTypes$expo_modules_core_release().toArray(new ExpectedType[0]), getJNIFunctionBody$expo_modules_core_release(moduleName, appContext));
    }

    public final Object callUserImplementation(Object[] args, AppContext appContext) {
        s.k(args, "args");
        return this.body.invoke(convertArgs(args, appContext));
    }

    public final JNIFunctionBody getJNIFunctionBody$expo_modules_core_release(final String moduleName, final AppContext appContext) {
        s.k(moduleName, "moduleName");
        return new JNIFunctionBody() { // from class: expo.modules.kotlin.functions.d
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return SyncFunctionComponent.getJNIFunctionBody$lambda$2(this.f63367a, moduleName, appContext, objArr);
            }
        };
    }
}
