package org.bouncycastle.x509;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f99274n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i11 = 0; i11 != bArr.length; i11++) {
                stringBuffer.append(Integer.toHexString(bArr[i11] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e11) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e11.getMessage(), e11, e11.getClass().getName()}), e11);
                }
            } catch (CertPathReviewerException e12) {
                addError(e12.getErrorMessage(), e12.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e13) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e13.getMessage(), e13, e13.getClass().getName()}), e13.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i11));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e11) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e11, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e12) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e12, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e13) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e14) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e14, this.certPath, size);
                        }
                    } catch (IOException e15) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e15, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i12 = 0; i12 != excludedSubtrees.length; i12++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i12]);
                            }
                        }
                    }
                } catch (AnnotatedException e16) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e16, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e17) {
            addError(e17.getErrorMessage(), e17.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.f99274n;
        int i11 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i11++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i11)}));
    }

    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode;
        PKIXPolicyNode pKIXPolicyNode;
        int i11;
        int i12;
        int iIntValueExact;
        int iIntValueExact2;
        HashSet hashSet;
        String id2;
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i13 = this.f99274n + 1;
        ArrayList[] arrayListArr = new ArrayList[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            arrayListArr[i14] = new ArrayList();
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add("2.5.29.32.0");
        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet2, null, new HashSet(), "2.5.29.32.0", false);
        arrayListArr[0].add(pKIXPolicyNode2);
        int i15 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.f99274n + 1;
        int i16 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f99274n + 1;
        int i17 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f99274n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet3 = null;
            while (size >= 0) {
                int i18 = this.f99274n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNode3 == null) {
                        i11 = i16;
                        i12 = i17;
                    } else {
                        Enumeration objects = aSN1Sequence.getObjects();
                        HashSet hashSet4 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            int i19 = i16;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            int i21 = i17;
                            hashSet4.add(policyIdentifier.getId());
                            if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i18, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i18, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e11, this.certPath, size);
                                }
                            }
                            i16 = i19;
                            i17 = i21;
                        }
                        i11 = i16;
                        i12 = i17;
                        if (hashSet3 == null || hashSet3.contains("2.5.29.32.0")) {
                            hashSet = hashSet4;
                        } else {
                            HashSet hashSet5 = new HashSet();
                            for (Object obj : hashSet3) {
                                if (hashSet4.contains(obj)) {
                                    hashSet5.add(obj);
                                }
                            }
                            hashSet = hashSet5;
                        }
                        if (i11 > 0 || (i18 < this.f99274n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (objects2.hasMoreElements()) {
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        ArrayList arrayList = arrayListArr[i18 - 1];
                                        int i22 = 0;
                                        while (i22 < arrayList.size()) {
                                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) arrayList.get(i22);
                                            for (Object obj2 : pKIXPolicyNode4.getExpectedPolicies()) {
                                                ArrayList arrayList2 = arrayList;
                                                int i23 = i22;
                                                if (obj2 instanceof String) {
                                                    id2 = (String) obj2;
                                                } else {
                                                    if (obj2 instanceof ASN1ObjectIdentifier) {
                                                        id2 = ((ASN1ObjectIdentifier) obj2).getId();
                                                    }
                                                    arrayList = arrayList2;
                                                    i22 = i23;
                                                }
                                                Iterator children = pKIXPolicyNode4.getChildren();
                                                boolean z11 = false;
                                                while (children.hasNext()) {
                                                    Iterator it = children;
                                                    if (id2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z11 = true;
                                                    }
                                                    children = it;
                                                }
                                                if (!z11) {
                                                    HashSet hashSet6 = new HashSet();
                                                    hashSet6.add(id2);
                                                    PKIXPolicyNode pKIXPolicyNode5 = new PKIXPolicyNode(new ArrayList(), i18, hashSet6, pKIXPolicyNode4, qualifierSet2, id2, false);
                                                    PKIXPolicyNode pKIXPolicyNode6 = pKIXPolicyNode4;
                                                    pKIXPolicyNode6.addChild(pKIXPolicyNode5);
                                                    pKIXPolicyNode4 = pKIXPolicyNode6;
                                                    arrayListArr[i18].add(pKIXPolicyNode5);
                                                }
                                                arrayList = arrayList2;
                                                i22 = i23;
                                            }
                                            i22++;
                                        }
                                        break;
                                    } catch (CertPathValidatorException e12) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e12, this.certPath, size);
                                    }
                                }
                            }
                        }
                        int i24 = i18 - 1;
                        while (i24 >= 0) {
                            ArrayList arrayList3 = arrayListArr[i24];
                            int i25 = i24;
                            HashSet hashSet7 = hashSet;
                            PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode2 = pKIXPolicyNode3;
                            for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                                PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) arrayList3.get(i26);
                                if (!pKIXPolicyNode7.hasChildren() && (pKIXPolicyNodeRemovePolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode2, arrayListArr, pKIXPolicyNode7)) == null) {
                                    break;
                                }
                            }
                            pKIXPolicyNode3 = pKIXPolicyNodeRemovePolicyNode2;
                            i24 = i25 - 1;
                            hashSet = hashSet7;
                        }
                        HashSet hashSet8 = hashSet;
                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            boolean zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                            ArrayList arrayList4 = arrayListArr[i18];
                            for (int i27 = 0; i27 < arrayList4.size(); i27++) {
                                ((PKIXPolicyNode) arrayList4.get(i27)).setCritical(zContains);
                            }
                        }
                        hashSet3 = hashSet8;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode3 = null;
                    }
                    if (i15 <= 0 && pKIXPolicyNode3 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i18 != this.f99274n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                int i28 = 0;
                                while (i28 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i28);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    if ("2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i28++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            }
                            if (extensionValue != 0) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) extensionValue;
                                HashMap map = new HashMap();
                                HashSet<String> hashSet9 = new HashSet();
                                int i29 = 0;
                                while (i29 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i29);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    int i31 = i29;
                                    String id4 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (map.containsKey(id3)) {
                                        ((Set) map.get(id3)).add(id4);
                                    } else {
                                        HashSet hashSet10 = new HashSet();
                                        hashSet10.add(id4);
                                        map.put(id3, hashSet10);
                                        hashSet9.add(id3);
                                    }
                                    i29 = i31 + 1;
                                    aSN1Sequence5 = aSN1Sequence7;
                                }
                                PKIXPolicyNode pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                                for (String str : hashSet9) {
                                    if (i12 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i18, arrayListArr, str, map, x509Certificate2);
                                        } catch (CertPathValidatorException e13) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e13, this.certPath, size);
                                        } catch (AnnotatedException e14) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e14, this.certPath, size);
                                        }
                                    } else if (i12 <= 0) {
                                        pKIXPolicyNodePrepareNextCertB2 = CertPathValidatorUtilities.prepareNextCertB2(i18, arrayListArr, str, pKIXPolicyNodePrepareNextCertB2);
                                    }
                                }
                                pKIXPolicyNode3 = pKIXPolicyNodePrepareNextCertB2;
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i15 = i15;
                                i16 = i11;
                                i17 = i12;
                            } else {
                                if (i15 != 0) {
                                    i15--;
                                }
                                if (i12 != 0) {
                                    i15 = i15;
                                    i17 = i12 - 1;
                                } else {
                                    i15 = i15;
                                    i17 = i12;
                                }
                                i16 = i11 != 0 ? i11 - 1 : i11;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i15) {
                                                i15 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i17) {
                                            i17 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i16) {
                                        i16 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e15) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e15, this.certPath, size);
                        }
                    } else {
                        initialPolicies = initialPolicies;
                        hashSet3 = hashSet3;
                        i15 = i15;
                        i16 = i11;
                        i17 = i12;
                    }
                    pKIXPolicyNode2 = pKIXPolicyNode3;
                    size--;
                    x509Certificate = x509Certificate2;
                    hashSet3 = hashSet3;
                    initialPolicies = initialPolicies;
                } catch (AnnotatedException e16) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e16, this.certPath, size);
                }
            }
            Set<String> set = initialPolicies;
            PKIXPolicyNode pKIXPolicyNode8 = pKIXPolicyNode2;
            int i32 = i15;
            int i33 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i32 <= 0) ? i32 : i32 - 1;
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    int i34 = i33;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i34 = 0;
                        }
                    }
                    i33 = i34;
                }
                if (pKIXPolicyNode8 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
                        HashSet<PKIXPolicyNode> hashSet11 = new HashSet();
                        for (int i35 = 0; i35 < i13; i35++) {
                            ArrayList arrayList5 = arrayListArr[i35];
                            for (int i36 = 0; i36 < arrayList5.size(); i36++) {
                                PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList5.get(i36);
                                if ("2.5.29.32.0".equals(pKIXPolicyNode9.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode9.getChildren();
                                    while (children2.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) children2.next();
                                        if (!"2.5.29.32.0".equals(pKIXPolicyNode10.getValidPolicy())) {
                                            hashSet11.add(pKIXPolicyNode10);
                                        }
                                    }
                                }
                            }
                        }
                        pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode8;
                        for (PKIXPolicyNode pKIXPolicyNode11 : hashSet11) {
                            Set<String> set2 = set;
                            if (!set2.contains(pKIXPolicyNode11.getValidPolicy())) {
                                pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode11);
                            }
                            set = set2;
                        }
                        if (pKIXPolicyNodeRemovePolicyNode != null) {
                            for (int i37 = this.f99274n - 1; i37 >= 0; i37--) {
                                ArrayList arrayList6 = arrayListArr[i37];
                                for (int i38 = 0; i38 < arrayList6.size(); i38++) {
                                    PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList6.get(i38);
                                    if (!pKIXPolicyNode12.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode12);
                                    }
                                }
                            }
                        }
                    } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                        pKIXPolicyNode = pKIXPolicyNode8;
                    } else {
                        if (hashSet3.isEmpty()) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet12 = new HashSet();
                        for (int i39 = 0; i39 < i13; i39++) {
                            ArrayList arrayList7 = arrayListArr[i39];
                            for (int i41 = 0; i41 < arrayList7.size(); i41++) {
                                PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList7.get(i41);
                                if ("2.5.29.32.0".equals(pKIXPolicyNode13.getValidPolicy())) {
                                    Iterator children3 = pKIXPolicyNode13.getChildren();
                                    while (children3.hasNext()) {
                                        hashSet12.add(children3.next());
                                    }
                                }
                            }
                        }
                        Iterator it2 = hashSet12.iterator();
                        while (it2.hasNext()) {
                            hashSet3.contains(((PKIXPolicyNode) it2.next()).getValidPolicy());
                        }
                        pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode8;
                        for (int i42 = this.f99274n - 1; i42 >= 0; i42--) {
                            ArrayList arrayList8 = arrayListArr[i42];
                            for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                                PKIXPolicyNode pKIXPolicyNode14 = (PKIXPolicyNode) arrayList8.get(i43);
                                if (!pKIXPolicyNode14.hasChildren()) {
                                    pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode14);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode = pKIXPolicyNodeRemovePolicyNode;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode = null;
                }
                if (i33 <= 0 && pKIXPolicyNode == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e17) {
            addError(e17.getErrorMessage(), e17.getIndex());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ac A[LOOP:1: B:98:0x02a6->B:100:0x02ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x02cf A[LOOP:2: B:102:0x02c9->B:104:0x02cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0328  */
    /* JADX WARN: Code duplicated, block: B:128:0x0346 A[Catch: AnnotatedException -> 0x0360, TryCatch #5 {AnnotatedException -> 0x0360, blocks: (B:126:0x033a, B:128:0x0346, B:130:0x034c, B:131:0x0355), top: B:156:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:130:0x034c A[Catch: AnnotatedException -> 0x0360, TryCatch #5 {AnnotatedException -> 0x0360, blocks: (B:126:0x033a, B:128:0x0346, B:130:0x034c, B:131:0x0355), top: B:156:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0355 A[Catch: AnnotatedException -> 0x0360, TRY_LEAVE, TryCatch #5 {AnnotatedException -> 0x0360, blocks: (B:126:0x033a, B:128:0x0346, B:130:0x034c, B:131:0x0355), top: B:156:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0370  */
    /* JADX WARN: Code duplicated, block: B:140:0x0378  */
    /* JADX WARN: Code duplicated, block: B:141:0x0383  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7 A[Catch: IllegalArgumentException -> 0x0106, TRY_ENTER, TryCatch #14 {IllegalArgumentException -> 0x0106, blocks: (B:33:0x00f7, B:34:0x00fc), top: B:169:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc A[Catch: IllegalArgumentException -> 0x0106, TRY_LEAVE, TryCatch #14 {IllegalArgumentException -> 0x0106, blocks: (B:33:0x00f7, B:34:0x00fc), top: B:169:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x020d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0272 A[Catch: AnnotatedException -> 0x0277, TRY_LEAVE, TryCatch #13 {AnnotatedException -> 0x0277, blocks: (B:85:0x026a, B:87:0x0272), top: B:166:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0281  */
    /* JADX WARN: Code duplicated, block: B:93:0x028a A[Catch: AnnotatedException -> 0x028f, TRY_LEAVE, TryCatch #1 {AnnotatedException -> 0x028f, blocks: (B:91:0x0282, B:93:0x028a), top: B:152:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0299  */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate trustedCert;
        PublicKey cAPublicKey;
        X509Certificate x509Certificate;
        X500Principal subjectX500Principal;
        PublicKey nextWorkingKey;
        int size;
        int i11;
        X509Certificate x509Certificate2;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it2;
        int i12;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        char c11;
        boolean[] keyUsage;
        BasicConstraints basicConstraints;
        ErrorBundle errorBundle3;
        byte[] extensionValue3;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        GeneralName generalName;
        BigInteger authorityCertSerialNumber;
        X509Certificate trustedCert2;
        boolean[] keyUsage2;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            X509Certificate x509Certificate3 = (X509Certificate) list.get(list.size() - 1);
            Collection trustAnchors = getTrustAnchors(x509Certificate3, this.pkixParams.getTrustAnchors());
            if (trustAnchors.size() <= 1) {
                if (trustAnchors.isEmpty()) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate3.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
                } else {
                    trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                    try {
                        try {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                            } catch (SignatureException unused) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                        }
                    } catch (CertPathReviewerException e11) {
                        e = e11;
                        addError(e.getErrorMessage());
                    }
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 != null) {
                    trustedCert2 = trustAnchor2.getTrustedCert();
                    try {
                        if (trustedCert2 != null) {
                            x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
                        } else {
                            x500Principal = new X500Principal(trustAnchor2.getCAName());
                        }
                    } catch (IllegalArgumentException unused3) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        x500Principal = null;
                    }
                    if (trustedCert2 != null && (keyUsage2 = trustedCert2.getKeyUsage()) != null && (keyUsage2.length <= 5 || !keyUsage2[5])) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    x500Principal = null;
                }
                if (trustAnchor2 != null) {
                    trustedCert = trustAnchor2.getTrustedCert();
                    if (trustedCert != null) {
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        cAPublicKey = trustAnchor2.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    trustedCert = null;
                    cAPublicKey = null;
                }
                x509Certificate = trustedCert;
                subjectX500Principal = x500Principal;
                nextWorkingKey = cAPublicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    i11 = this.f99274n - size;
                    x509Certificate2 = (X509Certificate) this.certs.get(size);
                    if (nextWorkingKey != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e12) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e12.getMessage(), e12, e12.getClass().getName()});
                            addError(errorBundle, size);
                        }
                    } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                        } catch (GeneralSecurityException e13) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e13.getMessage(), e13, e13.getClass().getName()});
                            addError(errorBundle, size);
                        }
                    } else {
                        errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                        extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                        if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                            generalName = authorityCertIssuer.getNames()[0];
                            authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                            if (authorityCertSerialNumber != null) {
                                errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                            }
                        }
                        addError(errorBundle3, size);
                    }
                    try {
                        x509Certificate2.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate2.getNotAfter())});
                        addError(errorBundle2, size);
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate2.getNotBefore())});
                        addError(errorBundle2, size);
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                            if (extensionValue2 != null) {
                                cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                            } else {
                                cRLDistPoint = null;
                            }
                        } catch (AnnotatedException unused7) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                        }
                        try {
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                            if (extensionValue != null) {
                                authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                            } else {
                                authorityInformationAccess = null;
                            }
                        } catch (AnnotatedException unused8) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), size);
                        }
                        Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                        it = cRLDistUrls.iterator();
                        while (it.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                        }
                        it2 = oCSPUrls.iterator();
                        while (it2.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                        }
                        try {
                            i12 = i11;
                            try {
                                checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls, oCSPUrls, size);
                            } catch (CertPathReviewerException e14) {
                                e = e14;
                                addError(e.getErrorMessage(), size);
                            }
                        } catch (CertPathReviewerException e15) {
                            e = e15;
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    if (subjectX500Principal != null && !x509Certificate2.getIssuerX500Principal().equals(subjectX500Principal)) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal.getName(), x509Certificate2.getIssuerX500Principal().getName()}), size);
                    }
                    if (i12 == this.f99274n) {
                        c11 = 5;
                    } else {
                        if (x509Certificate2 != null && x509Certificate2.getVersion() == 1) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                        }
                        try {
                            basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints != null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), size);
                            } else if (!basicConstraints.isCA()) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                            }
                        } catch (AnnotatedException unused9) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), size);
                        }
                        keyUsage = x509Certificate2.getKeyUsage();
                        if (keyUsage != null) {
                            c11 = 5;
                            if (keyUsage.length > 5 || !keyUsage[5]) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                            }
                        } else {
                            c11 = 5;
                        }
                    }
                    subjectX500Principal = x509Certificate2.getSubjectX500Principal();
                    try {
                        nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                        algorithmIdentifier2.getAlgorithm();
                        algorithmIdentifier2.getParameters();
                    } catch (CertPathValidatorException unused10) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pubKeyError"), size);
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = nextWorkingKey;
            }
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate3.getIssuerX500Principal())}));
            trustAnchor = null;
        } catch (CertPathReviewerException e16) {
            e = e16;
            trustAnchor = null;
        } catch (Throwable th3) {
            th = th3;
            trustAnchor = null;
        }
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 != null) {
            trustedCert2 = trustAnchor2.getTrustedCert();
            if (trustedCert2 != null) {
                x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
            } else {
                x500Principal = new X500Principal(trustAnchor2.getCAName());
            }
            if (trustedCert2 != null) {
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
            }
        } else {
            x500Principal = null;
        }
        if (trustAnchor2 != null) {
            trustedCert = trustAnchor2.getTrustedCert();
            if (trustedCert != null) {
                cAPublicKey = trustedCert.getPublicKey();
            } else {
                cAPublicKey = trustAnchor2.getCAPublicKey();
            }
            AlgorithmIdentifier algorithmIdentifier3 = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
            algorithmIdentifier3.getAlgorithm();
            algorithmIdentifier3.getParameters();
        } else {
            trustedCert = null;
            cAPublicKey = null;
        }
        x509Certificate = trustedCert;
        subjectX500Principal = x500Principal;
        nextWorkingKey = cAPublicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
            i11 = this.f99274n - size;
            x509Certificate2 = (X509Certificate) this.certs.get(size);
            if (nextWorkingKey != null) {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
            } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
            } else {
                errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                if (extensionValue3 != null) {
                    generalName = authorityCertIssuer.getNames()[0];
                    authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                    if (authorityCertSerialNumber != null) {
                        errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                    }
                }
                addError(errorBundle3, size);
            }
            x509Certificate2.checkValidity(this.validDate);
            if (this.pkixParams.isRevocationEnabled()) {
                extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                if (extensionValue2 != null) {
                    cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                } else {
                    cRLDistPoint = null;
                }
                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                if (extensionValue != null) {
                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                } else {
                    authorityInformationAccess = null;
                }
                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                it = cRLDistUrls2.iterator();
                while (it.hasNext()) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                }
                it2 = oCSPUrls2.iterator();
                while (it2.hasNext()) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                }
                i12 = i11;
                checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls2, oCSPUrls2, size);
            } else {
                i12 = i11;
            }
            if (subjectX500Principal != null) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal.getName(), x509Certificate2.getIssuerX500Principal().getName()}), size);
            }
            if (i12 == this.f99274n) {
                c11 = 5;
            } else {
                if (x509Certificate2 != null) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                }
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                if (basicConstraints != null) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), size);
                } else if (!basicConstraints.isCA()) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                }
                keyUsage = x509Certificate2.getKeyUsage();
                if (keyUsage != null) {
                    c11 = 5;
                    if (keyUsage.length > 5) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                    } else {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                    }
                } else {
                    c11 = 5;
                }
            }
            subjectX500Principal = x509Certificate2.getSubjectX500Principal();
            nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
            AlgorithmIdentifier algorithmIdentifier4 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
            algorithmIdentifier4.getAlgorithm();
            algorithmIdentifier4.getParameters();
            size--;
            x509Certificate = x509Certificate2;
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = nextWorkingKey;
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e11) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e11.getMessage(), e11, e11.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i11) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z11 = false;
            for (int i12 = 0; i12 < aSN1Sequence.size(); i12++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i12));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i11);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i11);
                            z11 = true;
                        }
                    }
                }
                addNotification(errorBundle, i11);
            }
            return !z11;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i11);
            return false;
        }
    }

    protected void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0239  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    protected void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i11) throws CertPathReviewerException {
        Iterator it;
        X509CRL x509crl;
        X509CRL x509crl2;
        boolean z11;
        boolean z12;
        String str;
        boolean[] keyUsage;
        X509CRL x509crl3;
        X500Principal x500Principal;
        Iterator it2;
        boolean z13;
        ErrorBundle errorBundle;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it3 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i11);
                }
                while (true) {
                    if (!it.hasNext()) {
                        x509crl2 = x509crl;
                        z11 = false;
                        break;
                    }
                    x509crl = (X509CRL) it.next();
                    Date thisUpdate = x509crl.getThisUpdate();
                    Date nextUpdate = x509crl.getNextUpdate();
                    Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                    if (nextUpdate == null || date.before(nextUpdate)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr), i11);
                        x509crl2 = x509crl;
                        z11 = true;
                        break;
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr), i11);
                }
            } catch (AnnotatedException e11) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", new Object[]{e11.getCause().getMessage(), e11.getCause(), e11.getCause().getClass().getName()}), i11);
                it = new ArrayList().iterator();
            }
            x509crl = null;
            if (!z11) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it4 = vector.iterator();
                boolean z14 = z11;
                while (true) {
                    if (!it4.hasNext()) {
                        z12 = z14;
                        break;
                    }
                    try {
                        String str2 = (String) it4.next();
                        X509CRL crl = getCRL(str2);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl3 = x509crl2;
                                x500Principal = issuerX500Principal;
                                it2 = it4;
                                z13 = z14;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str2)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr2);
                                    addNotification(errorBundle, i11);
                                }
                                try {
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr2), i11);
                                    x509crl2 = crl;
                                    z12 = true;
                                    break;
                                } catch (CertPathReviewerException e12) {
                                    e = e12;
                                    z14 = true;
                                    addNotification(e.getErrorMessage(), i11);
                                    it4 = it2;
                                    x509crl2 = x509crl3;
                                    issuerX500Principal = x500Principal;
                                }
                            } else {
                                x509crl3 = x509crl2;
                                try {
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    try {
                                        z13 = z14;
                                        try {
                                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(x500Principal.getName()), new UntrustedUrlInput(str2)});
                                            addNotification(errorBundle, i11);
                                        } catch (CertPathReviewerException e13) {
                                            e = e13;
                                            z14 = z13;
                                            addNotification(e.getErrorMessage(), i11);
                                            it4 = it2;
                                            x509crl2 = x509crl3;
                                            issuerX500Principal = x500Principal;
                                        }
                                    } catch (CertPathReviewerException e14) {
                                        e = e14;
                                        addNotification(e.getErrorMessage(), i11);
                                        it4 = it2;
                                        x509crl2 = x509crl3;
                                        issuerX500Principal = x500Principal;
                                    }
                                } catch (CertPathReviewerException e15) {
                                    e = e15;
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    addNotification(e.getErrorMessage(), i11);
                                    it4 = it2;
                                    x509crl2 = x509crl3;
                                    issuerX500Principal = x500Principal;
                                }
                            }
                        } else {
                            x509crl3 = x509crl2;
                            x500Principal = issuerX500Principal;
                            it2 = it4;
                            z13 = z14;
                        }
                        it4 = it2;
                        x509crl2 = x509crl3;
                        issuerX500Principal = x500Principal;
                        z14 = z13;
                    } catch (CertPathReviewerException e16) {
                        e = e16;
                        x509crl3 = x509crl2;
                    }
                }
            } else {
                z12 = z11;
            }
            if (x509crl2 != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl2.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl2.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                } else {
                                    str = null;
                                }
                            } catch (AnnotatedException e17) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e17);
                            }
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = CertPathValidatorUtilities.crlReasons[7];
                        }
                        LocaleString localeString = new LocaleString(RESOURCE_NAME, str);
                        if (!date.before(revokedCertificate.getRevocationDate())) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                        }
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i11);
                    } else {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i11);
                    }
                    Date nextUpdate3 = x509crl2.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i11);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl2).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509crl2, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it5 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            do {
                                                if (!it5.hasNext()) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                                }
                                                try {
                                                } catch (AnnotatedException e18) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e18);
                                                }
                                            } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it5.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                                        } catch (AnnotatedException e19) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e19);
                                        }
                                    } catch (AnnotatedException e21) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e21);
                                    }
                                } catch (IOException e22) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e22);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e23) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e23);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e24) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e24);
                }
            }
            if (!z12) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e25) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e25);
        }
    }

    protected void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i11) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i11);
    }

    protected void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i11 = this.f99274n;
        this.notifications = new List[i11 + 1];
        this.errors = new List[i11 + 1];
        int i12 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i12 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i12] = new ArrayList();
            this.errors[i12] = new ArrayList();
            i12++;
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i11 = 0; i11 < names.length; i11++) {
                        if (names[i11].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i11].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f99274n;
    }

    public List getErrors(int i11) {
        doChecks();
        return this.errors[i11 + 1];
    }

    public List getNotifications(int i11) {
        doChecks();
        return this.notifications[i11 + 1];
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i11 = 0; i11 < accessDescriptions.length; i11++) {
                if (accessDescriptions[i11].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i11].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 != certificates.size(); i11++) {
                if (!hashSet.contains(certificates.get(i11))) {
                    arrayList.add(certificates.get(i11));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.f99274n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i11 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i11 >= listArr.length) {
                return true;
            }
            if (!listArr[i11].isEmpty()) {
                return false;
            }
            i11++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    protected void addError(ErrorBundle errorBundle, int i11) {
        if (i11 < -1 || i11 >= this.f99274n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i11 + 1].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle, int i11) {
        if (i11 < -1 || i11 >= this.f99274n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i11 + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}
