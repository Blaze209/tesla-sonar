package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/types/DateTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "j$/time/LocalDate", "", "isOptional", "<init>", "(Z)V", "", "value", "convertFromLong", "(J)Lj$/time/LocalDate;", "Lcom/facebook/react/bridge/Dynamic;", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Lj$/time/LocalDate;", "", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lj$/time/LocalDate;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateTypeConverter extends DynamicAwareTypeConverters<LocalDate> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DateTypeConverter(boolean z11) {
        super(z11);
    }

    private final LocalDate convertFromLong(long value) {
        LocalDate localDate = Instant.ofEpochMilli(value).atZone(ZoneId.systemDefault()).toLocalDate();
        s.j(localDate, "toLocalDate(...)");
        return localDate;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(new SingleType(CppType.INT, null, 2, null), new SingleType(CppType.STRING, null, 2, null));
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public LocalDate convertFromAny(Object value, AppContext context) throws UnexpectedException {
        s.k(value, "value");
        if (value instanceof String) {
            LocalDate localDate = LocalDate.parse((CharSequence) value, DateTimeFormatter.ISO_DATE_TIME);
            s.j(localDate, "parse(...)");
            return localDate;
        }
        if (value instanceof Long) {
            return convertFromLong(((Number) value).longValue());
        }
        throw new UnexpectedException("Unknown argument type: " + o0.b(value.getClass()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public LocalDate convertFromDynamic(Dynamic value, AppContext context) throws UnexpectedException {
        s.k(value, "value");
        int i11 = WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()];
        if (i11 == 1) {
            LocalDate localDate = LocalDate.parse(value.asString(), DateTimeFormatter.ISO_DATE_TIME);
            s.j(localDate, "parse(...)");
            return localDate;
        }
        if (i11 == 2) {
            return convertFromLong((long) value.asDouble());
        }
        throw new UnexpectedException("Unknown argument type: " + value.getType());
    }
}
