package vl0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    @NonNull
    public static a a() {
        return new b();
    }

    @NonNull
    public abstract String b(@NonNull String str);

    private static class b extends a {
        private b() {
        }

        @Override // vl0.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }
    }
}
