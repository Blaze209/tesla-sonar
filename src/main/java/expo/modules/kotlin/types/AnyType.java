package expo.modules.kotlin.types;

import co0.f;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u0011\"\u0006\b\u0000\u0010\u0010\u0018\u0001H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/types/AnyType;", "", "Lco0/q;", "kType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "<init>", "(Lco0/q;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "value", "Lexpo/modules/kotlin/AppContext;", "appContext", "convert", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "T", "", "inheritFrom$expo_modules_core_release", "()Z", "inheritFrom", "Lco0/q;", "getKType", "()Lco0/q;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverterProvider", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lexpo/modules/kotlin/types/TypeConverter;", "converter$delegate", "Lkotlin/Lazy;", "getConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "converter", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnyType {

    /* JADX INFO: renamed from: converter$delegate, reason: from kotlin metadata */
    private final Lazy converter;
    private final TypeConverterProvider converterProvider;
    private final q kType;

    public AnyType(q kType, TypeConverterProvider typeConverterProvider) {
        s.k(kType, "kType");
        this.kType = kType;
        this.converterProvider = typeConverterProvider;
        this.converter = m.b(new wn0.a() { // from class: expo.modules.kotlin.types.a
            @Override // wn0.a
            public final Object invoke() {
                return AnyType.converter_delegate$lambda$0(this.f63386a);
            }
        });
    }

    public static /* synthetic */ Object convert$default(AnyType anyType, Object obj, AppContext appContext, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            appContext = null;
        }
        return anyType.convert(obj, appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeConverter converter_delegate$lambda$0(AnyType anyType) {
        TypeConverterProvider typeConverterProvider = anyType.converterProvider;
        return typeConverterProvider != null ? typeConverterProvider.obtainTypeConverter(anyType.kType) : TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(anyType.kType);
    }

    private final TypeConverter<?> getConverter() {
        return (TypeConverter) this.converter.getValue();
    }

    public final Object convert(Object value, AppContext appContext) {
        return getConverter().convert(value, appContext);
    }

    public final TypeConverterProvider getConverterProvider() {
        return this.converterProvider;
    }

    public final ExpectedType getCppRequiredTypes() {
        return getConverter().getCppRequiredTypes();
    }

    public final q getKType() {
        return this.kType;
    }

    public final /* synthetic */ <T> boolean inheritFrom$expo_modules_core_release() {
        f classifier = getKType().getClassifier();
        co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
        if (dVar == null) {
            return false;
        }
        Class clsB = vn0.a.b(dVar);
        s.q(4, "T");
        return Object.class.isAssignableFrom(clsB);
    }

    public /* synthetic */ AnyType(q qVar, TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, (i11 & 2) != 0 ? null : typeConverterProvider);
    }
}
