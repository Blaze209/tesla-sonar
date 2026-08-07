package expo.modules.kotlin.functions;

import android.view.View;
import co0.f;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH ¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function0;", "Ljn0/h0;", "block", "dispatchOnQueue", "(Lexpo/modules/kotlin/AppContext;Lwn0/a;)V", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AsyncFunctionComponent extends BaseAsyncFunctionComponent {

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$1", f = "AsyncFunctionComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(wn0.a<h0> aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.$block.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$3", f = "AsyncFunctionComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(wn0.a<h0> aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$block = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$block, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.$block.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$4", f = "AsyncFunctionComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(wn0.a<h0> aVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$block = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$block, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.$block.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionComponent(String name, AnyType[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToJSObject$lambda$4(WeakReference weakReference, final String str, final AsyncFunctionComponent asyncFunctionComponent, final AppContext appContext, final Object[] args, final PromiseImpl promiseImpl) throws Exceptions.ReactContextLost {
        s.k(args, "args");
        s.k(promiseImpl, "promiseImpl");
        asyncFunctionComponent.dispatchOnQueue(appContext, new wn0.a() { // from class: expo.modules.kotlin.functions.b
            @Override // wn0.a
            public final Object invoke() {
                return AsyncFunctionComponent.attachToJSObject$lambda$4$lambda$3(promiseImpl, asyncFunctionComponent, str, args, appContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 attachToJSObject$lambda$4$lambda$3(PromiseImpl promiseImpl, AsyncFunctionComponent asyncFunctionComponent, String str, Object[] objArr, AppContext appContext) {
        CodedException unexpectedException;
        CodedException codedException;
        CodedException unexpectedException2;
        try {
            asyncFunctionComponent.callUserImplementation$expo_modules_core_release(objArr, promiseImpl, appContext);
            h0 h0Var = h0.f84049a;
            return h0.f84049a;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof CodedException) {
                    unexpectedException2 = (CodedException) th2;
                } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                    String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                    s.j(code, "getCode(...)");
                    unexpectedException2 = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                } else {
                    unexpectedException2 = new UnexpectedException(th2);
                }
                throw new FunctionCallException(asyncFunctionComponent.getName(), str, unexpectedException2);
            } catch (Throwable th3) {
                if (promiseImpl.getWasSettled()) {
                    throw th3;
                }
                if (th3 instanceof CodedException) {
                    codedException = (CodedException) th3;
                } else {
                    if (th3 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th3;
                        String code2 = codedException2.getCode();
                        s.j(code2, "getCode(...)");
                        unexpectedException = new CodedException(code2, codedException2.getMessage(), codedException2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th3);
                    }
                    codedException = unexpectedException;
                }
                promiseImpl.reject(codedException);
            }
        }
    }

    private final void dispatchOnQueue(AppContext appContext, wn0.a<h0> block) throws Exceptions.ReactContextLost {
        FunctionQueue queue = getQueue();
        if (queue == Queues.DEFAULT) {
            BuildersKt__Builders_commonKt.launch$default(appContext.getModulesQueue(), null, null, new AnonymousClass1(block, null), 3, null);
            return;
        }
        if (queue != Queues.MAIN) {
            if (!(queue instanceof CustomQueue)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt__Builders_commonKt.launch$default(((CustomQueue) queue).getScope(), null, null, new AnonymousClass4(block, null), 3, null);
            return;
        }
        boolean z11 = false;
        for (AnyType anyType : getDesiredArgsTypes()) {
            f classifier = anyType.getKType().getClassifier();
            co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
            if (dVar == null ? false : View.class.isAssignableFrom(vn0.a.b(dVar))) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            appContext.dispatchOnMainUsingUIManager$expo_modules_core_release(block);
        } else {
            BuildersKt__Builders_commonKt.launch$default(appContext.getMainQueue(), null, null, new AnonymousClass3(block, null), 3, null);
        }
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
        jsObject.registerAsyncFunction(name, takesOwner$expo_modules_core_release, isEnumerable, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: expo.modules.kotlin.functions.a
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) throws Exceptions.ReactContextLost {
                AsyncFunctionComponent.attachToJSObject$lambda$4(weakReferenceWeak, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }

    public abstract void callUserImplementation$expo_modules_core_release(Object[] args, Promise promise, AppContext appContext);
}
