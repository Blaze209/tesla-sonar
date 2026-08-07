package rw;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    @NonNull
    public static b a(@NonNull Set<String> set) {
        return new a(set);
    }

    @NonNull
    public abstract Set<String> b();
}
