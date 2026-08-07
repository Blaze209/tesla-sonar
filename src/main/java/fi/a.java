package fi;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f65998a;

        private b(Context context) {
            this.f65998a = context;
        }

        public a a() {
            Context context = this.f65998a;
            if (context != null) {
                return new fi.b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b b(Context context) {
        return new b(context);
    }

    public abstract d a();

    public abstract void c(c cVar);
}
