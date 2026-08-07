package expo.modules.kotlin.types;

import co0.q;
import com.facebook.react.bridge.Dynamic;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0086\b¢\u0006\u0004\b\u0007\u0010\t\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\r*\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "T", "Lexpo/modules/kotlin/types/TypeConverter;", "obtainTypeConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convert", "(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lco0/q;", "type", "(Lcom/facebook/react/bridge/Dynamic;Lco0/q;)Ljava/lang/Object;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "otherProvider", "mergeWith", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/TypeConverterProvider;", "mergeWithDefault", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/TypeConverterProvider;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TypeConverterProviderKt {
    public static final /* synthetic */ <T> T convert(Dynamic value) {
        s.k(value, "value");
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        s.q(6, "T");
        T t11 = (T) TypeConverter.convert$default(typeConverterProviderImpl.obtainTypeConverter(null), value, null, 2, null);
        s.q(1, "T");
        return t11;
    }

    public static final TypeConverterProvider mergeWith(TypeConverterProvider typeConverterProvider, TypeConverterProvider otherProvider) {
        s.k(typeConverterProvider, "<this>");
        s.k(otherProvider, "otherProvider");
        return new MergedTypeConverterProvider(v.p(typeConverterProvider, otherProvider));
    }

    public static final TypeConverterProvider mergeWithDefault(TypeConverterProvider typeConverterProvider) {
        TypeConverterProvider typeConverterProviderMergeWith;
        return (typeConverterProvider == null || (typeConverterProviderMergeWith = mergeWith(typeConverterProvider, TypeConverterProviderImpl.INSTANCE)) == null) ? TypeConverterProviderImpl.INSTANCE : typeConverterProviderMergeWith;
    }

    public static final /* synthetic */ <T> TypeConverter<T> obtainTypeConverter() {
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        s.q(6, "T");
        TypeConverter<T> typeConverter = (TypeConverter<T>) typeConverterProviderImpl.obtainTypeConverter(null);
        s.i(typeConverter, "null cannot be cast to non-null type expo.modules.kotlin.types.TypeConverter<T of expo.modules.kotlin.types.TypeConverterProviderKt.obtainTypeConverter>");
        return typeConverter;
    }

    public static final /* synthetic */ <T> T convert(Object obj) {
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        s.q(6, "T");
        T t11 = (T) TypeConverter.convert$default(typeConverterProviderImpl.obtainTypeConverter(null), obj, null, 2, null);
        s.q(1, "T");
        return t11;
    }

    public static final Object convert(Dynamic value, q type) {
        s.k(value, "value");
        s.k(type, "type");
        return TypeConverter.convert$default(TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(type), value, null, 2, null);
    }
}
