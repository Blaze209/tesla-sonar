package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public interface x0 {
    b1 A();

    void B(r6 r6Var);

    List<c0> C();

    void D(w3 w3Var);

    void E(q7 q7Var);

    List<io.sentry.internal.eventprocessor.a> F();

    void G(String str, Object obj);

    List<String> H();

    String I();

    void J(String str);

    w3 K();

    List<b> L();

    void M();

    w3 N(d4.a aVar);

    void O(d4.c cVar);

    void P(io.sentry.protocol.x xVar);

    void a(String str, String str2);

    void b(String str, String str2);

    void c(e eVar);

    void clear();

    /* JADX INFO: renamed from: clone */
    x0 m475clone();

    void d(e eVar, h0 h0Var);

    void e(Throwable th2, g1 g1Var, String str);

    i1 f();

    io.sentry.protocol.g g();

    Map<String, Object> getExtras();

    b7 getLevel();

    q7 getOptions();

    io.sentry.protocol.o getRequest();

    String getScreen();

    d4.d h();

    g1 i();

    void j(io.sentry.protocol.i0 i0Var);

    f8 l();

    void m(io.sentry.protocol.x xVar);

    Queue<e> n();

    f8 o(d4.b bVar);

    Map<String, String> p();

    void q();

    io.sentry.protocol.c r();

    void s(i1 i1Var);

    io.sentry.protocol.i0 t();

    void u();

    io.sentry.featureflags.b v();

    void w(b1 b1Var);

    f8 x();

    io.sentry.protocol.x y();

    void z(String str);
}
