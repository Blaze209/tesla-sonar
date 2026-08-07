package p013kotlin.reflect.jvm.internal.impl.incremental.components;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface LookupTracker {

    public static final class DO_NOTHING implements LookupTracker {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        private DO_NOTHING() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public boolean getRequiresPosition() {
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public void record(String filePath, Position position, String scopeFqName, ScopeKind scopeKind, String name) {
            s.k(filePath, "filePath");
            s.k(position, "position");
            s.k(scopeFqName, "scopeFqName");
            s.k(scopeKind, "scopeKind");
            s.k(name, "name");
        }
    }

    boolean getRequiresPosition();

    void record(String str, Position position, String str2, ScopeKind scopeKind, String str3);
}
