package pm;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tk.a.c f103197a;

    /* JADX INFO: renamed from: pm.a$a, reason: collision with other inner class name */
    class C2195a implements tk.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ rm.a f103198a;

        C2195a(rm.a aVar) {
            this.f103198a = aVar;
        }

        @Override // tk.a.c
        public boolean a() {
            return this.f103198a.b();
        }

        @Override // tk.a.c
        public void b(SharedReference<Object> sharedReference, Throwable th2) {
            this.f103198a.a(sharedReference, th2);
            Object objF = sharedReference.f();
            qk.a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objF != null ? objF.getClass().getName() : "<value is null>", a.d(th2));
        }
    }

    public a(rm.a aVar) {
        this.f103197a = new C2195a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    public <U extends Closeable> tk.a<U> b(U u11) {
        return tk.a.e0(u11, this.f103197a);
    }

    public <T> tk.a<T> c(T t11, tk.h<T> hVar) {
        return tk.a.n0(t11, hVar, this.f103197a);
    }
}
