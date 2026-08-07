package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.apifeatures.EitherType;
import expo.modules.kotlin.jni.ExpectedType;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@EitherType
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u00012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0006B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006)"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfFourTypeConverter;", "", "FirstType", "SecondType", "ThirdType", "FourthType", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lexpo/modules/kotlin/types/EitherOfFour;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "eitherType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "", "isTrivial", "()Z", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/types/EitherOfFour;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "firstJavaType", "Lco0/q;", "secondJavaType", "thirdJavaType", "fourthJavaType", "Lexpo/modules/kotlin/types/TypeConverter;", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "thirdTypeConverter", "fourthTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "thirdType", "fourthType", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EitherOfFourTypeConverter<FirstType, SecondType, ThirdType, FourthType> extends NullAwareTypeConverter<EitherOfFour<FirstType, SecondType, ThirdType, FourthType>> {
    private final q firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final q fourthJavaType;
    private final ExpectedType fourthType;
    private final TypeConverter<?> fourthTypeConverter;
    private final q secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;
    private final q thirdJavaType;
    private final ExpectedType thirdType;
    private final TypeConverter<?> thirdTypeConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherOfFourTypeConverter(TypeConverterProvider converterProvider, q eitherType) {
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
        co0.s sVar4 = (co0.s) v.r0(eitherType.getArguments(), 3);
        q qVarC4 = sVar4 != null ? sVar4.c() : null;
        if (qVarC4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.fourthJavaType = qVarC4;
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(qVarC);
        this.firstTypeConverter = typeConverterObtainTypeConverter;
        TypeConverter<?> typeConverterObtainTypeConverter2 = converterProvider.obtainTypeConverter(qVarC2);
        this.secondTypeConverter = typeConverterObtainTypeConverter2;
        TypeConverter<?> typeConverterObtainTypeConverter3 = converterProvider.obtainTypeConverter(qVarC3);
        this.thirdTypeConverter = typeConverterObtainTypeConverter3;
        TypeConverter<?> typeConverterObtainTypeConverter4 = converterProvider.obtainTypeConverter(qVarC4);
        this.fourthTypeConverter = typeConverterObtainTypeConverter4;
        this.firstType = typeConverterObtainTypeConverter.get$cppRequireType();
        this.secondType = typeConverterObtainTypeConverter2.get$cppRequireType();
        this.thirdType = typeConverterObtainTypeConverter3.get$cppRequireType();
        this.fourthType = typeConverterObtainTypeConverter4.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType, this.thirdType, this.fourthType);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public EitherOfFour<FirstType, SecondType, ThirdType, FourthType> convertNonOptional(Object value, AppContext context) {
        s.k(value, "value");
        return new EitherOfFour<>(value, v.p1(EitherTypeConverterKt.createDeferredValues(value, context, v.p(x.a(this.firstType, this.firstTypeConverter), x.a(this.secondType, this.secondTypeConverter), x.a(this.thirdType, this.thirdTypeConverter), x.a(this.fourthType, this.fourthTypeConverter)), v.p(this.firstJavaType, this.secondJavaType, this.thirdJavaType, this.fourthJavaType))), v.p(this.firstJavaType, this.secondJavaType, this.thirdJavaType, this.fourthJavaType));
    }
}
