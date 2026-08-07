package com.fourthline.scanners.config;

import java.util.List;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.j0;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/IdDocument.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/IdDocument;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/IdDocument;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/IdDocument;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class IdDocument$$serializer implements e0<IdDocument> {
    public static final IdDocument$$serializer INSTANCE;
    private static final f descriptor;

    static {
        IdDocument$$serializer idDocument$$serializer = new IdDocument$$serializer();
        INSTANCE = idDocument$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.IdDocument", idDocument$$serializer, 4);
        m1Var.o("type", false);
        m1Var.o("nationalities", false);
        m1Var.o("nfcIssueDate", true);
        m1Var.o("validityPeriod", true);
        descriptor = m1Var;
    }

    private IdDocument$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        d<?>[] dVarArr = IdDocument.$childSerializers;
        z1 z1Var = z1.f119730a;
        return new d[]{z1Var, dVarArr[1], a.p(z1Var), a.p(j0.f119632a)};
    }

    @Override // ro0.c
    public final IdDocument deserialize(uo0.e decoder) {
        int i11;
        String str;
        List list;
        String str2;
        Integer num;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        d[] dVarArr = IdDocument.$childSerializers;
        String strT = null;
        if (cVarB.i()) {
            String strT2 = cVarB.t(fVar, 0);
            List list2 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
            String str3 = (String) cVarB.v(fVar, 2, z1.f119730a, null);
            list = list2;
            str = strT2;
            num = (Integer) cVarB.v(fVar, 3, j0.f119632a, null);
            str2 = str3;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            List list3 = null;
            String str4 = null;
            Integer num2 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    strT = cVarB.t(fVar, 0);
                    i12 |= 1;
                } else if (iA == 1) {
                    list3 = (List) cVarB.n(fVar, 1, dVarArr[1], list3);
                    i12 |= 2;
                } else if (iA == 2) {
                    str4 = (String) cVarB.v(fVar, 2, z1.f119730a, str4);
                    i12 |= 4;
                } else {
                    if (iA != 3) {
                        throw new UnknownFieldException(iA);
                    }
                    num2 = (Integer) cVarB.v(fVar, 3, j0.f119632a, num2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = strT;
            list = list3;
            str2 = str4;
            num = num2;
        }
        cVarB.c(fVar);
        return new IdDocument(i11, str, list, str2, num, (v1) null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, IdDocument value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        IdDocument.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
