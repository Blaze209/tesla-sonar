package dr0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yq0.g f60939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f60940b;

    public g(yq0.g gVar, y yVar) {
        this.f60939a = gVar;
        this.f60940b = yVar;
    }

    public y a() {
        return this.f60940b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        yq0.g gVar2 = this.f60939a;
        if (gVar2 == null) {
            if (gVar.f60939a != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar.f60939a)) {
            return false;
        }
        y yVar = this.f60940b;
        if (yVar == null) {
            if (gVar.f60940b != null) {
                return false;
            }
        } else if (!yVar.equals(gVar.f60940b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        yq0.g gVar = this.f60939a;
        int iHashCode = (1303377669 + (gVar == null ? 0 : gVar.hashCode())) * 1234567891;
        y yVar = this.f60940b;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BACResult [bacKey: ");
        Object obj = this.f60939a;
        if (obj == null) {
            obj = "-";
        }
        sb3.append(obj);
        sb2.append(sb3.toString());
        sb2.append(", wrapper: " + this.f60940b);
        sb2.append("]");
        return sb2.toString();
    }
}
