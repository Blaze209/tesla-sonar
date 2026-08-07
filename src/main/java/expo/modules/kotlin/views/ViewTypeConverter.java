package expo.modules.kotlin.views;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co0.f;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.NullArgumentException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.TypeConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/views/ViewTypeConverter;", "Landroid/view/View;", "T", "Lexpo/modules/kotlin/types/TypeConverter;", "Lco0/q;", "type", "<init>", "(Lco0/q;)V", "", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convert", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Landroid/view/View;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "getType", "()Lco0/q;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewTypeConverter<T extends View> extends TypeConverter<T> {
    private final q type;

    public ViewTypeConverter(q type) {
        s.k(type, "type");
        this.type = type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public ExpectedType getCppRequiredTypes() {
        return new ExpectedType(CppType.INT, CppType.VIEW_TAG);
    }

    public final q getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public T convert(Object value, AppContext context) throws NullArgumentException, Exceptions.IncorrectThreadException, Exceptions.AppContextLost, Exceptions.ViewNotFound {
        if (context == null) {
            throw new Exceptions.AppContextLost();
        }
        context.assertMainThread$expo_modules_core_release();
        if (value == null) {
            if (this.type.getIsMarkedNullable()) {
                return null;
            }
            throw new NullArgumentException();
        }
        int iIntValue = ((Integer) value).intValue();
        T t11 = (T) context.findView(iIntValue);
        if (this.type.getIsMarkedNullable() || t11 != null) {
            return t11;
        }
        f classifier = this.type.getClassifier();
        s.i(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        throw new Exceptions.ViewNotFound((co0.d) classifier, iIntValue);
    }
}
