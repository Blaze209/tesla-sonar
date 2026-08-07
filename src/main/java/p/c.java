package p;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f100079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private static final Executor f100080d = new Executor() { // from class: p.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private static final Executor f100081e = new Executor() { // from class: p.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private e f100082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final e f100083b;

    private c() {
        d dVar = new d();
        this.f100083b = dVar;
        this.f100082a = dVar;
    }

    @NonNull
    public static Executor f() {
        return f100081e;
    }

    @NonNull
    public static c g() {
        if (f100079c != null) {
            return f100079c;
        }
        synchronized (c.class) {
            try {
                if (f100079c == null) {
                    f100079c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f100079c;
    }

    @Override // p.e
    public void a(@NonNull Runnable runnable) {
        this.f100082a.a(runnable);
    }

    @Override // p.e
    public boolean b() {
        return this.f100082a.b();
    }

    @Override // p.e
    public void c(@NonNull Runnable runnable) {
        this.f100082a.c(runnable);
    }
}
