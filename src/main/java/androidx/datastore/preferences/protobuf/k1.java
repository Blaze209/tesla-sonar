package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class k1<T, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f8142a = 100;

    k1() {
    }

    private final void l(B b11, d1 d1Var, int i11) {
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE && m(b11, d1Var, i11)) {
        }
    }

    abstract void a(B b11, int i11, int i12);

    abstract void b(B b11, int i11, long j11);

    abstract void c(B b11, int i11, T t11);

    abstract void d(B b11, int i11, g gVar);

    abstract void e(B b11, int i11, long j11);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t11);

    abstract int i(T t11);

    abstract void j(Object obj);

    abstract T k(T t11, T t12);

    final boolean m(B b11, d1 d1Var, int i11) throws InvalidProtocolBufferException {
        int tag = d1Var.getTag();
        int iA = p1.a(tag);
        int iB = p1.b(tag);
        if (iB == 0) {
            e(b11, iA, d1Var.readInt64());
            return true;
        }
        if (iB == 1) {
            b(b11, iA, d1Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(b11, iA, d1Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b11, iA, d1Var.readFixed32());
            return true;
        }
        B bN = n();
        int iC = p1.c(iA, 4);
        int i12 = i11 + 1;
        if (i12 >= f8142a) {
            throw InvalidProtocolBufferException.i();
        }
        l(bN, d1Var, i12);
        if (iC != d1Var.getTag()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b11, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b11);

    abstract void p(Object obj, T t11);

    abstract boolean q(d1 d1Var);

    abstract T r(B b11);

    abstract void s(T t11, q1 q1Var);

    abstract void t(T t11, q1 q1Var);
}
