package org.spongycastle.pqc.asn1;

import java.math.BigInteger;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.pqc.crypto.gmss.GMSSLeaf;
import org.spongycastle.pqc.crypto.gmss.GMSSParameters;
import org.spongycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.spongycastle.pqc.crypto.gmss.GMSSRootSig;
import org.spongycastle.pqc.crypto.gmss.Treehash;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
            iArr[i11] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i11));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i12 = 0; i12 < size; i12++) {
            bArr[i12] = ((DEROctetString) aSN1Sequence3.getObjectAt(i12)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            bArr2[i13] = ((DEROctetString) aSN1Sequence4.getObjectAt(i13)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i14 = 0; i14 < size3; i14++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i14);
            bArr3[i14] = new byte[aSN1Sequence6.size()][];
            int i15 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i14];
                if (i15 < bArr4.length) {
                    bArr4[i15] = ((DEROctetString) aSN1Sequence6.getObjectAt(i15)).getOctets();
                    i15++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i16 = 0; i16 < size4; i16++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i16);
            bArr5[i16] = new byte[aSN1Sequence8.size()][];
            int i17 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i16];
                if (i17 < bArr6.length) {
                    bArr6[i17] = ((DEROctetString) aSN1Sequence8.getObjectAt(i17)).getOctets();
                    i17++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        BigInteger value = ((ASN1Integer) aSN1Encodable).getValue();
        if (value.compareTo(BigInteger.valueOf(2147483647L)) <= 0 && value.compareTo(BigInteger.valueOf(-2147483648L)) >= 0) {
            return value.intValue();
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + value.toString());
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i11 : iArr) {
            aSN1EncodableVector2.add(new ASN1Integer(i11));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVector3.add(new DEROctetString(bArr8));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVector4.add(new DEROctetString(bArr9));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        for (byte[][] bArr10 : bArr3) {
            int i12 = 0;
            while (true) {
                if (i12 < bArr10.length) {
                    aSN1EncodableVector5.add(new DEROctetString(bArr10[i12]));
                    i12++;
                }
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector5));
            aSN1EncodableVector5 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector6));
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        for (byte[][] bArr11 : bArr4) {
            int i13 = 0;
            while (true) {
                if (i13 < bArr11.length) {
                    aSN1EncodableVector7.add(new DEROctetString(bArr11[i13]));
                    i13++;
                }
            }
            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector7));
            aSN1EncodableVector7 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector8));
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        int i14 = 0;
        while (i14 < treehashArr.length) {
            int i15 = 0;
            while (i15 < treehashArr[i14].length) {
                aSN1EncodableVector11.add(new DERSequence(algorithmIdentifierArr[0]));
                int i16 = treehashArr[i14][i15].getStatInt()[1];
                aSN1EncodableVector12.add(new DEROctetString(treehashArr[i14][i15].getStatByte()[0]));
                aSN1EncodableVector12.add(new DEROctetString(treehashArr[i14][i15].getStatByte()[1]));
                aSN1EncodableVector12.add(new DEROctetString(treehashArr[i14][i15].getStatByte()[2]));
                int i17 = 0;
                while (i17 < i16) {
                    aSN1EncodableVector12.add(new DEROctetString(treehashArr[i14][i15].getStatByte()[i17 + 3]));
                    i17++;
                    treehashArr = treehashArr;
                }
                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector12));
                aSN1EncodableVector12 = new ASN1EncodableVector();
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[0]));
                aSN1EncodableVector13.add(new ASN1Integer(i16));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[2]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[3]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[4]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[5]));
                int i18 = 0;
                while (i18 < i16) {
                    aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[i18 + 6]));
                    i18++;
                    i14 = i14;
                    i15 = i15;
                }
                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector13));
                aSN1EncodableVector13 = new ASN1EncodableVector();
                aSN1EncodableVector10.add(new DERSequence(aSN1EncodableVector11));
                aSN1EncodableVector11 = new ASN1EncodableVector();
                i15++;
                treehashArr = treehashArr;
            }
            aSN1EncodableVector9.add(new DERSequence(aSN1EncodableVector10));
            aSN1EncodableVector10 = new ASN1EncodableVector();
            i14++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector9));
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        int i19 = 0;
        while (i19 < treehashArr2.length) {
            int i21 = 0;
            while (i21 < treehashArr2[i19].length) {
                aSN1EncodableVector16.add(new DERSequence(algorithmIdentifierArr[0]));
                int i22 = treehashArr2[i19][i21].getStatInt()[1];
                aSN1EncodableVector17.add(new DEROctetString(treehashArr2[i19][i21].getStatByte()[0]));
                aSN1EncodableVector17.add(new DEROctetString(treehashArr2[i19][i21].getStatByte()[1]));
                aSN1EncodableVector17.add(new DEROctetString(treehashArr2[i19][i21].getStatByte()[2]));
                for (int i23 = 0; i23 < i22; i23++) {
                    aSN1EncodableVector17.add(new DEROctetString(treehashArr2[i19][i21].getStatByte()[i23 + 3]));
                }
                aSN1EncodableVector16.add(new DERSequence(aSN1EncodableVector17));
                aSN1EncodableVector17 = new ASN1EncodableVector();
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[0]));
                aSN1EncodableVector18.add(new ASN1Integer(i22));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[2]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[3]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[4]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[5]));
                int i24 = 0;
                while (i24 < i22) {
                    aSN1EncodableVector18.add(new ASN1Integer(treehashArr2[i19][i21].getStatInt()[i24 + 6]));
                    i24++;
                    treehashArr2 = treehashArr2;
                    i19 = i19;
                }
                aSN1EncodableVector16.add(new DERSequence(aSN1EncodableVector18));
                aSN1EncodableVector18 = new ASN1EncodableVector();
                aSN1EncodableVector15.add(new DERSequence(aSN1EncodableVector16));
                aSN1EncodableVector16 = new ASN1EncodableVector();
                i21++;
                treehashArr2 = treehashArr2;
                i19 = i19;
            }
            aSN1EncodableVector14.add(new DERSequence(new DERSequence(aSN1EncodableVector15)));
            aSN1EncodableVector15 = new ASN1EncodableVector();
            i19++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector14));
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        for (byte[][] bArr12 : bArr5) {
            int i25 = 0;
            while (true) {
                if (i25 < bArr12.length) {
                    aSN1EncodableVector19.add(new DEROctetString(bArr12[i25]));
                    i25++;
                }
            }
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector19));
            aSN1EncodableVector19 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector20));
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i26 = 0; i26 < vectorArr.length; i26++) {
            for (int i27 = 0; i27 < vectorArr[i26].size(); i27++) {
                aSN1EncodableVector21.add(new DEROctetString((byte[]) vectorArr[i26].elementAt(i27)));
            }
            aSN1EncodableVector22.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector22));
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        for (int i28 = 0; i28 < vectorArr2.length; i28++) {
            for (int i29 = 0; i29 < vectorArr2[i28].size(); i29++) {
                aSN1EncodableVector23.add(new DEROctetString((byte[]) vectorArr2[i28].elementAt(i29)));
            }
            aSN1EncodableVector24.add(new DERSequence(aSN1EncodableVector23));
            aSN1EncodableVector23 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector24));
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        for (int i31 = 0; i31 < vectorArr3.length; i31++) {
            for (int i32 = 0; i32 < vectorArr3[i31].length; i32++) {
                for (int i33 = 0; i33 < vectorArr3[i31][i32].size(); i33++) {
                    aSN1EncodableVector25.add(new DEROctetString((byte[]) vectorArr3[i31][i32].elementAt(i33)));
                }
                aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector25));
                aSN1EncodableVector25 = new ASN1EncodableVector();
            }
            aSN1EncodableVector27.add(new DERSequence(aSN1EncodableVector26));
            aSN1EncodableVector26 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector27));
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        for (int i34 = 0; i34 < vectorArr4.length; i34++) {
            for (int i35 = 0; i35 < vectorArr4[i34].length; i35++) {
                for (int i36 = 0; i36 < vectorArr4[i34][i35].size(); i36++) {
                    aSN1EncodableVector28.add(new DEROctetString((byte[]) vectorArr4[i34][i35].elementAt(i36)));
                }
                aSN1EncodableVector29.add(new DERSequence(aSN1EncodableVector28));
                aSN1EncodableVector28 = new ASN1EncodableVector();
            }
            aSN1EncodableVector30.add(new DERSequence(aSN1EncodableVector29));
            aSN1EncodableVector29 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector30));
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
        for (int i37 = 0; i37 < gMSSLeafArr.length; i37++) {
            aSN1EncodableVector32.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i37].getStatByte();
            aSN1EncodableVector33.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector32.add(new DERSequence(aSN1EncodableVector33));
            aSN1EncodableVector33 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i37].getStatInt();
            aSN1EncodableVector34.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector32.add(new DERSequence(aSN1EncodableVector34));
            aSN1EncodableVector34 = new ASN1EncodableVector();
            aSN1EncodableVector31.add(new DERSequence(aSN1EncodableVector32));
            aSN1EncodableVector32 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector31));
        ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector37 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector38 = new ASN1EncodableVector();
        for (int i38 = 0; i38 < gMSSLeafArr2.length; i38++) {
            aSN1EncodableVector36.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i38].getStatByte();
            aSN1EncodableVector37.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector36.add(new DERSequence(aSN1EncodableVector37));
            aSN1EncodableVector37 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i38].getStatInt();
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector36.add(new DERSequence(aSN1EncodableVector38));
            aSN1EncodableVector38 = new ASN1EncodableVector();
            aSN1EncodableVector35.add(new DERSequence(aSN1EncodableVector36));
            aSN1EncodableVector36 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector35));
        ASN1EncodableVector aSN1EncodableVector39 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        for (int i39 = 0; i39 < gMSSLeafArr3.length; i39++) {
            aSN1EncodableVector40.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i39].getStatByte();
            aSN1EncodableVector41.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector40.add(new DERSequence(aSN1EncodableVector41));
            aSN1EncodableVector41 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i39].getStatInt();
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector40.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector39.add(new DERSequence(aSN1EncodableVector40));
            aSN1EncodableVector40 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector39));
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i41 : iArr2) {
            aSN1EncodableVector43.add(new ASN1Integer(i41));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector43));
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        for (byte[] bArr13 : bArr6) {
            aSN1EncodableVector44.add(new DEROctetString(bArr13));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector44));
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector47 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector48 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector49 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector50 = new ASN1EncodableVector();
        int i42 = 0;
        while (i42 < gMSSRootCalcArr.length) {
            aSN1EncodableVector46.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i43 = gMSSRootCalcArr[i42].getStatInt()[0];
            int i44 = gMSSRootCalcArr[i42].getStatInt()[7];
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i42].getStatByte()[0]));
            int i45 = 0;
            while (i45 < i43) {
                i45++;
                aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i42].getStatByte()[i45]));
            }
            for (int i46 = 0; i46 < i44; i46++) {
                aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i42].getStatByte()[i43 + 1 + i46]));
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector47));
            ASN1EncodableVector aSN1EncodableVector51 = new ASN1EncodableVector();
            aSN1EncodableVector48.add(new ASN1Integer(i43));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[1]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[2]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[3]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[4]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[5]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[6]));
            aSN1EncodableVector48.add(new ASN1Integer(i44));
            for (int i47 = 0; i47 < i43; i47++) {
                aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[i47 + 8]));
            }
            for (int i48 = 0; i48 < i44; i48++) {
                aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i42].getStatInt()[i43 + 8 + i48]));
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector48));
            ASN1EncodableVector aSN1EncodableVector52 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector53 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector54 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector55 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i42].getTreehash() != null) {
                int i49 = 0;
                while (i49 < gMSSRootCalcArr[i42].getTreehash().length) {
                    aSN1EncodableVector53.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i51 = gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[1];
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i42].getTreehash()[i49].getStatByte()[0]));
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i42].getTreehash()[i49].getStatByte()[1]));
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i42].getTreehash()[i49].getStatByte()[2]));
                    int i52 = 0;
                    while (i52 < i51) {
                        aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i42].getTreehash()[i49].getStatByte()[i52 + 3]));
                        i52++;
                        aSN1EncodableVector51 = aSN1EncodableVector51;
                    }
                    ASN1EncodableVector aSN1EncodableVector56 = aSN1EncodableVector51;
                    aSN1EncodableVector53.add(new DERSequence(aSN1EncodableVector54));
                    aSN1EncodableVector54 = new ASN1EncodableVector();
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[0]));
                    aSN1EncodableVector55.add(new ASN1Integer(i51));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[2]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[3]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[4]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[5]));
                    int i53 = 0;
                    while (i53 < i51) {
                        aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i42].getTreehash()[i49].getStatInt()[i53 + 6]));
                        i53++;
                        aSN1EncodableVector52 = aSN1EncodableVector52;
                    }
                    aSN1EncodableVector53.add(new DERSequence(aSN1EncodableVector55));
                    aSN1EncodableVector55 = new ASN1EncodableVector();
                    aSN1EncodableVector49.add(new DERSequence(aSN1EncodableVector53));
                    aSN1EncodableVector53 = new ASN1EncodableVector();
                    i49++;
                    aSN1EncodableVector51 = aSN1EncodableVector56;
                }
            }
            ASN1EncodableVector aSN1EncodableVector57 = aSN1EncodableVector51;
            ASN1EncodableVector aSN1EncodableVector58 = aSN1EncodableVector52;
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector49));
            aSN1EncodableVector49 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector59 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i42].getRetain() != null) {
                for (int i54 = 0; i54 < gMSSRootCalcArr[i42].getRetain().length; i54++) {
                    for (int i55 = 0; i55 < gMSSRootCalcArr[i42].getRetain()[i54].size(); i55++) {
                        aSN1EncodableVector59.add(new DEROctetString((byte[]) gMSSRootCalcArr[i42].getRetain()[i54].elementAt(i55)));
                    }
                    aSN1EncodableVector50.add(new DERSequence(aSN1EncodableVector59));
                    aSN1EncodableVector59 = new ASN1EncodableVector();
                }
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector50));
            aSN1EncodableVector50 = new ASN1EncodableVector();
            aSN1EncodableVector45.add(new DERSequence(aSN1EncodableVector46));
            aSN1EncodableVector46 = new ASN1EncodableVector();
            i42++;
            aSN1EncodableVector47 = aSN1EncodableVector57;
            aSN1EncodableVector48 = aSN1EncodableVector58;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector45));
        ASN1EncodableVector aSN1EncodableVector60 = new ASN1EncodableVector();
        for (byte[] bArr14 : bArr7) {
            aSN1EncodableVector60.add(new DEROctetString(bArr14));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector60));
        ASN1EncodableVector aSN1EncodableVector61 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector62 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector63 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector64 = new ASN1EncodableVector();
        for (int i56 = 0; i56 < gMSSRootSigArr.length; i56++) {
            aSN1EncodableVector62.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i56].getStatByte()[0]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i56].getStatByte()[1]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i56].getStatByte()[2]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i56].getStatByte()[3]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i56].getStatByte()[4]));
            aSN1EncodableVector62.add(new DERSequence(aSN1EncodableVector63));
            aSN1EncodableVector63 = new ASN1EncodableVector();
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[0]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[1]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[2]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[3]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[4]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[5]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[6]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[7]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i56].getStatInt()[8]));
            aSN1EncodableVector62.add(new DERSequence(aSN1EncodableVector64));
            aSN1EncodableVector64 = new ASN1EncodableVector();
            aSN1EncodableVector61.add(new DERSequence(aSN1EncodableVector62));
            aSN1EncodableVector62 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector61));
        ASN1EncodableVector aSN1EncodableVector65 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector66 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector67 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector68 = new ASN1EncodableVector();
        for (int i57 = 0; i57 < gMSSParameters.getHeightOfTrees().length; i57++) {
            aSN1EncodableVector66.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i57]));
            aSN1EncodableVector67.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i57]));
            aSN1EncodableVector68.add(new ASN1Integer(gMSSParameters.getK()[i57]));
        }
        aSN1EncodableVector65.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector66));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector67));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector68));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector65));
        ASN1EncodableVector aSN1EncodableVector69 = new ASN1EncodableVector();
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            aSN1EncodableVector69.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector69));
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
