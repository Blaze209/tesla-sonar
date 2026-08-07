package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/types/DurationTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lio0/b;", "", "isOptional", "<init>", "(Z)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromDynamic-3nIYWDw", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)J", "convertFromDynamic", "", "convertFromAny-3nIYWDw", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)J", "convertFromAny", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DurationTypeConverter extends DynamicAwareTypeConverters<io0.b> {
    public DurationTypeConverter(boolean z11) {
        super(z11);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public /* bridge */ /* synthetic */ io0.b convertFromAny(Object obj, AppContext appContext) {
        return io0.b.f(m192convertFromAny3nIYWDw(obj, appContext));
    }

    /* JADX INFO: renamed from: convertFromAny-3nIYWDw, reason: not valid java name */
    public long m192convertFromAny3nIYWDw(Object value, AppContext context) {
        s.k(value, "value");
        return io0.d.r(((Double) value).doubleValue(), io0.e.SECONDS);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public /* bridge */ /* synthetic */ io0.b convertFromDynamic(Dynamic dynamic, AppContext appContext) {
        return io0.b.f(m193convertFromDynamic3nIYWDw(dynamic, appContext));
    }

    /* JADX INFO: renamed from: convertFromDynamic-3nIYWDw, reason: not valid java name */
    public long m193convertFromDynamic3nIYWDw(Dynamic value, AppContext context) {
        s.k(value, "value");
        if (value.getType() == ReadableType.Number) {
            return io0.d.r(value.asDouble(), io0.e.SECONDS);
        }
        throw new IllegalArgumentException("Expected a number, but received " + value.getType());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.DOUBLE);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }
}
