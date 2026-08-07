package expo.modules.kotlin.functions;

import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.kotlin.functions.SuspendFunctionComponent$attachToJSObject$2$1", f = "SuspendFunctionComponent.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
final class SuspendFunctionComponent$attachToJSObject$2$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ AppContext $appContext;
    final /* synthetic */ Object[] $args;
    final /* synthetic */ String $moduleName;
    final /* synthetic */ PromiseImpl $promiseImpl;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SuspendFunctionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendFunctionComponent$attachToJSObject$2$1(PromiseImpl promiseImpl, SuspendFunctionComponent suspendFunctionComponent, String str, Object[] objArr, AppContext appContext, Continuation<? super SuspendFunctionComponent$attachToJSObject$2$1> continuation) {
        super(2, continuation);
        this.$promiseImpl = promiseImpl;
        this.this$0 = suspendFunctionComponent;
        this.$moduleName = str;
        this.$args = objArr;
        this.$appContext = appContext;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        SuspendFunctionComponent$attachToJSObject$2$1 suspendFunctionComponent$attachToJSObject$2$1 = new SuspendFunctionComponent$attachToJSObject$2$1(this.$promiseImpl, this.this$0, this.$moduleName, this.$args, this.$appContext, continuation);
        suspendFunctionComponent$attachToJSObject$2$1.L$0 = obj;
        return suspendFunctionComponent$attachToJSObject$2$1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x006a, B:27:0x006f, B:29:0x0073, B:34:0x009b, B:35:0x00a4, B:32:0x0092, B:33:0x0098, B:13:0x0033), top: B:50:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x006a, B:27:0x006f, B:29:0x0073, B:34:0x009b, B:35:0x00a4, B:32:0x0092, B:33:0x0098, B:13:0x0033), top: B:50:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x006a, B:27:0x006f, B:29:0x0073, B:34:0x009b, B:35:0x00a4, B:32:0x0092, B:33:0x0098, B:13:0x0033), top: B:50:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x006a, B:27:0x006f, B:29:0x0073, B:34:0x009b, B:35:0x00a4, B:32:0x0092, B:33:0x0098, B:13:0x0033), top: B:50:0x0009 }] */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CodedException unexpectedException;
        CodedException codedException;
        CoroutineScope coroutineScope;
        String str;
        SuspendFunctionComponent suspendFunctionComponent;
        expo.modules.core.errors.CodedException th2;
        PromiseImpl promiseImpl;
        CodedException unexpectedException2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                t.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                SuspendFunctionComponent suspendFunctionComponent2 = this.this$0;
                str = this.$moduleName;
                Object[] objArr = this.$args;
                AppContext appContext = this.$appContext;
                PromiseImpl promiseImpl2 = this.$promiseImpl;
                try {
                    q qVar = suspendFunctionComponent2.body;
                    Object[] objArrConvertArgs = suspendFunctionComponent2.convertArgs(objArr, appContext);
                    this.L$0 = coroutineScope;
                    this.L$1 = suspendFunctionComponent2;
                    this.L$2 = str;
                    this.L$3 = promiseImpl2;
                    this.label = 1;
                    Object objInvoke = qVar.invoke(coroutineScope, objArrConvertArgs, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    suspendFunctionComponent = suspendFunctionComponent2;
                    obj = objInvoke;
                    promiseImpl = promiseImpl2;
                } catch (Throwable th3) {
                    suspendFunctionComponent = suspendFunctionComponent2;
                    th2 = th3;
                    if (!(th2 instanceof CodedException)) {
                        unexpectedException2 = (CodedException) th2;
                    } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                        String code = th2.getCode();
                        s.j(code, "getCode(...)");
                        unexpectedException2 = new CodedException(code, th2.getMessage(), th2.getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th2);
                    }
                    throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                promiseImpl = (PromiseImpl) this.L$3;
                str = (String) this.L$2;
                suspendFunctionComponent = (SuspendFunctionComponent) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    t.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    if (!(th2 instanceof CodedException)) {
                        unexpectedException2 = (CodedException) th2;
                    } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                        String code2 = th2.getCode();
                        s.j(code2, "getCode(...)");
                        unexpectedException2 = new CodedException(code2, th2.getMessage(), th2.getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th2);
                    }
                    throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
                }
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                promiseImpl.resolve(obj);
            }
            h0 h0Var = h0.f84049a;
        } catch (Throwable th5) {
            if (this.$promiseImpl.getWasSettled()) {
                throw th5;
            }
            PromiseImpl promiseImpl3 = this.$promiseImpl;
            if (th5 instanceof CodedException) {
                codedException = (CodedException) th5;
            } else {
                if (th5 instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th5;
                    String code3 = codedException2.getCode();
                    s.j(code3, "getCode(...)");
                    unexpectedException = new CodedException(code3, codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th5);
                }
                codedException = unexpectedException;
            }
            promiseImpl3.reject(codedException);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((SuspendFunctionComponent$attachToJSObject$2$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
