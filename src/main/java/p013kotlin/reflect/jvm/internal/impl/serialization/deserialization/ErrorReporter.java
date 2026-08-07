package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public interface ErrorReporter {
    public static final ErrorReporter DO_NOTHING = new a();

    static class a implements ErrorReporter {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i11 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                a(2);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List<String> list) {
            if (classDescriptor == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
        }
    }

    void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor);

    void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List<String> list);
}
