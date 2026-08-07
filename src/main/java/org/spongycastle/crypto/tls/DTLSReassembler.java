package org.spongycastle.crypto.tls;

import java.util.Vector;

/* JADX INFO: loaded from: classes10.dex */
class DTLSReassembler {
    private byte[] body;
    private Vector missing;
    private short msg_type;

    private static class Range {
        private int end;
        private int start;

        Range(int i11, int i12) {
            this.start = i11;
            this.end = i12;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }

        public void setEnd(int i11) {
            this.end = i11;
        }

        public void setStart(int i11) {
            this.start = i11;
        }
    }

    DTLSReassembler(short s11, int i11) {
        Vector vector = new Vector();
        this.missing = vector;
        this.msg_type = s11;
        this.body = new byte[i11];
        vector.addElement(new Range(0, i11));
    }

    void contributeFragment(short s11, int i11, byte[] bArr, int i12, int i13, int i14) {
        int i15 = i13 + i14;
        if (this.msg_type == s11 && this.body.length == i11 && i15 <= i11) {
            int i16 = 0;
            if (i14 == 0) {
                if (i13 == 0 && !this.missing.isEmpty() && ((Range) this.missing.firstElement()).getEnd() == 0) {
                    this.missing.removeElementAt(0);
                    return;
                }
                return;
            }
            while (i16 < this.missing.size()) {
                Range range = (Range) this.missing.elementAt(i16);
                if (range.getStart() >= i15) {
                    return;
                }
                if (range.getEnd() > i13) {
                    int iMax = Math.max(range.getStart(), i13);
                    int iMin = Math.min(range.getEnd(), i15);
                    System.arraycopy(bArr, (i12 + iMax) - i13, this.body, iMax, iMin - iMax);
                    if (iMax != range.getStart()) {
                        if (iMin != range.getEnd()) {
                            i16++;
                            this.missing.insertElementAt(new Range(iMin, range.getEnd()), i16);
                        }
                        range.setEnd(iMax);
                    } else if (iMin == range.getEnd()) {
                        this.missing.removeElementAt(i16);
                        i16--;
                    } else {
                        range.setStart(iMin);
                    }
                }
                i16++;
            }
        }
    }

    byte[] getBodyIfComplete() {
        if (this.missing.isEmpty()) {
            return this.body;
        }
        return null;
    }

    short getMsgType() {
        return this.msg_type;
    }

    void reset() {
        this.missing.removeAllElements();
        this.missing.addElement(new Range(0, this.body.length));
    }
}
