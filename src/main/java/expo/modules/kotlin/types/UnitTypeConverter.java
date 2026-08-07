package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/UnitTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "Ljn0/h0;", "<init>", "()V", "", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convert", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)V", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnitTypeConverter extends TypeConverter<h0> {
    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(Object value, AppContext context) {
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public ExpectedType getCppRequiredTypes() {
        return new ExpectedType(CppType.ANY);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public /* bridge */ /* synthetic */ h0 convert(Object obj, AppContext appContext) {
        convert2(obj, appContext);
        return h0.f84049a;
    }
}
