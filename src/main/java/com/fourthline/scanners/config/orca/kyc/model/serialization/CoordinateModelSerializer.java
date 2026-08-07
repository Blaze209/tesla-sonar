package com.fourthline.scanners.config.orca.kyc.model.serialization;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.scanners.config.orca.kyc.model.CoordinateModel;
import com.fourthline.scanners.config.orca.kyc.model.serialization.CoordinateModelSerializer;
import java.lang.annotation.Annotation;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.a;
import to0.f;
import to0.m;
import uo0.c;
import uo0.e;
import vo0.t;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/serialization/CoordinateModelSerializer;", "Lro0/d;", "", "<init>", "()V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoordinateModelSerializer implements d<Object> {
    public static final CoordinateModelSerializer INSTANCE = new CoordinateModelSerializer();
    private static final f descriptor = m.d("CoordinateModel", new f[0], new l() { // from class: tp.a
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return CoordinateModelSerializer.descriptor$lambda$0((to0.a) obj);
        }
    });

    private CoordinateModelSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 descriptor$lambda$0(a buildClassSerialDescriptor) {
        s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listM = v.m();
        t tVar = t.f119690a;
        buildClassSerialDescriptor.a(OrcaKeys.LATITUDE, tVar.getDescriptor(), listM, false);
        buildClassSerialDescriptor.a(OrcaKeys.LONGITUDE, tVar.getDescriptor(), v.m(), false);
        return h0.f84049a;
    }

    @Override // ro0.c
    public Object deserialize(e decoder) {
        double dS;
        double dS2;
        s.k(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (!cVarB.i()) {
            double dS3 = 0.0d;
            double dS4 = 0.0d;
            while (true) {
                CoordinateModelSerializer coordinateModelSerializer = INSTANCE;
                int iA = cVarB.A(coordinateModelSerializer.getDescriptor());
                if (iA == -1) {
                    dS = dS3;
                    dS2 = dS4;
                    break;
                }
                if (iA == 0) {
                    dS4 = cVarB.s(coordinateModelSerializer.getDescriptor(), 0);
                } else {
                    if (iA != 1) {
                        throw new IllegalStateException(("Unexpected index: " + iA).toString());
                    }
                    dS3 = cVarB.s(coordinateModelSerializer.getDescriptor(), 1);
                }
            }
        } else {
            CoordinateModelSerializer coordinateModelSerializer2 = INSTANCE;
            dS2 = cVarB.s(coordinateModelSerializer2.getDescriptor(), 0);
            dS = cVarB.s(coordinateModelSerializer2.getDescriptor(), 1);
        }
        Object coordinateModel = (dS2 == LocationProviderKt.getNotProvidedCoordinate().getLatitude() && dS == dS) ? "notProvided" : new CoordinateModel(dS2, dS);
        cVarB.c(descriptor2);
        return coordinateModel;
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, Object value) {
        CoordinateModel coordinateModel;
        s.k(encoder, "encoder");
        s.k(value, "value");
        if (value instanceof CoordinateModel) {
            coordinateModel = (CoordinateModel) value;
        } else {
            Coordinate notProvidedCoordinate = LocationProviderKt.getNotProvidedCoordinate();
            coordinateModel = new CoordinateModel(notProvidedCoordinate.getLatitude(), notProvidedCoordinate.getLongitude());
        }
        f descriptor2 = getDescriptor();
        uo0.d dVarB = encoder.b(descriptor2);
        CoordinateModelSerializer coordinateModelSerializer = INSTANCE;
        dVarB.k(coordinateModelSerializer.getDescriptor(), 0, coordinateModel.getLatitude());
        dVarB.k(coordinateModelSerializer.getDescriptor(), 1, coordinateModel.getLongitude());
        dVarB.c(descriptor2);
    }
}
