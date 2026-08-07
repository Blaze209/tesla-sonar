package ch.qos.logback.classic.pattern;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i11) {
        this.targetLength = i11;
    }

    static int computeDotIndexes(String str, int[] iArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iIndexOf = str.indexOf(46, i11);
            if (iIndexOf == -1 || i12 >= 16) {
                break;
            }
            iArr[i12] = iIndexOf;
            i12++;
            i11 = iIndexOf + 1;
        }
        return i12;
    }

    static void printArray(String str, int[] iArr) {
        System.out.print(str);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            PrintStream printStream = System.out;
            if (i11 == 0) {
                printStream.print(iArr[i11]);
            } else {
                printStream.print(", " + iArr[i11]);
            }
        }
        System.out.println();
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String strSubstring;
        StringBuilder sb2 = new StringBuilder(this.targetLength);
        if (str == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (str.length() >= this.targetLength) {
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int iComputeDotIndexes = computeDotIndexes(str, iArr);
            if (iComputeDotIndexes != 0) {
                computeLengthArray(str, iArr, iArr2, iComputeDotIndexes);
                for (int i11 = 0; i11 <= iComputeDotIndexes; i11++) {
                    if (i11 == 0) {
                        strSubstring = str.substring(0, iArr2[i11] - 1);
                    } else {
                        int i12 = iArr[i11 - 1];
                        strSubstring = str.substring(i12, iArr2[i11] + i12);
                    }
                    sb2.append(strSubstring);
                }
                return sb2.toString();
            }
        }
        return str;
    }

    void computeLengthArray(String str, int[] iArr, int[] iArr2, int i11) {
        int length = str.length() - this.targetLength;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = (iArr[i12] - (i12 > 0 ? iArr[i12 - 1] : -1)) - 1;
            int i14 = (length <= 0 || i13 < 1) ? i13 : 1;
            length -= i13 - i14;
            iArr2[i12] = i14 + 1;
            i12++;
        }
        iArr2[i11] = str.length() - iArr[i11 - 1];
    }
}
