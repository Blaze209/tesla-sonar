package com.fourthline.core.internal.devicedata;

import java.util.List;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;
import vo0.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/core/internal/devicedata/MotionFrame.$serializer", "Lvo0/e0;", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/core/internal/devicedata/MotionFrame;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/core/internal/devicedata/MotionFrame;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class MotionFrame$$serializer implements e0<MotionFrame> {
    public static final MotionFrame$$serializer INSTANCE;
    private static final f descriptor;

    static {
        MotionFrame$$serializer motionFrame$$serializer = new MotionFrame$$serializer();
        INSTANCE = motionFrame$$serializer;
        m1 m1Var = new m1("com.fourthline.core.internal.devicedata.MotionFrame", motionFrame$$serializer, 6);
        m1Var.o("attitude", false);
        m1Var.o("rotationRate", false);
        m1Var.o("gravity", false);
        m1Var.o("acceleration", false);
        m1Var.o("heading", false);
        m1Var.o("timestamp", false);
        descriptor = m1Var;
    }

    private MotionFrame$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        d<?>[] dVarArr = MotionFrame.f24119g;
        return new d[]{dVarArr[0], dVarArr[1], dVarArr[2], dVarArr[3], t.f119690a, dVarArr[5]};
    }

    @Override // ro0.c
    public final MotionFrame deserialize(uo0.e decoder) {
        int i11;
        List list;
        List list2;
        List list3;
        double d11;
        List list4;
        long jLongValue;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        d[] dVarArr = MotionFrame.f24119g;
        int i12 = 4;
        int i13 = 1;
        int i14 = 0;
        List list5 = null;
        if (cVarB.i()) {
            List list6 = (List) cVarB.n(fVar, 0, dVarArr[0], null);
            List list7 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
            List list8 = (List) cVarB.n(fVar, 2, dVarArr[2], null);
            List list9 = (List) cVarB.n(fVar, 3, dVarArr[3], null);
            double dS = cVarB.s(fVar, 4);
            i11 = 63;
            list = list6;
            jLongValue = ((Number) cVarB.n(fVar, 5, dVarArr[5], 0L)).longValue();
            list4 = list9;
            list3 = list8;
            list2 = list7;
            d11 = dS;
        } else {
            double dS2 = 0.0d;
            int i15 = 1;
            int i16 = 0;
            List list10 = null;
            long jLongValue2 = 0;
            List list11 = null;
            List list12 = null;
            while (i15 != 0) {
                int i17 = i14;
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        i14 = i17;
                        i15 = i14;
                        i12 = 4;
                        break;
                    case 0:
                        list5 = (List) cVarB.n(fVar, i17, dVarArr[i17], list5);
                        i16 |= 1;
                        i13 = i13;
                        i14 = i17;
                        i12 = 4;
                        break;
                    case 1:
                        int i18 = i13;
                        list11 = (List) cVarB.n(fVar, i18, dVarArr[i18], list11);
                        i16 |= 2;
                        i13 = i18;
                        i14 = i17;
                        break;
                    case 2:
                        list12 = (List) cVarB.n(fVar, 2, dVarArr[2], list12);
                        i16 |= 4;
                        i14 = i17;
                        i13 = i13;
                        break;
                    case 3:
                        list10 = (List) cVarB.n(fVar, 3, dVarArr[3], list10);
                        i16 |= 8;
                        i14 = i17;
                        i13 = i13;
                        break;
                    case 4:
                        dS2 = cVarB.s(fVar, i12);
                        i16 |= 16;
                        i14 = i17;
                        break;
                    case 5:
                        jLongValue2 = ((Number) cVarB.n(fVar, 5, dVarArr[5], Long.valueOf(jLongValue2))).longValue();
                        i16 |= 32;
                        i14 = i17;
                        i13 = i13;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i16;
            list = list5;
            list2 = list11;
            list3 = list12;
            d11 = dS2;
            list4 = list10;
            jLongValue = jLongValue2;
        }
        cVarB.c(fVar);
        return new MotionFrame(i11, list, list2, list3, list4, d11, jLongValue, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, MotionFrame value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        MotionFrame.write$Self$fourthline_core_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
