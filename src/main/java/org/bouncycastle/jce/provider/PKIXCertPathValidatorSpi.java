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
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes9.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
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
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name ca2;
        PublicKey cAPublicKey;
        TrustAnchor trustAnchor;
        ProvCrlRevocationChecker provCrlRevocationChecker;
        HashSet hashSet;
        int i11;
        List list;
        int iPrepareNextCertI1;
        int iPrepareNextCertI2;
        int iPrepareNextCertM;
        HashSet hashSet2;
        X500Name subjectPrincipal;
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
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int algorithmIdentifier = -1;
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(baseParameters, new Date());
        Set initialPolicies = baseParameters.getInitialPolicies();
        int i12 = 1;
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
                int i13 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    arrayListArr[i14] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add("2.5.29.32.0");
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i15 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i13;
                int i16 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i13;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i13 = 0;
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
                        algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        List certPathCheckers = pKIXExtendedParametersBuild.getCertPathCheckers();
                        Iterator it = certPathCheckers.iterator();
                        while (it.hasNext()) {
                            ((PKIXCertPathChecker) it.next()).init(false);
                        }
                        if (pKIXExtendedParametersBuild.isRevocationEnabled()) {
                            provCrlRevocationChecker = new ProvCrlRevocationChecker(this.helper);
                            trustAnchor = trustAnchorFindTrustAnchor;
                        } else {
                            trustAnchor = trustAnchorFindTrustAnchor;
                            provCrlRevocationChecker = null;
                        }
                        int i17 = i13;
                        int size2 = certificates.size() - 1;
                        int i18 = i15;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        int i19 = i18;
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        X509Certificate x509Certificate = null;
                        int i21 = size;
                        while (size2 >= 0) {
                            int i22 = size - size2;
                            List<? extends Certificate> list2 = certificates;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            boolean z11 = size2 == list2.size() + (-1) ? i12 : 0;
                            try {
                                checkCertificate(x509Certificate2);
                                X509Certificate x509Certificate3 = trustedCert;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                PublicKey publicKey = cAPublicKey;
                                int i23 = i21;
                                int i24 = i19;
                                X500Name x500Name = ca2;
                                List list3 = certPathCheckers;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                TrustAnchor trustAnchor2 = trustAnchor;
                                Date date = validityDate;
                                PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParameters;
                                RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters2, date, provCrlRevocationChecker, size2, publicKey, z11, x500Name, x509Certificate3);
                                pKIXExtendedParameters = pKIXExtendedParameters2;
                                int i25 = size2;
                                ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                                RFC3280CertPathUtilities.processCertBC(certPath, i25, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                HashSet hashSet5 = hashSet4;
                                int iPrepareNextCertJ = i16;
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i25, RFC3280CertPathUtilities.processCertD(certPath, i25, hashSet5, pKIXPolicyNode2, arrayListArr2, iPrepareNextCertJ, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i25, pKIXPolicyNodeProcessCertE, i24);
                                if (i22 != size) {
                                    try {
                                        if (x509Certificate2 != null) {
                                            hashSet4 = hashSet5;
                                            int i26 = i12;
                                            if (x509Certificate2.getVersion() == i26) {
                                                if (i22 != i26 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i25);
                                                }
                                            }
                                            i16 = iPrepareNextCertJ;
                                            int i27 = i25 - 1;
                                            arrayListArr = arrayListArr2;
                                            validityDate = date;
                                            provCrlRevocationChecker = provCrlRevocationChecker2;
                                            i19 = i24;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            i12 = 1;
                                            size2 = i27;
                                            certPathCheckers = list;
                                            i21 = i11;
                                            x509Certificate = x509Certificate2;
                                            trustAnchor = trustAnchor2;
                                            certificates = list2;
                                        } else {
                                            hashSet4 = hashSet5;
                                        }
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i25, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        cAPublicKey = nextWorkingKey;
                                        list = list3;
                                        trustedCert = x509Certificate2;
                                        ca2 = subjectPrincipal;
                                        i11 = iPrepareNextCertM;
                                        i24 = iPrepareNextCertI1;
                                        i17 = iPrepareNextCertI2;
                                        i16 = iPrepareNextCertJ;
                                        int i28 = i25 - 1;
                                        arrayListArr = arrayListArr2;
                                        validityDate = date;
                                        provCrlRevocationChecker = provCrlRevocationChecker2;
                                        i19 = i24;
                                        pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                        i12 = 1;
                                        size2 = i28;
                                        certPathCheckers = list;
                                        i21 = i11;
                                        x509Certificate = x509Certificate2;
                                        trustAnchor = trustAnchor2;
                                        certificates = list2;
                                    } catch (CertPathValidatorException e11) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath, i25);
                                    }
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath, i25);
                                    PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i25, arrayListArr2, pKIXPolicyNodeProcessCertE, i17);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath, i25, pKIXNameConstraintValidator2);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i25, i24);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i25, i17);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i25, iPrepareNextCertJ);
                                    iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i25, iPrepareNextCertH1);
                                    iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i25, iPrepareNextCertH2);
                                    iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i25, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath, i25);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i25, RFC3280CertPathUtilities.prepareNextCertL(certPath, i25, i23));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath, i25);
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
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath, i25, hashSet2, list3);
                                    subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                    pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                list = list3;
                                i11 = i23;
                                pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                cAPublicKey = publicKey;
                                ca2 = x500Name;
                                trustedCert = x509Certificate3;
                                i16 = iPrepareNextCertJ;
                                int i29 = i25 - 1;
                                arrayListArr = arrayListArr2;
                                validityDate = date;
                                provCrlRevocationChecker = provCrlRevocationChecker2;
                                i19 = i24;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                i12 = 1;
                                size2 = i29;
                                certPathCheckers = list;
                                i21 = i11;
                                x509Certificate = x509Certificate2;
                                trustAnchor = trustAnchor2;
                                certificates = list2;
                            } catch (AnnotatedException e12) {
                                throw new CertPathValidatorException(e12.getMessage(), e12.getUnderlyingException(), certPath, size2);
                            }
                        }
                        TrustAnchor trustAnchor3 = trustAnchor;
                        int i31 = size2;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        List list4 = certPathCheckers;
                        int i32 = i31 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i32, RFC3280CertPathUtilities.wrapupCertA(i19, x509Certificate));
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
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i32, list4, hashSet);
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters, initialPolicies, i32, arrayListArr3, pKIXPolicyNode2, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor3, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i31);
                    } catch (CertPathValidatorException e13) {
                        throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e13, certPath, -1);
                    }
                } catch (RuntimeException e14) {
                    throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e14, certPath, algorithmIdentifier);
                }
            }
            try {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            } catch (AnnotatedException e15) {
                e = e15;
            }
        } catch (AnnotatedException e16) {
            e = e16;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, certificates.size() - 1);
    }

    public PKIXCertPathValidatorSpi(boolean z11) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z11;
    }
}
