package expo.modules.kotlin.types;

import co0.q;
import com.facebook.react.bridge.Dynamic;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.DynamicExtenstionsKt;
import expo.modules.kotlin.apifeatures.EitherType;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.TypeCastException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@EitherType
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u0015\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0015\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00028\u0001¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/types/Either;", "", "FirstType", "SecondType", "bareValue", "", "Lexpo/modules/kotlin/types/DeferredValue;", "deferredValue", "", "Lco0/q;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "is$expo_modules_core_release", "(I)Z", "is", "get$expo_modules_core_release", "(I)Ljava/lang/Object;", "get", "Lco0/d;", "type", "isFirstType", "(Lco0/d;)Z", "isSecondType", "getFirstType", "(Lco0/d;)Ljava/lang/Object;", "getSecondType", "first", "()Ljava/lang/Object;", "second", "Ljava/lang/Object;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public class Either<FirstType, SecondType> {
    private final Object bareValue;
    private final List<DeferredValue> deferredValue;
    private final List<q> types;

    /* JADX WARN: Multi-variable type inference failed */
    public Either(Object bareValue, List<DeferredValue> deferredValue, List<? extends q> types) {
        s.k(bareValue, "bareValue");
        s.k(deferredValue, "deferredValue");
        s.k(types, "types");
        this.bareValue = bareValue;
        this.deferredValue = deferredValue;
        this.types = types;
    }

    public final FirstType first() {
        FirstType firsttype = (FirstType) get$expo_modules_core_release(0);
        s.i(firsttype, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return firsttype;
    }

    public final Object get$expo_modules_core_release(int index) {
        DeferredValue deferredValue = this.deferredValue.get(index);
        if (deferredValue instanceof ConvertedValue) {
            return ((ConvertedValue) deferredValue).getConvertedValue();
        }
        if (s.f(deferredValue, IncompatibleValue.INSTANCE)) {
            throw new TypeCastException("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "'");
        }
        if (!(deferredValue instanceof UnconvertedValue)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            Object convertedValue = ((UnconvertedValue) deferredValue).getConvertedValue();
            this.deferredValue.set(index, new ConvertedValue(convertedValue));
            return convertedValue;
        } catch (Throwable th2) {
            this.deferredValue.set(index, IncompatibleValue.INSTANCE);
            if (!(this.bareValue instanceof Dynamic)) {
                throw new TypeCastException("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "' - " + th2.getMessage());
            }
            Object obj = this.bareValue;
            throw new TypeCastException("Cannot cast '[" + obj + "] " + DynamicExtenstionsKt.unwrap((Dynamic) obj) + "' to '" + this.types.get(index) + "' - " + th2.getMessage());
        }
    }

    public final FirstType getFirstType(co0.d<FirstType> type) {
        s.k(type, "type");
        FirstType firsttype = (FirstType) get$expo_modules_core_release(0);
        s.i(firsttype, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return firsttype;
    }

    public final SecondType getSecondType(co0.d<SecondType> type) {
        s.k(type, "type");
        SecondType secondtype = (SecondType) get$expo_modules_core_release(1);
        s.i(secondtype, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return secondtype;
    }

    public final boolean is$expo_modules_core_release(int index) {
        DeferredValue deferredValue = this.deferredValue.get(index);
        if (deferredValue instanceof ConvertedValue) {
            return true;
        }
        if (s.f(deferredValue, IncompatibleValue.INSTANCE)) {
            return false;
        }
        if (!(deferredValue instanceof UnconvertedValue)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            this.deferredValue.set(index, new ConvertedValue(((UnconvertedValue) deferredValue).getConvertedValue()));
            return true;
        } catch (Throwable unused) {
            this.deferredValue.set(index, IncompatibleValue.INSTANCE);
            return false;
        }
    }

    public final boolean isFirstType(co0.d<FirstType> type) {
        s.k(type, "type");
        return is$expo_modules_core_release(0);
    }

    public final boolean isSecondType(co0.d<SecondType> type) {
        s.k(type, "type");
        return is$expo_modules_core_release(1);
    }

    public final SecondType second() {
        SecondType secondtype = (SecondType) get$expo_modules_core_release(1);
        s.i(secondtype, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return secondtype;
    }
}
