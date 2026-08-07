package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class d {

    private static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActivityOptions f7449a;

        a(ActivityOptions activityOptions) {
            this.f7449a = activityOptions;
        }

        @Override // androidx.core.app.d
        public Bundle b() {
            return this.f7449a.toBundle();
        }
    }

    protected d() {
    }

    public static d a(Context context, int i11, int i12) {
        return new a(ActivityOptions.makeCustomAnimation(context, i11, i12));
    }

    public Bundle b() {
        throw null;
    }
}
