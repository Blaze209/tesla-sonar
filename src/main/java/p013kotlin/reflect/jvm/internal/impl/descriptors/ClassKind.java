package p013kotlin.reflect.jvm.internal.impl.descriptors;

import ch.qos.logback.core.joran.action.Action;
import on0.a;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes9.dex */
public enum ClassKind {
    CLASS(Action.CLASS_ATTRIBUTE),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
