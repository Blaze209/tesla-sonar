package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeAttributesKt {
    public static final JavaTypeAttributes toAttributes(TypeUsage typeUsage, boolean z11, boolean z12, TypeParameterDescriptor typeParameterDescriptor) {
        s.k(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z12, z11, typeParameterDescriptor != null ? d1.c(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z11, boolean z12, TypeParameterDescriptor typeParameterDescriptor, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z11, z12, typeParameterDescriptor);
    }
}
