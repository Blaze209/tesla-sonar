package dh;

/* JADX INFO: loaded from: classes3.dex */
public class a extends bh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f60609b = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a b(String str, long j11, b bVar, short s11, e eVar) {
        byte[] bArrC = bh.b.c((byte) 1);
        boolean z11 = f60609b;
        if (!z11 && bArrC.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrD = bh.b.d(str.charAt(0), str.charAt(1));
        if (!z11 && bArrD.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrE = bh.b.e(j11);
        if (!z11 && bArrE.length != 8) {
            throw new AssertionError();
        }
        byte[] bArrH = bh.b.h();
        if (!z11 && bArrH.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] bArrC2 = bh.b.c(bVar.f60610a);
        if (!z11 && bArrC2.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrC3 = bh.b.c(bVar.f60611b);
        if (!z11 && bArrC3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.f60612c.clone();
        if (!z11 && bArr.length != (bVar.f60611b & 255)) {
            throw new AssertionError();
        }
        byte[] bArrF = bh.b.f(s11);
        if (!z11 && bArrF.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrH2 = bh.b.h();
        if (!z11 && bArrH2.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] bArrC4 = bh.b.c(eVar.f60614a);
        if (!z11 && bArrC4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.f60615b.clone();
        if (!z11 && bArr2.length != (eVar.f60614a & 255)) {
            throw new AssertionError();
        }
        byte[] bArrI = bh.b.i();
        if (z11 || bArrI.length == 4) {
            return new a(bh.b.g(bArrC, bArrD, bArrE, bArrH, bArrC2, bArrC3, bArr, bArrF, bArrH2, bArrC4, bArr2, bArrI));
        }
        throw new AssertionError();
    }

    public static a c() {
        try {
            return b("EX", 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}
