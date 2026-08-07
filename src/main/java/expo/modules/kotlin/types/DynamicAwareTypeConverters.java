package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "T", "", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "isOptional", "", "<init>", "(Z)V", "convertNonOptional", "value", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/AppContext;", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "convertFromDynamic", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "convertFromAny", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DynamicAwareTypeConverters<T> extends NullAwareTypeConverter<T> {
    public DynamicAwareTypeConverters(boolean z11) {
        super(z11);
    }

    public abstract T convertFromAny(Object value, AppContext context);

    public abstract T convertFromDynamic(Dynamic value, AppContext context);

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public T convertNonOptional(Object value, AppContext context) {
        s.k(value, "value");
        return value instanceof Dynamic ? convertFromDynamic((Dynamic) value, context) : convertFromAny(value, context);
    }
}
