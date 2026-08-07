package retrofit2;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
class c {

    @TargetApi(24)
    static final class a extends c {
        a() {
        }

        @Override // retrofit2.c
        List<? extends e.a> a(Executor executor) {
            return Arrays.asList(new g(), new i(executor));
        }

        @Override // retrofit2.c
        List<? extends h.a> b() {
            return Collections.singletonList(new s());
        }
    }

    c() {
    }

    List<? extends e.a> a(Executor executor) {
        return Collections.singletonList(new i(executor));
    }

    List<? extends h.a> b() {
        return Collections.EMPTY_LIST;
    }
}
