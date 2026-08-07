package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations first, Annotations second) {
        s.k(first, "first");
        s.k(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
