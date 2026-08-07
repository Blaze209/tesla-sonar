package androidx.media3.session;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification f11808b;

    public interface a {
        androidx.core.app.o.a a(t7 t7Var, IconCompat iconCompat, CharSequence charSequence, int i11);

        default PendingIntent b(t7 t7Var) {
            return d(t7Var, 3L);
        }

        androidx.core.app.o.a c(t7 t7Var, androidx.media3.session.a aVar);

        PendingIntent d(t7 t7Var, long j11);
    }

    public interface b {

        public interface a {
            void a(j7 j7Var);
        }

        j7 a(t7 t7Var, com.google.common.collect.x<androidx.media3.session.a> xVar, a aVar, a aVar2);

        boolean b(t7 t7Var, String str, Bundle bundle);
    }

    public j7(int i11, Notification notification) {
        this.f11807a = i11;
        this.f11808b = (Notification) s7.a.f(notification);
    }
}
