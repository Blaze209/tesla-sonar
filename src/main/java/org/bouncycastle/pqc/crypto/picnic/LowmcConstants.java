package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    LowmcConstants() {
    }

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i11) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i11 * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    static int[] ReadFromProperty(Properties properties, String str, int i11) {
        byte[] bArrDecode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < bArrDecode.length / 4; i12++) {
            iArr[i12] = Pack.littleEndianToInt(bArrDecode, i12 * 4);
        }
        return iArr;
    }

    static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int i11 = dataInputStream.readInt();
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            iArr[i12] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != str.length(); i11++) {
            if (str.charAt(i11) != ',') {
                byteArrayOutputStream.write(str.charAt(i11));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i11) {
        KMatrices kMatrices;
        int i12 = picnicEngine.stateSizeBits;
        if (i12 != 128) {
            if (i12 != 129) {
                if (i12 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.KMatrix;
                    }
                } else if (i12 != 255) {
                    if (i12 != 256) {
                        return null;
                    }
                    kMatrices = this.KMatrix;
                }
            }
            kMatrices = this.KMatrix_full;
        } else {
            kMatrices = this.KMatrix;
        }
        return GET_MAT(kMatrices, i11);
    }

    protected KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i11 = picnicEngine.stateSizeBits;
        if (i11 == 129 || ((i11 == 192 && picnicEngine.numRounds == 4) || i11 == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i11) {
        KMatrices kMatrices;
        int i12 = picnicEngine.stateSizeBits;
        if (i12 != 128) {
            if (i12 != 129) {
                if (i12 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.LMatrix;
                    }
                } else if (i12 != 255) {
                    if (i12 != 256) {
                        return null;
                    }
                    kMatrices = this.LMatrix;
                }
            }
            kMatrices = this.LMatrix_full;
        } else {
            kMatrices = this.LMatrix;
        }
        return GET_MAT(kMatrices, i11);
    }

    protected KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i11) {
        int i12 = picnicEngine.stateSizeBits;
        if (i12 == 129 || ((i12 == 192 && picnicEngine.numRounds == 4) || i12 == 255)) {
            return GET_MAT(this.LMatrix_inv, i11);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    protected KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i11) {
        KMatrices kMatrices;
        int i12 = picnicEngine.stateSizeBits;
        if (i12 != 128) {
            if (i12 != 129) {
                if (i12 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.RConstants;
                    }
                } else if (i12 != 255) {
                    if (i12 != 256) {
                        return null;
                    }
                    kMatrices = this.RConstants;
                }
            }
            kMatrices = this.RConstants_full;
        } else {
            kMatrices = this.RConstants;
        }
        return GET_MAT(kMatrices, i11);
    }
}
