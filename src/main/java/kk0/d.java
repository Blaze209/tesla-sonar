package kk0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class d implements c {

    private static class a extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Logger f86287i;

        a(Logger logger) {
            this.f86287i = logger;
        }

        @Override // kk0.b
        public void e(String str) {
            this.f86287i.log(Level.SEVERE, str);
        }

        @Override // kk0.b
        public void f(String str, Throwable th2) {
            this.f86287i.log(Level.SEVERE, str, th2);
        }

        @Override // kk0.b
        public void l(String str) {
            this.f86287i.log(Level.INFO, str);
        }

        @Override // kk0.b
        public void m(String str, Throwable th2) {
            this.f86287i.log(Level.INFO, str, th2);
        }

        @Override // kk0.b
        public boolean o() {
            return this.f86287i.isLoggable(Level.INFO);
        }

        @Override // kk0.b
        public void u(String str) {
            this.f86287i.log(Level.WARNING, str);
        }

        @Override // kk0.b
        public void v(String str, Throwable th2) {
            this.f86287i.log(Level.WARNING, str, th2);
        }
    }

    @Override // kk0.c
    public b getLogger(String str) {
        return new a(Logger.getLogger(str));
    }
}
