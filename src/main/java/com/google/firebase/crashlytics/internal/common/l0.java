package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface l0 {

    public static abstract class a {
        static a a(String str, FirebaseInstallationId j0Var) {
            return new c(str, j0Var.getFid(), j0Var.getAuthToken());
        }

        public static a b(String str) {
            return new c(str, null, null);
        }

        @NonNull
        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
