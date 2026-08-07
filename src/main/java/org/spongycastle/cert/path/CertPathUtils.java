package org.spongycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.spongycastle.cert.X509CertificateHolder;

/* JADX INFO: loaded from: classes10.dex */
class CertPathUtils {
    CertPathUtils() {
    }

    static Set getCriticalExtensionsOIDs(X509CertificateHolder[] x509CertificateHolderArr) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 != x509CertificateHolderArr.length; i11++) {
            hashSet.addAll(x509CertificateHolderArr[i11].getCriticalExtensionOIDs());
        }
        return hashSet;
    }
}
