package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.UnsupportedClass;
import expo.modules.kotlin.jni.ExpectedType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0006\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"", "T", "", "isOptional", "Lexpo/modules/kotlin/jni/ExpectedType;", "cppRequireType", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/Dynamic;", "dynamicFallback", "Lexpo/modules/kotlin/types/TypeConverter;", "createTrivialTypeConverter", "(ZLexpo/modules/kotlin/jni/ExpectedType;Lwn0/l;)Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TypeConverterKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: expo.modules.kotlin.types.TypeConverterKt$createTrivialTypeConverter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"expo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/AppContext;", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "convertFromAny", "", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2<T> extends DynamicAwareTypeConverters<T> {
        final /* synthetic */ ExpectedType $cppRequireType;
        final /* synthetic */ l<Dynamic, T> $dynamicFallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z11, l<? super Dynamic, ? extends T> lVar, ExpectedType expectedType) {
            super(z11);
            this.$dynamicFallback = lVar;
            this.$cppRequireType = expectedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
        public T convertFromAny(Object value, AppContext context) {
            s.k(value, "value");
            s.q(1, "T");
            return value;
        }

        @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
        public T convertFromDynamic(Dynamic value, AppContext context) {
            s.k(value, "value");
            return this.$dynamicFallback.invoke(value);
        }

        @Override // expo.modules.kotlin.types.TypeConverter
        /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
        public ExpectedType get$cppRequireType() {
            return this.$cppRequireType;
        }
    }

    public static final /* synthetic */ <T> TypeConverter<T> createTrivialTypeConverter(boolean z11, ExpectedType cppRequireType, l<? super Dynamic, ? extends T> dynamicFallback) {
        s.k(cppRequireType, "cppRequireType");
        s.k(dynamicFallback, "dynamicFallback");
        s.p();
        return new AnonymousClass2(z11, dynamicFallback, cppRequireType);
    }

    public static /* synthetic */ TypeConverter createTrivialTypeConverter$default(boolean z11, ExpectedType cppRequireType, l dynamicFallback, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            s.p();
            dynamicFallback = new l() { // from class: expo.modules.kotlin.types.TypeConverterKt.createTrivialTypeConverter.1
                @Override // wn0.l
                public final Void invoke(Dynamic it) throws UnsupportedClass {
                    s.k(it, "it");
                    s.q(4, "T");
                    throw new UnsupportedClass(o0.b(Object.class));
                }
            };
        }
        s.k(cppRequireType, "cppRequireType");
        s.k(dynamicFallback, "dynamicFallback");
        s.p();
        return new AnonymousClass2(z11, dynamicFallback, cppRequireType);
    }
}
