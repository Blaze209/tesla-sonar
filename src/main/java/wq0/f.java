package wq0;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes10.dex */
public interface f {

    public static class a implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final boolean f122300b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f122301a;

        static {
            boolean z11;
            try {
                Class.forName("android.util.Log");
                z11 = true;
            } catch (ClassNotFoundException unused) {
                z11 = false;
            }
            f122300b = z11;
        }

        public a(String str) {
            this.f122301a = str;
        }

        public static boolean c() {
            return f122300b;
        }

        @Override // wq0.f
        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f122301a, str);
            }
        }

        @Override // wq0.f
        public void b(Level level, String str, Throwable th2) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f122301a, str + "\n" + Log.getStackTraceString(th2));
            }
        }

        protected int d(Level level) {
            int iIntValue = level.intValue();
            if (iIntValue < 800) {
                return iIntValue < 500 ? 2 : 3;
            }
            if (iIntValue < 900) {
                return 4;
            }
            return iIntValue < 1000 ? 5 : 6;
        }
    }

    public static class b implements f {
        @Override // wq0.f
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // wq0.f
        public void b(Level level, String str, Throwable th2) {
            System.out.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th2);
}
