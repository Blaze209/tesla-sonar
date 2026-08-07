package retrofit2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Executor f107991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final v f107992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final c f107993c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f107991a = null;
            f107992b = new v();
            f107993c = new c();
        } else if (property.equals("Dalvik")) {
            f107991a = new a();
            f107992b = new v.a();
            f107993c = new c.a();
        } else {
            f107991a = null;
            f107992b = new v.b();
            f107993c = new c.a();
        }
    }
}
