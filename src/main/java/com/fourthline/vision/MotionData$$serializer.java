package com.fourthline.vision;

import java.util.List;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import to0.f;
import vo0.e0;
import vo0.h;
import vo0.j0;
import vo0.m1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/vision/MotionData.$serializer", "Lvo0/e0;", "Lcom/fourthline/vision/MotionData;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/vision/MotionData;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/vision/MotionData;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class MotionData$$serializer implements e0<MotionData> {
    public static final int $stable;
    public static final MotionData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        MotionData$$serializer motionData$$serializer = new MotionData$$serializer();
        INSTANCE = motionData$$serializer;
        $stable = 8;
        m1 m1Var = new m1("com.fourthline.vision.MotionData", motionData$$serializer, 5);
        m1Var.o("videoStartTimestamp", false);
        m1Var.o("motionFrames", false);
        m1Var.o("version", true);
        m1Var.o("platform", true);
        m1Var.o("attitudeIsAbsolute", true);
        descriptor = m1Var;
    }

    private MotionData$$serializer() {
    }

    @Override // vo0.e0
    public final ro0.d<?>[] childSerializers() {
        ro0.d<?>[] dVarArr = MotionData.f37529f;
        return new ro0.d[]{dVarArr[0], dVarArr[1], j0.f119632a, z1.f119730a, h.f119620a};
    }

    @Override // ro0.c
    public final MotionData deserialize(uo0.e decoder) {
        int iE;
        boolean zW;
        int i11;
        long j11;
        List list;
        String strT;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        uo0.c cVarB = decoder.b(fVar);
        ro0.d[] dVarArr = MotionData.f37529f;
        int i12 = 0;
        if (cVarB.i()) {
            long jLongValue = ((Number) cVarB.n(fVar, 0, dVarArr[0], 0L)).longValue();
            List list2 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
            iE = cVarB.e(fVar, 2);
            list = list2;
            strT = cVarB.t(fVar, 3);
            zW = cVarB.w(fVar, 4);
            i11 = 31;
            j11 = jLongValue;
        } else {
            int i13 = 1;
            iE = 0;
            List list3 = null;
            String strT2 = null;
            long jLongValue2 = 0;
            boolean zW2 = false;
            int i14 = 0;
            while (i13 != 0) {
                int i15 = i12;
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    i12 = i15;
                    i13 = i12;
                } else if (iA != 0) {
                    if (iA == 1) {
                        list3 = (List) cVarB.n(fVar, 1, dVarArr[1], list3);
                        i14 |= 2;
                    } else if (iA == 2) {
                        iE = cVarB.e(fVar, 2);
                        i14 |= 4;
                    } else if (iA == 3) {
                        strT2 = cVarB.t(fVar, 3);
                        i14 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        zW2 = cVarB.w(fVar, 4);
                        i14 |= 16;
                    }
                    i12 = i15;
                } else {
                    i14 |= 1;
                    i12 = i15;
                    jLongValue2 = ((Number) cVarB.n(fVar, i15, dVarArr[i15], Long.valueOf(jLongValue2))).longValue();
                }
            }
            zW = zW2;
            i11 = i14;
            j11 = jLongValue2;
            list = list3;
            strT = strT2;
        }
        int i16 = iE;
        cVarB.c(fVar);
        return new MotionData(i11, j11, list, i16, strT, zW, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, MotionData value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        MotionData.write$Self$fourthline_vision_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public ro0.d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
