package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\"\u0010\u000b\u001a\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u000b\u001a\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function2;", "", "Lexpo/modules/kotlin/Promise;", "Ljn0/h0;", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lwn0/p;)V", "args", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/AppContext;", "appContext", "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "Lwn0/p;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AsyncFunctionWithPromiseComponent extends AsyncFunctionComponent {
    private final p<Object[], Promise, h0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFunctionWithPromiseComponent(String name, AnyType[] desiredArgsTypes, p<? super Object[], ? super Promise, h0> body) {
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
        this.body.invoke(convertArgs(args, appContext), promise);
    }
}
