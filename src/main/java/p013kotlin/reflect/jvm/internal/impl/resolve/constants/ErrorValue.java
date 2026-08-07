package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import jn0.h0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ErrorValue extends ConstantValue<h0> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorValue create(String message) {
            s.k(message, "message");
            return new ErrorValueWithMessage(message);
        }

        private Companion() {
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88458b;

        public ErrorValueWithMessage(String message) {
            s.k(message, "message");
            this.f88458b = message;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public String toString() {
            return this.f88458b;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public ErrorType getType(ModuleDescriptor module) {
            s.k(module, "module");
            return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f88458b);
        }
    }

    public ErrorValue() {
        super(h0.f84049a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public h0 getValue() {
        throw new UnsupportedOperationException();
    }
}
