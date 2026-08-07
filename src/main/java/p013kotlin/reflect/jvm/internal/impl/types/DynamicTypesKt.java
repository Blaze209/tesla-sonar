package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
