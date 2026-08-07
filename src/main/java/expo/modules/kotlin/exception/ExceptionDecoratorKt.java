package expo.modules.kotlin.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"T", "Lkotlin/Function1;", "Lexpo/modules/kotlin/exception/CodedException;", "", "decoratorBlock", "Lkotlin/Function0;", "block", "exceptionDecorator", "(Lwn0/l;Lwn0/a;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExceptionDecoratorKt {
    public static final <T> T exceptionDecorator(l<? super CodedException, ? extends Throwable> decoratorBlock, a<? extends T> block) throws Throwable {
        Throwable unexpectedException;
        s.k(decoratorBlock, "decoratorBlock");
        s.k(block, "block");
        try {
            return block.invoke();
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
            throw decoratorBlock.invoke(unexpectedException);
        }
    }
}
