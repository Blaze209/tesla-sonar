package br0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.icao.DataGroupHash;
import org.bouncycastle.asn1.icao.LDSSecurityObject;

/* JADX INFO: loaded from: classes10.dex */
public class o extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f17990f = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient SignedData f17991e;

    public o(InputStream inputStream) {
        super(119, inputStream);
        q.d(this.f17991e);
    }

    private static LDSSecurityObject j(SignedData signedData) {
        try {
            ContentInfo encapContentInfo = signedData.getEncapContentInfo();
            String id2 = encapContentInfo.getContentType().getId();
            ASN1OctetString aSN1OctetString = (ASN1OctetString) encapContentInfo.getContent();
            if (!"2.23.136.1.1.1".equals(id2) && !"1.2.528.1.1006.1.20.1".equals(id2) && !"1.3.27.1.1.1".equals(id2)) {
                f17990f.warning("SignedData does not appear to contain an LDS SOd. (content type is " + id2 + ", was expecting 2.23.136.1.1.1)");
            }
            ASN1InputStream aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(aSN1OctetString.getOctets()));
            try {
                ASN1Primitive object = aSN1InputStream.readObject();
                if (!(object instanceof ASN1Sequence)) {
                    throw new IllegalStateException("Expected ASN1Sequence, found " + object.getClass().getSimpleName());
                }
                LDSSecurityObject lDSSecurityObject = LDSSecurityObject.getInstance(object);
                if (aSN1InputStream.readObject() != null) {
                    f17990f.warning("Ignoring extra object found after LDSSecurityObject...");
                }
                aSN1InputStream.close();
                return lDSSecurityObject;
            } catch (Throwable th2) {
                aSN1InputStream.close();
                throw th2;
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Could not read security object in signedData", e11);
        }
    }

    @Override // br0.e
    protected void e(InputStream inputStream) {
        this.f17991e = q.e(inputStream);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(getClass())) {
            return Arrays.equals(getEncoded(), ((o) obj).getEncoded());
        }
        return false;
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        q.f(this.f17991e, outputStream);
    }

    public Map<Integer, byte[]> h() {
        DataGroupHash[] datagroupHash = j(this.f17991e).getDatagroupHash();
        TreeMap treeMap = new TreeMap();
        for (DataGroupHash dataGroupHash : datagroupHash) {
            treeMap.put(Integer.valueOf(dataGroupHash.getDataGroupNumber()), dataGroupHash.getDataGroupHashValue().getOctets());
        }
        return treeMap;
    }

    public int hashCode() {
        return (Arrays.hashCode(getEncoded()) * 11) + 111;
    }

    public List<X509Certificate> i() {
        return q.b(this.f17991e);
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SODFile ");
            Iterator<X509Certificate> it = i().iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getIssuerX500Principal().getName());
                sb2.append(", ");
            }
            return sb2.toString();
        } catch (Exception e11) {
            f17990f.log(Level.WARNING, "Unexpected exception", (Throwable) e11);
            return "SODFile";
        }
    }
}
