package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f89055a;

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    public static final class IllegalSignature extends CheckResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f89056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(String error) {
            super(false, null);
            s.k(error, "error");
            this.f89056b = error;
        }
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    public /* synthetic */ CheckResult(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    public final boolean isSuccess() {
        return this.f89055a;
    }

    private CheckResult(boolean z11) {
        this.f89055a = z11;
    }
}
