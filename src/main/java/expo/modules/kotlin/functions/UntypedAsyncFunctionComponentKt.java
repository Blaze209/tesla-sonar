package expo.modules.kotlin.functions;

import expo.modules.kotlin.types.AnyType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001e\b\b\u0010\b\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"ReturnType", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function1;", "", "body", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "createAsyncFunctionComponent", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lwn0/l;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UntypedAsyncFunctionComponentKt {
    public static final /* synthetic */ <ReturnType> AsyncFunctionComponent createAsyncFunctionComponent(String name, AnyType[] desiredArgsTypes, l<? super Object[], ? extends ReturnType> body) {
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
        s.k(body, "body");
        s.q(3, "ReturnType");
        s.q(4, "ReturnType");
        if (s.f(Object.class, Integer.TYPE)) {
            return new IntAsyncFunctionComponent(name, desiredArgsTypes, body);
        }
        if (s.f(Object.class, Boolean.TYPE)) {
            return new BoolAsyncFunctionComponent(name, desiredArgsTypes, body);
        }
        if (s.f(Object.class, Double.TYPE)) {
            return new DoubleAsyncFunctionComponent(name, desiredArgsTypes, body);
        }
        if (s.f(Object.class, Float.TYPE)) {
            return new FloatAsyncFunctionComponent(name, desiredArgsTypes, body);
        }
        return s.f(Object.class, String.class) ? new StringAsyncFunctionComponent(name, desiredArgsTypes, body) : new UntypedAsyncFunctionComponent(name, desiredArgsTypes, body);
    }
}
