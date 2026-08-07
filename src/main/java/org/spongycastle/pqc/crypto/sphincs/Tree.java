package org.spongycastle.pqc.crypto.sphincs;

/* JADX INFO: loaded from: classes10.dex */
class Tree {

    static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    Tree() {
    }

    static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i12);
        l_tree(hashFunctions, bArr, i11, bArr5, 0, bArr2, i12);
    }

    static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int i14;
        int i15 = 67;
        for (int i16 = 0; i16 < 7; i16++) {
            int i17 = 0;
            while (true) {
                i14 = i15 >>> 1;
                if (i17 >= i14) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, i12 + (i17 * 32), bArr2, i12 + (i17 * 64), bArr3, i13 + (i16 * 64));
                i17++;
            }
            if ((i15 & 1) != 0) {
                System.arraycopy(bArr2, i12 + ((i15 - 1) * 32), bArr2, (i14 * 32) + i12, 32);
                i14++;
            }
            i15 = i14;
        }
        System.arraycopy(bArr2, i12, bArr, i11, 32);
    }

    static void treehash(HashFunctions hashFunctions, byte[] bArr, int i11, int i12, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i13) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i14 = i12 + 1;
        byte[] bArr4 = new byte[i14 * 32];
        int[] iArr = new int[i14];
        int i15 = (int) (leafaddrVar2.subleaf + ((long) (1 << i12)));
        int i16 = 0;
        while (leafaddrVar2.subleaf < i15) {
            gen_leaf_wots(hashFunctions, bArr4, i16 * 32, bArr3, i13, bArr2, leafaddrVar2);
            iArr[i16] = 0;
            int i17 = i16 + 1;
            while (i17 > 1) {
                int i18 = iArr[i17 - 1];
                int i19 = i17 - 2;
                if (i18 != iArr[i19]) {
                    break;
                }
                int i21 = i19 * 32;
                hashFunctions.hash_2n_n_mask(bArr4, i21, bArr4, i21, bArr3, i13 + ((i18 + 7) * 64));
                iArr[i19] = iArr[i19] + 1;
                i17--;
                i15 = i15;
            }
            leafaddrVar2.subleaf++;
            i16 = i17;
            i15 = i15;
        }
        for (int i22 = 0; i22 < 32; i22++) {
            bArr[i11 + i22] = bArr4[i22];
        }
    }
}
