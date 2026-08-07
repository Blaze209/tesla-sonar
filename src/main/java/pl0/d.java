package pl0;

import bo0.j;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lpl0/d;", "", "", "controlFrame", "", "opcode", "<init>", "(Ljava/lang/String;IZI)V", "Z", "getControlFrame", "()Z", "I", "getOpcode", "()I", "Companion", "a", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum d {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);

    private static final d[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;

    static {
        d dVar;
        d[] dVarArrValues = values();
        if (dVarArrValues.length == 0) {
            dVar = null;
        } else {
            dVar = dVarArrValues[0];
            int iU0 = n.u0(dVarArrValues);
            if (iU0 != 0) {
                int i11 = dVar.opcode;
                s0 it = new j(1, iU0).iterator();
                while (it.hasNext()) {
                    d dVar2 = dVarArrValues[it.nextInt()];
                    int i12 = dVar2.opcode;
                    if (i11 < i12) {
                        dVar = dVar2;
                        i11 = i12;
                    }
                }
            }
        }
        s.h(dVar);
        int i13 = dVar.opcode;
        maxOpcode = i13;
        int i14 = i13 + 1;
        d[] dVarArr = new d[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            d[] dVarArrValues2 = values();
            int length = dVarArrValues2.length;
            d dVar3 = null;
            int i16 = 0;
            boolean z11 = false;
            while (true) {
                if (i16 >= length) {
                    if (z11) {
                        break;
                    }
                } else {
                    d dVar4 = dVarArrValues2[i16];
                    if (dVar4.opcode == i15) {
                        if (!z11) {
                            z11 = true;
                            dVar3 = dVar4;
                        }
                    }
                    i16++;
                }
                dVar3 = null;
                break;
            }
            dVarArr[i15] = dVar3;
        }
        byOpcodeArray = dVarArr;
    }

    d(boolean z11, int i11) {
        this.controlFrame = z11;
        this.opcode = i11;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}
