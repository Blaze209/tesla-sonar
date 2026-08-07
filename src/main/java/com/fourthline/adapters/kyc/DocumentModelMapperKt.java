package com.fourthline.adapters.kyc;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.location.Coordinate;
import com.fourthline.scanners.config.orca.kyc.model.CoordinateModel;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toCoordinateModel", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "Lcom/fourthline/core/location/Coordinate;", "formatted", "", "Lcom/fourthline/core/DocumentFileSide;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DocumentModelMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String formatted(DocumentFileSide documentFileSide) {
        s.k(documentFileSide, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[documentFileSide.ordinal()];
        if (i11 == 1) {
            return "insideLeft";
        }
        if (i11 == 2) {
            return "insideRight";
        }
        if (i11 == 3) {
            return "back";
        }
        if (i11 == 4) {
            return "front";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CoordinateModel toCoordinateModel(Coordinate coordinate) {
        if (coordinate != null) {
            return new CoordinateModel(coordinate.getLatitude(), coordinate.getLongitude());
        }
        return null;
    }
}
