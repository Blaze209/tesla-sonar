package gx;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import gx.c.b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
abstract class c<O, C extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final GoogleMap f70004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C> f70005b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Map<O, C> f70006c = new HashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<O> f70008a = new LinkedHashSet();

        public b() {
        }

        protected void a(O o11) {
            this.f70008a.add(o11);
            c.this.f70006c.put(o11, this);
        }

        protected boolean b(O o11) {
            if (!this.f70008a.remove(o11)) {
                return false;
            }
            c.this.f70006c.remove(o11);
            c.this.a(o11);
            return true;
        }
    }

    public c(@NonNull GoogleMap googleMap) {
        this.f70004a = googleMap;
        new Handler(Looper.getMainLooper()).post(new a());
    }

    protected abstract void a(O o11);

    abstract void b();
}
