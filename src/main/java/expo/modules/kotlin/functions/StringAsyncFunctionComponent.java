package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00112\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function1;", "", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lwn0/l;)V", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljn0/h0;", "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringAsyncFunctionComponent extends UntypedAsyncFunctionComponent<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringAsyncFunctionComponent(String name, AnyType[] desiredArgsTypes, l<? super Object[], String> body) {
        super(name, desiredArgsTypes, body);
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
        s.k(body, "body");
    }

    @Override // expo.modules.kotlin.functions.UntypedAsyncFunctionComponent, expo.modules.kotlin.functions.AsyncFunctionComponent
    public void callUserImplementation$expo_modules_core_release(Object[] args, Promise promise, AppContext appContext) {
        s.k(args, "args");
        s.k(promise, "promise");
        s.k(appContext, "appContext");
        promise.resolve(getBody().invoke(convertArgs(args, appContext)));
    }
}
