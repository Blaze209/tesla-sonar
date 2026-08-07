package cr0;

import br0.k;
import br0.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DLSet;

/* JADX INFO: loaded from: classes10.dex */
public class c extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f59149f = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<p> f59150e;

    public c(InputStream inputStream) {
        super(110, inputStream);
    }

    @Override // br0.e
    protected void e(InputStream inputStream) {
        this.f59150e = new HashSet();
        ASN1Set aSN1Set = (ASN1Set) new ASN1InputStream(inputStream).readObject();
        for (int i11 = 0; i11 < aSN1Set.size(); i11++) {
            try {
                p pVarC = p.c(aSN1Set.getObjectAt(i11).toASN1Primitive());
                if (pVarC == null) {
                    f59149f.warning("Skipping this unsupported SecurityInfo");
                } else {
                    this.f59150e.add(pVarC);
                }
            } catch (Exception e11) {
                f59149f.log(Level.WARNING, "Skipping Security Info", (Throwable) e11);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        c cVar = (c) obj;
        Set<p> set = this.f59150e;
        if (set == null) {
            return cVar.f59150e == null;
        }
        Set<p> set2 = cVar.f59150e;
        if (set2 == null) {
            return set == null;
        }
        return set.equals(set2);
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (p pVar : this.f59150e) {
            if (pVar != null) {
                aSN1EncodableVector.add(pVar.b());
            }
        }
        outputStream.write(new DLSet(aSN1EncodableVector).getEncoded("DER"));
    }

    public Collection<p> h() {
        return this.f59150e;
    }

    public int hashCode() {
        return (this.f59150e.hashCode() * 5) + 41;
    }

    public String toString() {
        return "DG14File [" + this.f59150e.toString() + "]";
    }
}
