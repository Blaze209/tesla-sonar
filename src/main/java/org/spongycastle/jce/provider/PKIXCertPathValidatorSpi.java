package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes10.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.spongycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        HashSet hashSet2;
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
        Set initialPolicies = baseParameters.getInitialPolicies();
        int i11 = 1;
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor == null) {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            }
            PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
            int i12 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                arrayListArr[i13] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add("2.5.29.32.0");
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i14 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i12;
            int i15 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i12;
            if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                i12 = 0;
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
                    int size2 = certificates.size() - 1;
                    int i16 = i15;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    X500Name x500Name = ca2;
                    PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                    X509Certificate x509Certificate = trustedCert;
                    int i17 = i16;
                    int i18 = i14;
                    X509Certificate x509Certificate2 = null;
                    int iPrepareNextCertM = size;
                    while (size2 >= 0) {
                        int i19 = size - size2;
                        X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                        PKIXNameConstraintValidator pKIXNameConstraintValidator3 = pKIXNameConstraintValidator2;
                        ArrayList[] arrayListArr2 = arrayListArr;
                        PublicKey publicKey = cAPublicKey;
                        List<? extends Certificate> list = certificates;
                        TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                        RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParametersBuild, size2, publicKey, size2 == certificates.size() + (-1) ? i11 : 0, x500Name, x509Certificate, this.helper);
                        PublicKey publicKey2 = publicKey;
                        X500Name x500Name2 = x500Name;
                        X509Certificate x509Certificate4 = x509Certificate;
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        int i21 = size2;
                        RFC3280CertPathUtilities.processCertBC(certPath, i21, pKIXNameConstraintValidator3);
                        HashSet hashSet5 = hashSet4;
                        int i22 = i17;
                        PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i21, RFC3280CertPathUtilities.processCertD(certPath, i21, hashSet5, pKIXPolicyNode2, arrayListArr2, i22));
                        RFC3280CertPathUtilities.processCertF(certPath, i21, pKIXPolicyNodeProcessCertE, i18);
                        if (i19 == size) {
                            i17 = i22;
                            x500Name = x500Name2;
                        } else {
                            if (x509Certificate3 != null && x509Certificate3.getVersion() == i11) {
                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i21);
                            }
                            RFC3280CertPathUtilities.prepareNextCertA(certPath, i21);
                            pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.prepareCertB(certPath, i21, arrayListArr2, pKIXPolicyNodeProcessCertE, i12);
                            RFC3280CertPathUtilities.prepareNextCertG(certPath, i21, pKIXNameConstraintValidator3);
                            int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i21, i18);
                            int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i21, i12);
                            int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i21, i22);
                            int iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i21, iPrepareNextCertH1);
                            int iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i21, iPrepareNextCertH2);
                            int iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i21, iPrepareNextCertH3);
                            RFC3280CertPathUtilities.prepareNextCertK(certPath, i21);
                            iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i21, RFC3280CertPathUtilities.prepareNextCertL(certPath, i21, iPrepareNextCertM));
                            RFC3280CertPathUtilities.prepareNextCertN(certPath, i21);
                            Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
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
                            RFC3280CertPathUtilities.prepareNextCertO(certPath, i21, hashSet2, certPathCheckers);
                            X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate3);
                            try {
                                PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i21, this.helper);
                                AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                algorithmIdentifier2.getAlgorithm();
                                algorithmIdentifier2.getParameters();
                                i17 = iPrepareNextCertJ;
                                x500Name = subjectPrincipal;
                                x509Certificate4 = x509Certificate3;
                                i18 = iPrepareNextCertI1;
                                publicKey2 = nextWorkingKey;
                                i12 = iPrepareNextCertI2;
                            } catch (CertPathValidatorException e11) {
                                throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath, i21);
                            }
                        }
                        pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                        hashSet4 = hashSet5;
                        arrayListArr = arrayListArr2;
                        pKIXNameConstraintValidator2 = pKIXNameConstraintValidator3;
                        certificates = list;
                        trustAnchorFindTrustAnchor = trustAnchor;
                        i11 = 1;
                        size2 = i21 - 1;
                        pKIXExtendedParametersBuild = pKIXExtendedParameters;
                        cAPublicKey = publicKey2;
                        x509Certificate2 = x509Certificate3;
                        x509Certificate = x509Certificate4;
                    }
                    PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParametersBuild;
                    int i23 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                    HashSet hashSet6 = hashSet4;
                    PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                    int i24 = i23 + 1;
                    int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i24, RFC3280CertPathUtilities.wrapupCertA(i18, x509Certificate2));
                    Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
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
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i24, certPathCheckers, hashSet);
                    PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters2, initialPolicies, i24, arrayListArr3, pKIXPolicyNode3, hashSet6);
                    if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate2.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i23);
                } catch (CertPathValidatorException e12) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e12, certPath, -1);
                }
            } catch (IllegalArgumentException e13) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e13, certPath, algorithmIdentifier);
            }
        } catch (AnnotatedException e14) {
            throw new CertPathValidatorException(e14.getMessage(), e14, certPath, certificates.size() - 1);
        }
    }
}
