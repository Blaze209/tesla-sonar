package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.UUIDSerializer;
import com.fourthline.scanners.config.orca.kyc.model.serialization.UriSerializer;
import java.net.URI;
import java.util.UUID;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class QesAttachmentModel$$serializer implements e0<QesAttachmentModel> {
    public static final QesAttachmentModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        QesAttachmentModel$$serializer qesAttachmentModel$$serializer = new QesAttachmentModel$$serializer();
        INSTANCE = qesAttachmentModel$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.QesAttachmentModel", qesAttachmentModel$$serializer, 2);
        m1Var.o("id", false);
        m1Var.o("fileUrl", false);
        descriptor = m1Var;
    }

    private QesAttachmentModel$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        return new d[]{UUIDSerializer.INSTANCE, UriSerializer.INSTANCE};
    }

    @Override // ro0.c
    public final QesAttachmentModel deserialize(uo0.e decoder) {
        UUID uuid;
        URI uri;
        int i11;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        if (cVarB.i()) {
            uuid = (UUID) cVarB.n(fVar, 0, UUIDSerializer.INSTANCE, null);
            uri = (URI) cVarB.n(fVar, 1, UriSerializer.INSTANCE, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            uuid = null;
            URI uri2 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    uuid = (UUID) cVarB.n(fVar, 0, UUIDSerializer.INSTANCE, uuid);
                    i12 |= 1;
                } else {
                    if (iA != 1) {
                        throw new UnknownFieldException(iA);
                    }
                    uri2 = (URI) cVarB.n(fVar, 1, UriSerializer.INSTANCE, uri2);
                    i12 |= 2;
                }
            }
            uri = uri2;
            i11 = i12;
        }
        cVarB.c(fVar);
        return new QesAttachmentModel(i11, uuid, uri, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, QesAttachmentModel value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        QesAttachmentModel.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
