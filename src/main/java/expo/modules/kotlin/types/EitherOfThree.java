package expo.modules.kotlin.types;

import co0.q;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.apifeatures.EitherType;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@EitherType
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B+\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00028\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfThree;", "", "FirstType", "SecondType", "ThirdType", "Lexpo/modules/kotlin/types/Either;", "bareValue", "", "Lexpo/modules/kotlin/types/DeferredValue;", "deferredValue", "", "Lco0/q;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "Lco0/d;", "type", "", "isThirdType", "(Lco0/d;)Z", "is", "getThirdType", "(Lco0/d;)Ljava/lang/Object;", "get", "third", "()Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public class EitherOfThree<FirstType, SecondType, ThirdType> extends Either<FirstType, SecondType> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherOfThree(Object bareValue, List<DeferredValue> deferredValue, List<? extends q> types) {
        super(bareValue, deferredValue, types);
        s.k(bareValue, "bareValue");
        s.k(deferredValue, "deferredValue");
        s.k(types, "types");
    }

    public final ThirdType getThirdType(co0.d<ThirdType> type) {
        s.k(type, "type");
        ThirdType thirdtype = (ThirdType) get$expo_modules_core_release(2);
        s.i(thirdtype, "null cannot be cast to non-null type ThirdType of expo.modules.kotlin.types.EitherOfThree");
        return thirdtype;
    }

    public final boolean isThirdType(co0.d<ThirdType> type) {
        s.k(type, "type");
        return is$expo_modules_core_release(2);
    }

    public final ThirdType third() {
        ThirdType thirdtype = (ThirdType) get$expo_modules_core_release(2);
        s.i(thirdtype, "null cannot be cast to non-null type ThirdType of expo.modules.kotlin.types.EitherOfThree");
        return thirdtype;
    }
}
