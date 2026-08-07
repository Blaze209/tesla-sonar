package org.spongycastle.jcajce.provider.keystore.pkcs12;

import ch.qos.logback.core.joran.action.Action;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BEROctetString;
import org.spongycastle.asn1.BEROutputStream;
import org.spongycastle.asn1.DERBMPString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.GOST28147Parameters;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.AuthenticatedSafe;
import org.spongycastle.asn1.pkcs.CertBag;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.EncryptedData;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PBES2Parameters;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.AuthorityKeyIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.cms.CMSEnvelopedGenerator;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12StoreParameter;
import org.spongycastle.jcajce.spec.GOST28147ParameterSpec;
import org.spongycastle.jcajce.spec.PBKDF2KeySpec;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.JDKPKCS12StoreParameter;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private ASN1ObjectIdentifier keyAlgorithm;
    private IgnoresCaseHashtable keys;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private Hashtable localIds = new Hashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = new SecureRandom();

    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BouncyCastleProvider(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(bouncyCastleProvider, aSN1ObjectIdentifier, aSN1ObjectIdentifier);
        }
    }

    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(null, PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        public DefPKCS12KeyStore3DES() {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(null, aSN1ObjectIdentifier, aSN1ObjectIdentifier);
        }
    }

    private static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new ASN1ObjectIdentifier(CMSEnvelopedGenerator.CAST5_CBC), Integers.valueOf(128));
            map.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            map.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            map.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            map.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(map);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    private static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }
    }

    public PKCS12KeyStoreSpi(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.keys = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        this.keyAlgorithm = aSN1ObjectIdentifier;
        this.certAlgorithm = aSN1ObjectIdentifier2;
        try {
            if (provider != null) {
                this.certFact = CertificateFactory.getInstance("X.509", provider);
            } else {
                this.certFact = CertificateFactory.getInstance("X.509");
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("can't create cert factory - " + e11.toString());
        }
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i11, char[] cArr, boolean z11, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i11);
        Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        macCreateMac.init(new PKCS12Key(cArr, z11), pBEParameterSpec);
        macCreateMac.update(bArr2);
        return macCreateMac.doFinal();
    }

    private Cipher createCipher(int i11, char[] cArr, AlgorithmIdentifier algorithmIdentifier) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        SecretKey secretKeyGenerateSecret = pBKDF2Params.isDefaultPrf() ? secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2))) : secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        Cipher cipher = Cipher.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            cipher.init(i11, secretKeyGenerateSecret, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
            return cipher;
        }
        GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
        cipher.init(i11, secretKeyGenerateSecret, new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
        return cipher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        try {
            return new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01ac A[Catch: CertificateEncodingException -> 0x0197, TryCatch #1 {CertificateEncodingException -> 0x0197, blocks: (B:28:0x015a, B:30:0x017d, B:32:0x018a, B:38:0x019c, B:39:0x01a4, B:41:0x01ac, B:42:0x01b7, B:43:0x01bc, B:45:0x01c2, B:48:0x01f1, B:49:0x0232), top: B:127:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c2 A[Catch: CertificateEncodingException -> 0x0197, LOOP:3: B:43:0x01bc->B:45:0x01c2, LOOP_END, TryCatch #1 {CertificateEncodingException -> 0x0197, blocks: (B:28:0x015a, B:30:0x017d, B:32:0x018a, B:38:0x019c, B:39:0x01a4, B:41:0x01ac, B:42:0x01b7, B:43:0x01bc, B:45:0x01c2, B:48:0x01f1, B:49:0x0232), top: B:127:0x015a }] */
    /* JADX WARN: Multi-variable type inference failed */
    private void doStore(OutputStream outputStream, char[] cArr, boolean z11) throws IOException {
        boolean z12;
        AlgorithmIdentifier algorithmIdentifier;
        boolean z13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        Enumeration bagAttributeKeys;
        boolean z14;
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str = (String) enumerationKeys.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str);
            PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, 1024);
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(this.keyAlgorithm, pKCS12PBEParams.toASN1Primitive()), wrapKey(this.keyAlgorithm.getId(), privateKey, pKCS12PBEParams, cArr));
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            if (privateKey instanceof PKCS12BagAttributeCarrier) {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                DERBMPString dERBMPString = (DERBMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2);
                if (dERBMPString == null || !dERBMPString.getString().equals(str)) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier2, new DERBMPString(str));
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                if (pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier3) == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier3, createSubjectKeyId(engineGetCertificate(str).getPublicKey()));
                }
                Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                z14 = false;
                while (bagAttributeKeys2.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                    ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                    aSN1EncodableVector3.add(aSN1ObjectIdentifier4);
                    aSN1EncodableVector3.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier4)));
                    aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector3));
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                Certificate certificateEngineGetCertificate = engineGetCertificate(str);
                aSN1EncodableVector4.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector4.add(new DERSet(createSubjectKeyId(certificateEngineGetCertificate.getPublicKey())));
                aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector4));
                ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                aSN1EncodableVector5.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector5.add(new DERSet(new DERBMPString(str)));
                aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector5));
            }
            aSN1EncodableVector.add(new SafeBag(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector2)));
        }
        BEROctetString bEROctetString = new BEROctetString(new DERSequence(aSN1EncodableVector).getEncoded("DER"));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, 1024).toASN1Primitive());
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            try {
                String str2 = (String) enumerationKeys2.nextElement();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str2);
                CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificateEngineGetCertificate2.getEncoded()));
                ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
                if (certificateEngineGetCertificate2 instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) certificateEngineGetCertificate2;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                    DERBMPString dERBMPString2 = (DERBMPString) pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier5);
                    if (dERBMPString2 != null) {
                        algorithmIdentifier = algorithmIdentifier2;
                        if (!dERBMPString2.getString().equals(str2)) {
                        }
                        aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                        if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier) == null) {
                            pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier, createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey()));
                        }
                        bagAttributeKeys = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                        z13 = false;
                        while (bagAttributeKeys.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                            Enumeration enumeration = bagAttributeKeys;
                            ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                            aSN1EncodableVector8.add(aSN1ObjectIdentifier6);
                            aSN1EncodableVector8.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier6)));
                            aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector8));
                            bagAttributeKeys = enumeration;
                            z13 = true;
                        }
                    } else {
                        algorithmIdentifier = algorithmIdentifier2;
                    }
                    pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier5, new DERBMPString(str2));
                    aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                    if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier) == null) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier, createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey()));
                    }
                    bagAttributeKeys = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                    z13 = false;
                    while (bagAttributeKeys.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys;
                        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
                        aSN1EncodableVector9.add(aSN1ObjectIdentifier7);
                        aSN1EncodableVector9.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier7)));
                        aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector9));
                        bagAttributeKeys = enumeration2;
                        z13 = true;
                    }
                } else {
                    algorithmIdentifier = algorithmIdentifier2;
                    z13 = false;
                }
                if (!z13) {
                    ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                    aSN1EncodableVector10.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                    aSN1EncodableVector10.add(new DERSet(createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey())));
                    aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector10));
                    ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                    aSN1EncodableVector11.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                    aSN1EncodableVector11.add(new DERSet(new DERBMPString(str2)));
                    aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector11));
                }
                aSN1EncodableVector6.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector7)));
                hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
                algorithmIdentifier2 = algorithmIdentifier;
            } catch (CertificateEncodingException e11) {
                throw new IOException("Error encoding certificate: " + e11.toString());
            }
        }
        AlgorithmIdentifier algorithmIdentifier3 = algorithmIdentifier2;
        Enumeration enumerationKeys3 = this.certs.keys();
        while (enumerationKeys3.hasMoreElements()) {
            try {
                String str3 = (String) enumerationKeys3.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str3);
                if (this.keys.get(str3) == null) {
                    CertBag certBag2 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                    if (certificate instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) certificate;
                        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                        DERBMPString dERBMPString3 = (DERBMPString) pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier8);
                        if (dERBMPString3 == null || !dERBMPString3.getString().equals(str3)) {
                            pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier8, new DERBMPString(str3));
                        }
                        Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                        z12 = false;
                        while (bagAttributeKeys3.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            enumerationKeys3 = enumerationKeys3;
                            if (!aSN1ObjectIdentifier9.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                                aSN1EncodableVector13.add(aSN1ObjectIdentifier9);
                                aSN1EncodableVector13.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier9)));
                                aSN1EncodableVector12.add(new DERSequence(aSN1EncodableVector13));
                                z12 = true;
                            }
                        }
                    } else {
                        z12 = false;
                    }
                    Enumeration enumeration3 = enumerationKeys3;
                    if (!z12) {
                        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
                        aSN1EncodableVector14.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                        aSN1EncodableVector14.add(new DERSet(new DERBMPString(str3)));
                        aSN1EncodableVector12.add(new DERSequence(aSN1EncodableVector14));
                    }
                    aSN1EncodableVector6.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector12)));
                    hashtable.put(certificate, certificate);
                    enumerationKeys3 = enumeration3;
                }
            } catch (CertificateEncodingException e12) {
                throw new IOException("Error encoding certificate: " + e12.toString());
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration enumerationKeys4 = this.chainCerts.keys();
        while (enumerationKeys4.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) enumerationKeys4.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    CertBag certBag3 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate2.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
                    if (certificate2 instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) certificate2;
                        Enumeration bagAttributeKeys4 = pKCS12BagAttributeCarrier4.getBagAttributeKeys();
                        while (bagAttributeKeys4.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = (ASN1ObjectIdentifier) bagAttributeKeys4.nextElement();
                            if (!aSN1ObjectIdentifier10.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
                                aSN1EncodableVector16.add(aSN1ObjectIdentifier10);
                                aSN1EncodableVector16.add(new DERSet(pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier10)));
                                aSN1EncodableVector15.add(new DERSequence(aSN1EncodableVector16));
                            }
                        }
                    }
                    aSN1EncodableVector6.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag3.toASN1Primitive(), new DERSet(aSN1EncodableVector15)));
                }
            } catch (CertificateEncodingException e13) {
                throw new IOException("Error encoding certificate: " + e13.toString());
            }
        }
        byte[] bArrCryptData = cryptData(true, algorithmIdentifier3, cArr, false, new DERSequence(aSN1EncodableVector6).getEncoded("DER"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = PKCSObjectIdentifiers.data;
        AuthenticatedSafe authenticatedSafe = new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(aSN1ObjectIdentifier11, bEROctetString), new ContentInfo(PKCSObjectIdentifiers.encryptedData, new EncryptedData(aSN1ObjectIdentifier11, algorithmIdentifier3, new BEROctetString(bArrCryptData)).toASN1Primitive())});
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        (z11 ? new DEROutputStream(byteArrayOutputStream) : new BEROutputStream(byteArrayOutputStream)).writeObject(authenticatedSafe);
        ContentInfo contentInfo = new ContentInfo(aSN1ObjectIdentifier11, new BEROctetString(byteArrayOutputStream.toByteArray()));
        byte[] bArr3 = new byte[20];
        this.random.nextBytes(bArr3);
        byte[] octets = ((ASN1OctetString) contentInfo.getContent()).getOctets();
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X509ObjectIdentifiers.id_SHA1;
            (z11 ? new DEROutputStream(outputStream) : new BEROutputStream(outputStream)).writeObject(new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier12, DERNull.INSTANCE), calculatePbeMac(aSN1ObjectIdentifier12, bArr3, 1024, cArr, false, octets)), bArr3, 1024)));
        } catch (Exception e14) {
            throw new IOException("error constructing MAC: " + e14.toString());
        }
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        Digest digestCreateSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[digestCreateSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        digestCreateSHA1.update(bytes, 0, bytes.length);
        digestCreateSHA1.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
            for (int i11 = 0; i11 != certificateArrEngineGetCertificateChain.length; i11++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i11]);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
        }
        return hashSet;
    }

    protected byte[] cryptData(boolean z11, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z12, byte[] bArr) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i11 = z11 ? 1 : 2;
        if (!algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            if (!algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                throw new IOException("unknown PBE algorithm: " + algorithm);
            }
            try {
                return createCipher(i11, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (Exception e11) {
                throw new IOException("exception decrypting data - " + e11.toString());
            }
        }
        PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
        new PBEKeySpec(cArr);
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z12);
            Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
            cipherCreateCipher.init(i11, pKCS12Key, pBEParameterSpec);
            return cipherCreateCipher.doFinal(bArr);
        } catch (Exception e12) {
            throw new IOException("exception decrypting data - " + e12.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate != null) {
                this.chainCerts.remove(new CertId(certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        return str2 != null ? (Certificate) this.keyCerts.get(str2) : (Certificate) this.keyCerts.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements2 = this.keyCerts.elements();
        Enumeration enumerationKeys2 = this.keyCerts.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate certificate;
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        Certificate[] certificateArr = null;
        if (!engineIsKeyEntry(str)) {
            return null;
        }
        Certificate certificateEngineGetCertificate = engineGetCertificate(str);
        if (certificateEngineGetCertificate != null) {
            Vector vector = new Vector();
            while (certificateEngineGetCertificate != null) {
                X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                if (extensionValue != null) {
                    try {
                        AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(new ASN1InputStream(((ASN1OctetString) new ASN1InputStream(extensionValue).readObject()).getOctets()).readObject());
                        if (authorityKeyIdentifier.getKeyIdentifier() != null) {
                            certificate = (Certificate) this.chainCerts.get(new CertId(authorityKeyIdentifier.getKeyIdentifier()));
                        } else {
                            certificate = null;
                        }
                    } catch (IOException e11) {
                        throw new RuntimeException(e11.toString());
                    }
                } else {
                    certificate = null;
                }
                if (certificate == null) {
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                        Enumeration enumerationKeys = this.chainCerts.keys();
                        while (enumerationKeys.hasMoreElements()) {
                            X509Certificate x509Certificate2 = (X509Certificate) this.chainCerts.get(enumerationKeys.nextElement());
                            if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    certificate = x509Certificate2;
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!vector.contains(certificateEngineGetCertificate)) {
                    vector.addElement(certificateEngineGetCertificate);
                    if (certificate != certificateEngineGetCertificate) {
                        certificateEngineGetCertificate = certificate;
                    }
                }
                certificateEngineGetCertificate = null;
            }
            int size = vector.size();
            certificateArr = new Certificate[size];
            for (int i11 = 0; i11 != size; i11++) {
                certificateArr[i11] = (Certificate) vector.elementAt(i11);
            }
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:104:0x02de  */
    /* JADX WARN: Code duplicated, block: B:106:0x0302  */
    /* JADX WARN: Code duplicated, block: B:108:0x030f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0320  */
    /* JADX WARN: Code duplicated, block: B:114:0x0324  */
    /* JADX WARN: Code duplicated, block: B:117:0x032d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0339  */
    /* JADX WARN: Code duplicated, block: B:120:0x0341  */
    /* JADX WARN: Code duplicated, block: B:124:0x035e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0365  */
    /* JADX WARN: Code duplicated, block: B:126:0x036c  */
    /* JADX WARN: Code duplicated, block: B:128:0x037c  */
    /* JADX WARN: Code duplicated, block: B:131:0x039b  */
    /* JADX WARN: Code duplicated, block: B:133:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:140:0x03db  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x040f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0415  */
    /* JADX WARN: Code duplicated, block: B:152:0x041b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0444  */
    /* JADX WARN: Code duplicated, block: B:156:0x048b  */
    /* JADX WARN: Code duplicated, block: B:160:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:165:0x04de  */
    /* JADX WARN: Code duplicated, block: B:168:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x0518  */
    /* JADX WARN: Code duplicated, block: B:174:0x0521  */
    /* JADX WARN: Code duplicated, block: B:179:0x0532  */
    /* JADX WARN: Code duplicated, block: B:187:0x0553  */
    /* JADX WARN: Code duplicated, block: B:190:0x0566  */
    /* JADX WARN: Code duplicated, block: B:192:0x056e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0592 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x0594  */
    /* JADX WARN: Code duplicated, block: B:196:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x053d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01db  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0204  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0211  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:91:0x0251  */
    /* JADX WARN: Code duplicated, block: B:93:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x028e  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ab  */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x041b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x0444, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0223, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        char[] cArr2;
        boolean z11;
        boolean z12;
        int i11;
        SafeBag safeBag;
        CertBag certBag;
        Certificate certificateGenerateCertificate;
        ASN1OctetString aSN1OctetString;
        String string;
        Enumeration objects;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        ASN1Set aSN1Set;
        ASN1Primitive aSN1Primitive;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier;
        ASN1Encodable bagAttribute;
        ContentInfo[] contentInfo;
        int i12;
        boolean z13;
        boolean z14;
        ASN1Sequence aSN1Sequence;
        int i13;
        SafeBag safeBag2;
        ASN1Sequence aSN1Sequence2;
        int i14;
        PrivateKey privateKey;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2;
        Enumeration objects2;
        ASN1OctetString aSN1OctetString2;
        String string2;
        String str;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        ASN1Set aSN1Set2;
        ASN1Primitive aSN1Primitive2;
        ASN1Encodable bagAttribute2;
        PrivateKey privateKeyUnwrapKey;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3;
        Enumeration objects3;
        ASN1OctetString aSN1OctetString3;
        String string3;
        String str2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3;
        ASN1Set aSN1Set3;
        ASN1Primitive aSN1Primitive3;
        ASN1Encodable bagAttribute3;
        ASN1Sequence aSN1Sequence3;
        int i15;
        SafeBag safeBag3;
        boolean z15;
        PrivateKey privateKeyUnwrapKey2;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4;
        String str3;
        ASN1OctetString aSN1OctetString4;
        String str4;
        Enumeration objects4;
        String str5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4;
        ASN1Set aSN1Set4;
        ASN1Primitive aSN1Primitive4;
        ASN1Encodable bagAttribute4;
        if (inputStream == null) {
            return;
        }
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        if (bufferedInputStream.read() != 48) {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        bufferedInputStream.reset();
        Pfx pfx = Pfx.getInstance((ASN1Sequence) new ASN1InputStream(bufferedInputStream).readObject());
        ContentInfo authSafe = pfx.getAuthSafe();
        Vector vector = new Vector();
        int i16 = 0;
        if (pfx.getMacData() != null) {
            MacData macData = pfx.getMacData();
            DigestInfo mac = macData.getMac();
            AlgorithmIdentifier algorithmId = mac.getAlgorithmId();
            byte[] salt = macData.getSalt();
            int iIntValue = macData.getIterationCount().intValue();
            byte[] octets = ((ASN1OctetString) authSafe.getContent()).getOctets();
            try {
                cArr2 = cArr;
                try {
                    byte[] bArrCalculatePbeMac = calculatePbeMac(algorithmId.getAlgorithm(), salt, iIntValue, cArr2, false, octets);
                    byte[] digest = mac.getDigest();
                    if (!Arrays.constantTimeAreEqual(bArrCalculatePbeMac, digest)) {
                        if (cArr2.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        this = this;
                        if (!Arrays.constantTimeAreEqual(this.calculatePbeMac(algorithmId.getAlgorithm(), salt, iIntValue, cArr2, true, octets), digest)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        z11 = true;
                    }
                    this.keys = new IgnoresCaseHashtable();
                    this.localIds = new Hashtable();
                    if (authSafe.getContentType().equals(PKCSObjectIdentifiers.data)) {
                        contentInfo = AuthenticatedSafe.getInstance(new ASN1InputStream(((ASN1OctetString) authSafe.getContent()).getOctets()).readObject()).getContentInfo();
                        i12 = 0;
                        z12 = false;
                        while (i12 != contentInfo.length) {
                            if (contentInfo[i12].getContentType().equals(PKCSObjectIdentifiers.data)) {
                                aSN1Sequence3 = (ASN1Sequence) new ASN1InputStream(((ASN1OctetString) contentInfo[i12].getContent()).getOctets()).readObject();
                                i15 = i16;
                                while (i15 != aSN1Sequence3.size()) {
                                    safeBag3 = SafeBag.getInstance(aSN1Sequence3.getObjectAt(i15));
                                    if (safeBag3.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag3.getBagValue());
                                        privateKeyUnwrapKey2 = this.unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr2, z11);
                                        pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey2;
                                        if (safeBag3.getBagAttributes() != null) {
                                            objects4 = safeBag3.getBagAttributes().getObjects();
                                            str5 = null;
                                            aSN1OctetString4 = null;
                                            while (objects4.hasMoreElements()) {
                                                ASN1Sequence aSN1Sequence4 = (ASN1Sequence) objects4.nextElement();
                                                aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) aSN1Sequence4.getObjectAt(i16);
                                                boolean z16 = z11;
                                                aSN1Set4 = (ASN1Set) aSN1Sequence4.getObjectAt(1);
                                                if (aSN1Set4.size() > 0) {
                                                    aSN1Primitive4 = (ASN1Primitive) aSN1Set4.getObjectAt(0);
                                                    bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                                    if (bagAttribute4 != null) {
                                                        pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                                    } else if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                                        throw new IOException("attempt to add existing attribute with different value");
                                                    }
                                                } else {
                                                    aSN1Primitive4 = null;
                                                }
                                                if (aSN1ObjectIdentifier4.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                    String string4 = ((DERBMPString) aSN1Primitive4).getString();
                                                    this.keys.put(string4, privateKeyUnwrapKey2);
                                                    str5 = string4;
                                                } else if (aSN1ObjectIdentifier4.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                    aSN1OctetString4 = (ASN1OctetString) aSN1Primitive4;
                                                }
                                                z11 = z16;
                                                i16 = 0;
                                            }
                                            z15 = z11;
                                            str3 = str5;
                                        } else {
                                            z15 = z11;
                                            str3 = null;
                                            aSN1OctetString4 = null;
                                        }
                                        if (aSN1OctetString4 != null) {
                                            str4 = new String(Hex.encode(aSN1OctetString4.getOctets()));
                                            if (str3 == null) {
                                                this.keys.put(str4, privateKeyUnwrapKey2);
                                            } else {
                                                this.localIds.put(str3, str4);
                                            }
                                        } else {
                                            this.keys.put("unmarked", privateKeyUnwrapKey2);
                                            z12 = true;
                                        }
                                    } else {
                                        z15 = z11;
                                        if (safeBag3.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                            vector.addElement(safeBag3);
                                        } else {
                                            System.out.println("extra in data " + safeBag3.getBagId());
                                            System.out.println(ASN1Dump.dumpAsString(safeBag3));
                                        }
                                    }
                                    i15++;
                                    z11 = z15;
                                    i16 = 0;
                                }
                                z14 = z11;
                            } else {
                                z13 = z11;
                                if (contentInfo[i12].getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
                                    EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i12].getContent());
                                    char[] cArr3 = cArr2;
                                    z14 = z13;
                                    cArr2 = cArr3;
                                    aSN1Sequence = (ASN1Sequence) ASN1Primitive.fromByteArray(this.cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr3, z13, encryptedData.getContent().getOctets()));
                                    i13 = 0;
                                    while (i13 != aSN1Sequence.size()) {
                                        safeBag2 = SafeBag.getInstance(aSN1Sequence.getObjectAt(i13));
                                        if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                            vector.addElement(safeBag2);
                                            aSN1Sequence2 = aSN1Sequence;
                                            i14 = i13;
                                        } else if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                            privateKeyUnwrapKey = this.unwrapKey(encryptedPrivateKeyInfo2.getEncryptionAlgorithm(), encryptedPrivateKeyInfo2.getEncryptedData(), cArr2, z14);
                                            pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey;
                                            objects3 = safeBag2.getBagAttributes().getObjects();
                                            aSN1OctetString3 = null;
                                            string3 = null;
                                            while (objects3.hasMoreElements()) {
                                                ASN1Sequence aSN1Sequence5 = aSN1Sequence;
                                                ASN1Sequence aSN1Sequence6 = (ASN1Sequence) objects3.nextElement();
                                                int i17 = i13;
                                                aSN1ObjectIdentifier3 = (ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0);
                                                Enumeration enumeration = objects3;
                                                aSN1Set3 = (ASN1Set) aSN1Sequence6.getObjectAt(1);
                                                if (aSN1Set3.size() > 0) {
                                                    aSN1Primitive3 = (ASN1Primitive) aSN1Set3.getObjectAt(0);
                                                    bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                                    if (bagAttribute3 != null) {
                                                        pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                                    } else if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                                        throw new IOException("attempt to add existing attribute with different value");
                                                    }
                                                } else {
                                                    aSN1Primitive3 = null;
                                                }
                                                if (aSN1ObjectIdentifier3.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                    string3 = ((DERBMPString) aSN1Primitive3).getString();
                                                    this.keys.put(string3, privateKeyUnwrapKey);
                                                } else if (aSN1ObjectIdentifier3.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                    aSN1OctetString3 = (ASN1OctetString) aSN1Primitive3;
                                                }
                                                i13 = i17;
                                                aSN1Sequence = aSN1Sequence5;
                                                objects3 = enumeration;
                                            }
                                            aSN1Sequence2 = aSN1Sequence;
                                            i14 = i13;
                                            str2 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                            if (string3 == null) {
                                                this.keys.put(str2, privateKeyUnwrapKey);
                                            } else {
                                                this.localIds.put(string3, str2);
                                            }
                                        } else {
                                            aSN1Sequence2 = aSN1Sequence;
                                            i14 = i13;
                                            if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.keyBag)) {
                                                privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                                pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) privateKey;
                                                objects2 = safeBag2.getBagAttributes().getObjects();
                                                aSN1OctetString2 = null;
                                                string2 = null;
                                                while (objects2.hasMoreElements()) {
                                                    ASN1Sequence aSN1Sequence7 = ASN1Sequence.getInstance(objects2.nextElement());
                                                    aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence7.getObjectAt(0));
                                                    Enumeration enumeration2 = objects2;
                                                    aSN1Set2 = ASN1Set.getInstance(aSN1Sequence7.getObjectAt(1));
                                                    if (aSN1Set2.size() > 0) {
                                                        aSN1Primitive2 = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                                        bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                                        if (bagAttribute2 != null) {
                                                            pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive2);
                                                        } else if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive2)) {
                                                            throw new IOException("attempt to add existing attribute with different value");
                                                        }
                                                        if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                            string2 = ((DERBMPString) aSN1Primitive2).getString();
                                                            this.keys.put(string2, privateKey);
                                                        } else if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                            aSN1OctetString2 = (ASN1OctetString) aSN1Primitive2;
                                                        }
                                                    }
                                                    objects2 = enumeration2;
                                                }
                                                str = new String(Hex.encode(aSN1OctetString2.getOctets()));
                                                if (string2 == null) {
                                                    this.keys.put(str, privateKey);
                                                } else {
                                                    this.localIds.put(string2, str);
                                                }
                                            } else {
                                                System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                                System.out.println(ASN1Dump.dumpAsString(safeBag2));
                                            }
                                        }
                                        i13 = i14 + 1;
                                        aSN1Sequence = aSN1Sequence2;
                                    }
                                } else {
                                    z14 = z13;
                                    System.out.println("extra " + contentInfo[i12].getContentType().getId());
                                    System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i12].getContent()));
                                }
                            }
                            i12++;
                            z11 = z14;
                            i16 = 0;
                        }
                    } else {
                        z12 = false;
                    }
                    this.certs = new IgnoresCaseHashtable();
                    this.chainCerts = new Hashtable();
                    this.keyCerts = new Hashtable();
                    for (i11 = 0; i11 != vector.size(); i11++) {
                        safeBag = (SafeBag) vector.elementAt(i11);
                        certBag = CertBag.getInstance(safeBag.getBagValue());
                        if (certBag.getCertId().equals(PKCSObjectIdentifiers.x509Certificate)) {
                            throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
                        }
                        try {
                            certificateGenerateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                            if (safeBag.getBagAttributes() != null) {
                                objects = safeBag.getBagAttributes().getObjects();
                                aSN1OctetString = null;
                                string = null;
                                while (objects.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence8 = ASN1Sequence.getInstance(objects.nextElement());
                                    aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence8.getObjectAt(0));
                                    aSN1Set = ASN1Set.getInstance(aSN1Sequence8.getObjectAt(1));
                                    if (aSN1Set.size() > 0) {
                                        aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                        if (certificateGenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                                            pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificateGenerateCertificate;
                                            bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                            if (bagAttribute != null) {
                                                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                                            } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                        }
                                        if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            string = ((DERBMPString) aSN1Primitive).getString();
                                        } else if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                            aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                                        }
                                    }
                                }
                            } else {
                                aSN1OctetString = null;
                                string = null;
                            }
                            this.chainCerts.put(this.new CertId(certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                            if (z12) {
                                if (aSN1OctetString != null) {
                                    this.keyCerts.put(new String(Hex.encode(aSN1OctetString.getOctets())), certificateGenerateCertificate);
                                }
                                if (string != null) {
                                    this.certs.put(string, certificateGenerateCertificate);
                                }
                            } else if (this.keyCerts.isEmpty()) {
                                String str6 = new String(Hex.encode(this.createSubjectKeyId(certificateGenerateCertificate.getPublicKey()).getKeyIdentifier()));
                                this.keyCerts.put(str6, certificateGenerateCertificate);
                                IgnoresCaseHashtable ignoresCaseHashtable = this.keys;
                                ignoresCaseHashtable.put(str6, ignoresCaseHashtable.remove("unmarked"));
                            }
                        } catch (Exception e11) {
                            throw new RuntimeException(e11.toString());
                        }
                    }
                } catch (IOException e12) {
                    throw e12;
                } catch (Exception e13) {
                    e = e13;
                    throw new IOException("error constructing MAC: " + e.toString());
                }
            } catch (IOException e14) {
                throw e14;
            } catch (Exception e15) {
                e = e15;
            }
        } else {
            cArr2 = cArr;
        }
        z11 = false;
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new Hashtable();
        if (authSafe.getContentType().equals(PKCSObjectIdentifiers.data)) {
            contentInfo = AuthenticatedSafe.getInstance(new ASN1InputStream(((ASN1OctetString) authSafe.getContent()).getOctets()).readObject()).getContentInfo();
            i12 = 0;
            z12 = false;
            while (i12 != contentInfo.length) {
                if (contentInfo[i12].getContentType().equals(PKCSObjectIdentifiers.data)) {
                    aSN1Sequence3 = (ASN1Sequence) new ASN1InputStream(((ASN1OctetString) contentInfo[i12].getContent()).getOctets()).readObject();
                    i15 = i16;
                    while (i15 != aSN1Sequence3.size()) {
                        safeBag3 = SafeBag.getInstance(aSN1Sequence3.getObjectAt(i15));
                        if (safeBag3.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo3 = EncryptedPrivateKeyInfo.getInstance(safeBag3.getBagValue());
                            privateKeyUnwrapKey2 = this.unwrapKey(encryptedPrivateKeyInfo3.getEncryptionAlgorithm(), encryptedPrivateKeyInfo3.getEncryptedData(), cArr2, z11);
                            pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey2;
                            if (safeBag3.getBagAttributes() != null) {
                                objects4 = safeBag3.getBagAttributes().getObjects();
                                str5 = null;
                                aSN1OctetString4 = null;
                                while (objects4.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence9 = (ASN1Sequence) objects4.nextElement();
                                    aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) aSN1Sequence9.getObjectAt(i16);
                                    boolean z17 = z11;
                                    aSN1Set4 = (ASN1Set) aSN1Sequence9.getObjectAt(1);
                                    if (aSN1Set4.size() > 0) {
                                        aSN1Primitive4 = (ASN1Primitive) aSN1Set4.getObjectAt(0);
                                        bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                        if (bagAttribute4 != null) {
                                            pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                        } else if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        aSN1Primitive4 = null;
                                    }
                                    if (aSN1ObjectIdentifier4.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                        String string5 = ((DERBMPString) aSN1Primitive4).getString();
                                        this.keys.put(string5, privateKeyUnwrapKey2);
                                        str5 = string5;
                                    } else if (aSN1ObjectIdentifier4.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                        aSN1OctetString4 = (ASN1OctetString) aSN1Primitive4;
                                    }
                                    z11 = z17;
                                    i16 = 0;
                                }
                                z15 = z11;
                                str3 = str5;
                            } else {
                                z15 = z11;
                                str3 = null;
                                aSN1OctetString4 = null;
                            }
                            if (aSN1OctetString4 != null) {
                                str4 = new String(Hex.encode(aSN1OctetString4.getOctets()));
                                if (str3 == null) {
                                    this.keys.put(str4, privateKeyUnwrapKey2);
                                } else {
                                    this.localIds.put(str3, str4);
                                }
                            } else {
                                this.keys.put("unmarked", privateKeyUnwrapKey2);
                                z12 = true;
                            }
                        } else {
                            z15 = z11;
                            if (safeBag3.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag3);
                            } else {
                                System.out.println("extra in data " + safeBag3.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag3));
                            }
                        }
                        i15++;
                        z11 = z15;
                        i16 = 0;
                    }
                    z14 = z11;
                } else {
                    z13 = z11;
                    if (contentInfo[i12].getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
                        EncryptedData encryptedData2 = EncryptedData.getInstance(contentInfo[i12].getContent());
                        char[] cArr4 = cArr2;
                        z14 = z13;
                        cArr2 = cArr4;
                        aSN1Sequence = (ASN1Sequence) ASN1Primitive.fromByteArray(this.cryptData(false, encryptedData2.getEncryptionAlgorithm(), cArr4, z13, encryptedData2.getContent().getOctets()));
                        i13 = 0;
                        while (i13 != aSN1Sequence.size()) {
                            safeBag2 = SafeBag.getInstance(aSN1Sequence.getObjectAt(i13));
                            if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag2);
                                aSN1Sequence2 = aSN1Sequence;
                                i14 = i13;
                            } else if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo4 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                privateKeyUnwrapKey = this.unwrapKey(encryptedPrivateKeyInfo4.getEncryptionAlgorithm(), encryptedPrivateKeyInfo4.getEncryptedData(), cArr2, z14);
                                pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey;
                                objects3 = safeBag2.getBagAttributes().getObjects();
                                aSN1OctetString3 = null;
                                string3 = null;
                                while (objects3.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence10 = aSN1Sequence;
                                    ASN1Sequence aSN1Sequence11 = (ASN1Sequence) objects3.nextElement();
                                    int i18 = i13;
                                    aSN1ObjectIdentifier3 = (ASN1ObjectIdentifier) aSN1Sequence11.getObjectAt(0);
                                    Enumeration enumeration3 = objects3;
                                    aSN1Set3 = (ASN1Set) aSN1Sequence11.getObjectAt(1);
                                    if (aSN1Set3.size() > 0) {
                                        aSN1Primitive3 = (ASN1Primitive) aSN1Set3.getObjectAt(0);
                                        bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                        if (bagAttribute3 != null) {
                                            pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                        } else if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        aSN1Primitive3 = null;
                                    }
                                    if (aSN1ObjectIdentifier3.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                        string3 = ((DERBMPString) aSN1Primitive3).getString();
                                        this.keys.put(string3, privateKeyUnwrapKey);
                                    } else if (aSN1ObjectIdentifier3.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                        aSN1OctetString3 = (ASN1OctetString) aSN1Primitive3;
                                    }
                                    i13 = i18;
                                    aSN1Sequence = aSN1Sequence10;
                                    objects3 = enumeration3;
                                }
                                aSN1Sequence2 = aSN1Sequence;
                                i14 = i13;
                                str2 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                if (string3 == null) {
                                    this.keys.put(str2, privateKeyUnwrapKey);
                                } else {
                                    this.localIds.put(string3, str2);
                                }
                            } else {
                                aSN1Sequence2 = aSN1Sequence;
                                i14 = i13;
                                if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.keyBag)) {
                                    privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                    pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) privateKey;
                                    objects2 = safeBag2.getBagAttributes().getObjects();
                                    aSN1OctetString2 = null;
                                    string2 = null;
                                    while (objects2.hasMoreElements()) {
                                        ASN1Sequence aSN1Sequence12 = ASN1Sequence.getInstance(objects2.nextElement());
                                        aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence12.getObjectAt(0));
                                        Enumeration enumeration4 = objects2;
                                        aSN1Set2 = ASN1Set.getInstance(aSN1Sequence12.getObjectAt(1));
                                        if (aSN1Set2.size() > 0) {
                                            aSN1Primitive2 = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                            bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                            if (bagAttribute2 != null) {
                                                pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive2);
                                            } else if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive2)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                            if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                string2 = ((DERBMPString) aSN1Primitive2).getString();
                                                this.keys.put(string2, privateKey);
                                            } else if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                aSN1OctetString2 = (ASN1OctetString) aSN1Primitive2;
                                            }
                                        }
                                        objects2 = enumeration4;
                                    }
                                    str = new String(Hex.encode(aSN1OctetString2.getOctets()));
                                    if (string2 == null) {
                                        this.keys.put(str, privateKey);
                                    } else {
                                        this.localIds.put(string2, str);
                                    }
                                } else {
                                    System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                    System.out.println(ASN1Dump.dumpAsString(safeBag2));
                                }
                            }
                            i13 = i14 + 1;
                            aSN1Sequence = aSN1Sequence2;
                        }
                    } else {
                        z14 = z13;
                        System.out.println("extra " + contentInfo[i12].getContentType().getId());
                        System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i12].getContent()));
                    }
                }
                i12++;
                z11 = z14;
                i16 = 0;
            }
        } else {
            z12 = false;
        }
        this.certs = new IgnoresCaseHashtable();
        this.chainCerts = new Hashtable();
        this.keyCerts = new Hashtable();
        while (i11 != vector.size()) {
            safeBag = (SafeBag) vector.elementAt(i11);
            certBag = CertBag.getInstance(safeBag.getBagValue());
            if (certBag.getCertId().equals(PKCSObjectIdentifiers.x509Certificate)) {
                throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
            }
            certificateGenerateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
            if (safeBag.getBagAttributes() != null) {
                objects = safeBag.getBagAttributes().getObjects();
                aSN1OctetString = null;
                string = null;
                while (objects.hasMoreElements()) {
                    ASN1Sequence aSN1Sequence13 = ASN1Sequence.getInstance(objects.nextElement());
                    aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence13.getObjectAt(0));
                    aSN1Set = ASN1Set.getInstance(aSN1Sequence13.getObjectAt(1));
                    if (aSN1Set.size() > 0) {
                        aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                        if (certificateGenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                            pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificateGenerateCertificate;
                            bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                            if (bagAttribute != null) {
                                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                            } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        }
                        if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                            string = ((DERBMPString) aSN1Primitive).getString();
                        } else if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                            aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                        }
                    }
                }
            } else {
                aSN1OctetString = null;
                string = null;
            }
            this.chainCerts.put(this.new CertId(certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
            if (z12) {
                if (aSN1OctetString != null) {
                    this.keyCerts.put(new String(Hex.encode(aSN1OctetString.getOctets())), certificateGenerateCertificate);
                }
                if (string != null) {
                    this.certs.put(string, certificateGenerateCertificate);
                }
            } else if (this.keyCerts.isEmpty()) {
                String str7 = new String(Hex.encode(this.createSubjectKeyId(certificateGenerateCertificate.getPublicKey()).getKeyIdentifier()));
                this.keyCerts.put(str7, certificateGenerateCertificate);
                IgnoresCaseHashtable ignoresCaseHashtable2 = this.keys;
                ignoresCaseHashtable2.put(str7, ignoresCaseHashtable2.remove("unmarked"));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
        } else {
            throw new KeyStoreException("There is a key entry with the name " + str + ".");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z11 = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z11 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        if (z11) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // org.spongycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z11) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
                cipherCreateCipher.init(4, new PKCS12Key(cArr, z11), pBEParameterSpec);
                return (PrivateKey) cipherCreateCipher.unwrap(bArr, "", 2);
            }
            if (algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                return (PrivateKey) createCipher(4, cArr, algorithmIdentifier).unwrap(bArr, "", 2);
            }
            throw new IOException("exception unwrapping private key - cannot recognise: " + algorithm);
        } catch (Exception e11) {
            throw new IOException("exception unwrapping private key - " + e11.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher cipherCreateCipher = this.helper.createCipher(str);
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher.wrap(key);
        } catch (Exception e11) {
            throw new IOException("exception encrypting data - " + e11.toString());
        }
    }

    private class CertId {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        byte[] f99636id;

        CertId(PublicKey publicKey) {
            this.f99636id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).getKeyIdentifier();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.f99636id, ((CertId) obj).f99636id);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f99636id);
        }

        CertId(byte[] bArr) {
            this.f99636id = bArr;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i11 = 0; i11 != certificateArr.length; i11++) {
                this.chainCerts.put(new CertId(certificateArr[i11].getPublicKey()), certificateArr[i11]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        doStore(outputStream, cArr, false);
    }
}
