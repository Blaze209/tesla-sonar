package oq;

import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(s sVar);

        @NonNull
        public abstract a c(b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<b> valueMap;
        private final int value;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i11) {
            this.value = i11;
        }

        public static b forNumber(int i11) {
            return valueMap.get(i11);
        }

        public int getValue() {
            return this.value;
        }
    }

    @NonNull
    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
