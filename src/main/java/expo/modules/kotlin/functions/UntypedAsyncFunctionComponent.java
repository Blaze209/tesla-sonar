package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\n\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0005\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0015\u001a\u00020\u00122\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014R0\u0010\n\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0005\u0012\u0004\u0012\u00028\u00000\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;", "ReturnType", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function1;", "", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lwn0/l;)V", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljn0/h0;", "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "Lwn0/l;", "getBody", "()Lwn0/l;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UntypedAsyncFunctionComponent<ReturnType> extends AsyncFunctionComponent {
    private final l<Object[], ReturnType> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UntypedAsyncFunctionComponent(String name, AnyType[] desiredArgsTypes, l<? super Object[], ? extends ReturnType> body) {
        super(name, desiredArgsTypes);
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
        s.k(body, "body");
        this.body = body;
    }

    @Override // expo.modules.kotlin.functions.AsyncFunctionComponent
    public void callUserImplementation$expo_modules_core_release(Object[] args, Promise promise, AppContext appContext) {
        s.k(args, "args");
        s.k(promise, "promise");
        s.k(appContext, "appContext");
        promise.resolve(this.body.invoke(convertArgs(args, appContext)));
    }

    protected final l<Object[], ReturnType> getBody() {
        return this.body;
    }
}
