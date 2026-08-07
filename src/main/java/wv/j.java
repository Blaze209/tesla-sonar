package wv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i11) {
            this.code = i11;
        }

        public int getCode() {
            return this.code;
        }
    }

    @NonNull
    a a(@NonNull String str);
}
