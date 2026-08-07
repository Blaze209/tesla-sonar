package org.spongycastle.cms.jcajce;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cms.ecc.ECCCMSSharedInfo;
import org.spongycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.KeyAgreeRecipient;
import org.spongycastle.jcajce.spec.MQVParameterSpec;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.spongycastle.operator.DefaultSecretKeySizeProvider;
import org.spongycastle.operator.SecretKeySizeProvider;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public abstract class JceKeyAgreeRecipient implements KeyAgreeRecipient {
    private static KeyMaterialGenerator ecc_cms_Generator;
    private static KeyMaterialGenerator old_ecc_cms_Generator;
    private static final Set possibleOldMessages;
    protected EnvelopedDataHelper contentHelper;
    protected EnvelopedDataHelper helper;
    private SecretKeySizeProvider keySizeProvider;
    private PrivateKey recipientKey;

    static {
        HashSet hashSet = new HashSet();
        possibleOldMessages = hashSet;
        hashSet.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        old_ecc_cms_Generator = new KeyMaterialGenerator() { // from class: org.spongycastle.cms.jcajce.JceKeyAgreeRecipient.1
            @Override // org.spongycastle.cms.jcajce.KeyMaterialGenerator
            public byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i11, byte[] bArr) {
                try {
                    return new ECCCMSSharedInfo(new AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), DERNull.INSTANCE), bArr, Pack.intToBigEndian(i11)).getEncoded("DER");
                } catch (IOException e11) {
                    throw new IllegalStateException("Unable to create KDF material: " + e11);
                }
            }
        };
        ecc_cms_Generator = new RFC5753KeyMaterialGenerator();
    }

    public JceKeyAgreeRecipient(PrivateKey privateKey) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.keySizeProvider = new DefaultSecretKeySizeProvider();
        this.recipientKey = privateKey;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private SecretKey calculateAgreedWrapKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, PublicKey publicKey, ASN1OctetString aSN1OctetString, PrivateKey privateKey, KeyMaterialGenerator keyMaterialGenerator) throws InvalidKeySpecException, InvalidKeyException, CMSException, InvalidAlgorithmParameterException {
        UserKeyingMaterialSpec userKeyingMaterialSpec = null;
        if (CMSUtils.isMQV(algorithmIdentifier.getAlgorithm())) {
            MQVuserKeyingMaterial mQVuserKeyingMaterial = MQVuserKeyingMaterial.getInstance(aSN1OctetString.getOctets());
            PublicKey publicKeyGeneratePublic = this.helper.createKeyFactory(algorithmIdentifier.getAlgorithm()).generatePublic(new X509EncodedKeySpec(new SubjectPublicKeyInfo(getPrivateKeyAlgorithmIdentifier(), mQVuserKeyingMaterial.getEphemeralPublicKey().getPublicKey().getBytes()).getEncoded()));
            KeyAgreement keyAgreementCreateKeyAgreement = this.helper.createKeyAgreement(algorithmIdentifier.getAlgorithm());
            byte[] octets = mQVuserKeyingMaterial.getAddedukm() != null ? mQVuserKeyingMaterial.getAddedukm().getOctets() : null;
            KeyMaterialGenerator keyMaterialGenerator2 = old_ecc_cms_Generator;
            if (keyMaterialGenerator == keyMaterialGenerator2) {
                octets = keyMaterialGenerator2.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2), octets);
            }
            keyAgreementCreateKeyAgreement.init(privateKey, new MQVParameterSpec(privateKey, publicKeyGeneratePublic, octets));
            keyAgreementCreateKeyAgreement.doPhase(publicKey, true);
            return keyAgreementCreateKeyAgreement.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
        }
        KeyAgreement keyAgreementCreateKeyAgreement2 = this.helper.createKeyAgreement(algorithmIdentifier.getAlgorithm());
        if (CMSUtils.isEC(algorithmIdentifier.getAlgorithm())) {
            userKeyingMaterialSpec = aSN1OctetString != null ? new UserKeyingMaterialSpec(keyMaterialGenerator.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2), aSN1OctetString.getOctets())) : new UserKeyingMaterialSpec(keyMaterialGenerator.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2), null));
        } else {
            if (!CMSUtils.isRFC2631(algorithmIdentifier.getAlgorithm())) {
                throw new CMSException("Unknown key agreement algorithm: " + algorithmIdentifier.getAlgorithm());
            }
            if (aSN1OctetString != null) {
                userKeyingMaterialSpec = new UserKeyingMaterialSpec(aSN1OctetString.getOctets());
            }
        }
        keyAgreementCreateKeyAgreement2.init(privateKey, userKeyingMaterialSpec);
        keyAgreementCreateKeyAgreement2.doPhase(publicKey, true);
        return keyAgreementCreateKeyAgreement2.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
    }

    private Key unwrapSessionKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, ASN1ObjectIdentifier aSN1ObjectIdentifier2, byte[] bArr) throws InvalidKeyException, CMSException {
        Cipher cipherCreateCipher = this.helper.createCipher(aSN1ObjectIdentifier);
        cipherCreateCipher.init(4, secretKey);
        return cipherCreateCipher.unwrap(bArr, this.helper.getBaseCipherName(aSN1ObjectIdentifier2), 3);
    }

    protected Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1OctetString aSN1OctetString, byte[] bArr) throws CMSException {
        JceKeyAgreeRecipient jceKeyAgreeRecipient;
        AlgorithmIdentifier algorithmIdentifier3;
        ASN1OctetString aSN1OctetString2;
        try {
            try {
                AlgorithmIdentifier algorithmIdentifier4 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
                PublicKey publicKeyGeneratePublic = this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
                try {
                    jceKeyAgreeRecipient = this;
                    algorithmIdentifier3 = algorithmIdentifier;
                    aSN1OctetString2 = aSN1OctetString;
                    try {
                        try {
                            return unwrapSessionKey(algorithmIdentifier4.getAlgorithm(), jceKeyAgreeRecipient.calculateAgreedWrapKey(algorithmIdentifier3, algorithmIdentifier4, publicKeyGeneratePublic, aSN1OctetString2, this.recipientKey, ecc_cms_Generator), algorithmIdentifier2.getAlgorithm(), bArr);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            InvalidKeyException invalidKeyException = e;
                            try {
                                if (!possibleOldMessages.contains(algorithmIdentifier3.getAlgorithm())) {
                                    throw invalidKeyException;
                                }
                                return unwrapSessionKey(algorithmIdentifier4.getAlgorithm(), jceKeyAgreeRecipient.calculateAgreedWrapKey(algorithmIdentifier3, algorithmIdentifier4, publicKeyGeneratePublic, aSN1OctetString2, jceKeyAgreeRecipient.recipientKey, old_ecc_cms_Generator), algorithmIdentifier2.getAlgorithm(), bArr);
                            } catch (InvalidKeyException e12) {
                                e = e12;
                                throw new CMSException("key invalid in message.", e);
                            }
                        }
                    } catch (NoSuchAlgorithmException e13) {
                        e = e13;
                        throw new CMSException("can't find algorithm.", e);
                    } catch (InvalidKeySpecException e14) {
                        e = e14;
                        throw new CMSException("originator key spec invalid.", e);
                    } catch (NoSuchPaddingException e15) {
                        e = e15;
                        throw new CMSException("required padding not supported.", e);
                    } catch (Exception e16) {
                        e = e16;
                        throw new CMSException("originator key invalid.", e);
                    }
                } catch (InvalidKeyException e17) {
                    e = e17;
                    jceKeyAgreeRecipient = this;
                    algorithmIdentifier3 = algorithmIdentifier;
                    aSN1OctetString2 = aSN1OctetString;
                }
            } catch (InvalidKeyException e18) {
                e = e18;
            }
        } catch (NoSuchAlgorithmException e19) {
            e = e19;
        } catch (InvalidKeySpecException e21) {
            e = e21;
        } catch (NoSuchPaddingException e22) {
            e = e22;
        } catch (Exception e23) {
            e = e23;
        }
    }

    @Override // org.spongycastle.cms.KeyAgreeRecipient
    public AlgorithmIdentifier getPrivateKeyAlgorithmIdentifier() {
        return PrivateKeyInfo.getInstance(this.recipientKey.getEncoded()).getPrivateKeyAlgorithm();
    }

    public JceKeyAgreeRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKeyAgreeRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public JceKeyAgreeRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKeyAgreeRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }
}
