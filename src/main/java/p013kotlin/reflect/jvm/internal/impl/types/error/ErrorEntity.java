package p013kotlin.reflect.jvm.internal.impl.types.error;

import on0.a;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes9.dex */
public enum ErrorEntity {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final String debugText;

    ErrorEntity(String str) {
        this.debugText = str;
    }

    public final String getDebugText() {
        return this.debugText;
    }
}
