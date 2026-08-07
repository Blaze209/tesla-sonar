package expo.modules.kotlin.functions;

import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00124\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015RB\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lkotlin/coroutines/Continuation;", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lwn0/q;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "Ljn0/h0;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "Lwn0/q;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendFunctionComponent extends BaseAsyncFunctionComponent {
    private final q<CoroutineScope, Object[], Continuation<Object>, Object> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionComponent(String name, AnyType[] desiredArgsTypes, q<? super CoroutineScope, ? super Object[], ? super Continuation<Object>, ? extends Object> body) {
        super(name, desiredArgsTypes);
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
        s.k(body, "body");
        this.body = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToJSObject$lambda$1(WeakReference weakReference, String str, SuspendFunctionComponent suspendFunctionComponent, AppContext appContext, Object[] args, PromiseImpl promiseImpl) {
        CoroutineScope scope;
        s.k(args, "args");
        s.k(promiseImpl, "promiseImpl");
        FunctionQueue queue = suspendFunctionComponent.getQueue();
        if (queue == Queues.MAIN) {
            scope = appContext.getMainQueue();
        } else if (queue == Queues.DEFAULT) {
            scope = appContext.getModulesQueue();
        } else {
            if (!(queue instanceof CustomQueue)) {
                throw new NoWhenBranchMatchedException();
            }
            scope = ((CustomQueue) queue).getScope();
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new SuspendFunctionComponent$attachToJSObject$2$1(promiseImpl, suspendFunctionComponent, str, args, appContext, null), 3, null);
    }

    @Override // expo.modules.kotlin.functions.AnyFunction
    public void attachToJSObject(final AppContext appContext, JSDecoratorsBridgingObject jsObject, final String moduleName) {
        s.k(appContext, "appContext");
        s.k(jsObject, "jsObject");
        s.k(moduleName, "moduleName");
        final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
        String name = getName();
        boolean takesOwner$expo_modules_core_release = getTakesOwner$expo_modules_core_release();
        boolean isEnumerable = getIsEnumerable();
        AnyType[] desiredArgsTypes = getDesiredArgsTypes();
        ArrayList arrayList = new ArrayList(desiredArgsTypes.length);
        for (AnyType anyType : desiredArgsTypes) {
            arrayList.add(anyType.getCppRequiredTypes());
        }
        jsObject.registerAsyncFunction(name, takesOwner$expo_modules_core_release, isEnumerable, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: expo.modules.kotlin.functions.c
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                SuspendFunctionComponent.attachToJSObject$lambda$1(weakReferenceWeak, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }
}
