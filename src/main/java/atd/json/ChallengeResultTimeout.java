package atd.json;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/security/cert/X509Certificate;", "Ljn0/h0;", "destroy", "(Ljava/security/cert/X509Certificate;)V", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout {
    private static int getDeviceData = 1;
    private static int getSDKReferenceNumber;

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    public static final void getSDKAppID(X509Certificate x509Certificate) {
        AuthenticationRequestParameters(new Object[]{x509Certificate}, 93345123, -93345123, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        X509Certificate x509Certificate = (X509Certificate) objArr[0];
        int i11 = getDeviceData;
        int i12 = ((i11 ^ 33) | (i11 & 33)) << 1;
        int i13 = -(((~i11) & 33) | (i11 & (-34)));
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        getSDKReferenceNumber = i15;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (x509Certificate == null) {
            int i16 = i15 & 3;
            int i17 = (i15 ^ 3) | i16;
            int i18 = (i16 & i17) + (i16 | i17);
            getDeviceData = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 42 / 0;
            }
            return null;
        }
        try {
            byte[] encoded = x509Certificate.getEncoded();
            if (encoded != null) {
                int i21 = getSDKReferenceNumber;
                int i22 = i21 & 63;
                int i23 = (i22 - (~(-(-((i21 ^ 63) | i22))))) - 1;
                getDeviceData = i23 % 128;
                int i24 = i23 % 2;
                Arrays.fill(encoded, (byte) 0);
                int i25 = getDeviceData;
                getSDKReferenceNumber = (((i25 ^ 71) - (~(-(-((i25 & 71) << 1))))) - 1) % 128;
            } else {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        } catch (CertificateEncodingException unused) {
        }
        try {
            byte[] tBSCertificate = x509Certificate.getTBSCertificate();
            if (tBSCertificate != null) {
                int i26 = getSDKReferenceNumber + 69;
                getDeviceData = i26 % 128;
                if (i26 % 2 == 0) {
                    Arrays.fill(tBSCertificate, (byte) 1);
                } else {
                    Arrays.fill(tBSCertificate, (byte) 0);
                }
                int i27 = getDeviceData;
                int i28 = i27 & 41;
                int i29 = (i27 | 41) & (~i28);
                int i31 = -(-(i28 << 1));
                getSDKReferenceNumber = ((i29 ^ i31) + ((i29 & i31) << 1)) % 128;
            } else {
                int i32 = getSDKReferenceNumber;
                int i33 = i32 & 37;
                int i34 = (i32 ^ 37) | i33;
                getDeviceData = ((i33 ^ i34) + ((i34 & i33) << 1)) % 128;
            }
        } catch (CertificateEncodingException unused2) {
        }
        byte[] signature = x509Certificate.getSignature();
        if (signature != null) {
            int i35 = getSDKReferenceNumber + 15;
            getDeviceData = i35 % 128;
            int i36 = i35 % 2;
            Arrays.fill(signature, (byte) 0);
        } else {
            int i37 = getSDKReferenceNumber;
            getDeviceData = (((i37 & 56) + (i37 | 56)) - 1) % 128;
        }
        byte[] sigAlgParams = x509Certificate.getSigAlgParams();
        if (sigAlgParams != null) {
            int i38 = getSDKReferenceNumber;
            int i39 = ((((i38 ^ 21) | (i38 & 21)) << 1) - (~(-(((~i38) & 21) | (i38 & (-22)))))) - 1;
            getDeviceData = i39 % 128;
            int i41 = i39 % 2;
            Arrays.fill(sigAlgParams, (byte) 0);
            System.currentTimeMillis();
            System.currentTimeMillis();
        } else {
            getSDKReferenceNumber = (getDeviceData + 19) % 128;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i42 = ~(((-269308391) ^ iCurrentTimeMillis) | ((-269308391) & iCurrentTimeMillis));
            int i43 = 268779906 & i42;
            int i44 = (i42 | 268779906) & (~i43);
            int i45 = -(~(((i44 & i43) | (i44 ^ i43)) * 345));
            int i46 = ((2143931112 & i45) + (i45 | 2143931112)) - 1;
            int i47 = ~((-269308391) | (~iCurrentTimeMillis));
            int i48 = -(-(((i47 & (-1380840447)) | (1380840446 & i47) | ((~i47) & (-1380840447))) * 345));
            int i49 = i46 & i48;
            int i51 = ((i48 | i46) & (~i49)) + (i49 << 1);
            int i52 = (iCurrentTimeMillis & (-268779907)) | ((-268779907) ^ iCurrentTimeMillis);
            int i53 = -(-(((i52 | (~i52)) & (~i52)) * 345));
            int i54 = (i51 & i53) + (i53 | i51);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i55 = ~iCurrentTimeMillis2;
            int i56 = ((-1622658089) & i55) | (iCurrentTimeMillis2 & 1622658088);
            int i57 = (-1622658089) & iCurrentTimeMillis2;
            int i58 = (i56 & i57) | (i56 ^ i57);
            int i59 = (i58 | (~i58)) & (~i58);
            int i61 = ((~i59) & 547719168) | (i59 & (-547719169));
            int i62 = i59 & 547719168;
            int i63 = (i62 & i61) | (i61 ^ i62);
            int i64 = (1376928830 & i55) | ((-1376928831) & iCurrentTimeMillis2);
            int i65 = 1376928830 & iCurrentTimeMillis2;
            int i66 = ~((i64 & i65) | (i64 ^ i65));
            int i67 = i63 ^ i66;
            int i68 = i63 & i66;
            int i69 = -(-(((i68 & i67) | (i67 ^ i68)) * (-754)));
            int i71 = (-699113574) & i69;
            int i72 = ((i69 | (-699113574)) & (~i71)) + (i71 << 1);
            int i73 = (-547719169) ^ iCurrentTimeMillis2;
            int i74 = (-547719169) & iCurrentTimeMillis2;
            int i75 = (i73 & i74) | (i73 ^ i74);
            int i76 = (i75 | (~i75)) & (~i75);
            int i77 = i55 & 1622658088;
            int i78 = (i55 | 1622658088) & (~i77);
            int i79 = (i78 & i77) | (i78 ^ i77);
            int i81 = ~((i79 & 1376928830) | (i79 ^ 1376928830));
            int i82 = i76 & i81;
            int i83 = (i81 | i76) & (~i82);
            int i84 = -(-(((i83 & i82) | (i83 ^ i82)) * (-754)));
            int i85 = i72 & i84;
            int i86 = ((((i72 ^ i84) | i85) << 1) - (~(-((i84 | i72) & (~i85))))) - 1;
            int i87 = ~iCurrentTimeMillis2;
            int i88 = (-1622658089) & i87;
            int i89 = (i87 | (-1622658089)) & (~i88);
            int i91 = -(-(((i89 & i88) | (i89 ^ i88)) * 754));
            int i92 = i86 | i91;
            int i93 = ((i92 << 1) - (~(-((~(i91 & i86)) & i92)))) - 1;
            Arrays.fill(keyUsage, false);
        } else {
            getDeviceData = ((-2) - ((getSDKReferenceNumber + 18) ^ (-1))) % 128;
        }
        boolean[] issuerUniqueID = x509Certificate.getIssuerUniqueID();
        if (issuerUniqueID != null) {
            int i94 = getSDKReferenceNumber;
            int i95 = i94 & 11;
            int i96 = ((i94 ^ 11) | i95) << 1;
            int i97 = -((i94 | 11) & (~i95));
            getDeviceData = ((i96 ^ i97) + ((i97 & i96) << 1)) % 128;
            Arrays.fill(issuerUniqueID, false);
            int i98 = getSDKReferenceNumber;
            int i99 = i98 & 35;
            int i100 = (i98 | 35) & (~i99);
            int i101 = -(-(i99 << 1));
            getDeviceData = (((i100 | i101) << 1) - (i100 ^ i101)) % 128;
        } else {
            getDeviceData = (getSDKReferenceNumber + 97) % 128;
        }
        boolean[] subjectUniqueID = x509Certificate.getSubjectUniqueID();
        if (subjectUniqueID == null) {
            getSDKReferenceNumber = (getDeviceData + 13) % 128;
            return null;
        }
        int i102 = getSDKReferenceNumber;
        int i103 = i102 & 53;
        getDeviceData = (((((i102 ^ 53) | i103) << 1) - (~(-((i102 | 53) & (~i103))))) - 1) % 128;
        Arrays.fill(subjectUniqueID, false);
        int i104 = getDeviceData;
        int i105 = i104 & 51;
        int i106 = (i105 - (~(-(-((i104 ^ 51) | i105))))) - 1;
        getSDKReferenceNumber = i106 % 128;
        if (i106 % 2 != 0) {
            int i107 = 9 / 0;
        }
        return null;
    }
}
