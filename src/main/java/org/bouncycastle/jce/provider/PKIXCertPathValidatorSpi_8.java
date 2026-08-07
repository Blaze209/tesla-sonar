package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes9.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (!(x509Certificate instanceof BCX509Certificate)) {
            try {
                TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
                return;
            } catch (IllegalArgumentException e11) {
                throw new AnnotatedException(e11.getMessage());
            } catch (CertificateEncodingException e12) {
                throw new AnnotatedException("unable to process TBSCertificate", e12);
            }
        }
        try {
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        } catch (RuntimeException e13) {
            e = e13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        int iPrepareNextCertM;
        ArrayList arrayList;
        int iPrepareNextCertI1;
        int iPrepareNextCertI2;
        int iPrepareNextCertJ;
        HashSet hashSet2;
        ArrayList arrayList2;
        X500Name subjectPrincipal;
        CertPath certPath2 = certPath;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath2, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(baseParameters, new Date());
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
                ArrayList arrayList3 = new ArrayList();
                PKIXCertRevocationChecker provRevocationChecker = null;
                for (PKIXCertPathChecker pKIXCertPathChecker : pKIXExtendedParametersBuild.getCertPathCheckers()) {
                    pKIXCertPathChecker.init(false);
                    if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                        arrayList3.add(pKIXCertPathChecker);
                    } else {
                        if (provRevocationChecker != null) {
                            throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                        }
                        provRevocationChecker = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                    }
                }
                if (pKIXExtendedParametersBuild.isRevocationEnabled() && provRevocationChecker == null) {
                    provRevocationChecker = new ProvRevocationChecker(this.helper);
                }
                int i11 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    arrayListArr[i12] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                int i13 = 1;
                hashSet3.add("2.5.29.32.0");
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i14 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i11;
                int i15 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i11;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i11 = 0;
                }
                X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        ca2 = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                        cAPublicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath2, 0);
                        }
                        int i16 = i14;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        int i17 = i16;
                        PublicKey publicKey = cAPublicKey;
                        ArrayList arrayList4 = arrayList3;
                        int size2 = certificates.size() - 1;
                        int i18 = i11;
                        PublicKey publicKey2 = publicKey;
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        int i19 = size;
                        X509Certificate x509Certificate = null;
                        while (size2 >= 0) {
                            int i21 = size - size2;
                            List<? extends Certificate> list = certificates;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            boolean z11 = size2 == list.size() + (-1) ? i13 : 0;
                            try {
                                checkCertificate(x509Certificate2);
                                PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParameters;
                                int i22 = i19;
                                X509Certificate x509Certificate3 = trustedCert;
                                Set set = initialPolicies;
                                int i23 = i17;
                                Date date = validityDate;
                                X500Name x500Name = ca2;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                                certPath2 = certPath;
                                RFC3280CertPathUtilities.processCertA(certPath2, pKIXExtendedParameters2, date, provRevocationChecker, size2, publicKey2, z11, x500Name, x509Certificate3);
                                int i24 = size2;
                                PublicKey publicKey3 = publicKey2;
                                X509Certificate x509Certificate4 = x509Certificate3;
                                PKIXCertRevocationChecker pKIXCertRevocationChecker = provRevocationChecker;
                                RFC3280CertPathUtilities.processCertBC(certPath2, i24, pKIXNameConstraintValidator, this.isForCRLCheck);
                                HashSet hashSet5 = hashSet4;
                                int i25 = i15;
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath2, i24, RFC3280CertPathUtilities.processCertD(certPath2, i24, hashSet5, pKIXPolicyNode2, arrayListArr2, i25, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath2, i24, pKIXPolicyNodeProcessCertE, i23);
                                if (i21 != size) {
                                    try {
                                        if (x509Certificate2 != null) {
                                            hashSet4 = hashSet5;
                                            int i26 = i13;
                                            if (x509Certificate2.getVersion() == i26) {
                                                if (i21 != i26 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath2, i24);
                                                }
                                            }
                                            size2 = i24 - 1;
                                            validityDate = date;
                                            arrayListArr = arrayListArr2;
                                            trustAnchorFindTrustAnchor = trustAnchor;
                                            arrayList4 = arrayList;
                                            i19 = iPrepareNextCertM;
                                            provRevocationChecker = pKIXCertRevocationChecker;
                                            x509Certificate = x509Certificate2;
                                            initialPolicies = set;
                                            pKIXExtendedParameters = pKIXExtendedParameters2;
                                            certificates = list;
                                            trustedCert = x509Certificate4;
                                            i13 = 1;
                                        } else {
                                            hashSet4 = hashSet5;
                                        }
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath2.getCertificates(), i24, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        x509Certificate4 = x509Certificate2;
                                        ca2 = subjectPrincipal;
                                        i17 = iPrepareNextCertI1;
                                        i15 = iPrepareNextCertJ;
                                        publicKey2 = nextWorkingKey;
                                        arrayList = arrayList2;
                                        i18 = iPrepareNextCertI2;
                                        size2 = i24 - 1;
                                        validityDate = date;
                                        arrayListArr = arrayListArr2;
                                        trustAnchorFindTrustAnchor = trustAnchor;
                                        arrayList4 = arrayList;
                                        i19 = iPrepareNextCertM;
                                        provRevocationChecker = pKIXCertRevocationChecker;
                                        x509Certificate = x509Certificate2;
                                        initialPolicies = set;
                                        pKIXExtendedParameters = pKIXExtendedParameters2;
                                        certificates = list;
                                        trustedCert = x509Certificate4;
                                        i13 = 1;
                                    } catch (CertPathValidatorException e11) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath2, i24);
                                    }
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath2, i24);
                                    PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i24, arrayListArr2, pKIXPolicyNodeProcessCertE, i18);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath2, i24, pKIXNameConstraintValidator);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i24, i23);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i24, i18);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i24, i25);
                                    iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i24, iPrepareNextCertH1);
                                    iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i24, iPrepareNextCertH2);
                                    iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i24, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath2, i24);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i24, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i24, i22));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath2, i24);
                                    Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                        hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                        hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                        hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                        hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                        hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    arrayList2 = arrayList4;
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath2, i24, hashSet2, arrayList2);
                                    subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                    pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                arrayList = arrayList4;
                                iPrepareNextCertM = i22;
                                pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                i15 = i25;
                                i17 = i23;
                                publicKey2 = publicKey3;
                                ca2 = x500Name;
                                size2 = i24 - 1;
                                validityDate = date;
                                arrayListArr = arrayListArr2;
                                trustAnchorFindTrustAnchor = trustAnchor;
                                arrayList4 = arrayList;
                                i19 = iPrepareNextCertM;
                                provRevocationChecker = pKIXCertRevocationChecker;
                                x509Certificate = x509Certificate2;
                                initialPolicies = set;
                                pKIXExtendedParameters = pKIXExtendedParameters2;
                                certificates = list;
                                trustedCert = x509Certificate4;
                                i13 = 1;
                            } catch (AnnotatedException e12) {
                                throw new CertPathValidatorException(e12.getMessage(), e12.getUnderlyingException(), certPath, size2);
                            }
                        }
                        TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                        int i27 = size2;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        Set set2 = initialPolicies;
                        PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                        ArrayList arrayList5 = arrayList4;
                        PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters;
                        int i28 = i27 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i28, RFC3280CertPathUtilities.wrapupCertA(i17, x509Certificate));
                        Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(Extension.extendedKeyUsage.getId());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath2, i28, arrayList5, hashSet);
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath2, pKIXExtendedParameters3, set2, i28, arrayListArr3, pKIXPolicyNode3, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath2, i27);
                    } catch (CertPathValidatorException e13) {
                        throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e13, certPath2, -1);
                    }
                } catch (RuntimeException e14) {
                    throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e14, certPath2, -1);
                }
            }
            try {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath2, -1);
            } catch (AnnotatedException e15) {
                e = e15;
            }
        } catch (AnnotatedException e16) {
            e = e16;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, certificates.size() - 1);
    }

    public PKIXCertPathValidatorSpi_8(boolean z11) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z11;
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }
}
