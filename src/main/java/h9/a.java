package h9;

import java.util.Arrays;
import java.util.Objects;
import p7.f0;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u f71712g = new u.b().y0("application/id3").P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f71713h = new u.b().y0("application/x-scte35").P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f71718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f71719f;

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f71714a = str;
        this.f71715b = str2;
        this.f71716c = j11;
        this.f71717d = j12;
        this.f71718e = bArr;
    }

    @Override // p7.f0.a
    public byte[] C() {
        if (H() != null) {
            return this.f71718e;
        }
        return null;
    }

    @Override // p7.f0.a
    public u H() {
        String str = this.f71714a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f71713h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f71712g;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f71716c == aVar.f71716c && this.f71717d == aVar.f71717d && Objects.equals(this.f71714a, aVar.f71714a) && Objects.equals(this.f71715b, aVar.f71715b) && Arrays.equals(this.f71718e, aVar.f71718e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f71719f == 0) {
            String str = this.f71714a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f71715b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j11 = this.f71716c;
            int i11 = (((iHashCode + iHashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f71717d;
            this.f71719f = ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f71718e);
        }
        return this.f71719f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f71714a + ", id=" + this.f71717d + ", durationMs=" + this.f71716c + ", value=" + this.f71715b;
    }
}
