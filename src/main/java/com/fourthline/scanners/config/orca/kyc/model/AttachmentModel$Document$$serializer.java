package com.fourthline.scanners.config.orca.kyc.model;

import ch.qos.logback.core.joran.action.Action;
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
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/AttachmentModel.Document.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AttachmentModel$Document$$serializer implements e0<AttachmentModel.Document> {
    public static final AttachmentModel$Document$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AttachmentModel$Document$$serializer attachmentModel$Document$$serializer = new AttachmentModel$Document$$serializer();
        INSTANCE = attachmentModel$Document$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.AttachmentModel.Document", attachmentModel$Document$$serializer, 6);
        m1Var.o("image", true);
        m1Var.o(Action.FILE_ATTRIBUTE, true);
        m1Var.o("fileSide", true);
        m1Var.o("isAngled", true);
        m1Var.o("timestamp", true);
        m1Var.o("location", true);
        descriptor = m1Var;
    }

    private AttachmentModel$Document$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        z1 z1Var = z1.f119730a;
        return new d[]{a.p(z1Var), a.p(AttachmentModel$LocalFileAttachmentModel$$serializer.INSTANCE), a.p(z1Var), h.f119620a, a.p(z1Var), a.p(CoordinateModel$$serializer.INSTANCE)};
    }

    @Override // ro0.c
    public final AttachmentModel.Document deserialize(uo0.e decoder) {
        boolean z11;
        int i11;
        String str;
        AttachmentModel.LocalFileAttachmentModel localFileAttachmentModel;
        String str2;
        String str3;
        CoordinateModel coordinateModel;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        int i12 = 5;
        if (cVarB.i()) {
            z1 z1Var = z1.f119730a;
            String str4 = (String) cVarB.v(fVar, 0, z1Var, null);
            AttachmentModel.LocalFileAttachmentModel localFileAttachmentModel2 = (AttachmentModel.LocalFileAttachmentModel) cVarB.v(fVar, 1, AttachmentModel$LocalFileAttachmentModel$$serializer.INSTANCE, null);
            String str5 = (String) cVarB.v(fVar, 2, z1Var, null);
            boolean zW = cVarB.w(fVar, 3);
            str3 = (String) cVarB.v(fVar, 4, z1Var, null);
            coordinateModel = (CoordinateModel) cVarB.v(fVar, 5, CoordinateModel$$serializer.INSTANCE, null);
            z11 = zW;
            i11 = 63;
            str2 = str5;
            localFileAttachmentModel = localFileAttachmentModel2;
            str = str4;
        } else {
            boolean z12 = true;
            boolean zW2 = false;
            String str6 = null;
            AttachmentModel.LocalFileAttachmentModel localFileAttachmentModel3 = null;
            String str7 = null;
            String str8 = null;
            CoordinateModel coordinateModel2 = null;
            int i13 = 0;
            while (z12) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z12 = false;
                        i12 = 5;
                        break;
                    case 0:
                        str6 = (String) cVarB.v(fVar, 0, z1.f119730a, str6);
                        i13 |= 1;
                        i12 = 5;
                        break;
                    case 1:
                        localFileAttachmentModel3 = (AttachmentModel.LocalFileAttachmentModel) cVarB.v(fVar, 1, AttachmentModel$LocalFileAttachmentModel$$serializer.INSTANCE, localFileAttachmentModel3);
                        i13 |= 2;
                        break;
                    case 2:
                        str7 = (String) cVarB.v(fVar, 2, z1.f119730a, str7);
                        i13 |= 4;
                        break;
                    case 3:
                        zW2 = cVarB.w(fVar, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        str8 = (String) cVarB.v(fVar, 4, z1.f119730a, str8);
                        i13 |= 16;
                        break;
                    case 5:
                        coordinateModel2 = (CoordinateModel) cVarB.v(fVar, i12, CoordinateModel$$serializer.INSTANCE, coordinateModel2);
                        i13 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            z11 = zW2;
            i11 = i13;
            str = str6;
            localFileAttachmentModel = localFileAttachmentModel3;
            str2 = str7;
            str3 = str8;
            coordinateModel = coordinateModel2;
        }
        cVarB.c(fVar);
        return new AttachmentModel.Document(i11, str, localFileAttachmentModel, str2, z11, str3, coordinateModel, (v1) null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, AttachmentModel.Document value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        AttachmentModel.Document.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
