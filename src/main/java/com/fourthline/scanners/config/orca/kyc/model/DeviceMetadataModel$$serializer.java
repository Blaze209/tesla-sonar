package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.CoordinateModelSerializer;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.h;
import vo0.m1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class DeviceMetadataModel$$serializer implements e0<DeviceMetadataModel> {
    public static final DeviceMetadataModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DeviceMetadataModel$$serializer deviceMetadataModel$$serializer = new DeviceMetadataModel$$serializer();
        INSTANCE = deviceMetadataModel$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.DeviceMetadataModel", deviceMetadataModel$$serializer, 9);
        m1Var.o("ipAddress", false);
        m1Var.o("location", false);
        m1Var.o("language", true);
        m1Var.o("analyticsId", true);
        m1Var.o("region", true);
        m1Var.o("model", true);
        m1Var.o("osVersion", true);
        m1Var.o("sdkVersion", true);
        m1Var.o("osCompromised", true);
        descriptor = m1Var;
    }

    private DeviceMetadataModel$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        z1 z1Var = z1.f119730a;
        return new d[]{a.p(z1Var), a.p(CoordinateModelSerializer.INSTANCE), a.p(z1Var), a.p(z1Var), a.p(z1Var), a.p(z1Var), a.p(z1Var), a.p(z1Var), h.f119620a};
    }

    @Override // ro0.c
    public final DeviceMetadataModel deserialize(uo0.e decoder) {
        boolean zW;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11;
        String str6;
        Object obj;
        String str7;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        int i12 = 7;
        if (cVarB.i()) {
            z1 z1Var = z1.f119730a;
            String str8 = (String) cVarB.v(fVar, 0, z1Var, null);
            Object objV = cVarB.v(fVar, 1, CoordinateModelSerializer.INSTANCE, null);
            String str9 = (String) cVarB.v(fVar, 2, z1Var, null);
            String str10 = (String) cVarB.v(fVar, 3, z1Var, null);
            String str11 = (String) cVarB.v(fVar, 4, z1Var, null);
            String str12 = (String) cVarB.v(fVar, 5, z1Var, null);
            String str13 = (String) cVarB.v(fVar, 6, z1Var, null);
            str2 = (String) cVarB.v(fVar, 7, z1Var, null);
            zW = cVarB.w(fVar, 8);
            str = str13;
            str3 = str12;
            str5 = str10;
            i11 = 511;
            str4 = str11;
            str7 = str9;
            obj = objV;
            str6 = str8;
        } else {
            boolean z11 = true;
            boolean zW2 = false;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Object objV2 = null;
            String str19 = null;
            int i13 = 0;
            String str20 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        i12 = 7;
                        break;
                    case 0:
                        str18 = (String) cVarB.v(fVar, 0, z1.f119730a, str18);
                        i13 |= 1;
                        i12 = 7;
                        break;
                    case 1:
                        objV2 = cVarB.v(fVar, 1, CoordinateModelSerializer.INSTANCE, objV2);
                        i13 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        str19 = (String) cVarB.v(fVar, 2, z1.f119730a, str19);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        str20 = (String) cVarB.v(fVar, 3, z1.f119730a, str20);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        str17 = (String) cVarB.v(fVar, 4, z1.f119730a, str17);
                        i13 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        str16 = (String) cVarB.v(fVar, 5, z1.f119730a, str16);
                        i13 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        str14 = (String) cVarB.v(fVar, 6, z1.f119730a, str14);
                        i13 |= 64;
                        break;
                    case 7:
                        str15 = (String) cVarB.v(fVar, i12, z1.f119730a, str15);
                        i13 |= 128;
                        break;
                    case 8:
                        zW2 = cVarB.w(fVar, 8);
                        i13 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            zW = zW2;
            str = str14;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            str5 = str20;
            i11 = i13;
            str6 = str18;
            obj = objV2;
            str7 = str19;
        }
        cVarB.c(fVar);
        return new DeviceMetadataModel(i11, str6, obj, str7, str5, str4, str3, str, str2, zW, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, DeviceMetadataModel value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        DeviceMetadataModel.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
