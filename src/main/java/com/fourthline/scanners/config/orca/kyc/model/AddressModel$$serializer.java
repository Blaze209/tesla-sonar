package com.fourthline.scanners.config.orca.kyc.model;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/AddressModel.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AddressModel$$serializer implements e0<AddressModel> {
    public static final AddressModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AddressModel$$serializer addressModel$$serializer = new AddressModel$$serializer();
        INSTANCE = addressModel$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.AddressModel", addressModel$$serializer, 7);
        m1Var.o("street", true);
        m1Var.o("streetNumber", true);
        m1Var.o("streetNumberSuffix", true);
        m1Var.o("postalCode", true);
        m1Var.o("city", true);
        m1Var.o("countryCode", true);
        m1Var.o("region", true);
        descriptor = m1Var;
    }

    private AddressModel$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        z1 z1Var = z1.f119730a;
        return new d[]{a.p(z1Var), a.p(j0.f119632a), a.p(z1Var), a.p(z1Var), a.p(z1Var), a.p(z1Var), a.p(z1Var)};
    }

    @Override // ro0.c
    public final AddressModel deserialize(uo0.e decoder) {
        int i11;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        int i12 = 6;
        String str7 = null;
        if (cVarB.i()) {
            z1 z1Var = z1.f119730a;
            String str8 = (String) cVarB.v(fVar, 0, z1Var, null);
            Integer num2 = (Integer) cVarB.v(fVar, 1, j0.f119632a, null);
            String str9 = (String) cVarB.v(fVar, 2, z1Var, null);
            String str10 = (String) cVarB.v(fVar, 3, z1Var, null);
            String str11 = (String) cVarB.v(fVar, 4, z1Var, null);
            String str12 = (String) cVarB.v(fVar, 5, z1Var, null);
            str = (String) cVarB.v(fVar, 6, z1Var, null);
            i11 = 127;
            str6 = str12;
            str4 = str10;
            str5 = str11;
            str3 = str9;
            num = num2;
            str2 = str8;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str13 = null;
            Integer num3 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        i12 = 6;
                        break;
                    case 0:
                        str7 = (String) cVarB.v(fVar, 0, z1.f119730a, str7);
                        i13 |= 1;
                        i12 = 6;
                        break;
                    case 1:
                        num3 = (Integer) cVarB.v(fVar, 1, j0.f119632a, num3);
                        i13 |= 2;
                        i12 = 6;
                        break;
                    case 2:
                        str14 = (String) cVarB.v(fVar, 2, z1.f119730a, str14);
                        i13 |= 4;
                        break;
                    case 3:
                        str15 = (String) cVarB.v(fVar, 3, z1.f119730a, str15);
                        i13 |= 8;
                        break;
                    case 4:
                        str16 = (String) cVarB.v(fVar, 4, z1.f119730a, str16);
                        i13 |= 16;
                        break;
                    case 5:
                        str17 = (String) cVarB.v(fVar, 5, z1.f119730a, str17);
                        i13 |= 32;
                        break;
                    case 6:
                        str13 = (String) cVarB.v(fVar, i12, z1.f119730a, str13);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i13;
            str = str13;
            str2 = str7;
            num = num3;
            str3 = str14;
            str4 = str15;
            str5 = str16;
            str6 = str17;
        }
        cVarB.c(fVar);
        return new AddressModel(i11, str2, num, str3, str4, str5, str6, str, (v1) null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, AddressModel value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        AddressModel.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
