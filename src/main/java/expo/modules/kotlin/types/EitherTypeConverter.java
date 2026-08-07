package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.apifeatures.EitherType;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@EitherType
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\f\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/types/EitherTypeConverter;", "", "FirstType", "SecondType", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "eitherType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "firstJavaType", "Lco0/q;", "secondJavaType", "Lexpo/modules/kotlin/types/TypeConverter;", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EitherTypeConverter<FirstType, SecondType> extends NullAwareTypeConverter<Either<FirstType, SecondType>> {
    private final q firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final q secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherTypeConverter(TypeConverterProvider converterProvider, q eitherType) {
        super(eitherType.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(eitherType, "eitherType");
        co0.s sVar = (co0.s) v.r0(eitherType.getArguments(), 0);
        q qVarC = sVar != null ? sVar.c() : null;
        if (qVarC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.firstJavaType = qVarC;
        co0.s sVar2 = (co0.s) v.r0(eitherType.getArguments(), 1);
        q qVarC2 = sVar2 != null ? sVar2.c() : null;
        if (qVarC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.secondJavaType = qVarC2;
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(qVarC);
        this.firstTypeConverter = typeConverterObtainTypeConverter;
        TypeConverter<?> typeConverterObtainTypeConverter2 = converterProvider.obtainTypeConverter(qVarC2);
        this.secondTypeConverter = typeConverterObtainTypeConverter2;
        this.firstType = typeConverterObtainTypeConverter.get$cppRequireType();
        this.secondType = typeConverterObtainTypeConverter2.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public Either<FirstType, SecondType> convertNonOptional(Object value, AppContext context) {
        s.k(value, "value");
        List listP = v.p(this.firstJavaType, this.secondJavaType);
        return new Either<>(value, v.p1(EitherTypeConverterKt.createDeferredValues(value, context, v.p(x.a(this.firstType, this.firstTypeConverter), x.a(this.secondType, this.secondTypeConverter)), listP)), listP);
    }
}
