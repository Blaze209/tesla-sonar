package vu;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.c;
import com.google.firebase.l;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/c;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "a", "(Lcom/google/firebase/c;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile FirebaseAnalytics f119861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f119862b = new Object();

    public static final FirebaseAnalytics a(@NonNull c cVar) {
        s.k(cVar, "<this>");
        if (f119861a == null) {
            synchronized (f119862b) {
                try {
                    if (f119861a == null) {
                        f119861a = FirebaseAnalytics.getInstance(l.a(c.f43868a).k());
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f119861a;
        s.h(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
