package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes10.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f99112l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i11, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j11, long j12) {
        super(true);
        this.index = 0L;
        this.f99112l = i11;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j11;
        this.indexLimit = j12;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i11 = dataInputStream.readInt();
            long j11 = dataInputStream.readLong();
            long j12 = dataInputStream.readLong();
            boolean z11 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(i11, arrayList, arrayList2, j11, j12, z11);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return hSSPrivateKeyParameters;
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th2;
                }
                dataInputStream2.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    protected Object clone() {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.f99112l == hSSPrivateKeyParameters.f99112l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i11) {
        HSSPrivateKeyParameters hSSPrivateKeyParametersMakeCopy;
        synchronized (this) {
            try {
                long j11 = i11;
                if (getUsagesRemaining() < j11) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j12 = this.index;
                this.index = j11 + j12;
                hSSPrivateKeyParametersMakeCopy = makeCopy(new HSSPrivateKeyParameters(this.f99112l, new ArrayList(getKeys()), new ArrayList(getSig()), j12, j12 + j11, true));
                resetKeyToIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hSSPrivateKeyParametersMakeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l11 = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i11 = l11 - 1;
                lMSPrivateKeyParameters = getKeys().get(i11);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i11];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    lMSSignedPubKeyArr[i12] = new LMSSignedPubKey(sig.get(i12), keys.get(i13).getPublicKey());
                    i12 = i13;
                }
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e11) {
            throw new IllegalStateException("unable to encode signature: " + e11.getMessage(), e11);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.f99112l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<LMSSignature> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                composerBool.bytes(it2.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    long getIndexLimit() {
        return this.indexLimit;
    }

    synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.f99112l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i11 = 0; i11 < size; i11++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i11);
            lMSParametersArr[i11] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.f99112l, getRootKey().getPublicKey());
    }

    LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.indexLimit - this.index;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f99112l * 31) + (this.isShard ? 1 : 0)) * 31) + this.keys.hashCode()) * 31) + this.sig.hashCode()) * 31;
        long j11 = this.indexLimit;
        int i11 = (iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.index;
        return i11 + ((int) (j12 ^ (j12 >>> 32)));
    }

    synchronized void incIndex() {
        this.index++;
    }

    boolean isShard() {
        return this.isShard;
    }

    void replaceConsumedKey(int i11) {
        int i12 = i11 - 1;
        LMOtsPrivateKey currentOTSKey = this.keys.get(i12).getCurrentOTSKey();
        int n11 = currentOTSKey.getParameter().getN();
        SeedDerive derivationFunction = currentOTSKey.getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[n11];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[n11];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i11);
        arrayList.set(i11, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i12, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i12), ((LMSPrivateKeyParameters) arrayList.get(i11)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    void resetKeyToIndex() {
        boolean z11;
        List<LMSPrivateKeyParameters> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((long) ((1 << sigParameters.getH()) - 1)) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) keys.toArray(new LMSPrivateKeyParameters[keys.size()]);
        List<LMSSignature> list = this.sig;
        LMSSignature[] lMSSignatureArr = (LMSSignature[]) list.toArray(new LMSSignature[list.size()]);
        LMSPrivateKeyParameters rootKey = getRootKey();
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = LMS.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters = lMSPrivateKeyParametersArr[i12];
            int n11 = lMSPrivateKeyParameters.getOtsParameters().getN();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[n11];
            SeedDerive seedDerive = new SeedDerive(lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret(), DigestUtil.getDigest(lMSPrivateKeyParameters.getOtsParameters()));
            seedDerive.setQ((int) jArr[i12]);
            seedDerive.setJ(-2);
            seedDerive.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[n11];
            seedDerive.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z12 = i11 >= size + (-1) ? jArr[i11] == ((long) lMSPrivateKeyParametersArr[i11].getIndex()) : jArr[i11] == ((long) (lMSPrivateKeyParametersArr[i11].getIndex() - 1));
            if (Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i11].getI()) && Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i11].getMasterSecret())) {
                if (!z12) {
                    lMSPrivateKeyParametersArr[i11] = LMS.generateKeys(keys.get(i11).getSigParameters(), keys.get(i11).getOtsParameters(), (int) jArr[i11], bArr, bArr2);
                }
                i11++;
            } else {
                LMSPrivateKeyParameters lMSPrivateKeyParametersGenerateKeys = LMS.generateKeys(keys.get(i11).getSigParameters(), keys.get(i11).getOtsParameters(), (int) jArr[i11], bArr, bArr2);
                lMSPrivateKeyParametersArr[i11] = lMSPrivateKeyParametersGenerateKeys;
                lMSSignatureArr[i12] = LMS.generateSign(lMSPrivateKeyParametersArr[i12], lMSPrivateKeyParametersGenerateKeys.getPublicKey().toByteArray());
            }
            z11 = true;
            i11++;
        }
        if (z11) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    protected void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i11, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j11, long j12, boolean z11) {
        super(true);
        this.index = 0L;
        this.f99112l = i11;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j11;
        this.indexLimit = j12;
        this.isShard = z11;
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }
}
