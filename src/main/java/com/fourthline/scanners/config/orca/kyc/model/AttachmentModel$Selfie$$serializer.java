package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.UUIDSerializer;
import java.util.UUID;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/AttachmentModel.Selfie.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AttachmentModel$Selfie$$serializer implements e0<AttachmentModel.Selfie> {
    public static final AttachmentModel$Selfie$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AttachmentModel$Selfie$$serializer attachmentModel$Selfie$$serializer = new AttachmentModel$Selfie$$serializer();
        INSTANCE = attachmentModel$Selfie$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.AttachmentModel.Selfie", attachmentModel$Selfie$$serializer, 5);
        m1Var.o("image", true);
        m1Var.o("timestamp", true);
        m1Var.o("location", true);
        m1Var.o("videoRecording", true);
        m1Var.o("videoUUID", true);
        descriptor = m1Var;
    }

    private AttachmentModel$Selfie$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        z1 z1Var = z1.f119730a;
        return new d[]{a.p(z1Var), a.p(z1Var), a.p(CoordinateModel$$serializer.INSTANCE), a.p(VideoRecordingModel$$serializer.INSTANCE), UUIDSerializer.INSTANCE};
    }

    @Override // ro0.c
    public final AttachmentModel.Selfie deserialize(uo0.e decoder) {
        int i11;
        String str;
        String str2;
        CoordinateModel coordinateModel;
        VideoRecordingModel videoRecordingModel;
        UUID uuid;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        String str3 = null;
        if (cVarB.i()) {
            z1 z1Var = z1.f119730a;
            String str4 = (String) cVarB.v(fVar, 0, z1Var, null);
            String str5 = (String) cVarB.v(fVar, 1, z1Var, null);
            CoordinateModel coordinateModel2 = (CoordinateModel) cVarB.v(fVar, 2, CoordinateModel$$serializer.INSTANCE, null);
            str2 = str5;
            videoRecordingModel = (VideoRecordingModel) cVarB.v(fVar, 3, VideoRecordingModel$$serializer.INSTANCE, null);
            uuid = (UUID) cVarB.n(fVar, 4, UUIDSerializer.INSTANCE, null);
            coordinateModel = coordinateModel2;
            i11 = 31;
            str = str4;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str6 = null;
            CoordinateModel coordinateModel3 = null;
            VideoRecordingModel videoRecordingModel2 = null;
            UUID uuid2 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    str3 = (String) cVarB.v(fVar, 0, z1.f119730a, str3);
                    i12 |= 1;
                } else if (iA == 1) {
                    str6 = (String) cVarB.v(fVar, 1, z1.f119730a, str6);
                    i12 |= 2;
                } else if (iA == 2) {
                    coordinateModel3 = (CoordinateModel) cVarB.v(fVar, 2, CoordinateModel$$serializer.INSTANCE, coordinateModel3);
                    i12 |= 4;
                } else if (iA == 3) {
                    videoRecordingModel2 = (VideoRecordingModel) cVarB.v(fVar, 3, VideoRecordingModel$$serializer.INSTANCE, videoRecordingModel2);
                    i12 |= 8;
                } else {
                    if (iA != 4) {
                        throw new UnknownFieldException(iA);
                    }
                    uuid2 = (UUID) cVarB.n(fVar, 4, UUIDSerializer.INSTANCE, uuid2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str6;
            coordinateModel = coordinateModel3;
            videoRecordingModel = videoRecordingModel2;
            uuid = uuid2;
        }
        cVarB.c(fVar);
        return new AttachmentModel.Selfie(i11, str, str2, coordinateModel, videoRecordingModel, uuid, (v1) null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, AttachmentModel.Selfie value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        AttachmentModel.Selfie.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
