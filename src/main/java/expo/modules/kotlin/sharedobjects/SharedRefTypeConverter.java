package expo.modules.kotlin.sharedobjects;

import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.f;
import co0.q;
import do0.c;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.IncorrectRefTypeException;
import expo.modules.kotlin.exception.InvalidSharedObjectTypeException;
import expo.modules.kotlin.exception.NullArgumentException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.sharedobjects.SharedRefTypeConverter;
import expo.modules.kotlin.types.NullAwareTypeConverter;
import java.util.List;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRefTypeConverter;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "T", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lco0/q;", "type", "<init>", "(Lco0/q;)V", "sharedRef", "checkInnerRef", "(Lexpo/modules/kotlin/sharedobjects/SharedRef;)Lexpo/modules/kotlin/sharedobjects/SharedRef;", "", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "getType", "()Lco0/q;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;", "sharedObjectTypeConverter", "Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;", "sharedRefType$delegate", "Lkotlin/Lazy;", "getSharedRefType", "sharedRefType", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedRefTypeConverter<T extends SharedRef<?>> extends NullAwareTypeConverter<T> {
    private final SharedObjectTypeConverter<T> sharedObjectTypeConverter;

    /* JADX INFO: renamed from: sharedRefType$delegate, reason: from kotlin metadata */
    private final Lazy sharedRefType;
    private final q type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedRefTypeConverter(q type) {
        super(type.getIsMarkedNullable());
        s.k(type, "type");
        this.type = type;
        this.sharedObjectTypeConverter = new SharedObjectTypeConverter<>(type);
        this.sharedRefType = m.b(new a() { // from class: wj0.b
            @Override // wn0.a
            public final Object invoke() {
                return SharedRefTypeConverter.sharedRefType_delegate$lambda$1(this.f121983a);
            }
        });
    }

    private final SharedRef<?> checkInnerRef(SharedRef<?> sharedRef) throws IncorrectRefTypeException {
        Object ref = sharedRef.getRef();
        if (ref != null) {
            q sharedRefType = getSharedRefType();
            f classifier = sharedRefType != null ? sharedRefType.getClassifier() : null;
            d dVar = classifier instanceof d ? (d) classifier : null;
            if (dVar != null && !c.n(dVar, vn0.a.e(ref.getClass()))) {
                throw new IncorrectRefTypeException(this.type, sharedRef.getClass());
            }
        }
        return sharedRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q sharedRefType_delegate$lambda$1(SharedRefTypeConverter sharedRefTypeConverter) {
        List<co0.s> arguments;
        f classifier = sharedRefTypeConverter.type.getClassifier();
        d dVar = classifier instanceof d ? (d) classifier : null;
        q qVar = sharedRefTypeConverter.type;
        while (dVar != null) {
            if (s.f(dVar, o0.b(SharedRef.class))) {
                co0.s sVar = (qVar == null || (arguments = qVar.getArguments()) == null) ? null : (co0.s) v.o0(arguments);
                if (s.f(sVar, co0.s.INSTANCE.c())) {
                    return null;
                }
                q qVarC = sVar != null ? sVar.c() : null;
                if (qVarC != null) {
                    return qVarC;
                }
                throw new IllegalArgumentException(("The " + sharedRefTypeConverter.getSharedRefType() + " type should contain the type of the inner ref").toString());
            }
            qVar = (q) v.q0(dVar.getSupertypes());
            f classifier2 = qVar != null ? qVar.getClassifier() : null;
            dVar = classifier2 instanceof d ? (d) classifier2 : null;
        }
        return null;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return this.sharedObjectTypeConverter.get$cppRequireType();
    }

    public final q getSharedRefType() {
        return (q) this.sharedRefType.getValue();
    }

    public final q getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.sharedObjectTypeConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public T convertNonOptional(Object value, AppContext context) throws NullArgumentException, InvalidSharedObjectTypeException {
        s.k(value, "value");
        T tConvert = this.sharedObjectTypeConverter.convert(value, context);
        if (tConvert == null) {
            throw new InvalidSharedObjectTypeException(this.type);
        }
        T t11 = (T) checkInnerRef(tConvert);
        s.i(t11, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return t11;
    }
}
