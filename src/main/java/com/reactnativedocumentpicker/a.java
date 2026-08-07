package com.reactnativedocumentpicker;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/reactnativedocumentpicker/a;", "", "", "preset", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getPreset", "()Ljava/lang/String;", "Companion", "a", "CACHES_DIRECTORY", "DOCUMENT_DIRECTORY", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a {
    CACHES_DIRECTORY("cachesDirectory"),
    DOCUMENT_DIRECTORY("documentDirectory");

    private final String preset;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.reactnativedocumentpicker.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/reactnativedocumentpicker/a$a;", "", "<init>", "()V", "", "path", "Lcom/reactnativedocumentpicker/a;", "a", "(Ljava/lang/String;)Lcom/reactnativedocumentpicker/a;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        public final a a(String path) {
            s.k(path, "path");
            for (a aVar : a.values()) {
                if (s.f(aVar.getPreset(), path)) {
                    if (aVar == null) {
                        return a.CACHES_DIRECTORY;
                    }
                    return aVar;
                }
            }
            aVar = null;
            if (aVar == null) {
                return a.CACHES_DIRECTORY;
            }
            return aVar;
        }

        private Companion() {
        }
    }

    a(String str) {
        this.preset = str;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final String getPreset() {
        return this.preset;
    }
}
