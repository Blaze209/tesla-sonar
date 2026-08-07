package p013kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeAttributeTranslators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<TypeAttributeTranslator> f89009a;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAttributeTranslators(List<? extends TypeAttributeTranslator> translators) {
        s.k(translators, "translators");
        this.f89009a = translators;
    }

    public final List<TypeAttributeTranslator> getTranslators() {
        return this.f89009a;
    }
}
