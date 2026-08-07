package sd0;

import android.content.Context;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.tesla.logging.TeslaLog;
import ie0.n;
import java.io.ByteArrayInputStream;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import tc0.g;
import tc0.h;
import tc0.i;
import tc0.j;
import tc0.k;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsd0/b;", "", "a", "profilebackup_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: sd0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lsd0/b$a;", "", "<init>", "()V", "Ltc0/h;", "vaultClass", "", "", "Ltc0/i;", "keyMap", "localKeyName", "Ljava/security/PrivateKey;", "localPrivateKey", "g", "(Ltc0/h;Ljava/util/Map;Ljava/lang/String;Ljava/security/PrivateKey;)Ltc0/h;", Scopes.EMAIL, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "e", "(Ljava/lang/String;Landroid/content/Context;)Ljava/security/PrivateKey;", "Ltd0/m;", "realmHelper", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ltd0/m;)Ljava/lang/String;", "rawBase64", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "unwrappedKey", "certPem", IntegerTokenConverter.CONVERTER_KEY, "([BLjava/lang/String;)[B", "derBytesHex", "h", "pem", "Ljava/security/cert/X509Certificate;", "b", "(Ljava/lang/String;)Ljava/security/cert/X509Certificate;", "Ljava/security/interfaces/RSAPublicKey;", "a", "(Ljava/lang/String;)Ljava/security/interfaces/RSAPublicKey;", "Ltc0/g;", "vault", "applicationContext", "f", "(Ltc0/g;Ltd0/m;Landroid/content/Context;)Ltc0/g;", "profilebackup_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final RSAPublicKey a(String derBytesHex) throws InvalidKeySpecException, NoSuchAlgorithmException {
            byte[] bArrF = n.f(derBytesHex);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            s.j(keyFactory, "getInstance(...)");
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(bArrF));
            if (publicKeyGeneratePublic instanceof RSAPublicKey) {
                return (RSAPublicKey) publicKeyGeneratePublic;
            }
            return null;
        }

        private final X509Certificate b(String pem) throws CertificateException {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            s.j(certificateFactory, "getInstance(...)");
            byte[] bytes = pem.getBytes(d.UTF_8);
            s.j(bytes, "getBytes(...)");
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
            return null;
        }

        private final String c(String rawBase64) {
            try {
                byte[] bArrDecode = Base64.decode(rawBase64, 0);
                s.j(bArrDecode, "decode(...)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                s.j(messageDigest, "getInstance(...)");
                messageDigest.update(bArrDecode);
                return Base64.encodeToString(messageDigest.digest(), 0);
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("VaultRewrapHelper", "Error generating key name", e11);
                return null;
            }
        }

        private final String d(String email, m realmHelper) {
            return realmHelper.h("CLOUD_PROFILE_KEY_NAME_" + email);
        }

        private final PrivateKey e(String email, Context context) throws Throwable {
            Locale ENGLISH = Locale.ENGLISH;
            s.j(ENGLISH, "ENGLISH");
            String lowerCase = ("CLOUD_PROFILE_" + email + "_KEY_PAIR").toLowerCase(ENGLISH);
            s.j(lowerCase, "toLowerCase(...)");
            KeyPair keyPairO = rb0.a.l().o(lowerCase, context.getApplicationContext());
            if (keyPairO != null) {
                return keyPairO.getPrivate();
            }
            return null;
        }

        private final h g(h vaultClass, Map<String, i> keyMap, String localKeyName, PrivateKey localPrivateKey) throws NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, CertificateException {
            byte[] bArrDoFinal;
            byte[] bArrH;
            if (keyMap.get(localKeyName) == null) {
                return null;
            }
            List<j> listF = vaultClass.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (s.f(((j) obj).getName(), localKeyName)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(2, localPrivateKey);
                bArrDoFinal = cipher.doFinal(((j) arrayList.get(0)).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String().J());
            }
            List<j> listF2 = vaultClass.f();
            ArrayList arrayList2 = new ArrayList();
            for (j jVarB : listF2) {
                i iVar = keyMap.get(jVarB.getName());
                if (iVar == null) {
                    return null;
                }
                if (!s.f(jVarB.getName(), localKeyName)) {
                    if (iVar.getType() == k.VEHICLE_CERT) {
                        Companion companion = b.INSTANCE;
                        s.h(bArrDoFinal);
                        bArrH = companion.i(bArrDoFinal, iVar.getPubkey());
                    } else {
                        Companion companion2 = b.INSTANCE;
                        s.h(bArrDoFinal);
                        bArrH = companion2.h(bArrDoFinal, iVar.getPubkey());
                    }
                    jVarB = bArrH != null ? j.b(jVarB, null, okio.k.INSTANCE.h(bArrH, 0, bArrH.length), null, null, 13, null) : null;
                }
                if (jVarB != null) {
                    arrayList2.add(jVarB);
                }
            }
            return h.b(vaultClass, null, null, null, null, arrayList2, null, 47, null);
        }

        private final byte[] h(byte[] unwrappedKey, String derBytesHex) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException {
            byte[] bArrDoFinal;
            RSAPublicKey rSAPublicKeyA = a(derBytesHex);
            if (rSAPublicKeyA == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(1, rSAPublicKeyA);
                bArrDoFinal = cipher.doFinal(unwrappedKey);
            }
            return bArrDoFinal;
        }

        private final byte[] i(byte[] unwrappedKey, String certPem) throws NoSuchPaddingException, NoSuchAlgorithmException, CertificateException {
            byte[] bArrDoFinal;
            X509Certificate x509CertificateB = b(certPem);
            if (x509CertificateB == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(1, x509CertificateB.getPublicKey());
                bArrDoFinal = cipher.doFinal(unwrappedKey);
            }
            return bArrDoFinal;
        }

        public final g f(g vault, m realmHelper, Context applicationContext) throws NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, CertificateException {
            String strD;
            PrivateKey privateKeyE;
            List<i> listB;
            s.k(vault, "vault");
            s.k(realmHelper, "realmHelper");
            s.k(applicationContext, "applicationContext");
            HashMap map = new HashMap();
            tc0.d remote_client_key = vault.getRemote_client_key();
            if (remote_client_key != null && (listB = remote_client_key.b()) != null) {
                for (i iVar : listB) {
                    String strC = b.INSTANCE.c(iVar.getPubkey());
                    if (strC != null) {
                        map.put(strC, iVar);
                    }
                }
            }
            String strH = realmHelper.h("_ACCOUNT_EMAIL");
            if (strH == null || (strD = d(strH, realmHelper)) == null || (privateKeyE = e(strH, applicationContext)) == null) {
                return null;
            }
            List<h> listC = vault.c();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                h hVarG = b.INSTANCE.g((h) it.next(), map, strD, privateKeyE);
                if (hVarG != null) {
                    arrayList.add(hVarG);
                }
            }
            privateKeyE.destroy();
            return g.b(vault, null, arrayList, null, null, null, false, null, 125, null);
        }

        private Companion() {
        }
    }
}
