package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes10.dex */
class Signature {
    final byte[] challengeBits;
    final Proof[] proofs;
    final byte[] salt = new byte[32];

    public static class Proof {
        final byte[] communicatedBits;
        final int[] inputShare;
        final byte[] seed1;
        final byte[] seed2;
        final byte[] view3Commitment;
        final byte[] view3UnruhG;

        Proof(PicnicEngine picnicEngine) {
            int i11 = picnicEngine.seedSizeBytes;
            this.seed1 = new byte[i11];
            this.seed2 = new byte[i11];
            this.inputShare = new int[picnicEngine.stateSizeWords];
            this.communicatedBits = new byte[picnicEngine.andSizeBytes];
            this.view3Commitment = new byte[picnicEngine.digestSizeBytes];
            int i12 = picnicEngine.UnruhGWithInputBytes;
            if (i12 > 0) {
                this.view3UnruhG = new byte[i12];
            } else {
                this.view3UnruhG = null;
            }
        }
    }

    Signature(PicnicEngine picnicEngine) {
        this.challengeBits = new byte[Utils.numBytes(picnicEngine.numMPCRounds * 2)];
        this.proofs = new Proof[picnicEngine.numMPCRounds];
        int i11 = 0;
        while (true) {
            Proof[] proofArr = this.proofs;
            if (i11 >= proofArr.length) {
                return;
            }
            proofArr[i11] = new Proof(picnicEngine);
            i11++;
        }
    }
}
