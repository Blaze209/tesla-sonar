package br0;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Set;

/* JADX INFO: loaded from: classes10.dex */
public class h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f17965b = Logger.getLogger("org.jmrtd.lds");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<p> f17966a;

    public h(InputStream inputStream) {
        b(inputStream);
    }

    public Collection<p> a() {
        return Collections.unmodifiableCollection(this.f17966a);
    }

    protected void b(InputStream inputStream) {
        this.f17966a = new HashSet();
        ASN1Set aSN1Set = (ASN1Set) new ASN1InputStream(inputStream).readObject();
        for (int i11 = 0; i11 < aSN1Set.size(); i11++) {
            try {
                p pVarC = p.c(aSN1Set.getObjectAt(i11).toASN1Primitive());
                if (pVarC != null) {
                    this.f17966a.add(pVarC);
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        h hVar = (h) obj;
        Set<p> set = this.f17966a;
        if (set == null) {
            return hVar.f17966a == null;
        }
        Set<p> set2 = hVar.f17966a;
        if (set2 == null) {
            return set == null;
        }
        return set.equals(set2);
    }

    public int hashCode() {
        return (this.f17966a.hashCode() * 7) + 61;
    }

    public String toString() {
        return "CardAccessFile [" + this.f17966a.toString() + "]";
    }
}
