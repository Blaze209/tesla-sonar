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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfThreeTypeConverter;", "", "FirstType", "SecondType", "ThirdType", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lexpo/modules/kotlin/types/EitherOfThree;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "eitherType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "", "isTrivial", "()Z", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/types/EitherOfThree;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "firstJavaType", "Lco0/q;", "secondJavaType", "thirdJavaType", "Lexpo/modules/kotlin/types/TypeConverter;", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "thirdTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "thirdType", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EitherOfThreeTypeConverter<FirstType, SecondType, ThirdType> extends NullAwareTypeConverter<EitherOfThree<FirstType, SecondType, ThirdType>> {
    private final q firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final q secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;
    private final q thirdJavaType;
    private final ExpectedType thirdType;
    private final TypeConverter<?> thirdTypeConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherOfThreeTypeConverter(TypeConverterProvider converterProvider, q eitherType) {
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
        co0.s sVar3 = (co0.s) v.r0(eitherType.getArguments(), 2);
        q qVarC3 = sVar3 != null ? sVar3.c() : null;
        if (qVarC3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.thirdJavaType = qVarC3;
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(qVarC);
        this.firstTypeConverter = typeConverterObtainTypeConverter;
        TypeConverter<?> typeConverterObtainTypeConverter2 = converterProvider.obtainTypeConverter(qVarC2);
        this.secondTypeConverter = typeConverterObtainTypeConverter2;
        TypeConverter<?> typeConverterObtainTypeConverter3 = converterProvider.obtainTypeConverter(qVarC3);
        this.thirdTypeConverter = typeConverterObtainTypeConverter3;
        this.firstType = typeConverterObtainTypeConverter.get$cppRequireType();
        this.secondType = typeConverterObtainTypeConverter2.get$cppRequireType();
        this.thirdType = typeConverterObtainTypeConverter3.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType, this.thirdType);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public EitherOfThree<FirstType, SecondType, ThirdType> convertNonOptional(Object value, AppContext context) {
        s.k(value, "value");
        List listP = v.p(this.firstJavaType, this.secondJavaType, this.thirdJavaType);
        return new EitherOfThree<>(value, v.p1(EitherTypeConverterKt.createDeferredValues(value, context, v.p(x.a(this.firstType, this.firstTypeConverter), x.a(this.secondType, this.secondTypeConverter), x.a(this.thirdType, this.thirdTypeConverter)), listP)), listP);
    }
}
