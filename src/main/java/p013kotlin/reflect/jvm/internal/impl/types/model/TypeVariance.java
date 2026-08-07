package p013kotlin.reflect.jvm.internal.impl.types.model;

import on0.a;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes9.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
