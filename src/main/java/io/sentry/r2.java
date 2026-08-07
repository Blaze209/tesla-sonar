package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public final class r2 implements x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r2 f81148b = new r2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<q7> f81149a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.q2
        @Override // io.sentry.util.r.a
        public final Object a() {
            return q7.empty();
        }
    });

    private r2() {
    }

    public static r2 Q() {
        return f81148b;
    }

    @Override // io.sentry.x0
    public b1 A() {
        return w2.i();
    }

    @Override // io.sentry.x0
    public void B(r6 r6Var) {
    }

    @Override // io.sentry.x0
    public List<c0> C() {
        return new ArrayList();
    }

    @Override // io.sentry.x0
    public void D(w3 w3Var) {
    }

    @Override // io.sentry.x0
    public void E(q7 q7Var) {
    }

    @Override // io.sentry.x0
    public List<io.sentry.internal.eventprocessor.a> F() {
        return new ArrayList();
    }

    @Override // io.sentry.x0
    public void G(String str, Object obj) {
    }

    @Override // io.sentry.x0
    public List<String> H() {
        return new ArrayList();
    }

    @Override // io.sentry.x0
    public String I() {
        return null;
    }

    @Override // io.sentry.x0
    public void J(String str) {
    }

    @Override // io.sentry.x0
    public w3 K() {
        return new w3();
    }

    @Override // io.sentry.x0
    public List<b> L() {
        return new ArrayList();
    }

    @Override // io.sentry.x0
    public void M() {
    }

    @Override // io.sentry.x0
    public w3 N(d4.a aVar) {
        return new w3();
    }

    @Override // io.sentry.x0
    public void O(d4.c cVar) {
    }

    @Override // io.sentry.x0
    public void P(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.x0
    public void a(String str, String str2) {
    }

    @Override // io.sentry.x0
    public void b(String str, String str2) {
    }

    @Override // io.sentry.x0
    public void c(e eVar) {
    }

    @Override // io.sentry.x0
    public void clear() {
    }

    @Override // io.sentry.x0
    public void d(e eVar, h0 h0Var) {
    }

    @Override // io.sentry.x0
    public void e(Throwable th2, g1 g1Var, String str) {
    }

    @Override // io.sentry.x0
    public i1 f() {
        return null;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.g g() {
        return null;
    }

    @Override // io.sentry.x0
    public Map<String, Object> getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.x0
    public b7 getLevel() {
        return null;
    }

    @Override // io.sentry.x0
    public q7 getOptions() {
        return this.f81149a.a();
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.o getRequest() {
        return null;
    }

    @Override // io.sentry.x0
    public String getScreen() {
        return null;
    }

    @Override // io.sentry.x0
    public d4.d h() {
        return null;
    }

    @Override // io.sentry.x0
    public g1 i() {
        return null;
    }

    @Override // io.sentry.x0
    public void j(io.sentry.protocol.i0 i0Var) {
    }

    @Override // io.sentry.x0
    public f8 l() {
        return null;
    }

    @Override // io.sentry.x0
    public void m(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.x0
    public Queue<e> n() {
        return new ArrayDeque();
    }

    @Override // io.sentry.x0
    public f8 o(d4.b bVar) {
        return null;
    }

    @Override // io.sentry.x0
    public Map<String, String> p() {
        return new HashMap();
    }

    @Override // io.sentry.x0
    public void q() {
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.c r() {
        return new io.sentry.protocol.c();
    }

    @Override // io.sentry.x0
    public void s(i1 i1Var) {
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.i0 t() {
        return null;
    }

    @Override // io.sentry.x0
    public void u() {
    }

    @Override // io.sentry.x0
    public io.sentry.featureflags.b v() {
        return io.sentry.featureflags.c.a();
    }

    @Override // io.sentry.x0
    public void w(b1 b1Var) {
    }

    @Override // io.sentry.x0
    public f8 x() {
        return null;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.x y() {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.x0
    public void z(String str) {
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public x0 m484clone() {
        return Q();
    }
}
