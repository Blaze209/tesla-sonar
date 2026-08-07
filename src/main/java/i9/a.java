package i9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p7.e0;
import p7.f0;
import p7.g0;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f76234h;

    public a(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f76227a = i11;
        this.f76228b = str;
        this.f76229c = str2;
        this.f76230d = i12;
        this.f76231e = i13;
        this.f76232f = i14;
        this.f76233g = i15;
        this.f76234h = bArr;
    }

    public static a a(c0 c0Var) {
        int iV = c0Var.v();
        String strU = g0.u(c0Var.K(c0Var.v(), StandardCharsets.US_ASCII));
        String strJ = c0Var.J(c0Var.v());
        int iV2 = c0Var.v();
        int iV3 = c0Var.v();
        int iV4 = c0Var.v();
        int iV5 = c0Var.v();
        int iV6 = c0Var.v();
        byte[] bArr = new byte[iV6];
        c0Var.q(bArr, 0, iV6);
        return new a(iV, strU, strJ, iV2, iV3, iV4, iV5, bArr);
    }

    @Override // p7.f0.a
    public void I(e0.b bVar) {
        bVar.K(this.f76234h, this.f76227a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f76227a == aVar.f76227a && this.f76228b.equals(aVar.f76228b) && this.f76229c.equals(aVar.f76229c) && this.f76230d == aVar.f76230d && this.f76231e == aVar.f76231e && this.f76232f == aVar.f76232f && this.f76233g == aVar.f76233g && Arrays.equals(this.f76234h, aVar.f76234h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f76227a) * 31) + this.f76228b.hashCode()) * 31) + this.f76229c.hashCode()) * 31) + this.f76230d) * 31) + this.f76231e) * 31) + this.f76232f) * 31) + this.f76233g) * 31) + Arrays.hashCode(this.f76234h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f76228b + ", description=" + this.f76229c;
    }
}
