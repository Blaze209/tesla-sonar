package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends m2>> f3240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Class<? extends m2>> f3241c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3242a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<Class<? extends m2>> f3243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<Class<? extends m2>> f3244c;

        @NonNull
        public n2 a() {
            return new n2(this.f3242a, this.f3243b, this.f3244c);
        }

        @NonNull
        public b b(@NonNull Set<Class<? extends m2>> set) {
            this.f3244c = new HashSet(set);
            return this;
        }

        @NonNull
        public b c(@NonNull Set<Class<? extends m2>> set) {
            this.f3243b = new HashSet(set);
            return this;
        }

        @NonNull
        public b d(boolean z11) {
            this.f3242a = z11;
            return this;
        }
    }

    @NonNull
    public static n2 b() {
        return new b().d(true).a();
    }

    public boolean a(@NonNull Class<? extends m2> cls, boolean z11) {
        if (this.f3240b.contains(cls)) {
            return true;
        }
        return !this.f3241c.contains(cls) && this.f3239a && z11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        n2 n2Var = (n2) obj;
        return this.f3239a == n2Var.f3239a && Objects.equals(this.f3240b, n2Var.f3240b) && Objects.equals(this.f3241c, n2Var.f3241c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3239a), this.f3240b, this.f3241c);
    }

    @NonNull
    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f3239a + ", forceEnabledQuirks=" + this.f3240b + ", forceDisabledQuirks=" + this.f3241c + CoreConstants.CURLY_RIGHT;
    }

    private n2(boolean z11, Set<Class<? extends m2>> set, Set<Class<? extends m2>> set2) {
        this.f3239a = z11;
        this.f3240b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f3241c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
