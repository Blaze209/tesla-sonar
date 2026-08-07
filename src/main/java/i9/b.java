package i9;

import ou.c;
import p7.e0;
import p7.f0;
import ru.f;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class b implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76236b;

    public b(String str, String str2) {
        this.f76235a = c.f(str);
        this.f76236b = str2;
    }

    @Override // p7.f0.a
    public void I(e0.b bVar) {
        String str = this.f76235a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numO = f.o(this.f76236b);
                if (numO != null) {
                    bVar.s0(numO);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numO2 = f.o(this.f76236b);
                if (numO2 != null) {
                    bVar.r0(numO2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numO3 = f.o(this.f76236b);
                if (numO3 != null) {
                    bVar.t0(numO3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f76236b);
                break;
            case "GENRE":
                bVar.c0(this.f76236b);
                break;
            case "TITLE":
                bVar.q0(this.f76236b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f76236b);
                break;
            case "DISCNUMBER":
                Integer numO4 = f.o(this.f76236b);
                if (numO4 != null) {
                    bVar.X(numO4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f76236b);
                break;
            case "ARTIST":
                bVar.Q(this.f76236b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f76235a.equals(bVar.f76235a) && this.f76236b.equals(bVar.f76236b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f76235a.hashCode()) * 31) + this.f76236b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f76235a + "=" + this.f76236b;
    }
}
